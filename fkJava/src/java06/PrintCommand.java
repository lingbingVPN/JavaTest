package java06;

public class PrintCommand implements Command {
	public void process(int[] target){
		for(int tmp:target){
			System.out.println("�������Ŀ�������Ԫ��:" + tmp);
		}
	}
}
