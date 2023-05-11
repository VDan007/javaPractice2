import javax.swing.JFrame;

public class Drag_DropFrame extends JFrame {

    Drag_Panel panel;
    
    Drag_DropFrame(){

        panel = new Drag_Panel();

        this.add(panel);
        this.setTitle("Drag & Drop Demo");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
