package com.mu.util;

public class StringUtil {
    public static boolean isEntpy(String str){
        if(str == null || "".equals(str.trim())){
            return true;
        }
        return false;
    }
}
