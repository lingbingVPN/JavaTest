package java04;

public class ArrayInRam {
	public static void main(String[] args){
		//�����ʼ�����飬ʹ�þ�̬��ʼ��
		int[] a={5,7,20};
		//���岢��ʼ�����飬ʹ�ö�̬��ʼ��
		int[] b=new int[4];
		//���b����ĳ���
		System.out.println(b.length);
		//ѭ�����a�����Ԫ��
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		//ѭ�����b�����Ԫ��
		for(int j=0;j<b.length;j++){
			System.out.println(b[j]);
		}
		//��Ϊa��int[]��bҲ��int[]���ͣ����Կ��Խ�a��ֵ����b
		//Ҳ������b����ָ��a����ָ�������
		b=a;
		//�ٴ����b�ĳ���
		System.out.println(b.length);
	}
}
