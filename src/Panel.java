import javax.swing.*;

public class Panel extends JPanel {
    // Attributes
    Frame myFrame;

    // Constructor
    public Panel(Frame myFrame) {
        this.myFrame = myFrame;
        this.setVisible(true);
    }
}
