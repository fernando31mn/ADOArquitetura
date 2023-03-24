/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author fernando.mnascimento
 */
public class CenarioGame extends Thread{
    
    @Override
    public void run(){
      Singleton s1=Singleton.getInstance();
      System.out.println(s1);
    }

    public static void main(String[] args) {
        CenarioGame t1=new CenarioGame();
        CenarioGame t2=new CenarioGame();
        CenarioGame t3=new CenarioGame();
        CenarioGame t4=new CenarioGame();
        CenarioGame t5=new CenarioGame();
        CenarioGame t6=new CenarioGame();
        CenarioGame t7=new CenarioGame();
        CenarioGame t8=new CenarioGame();
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }
    
    
}



