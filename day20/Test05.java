package day20;


/*
 	1.이름과 나이를 한쌍으로 한 데이터를 Map에 저장한 후
 	2. 저장된 데이터를 출력하고
 	3. 나이 순서대로 오름차순으로 정렬한 후
 	4. 출력하세요.
 	
 */
import java.util.*;
public class Test05 {
	private HashMap map;
	
	public Test05() {
		setData();
		// 출력용 리스트 만들고
		ArrayList list = getList();
		// 리스트 출력하고
		printList(list);
		// 오름차순 정렬
		Collections.sort(list, new MySort());
		// 리스트 출력하고
		printList(list);
		
		System.out.println();
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				int result = 0;
				
				int age1 = (int)((Map.Entry) o1).getValue();
				int age2 = (int)((Map.Entry) o2).getValue();
				
				return age2 - age1;
			}
		});
		// 리스트 출력하고
		printList(list);
	}
	
	public class MySort implements Comparator{
		@Override
		public int compare(Object o1, Object o2) {
			// 이때 o1 과 o2 는 Map.Entry 타입의 객체이다.
			// 따라서 둘을 Map.Entry로 강제 형변환하고
			Map.Entry e1 = (Map.Entry) o1;
			Map.Entry e2 = (Map.Entry) o2;
			
			// 정렬기준이 될 변수를 꺼내온다. 우리의 경우는 나이이니까 value를 꺼내온다.
			Object tmp1 = e1.getValue();
			Object tmp2 = e2.getValue();
			
			// 꺼내온 데이터를 정수로 강제 형변환 해준다.
			int age1 = (int) tmp1;
			int age2 = (int) tmp2;
			
			int result = age1- age2;
			return result;
		
		}
	}
	// map 초기화 함수
	public void setData() {
		map =  new HashMap());
		// 데이터 채우고
		map.put("홍길동", 16);
		map.put("희둥이", 3);
		map.put("고길동", 31);
		map.put("마이콜", 22);
		map.put("또치", 5);
	}
	
	// map 의 데이터를 list로 반환해주는 함수
	public ArrayList getList() {
		ArrayList list = new ArrayList(set);
		return list;
	}
	
	// map의 내용을 출력해주는 함수
	//List를 입력하면 내용을 출력해주는 함수
	public void printList(ArrayList list) {
		for(int i = 0; i < list.size(); i++ ) {
			Map.Entry ent = (Map.Entry)list.get(i);
			String name = (String) ent.getKey();
			int age = (int) ent.getValue();
			
			//출력
			System.out.println(name + " : " + age);
		}
		
	}
	
	
	public HashMap getMap() {
		return map;
	}

	public void setMap(HashMap map) {
		this.map = map;
	}


	public static void main(String[] args) {
		new Test05();
	}

}
