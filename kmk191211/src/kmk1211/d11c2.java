package kmk1211;

public class d11c2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum=0;//�հ�� ����
		int num=1;//���ڿ� ����
		int count=1;//ī��Ʈ�� ����
		int s=1;//��ȣ�� ����
		while(true) {
			sum=sum+num;
			if(sum>=100) {
				break;
			}else {
				num=s*count;
				s=-s;//��ȣ ����(s�� -1�� �����ص� ����)
				count++;//������ ���� ������ ���� ����������
				System.out.println("���� num,s,count�� :"+num+","+s+","+count);
			}
		}System.out.println("���� : "+num);
		System.out.println("�հ� : "+sum);
		
	}
	

}
