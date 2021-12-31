package com.test.singleton;

class SingletonEager{
    private static SingletonEager singletonEager = new SingletonEager();
    private SingletonEager(){

    }
    public static SingletonEager getInstance(){
        return singletonEager;
    }
}

class SingletonLazy{
    private static SingletonLazy singletonLazy;
    private SingletonLazy(){
    }
    public static SingletonLazy getInstance(){
        if(singletonLazy == null){
            singletonLazy = new SingletonLazy();
        }
        return  singletonLazy;
    }
}
class SingletonSynchronizedLazy{
    private static SingletonSynchronizedLazy singletonLazy;
    private SingletonSynchronizedLazy(){
    }
    public static synchronized SingletonSynchronizedLazy getInstance(){
        if(singletonLazy == null){
            singletonLazy = new SingletonSynchronizedLazy();
        }
        return  singletonLazy;
    }
}

class SingletonSynchronizedBlock{
    private static SingletonSynchronizedBlock singletonSynchronizedBlock;
    private SingletonSynchronizedBlock(){

    }
    public static SingletonSynchronizedBlock getInstance(){
        if(singletonSynchronizedBlock == null){
            synchronized (SingletonSynchronizedBlock.class){
                if(singletonSynchronizedBlock == null){
                    singletonSynchronizedBlock = new SingletonSynchronizedBlock();
                }
            }
        }
        return singletonSynchronizedBlock;
    }


}

public class SingletonTest {

    public static void main(String[] args) {
        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);

        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println(singletonEager2);

        //both the time we are getting same hashcode, means same object.




    }
}
