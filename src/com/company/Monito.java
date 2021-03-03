package com.company;

import javax.swing.*;
import java.awt.*;

class Monito extends JFrame {
    boolean showFirstPhotogram = true;

    public Monito() {
        super("Smiley Guy");
        setSize(200, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawAnimation(g);
    }

    public void drawAnimation(Graphics g) {
        String title = "Smile, life is amazing";
        drawTitle(g, title);
        drawGuy(g);
    }

    void drawTitle(Graphics g, String title) {
        g.drawString(title, 10, 50);
    }

    void drawGuy(Graphics g) {
        drawFace(g);
        drawBody(g);
    }

    void drawFace(Graphics g) {
        drawHead(g);
        drawEyes(g);
    }

    void drawHead(Graphics g){
        g.drawArc(50, 60, 50, 50, 0, 360);
    }

    void drawEyes(Graphics g){
        drawRightEye(g);
        drawLeftEye(g);
        drawMouth(g);
    }

    void drawRightEye(Graphics g) {
        g.fillOval(90, 75, 5, 5);
    }

    void drawLeftEye(Graphics g) {
        g.fillOval(65, 75, 5, 5);
    }

    void drawMouth(Graphics g){
        if (showFirstPhotogram){
            drawSmileyMouth(g);
        }else{
            drawSeriousMouth(g);
        }
    }

    void drawSmileyMouth(Graphics g){
        g.drawArc(70, 90, 20, 10, 180, 180);
    }

    void drawSeriousMouth(Graphics g){
        g.drawLine(70, 100, 90, 100);
    }

    void drawBody(Graphics g) {
        drawTorso(g);
        drawArms(g);
        drawLegs(g);
    }

    void drawTorso(Graphics g) {
        g.drawLine(75, 110, 75, 200);
    }

    void drawArms(Graphics g) {
        drawRightArm(g);
        drawLeftArm(g);
    }

    void drawRightArm(Graphics g) {
        g.drawLine(75, 130, 120, 130);
    }

    void drawLeftArm(Graphics g) {
        g.drawLine(75, 130, 30, 130);
    }

    void drawLegs(Graphics g) {
        drawRightLeg(g);
        drawLeftLeg(g);
    }

    void drawRightLeg(Graphics g){
        g.drawLine(75, 200, 100, 245);
    }

    void drawLeftLeg(Graphics g){
        g.drawLine(75, 200, 50, 245);
    }
}
