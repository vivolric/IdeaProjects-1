package com.test;

import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args) {

        String [] studentsNames = {"Ali", "Veli", "Deli", "Ibo", "Can"};

        studentsNames[0] = "Ridvan";

        System.out.println(studentsNames[0]);

//      init size only giving value;

        int []array =new int[4];

        System.out.println(array.length);
        System.out.println(array[2]); // 0

        array[0] = 100;
        array[1] = 200;
        array[2] = 300;
        array[3] = 400;

//        Scanner scan = new Scanner(System.in);
//
//        int []  Inputs = new int [5];
//
//        for(int i =0; i < Inputs.length; i++) {
//            System.out.println("Enter a number: ");
//            Inputs [i] = scan.nextInt();
//        }
//
//        for(int i =0; i < Inputs.length; i++) {
//            System.out.print(Inputs [i] + " ");
//
//        }


//          min from array

        int [] myArray = {1,2,3,4,5,6,7,8,9};

        int min=9999999;
        for(int i =0; i < myArray.length; i++) {

            if(myArray[i] < min) {
                min = myArray[i];
            }
        }
        System.out.println("min is : "+min);

        int secondmin=9999999;
        for(int j =0; j < myArray.length; j++) {

            if(myArray[j] < secondmin && myArray[j] > min ) {
                secondmin = myArray[j];
            }
        }
        System.out.println("secondmin is : "+secondmin);





    }
}
