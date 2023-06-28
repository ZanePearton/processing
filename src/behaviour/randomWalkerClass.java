package behaviour;

import processing.core.PApplet;
import java.util.ArrayList;
import java.util.Random;
import vectors.vector3D;

///write
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class randomWalkerClass {

    Random random;
    PApplet processing;
    public float x;
    public float y;
    public float z;
    public vector3D loc;
    ArrayList<vector3D> path;
    // float r = processing.random(256);
    // float g = processing.random(256);
    // float b = processing.random(256);

    public randomWalkerClass(PApplet processing, float x, float y, float z) {

        // constructor data
        this.processing = processing;
        this.loc = new vector3D(x, y, z);
        // public randomWalkerClass( PApplet processing, vector3D location){
        // loc = location ;
        // location = new vector3D(processing.random(200) , processing.random(200) ,
        // processing.random(200) );
        // this.processing = processing;
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

    public void draw() {

        processing.strokeWeight(2);
        processing.stroke(x * 3, 256, 256);
        processing.point(x, y, z);
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
        }

    }

    public void run() {
        step();
        draw();
        // updateTrails();
        trails();
        printlocationData();
    }

}