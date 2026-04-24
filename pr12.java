class Volume {
    double calculateVolume(double side) {
        return side * side * side;
    }
    double calculateVolume(double l, double w, double h) {
        return l * w * h;
    }
    double calculateVolume(double radius, int dummy) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}
public class Main {
    public static void main(String[] args) {
        Volume v = new Volume()
        System.out.println("Cube Volume = " + v.calculateVolume(5));
        System.out.println("Rectangular Cube Volume = " + v.calculateVolume(4, 3, 2));
        System.out.println("Sphere Volume = " + v.calculateVolume(6, 1));
    }
}
