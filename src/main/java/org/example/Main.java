package org.example;

public class Main {
    public static void main(String[] args){

        //Sucktion sucktion = new Sucktion();

        for (int i = 0; i <10000;i++) {
            Multithreading mt1st = new Multithreading(i);
            Thread newThread = new Thread(mt1st);
            newThread.start();
        }

       /*Thread thread = new Thread(sucktion::printSucktion);
        Thread thread1 = new Thread(sucktion::printSucktion);

        thread.start();
        thread1.start();
        */


    }

    public static class Sucktion{

        int i = 1;
        public synchronized void printSucktion(){
            i*=2;
            System.out.println("sucktion" + i);
        }
    }
}