package com.pinnacle.ipl.performance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PerformanceController {
	
	@Autowired
	private PerformanceService performanceService;
	
	@RequestMapping(value = "/performances")
	public List<Performance> getAllPerformances(){
		return performanceService.getAllPerformances();
	}
	
	@RequestMapping(value = "/performances/{id}")
	public Performance getPerformance(@PathVariable String id) {
		return performanceService.getPerformance(id);
	}
	
	@RequestMapping(value = "/performances", method = RequestMethod.POST) 
	public void addPerformance(@RequestBody Performance performance) {
		performanceService.addPerformance(performance);
	}
	
	@RequestMapping(value = "/performances/{id}", method = RequestMethod.DELETE) 
	public void deletePerformance(@PathVariable String id) {
		performanceService.deletePerformance(id);
	}
	
	@RequestMapping(value = "/performances/{id}", method = RequestMethod.PUT) 
	public void updatePerformance(@PathVariable String id, @RequestBody Performance performance) {
		performanceService.updatePerformance(id, performance);
	}
}
