package com.ltp.globalsuperstore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GlobalSuperstoreController {
    @GetMapping("/")
    public String getForm(Model model) {
        return "form";
    }
}
