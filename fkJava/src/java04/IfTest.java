package java04;

public class IfTest {
	public static void main(String[] args)
	{
		//例子一
		int age = 30;
		if(age >20)
			//只有当age>20时，下面花括号括起来的代码才会执行
			//花括号括起来的语句是一个整体，要么一起执行，要么一起不执行
		{
			System.out.println("年龄已经大于20岁类");
			System.out.println("20岁以上的人应该学会承担责任");
		}
		
		//例子二
		//定义变量b,并为其赋值
		int a=5;
		if(a>4)
			//如果a>4，则执行下面的执行体，只有一行代码作为代码块，可以不要大括号对
			System.out.println("a大于4");
		else
			//否则，执行下面的执行体，只有一行代码作为代码块，可以不要大括号对
			System.out.println("a不大于4");
		
		//例子三
		//定义变量b，并为其赋值
		int b=5;
		if(b>4)
			System.out.println("b大于4");
		else 
			//否则，下面两行代码只有一行代码会作为else的代码块。所有不管有几行代码都带上花括号，避免出错
			b--;
			System.out.println("b不大于4");
			
		//例子四
		//定义变量c，并为其赋值
			int c=5;
			if(c>4)
				//在没有花括号的情况下，下面代码只有c--这一行代码为执行体，C--结束后，if语句也就结束了，下面的输出语句为if之外的语句
				c--;
				//程序执行完这一行之后就跳出来if体系，所以下面的else会因为没有if与其呼应而报错
				System.out.println("c大于4");
				System.out.print(c);
//			else 
//				System.out.println("c不大于4");
	}

}
