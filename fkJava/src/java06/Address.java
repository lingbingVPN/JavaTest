package java06;

import javax.xml.ws.soap.Addressing;

public class Address {
	private final String detail;
	private final String postCode;
	
	//�ڹ��������ʼ������ʵ������
	public Address(){
		this.detail="";
		this.postCode="";
	}
	
	public Address(String detail, String postCode){
		this.detail=detail;
		this.postCode=postCode;
	}
	
	//��Ϊ����ʵ�������ṩgetter����
	public String getDedail(){
		return this.detail;
	}
	
	public String getPostCode(){
		return this.postCode;
	}
	
	//��дequals�������ж����������Ƿ����
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(obj!=null&&obj.getClass()==Address.class){
			Address ad=(Address)obj;
			//��detail��postCode���ʱ������Ϊi����Address�������
			if(this.getDedail().equals(ad.getDedail())
					&&this.getPostCode().equals(ad.getPostCode())){
				return true;
			}
		}
		return false;
	}
	
	public int hashCode(){
		return detail.hashCode() + postCode.hashCode() * 31;
	}
	
}
