package java07;

import java.util.Calendar;
import static java.util.Calendar.*;

public class CalendarTest {
	public static void main(String[] args){
		Calendar c=Calendar.getInstance();
		//ȡ����
		System.out.println(c.get(YEAR));
		//ȡ���·�
		System.out.println(c.get(MONTH));
		//ȡ����
		System.out.println(c.get(DATE));
		
		//�ֱ������ꡢ�¡��ա�Сʱ�����ӡ���
		c.set(2003, 10, 23, 12, 32, 23);
		System.out.println(c.getTime());
		
		//��Calendar������ǰ��8����
		c.roll(field, up);
		
		
	}
}
