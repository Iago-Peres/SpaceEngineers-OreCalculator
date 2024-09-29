package InputProcessing;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

public class Calculator implements KeyListener {
    public static JTextField txtoreinput = new JTextField();
    public static JTextArea txtingotoutput = new JTextArea();
    public static JComboBox selector = new JComboBox();
    private DecimalFormat df = new DecimalFormat("0.0");

    private void OreCalculate() {
        //                   1.4% | 3%   | 0.24%  | 0.4%  | 80% | 70% | 40% | 30% | 10% |  1%  |  0.7% |  0.5%
        float[] oreRatio = {0.014f, 0.03f, 0.0024f, 0.004f, 0.8f, 0.7f, 0.4f, 0.3f, 0.1f, 0.01f, 0.007f, 0.005f};
        float input = Float.parseFloat(txtoreinput.getText());
        float[] output = {0, 0, 0, 0};

        txtingotoutput.setText("");
        switch (selector.getSelectedItem().toString()) {
            case "Stone":
                String[] stoneOutputs = {"Gravel : ", "IronIngot : ", "NickelIngot : ", "SiliconIngot : "};
                for (int i = 0; i <= 3; i++) {
                    output[i] = input * oreRatio[i];
                    if (output[i] < 1000.0) {
                        txtingotoutput.append(stoneOutputs[i] + String.valueOf(df.format(output[i])) + "\n");
                    }
                    if ((output[i] >= 1000.0) && (output[i] < 1000000.0)) {
                        txtingotoutput.append(stoneOutputs[i] + String.valueOf(df.format(output[i] / 1000)) + "K" + "\n");
                    }
                    if (output[i] >= 1000000.0) {
                        txtingotoutput.append(stoneOutputs[i] + String.valueOf(df.format(output[i] / 1000000)) + "M" + "\n");
                    }
                }
                break;
            case "Iron":
                output[0] = input * oreRatio[5];
                if (output[0] < 1000.0) {
                    txtingotoutput.append("IronIngot : " + String.valueOf(df.format(output[0])) + "\n");
                }
                if ((output[0] >= 1000.0) && (output[0] < 1000000.0)) {
                    txtingotoutput.append("IronIngot : " + String.valueOf(df.format(output[0] / 1000)) + "K" + "\n");
                }
                if (output[0] >= 1000000.0) {
                    txtingotoutput.append("IronIngot : " + String.valueOf(df.format(output[0] / 1000000)) + "M" + "\n");
                }
                break;
            case "Nickel":
                output[0] = input * oreRatio[6];
                if (output[0] < 1000.0) {
                    txtingotoutput.append("NickelIngot : " + String.valueOf(df.format(output[0])) + "\n");
                }
                if ((output[0] >= 1000.0) && (output[0] < 1000000.0)) {
                    txtingotoutput.append("NickelIngot : " + String.valueOf(df.format(output[0] / 1000)) + "K" + "\n");
                }
                if (output[0] >= 1000000.0) {
                    txtingotoutput.append("NickelIngot : " + String.valueOf(df.format(output[0] / 1000000)) + "M" + "\n");
                }
                break;
            case "Silicon":
                output[0] = input * oreRatio[5];
                if (output[0] < 1000.0) {
                    txtingotoutput.append("SiliconIngot : " + String.valueOf(df.format(output[0])) + "\n");
                }
                if ((output[0] >= 1000.0) && (output[0] < 1000000.0)) {
                    txtingotoutput.append("SiliconIngot : " + String.valueOf(df.format(output[0] / 1000)) + "K" + "\n");
                }
                if (output[0] >= 1000000.0) {
                    txtingotoutput.append("SiliconIngot : " + String.valueOf(df.format(output[0] / 1000000)) + "M" + "\n");
                }
                break;
            case "Cobalt":
                output[0] = input * oreRatio[7];
                if (output[0] < 1000.0) {
                    txtingotoutput.append("CobaltIngot : " + String.valueOf(df.format(output[0])) + "\n");
                }
                if ((output[0] >= 1000.0) && (output[0] < 1000000.0)) {
                    txtingotoutput.append("CobaltIngot : " + String.valueOf(df.format(output[0] / 1000)) + "K" + "\n");
                }
                if (output[0] >= 1000000.0) {
                    txtingotoutput.append("CobaltIngot : " + String.valueOf(df.format(output[0] / 1000000)) + "M" + "\n");
                }
                break;
            case "Silver":
                output[0] = input * oreRatio[8];
                if (output[0] < 1000.0) {
                    txtingotoutput.append("SilverIngot : " + String.valueOf(df.format(output[0])) + "\n");
                }
                if ((output[0] >= 1000.0) && (output[0] < 1000000.0)) {
                    txtingotoutput.append("SilverIngot : " + String.valueOf(df.format(output[0] / 1000)) + "K" + "\n");
                }
                if (output[0] >= 1000000.0) {
                    txtingotoutput.append("SilverIngot : " + String.valueOf(df.format(output[0] / 1000000)) + "M" + "\n");
                }
                break;
            case "Gold":
                output[0] = input * oreRatio[9];
                if (output[0] < 1000.0) {
                    txtingotoutput.append("GoldIngot : " + String.valueOf(df.format(output[0])) + "\n");
                }
                if ((output[0] >= 1000.0) && (output[0] < 1000000.0)) {
                    txtingotoutput.append("GoldIngot : " + String.valueOf(df.format(output[0] / 1000)) + "K" + "\n");
                }
                if (output[0] >= 1000000.0) {
                    txtingotoutput.append("GoldIngot : " + String.valueOf(df.format(output[0] / 1000000)) + "M" + "\n");
                }
                break;
            case "Uranium":
                output[0] = input * oreRatio[9];
                if (output[0] < 1000.0) {
                    txtingotoutput.append("UraniumIngot : " + String.valueOf(df.format(output[0])) + "\n");
                }
                if ((output[0] >= 1000.0) && (output[0] < 1000000.0)) {
                    txtingotoutput.append("UraniumIngot : " + String.valueOf(df.format(output[0] / 1000)) + "K" + "\n");
                }
                if (output[0] >= 1000000.0) {
                    txtingotoutput.append("UraniumIngot : " + String.valueOf(df.format(output[0] / 1000000)) + "M" + "\n");
                }
                break;
            case "Magnesium":
                output[0] = input * oreRatio[10];
                if (output[0] < 1000.0) {
                    txtingotoutput.append("MagnesiumPowder : " + String.valueOf(df.format(output[0])) + "\n");
                }
                if ((output[0] >= 1000.0) && (output[0] < 1000000.0)) {
                    txtingotoutput.append("MagnesiumPowder : " + String.valueOf(df.format(output[0] / 1000)) + "K" + "\n");
                }
                if (output[0] >= 1000000.0) {
                    txtingotoutput.append("MagnesiumPowder : " + String.valueOf(df.format(output[0] / 1000000)) + "M" + "\n");
                }
                break;
            case "Platinum":
                output[0] = input * oreRatio[10];
                if (output[0] < 1000.0) {
                    txtingotoutput.append("PlatinumIngot : " + String.valueOf(df.format(output[0])) + "\n");
                }
                if ((output[0] >= 1000.0) && (output[0] < 1000000.0)) {
                    txtingotoutput.append("PlatinumIngot : " + String.valueOf(df.format(output[0] / 1000)) + "K" + "\n");
                }
                if (output[0] >= 1000000.0) {
                    txtingotoutput.append("PlatinumIngot : " + String.valueOf(df.format(output[0] / 1000000)) + "M" + "\n");
                }
                break;
            case "ScrapMetal":
                output[0] = input * oreRatio[4];
                if (output[0] < 1000.0) {
                    txtingotoutput.append("IronIngot : " + String.valueOf(df.format(output[0])) + "\n");
                }
                if ((output[0] >= 1000.0) && (output[0] < 1000000.0)) {
                    txtingotoutput.append("IronIngot : " + String.valueOf(df.format(output[0] / 1000)) + "K" + "\n");
                }
                if (output[0] >= 1000000.0) {
                    txtingotoutput.append("IronIngot : " + String.valueOf(df.format(output[0] / 1000000)) + "M" + "\n");
                }
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource() == txtoreinput) {
            if (!txtoreinput.getText().isEmpty()) {
                OreCalculate();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == txtoreinput) {
            if (!txtoreinput.getText().isEmpty()) {
                OreCalculate();
            }
        }
    }
}