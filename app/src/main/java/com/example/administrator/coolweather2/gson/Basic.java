package com.example.administrator.coolweather2.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by CHW on 2018/6/13.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
