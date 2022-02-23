import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton reserveButton;
    private JButton checkoutButton;
    private JButton checkinButton;
    private JButton exitButton;
    private JPanel buttonPanel;
    private JPanel textPanel;
    private JLabel firstLabel;
    private JLabel secondLabel;
    private JLabel thirdLabel;

    public MainFrame() {
        setContentPane(textPanel);
        setSize(300, 300);
        setVisible(true);
        IntelligentParkingSolution IPS = new IntelligentParkingSolution();
        reserveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    IPS.main(1);
                }
                catch (Exception e1) {
                }
            }
        });
        checkinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    IPS.main(2);
                }
                catch (Exception e1) {
                }
            }
        });
        checkoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    IPS.main(3);
                }
                catch (Exception e1) {
                }
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    IPS.main(4);
                }
                catch (Exception e1) {
                }
            }
        });
    }

    public static void main(String[] args) {
        MainFrame f = new MainFrame();
    }
}
