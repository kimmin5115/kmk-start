package kmk1223;

public class kmk_Ex3 extends kmk_Ex2 {
	
	public int card=0;
	public int result=0;
	@Override
	int ticketprice(int k) {
		
		if(card == 0) {
			result = ((int) (super.ticketprice(k) / 100*0.05)+
					super.ticketprice(k));
			
		}else {
			result = super.ticketprice(k);
		}
		return result;
	}
	@Override
	public String toString() {
		return "kmk_Ex3 [card=" + card + ", result=" + result + "]";
	}
	
	

}
