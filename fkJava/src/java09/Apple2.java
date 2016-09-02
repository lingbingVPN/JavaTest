package java09;

public class Apple2<T extends Number> {
	T co1;
	public static void main(String[] args){
		Apple<Integer> ai=new Apple<>();
		Apple<Double> ad=new Apple<>();
		//下面代码将引起编译异常，下面代码试图把String类型传给T形参
		//但String不是Number的子类型，所有引发编译错误
		Apple<String> as=new Apple<>();
	}
}
