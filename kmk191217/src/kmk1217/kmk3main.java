package kmk1217;

public class kmk3main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kmk3 cal =  new kmk3();
		//필드값 호출
		System.out.println(cal.pi1);
		System.out.println(cal.pi);
		System.out.println(kmk3.pi);
		
		//메소드 호출
		System.out.println(cal.add(5, 5));
		System.out.println(cal.subtract(5, 5));
		System.out.println(kmk3.subtract(5, 5));
		
		System.out.println(cal.EARTH_RADIUS);
		System.out.println(kmk3.EARTH_RADIUS);
	}

}
