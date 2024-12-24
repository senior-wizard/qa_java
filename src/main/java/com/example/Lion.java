package com.example;

import java.util.List;

public class Lion {

    private FelineInterface felineInterface;
    boolean hasMane;

    public Lion(FelineInterface felineInterface) {
         this.felineInterface = felineInterface;
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - Самец или Самка");
        }
    }


    public int getKittens() {
        return felineInterface.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return felineInterface.eatMeat();
    }
}
