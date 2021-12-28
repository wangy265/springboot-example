package leetcode.base;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RomanToInteger {

	public int romanToIntegerSolution(String data) {
		Map<Character, Integer> map = initDataMappingMap();
		int len = data.length();
		int sum = map.get(data.charAt(len - 1));
	    for (int i = len - 2; i >= 0; --i) {
            if (map.get(data.charAt(i)) < map.get(data.charAt(i + 1))) {
                sum -= map.get(data.charAt(i));
            } else {
                sum += map.get(data.charAt(i));
            }
        }
	    log.info("{} roman to interger {}", data, sum);
        return sum;
	}

	private Map<Character, Integer> initDataMappingMap() {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		return map;
	}
	
	public static void main(String[] args) {
		RomanToInteger romanToInteger = new RomanToInteger();
		romanToInteger.romanToIntegerSolution("IV");
	}

}
