import java.awt.*;
public class SimpleExample2 extends Frame
{
SimpleExample2()
{
CheckboxGroup C=new CheckboxGroup();
Checkbox C1=new Checkbox("Java",C,false);
C1.setBounds(50,50,50,50);
Checkbox C2=new Checkbox("IMED",C,true);
C2.setBounds(100,150,200,150);
add(C1);
add(C2);
setSize(500,300);
setTitle("Kuchh Bhi");
setLayout(new FlowLayout());
setVisible(true);
}
public static void main(String args[])
{
SimpleExample2 P=new SimpleExample2();
}
}
