package java04;

public class ContinueTest2 {
	public static void main(String[] args){
		//���ѭ��
		outer:
			for(int i=0;i<5;i++){
				//�ڲ�ѭ��
				for(int j=0;j<3;j++){
					System.out.println("i��ֵΪ:"+i+"j��ֵΪ��"+j);
					if(j==1){
						//����outer��ǩ��ָ����ѭ�����б���ѭ����ʣ�����
						continue outer;
					}
				}
			}
	}
}
