package com.mycompany.classroomwork_lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Classroomwork_Lab03 {
    
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {5, 2, 9, 1, 3, 4, 8, 6, 7};
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        System.out.print("Enter the number you want to search: ");
        int x = input.nextInt();
        int index = binarySearch(numbers, x);
        if (index == -1) {
            System.out.println("Binary search: Number not found");
        } else {
            System.out.println("Binary search: Number found at index " + index);
        }
        index = linearSearch(numbers, x);
        if (index == -1) {
            System.out.println("Linear search: Number not found");
        } else {
            System.out.println("Linear search: Number found at index " + index);
        }
    }

    private static int binarySearch(int[] numbers, int x) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers[mid] == x) {
                return mid;
            } else if (numbers[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private static int linearSearch(int[] numbers, int x) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                return i;
            }
        }
        return -1;
    }
}