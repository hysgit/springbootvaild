package com.woslx.springbootvaild;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author hy
 * @create 2019-08-02 09:40
 **/

public class CheckAgeImpl implements ConstraintValidator<CheckAge, User> {
    @Override
    public void initialize(CheckAge constraintAnnotation) {

    }

    @Override
    public boolean isValid(User value, ConstraintValidatorContext context) {
        if(!StringUtils.isEmpty(value.getPhone())){
            if(value.getAge() == null){
                return false;
            }
            if(value.getAge() <= 18){
                return false;
            }
        }
        return true;
    }
}
