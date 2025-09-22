import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ConvView extends JFrame {

    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField textField_in = new JTextField(5);
    private JTextField textFiel_out = new JTextField(20);
    private JButton calcBtn = new JButton("Calculeaza");


    private ConvModel model;

    public ConvView(ConvModel model) {
        this.model = model;

        String[] s1 = {"RON", "EUR", "USD"};
        String[] s2 = {"RON", "EUR", "USD"};

        JPanel general = new JPanel();
        general.setLayout(new GridLayout(2, 1));

        JPanel cont = new JPanel();
        cont.setLayout(new GridLayout(1, 2));

        JPanel panel_1 = new JPanel();
        JPanel panel_2 = new JPanel();
        panel_1.setLayout(new FlowLayout());

        comboBox1 = new JComboBox(s1);
        comboBox1.setEditable(true);
        comboBox2 = new JComboBox(s2);
        comboBox2.setEditable(true);

        panel_1.add(comboBox1);
        panel_2.add(comboBox2);

        cont.add(panel_1);
        cont.add(panel_2);

        JPanel panel_3 = new JPanel();
        panel_3.setLayout(new GridLayout(3, 1));

        panel_3.add(calcBtn);

        JPanel panel_4 = new JPanel();
        panel_4.add(new JLabel("Suma: "));
        panel_4.add(textField_in);
        panel_3.add(panel_4);

        JPanel panel_5 = new JPanel();
        panel_5.add(new JLabel("Rezultat: "));
        panel_5.add(textFiel_out);
        textFiel_out.setEditable(false);
        panel_3.add(panel_5);

        general.add(cont);
        general.add(panel_3);

        this.setContentPane(general);
        this.pack();
        this.setVisible(true);
        this.setTitle("Convertor");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String getUserInput() {
        return textField_in.getText();
    }

    void setTextFiel_out(String number) {
        textFiel_out.setText(number);
    }

    void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }

    void addConvertListener(ActionListener conv) {
        calcBtn.addActionListener(conv);
    }

    int getSelectedItem_1() {
        return comboBox1.getSelectedIndex();
    }

    int getSelectedItem_2() {
        return comboBox2.getSelectedIndex();
    }

}
