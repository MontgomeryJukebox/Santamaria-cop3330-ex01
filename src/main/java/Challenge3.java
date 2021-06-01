import javax.swing.*;

public class Challenge3 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Greetings, " + name + "!");
    }
}
