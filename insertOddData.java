package com.tts.ControlFlow;

public class insertOddData {
        //find and return the sum of the array
        public int getArraySum ( int[] arr){
            //initialize to a valid default return value
            int sum = 0;

            // array must have values to sum!
            if (arr.length > 0) {
                for (int n : arr) {
                    sum += n;
                    //+= operator is the same thing as x + y
                }
            }
            return sum;
        }

        public void insertOddData ( int data){
            //equal to 0 check
            if (data == 0) {
                return;
            }

            //Negative check
            if (data < 0) {
                return;
            }

            //check to see if data is even or odd
            if (data % 2 == 0) {
                return;
            }

            System.out.println("Odd Data Stored");
            return;
        }


//    public static void main(String[] args) {
//        System.out.println("Hey!!");
//
//        boolean flag = true;
//        while(flag){
//            System.out.println("Howdy!!");
//        }
//    }


}