import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class WindowMain {

    JFrame jFrame;
    JPanel[][] jPanels;
    JPanel jPLeft, jPRight;
    JButton[][] jButtons;

    public WindowMain() {
        jFrame = new JFrame();
        jFrame.setBounds(100, 100, 900, 500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    private void initializeComponents() {
        //Inicializar componentes
        jFrame.setLayout(new GridBagLayout());
        jButtons = new JButton[4][4];
        jPanels = new JPanel[4][4];
        for (int i = 0; i < jButtons.length; i++) {
            for (int j = 0; j < jButtons[i].length; j++) {
                jButtons[i][j] = new JButton(i + "-" + j);
                Font fontBold = new Font(jButtons[i][j].getFont().getName(),
                        Font.ITALIC,
                        jButtons[i][j].getFont().getSize());
                jButtons[i][j].setFont(fontBold);
                jPanels[i][j] = new JPanel();
                jPanels[i][j].setLayout(new GridLayout());
                jPanels[i][j].setBorder(new LineBorder(Color.BLACK));
            }
        }
        jPLeft = new JPanel();
        jPRight = new JPanel();
        jPLeft.setLayout(new GridLayout(4, 4));
        jPRight.setLayout(new GridLayout(4, 4));

        //Construccion de la ventana

        //Paneles y botones
        for (int i = 0; i < jButtons.length; i++) {
            for (int j = 0; j < jButtons[i].length; j++) {
                jPLeft.add(jPanels[i][j]);
                jPRight.add(jButtons[i][j]);
            }
        }
        //Contenedores de paneles y botones
        GridBagConstraints settings = new GridBagConstraints();
        settings.fill = GridBagConstraints.BOTH;
        jPLeft.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
        jPLeft.setBackground(Color.GRAY);
        jFrame.add(jPLeft, settings);
        settings = new GridBagConstraints();
        settings.gridx = 1;
        settings.fill = GridBagConstraints.BOTH;
        jPRight.setBorder(
                BorderFactory
                        .createCompoundBorder(
                                BorderFactory
                                        .createEmptyBorder(80, 30, 80, 30),
                                BorderFactory
                                        .createTitledBorder("Pintar area")));
        jPRight.setBackground(Color.CYAN);
        jFrame.add(jPRight, settings);
        //Fondos
        settings = new GridBagConstraints();
        jPLeft.setBackground(Color.GRAY);
        settings.gridx = 0;
        settings.gridy = 0;
        settings.weightx = 10;
        settings.weighty = 1;
        settings.fill = GridBagConstraints.BOTH;
        jFrame.add(jPLeft, settings);

        settings = new GridBagConstraints();
        jPRight.setBackground(Color.CYAN);
        settings.gridx = 1;
        settings.gridy = 0;
        settings.weightx = 1;
        settings.weighty = 1;
        settings.fill = GridBagConstraints.BOTH;
        jFrame.add(jPRight, settings);


    }

    private void initializeListeners() {
        for (int i = 0; i < jButtons.length; i++) {
            for (int j = 0; j < jButtons[i].length; j++) {
//                jButtons[i][j].addActionListener(new ActionButton(i, j, jPanels[i][j]));
                jButtons[i][j].addActionListener(new ActionButton(i, j, jPanels[i][j]));
            }
        }
    }

    public void initialize() {
        jFrame.setVisible(true);
        initializeComponents();
        initializeListeners();
    }


}
