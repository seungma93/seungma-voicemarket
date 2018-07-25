package com.seungma.springvoicemarket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@EnableAutoConfiguration
public class MarketRestController {

    @Autowired
    private TestRepository repository;

    @GetMapping("/seungmin")
    public String hello() {
        return "hi seungmin";
    }

    @RequestMapping(value = "/joe", method = RequestMethod.GET)
    public String test() {
        return "joe";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getTestDatas(Model model) {
        model.addAttribute("result", repository.getDatas());
        //ArrayList<TestDTO> items = new ArrayList<>(repository.getDatas());
        return "test";
    }
}