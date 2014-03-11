package lab1;

import java.util.Scanner;

public class VectorT {
	private int[] x=new int[3];
	
	public VectorT(){
		for (int i = 0; i < 3; i++ )
			x[i]=0;
    }

	public VectorT(int[] a){
		for (int i = 0; i < 3; i++)
			x[i]=a[i];
		}
	
	public void printVectorT(){	
		System.out.print("[ ");
		for (int i = 0; i < 3; i++ ){
			System.out.print(x[i]+ " ");	
		}
		System.out.println("]");
	}
	
	public int[]  getX(){
		return x;
		}

	public void addVectorT(VectorT v1, VectorT v2){
		int[] b= new int[3];
		b=v1.getX();
		int[] c= new int[3];
		c=v2.getX();
	for (int i = 0; i < 3; i++ )
		x[i]=b[i]+c[i];
    }

	public void difVectorT(VectorT v1, VectorT v2){
	  int[] b= new int[3];
		b=v1.getX();
		int[] c= new int[3];
		c=v2.getX();
		for (int i = 0; i < 3; i++ )
			x[i]=b[i]-c[i];
	    }
	
	public void mulVectorT(VectorT v1, int r){
		int[] b= new int[3];
		b=v1.getX();
		for (int i = 0; i < 3; i++ )
			x[i]=b[i]*r;
		}
	
	public static int Skalar(VectorT v1, VectorT v2){
		int a=0;
		int[] b= new int[3];
		b=v1.getX();
		int[] c= new int[3];
		c=v2.getX();
		for (int i = 0; i < 3; i++ ){
		a+=b[i]*c[i];
		}
		return a;
		}
	
	public static boolean Ortogonal(VectorT v1, VectorT v2) {
		if ( Skalar( v1,  v2)==0)
			return true;
		else
			return false;
	}
	
	public static boolean Kollinearnost(VectorT v1, VectorT v2){
		int[] b= new int[3];
		b=v1.getX();
		int[] c= new int[3];
		c=v2.getX();
		int[] a=new int[3]; int[] d=new int[3];
		for (int i = 0; i < 3; i++ ){
			a[i]=b[i]/c[i];
			d[i]=b[i]%c[i];
		}
		if (a[0]==a[1] && a[1]==a[2] && d[0]==d[1] && d[1]==d[2])
			return true;
		else 
			return false;
	}
}