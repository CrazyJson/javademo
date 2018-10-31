package com.example.demo.annotation;

import java.lang.annotation.*;

@Target(value = {ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ConfigAttribute {
    String key();

    String name();
}
