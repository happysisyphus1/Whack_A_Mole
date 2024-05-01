import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * this class handles all GUI components and interactions between the buttons and the user
 */
public class GUI extends JFrame implements ActionListener{
    private JLabel stringDisplay;
    private JButton zero;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;


    /**
    * this class makes the button round
    */
    JButton addBtn = new JButton("+");
    addBtn.setBounds(x_pos, y_pos, 30, 25);
    addBtn.setBorder(new RoundedBorder(10)); //10 is the radius
    addBtn.setForeground(Color.BLUE);
    addBtn.setBorder(new RoundedBorder(10));

private static class RoundedBorder implements Border {

    private int radius;


    RoundedBorder(int radius) {
        this.radius = radius;
    }


    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
    }


    public boolean isBorderOpaque() {
        return true;
    }


    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }
}


    
    /**
     * constructor which intializes and creates all components of the GUI
     * @param t string title for the frame of the whole GUI
     */

    public GUI(String t){
        super(t);
    
        setSize(400, 400);
        this.setVisible(true);
        setLayout(new FlowLayout());

        JButton[] buttons = new JButton[7];
        Dimension d = new Dimension(50, 50);
      
        for(int i = 0; i < 7; i++){
            buttons[i] = new JButton("" + i);
            buttons[i].addActionListener(this);
            buttons[i].setPreferredSize(d);
            add(buttons[i]);
        }



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }

    @Override
    /**
     * method gives all buttons in the program functionality
     * @param e event action given by the user
     */
    public void actionPerformed(ActionEvent e) {
        //TODO add code for button behaviors
        if(e.getActionCommand().equals("0")){
            System.out.println("0");
        }

        if(e.getActionCommand().equals("1")){
            System.out.println("1");
        }

        if(e.getActionCommand().equals("2")){
            System.out.println("2");
        }

        if(e.getActionCommand().equals("3")){
            System.out.println("3");
        }

        if(e.getActionCommand().equals("4")){
            System.out.println("4");
        }
    }
}
