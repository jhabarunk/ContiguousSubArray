package com.assignment.problem.vo;

import java.util.ArrayList;
import java.util.List;

public class Response {

	private Integer startIndex;
	private Integer lastIndex;
	private Integer sum;
	private List<Integer> subarray=new ArrayList<>();
	public Integer getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}
	public Integer getLastIndex() {
		return lastIndex;
	}
	public void setLastIndex(Integer lastIndex) {
		this.lastIndex = lastIndex;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	public List<Integer> getSubarray() {
		return subarray;
	}
	public void setSubarray(List<Integer> subarray) {
		this.subarray = subarray;
	}
	@Override
	public String toString() {
		return "Response [startIndex=" + startIndex + ", lastIndex=" + lastIndex + ", sum=" + sum + ", subarray="
				+ subarray + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lastIndex == null) ? 0 : lastIndex.hashCode());
		result = prime * result + ((startIndex == null) ? 0 : startIndex.hashCode());
		result = prime * result + ((subarray == null) ? 0 : subarray.hashCode());
		result = prime * result + ((sum == null) ? 0 : sum.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Response other = (Response) obj;
		if (lastIndex == null) {
			if (other.lastIndex != null)
				return false;
		} else if (!lastIndex.equals(other.lastIndex))
			return false;
		if (startIndex == null) {
			if (other.startIndex != null)
				return false;
		} else if (!startIndex.equals(other.startIndex))
			return false;
		if (subarray == null) {
			if (other.subarray != null)
				return false;
		} else if (!subarray.equals(other.subarray))
			return false;
		if (sum == null) {
			if (other.sum != null)
				return false;
		} else if (!sum.equals(other.sum))
			return false;
		return true;
	}
	
	
}
