import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class Perfoming {
	public static void main(String[] args) {
		Condition condition = new Condition();
		int[] array = IntStream.rangeClosed(0, 100).toArray();	//��������� ������
		
		condition.task1();	//����� ������� 1 ������� � �������
		int k = 5;
		int multSum = Tasks.multSum(array, k);	//����� ����� ��-���, ������� 5
		System.out.println("K: "+k+"; sum: "+multSum);	//������� ���������
		
		condition.task2();	//����� ������� 2 �������
		int z = 90;
		int replaceNum = Tasks.numOfReplace(array, z);	//��������� ���������� �����
		Tasks.replaceGreter(array, z);	//��������� ������
		System.out.println("z: "+z+"; �����: "+replaceNum);	//������� ���������
		
		condition.task3();//����� ������� 3 �������
		int negatives = Tasks.numOfNegative(array);	//���-�� �����. � �������
		int positives = Tasks.numOfPositive(array);	//���-�� �����. � �������
		int zeros = Tasks.numOfZeros(array);	//���-�� ����� � �������
		System.out.println("�����: "+negatives+
				"; �����: "+zeros+
				"; �����: "+positives);
		
		condition.task4();	//������� ������� 4 �������
		array = IntStream.rangeClosed(0, 100).toArray();	//������������� ������
		Tasks.replaceMaxMin(array);	//�������� ������� ����������� � ���������� ��������
		
		condition.task5(); //������� ������� 5 ������� 
		int i = 86;
		Tasks.printAboveI(array, i);//����������� �����, ������� i
		
		condition.task6();	//������� ������� 6 ������� 
		System.out.println(Tasks.sumOfPrimNumber(array));	//������� ����������� �����
		
		condition.task7();	//������� ������� 7 �������
		
		condition.task8();	//������� ������� 8 �������
		List<Integer> orderOfNumbers = new LinkedList<Integer>(Arrays.asList(3, 8, 1, 14, 56, 42));
		System.out.println(orderOfNumbers);
		//Tasks.omitMin(orderOfNumbers);
	}
}
