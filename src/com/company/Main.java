package com.company;

public class Main {

    public static void main(String[] args) {
        Monito monito = new Monito();
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception ignored) {
            }
            monito.showFirstPhotogram = !monito.showFirstPhotogram;
            monito.repaint();
        }
    }
}

