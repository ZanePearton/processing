package vectors;

public class vector3D {
    private float x, y, z;

    public vector3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void normalize() {
        float length = (float) Math.sqrt(x * x + y * y + z * z);
        if (length > 0) {
            x /= length;
            y /= length;
            z /= length;
        }
    }

    public void set(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() { return x; }
    public float getY() { return y; }
    public float getZ() { return z; }
    
    public void multiply(float scalar) {
        this.x *= scalar;
        this.y *= scalar;
        this.z *= scalar;
    }

    public void add(vector3D other) {
        this.x += other.x;
        this.y += other.y;
        this.z += other.z;
    }
}

