package java05;


public class ScopeTest {
//����һ�����Ա������Ϊѭ������
	static int i;
	public static void main(String[] args){
		for(i=0;i<10;i++){
			System.out.println("Hello"+i);
		}
		
	}
}
