package main;

import java.util.ArrayList;
import peasy.PeasyCam;
import java.util.Random;
import behaviour.randomWalkerClass;
import processing.core.PApplet;
import behaviour.InteractionHandler;

public class App extends PApplet {
    ArrayList<randomWalkerClass> randomWalkers = new ArrayList<randomWalkerClass>();
    InteractionHandler interactionHandler = new InteractionHandler();
    PApplet processing;
    Random random = new Random();
    int numberOfworkers = 300;
    PeasyCam cam;
    // String outputPath = "output.csv";
    public int screenWidth = 1200;
    public int screenHeight = 800;
    public int buildingWidth = 2200; // x axis
    public int buildingDepth = 2200; // y axis
    public int buildingHeight = 2200; // z axis

    public void settings() {
        size(screenWidth, screenHeight, P3D);
        mainLoop();
    }

    public void mainLoop() {
        // Adding a particle to the ArrayList particles
        for (int i = 0; i < numberOfworkers; i++) {
            // Adding a particle to the ArrayList particles
            randomWalkers.add(new randomWalkerClass(this, random.nextInt(buildingWidth), random.nextInt(buildingDepth), random.nextInt(buildingHeight)));
            // System.out.println(particle);
        }
    }

    public void setup() {
        background(25);
        cam = new PeasyCam(this, 0, 0, 0, 200);
        colorMode(HSB);
    }

    public void draw() {
        background(25);
         interactionHandler.handleInteractions(randomWalkers); 
        for (randomWalkerClass rw : randomWalkers) {
            rw.run();
            // System.out.println(randomWalkers.size());
            // System.out.println(randomWalkers.toArray());
        }
    }

    public static void main(String[] args) {
        String[] processingArgs = { "test" };
        App appMain = new App();
        PApplet.runSketch(processingArgs, appMain);
    }

}