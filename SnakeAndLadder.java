package com.bridgelabz;

public class SnakeAndLadder {

    public static void main(String[] args) {
        int position = 0;
        int play = 1;
        int count = 0;

        for(int i = 1; position <= 100; i++ ) {

            int playornot = (int) Math.floor(Math.random() * 10) % 2;

            if (playornot == play) {

                int randomCheck = (int) Math.floor(Math.random() * 10) % 6;

                position = position + randomCheck;
            }
            count++;
        }

        System.out.println("To reach the position " + position + " the count is = " + count);
    }
}
