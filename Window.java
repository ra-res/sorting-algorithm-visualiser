import javax.swing.*;

public class Window{

    public static final int WIDTH = 1000, HEIGHT = 1000;

    public Window(){
        JFrame jf = new JFrame("Visualiser");
        jf.setSize(WIDTH,HEIGHT);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
//        setResizable(false);
        PlotSort sort= new PlotSort();
        jf.add(sort);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}
