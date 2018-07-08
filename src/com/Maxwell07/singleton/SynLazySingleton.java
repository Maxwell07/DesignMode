package com.Maxwell07.singleton;

public class SynLazySingleton {
    private SynLazySingleton synLazySingleton;

    private SynLazySingleton(){
    }

    public SynLazySingleton getInstance(){
        if (synLazySingleton == null) {
            synchronized (this){
                if (synLazySingleton == null) {
                    synLazySingleton = new SynLazySingleton();
                }
            }
        }
        return synLazySingleton;
    }

}
