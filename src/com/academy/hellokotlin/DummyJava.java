package com.academy.hellokotlin;

public class DummyJava {

    public void charArrayJavaMethod(char[] chars)
    {
    }

    private void setVolume(int amount) {
        final int max = 100;
        final double numerator = max - amount > 0 ? Math.log(max - amount) : 0;
        final float volume = (float) (1 - (numerator / Math.log(max)));

    }
}
