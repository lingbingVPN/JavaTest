package java06;

public class CommandTest3 {
	public static void main(String[] args){
		ProcessArray pa=new ProcessArray();
		int[] array={3,-4,6,4};
		//处理数组，具体处理行为 取决于匿名内部类
		pa.process(array, (int[] target)->{
			int sum=0;
			for(int tmp:target){
				sum +=tmp;
			}
			System.out.println("数组元素的总和是:"+sum);
		});
	}
}
