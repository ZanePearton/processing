package behaviour;

import java.util.ArrayList;
import vectors.vector3D;

public class InteractionHandler {
    ArrayList<randomWalkHandler> walkers = new ArrayList<>();
    ArrayList<randomWalkHandler> attractors = new ArrayList<>();

    public InteractionHandler() {
    }

    public void addWalker(randomWalkHandler walker) {
        walkers.add(walker);
    }

    public void addAttractor(randomWalkHandler attractor) {
        attractors.add(attractor);
    }

    public void handleInteractions() {
        for (randomWalkHandler walker : walkers) {
            vector3D aggregateForce = new vector3D(0, 0, 0);
            for (randomWalkHandler attractor : attractors) {
                float distance = walker.distanceTo(attractor);
                if (distance < 100.0f && distance > 0) { // Assume some radius and non-zero distance
                    vector3D direction = new vector3D(attractor.x - walker.x, attractor.y - walker.y, attractor.z - walker.z);
                    direction.normalize();
                    direction.multiply(1.0f / distance); // Simple inverse-distance influence
                    aggregateForce.add(direction);
                }
            }
            walker.x += aggregateForce.getX();
            walker.y += aggregateForce.getY();
            walker.z += aggregateForce.getZ();
        }
    }
}

