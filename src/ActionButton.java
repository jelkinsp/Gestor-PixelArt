import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Clase personalizada para las acciones de los botones.
 *
 * @author : Jose Luis Luengo Ramos
 */
public class ActionButton extends JButton implements MouseListener, ActionListener {
    JPanel jPanelAsociate;
    Color color = Color.BLACK;
    DialogSelectorColor dialod;


    /**
     * Inicializa los botones y estable un texto con su posicion en cursiva.
     *
     * @param iPosition : posicion x del boton
     * @param jPosition : posicion y del boton
     * @param jPanelAsociate : panel asociado a las coordenadas del boton.
     */
    public ActionButton(int iPosition, int jPosition, JPanel jPanelAsociate) {
        super(iPosition+"-"+jPosition);
        this.jPanelAsociate = jPanelAsociate;
        this.addMouseListener(this);
        Font fontBold = new Font(this.getFont().getName(),
                Font.ITALIC,
                this.getFont().getSize());
        this.setFont(fontBold);

    }


    /**
     * Acciones del raton.
     * Si es izquierdo pinta del color establecido el panel, si es derecho saca un Jdialog personalizado
     *
     * @param mouseEvent
     */
    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if(SwingUtilities.isRightMouseButton(mouseEvent)){
        dialod = new DialogSelectorColor((JButton)mouseEvent.getSource());
            dialod.setVisible(true);
            color =dialod.addListeners();
        } else {
            this.jPanelAsociate.setBackground(color);
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
