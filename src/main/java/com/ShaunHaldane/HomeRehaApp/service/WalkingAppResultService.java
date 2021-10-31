package com.ShaunHaldane.HomeRehaApp.service;

import java.util.List;

import com.ShaunHaldane.HomeRehaApp.model.WalkingAppResult;
import com.ShaunHaldane.HomeRehaApp.model.WalkingAppResultDTO;

public interface WalkingAppResultService {
	
	public List<WalkingAppResult> getAll();
	
	public WalkingAppResult getById(int id);
	
	public void saveOrUpdate(WalkingAppResult walkingAppResult);
	
	public void delete(int id);
	
	public List<WalkingAppResultDTO> getAllDTO();
	
}
