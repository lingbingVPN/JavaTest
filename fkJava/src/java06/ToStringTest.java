package java06;

class Apple{
	private String color;
	private double weight;
	public Apple(){}
	//�ṩ�в����Ĺ�����
	public Apple(String color,double weight){
		this.color=color;
		this.weight=weight;
	}
	
	//color��setter��getter����
	public void setColor(String color){
		this.color=color;
	}
	
	public String getColor(){
		return this.color;
	}
	
	//weight��setter��getter����
	public void setWeight(double weight){
		this.weight=weight;
	}
	
	public double getWeight(){
		return this.weight;
	}
	
	//��дtoString����������ʵ��Apple����ġ�����������
	public String toString(){
		return "Apple[color=" + color + ",weight=" + weight + "]";
	}
}
public class ToStringTest {
	public static void main(String[] args){
		Apple a=new Apple("��ɫ",5.68);
		//��ӡApple����
		System.out.println(a);
	}
}
