package com.assignment.problem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.assignment.problem.vo.Response;

@Service
public class MaxSum {

	public Response getMaxSum(List<Integer> input) {
		if (input.size() < 1) {
			Response response = new Response();
			response.setStartIndex(-1);
			response.setLastIndex(-1);
			response.setSum(-9999);
			response.setSubarray(new ArrayList<>());
			return response;
		} else {
			Integer maxSum = input.get(0);
			Integer sum = input.get(0);
			Integer startIndex = 0, endIndex = null;
			for (Integer i = 1; i < input.size(); ++i) {
				if (sum < 0) {
					sum = 0;
					startIndex = i;
				}
				sum += input.get(i);
				if (sum > maxSum) {
					endIndex = i;
					maxSum = sum;
				}
			}
			Response response = new Response();
			if(startIndex<=endIndex) {
				response.setStartIndex(startIndex);
				response.setLastIndex(endIndex);
				response.setSum(maxSum);
				response.setSubarray(input.subList(startIndex, endIndex+1));
			}
			else {
				response.setStartIndex(-1);
				response.setLastIndex(-1);
				response.setSum(-9999);
				response.setSubarray(new ArrayList<>());
			}
			return response;
		}
	}
}
