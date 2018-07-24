package com.seungma.springvoicemarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketRestController {

    @GetMapping("/seungmin")
    public String hello() {
        return "hi seungmin";
    }
}