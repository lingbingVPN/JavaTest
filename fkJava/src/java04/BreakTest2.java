package java04;

public class BreakTest2 {
	public static void main(String[] args){
		//�ⲿѭ��,outer��Ϊ��ʶ��
		outer:
			for (int i = 0; i < 5; i++) {
				//�ڲ�ѭ��
				for(int j=0;j<3;j++){
					System.out.println("i��ֵΪ:"+i+"j��ֵΪ:"+j);
					if(j==1){
						//����outer��ǩ����ʶ��ѭ��
						break outer;
					}
				}
			}
		
	}
}
