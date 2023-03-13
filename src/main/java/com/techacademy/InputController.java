package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    @GetMapping("/input")
    public String getInput() {
        return "input";

    }

    @PostMapping("/input")
    public String input(@RequestParam("previous") String previous, Model madel) {
        madel.addAttribute("previous", previous);
        return "input";
    }

}
