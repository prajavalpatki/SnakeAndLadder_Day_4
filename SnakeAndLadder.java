package com.bridgelabz;

public class SnakeAndLadder {

    public static void main(String[] args) {
        int position = 0;

        int randomCheck = (int) Math.floor (Math.random() * 10) % 6;

        position = position + randomCheck;

        System.out.println("position = " + position);
    }
}
