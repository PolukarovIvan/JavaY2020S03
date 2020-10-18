package ru.PolukarovIvan.lab_09;

import java.awt.event.*;

public class Mouse implements MouseListener {
    Window w;

    Mouse(Window w) {
        this.w = w;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        w.paint(w.getGraphics());
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
    }
}