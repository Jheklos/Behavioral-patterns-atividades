package states;

import machine.GumballMachine;

public class SoldState implements State {
   GumballMachine gumballMachine;
   public SoldState(GumballMachine gumballMachine) {
       this.gumballMachine = gumballMachine;
   }
   public void insertQuarter() {
       System.out.println("Por favor, espere, estamos entregando seu chiclete.");
   }
   public void ejectQuarter() {
       System.out.println("Desculpe, você já girou a manivela.");
   }
   public void turnCrank() {
       System.out.println("Girar duas vezes não vai te dar outro chiclete!");
   }
   public void dispense() {
       gumballMachine.releaseBall();
       if (gumballMachine.getCount() > 0) {
           gumballMachine.setState(gumballMachine.getNoQuarterState());
       } else { // para avisar quando for a última goma
           System.out.println("Ops, acabou o chiclete!");
           gumballMachine.setState(gumballMachine.getSoldOutState());
       }
   }
}
