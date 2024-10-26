import javax.swing.*;
import java.awt.event.*;

class myWindow implements ActionListener
{
    JFrame frame;
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2;

    public void displayWindow()
    {
        frame = new JFrame();
        frame.setSize(600,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Enter first number : ");
        l2 = new JLabel("Enter second number : ");
        l3 = new JLabel("Resulting division is : ");

        l1.setBounds(10,20,200,30);
        l2.setBounds(10,60,200,30);
        l3.setBounds(10,100,300,30);

        frame.add(l1);
        frame.add(l2);
        frame.add(l3);

        b1 = new JButton("Divide");
        b2 = new JButton("Clear");

        b1.setBounds(50,200,100,30);
        b2.setBounds(200,200,100,30);

        frame.add(b1);
        frame.add(b2);

        t1 = new JTextField(20);
        t2 = new JTextField(20);

        t1.setBounds(250,20,100,30);
        t2.setBounds(250,60,100,30);

        frame.add(t1);
        frame.add(t2);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();

        if(command.equals("Clear"))
        {
            t1.setText("");
            t2.setText("");
        }
        else if(command.equals("Divide"))
        {
            try
            {
                int no1 = Integer.parseInt(t1.getText());
                int no2 = Integer.parseInt(t2.getText());
                
                l3.setText("Resulting division is : "+no1/no2);
            }
            catch(NumberFormatException e1)
            {
                JOptionPane.showMessageDialog(b1, "Enter a valid Number","ERROR", JOptionPane.WARNING_MESSAGE);
            }
            catch(ArithmeticException e2)
            {
                JOptionPane.showMessageDialog(b1, "Second number cannot be zero","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

class Division
{
    public static void main(String arg[])
    {   
        myWindow m = new myWindow();
        m.displayWindow();

    }
}