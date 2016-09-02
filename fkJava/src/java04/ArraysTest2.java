package java04;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

import javax.swing.text.html.HTMLEditorKit.LinkController;

public class ArraysTest2 {
	public static void main(String[] args){
		
		//������arr1��������
		int[] arr1=new int[]{3,-4,25,16,30,18};
		//������arr1���в�������
		Arrays.parallelSort(arr1);
		System.out.print(Arrays.toString(arr1));
		
		//������arr2
		int[] arr2 = new int[]{3,-4,25,16,30,18};
		Arrays.parallelPrefix(arr2, new IntBinaryOperator(){
			//left����������ǰһ����������Ԫ�أ������һ��Ԫ��ʱ��leftΪ1
			//right����Ÿ�����е�ǰ��������Ԫ��
			public int applyAsInt(int left,int right){
				return left*right;
			} 
		});
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 =new int[5];
		Arrays.parallelSetAll(arr3, new IntUnaryOperator() {
			
			@Override
			public int applyAsInt(int operand) {
				// operand�������ڼ��������Ԫ�ص�����
				return operand*5;
			}
		});			
		System.out.println(Arrays.toString(arr3));
		
	}
}
