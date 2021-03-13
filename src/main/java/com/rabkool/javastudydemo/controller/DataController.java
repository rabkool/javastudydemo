package com.rabkool.javastudydemo.controller;

import com.rabkool.javastudydemo.bean.Data;
import com.rabkool.javastudydemo.bean.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rabkool.javastudydemo.server.DataService;

/**
 * @author RabKool
 */
@RestController
public class DataController {
    @Autowired
    private DataService dataService;

    /**
     * 导入
     *
     * @param data 参数封装
     * @return Result
     */
    @PostMapping(value = "/dataImport")
    public Data dataImport(Data data) {
        return dataService.dataImport(data);
    }

    /**
     * 导出
     *
     * @param data 参数封装
     * @return Result
     */
    @PostMapping(value = "/dataOutPut")
    public Result dataOutPut(Data data) {
        return dataService.dataOutPut(data);
    }
}

