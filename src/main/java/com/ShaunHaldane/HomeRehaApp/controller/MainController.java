package com.ShaunHaldane.HomeRehaApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ShaunHaldane.HomeRehaApp.model.WalkingAppResult;
import com.ShaunHaldane.HomeRehaApp.model.WalkingAppResultDTO;
import com.ShaunHaldane.HomeRehaApp.service.WalkingAppResultService;

@Controller
public class MainController {
	
	@Autowired
	WalkingAppResultService walkingAppResultService;
	
	@GetMapping("/")
	public String getHomePage() {
		return "index";
	}
	
	@GetMapping("/playWalkingApp")
	public String playWalkingApp(Model model) {
		WalkingAppResult walkingAppResult = new WalkingAppResult();
		model.addAttribute("walkingAppResult", walkingAppResult);
		return "walking-app-game-screen";
	}
	
	@GetMapping("/theWalkingAppResults")
	public String showWalkingAppResults(Model model) {
		List<WalkingAppResultDTO> walkingAppResultsDTO = walkingAppResultService.getAllDTO();
		model.addAttribute("walkingAppResultsDTO", walkingAppResultsDTO);
		return "walking-app-results-screen";
	}
	
	@PostMapping("/processWalkingAppResult")
	public String processWalkingAppResult(@ModelAttribute WalkingAppResult walkingAppResult, Model model) {
		walkingAppResultService.saveOrUpdate(walkingAppResult);
		model.getAttribute("walkingAppResult");
		List<WalkingAppResultDTO> walkingAppResultsDTO = walkingAppResultService.getAllDTO();
		model.addAttribute("walkingAppResultsDTO", walkingAppResultsDTO);
		return "walking-app-session-results-screen";
	}

}
