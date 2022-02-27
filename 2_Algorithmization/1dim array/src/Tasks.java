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
		int max = 0;	//������ ������������ ����� �������
		int min = 0;	//������ ����������� ����� �������
		for(int i = 0; i < array.length; i++) {
			if(array[max] < array[i]) {
				max = i;	//�������� ������ ������������� ��������
			}
			if(array[min] > array[i]) {
				min = i;	//�������� ������ ���������� ��������
			}
		}
		int help = array[max];	//��������������� ����������
		array[max] = array[min];	//���������� ������
		array[min] = help;
		System.out.println("������.");	//�������� � ������
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
			if(Calc.isPrime(i)) {	//���� ���������� ����� - ������� �����
				result += array[i];	//�������� � �����
			}
		}
		return result;
	}
	
	static void omitMin(int array[]) {
//		Integer minInArray = array[0];
//		for(int i : array) {
//			minInArray = Math.min(minInArray, i);	//����� ����������� �������
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
