package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class pixelsCalculatorGUI implements ActionListener{

    private JFrame frame;
    private JTextField maintextField , userInputTextField;
    private JButton computeButton, exitButton;

    private JButton popBerryButton,butterBerryButton,scarrotButton,grainbowButton,grumpkinButton,grumpkinOrangeButton,watermintButton,astracactusButton,cloverButton,fourleafCloverButton,
    heartBeetButton,shorelimeButton,razzleBerryButton,bluzberryButton,bluzzleberryButton,hotatoButton,muckChuckButton,javaBeanButton;

    private JPanel panel , functionButtonPanel;

    
    

    public pixelsCalculatorGUI(){
        frame = new JFrame("Pixels Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.WHITE));
        frame.setLayout(new BorderLayout()); 

        JPanel textFieldPanel = new JPanel();
        textFieldPanel.setLayout(new BoxLayout(textFieldPanel, BoxLayout.Y_AXIS));

         //Text Field Section 
        JLabel placeholderLabel = new JLabel("Number of Seeds: ");
        placeholderLabel.setForeground(Color.BLACK); 

    

        maintextField = new JTextField();
        maintextField.setBounds(50, 25, 300, 50);
        maintextField.setPreferredSize(new Dimension(400, 100));
        maintextField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        maintextField.setEditable(false);
        textFieldPanel.add(maintextField); 

        textFieldPanel.add(placeholderLabel);
        userInputTextField = new JTextField();
        userInputTextField.setPreferredSize(new Dimension(100, 50));
        userInputTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        textFieldPanel.add(userInputTextField);

       




        //BUTTON Section


        //add Icons to Buttons
        ImageIcon popBerry = new ImageIcon("D:\\JABA\\Rainbow Game\\Pixels-Calculator\\GUI\\images\\itm_popberry.png");
        ImageIcon butterBerry = new ImageIcon("D:\\JABA\\Rainbow Game\\Pixels-Calculator\\GUI\\images\\itm_butterberry.png");
        ImageIcon scarrot = new ImageIcon("D:\\JABA\\Rainbow Game\\Pixels-Calculator\\GUI\\images\\itm_scarrot.png");
        ImageIcon grainbow = new ImageIcon("D:\\JABA\\Rainbow Game\\Pixels-Calculator\\GUI\\images\\itm_grainbow.png");
        ImageIcon grumpkin = new ImageIcon("D:\\JABA\\Rainbow Game\\Pixels-Calculator\\GUI\\images\\itm_grumpkin.png");
        ImageIcon grumpkinOrange = new ImageIcon("D:\\JABA\\Rainbow Game\\Pixels-Calculator\\GUI\\images\\itm_grumpkin_orange.png");
        ImageIcon watermint = new ImageIcon("D:\\JABA\\Rainbow Game\\Pixels-Calculator\\GUI\\images\\itm_watermint.png");
        ImageIcon astracactus = new ImageIcon("D:\\JABA\\Rainbow Game\\Pixels-Calculator\\GUI\\images\\itm_astracactus.png");
        ImageIcon clover = new ImageIcon("D:\\JABA\\Rainbow Game\\Pixels-Calculator\\GUI\\images\\itm_clover.png");
        ImageIcon fourleafClover = new ImageIcon("D:\\JABA\\Rainbow Game\\Pixels-Calculator\\GUI\\images\\itm_fourleaf_clover.png");
        ImageIcon heartbeet = new ImageIcon("D:\\JABA\\Rainbow Game\\Pixels-Calculator\\GUI\\images\\itm_heartbeet.png");
        ImageIcon shorelime = new ImageIcon("D:\\JABA\\Rainbow Game\\Pixels-Calculator\\GUI\\images\\itm_shoreline.png");
        ImageIcon razzleBerry = new ImageIcon("D:\\JABA\\Rainbow Game\\Pixels-Calculator\\GUI\\images\\itm_razzleberry.png");
        ImageIcon bluzBerry = new ImageIcon("D:\\JABA\\Rainbow Game\\Pixels-Calculator\\GUI\\images\\itm_bluzberry.png");
        ImageIcon bluzzleBerry = new ImageIcon("D:\\JABA\\Rainbow Game\\Pixels-Calculator\\GUI\\images\\itm_bluzzleberry.png");
        ImageIcon hotato = new ImageIcon("D:\\JABA\\Rainbow Game\\Pixels-Calculator\\GUI\\images\\itm_hotato.png");
        ImageIcon muckChuck = new ImageIcon("D:\\JABA\\Rainbow Game\\Pixels-Calculator\\GUI\\images\\itm_muckchuck.png");
        ImageIcon javaBean = new ImageIcon("D:\\JABA\\Rainbow Game\\Pixels-Calculator\\GUI\\images\\itm_javabean.png");
        

        //Instatiate buttons
        popBerryButton = new JButton(popBerry);
        butterBerryButton = new JButton(butterBerry);
        scarrotButton = new JButton(scarrot);
        grainbowButton = new JButton(grainbow);
        grumpkinButton = new JButton(grumpkin);
        grumpkinOrangeButton = new JButton(grumpkinOrange);
        watermintButton = new JButton(watermint);
        astracactusButton = new JButton(astracactus);
        cloverButton = new JButton(clover);
        fourleafCloverButton = new JButton(fourleafClover);
        heartBeetButton = new JButton(heartbeet);
        shorelimeButton = new JButton(shorelime);
        razzleBerryButton = new JButton(razzleBerry);
        bluzberryButton = new JButton(bluzBerry);
        bluzzleberryButton = new JButton(bluzzleBerry);
        hotatoButton = new JButton(hotato);
        muckChuckButton = new JButton(muckChuck);
        javaBeanButton = new JButton(javaBean);
        
        //Function Buttons 
        computeButton = new JButton("Calculate");
        exitButton = new JButton("Exit");

        //Set Button Sizes
        popBerryButton.setPreferredSize(new Dimension(100, 30));
        butterBerryButton.setPreferredSize(new Dimension(100, 30));
        scarrotButton.setPreferredSize(new Dimension(100, 30));
        grainbowButton.setPreferredSize(new Dimension(100, 30));
        grumpkinButton.setPreferredSize(new Dimension(100, 30));
        grumpkinOrangeButton.setPreferredSize(new Dimension(100, 30));
        watermintButton.setPreferredSize(new Dimension(100, 30));
        astracactusButton.setPreferredSize(new Dimension(100, 30));
        cloverButton.setPreferredSize(new Dimension(100, 30));
        fourleafCloverButton.setPreferredSize(new Dimension(100, 30));
        heartBeetButton.setPreferredSize(new Dimension(100, 30));
        shorelimeButton.setPreferredSize(new Dimension(100, 30));
        razzleBerryButton.setPreferredSize(new Dimension(100, 30));
        bluzberryButton.setPreferredSize(new Dimension(100, 30));
        bluzberryButton.setPreferredSize(new Dimension(100, 30));
        hotatoButton.setPreferredSize(new Dimension(100, 30));
        muckChuckButton.setPreferredSize(new Dimension(100, 30));
        javaBeanButton.setPreferredSize(new Dimension(100, 30));

        computeButton.setPreferredSize(new Dimension(45, 30));
        exitButton.setPreferredSize(new Dimension(45, 30));

        //Set Button Borders
        popBerryButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        butterBerryButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        scarrotButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        grainbowButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        grumpkinButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        grumpkinOrangeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        watermintButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        astracactusButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        cloverButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        fourleafCloverButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        heartBeetButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        shorelimeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        razzleBerryButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        bluzberryButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        bluzzleberryButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        hotatoButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        muckChuckButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        javaBeanButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        computeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        exitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        //Buttons to Panels
        panel = new JPanel();
        panel.setLayout(new GridLayout(6, 7, 10, 10));
       // panel.setLayout(new GridLayout(2, 1, 10, 10)); 

       //Add Buttons
        panel.add(popBerryButton);
        panel.add(butterBerryButton);
        panel.add(scarrotButton);
        panel.add(grainbowButton);
        panel.add(grumpkinButton);
        panel.add(grumpkinOrangeButton);
        panel.add(watermintButton);
        panel.add(astracactusButton);
        panel.add(cloverButton);
        panel.add(fourleafCloverButton);
        panel.add(heartBeetButton);
        panel.add(shorelimeButton);
        panel.add(razzleBerryButton);
        panel.add(bluzberryButton);
        panel.add(bluzzleberryButton);
        panel.add(hotatoButton);
        panel.add(muckChuckButton);
        panel.add(javaBeanButton);

       

        functionButtonPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        functionButtonPanel.setPreferredSize(new Dimension(15, 30));
        functionButtonPanel.add(computeButton);
        functionButtonPanel.add(exitButton);


        frame.add(panel, BorderLayout.CENTER);
        frame.add(functionButtonPanel, BorderLayout.SOUTH);
        frame.add(textFieldPanel, BorderLayout.NORTH);
        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public static void main(String[] args) {
        new pixelsCalculatorGUI();
    }

}