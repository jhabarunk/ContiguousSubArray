package com.assignment.problem.service;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.assignment.problem.vo.Response;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MaxSumTest {

	@InjectMocks
	MaxSum maxSum;
	
	@Test
	public void getMaxSumTestOne() {
		Integer[] inp={-2,1,-3,4,-1,2,1,-5,4};
		List<Integer> input=Arrays.stream(inp).collect(Collectors.toList());
		Integer[] output = {4,-1,2,1};
		Response response=new Response();
		response.setStartIndex(3);
		response.setLastIndex(6);
		response.setSum(6);
		response.setSubarray(Arrays.stream(output).collect(Collectors.toList()));
		assertEquals(response,maxSum.getMaxSum(input));
	}
	
	@Test
	public void getMaxSumTestTwo() {
		Integer[] inp={-2,-1,-3,-4,-1,-2,-1,-5,-4};
		List<Integer> input=Arrays.stream(inp).collect(Collectors.toList());
		Integer[] output = {};
		Response response=new Response();
		response.setStartIndex(-1);
		response.setLastIndex(-1);
		response.setSum(-9999);
		response.setSubarray(Arrays.stream(output).collect(Collectors.toList()));
		assertEquals(response,maxSum.getMaxSum(input));
	}
	
	@Test
	public void getMaxSumTestThree() {
		Integer[] inp={};
		List<Integer> input=Arrays.stream(inp).collect(Collectors.toList());
		Integer[] output = {};
		Response response=new Response();
		response.setStartIndex(-1);
		response.setLastIndex(-1);
		response.setSum(-9999);
		response.setSubarray(Arrays.stream(output).collect(Collectors.toList()));
		assertEquals(response,maxSum.getMaxSum(input));
	}
}
