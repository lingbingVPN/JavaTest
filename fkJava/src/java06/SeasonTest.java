package java06;

public class SeasonTest{
	public SeasonTest(Season s)
	{
		System.out.println(s.getName() +
			"��������һ��"+ s.getDesc() + "�ļ���");
	}
	public static void main(String[] args)
	{
		// ֱ��ʹ��Season��FALL��������һ��Season����
		new SeasonTest(Season.FALL);
	}
}
