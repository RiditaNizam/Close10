package com.company;

/**
 * Created by ridita on 3/26/17.
 */
public class Close10 {
    public int close10(int a, int b) {

        if (Math.abs(10 - a) < Math.abs(10 - b)) {
            return a;
        } else if (Math.abs(10 - a) > Math.abs(10 - b)) {
            return b;
        } else {
            return 0;
        }
    }
}
