/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author fernando.mnascimento
 */
public class Singleton {
    private Singleton(){
    }
    
    private static class LazyHolder{
        static final Singleton sin = new Singleton();
    }
        
    public static Singleton getInstance(){        
      return LazyHolder.sin;
    }

}

