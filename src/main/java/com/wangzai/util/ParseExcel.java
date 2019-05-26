package com.wangzai.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.wangzai.pojo.RequestInfo;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ParseExcel {


    private static Logger log = Logger.getLogger(ParseExcel.class);

    public static List<RequestInfo> parseExcelToRequestInfo(String filePath) {
        List<RequestInfo> resultList = new ArrayList<>();
        Workbook wb = null;
        Sheet sheet = null;
        Row row;
        wb = readExcel(filePath);
        if (wb != null) {
            //获取第一个sheet
            sheet = wb.getSheetAt(0);
            //获取最大行数
            int rownum = sheet.getPhysicalNumberOfRows();
            //获取最大列数
            for (int i = 1; i < rownum; i++) {
                row = sheet.getRow(i);
                RequestInfo tmp = new RequestInfo();
                if (row != null) {
                    String id = String.valueOf(getCellFormatValue(row.getCell(0)));
                    if (id.contains(".")) id = id.substring(0, id.indexOf("."));
                    tmp.setId(Long.parseLong(id));
                    tmp.setName((String) getCellFormatValue(row.getCell(1)));
                    tmp.setUrl((String) getCellFormatValue(row.getCell(2)));
                    tmp.setParam((String) getCellFormatValue(row.getCell(3)));
                    tmp.setResponse((String) getCellFormatValue(row.getCell(4)));
                    resultList.add(tmp);
                } else {
                    log.error("row (" + i + ") is null");
                }
            }
        }
        return resultList;
    }

    //读取excel
    private static Workbook readExcel(String filePath) {
        if (filePath == null) {
            return null;
        }
        String extString = filePath.substring(filePath.lastIndexOf("."));
        InputStream is;
        try {
            is = new FileInputStream(filePath);
            if (".xls".equals(extString)) {
                return new HSSFWorkbook(is);
            } else if (".xlsx".equals(extString)) {
                return new XSSFWorkbook(is);
            } else {
                log.error("file is not xls or xlsx");
                return null;
            }
        } catch (IOException e) {
            log.error("readExcel error ", e);
        }
        return null;
    }

    public static Object getCellFormatValue(Cell cell) {
        Object cellValue = null;
        //判断cell类型
        if (CellType.NUMERIC.equals(cell.getCellType())) {
            cellValue = cell.getNumericCellValue();
        } else if (CellType.FORMULA.equals(cell.getCellType())) {
            //判断cell是否为日期格式
            if (DateUtil.isCellDateFormatted(cell)) {
                //转换为日期格式YYYY-mm-dd
                cellValue = cell.getDateCellValue();
            } else {
                //数字
                cellValue = String.valueOf(cell.getNumericCellValue());
            }
        } else if (CellType.STRING.equals(cell.getCellType())) {
            cellValue = cell.getRichStringCellValue().getString();
        } else {
            cellValue = "";
        }
        return cellValue;
    }


}
