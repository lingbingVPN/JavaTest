package java04;

public class IfCorrectTest2 {
	public static void main(String[] args){
		int age=45;
		if(age>60){
			System.out.println("������");
		}
		//��ԭ����if������������else����������
		if(age>40&&!(age>60)){
			System.out.println("������");
		}
		if(age>20&&!(age>40)&&!(age>60)){
			System.out.println("������");
		}
	}
}
