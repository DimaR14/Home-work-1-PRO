package Task2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(value = RetentionPolicy.RUNTIME)
public @interface SaveTo {
    String path() default "D:\\java\\Home work 1 PRO\\task1.txt" ;
}
