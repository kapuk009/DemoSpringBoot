package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.CosmeticBean;

@RestController
public class CosmeticController {
	
	List<CosmeticBean> cosmetics = new ArrayList<>(Arrays.asList(
        new CosmeticBean("LIP001", "XOXO Lipstick", 1),
        new CosmeticBean("BRO001", "NYX Brush On Palette", 1)
	));
	
	@RequestMapping("/cosmetics")
	public List<CosmeticBean> getAllCosmetics() {
		System.out.println("##### KULNAJA");
	    return cosmetics;
	}

}
