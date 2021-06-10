package com.tts.ControlFlow;

public class printShirtSize {

    //SWITCH EXAMPLE

    public static void main(String[] args) {
    String msg;

    char shirt = 'S';

    switch(shirt){
        case 's':
        case 'S':
            msg = "Shirt is small";
            break;
        case 'm':
        case 'M':
            msg = "Shirt is medium";
            break;
        case 'l':
        case 'L':
            msg = "Shirt is large";
            break;
        case 'x':
        case 'X':
            msg = "Shirt is extra large";
            break;
        default:
            msg = "We don't carry that size";
            break;
    }

        System.out.println(msg);
    }
}
