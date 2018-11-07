import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionButton extends JButton implements ActionListener{
    private JPanel jPanelAsociate;
    Color color = Color.BLACK;



    public ActionButton(int iPosition, int jPosition, JPanel jPanelAsociate) {
        super(iPosition+"-"+jPosition);
        this.jPanelAsociate = jPanelAsociate;
        this.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        this.jPanelAsociate.setBackground(color);

    }
}
