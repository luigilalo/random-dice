package org.learning.randomdice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("dice")
    public String randomDice(@RequestParam Model model) {
        // calcolo un numero random tra 1 a 6
        Random randomGen = new Random();
        int randomNumber = randomGen.nextInt(1, 7);
        model.addAttribute("diceValue", randomNumber);
        return "dice";
    }

}
