package kmk12162;

public class Car {

			//�ʵ� ����(�������)
			//�ڵ�����(color), �ְ�ӵ�(speed), ����Ÿ��(type), �𵨸�(model)
			//
			String color;
			int speed;
			String type;
			String model;
			String company = "������Ƽ";
			
			//�⺻������ ����
			Car(){
				//�ʵ尪 ����
				//�Ű������� �Ѱܹ��� ���� �ʵ尪���� ����
				type = "���̺긮��";
			}
			//�������� ���ֳ����� ����
			//Overriding : 
			//Overloading : ���
			
			
			
			
			
			//�Ű������� �ִ� ������ ����
			//�Ű����� : color, speed
		
			Car(String color, int speed){
				this.color = color;
				this.speed = speed;
			}
			//this �뵵�� �ʵ带 ��Ī�Ҷ� ���
		
			
			@Override
			public String toString() {
				return "Car [color=" + color + ", speed=" + speed + ", type=" + type + ", model=" + model + ", company="
						+ company + "]";
			}





			Car(String color, String company){
				this.color = color;
				this.company = company;
			}
			
			
			Car(String color, int speed, 
					String type, String model, String company){
				this.color = color;
				this.speed  = speed;
				this.type  = type;
				this.model = model;
				this.company = company;
			}
			
			
			}
			
		
			

