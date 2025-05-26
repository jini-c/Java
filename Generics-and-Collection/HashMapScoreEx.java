package ch7;

import java.util.*;

public class HashMapScoreEx {

	public static void main(String[] args) {
		// 사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성
		HashMap<String, Integer> scoreMap =
				new HashMap <String, Integer>();
		
		// 5개의 점수 저장
		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("김남윤", 98);
		scoreMap.put("이재문", 70);
		scoreMap.put("한원선", 99);
		
		System.out.println("HashMap의 요수 개수 :"+scoreMap.size());
		
		// 모든 사람의 점수출력.
		// javaScore에 들어 있는 모든(key,value) 쌍 출력
		// key 문자열을 가진 집합 Set 컬렉션 리턴
		Set<String> keys = scoreMap.keySet();
		
		// key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
		Iterator <String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = scoreMap.get(name);
			System.out.println(name + ":" + score);
		}
	}
}
