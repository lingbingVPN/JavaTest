package java03;

public class FloatTest {
	public static void main(String[] args){
		float af = 5.2345556f;
		System.out.println(af);
		//af的值不固定是因为浮点数只是数字之内的一个区间内，并不是确切的数字。
		double a = 0.0;
		double c = Double.NEGATIVE_INFINITY;
		float d = Float.NEGATIVE_INFINITY;
		//double和float的无穷大是相等的
		System.out.println(c==d);
		//0.0除以0.0将出现非数NaN
		System.out.println(a/a);
		//两个非数之间是不相等的
		System.out.println(a/a==Float.NaN);
		//所有的无穷大都是相等的
		System.out.println(6.0/0==887.0/0);
		//负数除以0.0得到负无穷大
		System.out.println(-8/a);
		//下面的代码将抛出除以0的异常
//		System.out.println(5/0);
		//上面求无穷大时之所以没有抛出异常是因为除数或被除数里至少有一个浮点类型的数
		//浮点类型的数并不一定等于0，只是无限接近于0
		
	}
}
