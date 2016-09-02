package java04;

public class IfCorrectTest2 {
	public static void main(String[] args){
		int age=45;
		if(age>60){
			System.out.println("老年人");
		}
		//在原本的if条件中增加了else的隐含条件
		if(age>40&&!(age>60)){
			System.out.println("中年人");
		}
		if(age>20&&!(age>40)&&!(age>60)){
			System.out.println("青年人");
		}
	}
}
