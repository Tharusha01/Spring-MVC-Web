package com.mkyong.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

@Controller
public class WelcomeController {

    private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping("/")
    public String index(Model model) {

        logger.debug("Welcome to mkyong.com...");
        model.addAttribute("msg", getMessage());
        model.addAttribute("today", new Date());
        model.addAttribute("tut",display());
        return "index";

    }

    @GetMapping("/add")
    public String add(Model model) {

        logger.debug("Welcome to mkyong.com...");

        model.addAttribute("tut",display());
        return "add";

    }

    @GetMapping("/delete")
    public String delete(Model model) {

        logger.debug("Welcome to mkyong.com...");

        model.addAttribute("tut",display());
        return "delete";

    }

    @RequestMapping("add.jsp")
    public ModelAndView getVendorTests(@RequestParam int vendorId, Map<String, Object> map){
        try {
            //map.put("vendor", vendorService.getVendor(vendorId));
            return new ModelAndView("vendor_tests","message",map);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            logger.error("In vendor tests for vendor Id:"+vendorId+"",e);
            return new ModelAndView("error","message", e);
        }

    }

    private String getMessage() {
        return "Hello ";
    }
    private String display(){
        return "Tutorials";
    }

}
