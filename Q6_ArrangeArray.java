package assignment1;

import java.util.Scanner;

public class Q6_ArrangeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int n = sc.nextInt() ; 
		
		System.out.println("Enter " + n + " numbers: ");
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			
			arr[i] = sc.nextInt() ;
		}
		
		int ans[] = arrange(arr,n);
		for(int c : ans) {
			System.out.print(c+" ");
		}

	}
	
	public static int[] arrange(int arr[], int n) {
		 int l = 0;
		 int h = n-1;
		 
		 while(l<=h) {
			 while(arr[l]%2!=0) {
				 l++;
			 }
			 while(arr[h]%2 == 0) {
				 h--;
			 }
			 
			 if(l<h) {
				 int temp = arr[l];
				 arr[l] = arr[h];
				 arr[h] = temp;
					 
				 l++;
				 h--;
				 
			 }
		 }
		 
		 sort(arr,0,h);
		 sort(arr,h+1,n-1);
		 
		 return arr;
	}
	
	public static void sort(int arr[],int start,int end) {
		
		for(int i = start ; i <= end ; i++) {
			for(int j = start ; j <= end ; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				}
			}
			
		}
	}
}
