import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class AdressMAC {
    public static String getMACAddress() throws IOException {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface networkInterface = networkInterfaces.nextElement();
            byte[] macAddressBytes = networkInterface.getHardwareAddress();
            if (macAddressBytes != null) {
                StringBuilder macAddressStringBuilder = new StringBuilder();
                for (byte macAddressByte : macAddressBytes) {
                    macAddressStringBuilder.append(String.format("%02X:", macAddressByte));
                }
                macAddressStringBuilder.deleteCharAt(macAddressStringBuilder.length() - 1);
                return macAddressStringBuilder.toString();
            }
        }
        return null;
    }
}
