package com.yyc.client.utils;


import cn.hutool.setting.dialect.Props;

public class PropsUtil {

    static Props other = new Props("other.properties");

    public static String getProperty(String key){
        return other.getStr(key);
    }

}
