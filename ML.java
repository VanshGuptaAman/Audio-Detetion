import java.awt.*;
import java.awt.event.*;
public class ml extends Frame implements MouseListener
{

ml()
{
addMouseListener(this);
setSize(100,100);
setVisible(true);
}

public void MouseEntered(MouseEvent ml){}
public void MouseExited(MouseEvent ml){}
public void MousePressed(MouseEvent ml){}
public void MouseReleased(MouseEvent ml){}
public void MouseClicked(MouseEvent ml)
{
Graphics g=getGraphics();
g.setColor(Color.BLUE);
g.fillOval(ml.getX(),ml.getY(),10,10);
}


public static void main(String args[])
{
ml A=new ml();
}

}