package com.ferra13671.rononononoazoro;

import java.util.Random;

public class GenerateRandomChar {
    private static final Random random = new Random();

    protected static char oldChar = 'o';

    public static char getNextChar() {
        int number = random.nextInt();
        int type = number & 3;

        while (type == 0) {
            number = random.nextInt();
            type = number & 3;
        }

        switch (type) {
            case 1:
                oldChar = 'n';
                return 'n';
            case 2:
                oldChar = 'o';
                return 'o';
            case 3:
            default:
                oldChar = 'a';
                return 'a';
        }
    }
}
