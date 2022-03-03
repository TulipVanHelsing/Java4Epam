//import java.util.Iterator;
//import java.util.LinkedList;
import java.util.Arrays;

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
	
	static int[] omitMin2Try(int array[]) {
		int minNumber = array[0];
		int amountOfMinNumber = 0;
		for(int i : array) {
			if(i < minNumber) {	//����� ����������� �����
				minNumber = i;
			}
		}
		for(int i : array) {
			if(minNumber == i) {	//���������, ������� ����������� �����
				amountOfMinNumber++;
			}
		}
		//������� ����� ������, ��� ����������� ��������
		int[] newArray = new int[array.length-amountOfMinNumber];
		int iterator = 0;
		for(int i : array) {
			if(i != minNumber) {
				newArray[iterator] = i;
				iterator++;
			}
		}
		return newArray;
	}
	
	static int minFrequent(int array[]) {
		Arrays.sort(array);
		for(int i = 0; i < array.length - 1; i++) {
			if(array[i] == array[i+1]) {
				return array[i];
			}
		}
		return 0;
	}
	
	static int[] delEvery2(int array[]) {
		for(int i = 0; i < array.length; i++) {
			if(i % 2 == 1) {
				array[i] = 0;
			}
		}
		return array;
	}
}
