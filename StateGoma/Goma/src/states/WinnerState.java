package states;

import machine.GumballMachine;

public class WinnerState implements State {
   GumballMachine gumballMachine;
   public WinnerState(GumballMachine gumballMachine) {
       this.gumballMachine = gumballMachine;
   }

   public void insertQuarter() {
       System.out.println("Por favor, espere, estamos entregando seus chicletes.");
   }

   public void ejectQuarter() {
       System.out.println("Desculpe, você já girou a manivela.");
   }

   public void turnCrank() {
       System.out.println("Girar novamente não vai te dar mais chicletes!");
   }

      public void dispense() {
       System.out.println("Você é um vencedor! Você recebe dois chicletes.");
       gumballMachine.releaseBall();
       if (gumballMachine.getCount() == 0) {
           gumballMachine.setState(gumballMachine.getSoldOutState());
       } else {
           gumballMachine.releaseBall();
           if (gumballMachine.getCount() > 0) {
               gumballMachine.setState(gumballMachine.getNoQuarterState());
           } else {
               System.out.println("Ops, acabou o chiclete!");
               gumballMachine.setState(gumballMachine.getSoldOutState());
           }
       }
   }
}


