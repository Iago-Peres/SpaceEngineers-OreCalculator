package Window;

import InputProcessing.Calculator;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class WindowFrame extends JFrame {
    private JLabel labeloreinput = new JLabel("Ore Amount:");
    private JLabel labelingotoutput = new JLabel("Ingot Output:");
    private Calculator calculator = new Calculator();

    public WindowFrame(){
        setSize(295,300);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Space Engineers Ore Calculator");
        setDefaultCloseOperation(3);
        setLayout(null);

        Calculator.selector.addItem("Stone");
        Calculator.selector.addItem("Iron");
        Calculator.selector.addItem("Silicon");
        Calculator.selector.addItem("Nickel");
        Calculator.selector.addItem("Cobalt");
        Calculator.selector.addItem("Silver");
        Calculator.selector.addItem("Gold");
        Calculator.selector.addItem("Uranium");
        Calculator.selector.addItem("Magnesium");
        Calculator.selector.addItem("Platinum");
        Calculator.selector.addItem("ScrapMetal");

        Calculator.selector.setBounds(85,10,100,22);
        add(Calculator.selector);

        Calculator.txtoreinput.addKeyListener(calculator);
        Calculator.txtoreinput.setBounds(85,70,100,22);
        add(Calculator.txtoreinput);

        Calculator.txtingotoutput.setBounds(40,140,200,88);
        add(Calculator.txtingotoutput);
        
        labeloreinput.setBounds(85,50,80,22);
        add(labeloreinput);

        labelingotoutput.setBounds(40,115,80,22);
        add(labelingotoutput);

        setVisible(true);
    }
}