package java06;

interface FkTest{
	void run();
}

public class LambdaTest {
	public static void main(String[] args){
		//Runable�ӿ���ֻ����һ���޲����ķ���
		//Lambda���ʽ�������������ʵ����Runbale�ӿ���
		//Ψһ�ģ��޲����ķ���
		//��������Lambda���ʽ������Runable����
		Runnable r=()->{
			for(int i=0;i<100;i++){
				System.out.println();
			}
		};
		
		//������뱨�������ݵ����ͣ�Object���Ǻ����ӿ�
//		Object o=()->{
//			for(int i = 0 ; i < 100 ; i ++)
//				{
//					System.out.println();
//				}
//		};
		
		Object obj1=(Runnable)()->{
			for(int i=0;i<100;i++){
				System.out.println();
			}
		};
		
		/*ͬ����Lambda���ʽ���Ա����ɲ�ͬ��Ŀ������
		 * Ψһ��Ҫ���ǣ�
		 * Lambda���ʽ���β��б��뺯��ʽ�ӿ���
		 * Ψһ�ĳ��󷽷����β��б���ͬ
		 */
		Object obj2=(FkTest)()->{
			for(int i=0;i<100;i++){
				System.out.println();
			}
		};
		
	}
}
