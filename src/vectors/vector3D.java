package vectors;

public class vector3D {
	public float x;
	public float y;
	public float z;
	public Object position;
	public vector3D(){
		this.setX(0);
		this.setY(0);
		this.setZ(0);
	}

	public vector3D(float x, float y, float z){
		this.setX(x);
		this.setY(y);
		this.setZ(z);
	}

	public void setX(float x){
		this.x = x;
	}

	public float getX(){
		return x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getY() {
		return y;
	}

	public void set(float x, float y, float z)

	{
		this.setX(x);
		this.setY(y);
		this.setZ(z);
	}

	public void setZ(float z)

	{
		this.z = z;
	}

	public float getZ()

	{
		return z;
	}

	public String toString()

	{
		return "X: " + getX() + " Y: " + getY() + " Z: " + getZ();
	}

	// public float dot(vector2D vec2D)
	// {
	// float result = 0.0f;
	// result = this.getX() * vec2D.getX() + this.getY() * vec2D.getY();
	// return result;
	// }

	// public float getLength()
	// {
	// return (float)Math.sqrt(getX()*getX() + getY()*getY());
	// }

	// public float getDistance(vector2D vec2D)
	// {
	// return (float) Math.sqrt((vec2D.getX() - getX()) * (vec2D.getX() - getX()) +
	// (vec2D.getY() - getY()) * (vec2D.getY() - getY()));
	// }

	public vector3D add(vector3D vec3D) {

		vector3D result = new vector3D();
		result.setX(getX() + vec3D.getX());
		result.setY(getY() + vec3D.getY());
		result.setZ(getZ() + vec3D.getZ());
		return result;

	}

	public void drawTrail() {
	}

	// public vector2D subtract(vector2D vec2D)
	// {
	// vector2D result = new vector2D();
	// result.setX(this.getX() - vec2D.getX());
	// result.setY(this.getY() - vec2D.getY());
	// return result;
	// }

	// public vector2D multiply(float scaleFactor)
	// {
	// vector2D result = new vector2D();
	// result.setX(this.getX() * scaleFactor);
	// result.setY(this.getY() * scaleFactor);
	// return result;
	// }

	// public vector2D normalize()
	// {
	// float len = getLength();
	// if (len != 0.0f)
	// {
	// this.setX(this.getX() / len);
	// this.setY(this.getY() / len);
	// }
	// else
	// {
	// this.setX(0.0f);
	// this.setY(0.0f);
	// }

	// return this;
	// }

}