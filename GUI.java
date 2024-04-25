import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI extends JFrame implements ActionListener{
    private JLabel stringDisplay;
    private JButton zero;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;

    public GUI(String t){
        super(t);
    
        setSize(200, 200);
        this.setVisible(true);
        setLayout(new FlowLayout());

        stringDisplay = new JLabel("                  _____                  ");
        add(stringDisplay);
        zero = new JButton("0");
        zero.addActionListener(this);
        add(zero);

        one = new JButton("1");
        one.addActionListener(this);
        add(one);

        two = new JButton("2");
        two.addActionListener(this);
        add(two);

        three = new JButton("3");
        three.addActionListener(this);
        add(three);

        four = new JButton("4");
        four.addActionListener(this);
        add(four);



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }

    @Override
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