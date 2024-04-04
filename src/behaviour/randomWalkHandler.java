package behaviour;

import processing.core.PApplet; // Ensure PApplet is imported

public class randomWalkHandler {
    public float x, y, z; // Position of the walker/attractor

    // Constructor remains unchanged
    public randomWalkHandler(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // distanceTo method remains unchanged
    public float distanceTo(randomWalkHandler other) {
        float dx = this.x - other.x;
        float dy = this.y - other.y;
        float dz = this.z - other.z;
        return (float) Math.sqrt(dx*dx + dy*dy + dz*dz);
    }

    // Optional: update method for any logic updates
    public void update() {
        // Behavior logic here (if necessary)
    }

    // draw method updated for drawing points
    public void draw(PApplet p) {
        p.stroke(255); // Set point color to white
        p.strokeWeight(3); // Set point size
        p.point(x, y, z); // Draw a point at (x, y, z)
    }
}

