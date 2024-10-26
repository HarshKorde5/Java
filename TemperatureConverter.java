import javax.swing.*;
import java.awt.*;

class myWindow
{

    JFrame frame;
    JLabel c,f;
    JTextField cf,ff;

    public void displayWindow()
    {
        frame = new JFrame("Temperature Converter");
        frame.setSize(300,200);
        frame.setLayout(new GridLayout(2,2,1,1));
        frame.setVisible(true);

        c = new JLabel("Celsius");
        f = new JLabel("Fahrenheit");

        cf = new JTextField(20);
        ff = new JTextField(20);

        frame.add(c);
        frame.add(cf);
        frame.add(f);
        frame.add(ff);
    }


}

class TemperatureConverter
{
    public static void main(String arg[])
    {
        myWindow m = new myWindow();
        m.displayWindow();
    }
}