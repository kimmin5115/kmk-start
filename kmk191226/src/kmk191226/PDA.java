package kmk191226;

public class PDA {
	
	public double result=0;
	
	
	double add(double k, double m) {
		result = k+m;
		return result;
	}


	@Override
	public String toString() {
		return "PDA [result=" + result + "]";
	}


	public PDA(double result) {
		super();
		this.result = result;
	}

}
