package work0606;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
		//Map: key,value형식으로 저장
		//key-> 저자한 데이터를 식별하기 위한 값, 중복 허용X
		//value -> 저장하고자 하는 데이터
		
		HashMap<Integer,String> map = new HashMap<>();
		
		//데이터 저장: put(e)
		
		map.put(new Integer(1), "일번");
		map.put(5, "오번");
		map.put(8, "팔번");
		
		//데이터 탐색
		
		System.out.println(map.get(new Integer(5)));
		System.out.println(map.get(1));
		System.out.println(map.get(8));
		System.out.println(map.get(10)); //null
		
	}
}
