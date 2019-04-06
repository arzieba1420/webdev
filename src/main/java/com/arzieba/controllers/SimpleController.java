package com.arzieba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class SimpleController {

    public String basic(Model model){


        return "basicTemplate";
    }

}
