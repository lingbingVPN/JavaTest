package java04;

public class SwitchTest {
	public static void main(String[] arg){
		//声明变量score,并为其赋值'c'
		char score='C';
		//执行switch分支语句
		switch (score){
		case 'A':
			System.out.print("优秀");
			break;
		case 'B':
			System.out.println("良好");
			break;
		case 'C':
			System.out.println("中");
			System.out.println("switch无需花括号");
			break;
		case 'D':
			System.out.print("及格");
			break;
		case 'F':
			System.out.print("不及格");
			break;
		default:
			System.out.println("成绩输入错误");
			break;
		
		}
	}
}
