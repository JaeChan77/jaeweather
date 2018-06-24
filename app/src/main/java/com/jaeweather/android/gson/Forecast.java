package com.jaeweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 10961 on 2018/6/21.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperatrue temperatrue;
    @SerializedName("cond")
    public Now.More more;
    public class Temperatrue{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}