package java06;

public enum Gender {
	//�˴���ö��ֵ������ö�Ӧ������������
	MALE("��"),FEMALE("Ů	");
	private final String name;
	
	//ö����Ĺ�����ֻ��ʹ��private����
	private Gender(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
}
