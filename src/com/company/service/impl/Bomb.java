package com.company.service.impl;

public class Bomb {
    private int x;
    private int y;
    private String name;
    private boolean status;

    public Bomb() {
    }

    public Bomb(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
