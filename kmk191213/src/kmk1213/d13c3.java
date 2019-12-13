package kmk1213;

public class d13c3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for문 이용해서 배열에 저장된 데이터 모두 출력하기
		int[][]number = {
				{1,2,3},
				{4,5,6}
		};
		int k, m;
		for(k=0; k<number.length; k++){
			for(m=0; m<number[k].length; m++) {
				System.out.println(
						"number["+k+"]["+m+"]="
				+number[k][m]);
						}
				}
	}

}
