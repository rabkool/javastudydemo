package com.rabkool.javastudydemo.server;

import com.rabkool.javastudydemo.bean.Data;
import com.rabkool.javastudydemo.bean.Result;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author RabKool
 */
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class DataService {
    /**
     * 导入
     *
     * @param data 参数封装
     * @return data
     */
    public Data dataImport(Data data) {
        return data;
    }

    /**
     * 导出
     *
     * @param data 参数封装
     * @return result
     */
    public Result dataOutPut(Data data) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {

        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
}
