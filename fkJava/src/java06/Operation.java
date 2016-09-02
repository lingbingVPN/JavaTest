package java06;

import java.awt.PointerInfo;

public enum Operation {
	PLUS{
		public double eval(double x, double y){
			return x+y;
		}
	},
	MINUS{
		public double eval(double x, double y){
			return x-y;
		}
	},
	TIMES{
		public double eval(double x, double y){
			return x*y;
		}
	},
	dIVIDE{
		public double eval(double x, double y){
			return x/y;
		}
	};
	
	//为枚举类定义一个抽象方法
	//为这个抽象方法由不同枚举值提供不同的实现
	public abstract double eval(double x,double y);
	
	public static void main(String[] args){
		System.out.print(Operation.PLUS.eval(3, 4));
		System.out.println(Operation.MINUS.eval(5, 4));
		System.out.println(Operation.TIMES.eval(4, 5));
		System.out.println(Operation.dIVIDE.eval(5, 4));
		
	}
}
