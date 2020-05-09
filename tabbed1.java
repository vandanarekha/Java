import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code = "tabbed1" width=500 height=600>
</applet>
*/
public class tabbed1 extends JApplet
{
JLabel jl;
public void init()
{
try
{
SwingUtilities.invokeLater(new Runnable()
{
public void run()
{
makeGUI();
}
});
}
catch(Exception e)
{
System.out.println(e);
}
}
public void makeGUI()
{
JTabbedPane tp=new JTabbedPane();
tp.addTab("city",new cityPanel());
tp.addTab("color",new colorPanel());
tp.addTab("flower",new flowerPanel());
add(tp);
}
}
class cityPanel extends JPanel
{
cityPanel()
{
JButton jb=new JButton("Mangaluru");
JButton jb1=new JButton("Moodbidri");
jb.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
jb.setText("Mangaluru");
}
});
jb1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
jb1.setText("Moodbidri");
}
});
add(jb);
add(jb1);
JLabel jl=new JLabel("Press Button");
add(jl);
}
}
class colorPanel extends JPanel
{
colorPanel()
{
JCheckBox jb=new JCheckBox("Red");
JCheckBox jb1=new JCheckBox("yellow");
jb.addItemListener(new ItemListener()
{
public void itemStateChanged(ItemEvent ie)
{
jb.setText("Red");
}
});
jb1.addItemListener(new ItemListener()
{
public void itemStateChanged(ItemEvent ie)
{
jb1.setText("Yellow");
}
});
add(jb);
add(jb1);

JLabel jl=new JLabel("Select Color");
add(jl);
}
}
class flowerPanel extends JPanel
{
flowerPanel()
{
JLabel jb=new JLabel("Rose",JLabel.LEFT);
add(jb);
JLabel jb1=new JLabel("Lilly",JLabel.RIGHT);
add(jb1);
}
}