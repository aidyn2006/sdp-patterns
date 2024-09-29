package org.example.zpractice.singelton;

public class Singelton {

    private static Singelton singelton;
    private Singelton(){
    }

    public static Singelton createobject(){
        if(singelton==null){
            return singelton=new Singelton();
        }
        return singelton;
    }

    public void  doSomthing(){
        System.out.println("Я синглетон созадюсь только в одном классе не возможно сощдать извне и можно получить ддоступ от всех глобвалных точек");
    }

}
