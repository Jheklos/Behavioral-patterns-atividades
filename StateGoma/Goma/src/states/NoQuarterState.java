package states;


import machine.GumballMachine;

public class NoQuarterState implements State {
   GumballMachine gumballMachine;
   


   public NoQuarterState(GumballMachine gumballMachine) {
       this.gumballMachine = gumballMachine;
   }

   public void insertQuarter() {
       System.out.println("Você inseriu uma moeda.");
       gumballMachine.setState(gumballMachine.getHasQuarterState()); //Muda o estado da máquina

   }

   public void ejectQuarter() {
       System.out.println("Você ainda não inseriu uma moeda.");
   }

   public void turnCrank() {
       System.out.println("Você girou, mas não tem uma moeda.");
   }

   public void dispense() {
       System.out.println("Você precisa pagar primeiro.");
   }



}

