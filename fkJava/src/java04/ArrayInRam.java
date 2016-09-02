package java04;

public class ArrayInRam {
	public static void main(String[] args){
		//定义初始化数组，使用静态初始化
		int[] a={5,7,20};
		//定义并初始化数组，使用动态初始化
		int[] b=new int[4];
		//输出b数组的长度
		System.out.println(b.length);
		//循环输出a数组的元素
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		//循环输出b数组的元素
		for(int j=0;j<b.length;j++){
			System.out.println(b[j]);
		}
		//因为a是int[]，b也是int[]类型，所以可以将a的值赋给b
		//也就是让b引用指向a引用指向的数组
		b=a;
		//再次输出b的长度
		System.out.println(b.length);
	}
}
