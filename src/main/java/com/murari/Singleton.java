package com.murari;

public class Singleton {
    private static Singleton instance;
    public synchronized static Singleton create() {
        if (instance == null) {
            System.out.println("Instance Not found. Creating...");
            instance = new Singleton();
        } else {
            System.out.println("Instance  found. ");
        }
        return instance;
    }

}
