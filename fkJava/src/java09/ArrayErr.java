package java09;

import java.util.List;
import java.util.ArrayList;

public class ArrayErr {
	public static void main(String[] args){
		//����һ��Integer����
		Integer[] ia=new Integer[5];
		//���԰�һ��Integer[]���鸳��Number[]����
		Number[] na=ia;
		//����������������������ʱ������ArryaStoreException�쳣
		//��Ϊ0.5������Integer
		na[0] = 0.5;
		List<Integer> iList = new ArrayList<>();
		//������뵼�±������
//		List<Number> nList=iList;
	}
}
