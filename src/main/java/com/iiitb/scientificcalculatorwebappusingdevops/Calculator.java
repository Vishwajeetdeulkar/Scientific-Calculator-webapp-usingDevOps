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
        logger.info("SQUARE_ROOT - Input:" + input1);

        res = Math.sqrt(input1);
        logger.info(" - Output:" + res);
        return res  ;
    }
    @RequestMapping(value = "/log",method = RequestMethod.POST)
    public double log(@RequestBody Map<String,Object> payload){
        double res;
        double input1 = Double.parseDouble((String) payload.get("input1"));
        res = Math.log(input1);
        res = (double) (Math.round(res*1000.0)/1000.0);
        return res  ;
    }

    @RequestMapping(value = "/fact",method = RequestMethod.POST)
    public double fact(@RequestBody Map<String,Object> payload){
        double res= 1;
        double input1 = Double.parseDouble((String) payload.get("input1"));
        for(double i=1;i<=input1;i++)
            res = res*i;
        return res;
    }
    @RequestMapping(value = "/power",method = RequestMethod.POST)
    public double power(@RequestBody Map<String,Object> payload){
        double res;
        double input1 = Double.parseDouble((String) payload.get("input1"));
        double input2 = Double.parseDouble((String) payload.get("input2"));
        res = Math.pow(input1,input2);
        return res  ;
    }
}