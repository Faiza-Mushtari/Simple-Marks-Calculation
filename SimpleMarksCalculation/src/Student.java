import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField txtMark3;
    private JTextField txtMark2;
    private JTextField txtMark1;
    private JTextField txtName;
    private JButton seeTotalButton;
    private JPanel mainPanel;
    private JTextField txtTotal;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400, 600);
        frame.setLocationRelativeTo(null);
    }

    public Student() {
    seeTotalButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int m1,m2,m3,tot;

            m1 = Integer.parseInt(txtMark1.getText());
            m2 = Integer.parseInt(txtMark2.getText());
            m3 = Integer.parseInt(txtMark3.getText());

            tot = m1 + m2 + m3;

            txtTotal.setText(String.valueOf(tot));
        }
    });
}
}
