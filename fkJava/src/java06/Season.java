package java06;

import javax.sql.rowset.serial.SerialStruct;

import org.omg.PortableServer.ServantActivator;

public class Season {
	//��Season�ඨ��ɲ��ɱ�ģ������Ա����Ҳ�����final��
	private final String name;
	private final String desc;
	public static final Season SPRING
						=new Season("����" , "�ô�̤��");
	public static final Season SUMMER
						= new Season("����" , "��������");
public static final Season FALL
						= new Season("����" , "�����ˬ");
public static final Season WINTER
						= new Season("����" , "Χ¯��ѩ");
	
	public static Season getSeason(int seasonNum){
		switch(seasonNum){
			case 1 :
				return SPRING;
			case 2 :
				return SUMMER;
			case 3 :
				return FALL;
			case 4 :
				return WINTER;
			default :
				return null;
		}
	}
	
	//�������������private����Ȩ��
	private Season(String name, String desc){
		this.name=name;
		this.desc=desc;
	}
	
	//ֻΪname��desc�ṩ��getter����
	public String getName(){
		return this.name;
	}
	
	public String getDesc(){
		return this.desc;
	}
}
