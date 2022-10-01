package AdapterDesignPattern;

public class Client {
    public static void main(String[] args) {
        ISocketVoltageAdapter adapter = new SocketVoltageAdapterImpl();

        Voltage v3 = adapter.get3VoltFromSocket();
        System.out.println(v3);

        Voltage v120 = adapter.get120VoltFromSocket();
        System.out.println(v120);
    }
}
