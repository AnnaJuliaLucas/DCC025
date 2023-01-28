import javax.swing.JFrame;

public class Desafio {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        PainelDesenho panel = new PainelDesenho();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.add(panel);
        frame.setVisible(true);
    }
}