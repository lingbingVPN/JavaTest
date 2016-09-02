package java07;

import java.util.Calendar;
import static java.util.Calendar.*;

public class CalendarTest {
	public static void main(String[] args){
		Calendar c=Calendar.getInstance();
		//取出年
		System.out.println(c.get(YEAR));
		//取出月份
		System.out.println(c.get(MONTH));
		//取出日
		System.out.println(c.get(DATE));
		
		//分别设置年、月、日、小时、分钟、秒
		c.set(2003, 10, 23, 12, 32, 23);
		System.out.println(c.getTime());
		
		//将Calendar的月往前推8个月
		c.roll(field, up);
		
		
	}
}
