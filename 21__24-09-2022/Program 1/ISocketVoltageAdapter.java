package AdapterDesignPattern;

public interface ISocketVoltageAdapter {
    /*
    This adapter is responsible for granting voltage to any device
    * */

    public Voltage get120VoltFromSocket();
    public Voltage get240VoltFromSocket();
    public Voltage get60VoltFromSocket();
    public Voltage get3VoltFromSocket();
}
