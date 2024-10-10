package com.bptn.course._18_collections._03_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveMultipleKeysExample {

	public static void main(String[] args) {
		
		
		Map<Integer, String> map = new HashMap<>();

		map.put(5, "John"); // Key = 5, value = "John
		map.put(6, "Jane");
		map.put(7, "Mike");
		map.put(8, "Lily");
		map.put(9, "Pete");
		map.put(1, "Carlos");
		map.put(2, "Hrithik");
		
		// List of keys to remove
		
		List<Integer> keysToRemove = Arrays.asList(6,8,1);
		
		// Remove all the specified keys from the map in one go
		
//		for (Integer key: keysToRemove) {
//			map.remove(key);
//		}
		
		map.keySet().removeAll(keysToRemove);
		
		System.out.println(map);

		

	}

}
