package java06;

public abstract class SpeedMeter {
	//ת��
	private double turnRate;
	public SpeedMeter(){}
	//�ѷ��س��ְ뾶�ķ�������Ϊ���󷽷�
	public abstract double getRadius();
	public void setTurnRate(double turnRate){
		this.turnRate=turnRate;
	}
	//��������ٶȵ�ͨ���㷨
	public double getSpeed(){
		//�ٶȵ��ڳ��ְ뾶*2*PI*ת��
		return java.lang.Math.PI*2*getRadius()*turnRate;
		}
}
