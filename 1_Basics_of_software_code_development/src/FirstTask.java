
public class FirstTask {
	
	public static double task1 (double a,double b,double c) {
	//����� �������� �������
	//z=((a-3)*b/2)+c
	//�������� � ������� a b � c,
	//������� ��� ����� z
		double z;
		z = ((a-3)*b/2)+c;
		return z;
	}
	
	public static double task2 (int a, int b, int c){
	//��������� �������� ��������� �� �������
	//(b+ (b^2+4ac)^1/2 )/2a - a^3c + b^-2
		double q = 0;
		try {
			q = (b+Math.sqrt(Math.pow(b, 2)+4*a*c));	//��������� �� �������
		}catch(ArithmeticException e) {
			System.out.println("Calculating error"+e.toString());	//��������� ����������
		}															//������������� ������ 
		return q;													//� ������� �����������
	}
	
	public static double task3 (double x, double y) {
	//��������� �������� ��������� �� �������
	//(sinx+cosy)/(cosx-siny)*tgxy
		double z;
		z = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
		return z;
	}
	
	public static double task4 (double q) {
	//���� ����� ���� nnn.ddd
	//������� ����� ddd.nnn
		int nnn = (int)Math.floor(q);			//������� ����� �����
		int ddd = (int)Math.round((q-nnn)*1000);//�������� ������� �����
		double z = ddd+(double)nnn/1000;		//�������� �������
		return z;
	}
	
	public static void task5 (int T) {
	//����� � - ����� � ��������
	//������� ����� � �������
	//��� ����� SS�
		int HH;		//����
		int MM;		//������
		int SS;		//�������
		HH = (int)Math.floor(T/3600);
		MM = (int)Math.floor((T-HH*3600)/60);
		SS = T-HH*3600-MM*60;
		System.out.print(HH+"� "+MM+"��� "+SS+"�");
	}
	
	public static void task6 (double x, double y) {
	//�� ����������� x � y 
	//���������� �������������� ����� �������
		boolean inhere = false;	//����������� ����� �������
		if(((x>=-2 & x<=2)&(y>=0 & y<=4))			//�������� �������� ��������
				|((x>=-4 & x<=4)&(y>=-3 & y<=0))) {	//�������� ������� ��������������
			inhere = true;
		}
		System.out.println(inhere);
	}
}
