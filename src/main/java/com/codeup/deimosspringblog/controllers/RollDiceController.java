package com.codeup.deimosspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Random;

@Controller
public class RollDiceController {
    @GetMapping("/roll-dice")
    public String rollDice() {
        return "roll-dice";
    }
    @PostMapping("/roll-dice")
    public String name(@RequestParam int number, Model model) {

        int random = (int) (Math.random() * 6) + 1;

        model.addAttribute("number", "You guessed " + number + "!");
        model.addAttribute("random", "The computer rolled a " + random + "!");
        if (number == random){
            model.addAttribute("win", "You win! Play again!");
        } else{
            model.addAttribute("lose", "You lose! Play again!");
        }
        return "roll-dice";
    }
}
