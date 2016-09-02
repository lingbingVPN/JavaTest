package java14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ErrorUtils {
	@SafeVarargs
	public static void faultyMethod(List<String>...listStrArray){
		//Java语言不允许创建泛型数组，因此listArrays只能被当成list[]处理
		//此时相当于把List<String>赋给了List,已经发生了“擦除”
		List[] listArray=listStrArray;
		List<Integer> myList=new ArrayList<Integer>();
		myList.add(new Random().nextInt(100));
		//把listArray的第一个元素赋给myList
		listArray[0]=myList;
		String s = listStrArray[0].get(0);
	}
}
