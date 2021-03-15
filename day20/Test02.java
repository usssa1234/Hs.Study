package day20;

/*
 	친구 이름을 키값으로하 고 그 치눅의 전화번호를 관리하는 Map을 만들어서
 	데이터를 꺼내서 출력해보자.
 */
import java.util.*;
public class Test02 {
	private Hashtable tab;
	public Hashtable getTab() {
		return tab;
	}
	public void setTab(Hashtable tab) {
		this.tab = tab;
	}
	
	public void setTab() { //Overloading
		tab = new Hashtable();
		tab.put("홍길동", "010-1111-1111");
		tab.put("제니", "010-2222-2222");
		tab.put("윤아", "010-3333-3333");
		tab.put("로제", "010-4444-4444");
		tab.put("지수", "010-5555-5555");
		tab.put("지리사", "010-6666-6666");
	}
	
	public void toPrint() {
		// Map 계열은 key 값이 있어야 데이터를 꺼내 올수 있으므로 
		// key 값들만 모두 꺼내오자.
		Set set = tab.keySet();
		// Iterator 로 변환..
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			// 키값 하나 꺼내오고
			String key = (String) itor.next();
			// tab에서 키값에 해당하는 데이터를 꺼내오고
			String val = (String) tab.get(key);
			//출력하고
			System.out.println(key + " | " + val);
			
			
		}
		
	}
	//keys() 함수 이용해서 출력해주는 함수
	public void toPrint(Hashtable t) {
		// 키값들을 추출하고
		Enumeration en = t.keys();
		// 하나씩 꺼내서 출려한다.
		while(en.hasMoreElements()) {
			// 키 꺼내고
			String key = (String) en.nextElement();
			// value 꺼내고
			String val =(String) t.get(key);
			// 출력하고
			System.out.println(key + " | " + val);
		}
		
	}
	
	public Test02() {
		setTab(); // tab 초기화
		// 데이터 출력
		toPrint();
		
		System.out.println();
		// key()함수로 처리후 출력
		toPrint(tab);
	}
	public static void main(String[] args) {
		new Test02();
	}

}
