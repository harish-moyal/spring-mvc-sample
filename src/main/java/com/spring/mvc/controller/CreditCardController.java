package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by harishmoyal on 20/05/16.
 */
@Controller
@RequestMapping(path = "credit-card")
public class CreditCardController {

    @RequestMapping("/validate")
    public ModelAndView helloWorld(@RequestParam("ccNumber") String creditCardNumber ) {

        return new ModelAndView("credit-card", "message", creditCardNumber);
    }

    @RequestMapping("/welcome")
    public ModelAndView welcome() {

        String message = "<br><div style='text-align:center;'>"
                + "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CreditCardController.java **********</div><br><br>";
        return new ModelAndView("credit-card", "message", message);
    }
}
