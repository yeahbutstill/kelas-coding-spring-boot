package com.yeahbutstill.spring.aop.springaop.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// waktu trek hanya pada methods
@Target(ElementType.METHOD)
// tersedia pada saat dijalankan bahkan ketika program sedang dijalankan
@Retention(RetentionPolicy.RUNTIME)
public @interface TrackTime {

}
