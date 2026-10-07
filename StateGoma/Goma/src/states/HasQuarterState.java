package states;

import java.util.Random;

import machine.GumballMachine;

public class HasQuarterState implements State {
   GumballMachine gumballMachine;
   Random randomWinner = new Random(System.currentTimeMillis());  // Adicionando para premiar

   public HasQuarterState(GumballMachine gumballMachine) {
       this.gumballMachine = gumballMachine;
   }

   public void insertQuarter() {
       System.out.println("Você já inseriu uma moeda.");
   }

   public void ejectQuarter() {
       System.out.println("Moeda devolvida.");
       gumballMachine.setState(gumballMachine.getNoQuarterState());
   }

   public void turnCrank() {
       System.out.println("Você girou a manivela...");
          int winner = randomWinner.nextInt(10);   // Adicionando para premiar
       if (winner == 0 && gumballMachine.getCount() > 1) {   // Adicionando para premiar
           gumballMachine.setState(gumballMachine.getWinnerState());   // Adicionando para premiar
       } else {
           gumballMachine.setState(gumballMachine.getSoldState());
       }
       
   }

   public void dispense() {
       System.out.println("Nenhum chiclete liberado.");
   }

     

   
}
