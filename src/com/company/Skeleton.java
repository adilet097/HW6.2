package com.company;

public class Skeleton extends Boss{
    private int numberOfImpact;

    public int getNumberOfImpact() {
        return numberOfImpact;

    }

    public void setNumberOfImpact(int numberOfImpact) {
        this.numberOfImpact = numberOfImpact;

    }

    public String printlnInfo() {
        return super.info() + "Number of Impact: " + this.numberOfImpact;
    }
}
