package java03;
/**
 * 这里回来介绍各种标签的使用
 * @author lingb
 *
 */
public class JavadocTagTest {
	/**
	 * 一个得到打招呼字符串的方法
	 * @param name该参数执行向谁打招呼  解释参数
	 * @return 返回打招呼的字符串  解释返回值的含义
	 */
	
	public String hello(String name){
		return name+"你好啊";
	}
	
	//一行可以写多个语句，一个语句也可以跨多行
	int age=25; String name ="李刚";
	String hello = "你好"+
						"李刚";
	
	//字符串不能跨多行
//	String aString="dddd
//			ddddddd";
	//变量名不能跨多行
//			String na
//					me="李刚";
	
	//boolean是关键字，不能作为标识符
//	int boolean;
			
			
	
	
}
