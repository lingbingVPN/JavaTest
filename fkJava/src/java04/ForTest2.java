package java04;

import javax.print.attribute.standard.PrinterLocation;

public class ForTest2 {
	public static void main(String[] args){
		//同时定义三个初始化变量，使用&&来组合多喝boolean表达式
		for(int b=0,s=0,p=0;b<10&&s<4&&p<10;p++){
			System.out.println(b++);
			System.out.println(++s+p);
		}
	}
}
