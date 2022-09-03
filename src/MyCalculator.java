import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator {
    private JPanel MyCalculator;
    private JTextField textField1;
    private JButton Button1;
    private JButton Button2;
    private JButton Button3;
    private JButton Button4;
    private JButton Button5;
    private JButton Button6;
    private JButton Button7;
    private JButton Button8;
    private JButton Button9;
    private JButton Button0;
    private JButton Button11;
    private JButton Button12;
    private JButton Button13;
    private JButton Button14;
    private JButton Button15;
    private JButton clearButton;

    public MyCalculator() {
        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1Text = textField1.getText() + Button1.getText();
                textField1.setText(button1Text);
            }
        });

        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1Text = textField1.getText() + Button2.getText();
                textField1.setText(button1Text);
            }
        });

        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1Text = textField1.getText() + Button3.getText();
                textField1.setText(button1Text);
            }
        });

        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1Text = textField1.getText() + Button4.getText();
                textField1.setText(button1Text);
            }
        });

        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1Text = textField1.getText() + Button5.getText();
                textField1.setText(button1Text);
            }
        });

        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1Text = textField1.getText() + Button6.getText();
                textField1.setText(button1Text);
            }
        });

        Button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1Text = textField1.getText() + Button7.getText();
                textField1.setText(button1Text);
            }
        });

        Button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1Text = textField1.getText() + Button8.getText();
                textField1.setText(button1Text);
            }
        });

        Button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1Text = textField1.getText() + Button9.getText();
                textField1.setText(button1Text);
            }
        });

        Button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button1Text = textField1.getText() + Button0.getText();
                textField1.setText(button1Text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyCalculator");
        frame.setContentPane(new MyCalculator().MyCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
