package day20;

import java.util.*;
public class Test14 {

	public Test14() {
		HashSet<String> set = new HashSet<String>();
		set.add("쵸파");
		set.add("루피");
		set.add("나미");
		set.add("우솝");
		set.add("로빈");
		set.add("보아헹콕");
		set.add("조로");
		
		// ArrayList로 변환해서 데이터를 꺼내보자.
		ArrayList<String> list = new ArrayList<String>(set);
		String name1 = list.get(0);// 제너릭스는 전파가 안되기때문에 다시 제너릭스 선언을 해줘야 한다.
		System.out.println(name1);
		
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			
		}
	}

	public static void main(String[] args) {
		new Test14();

	}

}
