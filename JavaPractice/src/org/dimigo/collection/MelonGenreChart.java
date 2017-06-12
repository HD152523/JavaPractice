package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {
	
	public static void main(String args[]){
		List<Music> list1 = new ArrayList<Music>();
		List<Music> list2 = new ArrayList<Music>();
		Map<String, List<Music>> map = 	new HashMap<>();
		
		list1.add(new Music("팔레트", "아이유"));
		list2.add(new Music("I LUV IT", "PSY"));
		list2.add(new Music("맞지?", "언니쓰"));
		
		map.put("발라드", list1);
		map.put("댄스", list2);
		
		System.out.println("--<< 멜론 장르별 챠트 >>--");
		printMap(map);
		
		System.out.println("\n--<< 댄스 2위 곡 변경 >>--");
		list2.set(1, new Music("SIGNAL", "트와이스"));
		printMap(map);
		
		System.out.println("\n--<< 댄스 1위 곡 삭제 >>--");
		list2.remove(0);
		printMap(map);
		
		System.out.println("\n--<< 전체 리스트 삭제 >>--");
		
		list2.clear();
		list1.clear();
		
		map.clear();
		printMap(map);
		
	}
	
	private static void printMap(Map<String, List<Music>> map) {
		for(String key : map.keySet()){	
			System.out.println("[" + key + "]");
			int i = 1;
			for(Music key2 : map.get(key)){
				System.out.println(i++ + "." + key2);
			}
		}
	}
}
