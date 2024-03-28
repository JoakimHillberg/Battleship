import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    // Attributes
    private int rows;
    private int columns;
    private Frame myFrame;

    // Constructor
    public Panel(int rows, int columns, Frame myFrame) {
        this.rows = rows;
        this.columns = columns;
        this.myFrame = myFrame;
        this.setLayout(new GridLayout(rows, columns));

        for (int i = 0; i < rows * columns; i++) {
            this.add(new Button(Integer.toString(i)));
        }
    }

    // Methods
}
