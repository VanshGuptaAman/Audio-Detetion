import java.awt.*;
public class SimpleExample4 extends Frame
{
SimpleExample4()
{
Panel ta=new Panel();
ta.setBackground(Red);
ta.setBounds(50,100,300,400);
/*
ta.add("Abhay");
ta.add("Shiva");
ta.add("Ayush");
*/
add(ta);
setSize(500,300);
setTitle("Kuchh Bhi");
setBackground(Yellow);
setLayout(new FlowLayout());
setVisible(true);
}
public static void main(String args[])
{
SimpleExample4 P=new SimpleExample4();
}
}
