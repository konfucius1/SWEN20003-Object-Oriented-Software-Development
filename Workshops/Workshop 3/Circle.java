public class Circle {
    public double centreX, centreY, radius;

    public Circle() {
        this.centreX = 0.0;
        this.centreY = 0.0;
        this.radius = 1.0;
    }

    public Circle(double centreX, double centreY, double radius) {
        this.centreX = centreX;
        this.centreY = centreY;
        this.radius = radius;
    }

    public Circle(double r) {
        this.centreX = 0.0;
        this.centreY = 0.0;
        this.radius = r;
    }
}
