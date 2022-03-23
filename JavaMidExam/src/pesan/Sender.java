package pesan;

public class Sender {
    public static void main(String[] args) {
        StdMessenger std = new StdMessenger();
        System.out.println("StdMessenger\n");
        std.sendMessage("", "riminder", "Don't forget to use your reward");
        std.sendMessage("Palemo", "riminder", "Do you accept my reward?");
        
        MailMessenger mail = new MailMessenger();
        System.out.println("MailMessenger\n");
        mail.connect();
        mail.sendMessage("", "Secret", "Don't tell anyone!");
        mail.sendMessage("Sergio", "Burn", "Burned...");
        mail.disconnect();
        mail.sendMessage("El", "Gift", "vintage wallet");
    }
}
