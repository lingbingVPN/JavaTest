package java04;

import java.util.Arrays;

import javax.swing.border.MatteBorder;

public class Num2Rmb {
	private String[] hanArr={"��","Ҽ","��","��","��","��","½","��","��","��"};
	private String[] unitArr={"ʮ","��","ǧ"};
	/**
	 * ��һ���������ֽ���������ֺ�С�������ַ���
	 * @param num��Ҫ���ֽ�ĸ�����
	 * @return �ֽ�������������ֺ�С�����֣���һ������Ԫ�����������֣��ڶ�������Ԫ����С������
	 */
	private String[] divide(double num){
		//��һ��������ǿ������ת��Ϊlong�ͣ����õ�������������
		long zheng = (long) num;
		//��������ȥ�������֣��õ�С�����֣�С�����ֳ���100����ȡ���õ�2ΪС��
		long xiao = Math.round((num-zheng)*100);
		//�����������ַ���������ת��Ϊ�ַ���
		return new String[]{zheng+"",String.valueOf(xiao)};
	}
	
	/**
	 * ��һ����λ�������ַ�����ɺ����ַ���
	 * @param numStr��Ҫ��ת����˼ά�������ַ���
	 * @return ��λ�������ַ�����ת���ɺ����ַ���
	 */
	
	private String toHanStr(String numStr){
		String result="";
		int numLen = numStr.length();
		//���α��������ַ�����ÿһλ����
		for(int i=0;i<numLen;i++){
			//��char������ת��Ϊint�����֣���Ϊ�����ǵ�ASCII��ֵ�������48
			//��˰�char�����ּ�ȥ48�õ�int������
			int num = numStr.charAt(i)-48;
			//����������һλ���֣��������ֲ����㣬����Ҫ��ӵ�λ��ǧ���١�ʮ��
			if(i!=numLen-1&&num!=0){
				result += hanArr[num] + unitArr[numLen-2-i];
			}
			//����Ҫ��ӵ�λ
			else
				result += hanArr[num];	
		}
		return result;
	}
	
	public static void main(String[] args){
		Num2Rmb nr=new Num2Rmb();
		//���԰�һ���������ֽ���������ֺ�С������
		System.out.println(Arrays.toString(nr.divide(345234234324.34)));
		//���԰�һ����λ�������ַ�����̺����ַ���
		System.out.println(nr.toHanStr("3342"));
	}
	
	
	
	
}
