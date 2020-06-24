import java.awt.*;
import java.awt.event.*;
public class cld extends Frame
{
public cld()
{
setLayout(new FlowLayout());
Button col=new Button("college");
Button br=new Button ("branch");
add(col);
add(br);
CardLayout cl=new CardLayout();
Panel p=new Panel();
p.setLayout(cl);
Checkbox srkr=new Checkbox("srkr");
Checkbox vit=new Checkbox("vitr");
Panel p1=new Panel();
p1.add(srkr);
p1.add(vit);
p.add(p1,"college");
Checkbox cse=new Checkbox("cse");
Checkbox eee=new Checkbox("eee");
Panel p2=new Panel();
p2.add(cse);
p2.add(eee);
p.add(p2,"branch");
add(p);
col.addActionListener(e)->cl.Show(p,"college");
br.addActionListener(e)->cl.Show(p,"branch");
}
public static void main(String args[])
{
cld ob=new cld();
ob.setSize(new Dimension(300,300));
ob.setTitle("cld");
ob.setVisible(true);
}
}
