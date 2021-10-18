package randomNumber;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;
import java.util.*;
public class random {

	public static void main(String[] args) {

		Random rn = new Random();

		TreeSet<Integer> set = new TreeSet<Integer>();
		int ans = rn.nextInt(999 - 100 + 1) + 100;

		while (set.size() != 500) {
			set.add(rn.nextInt(999 - 100 + 1) + 100);
		}
		System.out.println("Total Random Number : " + set.size());
		System.out.println("These Are the 500 random numbers :  " + set);

		Integer[] intArray = new Integer[set.size()];
		Integer[] Array = set.toArray(intArray);
		
		System.out.println("The smallest number is " + Collections.min(set));
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Type Which Smallest number you want to see?");
		System.out.println("keep on mind :Example: If you want to see 5th smallest number then type 4 because index number Start from Zero");
		int numberYouWantToSee = scr.nextInt();
		
		System.out.println(Array[numberYouWantToSee]);

	}

}
