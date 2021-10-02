package com.coding_dojo.fruity_loops.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coding_dojo.fruity_loops.models.ItemModel;

//... imports (Use shift+ctrl+O or shift+cmd+O to import as you code)
@Controller
public class ItemController {
 
 @RequestMapping("/")
 public String index(Model model) {
     
     ArrayList<ItemModel> fruits = new ArrayList<ItemModel>();
     fruits.add(new ItemModel("Kiwi", 1.5));
     fruits.add(new ItemModel("Mango", 2.0));
     fruits.add(new ItemModel("Goji Berries", 4.0));
     fruits.add(new ItemModel("Guava", .75));
     model.addAttribute("fruitsFromMyController", fruits);
     
     return "index.jsp";
 }
}

