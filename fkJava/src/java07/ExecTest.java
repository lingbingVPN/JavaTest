package java07;

public class ExecTest {
	public static void mian(String[] args)throws Exception{
		Runtime rt=Runtime.getRuntime();
		//运行记事本程序
		rt.exec("notepad.exe");
	}
}
