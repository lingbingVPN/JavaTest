package java06;

public class Computer {
	private Output output;
	public Computer(Output out){
		this.output=out;
	}
	
	//����һ��ģ���ȡ�ַ�������ķ���
	public void keyIn(String msg){
		output.getData(msg);
	}
	//����һ��ģ���ӡ�ķ���
	public void print(){
		output.out();
	}
}
