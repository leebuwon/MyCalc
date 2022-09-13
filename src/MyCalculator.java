import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator {

    private int total1 = 0;
    private int total2 = 0;
    private char math_operator;

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
    private JButton ButtonPlus;
    private JButton ButtonMinus;
    private JButton ButtonMutiple;
    private JButton ButtonDivde;
    private JButton ButtonResult;
    private JButton clearButton;

    private void getOperator (String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Integer.parseInt(textField1.getText());
        textField1.setText("");
    }

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

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textField1.setText("");

            }
        });

        ButtonResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(math_operator){
                    case '+':
                        total2 = total1 + Integer.parseInt(textField1.getText());
                        break;
                    case '-':
                        total2 = total1 - Integer.parseInt(textField1.getText());
                        break;
                    case '*':
                        total2 = total1 * Integer.parseInt(textField1.getText());
                        break;
                    case '/':
                        total2 = total1 / Integer.parseInt(textField1.getText());
                        break;
                }

                textField1.setText(Integer.toString(total2));
                total1 = 0;
            }
        });

        ButtonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = ButtonPlus.getText();
                getOperator(button_text);
            }
        });

        ButtonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = ButtonMinus.getText();
                getOperator(button_text);
            }
        });

        ButtonMutiple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = ButtonMutiple.getText();
                getOperator(button_text);
            }
        });

        ButtonDivde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = ButtonDivde.getText();
                getOperator(button_text);
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
