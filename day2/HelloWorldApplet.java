import java.applet.*;
//applet应用程序需要的包
import java.awt.*;
//awt图形技术包
public class HelloWorldApplet extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.drawString("HelloWorld",10,20);
    }
}