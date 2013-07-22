package com.kodcu;

import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * User: usta
 * Date: 18.07.2013
 * Time: 11:49
 * To change this template use File | Settings | File Templates.
 */
@Qualifier
@Target(value = {ElementType.FIELD,ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Hiz {
}
