import java.lang.Math;
import java.math.BigInteger;
public class ThirdTask {
	
	public static int task1(int a) {
		//�������������� �� 1 �� �
		int result = 0;
		for (int i=1; i<=a; i++) {
			result=result+i;
		}
		return result;
	}
	
	public static void task2(double a, double b, double h) {
		//��������� �� �������
		//�� ������� � b � ����� h
		double y;
		for(double i=a; i<=b; i=i+h) {
			if(i>2) {
				y=i;
				System.out.println("x: "+i+" y: "+y);
			}else {
				y=-i;
				System.out.println("x: "+i+" y: "+y);
			}
		}
	}
	
	public static int task3() {
	//����� ����� ��������� ������ ��� �����
		int result=0;
		for (int i=1; i<=100; i++) {
			result+=Math.pow(i, 2);
		}
		return result;
	}
	
	public static BigInteger task4(int number) {
		//����� ������������ ��������� ������ 200 �����
	    BigInteger result = BigInteger.valueOf(1);
	    //����� ��������� 200
	    for (long factor = 2; factor <= number; factor++) {
	        result = result.multiply(BigInteger.valueOf(factor));
	    }
	    result = result.multiply(result);	//�������� ��������� � �������
	    return result;
	}
	
	public static double task5(double e) {
		//����� ����� ���� �� �������� < e
		double result = 0;
		int n = 0;			//����� ����� ����
		double nValue = 0;		//�������� ����� ����
		boolean next = true;//���������� �����������
		while(next) {
			nValue = Math.pow(2, -n)+Math.pow(3, -n);
			result+=nValue;
			if(nValue<e) {
				next = false;
			}
			n++;
		}
		result-=nValue;
		return result;
	}
	
	public static void task6() {
		//������� ��������� ����������� �������� � ������ ����������
		for(int i=0; i<256; i++) {
			System.out.println("10-� ���: "+i+" ������ "+(char)i);
		}
	}
	
	public static void task7(int m, int n) {
		//������� �������� ����� �� m �� n
		for(int j=m; j<=n; j++) {		//��������� �������� � ������ ������
			System.out.println("\n�������� ����� "+j+": ");
			for(int i=2; i<j; i++) {	//����� �� 2 �� �����
				if(j%i==0) {			//���� ��������, ��
					System.out.print(i+"; ");
				}
			}
		}
	}
	
	public static void task8(int q) {
		//������� ����� �����
		while (q>0) {
			System.out.println(q%10);	//������� ��������� ����� �����
			q/=10;						//������ ��� ����� �� �����
		}
	}
}
