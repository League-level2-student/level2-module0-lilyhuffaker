package arrays;

import java.util.Random;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String a[] = {"Happy","Birthday","to","No one",":)"};
		//2. print the third element in the array
		System.out.println(a[3]);
		//3. set the third element to a different value
		a[3]= "you";
		//4. print the third element again
		System.out.println(a[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i< a.length;i++) {
			System.out.println(a[i]);
		}
		//6. make an array of 50 integers
		int r[] = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random randy = new Random();
		int min = 106;
		int max = 0;
		for(int i = 0; i<r.length;i++) {
			r[i]=randy.nextInt(100)+5;
			
		}
		for(int o =0;o<r.length;o++) {
			if(min>r[o]) {
				min=r[o];
			}
		}
		for(int o =0;o<r.length;o++) {
			if(max<r[o]) {
				max=r[o];
			}
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println("The Min is: "+min);
		//9. print the largest number in the array.
		System.out.println(("The Max is: "+max));
		//10. sort the array from smallest to biggest(Bubble Sort)
		for (int i=0;i<r.length-1;i++) {
			for(int j=i+1;j<r.length;j++) {
				if(r[i] > r[j]) {
					int temp = r[i];
					r[i]=r[j];
					r[j]=temp;
				}
			}
		}
		for(int i=0;i<r.length;i++) {
		System.out.println(r[i]);
		}
	}
}