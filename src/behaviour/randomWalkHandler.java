package behaviour;

import processing.core.PApplet;
import java.util.ArrayList;
import java.util.Random;

import vectors.vector3D;

///write
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class randomWalkHandler {

    Random random;
    PApplet processing;
    public float x;
    public float y;
    public float z;
    public vector3D loc;
    ArrayList<vector3D> path;

    public randomWalkHandler(PApplet processing, float x, float y, float z) {

        // constructor data
        this.processing = processing;
        this.loc = new vector3D(x, y, z);
        path = new ArrayList<vector3D>();

    }

    public void step() {
        x += processing.random(-1, 1);
        y += processing.random(-1, 1);
        z += processing.random(-1, 1);
        if (x > 0 || x < 0) {
            path.add(new vector3D(x, y, z));
        }
    }

    public float distanceTo(randomWalkHandler other) {
        float dx = this.x - other.x;
        float dy = this.y - other.y;
        float dz = this.z - other.z;
        return PApplet.sqrt(dx*dx + dy*dy + dz*dz);
    }

    // public void draw() {
    //     // text(message.charAt(i),x,height/2);
    //     // text(main.randomWalkerClass.loc.x); 
    //     processing.strokeWeight(2);
    //     processing.stroke(loc.x * 3, 256, 256);
    //     // processing.point(x, y, z);
    //     //write

    // }

    public void draw() {
        float distance = PApplet.sqrt(x * x + y * y + z * z ); // Calculate the distance from the center
        float hue = PApplet.map(distance, 0, PApplet.sqrt(.2f * (255 * 255)), 0, 255); // Map the distance to the hue range (0-255)
        float saturation = PApplet.map((x * x + y * y + z * z), -255 / 2, 255 / 2, 0, 255); // Map the x coordinate to the saturation range (0-255)
        float brightness =  255; // Map the y coordinate to the brightness range (0-255)
        
        processing.strokeWeight(2);
        processing.stroke(hue, saturation, brightness);
        // processing.point(x, y, z);
    }

    public void printlocationData(){
        System.out.println(loc.x + "," + loc.y + "," + loc.z);
        String outputPath = "output.csv";
        try {
            FileWriter fileWriter = new FileWriter(outputPath,true);
            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.write(loc.x + "," + loc.y + "," + loc.z);
                bufferedWriter.newLine();
                // bufferedWriter.close();   
                // System.out.println("CSV file created successfully."); 
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void updateTrails()
    {
        // path.add(loc.);
        path.add(new vector3D ( loc.x , loc.y , loc.z));
    }

    public void trails() {
        for (int i = 0; i < path.size(); i++) {
            vector3D trackpath = (vector3D) path.get(i);
            processing.point(trackpath.x, trackpath.y, trackpath.z);
            // processing.textSize(1);
            // processing.textMode(0);
            // processing.text(loc.x + "," + loc.y + "," + loc.z,trackpath.x, trackpath.y, trackpath.z) ; 
        }

    }

    public void run() {
        step();
        draw();
        // updateTrails();
        trails();
        // printlocationData();
    }

}