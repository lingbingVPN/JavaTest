package java14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ErrorUtils {
	@SafeVarargs
	public static void faultyMethod(List<String>...listStrArray){
		//Java���Բ��������������飬���listArraysֻ�ܱ�����list[]����
		//��ʱ�൱�ڰ�List<String>������List,�Ѿ������ˡ�������
		List[] listArray=listStrArray;
		List<Integer> myList=new ArrayList<Integer>();
		myList.add(new Random().nextInt(100));
		//��listArray�ĵ�һ��Ԫ�ظ���myList
		listArray[0]=myList;
		String s = listStrArray[0].get(0);
	}
}
