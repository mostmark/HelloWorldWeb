/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.helloworldweb;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author martin
 */
public class TimeAndDateUtil {

    private SimpleDateFormat formatter = null;
    private static TimeAndDateUtil instance = null;

    public TimeAndDateUtil() {
        System.out.println("Constructor...");
        formatter = new SimpleDateFormat("HH:mm:ss");
    }
    
    public static TimeAndDateUtil getInstance(){
        if(instance == null){
            instance = new TimeAndDateUtil();
        }
        return instance;
    }
    
    public String getTime(){
        return formatter.format(new Date());
    }
    
}
