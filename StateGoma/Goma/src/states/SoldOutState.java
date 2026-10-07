package states;

import machine.GumballMachine;

public class SoldOutState implements State {
   GumballMachine gumballMachine;

   public SoldOutState(GumballMachine gumballMachine) {
       this.gumballMachine = gumballMachine;
   }

   public void insertQuarter() {
       System.out.println("Não pode inserir uma moeda, a máquina está sem chicletes.");
   }

   public void ejectQuarter() {
       System.out.println("Você não inseriu uma moeda.");
   }

   public void turnCrank() {
       System.out.println("Você girou, mas não há chicletes.");
   }

   public void dispense() {
       System.out.println("Sem chiclete para dispensar.");
   }
}
