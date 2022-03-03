
public class FirstTask {
	
	public static double task1 (double a,double b,double c) {
	//найти значение функции
	//z=((a-3)*b/2)+c
	//передать в функцию a b и c,
	//вернуть как ответ z
		double z;
		z = ((a-3)*b/2)+c;
		return z;
	}
	
	public static double task2 (int a, int b, int c){
	//вычислить значение выражения по формуле
	//(b+ (b^2+4ac)^1/2 )/2a - a^3c + b^-2
		double q = 0;
		try {
			q = (b+Math.sqrt(Math.pow(b, 2)+4*a*c));	//вычислние по формуле
		}catch(ArithmeticException e) {
			System.out.println("Calculating error"+e.toString());	//обработка исключения
		}															//отрицательный корень 
		return q;													//и нулевйо знаменатель
	}
	
	public static double task3 (double x, double y) {
	//вычислить значение выражения по формуле
	//(sinx+cosy)/(cosx-siny)*tgxy
		double z;
		z = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
		return z;
	}
	
	public static double task4 (double q) {
	//дано число вида nnn.ddd
	//вернуть число ddd.nnn
		int nnn = (int)Math.floor(q);			//получть целую часть
		int ddd = (int)Math.round((q-nnn)*1000);//получить дробную часть
		double z = ddd+(double)nnn/1000;		//поменять местами
		return z;
	}
	
	public static void task5 (int T) {
	//число Т - время в секундах
	//вернуть время в формате
	//ННч ММмин SSс
		int HH;		//часы
		int MM;		//минуты
		int SS;		//секунды
		HH = (int)Math.floor(T/3600);
		MM = (int)Math.floor((T-HH*3600)/60);
		SS = T-HH*3600-MM*60;
		System.out.print(HH+"ч "+MM+"мин "+SS+"с");
	}
	
	public static void task6 (double x, double y) {
	//по координатам x и y 
	//определить принадлежность точки области
		boolean inhere = false;	//принадлежит точка области
		if(((x>=-2 & x<=2)&(y>=0 & y<=4))			//проверка верхнего квадрата
				|((x>=-4 & x<=4)&(y>=-3 & y<=0))) {	//проверка нижнего прямоугольника
			inhere = true;
		}
		System.out.println(inhere);
	}
}
