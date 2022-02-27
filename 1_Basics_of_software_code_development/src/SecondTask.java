import java.lang.Math;
public class SecondTask {
	
	public static void task1(double angel_1, double angel_2) {
	//Даны два угла в граудусах. Определить, существует ли
	//треугольник и будет ли он прямоугольным
		boolean trianExist = false;
		boolean rightTrian = false;
		if(angel_1+angel_2 < 180) {		//если треугольник существует
			trianExist = true;
			if (angel_1+angel_2 == 90) {//если угол прямой
				rightTrian = true;
			}
		}
		if(rightTrian) {
			System.out.println("треугольник прямоугольный");
		}else if(trianExist) {
			System.out.println("треугольник существует");
		}else {
			System.out.println("треугольник не сушествует");
		}
	}
	
	public static int task2(int a, int b, int c, int d) {
	//найти max(min(a,b),min(c,d))
		int min_1 = Math.min(a, b);
		int min_2 = Math.min(c, d);
		int max = Math.max(min_1, min_2);
		return max;
	}
	
	public static void task3(double x1, double y1,
			double x2, double y2, double x3, double y3) {
		//Найти площадь треугольна, образованного точками
		double aria = Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2;
		if (aria == 0) {	//если прощадь равна нулю, то точки лежат на прямой
			System.out.println("точки лежат на одной прямой");
		}else {				//иначе образуют треугольник
			System.out.println("точки не лежат на одной прямой");
		}
	}
	
	public static void task4(double a, double b,
			double x, double y, double z) {
		//пройдёт ли кирпич x y z в отверстие a b
		boolean pass = false;
		if (x<a & y<b) pass = true;
		if (y<a & x<b) pass = true;
		if (x<a & z<b) pass = true;
		if (z<a & x<b) pass = true;
		if (y<a & z<b) pass = true;
		if (z<a & y<b) pass = true;
		if (pass) {
			System.out.println("кирпич пройдёт");
		}else {
			System.out.println("кирпич не пройдёт");
		}
	}
	
	public static double task5(double x) {
		//вычислить по формуле
		double fx;
		if (x>3) {
			fx = 1/(Math.pow(x, 3)+6);
		}else {
			fx = Math.pow(x, 2)-3*x+9;
		}
		return fx;
	}
}
