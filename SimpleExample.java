import java.awt.*;
public class SimpleExample extends Frame
{
SimpleExample()
{
Button b=new Button("Button");
b.setBounds(200,0,0,0);
add(b);
setSize(100,100);
setTitle("Kuchh Bhi");
setLayout(new FlowLayout());
setVisible(true);
}
public static void main(String args[])
{
SimpleExample P=new SimpleExample();
}
}
