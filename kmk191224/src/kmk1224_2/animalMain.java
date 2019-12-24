package kmk1224_2;

public class animalMain {

	public static void main(String[] args) {
//		animal ani = new animal();
		dog g =new dog();
		g.sound();
		g.breath();
		tigger t = new tigger();
		t.sound();
		t.breath();
		
		//´ÙÇü¼º(polymorphism)
		animal ani = new dog();
		ani.sound();
		ani = new tigger();
		ani.sound();
		
//		tigger = new dog();//¾ÈµÊ
	}

}
