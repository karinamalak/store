package org.store.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.store.demo.dto.ProductDto;
import org.store.demo.service.ProductService;

import javax.validation.Valid;

@Controller
public class HelloController {


    @RequestMapping(value="/", method = RequestMethod.GET) //oblsuguje tylko GET
    public String showHelloPage( ModelMap model){
        return "hello";
    }


}
