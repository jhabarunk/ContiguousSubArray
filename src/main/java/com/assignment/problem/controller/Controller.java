package com.assignment.problem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.problem.service.MaxSum;
import com.assignment.problem.vo.Response;

@RestController
public class Controller {

	@Autowired
	private MaxSum maxSum;
	
	@PostMapping("/maxSum")
	public Response gteMaxSum(@RequestBody String arg) {
		List<Integer> input=new ArrayList<>();
		for(String s:arg.split(" ")) {
			input.add(Integer.valueOf(s));
		}
		return maxSum.getMaxSum(input);
	}
}
