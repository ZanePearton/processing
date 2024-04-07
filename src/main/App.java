package main;

import behaviour.InteractionHandler;
import behaviour.randomWalkHandler;
import java.util.ArrayList;
import java.util.Random;
import peasy.PeasyCam;
import processing.core.PApplet;

public class App extends PApplet {
    
    ArrayList<randomWalkHandler> randomWalkers = new ArrayList<>();
    InteractionHandler interactionHandler = new InteractionHandler();

    Random random = new Random();
    int numberOfWorkers = 2120;
    int numberOfAttractors = 0; // Number of attractors
    PeasyCam cam;

    // Environment dimensions
    public int screenWidth = 1200;
    public int screenHeight = 800;
    public int buildingWidth = 150; // x axis
    public int buildingDepth = 150; // y axis
    public int buildingHeight = 1; // z axis

    @Override
    public void settings() {
        size(screenWidth, screenHeight, P3D);
    }

    @Override
    public void setup() {
        mainLoop();
        background(25);
        cam = new PeasyCam(this, 0, 0, 0, 200);
        colorMode(HSB);
    }

    public void mainLoop() {
        // Initialize walkers
        for (int i = 0; i < numberOfWorkers; i++) {
            randomWalkHandler walker = new randomWalkHandler(
           
                (float) random.nextInt(buildingWidth), 
                (float) random.nextInt(buildingDepth), 
                (float) random.nextInt(buildingHeight)
            );
            randomWalkers.add(walker);
            interactionHandler.addWalker(walker);
        }
        
        // Initialize attractors
        for (int i = 0; i < numberOfAttractors; i++) {
            randomWalkHandler attractor = new randomWalkHandler(
                
                (float) random.nextInt(buildingWidth), 
                (float) random.nextInt(buildingDepth), 
                (float) random.nextInt(buildingHeight)
            );
            // Assuming you want attractors also to be visible or have a role in the environment
            interactionHandler.addAttractor(attractor);
        }
    }

    @Override
    public void draw() {
        background(25);
        interactionHandler.handleInteractions(); // Update walkers' positions based on interactions
        for (randomWalkHandler rw : randomWalkers) {
            rw.draw(this); // Ensure there's a draw method in randomWalkHandler for visualization
        }
    }

    public static void main(String[] args) {
        PApplet.main("main.App");
    }
}

