//SOLUTIONS

//Hollow Square Pattern

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || j==0 || i== n-1 || j== n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

//Floyd’s Triangle

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		int k=1;
		for(int i=0; i<n; i++) {
			int j=i;
			while(j>0) {

				System.out.print(k+" ");
				j--;
				k++;
			}
			System.out.print(" ");
			System.out.println();
		}
	}
}

