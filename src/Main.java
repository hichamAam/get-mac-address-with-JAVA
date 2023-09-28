import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String macAddress = AdressMAC.getMACAddress();
        System.out.println(macAddress);
    }
}