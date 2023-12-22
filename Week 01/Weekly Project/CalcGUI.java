import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcGUI {
    
    static float op1 = 0;
    static float op2 = 0;
    static float result = 0;

    static JTextField op1Feild;
    static JTextField op2Feild;
    static JTextField resultFeild;

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Calculator");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setLayout(new GridLayout(4,2));

        op1Feild = new JTextField();
        op2Feild = new JTextField();

        resultFeild = new JTextField();
        resultFeild.setEditable(false);

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");
        JButton mod = new JButton("%");
        JButton exit = new JButton("Exit");

        frame.add(new JLabel("Operaned 1:"));
        frame.add(op1Feild);
        frame.add(new JLabel("Operaned 2:"));
        frame.add(op2Feild);
        frame.add(new JLabel("Result:"));
        frame.add(resultFeild);

        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);
        frame.add(mod);
        frame.add(exit);

        add.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate('+');
            }  
        });

        sub.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate('-');
            }  
        });
        mul.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate('*');
            }  
        });
        div.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate('/');
            }  
        });
        mod.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate('%');
            }  
        });
        exit.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }  
        });

        frame.setVisible(true);
    }

    private static void calculate(char opeartor) {

        op1 = Float.parseFloat(op1Feild.getText());
        op2 = Float.parseFloat(op2Feild.getText());

        switch(opeartor) {
            case '+':
                result = op1 + op2;
                break;
            case '-':
                result = op1 - op2;
                break;
            case '*':
                result = op1 * op2;
                break;
            case '/':
                try {
                    result = op1 / op2;
                } catch(ArithmeticException e) {
                    System.out.println("Error !! " + e.getMessage());
                }
                break;
            case '%':
                result = (int)op1 % (int)op2;
                break;
 
        }
         resultFeild.setText(String.valueOf(result));
    }
}
