package org.example;


public class PlayerCharacter {
    static int y = 0;
    static int x = 0;

    public static void main(String[] args) {

    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static void move(String direction) {
        if (direction.equalsIgnoreCase("w")) {
            y += 1;
        }
        if (direction.equalsIgnoreCase("s")) {
            y -= 1;
        }
        if (direction.equalsIgnoreCase("a")) {
            x -= 1;
        }
        if (direction.equalsIgnoreCase("d")) {
            x += 1;
        }
    }
}

