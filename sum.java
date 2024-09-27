package org.mass;

public class sum {
	 public static void main(String[] args) {

	    	int sum = 0;

	    	int average = 0;

			int arr[] = {70,50,30,50};

			for(int i=0;i<arr.length;i++) {

				sum = sum+arr[i];
				
				// average
				

				average = sum/arr.length;

			}

			System.out.println("Sum: " + sum);

			System.out.println("Average: " + average);

			

		}

	}

	
	
