package java05;

public class Apple2 {
	public String name;
	public String color;
	public double weight;
	//�޲ι�����
	public Apple2(){
		
	}
	//���������Ĺ�����
	public Apple2(String name, String color){
		this.name=name;
		this.color=color;
	}
	//���������Ĺ�����
	public Apple2(String name, String color, double weight){
		//ͨ��this������һ�����صĹ������ĳ�ʼ������
		this(name,color);
		//����this���øù��������ڳ�ʼ����Java����
		this.weight=weight;
	}
}
