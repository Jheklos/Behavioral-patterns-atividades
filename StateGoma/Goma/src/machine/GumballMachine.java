package machine;
import states.HasQuarterState;
import states.NoQuarterState;
import states.SoldOutState;
import states.SoldState;
import states.State;
import states.WinnerState;

public class GumballMachine {

   State state;  //Qual é o estado atual da máquina?
   int count = 0;

   State winnerState; // Adicionando para premiar (vencedor)
   State soldOutState; //sem chiclete
   State noQuarterState; //A máquina atualmente está no estado sem moeda.
   State hasQuarterState; // com moeda
   State soldState; // vendendo chiclete



   public GumballMachine(int numberOfGumballs) {
       soldOutState = new SoldOutState(this);
       noQuarterState = new NoQuarterState(this);
       hasQuarterState = new HasQuarterState(this);
       soldState = new SoldState(this);
       winnerState = new WinnerState(this); // Adicionando para premiar


       this.count = numberOfGumballs;
       if (numberOfGumballs > 0) {
           state = noQuarterState;
       } else {
           state = soldOutState;
       }
   }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

       public void releaseBall() {
       System.out.println("Uma bola de chiclete está saindo...");
       if (count != 0) {
           count = count - 1;
       }
   }
   public int getCount() {
       return count;
   }

   public State getSoldOutState() {
       return soldOutState;
   }
   public State getNoQuarterState() {
       return noQuarterState;
   }
   public State getHasQuarterState() {
       return hasQuarterState;
   }
   public State getSoldState() {
       return soldState;
   }

   public State getWinnerState() {
       return winnerState;
   }

}

