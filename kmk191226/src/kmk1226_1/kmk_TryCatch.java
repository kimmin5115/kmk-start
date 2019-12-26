package kmk1226_1;

import java.util.ArrayList;

public class kmk_TryCatch {

	private static Object ddd;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList를 선언해서 Exception을 발생시켜보세요
		
		try {
			ArrayList<String> kmk = new ArrayList<String>();
			kmk.add("ddd");
			for(int i=0;i<kmk.size();i++) {
			System.out.println(kmk.get(i));
			}
		}catch(IndexOutOfBoundsException e){
			System.out.println("예외가 발생했습니다.");
			e.printStackTrace();
		}finally {
			System.out.println("무조건 나와");
		}

	}

}
