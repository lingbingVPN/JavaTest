package java04;

import org.w3c.dom.traversal.DocumentTraversal;

public class StringSwitchTest {
	public static void main(String[] args){
		//声明变量season
		String season="夏天";
		//执行switch分支语句
		switch (season) {
		case "春天":
			System.out.print("春暖花开");
			break;
		case "夏天":
			System.out.print("夏日炎炎");
			break;
		case "秋天":
			System.out.append("秋高气爽");
			break;
		case "冬天":
			System.out.println("冬雪皑皑");
			break;
		default:
			System.out.println("季节输入错误");
			break;
		}
	}
}
