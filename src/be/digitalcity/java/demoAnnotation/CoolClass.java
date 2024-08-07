package be.digitalcity.java.demoAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//TYpe means at the declaration of every type, Class, Enums, Records
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)

public @interface CoolClass {
    public String value() default "toto";
}
