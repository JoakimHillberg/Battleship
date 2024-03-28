import javax.swing.*;
import java.util.ArrayList;

public class Frame extends JFrame {
    // Attributes
    private int posX;
    private int posY;
    private int frameSize;
    private int rows;
    private int columns;
    private ArrayList<Panel> panels = new ArrayList<>();

    // Constructor
    public Frame(int posX, int posY, int frameSize, int rows, int columns) {
        this.posX = posX;
        this.posY = posY;
        this.frameSize = frameSize;
        this.rows = rows;
        this.columns = columns;

        this.setBounds(posX, posY, frameSize, frameSize);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Battleship");
    }

    // Methods
}
