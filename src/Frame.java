import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Frame extends JFrame {
    // Attributes
    private int posX;
    private int posY;
    private int frameSize;

    // Constructor
    public Frame(int posX, int posY, int frameSize) {
        this.posX = posX;
        this.posY = posY;
        this.frameSize = frameSize;

        this.setBounds(posX, posY, frameSize, frameSize);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Battleship");
        this.add(new Panel(10, 10, this));
        this.setVisible(true);
    }

    // Methods
}
