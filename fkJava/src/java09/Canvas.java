package java09;

public class Canvas {

//	// ͬʱ�ڻ����ϻ��ƶ����״
//	public void drawAll(List<Shape> shapes)
//	{
//		for (Shape s : shapes)
//		{
//			s.draw(this);
//		}
//	}
//	public void drawAll(List<?> shapes)
//	{
//		for (Object obj : shapes)
//		{
//			Shape s = (Shape)obj;
//			s.draw(this);
//		}
//	}
	// ͬʱ�ڻ����ϻ��ƶ����״��ʹ�ñ����Ƶķ���ͨ���
	public void drawAll(List<? extends Shape> shapes)
	{
		for (Shape s : shapes)
		{
			s.draw(this);
		}
	}

	public static void main(String[] args)
	{
		List<Circle> circleList = new ArrayList<Circle>();
		Canvas c = new Canvas();
		// ����List<Circle>������List<Shape>��������,
		// ����������������������
		c.drawAll(circleList);
	}
}
