package com.ShaunHaldane.HomeRehaApp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ShaunHaldane.HomeRehaApp.model.WalkingAppResult;
import com.ShaunHaldane.HomeRehaApp.model.WalkingAppResultDTO;
import com.ShaunHaldane.HomeRehaApp.repository.WalkingAppResultRepository;

@Service
public class WalkingAppResultServiceImpl implements WalkingAppResultService {
	
	@Autowired
	WalkingAppResultRepository walkingAppResultRepository;

	@Override
	public List<WalkingAppResult> getAll() {
		return walkingAppResultRepository.findAll();
	}

	@Override
	public WalkingAppResult getById(int id) {
		return walkingAppResultRepository.getById(id);
	}

	@Override
	public void saveOrUpdate(WalkingAppResult walkingAppResult) {
		walkingAppResultRepository.save(walkingAppResult);
		
	}

	@Override
	public void delete(int id) {
		walkingAppResultRepository.deleteById(id);
		
	}

	@Override
	public List<WalkingAppResultDTO> getAllDTO() {
		List<WalkingAppResult> walkingAppResults = getAll();
		List<WalkingAppResultDTO> walkingAppResultsDTO = walkingAppResults.stream()
				.map(r -> new WalkingAppResultDTO(r.getId(), r.getSuccessRate(), r.getSessionTime(), r.getSessionDate()))
				.collect(Collectors.toList());
		return walkingAppResultsDTO;
	}

}
