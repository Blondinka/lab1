package lab1;
import java.util.*;
public class main {
	public static void main(String[] args)
	{	
		System.out.println("Введите координаты вектора");
		int[] c= Zapolnenie();
		int[] v=Zapolnenie();
		
		VectorT v1= new VectorT(c);
		VectorT v2 = new VectorT(v);
		VectorT v3 = new VectorT();
		v1.printVectorT();
		v2.printVectorT();
		System.out.print("Сумма вектороы:");
		v3.addVectorT(v1,v2);
		v3.printVectorT();
		System.out.print("Разность векторов:");
		v3.difVectorT(v1,v2);
		v3.printVectorT();
		System.out.print("Умножение вектора на число:");
		v3.mulVectorT(v1,5);
		v3.printVectorT();
		System.out.println("Скалярное произведение векторов: " + VectorT.Skalar(v1,v2));
		System.out.println("Ортогональность векторов: " +VectorT.Ortogonal(v1,v2));
		System.out.println("Коллинеарность векторов: " +VectorT.Kollinearnost(v1,v2));
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
