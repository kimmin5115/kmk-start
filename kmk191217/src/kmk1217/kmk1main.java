package kmk1217;

public class kmk1main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		kmk1 car = new kmk1();
		car.setGas(5);
		boolean gasState = car.isLeftGas();
		System.out.println(car.gas);
		if(gasState) {
			System.out.println("√‚πﬂ");
			car.run();
		}
	}

}
