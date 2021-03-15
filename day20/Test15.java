package day20;
/*
 	�л��� �̸��� Ű������ �ϰ�
 	�ڹ������� ������ϴ� Map�� ����
 	5���� �л��� ����ϰ�
 	����غ���.
 */

import java.util.*;
public class Test15 {

	public Test15() {
		HashMap<String, Integer> map =  new HashMap<String, Integer>();
		map.put("����", 60);
		map.put("���", 95);
		map.put("����", 100);
//		map.put('a', 90); // Ű���� Ÿ���� ���ڿ��� �ƴϱ� ������ �����߻�...
		
		// �����͸� ������ ����غ���.
		// ���� �����͸� �������� Ű���� �˾ƾ� �ϹǷ� Ű���� ��� ��������.
		Set<String> set = map.keySet();
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			String key = itor.next();
			int value = map.get(key); // Integer Ÿ�Ӥ����� ������ int Ÿ������ Unboxing�Ѵ�.
			//���
			System.out.println(key + " - " + value);
			
		}
		System.out.println();
		
		
		 Set<Map.Entry<String, Integer>> data = map.entrySet();
		 
		 Iterator<Map.Entry<String, Integer>> it =  data.iterator();
		 while(it.hasNext()) {
			 Map.Entry<String, Integer> ent = it.next();
			 String key = ent.getKey();
			 int val = ent.getValue();
//			 String key = it.next().getKey();
//			 int val = it.next().getValue();
			 System.out.println(key + " | "+ val);
		 }
	}

	public static void main(String[] args) {
		new Test15();

	}

}
