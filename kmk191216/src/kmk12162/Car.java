package kmk12162;

public class Car {

			//필드 선언(저장공간)
			//자동차색(color), 최고속도(speed), 연료타입(type), 모델명(model)
			//
			String color;
			int speed;
			String type;
			String model;
			String company = "마세라티";
			
			//기본생성자 선언
			Car(){
				//필드값 세팅
				//매개변수로 넘겨받은 값을 필드값으로 세팅
				type = "하이브리드";
			}
			//면접에서 자주나오는 질문
			//Overriding : 
			//Overloading : 상속
			
			
			
			
			
			//매개변수가 있는 생성자 선언
			//매개변수 : color, speed
		
			Car(String color, int speed){
				this.color = color;
				this.speed = speed;
			}
			//this 용도는 필드를 지칭할때 사용
		
			
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
			
		
			

