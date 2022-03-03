import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Линейные программы\n");
		
		System.out.println("найти значение функции z=((a-3)*b/2)+c");
		double a=1.44, b=3.2, c=0.001;	//задать переменные
		System.out.println("a="+a+" b="+b+" c="+c	//вывести результат
				+"\nz="+FirstTask.task1(a,b,c));
		
		System.out.println("\nвычислить значение по формуле");
		int a2=1, b2=3, c2=-10000;						//задать переменные
		System.out.println("a="+a2+" b="+b2+" c="+c2	//вывести результат
				+"\nрезультат "+FirstTask.task2(a2,b2,c2));
		
		System.out.println("\nвычислить значение по формуле");
		double angel1=1.57;
		double angel2=0.52;			//задать переменные
		System.out.println("x="+angel1+" рад.\ny="
				+angel2+" рад.\n"+"результат "+FirstTask.task3(angel1, angel2));
		
		double nnnddd=143.638;	//переменная, затем результат
		System.out.println("\nдано число вида nnn.ddd "+nnnddd
				+"\nвернуть число ddd.nnn "+FirstTask.task4(nnnddd));
		
		int time = 3661;		//время в секундах
		System.out.println("\nПредставить "+time
				+"\nв формает ННч ММмин SSс");
		FirstTask.task5(time);
		
		double x=1;		//координаты x и y
		double y=3.34;
		System.out.println("\n\nкоординаты: "+x+" "+y);
		System.out.print("Принадлженость облости: ");
		FirstTask.task6(x,y);
		
		System.out.println("\nВетвления\n");
		
		angel1 = 43.35;		//два угла треугольника
		angel2 = 12.22;
		System.out.println("Даны углы "+angel1+" и "+angel2);
		SecondTask.task1(angel1, angel2);
		
		int a1 = 23;
		int b1 = 2;
		int c1 = -4;
		int d1 = 31;
		System.out.println("\nнайти max(min(a,b),min(c,d)) "
				+SecondTask.task2(a1, b1, c1, d1));
		
		double x1 = 123.4;	//координаты точек
		double y1 =0;
		double x2 =123;
		double y2 =778;
		double x3 =23;
		double y3 =1.22;
		System.out.println("\nданы точки А("+x1+","+y1
				+"), B("+x2+","+y2+") и C("+x3+","+y3+")");
		SecondTask.task3(x1, y1, x2, y2, x3, y3);
		
		a = 10;		//размеры дыры
		b = 12;
		x = 13.5;	//размеры кирпича
		y = 9.5;
		double z = 11.5;
		System.out.println("\nРазмер дыры: "+a+" на "+b
				+"\nразмер кирпича: "+x+" на "+y+" на "+z);
		SecondTask.task4(a, b, x, y, z);
		
		x = 1;
		System.out.println("\nПосчитать по формуле. При х "+x
				+" F(x) "+SecondTask.task5(x));
		
		System.out.println("\nЦиклы\n");
		
		a1 = 5;
		System.out.println("Вывести сумму от 1 до "+a1
				+"\nответ: "+ThirdTask.task1(a1));
		
		a = -2.0;
		b = 2.0;
		double h = 0.5;
		System.out.println("\nВычилить на промежутке от "+
				a+" до "+b+" c шагом "+h);
		ThirdTask.task2(a, b, h);
		
		System.out.println("\nсумма квадратов первых ста чисел: "
				+ThirdTask.task3());
		
		System.out.println("\nпроизведение квадратов первых двухста чисел: "
				+ThirdTask.task4(200));
		
		double e = 0.05;
		System.out.println("\nнайти сумму ряда до елемента < "+e
				+". Сумма "+ThirdTask.task5(e));
		
		System.out.println("вывод численного обозначения "
				+ "символов в памяти компьютера");
		ThirdTask.task6();
		
		System.out.println("делители чисел от m до n, ввести m и n");
		Scanner newScan = new Scanner(System.in);
		int m = newScan.nextInt();
		int n = newScan.nextInt();
		newScan.close();
		ThirdTask.task7(m, n);
		
		int q = 152354;
		System.out.println("\n"+q+" вывести цифрами");
		ThirdTask.task8(q);
		q = 1001990;
		System.out.println("\n"+q+" вывести цифрами");
		ThirdTask.task8(q);
	}
}
