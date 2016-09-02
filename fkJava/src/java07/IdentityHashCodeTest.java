package java07;

public class IdentityHashCodeTest {
	public static void main(String args){
		//下面程序中，s1和s2是两个不同的对象
		String s1=new String("Hello");
		String s2=new String("Hello");
		
		//String重写了hashCode方法，改为根据字符序列计算hashCode值
		//因为s1和s2的字符序列相同，所以它们的hashCode值相等
		//下面判断s1和s2是否指向同一个地址，输出false
		System.out.println(s1==s2);
		//下面判断s1和s2的字符序列是否相同
		System.out.println(s1.equals(s2));
		//下面输出它们各自的hashCode值
		System.out.println("s1的hashCode值："+s1.hashCode()+
				"---------"+"s2的hashCode值："+s2.hashCode());
		// s1和s2是不同的字符串对象，所以它们的identityHashCode值不同
		System.out.println(System.identityHashCode(s1)
					+ "----" + System.identityHashCode(s2));
		String s3 = "Java";
		String s4 = "Java";
		// s3和s4是相同的字符串对象，所以它们的identityHashCode值相同
		System.out.println(System.identityHashCode(s3)
					+ "----" + System.identityHashCode(s4));
		
	}
}
