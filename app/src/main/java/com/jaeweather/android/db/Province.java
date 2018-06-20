package com.jaeweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 10961 on 2018/6/20.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int prinvinceCode;

    public int getId() {
        return id;
    }

    public int getPrinvinceCode() {
        return prinvinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setPrinvinceCode(int prinvinceCode) {
        this.prinvinceCode = prinvinceCode;
    }
}
