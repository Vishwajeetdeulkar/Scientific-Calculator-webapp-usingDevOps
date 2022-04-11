package com.iiitb.scientificcalculatorwebappusingdevops;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    @RequestMapping(value = "/sqrt",method = RequestMethod.POST)
    public double sqrt(@RequestBody Map<String,Object> payload){
        double res;
        double input1 = Double.parseDouble((String) payload.get("input1"));
        logger.info("[SQUAREROOT] - " + input1);

        res = Math.sqrt(input1);
        logger.info("[RESULT - SQUAREROOT] - " + res);
        return res  ;
    }

}