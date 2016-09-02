package java06;

public class EqualTest {
	public static void main(String[] args){
		int it=65;
		float fl=65.0f;
		System.out.println("65和65.0是否相等？"+(it==fl));
		
		char ch='A';
		System.out.println("65和'A'是否相等？" + (it == ch));
		
		String str1=new String("Hello");
		String str2=new String("Hello");
		System.out.println("str1和str2是否相等？"
				+ (str1 == str2));
		System.out.println("str1是否equals str2？"
				+ (str1.equals(str2)));
		
		
		// 由于java.lang.String与EqualTest类没有继承关系，
		// 所以下面语句导致编译错误
//		System.out.println("hello"==new EqualTest());
	}
}
