import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PrimeCheckerGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Prime Checker");
        JTextField inputField = new JTextField(10);
        JButton checkButton = new JButton("Kontrol Et");
        JLabel resultLabel = new JLabel(" ");

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = inputField.getText();
                try {
                    int number = Integer.parseInt(text);
                    if (PrimeChecker.isPrime(number)) {
                        resultLabel.setText(number + " asal sayıdır.");
                    } else {
                        resultLabel.setText(number + " asal sayı değildir.");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Lütfen geçerli bir tamsayı giriniz.");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Sayı:"));
        panel.add(inputField);
        panel.add(checkButton);
        panel.add(resultLabel);

        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
