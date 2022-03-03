import java.util.Arrays;
import java.util.stream.IntStream;
//import java.util.Arrays;
//import java.util.List;
//import java.util.LinkedList;

public class Perfoming {
	public static void main(String[] args) {
		Condition condition = new Condition();
		int[] array = IntStream.rangeClosed(0, 100).toArray();	//заполнить массив
		
		condition.task1();	//вывод условия 1 задания в консоль
		int k = 5;
		int multSum = Tasks.multSum(array, k);	//найти сумму эл-тов, кратных 5
		System.out.println("K: "+k+"; sum: "+multSum);	//вывести результат
		
		condition.task2();	//вывод условия 2 задания
		int z = 90;
		int replaceNum = Tasks.numOfReplace(array, z);	//посчитать количество замен
		Tasks.replaceGreter(array, z);	//совершить замены
		System.out.println("z: "+z+"; замен: "+replaceNum);	//вывести результат
		
		condition.task3();//вывод условия 3 задания
		int negatives = Tasks.numOfNegative(array);	//кол-во отриц. в массиве
		int positives = Tasks.numOfPositive(array);	//кол-во полож. в массиве
		int zeros = Tasks.numOfZeros(array);	//кол-во нулей в массвие
		System.out.println("Отриц: "+negatives+
				"; нулей: "+zeros+
				"; полож: "+positives);
		
		condition.task4();	//вывести условие 4 задания
		array = IntStream.rangeClosed(0, 100).toArray();	//перезаполнить массив
		Tasks.replaceMaxMin(array);	//поменять местами максимально и минимально значения
		
		condition.task5(); //вывести условие 5 задания 
		int i = 86;
		Tasks.printAboveI(array, i);//распечатать числа, большие i
		
		condition.task6();	//вывести условие 6 заданяи 
		System.out.println(Tasks.sumOfPrimNumber(array));	//вывести необходимую сумму
		
		condition.task7();	//вывести условие 7 заданяи
		
		condition.task8();	//вывести условие 8 заданяи
		int[] orderOfNumbers = {14, 3, 39, 32, 1, 3, 15, 34, 1};	//задать последовательность чисел
		System.out.println(Arrays.toString(orderOfNumbers));
		System.out.println(Arrays.toString(Tasks.omitMin2Try(orderOfNumbers)));
		
		condition.task9();	//вывести условие 9 заданяи
		System.out.println(Arrays.toString(orderOfNumbers));
		System.out.println(Tasks.minFrequent(orderOfNumbers));
		
		condition.task10();	//вывести условие 10 заданяи
		int[] newArray = IntStream.rangeClosed(0, 20).toArray();
		System.out.println(Arrays.toString(newArray));
		System.out.println(Arrays.toString(Tasks.delEvery2(newArray)));

	}
}
