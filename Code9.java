package classCode;
abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    double l, b;
    Rectangle(double l, double b) {
    	this.l = l; this.b = b;
    	}
    double area() {
    	return l * b; 
    	}
}

class Triangle extends Shape {
    double b, h;
    Triangle(double b, double h) { 
    	this.b = b; this.h = h;
    	}
    double area() { 
    	return 0.5 * b * h; 
    	}
}

class Circle extends Shape {
    double r;
    Circle(double r) 
    { this.r = r;
    }
    double area() { 
    	return Math.PI * r * r; 
    	}
}

public class Code9 {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(5, 3);
        Shape s2 = new Triangle(4, 6);
        Shape s3 = new Circle(7);

        System.out.println("Rectangle: " + s1.area());
        System.out.println("Triangle: " + s2.area());
        System.out.println("Circle: " + s3.area());
    }
}

 


