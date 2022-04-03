import java.awt.*;
public class SimpleExample1 extends Frame
{
SimpleExample1()
{
Label l1, l2;
l1=new Label("First Label");
l1.setBounds(50,50,50,50);
l2=new Label("Second Label");
l2.setBounds(100,150,200,150);
add(l1);
add(l2);
setSize(300,300);
setTitle("Kuchh Bhi");
setLayout(new FlowLayout());
setVisible(true);
}
public static void main(String args[])
{
SimpleExample1 P=new SimpleExample1();
}
}
