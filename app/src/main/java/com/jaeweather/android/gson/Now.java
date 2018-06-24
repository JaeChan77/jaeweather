package com.jaeweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 10961 on 2018/6/21.
 */

public class Now {
    @SerializedName("tmp")
    public String temperatrue;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
