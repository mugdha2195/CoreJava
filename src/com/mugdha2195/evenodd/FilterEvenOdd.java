package com.mugdha2195.evenodd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FilterEvenOdd {
	
	private boolean isEven(int number) {
		return number % 2 == 0;
	}

	private int[] randomIntegers(int length) {
		if (length <= 0) {
			return new int[] {};
		}

		Random random = new Random(System.currentTimeMillis());
		int[] array = new int[length];

		for (int i = 0; i < length; i++) {
			array[i] = random.nextInt(1000);
		}

		return array;
	}

	@SuppressWarnings("unchecked")
	private ArrayList<ArrayList<Integer>>[] filterEvenOdd(int[] numbers) {
		if (numbers == null) {
			return new ArrayList[] {};
		}

		ArrayList<Integer> evenNumbers = new ArrayList<>();
		ArrayList<Integer> oddNumbers = new ArrayList<>();

		for (Integer integer : numbers) {
			if (isEven(integer)) {
				evenNumbers.add(integer);
			} else {
				oddNumbers.add(integer);
			}
		}

		return new ArrayList[] { evenNumbers, oddNumbers };
	}

	public static void main(String[] args) {
		FilterEvenOdd filtering = new FilterEvenOdd();

		int[] integers = filtering.randomIntegers(10);
		System.out.println(Arrays.toString(filtering.filterEvenOdd(integers)));

		int[] numbers = filtering.randomIntegers(15);
		System.out.println(Arrays.toString(filtering.filterEvenOdd(numbers)));

//		int[] input = filtering.randomIntegers(100);
//		System.out.println(Arrays.toString(filtering.filterEvenOdd(input)));
	}
}
