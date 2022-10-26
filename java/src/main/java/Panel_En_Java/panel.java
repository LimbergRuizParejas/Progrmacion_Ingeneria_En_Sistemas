package Panel_En_Java;

import javax.swing.*;

import java.awt.*;

public class panel extends JPanel {
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(800,600);
    }
@Override
    public void paint(Graphics g) {
        super.paint(g);



        g.drawOval(390,290,340,345);
    g.drawOval(390,290,0,0);
    g.drawOval(390,290,0,0);
    g.drawOval(390,290,0,0);
    g.drawOval(390,290,0,0);
}

}
