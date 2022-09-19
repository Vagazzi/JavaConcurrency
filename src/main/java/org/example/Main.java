package org.example;

import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args){

        Sucktion sucktion = new Sucktion();

        Thread thread = new Thread(sucktion::printSucktion);
        Thread thread1 = new Thread(sucktion::printSucktion);

        thread.start();
        thread1.start();

    }

    public static class Sucktion{

        int i = 1;
        public synchronized void printSucktion(){
            i*=2;
            System.out.println("sucktion" + i);
        }
    }
}