package by.epam.tasks.classes.seventh;

/*       Описать  класс,  представляющий  треугольник.
         Предусмотреть  методы  для  создания объектов,
         вычисления площади, периметра и точки пересечения медиан.
 */

public class Triangle {
    private final int aX;
    private final int bX;
    private final int cX;
    private final int aY;
    private final int bY;
    private final int cY;
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(int aX, int bX, int cX, int aY, int bY, int cY) {
        this.aX = aX;
        this.bX = bX;
        this.cX = cX;
        this.aY = aY;
        this.bY = bY;
        this.cY = cY;
        this.sideA = calculateSide(aX,bX,aY,bY);
        this.sideB = calculateSide(bX,cX,bY,cY);
        this.sideC = calculateSide(cX,aX,cY,aY);
    }

    private double calculatePerimeter(){
        return sideA+sideB+sideC;
    }

    private double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    private double calculateSide(int aX, int bX,int aY, int bY) {
        return Math.sqrt(Math.pow((bX - aX), 2) + Math.pow((bY - aY), 2));
    }

    private double[] pointMedianIntersection() {
        double x = (aX + bX + cX) / 3;
        double y = (aY + bY + cY) / 3;
        return new double[]{x, y};
    }


    public static void main(String[] args) {
        Triangle triangle = new Triangle(0, 3, 0,0,0,-4);
        System.out.printf("perimeter of the triangle: %f.%n", triangle.calculatePerimeter());
        System.out.printf("area of a triangle: %f.%n", triangle.calculateArea());
        double[] pointMedian = triangle.pointMedianIntersection();
        System.out.printf("median intersection point: (%f,%f).", pointMedian[0], pointMedian[1]);
    }
}
