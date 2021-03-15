package day20;
/*
 	5명의 친구의 이름, 전화번호, 생일, 성별을 각각 Map으로 만들어 기억하고
 		친구의 이름을 입력하면
 		친구의 정보를 출력해주는 프로그램을 작성하세요.
 */

import java.util.*;
public class Test08 {
	private ArrayList list;
	
	public Test08() {
		// 이 클래스가 객체가 될때 list부터 완성이 되어있어야 한다.
		setFriend();
		
		// 정보출력함수
		getInfo();
		
	}
	
	// list 초기화
	public void setFriend() {
		list = new ArrayList();
		
		HashMap map1 = new HashMap();
		map1.put("이름", "박용수");
		map1.put("전화번호", "010-1111-1111");
		map1.put("생일", "1991/02/04");
		map1.put("성별", "M");
		
		HashMap map2 = new HashMap();
		map2.put("이름", "최태현");
		map2.put("전화번호", "010-2222-2222");
		map2.put("생일", "1989/04/22");
		map2.put("성별", "M");
		
		HashMap map3 = new HashMap();
		map3.put("이름", "신현식");
		map3.put("전화번호", "010-3333-3333");
		map3.put("생일", "1989/08/06");
		map3.put("성별", "M");
		
		HashMap map4 = new HashMap();
		map4.put("이름", "허수경");
		map4.put("전화번호", "010-4444-4444");
		map4.put("생일", "묻지마");
		map4.put("성별", "F");
		
		HashMap map5 = new HashMap();
		map5.put("이름", "최용훈");
		map5.put("전화번호", "010-5555-5555");
		map5.put("생일", "알아맞춰보세요!");
		map5.put("성별", "M");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		
	}
	
	// 모든 친구의 이름을 출력해주는 함수
	public void printNames() {
		for(Object o : list) {
			HashMap m = (HashMap) o;
			String name = (String) m.get("이름");
			
			// 출력
			System.out.print(name + " | " );
		}
	}
	
	// 이름을 입력받아서 해당 친구의 정보를 출력해주는 함수
	public void getInfo() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			// 전체 친구 리스트 출력
			printNames();
			// 줄바꿈
			System.out.println();
			
			
			// 메세지 출력
			System.out.print("친구이름 : ");
			String name = sc.nextLine();
			
			// q가 입력되면 종료한다.
			if(name.equals("q")) {
				sc.close();
				return;
			}
			
			for(int i = 0; i < list.size(); i++) {
				Object o = list.get(i);
				HashMap m = (HashMap) o;
				String irum = (String) m.get("이름");
				if(name.equals(irum)) {
					System.out.println("\t이름 : " + m.get("이름")); 
					System.out.println("\t전화번호 : " + m.get("전화번호"));
					System.out.println("\t생일 : " + m.get("생일"));
					System.out.println("\t성별 : " + m.get("성별"));
					
				}
			}
		}
		
		
	}
	
	//Getters & Setters
	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		this.list = list;
	}

	public static void main(String[] args) {
		new Test08();
	}

}
