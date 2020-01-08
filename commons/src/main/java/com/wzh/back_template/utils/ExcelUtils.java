package com.wzh.back_template.utils;

import com.alibaba.excel.EasyExcel;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author wzh
 * @date 2020/1/6 - 10:57
 */
public class ExcelUtils {
    /**
     * 表格下载
     * @param fileName 文件名
     * @param data 数据
     */
    public static void download(String fileName, List data, HttpServletResponse response) throws IOException {
        if(data.size() == 0){
            return;
        }
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        fileName = URLEncoder.encode(fileName, "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), data.get(0).getClass()).sheet(fileName).doWrite(data);
    }

}
