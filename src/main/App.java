package main;
import java.util.Random;

import processing.core.PApplet;

public class App extends PApplet {

    PApplet processing;
    Random random = new Random();
    int numberOfworkers = 30;
    public int screenWidth = 1200;
    public int screenHeight = 800;
    public int buildingWidth = 100; // x axis
    public int buildingDepth = 100; // y axis
    public int buildingHeight = 200; // z axis

    public void settings(){
        size(screenWidth, screenHeight,P2D);
        mainLoop();
    }

    public void mainLoop(){
    }

    public void setup(){
        background(255);
        colorMode(HSB);
    }

    public void draw(){
        background(255);
    }

    public static void main(String[] args) {
        String[] processingArgs = { "test" };
        App appMain = new App();
        PApplet.runSketch(processingArgs, appMain);
    }

}