package java06;

class Name{
	private String firstName;
	private String lastName;
	public Name(){}
	public Name(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
}
public class Person5 {
	private final Name name;
	public Person5(Name name){
		this.name=name;
	}
	public Name getName(){
		return name;
	}
	
	public static void main(String[] args){
		Name n=new Name("悟空","孙");
		Person5 p=new Person5(n);
		//Person对象的name的firstName值为"悟空"
		System.out.println(p.getName().getFirstName());
		//改变Person对象的name的firstName值
		n.setFirstName("八戒");
		System.out.println(p.getName().getFirstName());
		System.out.println(p.getName().getLastName());
		
	}
}
