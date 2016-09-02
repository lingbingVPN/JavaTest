package java07;

public class IdentityHashCodeTest {
	public static void main(String args){
		//��������У�s1��s2��������ͬ�Ķ���
		String s1=new String("Hello");
		String s2=new String("Hello");
		
		//String��д��hashCode��������Ϊ�����ַ����м���hashCodeֵ
		//��Ϊs1��s2���ַ�������ͬ���������ǵ�hashCodeֵ���
		//�����ж�s1��s2�Ƿ�ָ��ͬһ����ַ�����false
		System.out.println(s1==s2);
		//�����ж�s1��s2���ַ������Ƿ���ͬ
		System.out.println(s1.equals(s2));
		//����������Ǹ��Ե�hashCodeֵ
		System.out.println("s1��hashCodeֵ��"+s1.hashCode()+
				"---------"+"s2��hashCodeֵ��"+s2.hashCode());
		// s1��s2�ǲ�ͬ���ַ��������������ǵ�identityHashCodeֵ��ͬ
		System.out.println(System.identityHashCode(s1)
					+ "----" + System.identityHashCode(s2));
		String s3 = "Java";
		String s4 = "Java";
		// s3��s4����ͬ���ַ��������������ǵ�identityHashCodeֵ��ͬ
		System.out.println(System.identityHashCode(s3)
					+ "----" + System.identityHashCode(s4));
		
	}
}
