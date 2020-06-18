package xogame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;

public class BattleMap extends JPanel {
    private GameWindow gameWindow;
    private Image markerX = new ImageIcon("src/xogame/graphic/markerX.png").getImage();
    private Image markerO = new ImageIcon("src/xogame/graphic/markerO.png").getImage();
    private Image youWin = new ImageIcon("src/xogame/graphic/youwin.png").getImage();
    private Image aiWin = new ImageIcon("src/xogame/graphic/aiwin.png").getImage();
    private Image gameover = new ImageIcon("src/xogame/graphic/gameover.png").getImage();
    private Image mainMenuImage = new ImageIcon("src/xogame/graphic/Xo_game.svg.png").getImage();

    private int gameMode;
    private int fieldSizeX;
    private int fieldSizeY;
    private int dotsToWin;

    private int cellHeight;
    private int cellWidth;

    private boolean isInit = false;

    public BattleMap(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBackground(Color.ORANGE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (isInit) {
                    mouseReleasedUpdate(e);
                }
            }
        });
    }

    private void mouseReleasedUpdate(MouseEvent e) {
        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellHeight;

        if (!Logic.gameFinished) {
            Logic.setHumanCoords(cellX, cellY);
        }

        System.out.printf("cellX: %d  cellY: %d \n", cellX, cellY);

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!isInit){
            drawMainMenuPic((Graphics2D) g, 0,0);
        }
        render(g);

    }

    private void render(Graphics g) {
        if (!isInit) {
            return;
        }

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        cellHeight = panelHeight / fieldSizeY;
        cellWidth = panelWidth / fieldSizeX;

        for (int i = 0; i < fieldSizeY; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, panelWidth, y);
        }

        for (int i = 0; i < fieldSizeX; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, panelHeight);
        }


        for (int i = 0; i < Logic.SIZE; i++) {
            for (int j = 0; j < Logic.SIZE; j++) {
                if (Logic.map[i][j] == Logic.DOT_X) {
                    drawX((Graphics2D) g, j, i);
                }
            }
        }
        for (int i = 0; i < Logic.SIZE; i++) {
            for (int j = 0; j < Logic.SIZE; j++) {
                if (Logic.map[i][j] == Logic.DOT_O) {
                    drawO((Graphics2D) g, j, i);
                    drawWinText((Graphics2D) g, GameWindow.WINDOW_POS_X, GameWindow.WINDOW_POS_Y);
                }
            }
        }
    }

    public void drawWinText(Graphics2D g, int cellX, int cellY) {
        if (Logic.checkWinLines(Logic.DOT_X)) {
            g.drawImage(youWin, 0, 0, cellWidth * fieldSizeX, cellHeight * fieldSizeY, null);
        } else if (Logic.checkWinLines(Logic.DOT_O)) {
            g.drawImage(aiWin, 0, 0, cellWidth * fieldSizeX, cellHeight * fieldSizeY, null);
        } else if (Logic.isFull()) {
            g.drawImage(gameover, 0, 0, cellWidth * fieldSizeX, cellHeight * fieldSizeY, null);
        }
    }

    private void drawMainMenuPic(Graphics2D g, int cellX, int cellY) {
        g.drawImage(mainMenuImage, 0, 0, getWidth(), getHeight(), null);
    }

    private void drawX(Graphics2D g, int cellX, int cellY) {
        g.drawImage(markerX, cellX * cellWidth, cellY * cellHeight, cellWidth, cellHeight, null);
    }

    private void drawO(Graphics2D g, int cellX, int cellY) {
        g.drawImage(markerO, cellX * cellWidth, cellY * cellHeight, cellWidth, cellHeight, null);
    }

    public void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int dotsToWin) {
        this.gameMode = gameMode;
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.dotsToWin = dotsToWin;

        isInit = true;
        repaint();
    }
}
