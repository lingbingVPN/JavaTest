package java07;

import java.util.Objects;

public class ObjectsTest {
	//����һ��obj����������Ĭ��ֵ��null
	static ObjectsTest obj;
	
	public static void main(String[] args){
		//���һ��null�����hashCodeֵ�����0
		System.out.println(Objects.hashCode(obj));
		//���һ��null�����toString,���null
		System.out.println(Objects.toString(obj));
		//Ҫ��obj����Ϊnull,���objΪnull�������쳣
		System.out.println(Objects.requireNonNull(obj
				, "obj����������null��"));
	}
}
