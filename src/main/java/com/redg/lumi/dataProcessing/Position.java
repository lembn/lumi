package com.redg.lumi.dataProcessing;

public class Position {
    int x;
    int y;
    int z;

    public Position(int givenX, int givenY, int givenZ){
        this.x = givenX;
        this.y = givenY;
        this.z = givenZ;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getZ(){
        return this.z;
    }

}
