import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Crea un JDialog personalizado para seleccionar el color de nuestro gestor.
 *
 * @author : Jose Luis Luengo Ramos
 */
public class DialogSelectorColor extends JDialog implements ActionListener, ChangeListener {

    JSlider sliderRed;
    JSlider sliderGreen;
    JSlider sliderBlue;
    JLabel jLTitle, jLRed, jLGreen, jLBlue;
    JButton jBOK;
    JPanel jPanelColor;
    Color colorSelected;

    /**
     * Constructor inicia la ventana y hereda de JDialog
     *
     */
    public DialogSelectorColor() {
        super();
        setModal(true);
        setBounds(0, 0, 400, 600);
        addElements();
        addListeners();
    }

    /**
     * inicializa todo los componentes y añade los ajustes a la ventana principal.
     *
     */
    public void addElements() {
        //Inicializao los slider
        sliderRed = new JSlider(JSlider.HORIZONTAL,0,255,0);
        sliderRed.setMajorTickSpacing(255);
        sliderRed.setMinorTickSpacing(0);
        sliderRed.setPaintTicks(true);
        sliderRed.setPaintLabels(true);
        sliderGreen = new JSlider(JSlider.HORIZONTAL,0,255,0);
        sliderGreen.setMajorTickSpacing(255);
        sliderGreen.setMinorTickSpacing(0);
        sliderGreen.setPaintTicks(true);
        sliderGreen.setPaintLabels(true);
        sliderBlue = new JSlider(JSlider.HORIZONTAL,0,255,0);
        sliderBlue.setMajorTickSpacing(255);
        sliderBlue.setMinorTickSpacing(0);
        sliderBlue.setPaintTicks(true);
        sliderBlue.setPaintLabels(true);
        //Inicializo el resto de comopnentes
        jLTitle = new JLabel("Seleccione el color", SwingConstants.CENTER);
        jLRed = new JLabel("Niveles de rojo.", SwingConstants.CENTER);
        jLGreen = new JLabel("Niveles de verder.", SwingConstants.CENTER);
        jLBlue = new JLabel("Niveles de azul.", SwingConstants.CENTER);
        jPanelColor = new JPanel();
        jBOK = new JButton("Aceptar");

        this.setLayout(new GridBagLayout());

        //Titulo
        GridBagConstraints setting = new GridBagConstraints();
        setting.gridheight =2;
        setting.fill = GridBagConstraints.HORIZONTAL;
        this.add(jLTitle, setting);

        //Niveles de Rojo
        setting = new GridBagConstraints();
        setting.gridy = 3;
        setting.fill = GridBagConstraints.HORIZONTAL;
        this.add(jLRed, setting);
        setting = new GridBagConstraints();
        setting.gridy = 4;
        setting.fill = GridBagConstraints.HORIZONTAL;
        this.add(sliderRed, setting);

        //Niveles de Verde
        setting = new GridBagConstraints();
        setting.gridy = 5;
        setting.fill = GridBagConstraints.HORIZONTAL;
        this.add(jLBlue, setting);
        setting = new GridBagConstraints();
        setting.gridy = 6;
        setting.fill = GridBagConstraints.HORIZONTAL;
        this.add(sliderBlue, setting);

        //Niveles de Azul
        setting = new GridBagConstraints();
        setting.gridy = 7;
        setting.fill = GridBagConstraints.HORIZONTAL;
        this.add(jLGreen, setting);
        setting = new GridBagConstraints();
        setting.gridy = 8;
        setting.fill = GridBagConstraints.HORIZONTAL;
        this.add(sliderGreen, setting);


        setting = new GridBagConstraints();

        setting.gridy = 9;
        setting.fill = GridBagConstraints.HORIZONTAL;
        jPanelColor.setBackground(Color.GRAY);
        jPanelColor.setBorder(new LineBorder(Color.BLACK));
        this.add(jPanelColor, setting);

        setting = new GridBagConstraints();
        setting.gridy= 10;
        this.add(jBOK, setting);

        jBOK.addActionListener(this);
        sliderRed.addChangeListener(this);
        sliderGreen.addChangeListener(this);
        sliderBlue.addChangeListener(this);
    }

    /**
     * Retorna el color seleccionado
     *
     * @return
     */
    public Color addListeners() {
        return colorSelected;
    }


    /**
     * Cierra la ventana
     *
     * @param actionEvent : recibe la accion del boton
     */
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        dispose();
    }

    /**
     *
     * @param changeEvent : recibe la accion del slider
     */
    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        int red = sliderRed.getValue();
        int green = sliderGreen.getValue();
        int blue = sliderBlue.getValue();
        colorSelected = new Color(red, green, blue);
        jPanelColor.setBackground(colorSelected);


    }
}
