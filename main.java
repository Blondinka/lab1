package lab1;
import java.util.*;
public class main {
	public static void main(String[] args)
	{	
		System.out.println("������� ���������� �������");
		int[] c= Zapolnenie();
		int[] v=Zapolnenie();
		
		VectorT v1= new VectorT(c);
		VectorT v2 = new VectorT(v);
		VectorT v3 = new VectorT();
		v1.printVectorT();
		v2.printVectorT();
		System.out.print("����� ��������:");
		v3.addVectorT(v1,v2);
		v3.printVectorT();
		System.out.print("�������� ��������:");
		v3.difVectorT(v1,v2);
		v3.printVectorT();
		System.out.print("��������� ������� �� �����:");
		v3.mulVectorT(v1,5);
		v3.printVectorT();
		System.out.println("��������� ������������ ��������: " + VectorT.Skalar(v1,v2));
		System.out.println("��������������� ��������: " +VectorT.Ortogonal(v1,v2));
		System.out.println("�������������� ��������: " +VectorT.Kollinearnost(v1,v2));
	}

	private static int[] Zapolnenie() {
		Scanner scan=new Scanner(System.in);
		int[] arr=new int [3];
		for (int i = 0; i < 3; i++){
			System.out.print("a[" +i+ "]=");
			arr[i]=scan.nextInt();	
		}
		return arr;
	}
}
