import machine.GumballMachine;

public class Cliente {
    public static void main(String[] args) throws Exception {
        GumballMachine gumballMachine =  new GumballMachine(2);

            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();

            gumballMachine.insertQuarter();
            gumballMachine.ejectQuarter();
            gumballMachine.turnCrank();

            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();

            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            gumballMachine.ejectQuarter();

    }
}
