package com.tts.ControlFlow;

public class Arrays {
    public static void main(String[] args) {

        int[] simpleArray = {1,2,3,4,5,6,7,8,9,10};

        //NORMAL FOR LOOP ARRAY
        for (int i=0; i< simpleArray.length; i++){
            System.out.println("Normal for value: " + simpleArray[i]);
        }

        //ENHANCED FOR LOOP ARRAY
        for(int item : simpleArray) {
            System.out.println("Enhanced for: " + item);
        }
    }
}
