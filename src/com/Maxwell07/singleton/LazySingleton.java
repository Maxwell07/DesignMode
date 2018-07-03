package com.Maxwell07.singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }


    public static LazySingleton getLazySingleton() {

        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
