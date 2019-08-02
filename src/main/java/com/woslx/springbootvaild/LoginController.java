package com.woslx.springbootvaild;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author hy
 * @create 2019-08-02 09:30
 **/
@RestController
public class LoginController {

    @RequestMapping(value = "/login", consumes = "application/json")
    public String login(@Valid @RequestBody User user, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            StringBuilder sb = new StringBuilder();
            sb.append("error:");
            for(ObjectError error: allErrors){
                sb.append("\n").append(error.getDefaultMessage());
            }
            return sb.toString();
        }

        return "success";
    }
}
