package me.nayeonkyoung.exampleproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("")
    public String main() {
        return "야옹";
    }

}