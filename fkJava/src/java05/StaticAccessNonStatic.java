package java05;

import javax.sound.midi.MidiDevice.Info;

public class StaticAccessNonStatic {
	public void info(){
		System.out.println("�򵥵�info����");
	}
	
	public static void main(String[] args){
		//��Ϊmain������static���εľ�̬������info�ǷǾ�̬����
		//����main������ı������Ǹ����ʵ��
		//����ʡ�Ե�this�޷�ָ����Ч�Ķ���
//		info();
		
		//��̬��Ա���ܷ��ʷǾ�̬��Ա����ͨ��Ա����ֻ����ʵ�����ܵ���
//		StaticAccessNonStatic static1=new StaticAccessNonStatic();
//		static1.info();
		
		new StaticAccessNonStatic().info();
		
		
	}
}
