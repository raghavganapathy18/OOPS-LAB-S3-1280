import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RegisterFrame extends JFrame implements ActionListener {
    JTextField name; JRadioButton male,female; JCheckBox apple,samsung,redmi,oneplus; JComboBox<String> color; JButton save;
    RegisterFrame(){
        setLayout(new GridLayout(6,2,10,10));
        setSize(400,300); setLocationRelativeTo(null);
        add(new JLabel("Name:")); name=new JTextField(); add(name);
        add(new JLabel("Gender:")); JPanel g=new JPanel(); male=new JRadioButton("Male"); female=new JRadioButton("Female");
        ButtonGroup bg=new ButtonGroup(); bg.add(male); bg.add(female); g.add(male); g.add(female); add(g);
        add(new JLabel("Model:")); JPanel m=new JPanel(); apple=new JCheckBox("Apple"); samsung=new JCheckBox("Samsung"); redmi=new JCheckBox("Redmi"); oneplus=new JCheckBox("OnePlus");
        m.add(apple); m.add(samsung); m.add(redmi); m.add(oneplus); add(m);
        add(new JLabel("Color:")); color=new JComboBox<>(new String[]{"Black","White","Blue","Red"}); add(color);
        save=new JButton("Save"); save.addActionListener(this); add(new JLabel("")); add(save);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String n=name.getText();
        String g=male.isSelected()?"Male":female.isSelected()?"Female":"Not Selected";
        StringBuilder models=new StringBuilder();
        if(apple.isSelected())models.append("Apple, "); if(samsung.isSelected())models.append("Samsung, "); if(redmi.isSelected())models.append("Redmi, "); if(oneplus.isSelected())models.append("OnePlus, ");
        if(models.length()>0)models.delete(models.length()-2,models.length());
        new DisplayFrame(n,g,models.toString(),(String)color.getSelectedItem());
    }
}

class DisplayFrame extends JFrame {
    DisplayFrame(String n,String g,String m,String c){
        setLayout(new GridLayout(5,1,10,10)); setSize(350,200); setLocationRelativeTo(null);
        add(new JLabel("Name: "+n)); add(new JLabel("Gender: "+g)); add(new JLabel("Model: "+m)); add(new JLabel("Color: "+c));
        JButton ok=new JButton("OK"); ok.addActionListener(e->dispose()); add(ok);
        setVisible(true);
    }
}

public class StudentRegistration {
    public static void main(String[] args){ new RegisterFrame(); }
}



// Name: Raghav Ganapathy R V
// URK24CS1280
// Ex : 10
// Compulsrory Question 
