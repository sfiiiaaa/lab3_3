import javax.swing.*;
import java.awt.*;

public class OXForm {
    private JLabel lblScoreX;
    private JLabel lblScoreDraw;
    private JLabel lblScoreO;
    private JPanel JPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame fram = new JFrame();
        OXForm form = new OXForm();
        fram.setContentPane(form.mainPanel);
        fram.pack();
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram.setMinimumSize(new Dimension(500,500));
        fram.setVisible(true);
    }
}
