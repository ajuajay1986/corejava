package cogtest;

import java.util.ArrayList;
import java.util.List;

public class SquareRootAverage {
	
	public static void main(String[] args)
    {
		double squareRoot = 0;
		double[] number = { 32, 128, 64, 16 };
		List<Double> list = new ArrayList<Double>();
		
		// Displaying the average of square root
		for (int i = 0; i < number.length; i++) {
			squareRoot = Math.sqrt(number[i]);
			list.add(squareRoot);
			System.out.println("Square Root of "+ number[i]+" : " + squareRoot);
		}
		
		// Displaying the average of list
		double sum = 0;
		for (double i : list) {
			sum += i;
		}
		double average = sum / list.size();
		System.out.println("Average = " + average);
        
    }
}
