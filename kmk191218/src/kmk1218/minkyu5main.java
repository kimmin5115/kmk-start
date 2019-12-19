package kmk1218;

import java.util.*;

import java.util.ArrayList;

public class minkyu5main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		int i=0;
		String j;
		int length;
		int max=0;
		String longlength=null;
		
		System.out.println(list.size());
		
		for (i=0; i<5; i++) {
			System.out.println("단어를 입력하세요");
			j = scan.next();
			list.add(j);
			length = j.length();
			if(max < length) {
				max = length;
				longlength = j;
			}
		}
		for(i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("가장 긴 단어는"+longlength+"입니다.");
		
		
		
		

		
	}

}
