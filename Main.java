package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	    func2();
    }

    public static void func1()
    {
        Scanner input = new Scanner(System.in);
        String[] array = new String[5];
        for(int i = 0; i < 5; i++)
        {
            array[i] = input.nextLine();
        }

        Arrays.sort(array);
        String result = "";

        for(int j = 0; j < 5; j++)
        {
            result = result + array[j] + "      ";
            //System.out.println(array[j]);
        }

        System.out.println(result);

    }

    public static void func2()
    {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int result = 0;
        for(int i = 0; i < 10; i++)
        {
            numbers[i] = input.nextInt();
        }

        for(int i = 0; i < 10; i++)
        {
            result = result + numbers[i];
        }
        System.out.println(result);
    }
}
