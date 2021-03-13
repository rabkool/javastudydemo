package com.rabkool.javastudydemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author RabKool
 */
@Controller
public class TestHtmlController {

    @GetMapping("/index")
    public String index() {
        return "index.html";
    }
}
