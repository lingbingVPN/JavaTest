package java06;

public class OutputFactory {
	public Output getOutput(){
//		return new Printer();
		return new BetterPrinter();
	}
	
	public static void main(String[] args){
		OutputFactory of=new OutputFactory();
		Computer c=new Computer(of.getOutput());
		c.keyIn("������JavaEE��ҵӦ��ʵս");
		c.keyIn("���Java����");
		c.print();
	}
}
