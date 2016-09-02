package java03;

public class ThreeTest {
	public static void main(String[] args){
		/*
		 * 三目运算先判断一个表达式是否成立
		 * 如果成立的话就返回左边的表达式
		 * 如果不成立就返回右边的表达式
		 * 三目运算也可以嵌套使用，但是要结合括号来使用
		 */
		String str=5>3?"5大于3":"5小于3";
		System.out.println(str);
		String str2=null;
		if(5>3){
			str2="5大于3";
		}else{
			str2="5小于3";
		}
		System.out.println(str2);
		
		int a=11;
		int b=12;
		//三目运算符支持嵌套
		System.out.println(a>b?"a大于b":(a<b?"a小于b":"a等于b"));
		//
	}
}
