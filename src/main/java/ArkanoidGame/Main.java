package ArkanoidGame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Gameplay gameplay = new Gameplay();
        frame.setBounds(10, 10, 700, 600);
        frame.setTitle("Arkanoid");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gameplay);
        Sound.playSound("C:\\PF\\Project Java\\Arkanoid\\src\\main\\resources\\sounds\\sound.wav").join();
    }
}
