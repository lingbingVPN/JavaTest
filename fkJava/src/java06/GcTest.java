package java06;


public class GcTest {
	public static void main(String[] args){
		for(int i=0;i<4;i++){
			new GcTest();
			//�������д����������ȫ��ͬ��ǿ��ϵͳ������������
			System.gc();
			Runtime.getRuntime().gc();
		}		
	}

	public void finalize(){
		System.out.println("ϵͳ��������GcTest�������Դ...");
	}
}
