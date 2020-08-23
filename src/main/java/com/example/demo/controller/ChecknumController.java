package com.example.demo.controller;

import com.example.demo.service.NumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ChecknumController {

    private final NumberService numberService;

    @GetMapping("/number-to-words")
    public String numberToWords(@RequestParam Integer n) {
        return numberService.numberToWords(n);
    }

}
