package kmk1223;

public class kmk_Ex4 extends kmk_Ex2 {

	public int m;
	public int result=0;
	@Override
	int ticketprice(int k) {		
		if(m >= 30) {
			result = ((int) (super.ticketprice(k) / 100*50)-
					super.ticketprice(k));
		}else if (m >= 10 ) {
			result = ((int) (super.ticketprice(k) / 100*20)-
					super.ticketprice(k));
		}else if ( m >= 5) {
			result = ((int) (super.ticketprice(k) / 100*10)-
					super.ticketprice(k));
		}return result;
	}
	@Override
	public String toString() {
		return "kmk_Ex4 [m=" + m + ", result=" + result + "]";
	}
}
