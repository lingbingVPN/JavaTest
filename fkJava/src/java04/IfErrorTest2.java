package java04;

public class IfErrorTest2 {
	public static void main(String[] args){
		int age=45;
		if(age>20){
			System.out.println("������");
		}else if(age>40&&!(age>20)){
			System.out.println("������");
		}else if(age>60&&!(age>40)&&!(age>20)){
			System.out.println("������");
		}
		
	}

}
