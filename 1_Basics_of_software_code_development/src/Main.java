import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("�������� ���������\n");
		
		System.out.println("����� �������� ������� z=((a-3)*b/2)+c");
		double a=1.44, b=3.2, c=0.001;	//������ ����������
		System.out.println("a="+a+" b="+b+" c="+c	//������� ���������
				+"\nz="+FirstTask.task1(a,b,c));
		
		System.out.println("\n��������� �������� �� �������");
		int a2=1, b2=3, c2=-10000;						//������ ����������
		System.out.println("a="+a2+" b="+b2+" c="+c2	//������� ���������
				+"\n��������� "+FirstTask.task2(a2,b2,c2));
		
		System.out.println("\n��������� �������� �� �������");
		double angel1=1.57;
		double angel2=0.52;			//������ ����������
		System.out.println("x="+angel1+" ���.\ny="
				+angel2+" ���.\n"+"��������� "+FirstTask.task3(angel1, angel2));
		
		double nnnddd=143.638;	//����������, ����� ���������
		System.out.println("\n���� ����� ���� nnn.ddd "+nnnddd
				+"\n������� ����� ddd.nnn "+FirstTask.task4(nnnddd));
		
		int time = 3661;		//����� � ��������
		System.out.println("\n����������� "+time
				+"\n� ������� ��� ����� SS�");
		FirstTask.task5(time);
		
		double x=1;		//���������� x � y
		double y=3.34;
		System.out.println("\n\n����������: "+x+" "+y);
		System.out.print("�������������� �������: ");
		FirstTask.task6(x,y);
		
		System.out.println("\n���������\n");
		
		angel1 = 43.35;		//��� ���� ������������
		angel2 = 12.22;
		System.out.println("���� ���� "+angel1+" � "+angel2);
		SecondTask.task1(angel1, angel2);
		
		int a1 = 23;
		int b1 = 2;
		int c1 = -4;
		int d1 = 31;
		System.out.println("\n����� max(min(a,b),min(c,d)) "
				+SecondTask.task2(a1, b1, c1, d1));
		
		double x1 = 123.4;	//���������� �����
		double y1 =0;
		double x2 =123;
		double y2 =778;
		double x3 =23;
		double y3 =1.22;
		System.out.println("\n���� ����� �("+x1+","+y1
				+"), B("+x2+","+y2+") � C("+x3+","+y3+")");
		SecondTask.task3(x1, y1, x2, y2, x3, y3);
		
		a = 10;		//������� ����
		b = 12;
		x = 13.5;	//������� �������
		y = 9.5;
		double z = 11.5;
		System.out.println("\n������ ����: "+a+" �� "+b
				+"\n������ �������: "+x+" �� "+y+" �� "+z);
		SecondTask.task4(a, b, x, y, z);
		
		x = 1;
		System.out.println("\n��������� �� �������. ��� � "+x
				+" F(x) "+SecondTask.task5(x));
		
		System.out.println("\n�����\n");
		
		a1 = 5;
		System.out.println("������� ����� �� 1 �� "+a1
				+"\n�����: "+ThirdTask.task1(a1));
		
		a = -2.0;
		b = 2.0;
		double h = 0.5;
		System.out.println("\n�������� �� ���������� �� "+
				a+" �� "+b+" c ����� "+h);
		ThirdTask.task2(a, b, h);
		
		System.out.println("\n����� ��������� ������ ��� �����: "
				+ThirdTask.task3());
		
		System.out.println("\n������������ ��������� ������ ������� �����: "
				+ThirdTask.task4(200));
		
		double e = 0.05;
		System.out.println("\n����� ����� ���� �� �������� < "+e
				+". ����� "+ThirdTask.task5(e));
		
		System.out.println("����� ���������� ����������� "
				+ "�������� � ������ ����������");
		ThirdTask.task6();
		
		System.out.println("�������� ����� �� m �� n, ������ m � n");
		Scanner newScan = new Scanner(System.in);
		int m = newScan.nextInt();
		int n = newScan.nextInt();
		newScan.close();
		ThirdTask.task7(m, n);
		
		int q = 152354;
		System.out.println("\n"+q+" ������� �������");
		ThirdTask.task8(q);
		q = 1001990;
		System.out.println("\n"+q+" ������� �������");
		ThirdTask.task8(q);
	}
}
