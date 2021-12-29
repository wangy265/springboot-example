package leetcode.base;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoveDuplicates {
	
	private int removeDuplicatesSolution(int[] data ) {
		int[] copyData =  Arrays.copyOf(data,data.length);
		log.info("copyData = {}",copyData);
		if(data.length>0) {
			int tail = 1;
			for (int i = 1; i < data.length; i++) {
				if(data[i]!=data[i-1]) {
					data[tail++] = data[i];
				}
			}
			return tail;
		}
		return 0;
	}
	
	private int removeDuplicatesSolution2(int[] data) {
		Set<Integer> resultIntegers = new HashSet<>();
		for (int i = 0; i < data.length; i++) {
			resultIntegers.add(Integer.valueOf(data[i]));
		}
		return resultIntegers.size();
	}
	
	
	public static void main(String[] args) {
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		int[] data = {1,1,1,3,4,5}; 
		int[] data2 = {1,1,1,3,4,5}; 
		int len = removeDuplicates.removeDuplicatesSolution(data);
		log.info("data = {} remove duplicates after len = {}",data,len);
		int len2 = removeDuplicates.removeDuplicatesSolution2(data2);
		log.info("data2 = {} remove duplicates after len = {}",data2,len2);
	}

}
