import java.util.LinkedList;

class Tasks {
	static int multSum(int array[], int div) {
		int result = 0;
		for(int i : array) {
			if(i % div == 0) {
				result += i;
			}
		}
		return result;
	}
	
	static int numOfReplace(int array[], int z) {
		int result = 0;
		for(int i : array) {
			result += z < i ? 1 : 0;
		}
		return result;
	}
	
	static void replaceGreter(int array[], int z) {
		for(int i = 0; i < array.length; i++) {
			array[i] = z < array[i] ? z : array[i];
		}
	}
	
	static int numOfNegative(int array[]) {
		int result = 0;
		for(int i : array) {
			result += i < 0 ? 1 : 0;
		}
		return result;
	}
	
	static int numOfPositive(int array[]) {
		int result = 0;
		for(int i : array) {
			result += i > 0 ? 1 : 0;
		}
		return result;
	}
	
	static int numOfZeros(int array[]) {
		int result = 0;
		for(int i : array) {
			result += i == 0 ? 1 : 0;
		}
		return result;
	}
	
	static void replaceMaxMin(int array[]) {
		int max = 0;	//индекс максимальное число массива
		int min = 0;	//индекс минимальное число массива
		for(int i = 0; i < array.length; i++) {
			if(array[max] < array[i]) {
				max = i;	//получить индекс максимального элемента
			}
			if(array[min] > array[i]) {
				min = i;	//получить индекс минимально элемента
			}
		}
		int help = array[max];	//вспомогательная переменная
		array[max] = array[min];	//произвести замену
		array[min] = help;
		System.out.println("Готово.");	//сообщить о замене
	}
	
	static void printAboveI(int array[], int i) {
		for(int j : array) {
			if(j > i) {
				System.out.print(j+"; ");
			}
		}
		System.out.println();
	}
	
	static int sumOfPrimNumber(int array[]) {
		int result = 0;
		for(int i = 0; i < array.length; i++) {
			if(Calc.isPrime(i)) {	//если порядковый номер - простое число
				result += array[i];	//добавить в сумму
			}
		}
		return result;
	}
	
	static void omitMin(int array[]) {
//		Integer minInArray = array[0];
//		for(int i : array) {
//			minInArray = Math.min(minInArray, i);	//найти минимальный элемент
//		}
//		LinkedList<Integer> result = new LinkedList();
//		for(int i : array) {
//			if(!minInArray.equals(i)) {
//				result.add(i);
//			}
//		}
//		result.toArray(array);
		
	}
}
