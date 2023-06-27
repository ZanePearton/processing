// package main;
// import java.util.Random;

// import processing.core.PApplet;

// public class App extends PApplet {

//     PApplet processing;
//     Random random = new Random();
//     int numberOfworkers = 30;
//     public int screenWidth = 1200;
//     public int screenHeight = 800;
//     public int buildingWidth = 100; // x axis
//     public int buildingDepth = 100; // y axis
//     public int buildingHeight = 200; // z axis

//     public void settings(){
//         size(screenWidth, screenHeight,P2D);
//         mainLoop();
//     }

//     public void mainLoop(){
//     }

//     public void setup(){
//         background(255);
//         colorMode(HSB);
//     }

//     public void draw(){
//         background(255);
//     }

//     public static void main(String[] args) {
//         String[] processingArgs = { "test" };
//         App appMain = new App();
//         PApplet.runSketch(processingArgs, appMain);
//     }

// }

package main;
import java.util.ArrayList;
import peasy.PeasyCam;
import java.util.Random;
import behaviour.randomWalkerClass;
import processing.core.PApplet;

public class App extends PApplet {
    ArrayList<randomWalkerClass> randomWalkers = new ArrayList<randomWalkerClass>();
    // ArrayList<randomWalkerClass> trail = new ArrayList<randomWalkerClass>();
    PApplet processing;
    Random random = new Random();
    int numberOfworkers = 30;
    PeasyCam cam;
    public int screenWidth = 1200;
    public int screenHeight = 800;
    public int buildingWidth = 100; // x axis
    public int buildingDepth = 100; // y axis
    public int buildingHeight = 200; // z axis
    public void settings(){
        size(screenWidth, screenHeight, P3D);
        // mainLoop();
    }

    // public void mainLoop(){
    //     // Adding a particle to the ArrayList particles
    //     for (int i = 0; i < numberOfworkers; i++) {
    //         // Adding a particle to the ArrayList particles
    //         randomWalkers.add(new randomWalkerClass(this, random.nextInt(buildingWidth), random.nextInt(buildingDepth),
    //                 random.nextInt(buildingHeight)));
    //         // System.out.println(particle);
    //     }
    // }

    public void setup(){
        background(25);
        cam = new PeasyCam(this, 0, 0, 0, 200);
        // colorMode(HSB);
    }

    public void draw(){
        background(25);
        // for (randomWalkerClass rw : randomWalkers) {
        //     rw.run();
        // }
    }


        public static void main(String[] args) {
        String[] processingArgs = { "test" };
        App appMain = new App();
        PApplet.runSketch(processingArgs, appMain);
    }

}