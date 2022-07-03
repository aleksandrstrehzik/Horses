package com.controller;

import com.repository.entity.Horse;
import com.service.HorseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HorseController {

    private final HorseService horseService;

    @Autowired
    public HorseController(HorseService horseService) {
        this.horseService = horseService;
    }

    @GetMapping("/")
    public String homePage(Model model) {
        return "home";
    }

    @GetMapping("/all-horses")
    public String allHorses(Model model) {
        List<Horse> all = horseService.findAll();
        model.addAttribute("horses", all);
        return "all-horses";
    }

    @GetMapping("/create-horse")
    public String createHorse(@ModelAttribute("horse") Horse horse) {
        return "create-horse";
    }

    @PostMapping("/create-horse")
    public String create(@ModelAttribute("horse") Horse horse) {
        horseService.createHorse(horse);
        return "redirect:/all-horses";
    }

    @GetMapping("/all-horses/{id}")
    public String delete(@PathVariable("id") Integer id) {
        horseService.deleteById(id);
        return "redirect:/all-horses";
    }

    @GetMapping("/update-horse/{id}")
    public String updateHorse(@PathVariable("id") Integer id, Model model) {
        Horse byId = horseService.findById(id);
        model.addAttribute("horse", byId);
        return "update-horse";
    }

    @PostMapping("/update-horse")
    public String update(@ModelAttribute("horse") Horse horse) {
        horseService.createHorse(horse);
        return "redirect:/all-horses";
    }
}
