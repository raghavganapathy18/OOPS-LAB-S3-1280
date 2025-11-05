import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JTextField num1,num2; JButton add,sub,mul,div;
    Calculator(){
        setLayout(new GridLayout(5,2,10,10)); setSize(350,250); setLocationRelativeTo(null);
        add(new JLabel("Number 1")); num1=new JTextField(); add(num1);
        add(new JLabel("Number 2")); num2=new JTextField(); add(num2);
        add=new JButton("ADD"); sub=new JButton("SUBTRACT"); mul=new JButton("MULTIPLY"); div=new JButton("DIVIDE");
        add.addActionListener(this); sub.addActionListener(this); mul.addActionListener(this); div.addActionListener(this);
        add(add); add(sub); add(mul); add(div); setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        try{
            double n1=Double.parseDouble(num1.getText()), n2=Double.parseDouble(num2.getText()), r=0;
            if(e.getSource()==add) r=n1+n2;
            else if(e.getSource()==sub) r=n1-n2;
            else if(e.getSource()==mul) r=n1*n2;
            else if(e.getSource()==div){ if(n2==0) JOptionPane.showMessageDialog(this,"Cannot divide by zero!"); else r=n1/n2; }
            JOptionPane.showMessageDialog(this,"Result: "+r);
        }catch(Exception ex){ JOptionPane.showMessageDialog(this,"Enter valid numbers!"); }
    }
    public static void main(String[] args){ new Calculator(); }
}




// Name: Raghav Ganapathy R V
// URK24CS1280
// Ex : 10
// Question 2
