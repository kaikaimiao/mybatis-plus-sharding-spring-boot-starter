package com.kaikai.starter.annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * M1Dao
 *
 * @author pu
 * @date 2021/1/11
 * time 12:19
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component
@Lazy
public @interface NoShardingMapper {

    String value() default "";
}
