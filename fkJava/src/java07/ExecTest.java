package java07;

public class ExecTest {
	public static void mian(String[] args)throws Exception{
		Runtime rt=Runtime.getRuntime();
		//���м��±�����
		rt.exec("notepad.exe");
	}
}
