package AdapterDesignPattern;

//Adaptee class
public class ElectricSocket {
    public Voltage fetchElectricVoltage()
    {
        return new Voltage(240);
    }
}
