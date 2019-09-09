package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, "Cp866"));


        boolean bool = true;

        while (bool) {

            System.out.println("Please choose task to check - 1,2,3");

            int taskNumber = Integer.parseInt(reader.readLine());

            if (taskNumber == 1) {

                System.out.println("Please, enter a number");

                int number = Integer.parseInt(reader.readLine());
                if (number > 7)
                    System.out.println("Привет");
            }

            if (taskNumber == 2) {
                System.out.println("Please, enter a name");
                String name = reader.readLine();
                if (name.equals("Вячеслав"))
                    System.out.println("Привет, Вячеслав");
                else
                    System.out.println("Нет такого имени");
            }

            if (taskNumber == 3) {
                System.out.println("Please, enter array of integers with elements separated by whitespace");
                String[] strArray = reader.readLine().split(" ");
                int[] intArray = new int[strArray.length];

                for (int i = 0; i < intArray.length; i++) {
                    intArray[i] = Integer.parseInt(strArray[i]);
                    if ((intArray[i] % 3 == 0) && (intArray[i] != 0))
                        System.out.print(intArray[i] + " ");
                }
                System.out.println();
            }

            System.out.println("Type Yes if you would like to try again");
            String response = reader.readLine().toLowerCase();


            if (!response.equals("yes"))
                bool = false;
        }

    }
}
