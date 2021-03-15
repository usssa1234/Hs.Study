package day20;

/*
 	Student 클래스의 객체를 키값으로 하고 변수중 avg 값을 밸류로 하는 TreeMap을 만들어서
 	데이터를 5명 추가해보자.
 */
import static java.lang.Math.*;
import java.util.*;
public class Test07 {
	private TreeMap map;
	
	public Test07() {
		setData();
		printMap();
	}
	// 변수 초기화 함수
	public void setData() {
		//우리가 사용할 키값으로 사용할 데이터는 Student 타입이고
		// 이 클래스는 대소비교가 안되는 클래스이다.
		// 따라서 TreeMap을 만들때 정렬기준을 정해야 한다.
		
		map =  new TreeMap(new Comparator() {
			@Override
			public int compare(Object o1,  Object o2) {
				// 이 때 Object 는 키값으로 사용할 Student 객체를 의미한다.
				int t1 = ((Student) o1).getTotal();
				int t2 = ((Student) o2).getTotal();
				
				return t1 - t2;
			}
		});
	
		// 키값으로 사용할 데이터 만들고
		Student st1 =  new Student("박용수", getNo(),getNo(),getNo(),getNo(),getNo());
		Student st2 =  new Student("최태현", getNo(),getNo(),getNo(),getNo(),getNo());
		Student st3 =  new Student("신현식", getNo(),getNo(),getNo(),getNo(),getNo());
		Student st4 =  new Student("조경국", getNo(),getNo(),getNo(),getNo(),getNo());
		Student st5 =  new Student("김기은", getNo(),getNo(),getNo(),getNo(),getNo());

		// 데이터 추가하고
		map.put(st1,  st1.getAvg());
		map.put(st2,  st2.getAvg());
		map.put(st3,  st3.getAvg());
		map.put(st4,  st4.getAvg());
		map.put(st5,  st5.getAvg());
	}
	// map의 내용 출력해주는 함수
	public void printMap() {
		// 키값을 뽑아오고
		Set set = map.keySet();
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			Object key = itor.next();
			Object value = map.get(key);
			
			// 출력
			System.out.println(key);
			System.out.println(value);
		}
	}
	
	// 랜덤하게 점수 반환해주는 함수
	public int getNo() {
		return (int)(random()*41 + 60);
	}
	
	public TreeMap getMap() {
		return map;
	}

	public void setMap(TreeMap map) {
		this.map = map;
	}


	public static void main(String[] args) {
		new Test07();
	}

}
