package com.tts.ControlFlow;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        char character = 'c';
        char q = 'q';

        do {
            System.out.println("Enter another char command or q to quit");
            character = user.next().charAt(0);
        } while (character != 'q' && character != 'Q'); {
        System.out.println("Quit command entered");
        }
    }
}
