package kmk1226_1;

public class kmkEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String �޼ҵ�
		String str = "�ڹٴ� ��Դ�?";
		//String ���� ���ڼ� ����
		System.out.println(str.length());
		//�Ϻ� ���� ��ü �޼ҵ�
		String newStr = str.replace("�ڹ�", "JAVA");
		System.out.println(newStr);
		System.out.println(str);
		// ���� �߶󳻱� �޼ҵ�
		String str2 = str.substring(0, 1);
		System.out.println(str2);
		String str3 = str.substring(2);
		System.out.println(str3);
		//��ҹ��� ���� �޼ҵ�
		String str4 = "sasfASGGADsadxv";
		String str4Lower = str4.toLowerCase();
		System.out.println(str4Lower);
		String str4Upper = str4.toUpperCase();
		System.out.println(str4Upper);
		
		//���� ���� �޼ҵ�
		String str5 = "                     �ڹ�";
		String str6 = "�ä�����                       ";
		String str7 = "          ��Ŭ����              ";
		String str8 = str5.trim()+str6.trim()+str7.trim();
		String str9 = str5+str6+str7;
		System.out.println(str8);
		System.out.println(str9);
		
		
		
		
	}

}
