import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
    public class SnakeGame extends JPanel implements KeyListener, ActionListener {

        private final int WIDTH = 400;
        private final int HEIGHT = 400;
        private final int UNIT_SIZE = 20;
        private final int DELAY = 200;
    