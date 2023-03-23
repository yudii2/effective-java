package com.study.effectivejava.item01;

public class SingletonFixel {

    /**
     *  eagerly loads the singleton
     */
    private static SingletonFixel instance = new SingletonFixel();

    private SingletonFixel() {
        // private to prevent anyone else from instantiating
    }

    public static SingletonFixel getInstance() { // 멀티쓰레드 환경에서는 인스턴스가 중복될 수 있다.
        return instance;
    }

    /**
     *  Lazy initialization
     */
    public static class LazySingleton {

        private static volatile LazySingleton instance = null;

        // TODO volatile

        private LazySingleton() {}

        // 쓰레드 safe 하기 위해, double-checked locking 기법의 Lazy initialization 방식을 활용하자.
        public static LazySingleton getInstance() {
            if (instance == null) {
                synchronized(LazySingleton.class) {
                    if (instance == null) {
                        instance = new LazySingleton();
                    }
                }
            }

            return instance;
        }
    }

    public static void main(String[] args) {
        LazySingleton instance1 = LazySingleton.getInstance();
    }
}
