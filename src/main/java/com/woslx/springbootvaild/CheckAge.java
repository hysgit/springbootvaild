package com.woslx.springbootvaild;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.*;

/**
 * @author hy
 * @create 2019-08-02 09:39
 **/
@Target({ ElementType.TYPE})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = CheckAgeImpl.class)
public @interface CheckAge {
    String message() default "当phone不为空的时候，age字段必须大于18";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
