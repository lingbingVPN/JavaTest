package java06;

public class StringJoinTest {
	public static void main(String[] args){
		String s1="疯狂Java";
		//s2变量引用的字符串可以编译时就确定下来
		//因此s2直接引用常量池中已有的"疯狂Java"字符串
		String s2="疯狂"+"Java";
		System.out.println(s1==s2);
		
		
		//定义两个字符串直接量
		String str1="疯狂";
		String str2="Java";
		
		String s3=str1+str2;
		System.out.println(s1==s3);
	}
}
