public class circleTest {
    public static void main(String args[]) {
        Circle circleA = new Circle();
        System.out.println("Centre X is " + circleA.centreX);
        System.out.println("Centre Y is " + circleA.centreY);
        System.out.println("Radius is " + circleA.radius);
        System.out.println();

        Circle circleB = new Circle(5.0);
        System.out.println("Centre X is " + circleB.centreX);
        System.out.println("Centre Y is " + circleB.centreY);
        System.out.println("Radius is " + circleB.radius);
        System.out.println();

        Circle circleC = new Circle(1.0, 2.0, 3.0);
        System.out.println("Centre X is " + circleC.centreX);
        System.out.println("Centre Y is " + circleC.centreY);
        System.out.println("Radius is " + circleC.radius);
        System.out.println();

    }
}
