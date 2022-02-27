import java.lang.Math;
import java.math.BigInteger;
public class ThirdTask {
	
	public static int task1(int a) {
		//проссумировать от 1 до а
		int result = 0;
		for (int i=1; i<=a; i++) {
			result=result+i;
		}
		return result;
	}
	
	public static void task2(double a, double b, double h) {
		//вычислить по формуле
		//на отрезке а b с шагом h
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
	//Найти сумму квадратов первых ста чисел
		int result=0;
		for (int i=1; i<=100; i++) {
			result+=Math.pow(i, 2);
		}
		return result;
	}
	
	public static BigInteger task4(int number) {
		//найти произведение квадратов первых 200 чисел
	    BigInteger result = BigInteger.valueOf(1);
	    //найти факториал 200
	    for (long factor = 2; factor <= number; factor++) {
	        result = result.multiply(BigInteger.valueOf(factor));
	    }
	    result = result.multiply(result);	//возвести факториал в квадрат
	    return result;
	}
	
	public static double task5(double e) {
		//найти сумму ряда до елемента < e
		double result = 0;
		int n = 0;			//номер члена ряда
		double nValue = 0;		//значение члена ряда
		boolean next = true;//продолжать суммировать
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
		//вывести численное обозначение символов в памяти компьютера
		for(int i=0; i<256; i++) {
			System.out.println("10-й код: "+i+" символ "+(char)i);
		}
	}
	
	public static void task7(int m, int n) {
		//вывести делители чисел от m до n
		for(int j=m; j<=n; j++) {		//повторить операцию с каждым числом
			System.out.println("\nДелители числа "+j+": ");
			for(int i=2; i<j; i++) {	//поиск от 2 до числа
				if(j%i==0) {			//если делитель, то
					System.out.print(i+"; ");
				}
			}
		}
	}
	
	public static void task8(int q) {
		//вывести цифры числа
		while (q>0) {
			System.out.println(q%10);	//вывести последнюю цифру числа
			q/=10;						//убрать эту цифру из числа
		}
	}
}
