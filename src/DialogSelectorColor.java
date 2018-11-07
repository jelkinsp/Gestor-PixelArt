import javax.swing.*;
import java.awt.*;

public class DialogSelectorColor extends JDialog {

    JSlider sliderRed;
    JSlider sliderGreen;
    JSlider sliderBlue;
    JTextField jTTitle, jTRed, jTGreen, jTBlue;

    JPanel jPanelColor;

    public DialogSelectorColor(Frame owner) {
        super(owner);
        setModal(true);
        setBounds(0, 0, 400, 600);
        addElements();
        addListeners();
    }


    private void addElements() {
        sliderRed = new JSlider(JSlider.HORIZONTAL,0,255,0);
        sliderGreen = new JSlider(JSlider.HORIZONTAL,0,255,0);
        sliderBlue = new JSlider(JSlider.HORIZONTAL,0,255,0);
        jTTitle = new JTextField("Seleccione el color");
        jTRed = new JTextField("Niveles de rojo.");
        jTGreen = new JTextField("Niveles de verder.");
        jTBlue = new JTextField("Niveles de azul.");
        jPanelColor = new JPanel();
        //Faltan botones

        this.setLayout(new GridBagLayout());


        GridBagConstraints setting = new GridBagConstraints();
        setting.gridheight =2;
        setting.fill = GridBagConstraints.HORIZONTAL;
        this.add(jTTitle, setting);

        setting = new GridBagConstraints();
        setting.gridy = 3;
        setting.fill = GridBagConstraints.HORIZONTAL;
        this.add(jTRed, setting);
        setting = new GridBagConstraints();
        setting.gridy = 4;
        setting.fill = GridBagConstraints.HORIZONTAL;
        this.add(sliderRed, setting);
        setting = new GridBagConstraints();
        setting.gridy = 5;
        setting.fill = GridBagConstraints.HORIZONTAL;
        this.add(jTBlue, setting);
        setting = new GridBagConstraints();
        setting.gridy = 6;
        setting.fill = GridBagConstraints.HORIZONTAL;
        this.add(sliderBlue, setting);
        setting = new GridBagConstraints();
        setting.gridy = 7;
        setting.fill = GridBagConstraints.HORIZONTAL;
        this.add(jTGreen, setting);
        setting = new GridBagConstraints();
        setting.gridy = 8;
        setting.fill = GridBagConstraints.HORIZONTAL;
        this.add(sliderGreen, setting);

        setting = new GridBagConstraints();
        setting.gridy = 9;
        setting.fill = GridBagConstraints.HORIZONTAL;
        this.add(jPanelColor, setting);

    }

    private void addListeners() {
    }


}
