import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Button3Listener implements ActionListener {

    JPanel panel1;
    JPanel panel2;

    public Button3Listener(JPanel panel1, JPanel panel2) {
        this.panel1 = panel1;
        this.panel2 = panel2;
    }

    private Color getNewColor(int i){
        switch (i){
            case 0:{
                return Color.RED;
            }
            case 1:{
                return Color.BLUE;
            }
            case 2:{
                return Color.GREEN;
            }
            case 3:{
                return Color.CYAN;
            }
            case 4:{
                return Color.MAGENTA;
            }
            case 5:{
                return Color.YELLOW;
            }
            case 6:{
                return Color.PINK;
            }
            default:{
                return Color.WHITE;
            }
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Random r1 = new Random();
        panel1.setBackground(getNewColor(r1.nextInt(6)));
        panel2.setBackground(getNewColor(r1.nextInt(6)));
    }
}