package org.example;

public class PlayerCharacter {
    private int x;
    private int y;

    public PlayerCharacter() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(char direction) {
        if (direction == 'W') {
            y++;
        } else if (direction == 'S') {
            y--;
        } else if (direction == 'D') {
            x++;
        } else if (direction == 'A') {
            x--;
        }
    }
}

