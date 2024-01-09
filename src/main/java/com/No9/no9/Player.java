package com.No9.no9;

public class Player {
    private int id;

    private String name;

    private int uniformNumber;

    private String position;

    public Player(int id, String name, int uniformNumber, String position) {
        this.id = id;
        this.name = name;
        this.uniformNumber = uniformNumber;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getUniformNumber() {
        return uniformNumber;
    }

    public String getPosition() {
        return position;
    }



    }
