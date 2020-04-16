package com.wenren.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-04-15-15:16
 */
public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now();//默认时区
        System.out.println(zbj);
//        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York"));//用指定时区获取当前时间
//        System.out.println(zny);
    }
}
