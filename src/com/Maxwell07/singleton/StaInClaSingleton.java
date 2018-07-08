package com.Maxwell07.singleton;

public class StaInClaSingleton {
    private static class Holder{
        private static StaInClaSingleton staInClaSingleton = new StaInClaSingleton();
    }

    private StaInClaSingleton(){
    }

    public StaInClaSingleton getInstance(){
        return Holder.staInClaSingleton;
    }
}
