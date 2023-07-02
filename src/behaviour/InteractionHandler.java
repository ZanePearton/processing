package behaviour;

import java.util.ArrayList;


public class InteractionHandler {

    float interactionRadius = 1.0f; // adjust this value as needed
    float interactionStrength = 0.01f; // adjust this value as needed

    public InteractionHandler() {
        // Any initializations if needed.
    }

    public void handleInteractions(ArrayList<randomWalkerClass> randomWalkers) {
        for (randomWalkerClass walker : randomWalkers) {
            for (randomWalkerClass other : randomWalkers) {
                if (other != walker && walker.distanceTo(other) < interactionRadius) {
                    walker.x += (other.x - walker.x) * interactionStrength;
                    walker.y += (other.y - walker.y) * interactionStrength;
                    walker.z += (other.z - walker.z) * interactionStrength;
                }
            }
        }
    }
}
