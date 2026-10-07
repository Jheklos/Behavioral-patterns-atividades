package states;
public interface State {
   public void insertQuarter();
   public void ejectQuarter();
   public void turnCrank(); //girar a manivela
   public void dispense();
}
