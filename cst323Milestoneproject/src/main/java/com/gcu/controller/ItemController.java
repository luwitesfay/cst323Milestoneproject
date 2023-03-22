package com.gcu.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gcu.service.ItemService;
import com.gcu.bussiness.ItemTable;

@Controller
public class ItemController {

	@Autowired
	private ItemService service;
	
	@GetMapping("/")
	public String HomePage() {
		return "home";
	}
	
	@GetMapping("/additem")
	public String showRegistrationForm() {
		
		return "additem";
	}

	
	@GetMapping("/iteamlist")
	public ModelAndView getAllItems() {
		
		List<ItemTable>list=service.getAllItems();
		ModelAndView m=new ModelAndView();
			m.setViewName("itemstable");
			m.addObject("item",list);
		return m;
	}
	
	@PostMapping("/save")
	public String addItem(@ModelAttribute ItemTable t) {
		service.save(t);
		return "redirect:/iteamlist";
	}
	
	@RequestMapping("/updateitem/{id}")
	public String updateItem(@PathVariable("id") int id, Model model)
	{
		
		ItemTable updateItem = service.getItemById(id);
		model.addAttribute("updateItem", updateItem);
		return "updateItem";
		
	}
	@RequestMapping("/deleteitem/{id}")
	public String deleteItem(@PathVariable("id") int id)
	{
		service.deleteItem(id);
		return "redirect:/iteamlist";
	}
	

}
