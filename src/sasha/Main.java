package sasha;
import java.awt.*;
import javax.swing.*;
import javax.sound.midi.*;
import java.util.*;
import java.awt.event.*;

class Game {
    JPanel mainPanel;
    ArrayList<JButton> coordinates;
    Sequencer sequencer;
    Sequence sequence;
    Track track;
    JFrame theFrame;

    public void battleField() {
        theFrame = new JFrame("X-O");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theFrame.setResizable(false);
        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        coordinates = new ArrayList<JButton>();
        //checkboxList = new ArrayList<JCheckBox>();
        Box buttonBox = new Box(BoxLayout.Y_AXIS);

        JButton start = new JButton("Start");
        //start.addActionListener(new MyStartListener());
        buttonBox.add(start);

        JButton stop = new JButton("Stop");
        //stop.addActionListener(new MyStopListener());
        buttonBox.add(stop);

        JButton upTempo = new JButton("Tempo Up");
        //upTempo.addActionListener(new MyUpTempoListener());
        buttonBox.add(upTempo);

        JButton downTempo = new JButton("Tempo Down");
        //downTempo.addActionListener(new MyDownTempoListener());
        buttonBox.add(downTempo);

        /*Box nameBox = new Box(BoxLayout.Y_AXIS);
        for (int i = 0; i < 16; i++) {
            nameBox.add(new Label(instrumentNames[i]));
        }*/

        background.add(BorderLayout.EAST, buttonBox);
        //background.add(BorderLayout.WEST, nameBox);

        theFrame.getContentPane().add(background);

        GridLayout grid = new GridLayout(3,3);
        grid.setVgap(1);
        grid.setHgap(2);
        mainPanel = new JPanel(grid);
        background.add(BorderLayout.CENTER, mainPanel);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JTextArea field = new JTextArea(" ");
                Font bigFont = new Font("serif", Font.BOLD, 30);
                field.setFont(bigFont);
                buttonBox.add(field);
                //coordinates.add(nameB);
                mainPanel.add(field);
            }
        }

        //setUpMidi();

        theFrame.setBounds(50,50,300,300);
        theFrame.pack();
        theFrame.setVisible(true);
    } // close method


}


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Its Work");
        Game game = new Game();
        game.battleField();
    }
}
