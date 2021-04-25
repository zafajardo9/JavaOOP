import java.util.*;
//Abstraction
//Encap
public class Gunio_Cube { // act as the main
    //need palitan ang name ng class na to base sa filename
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int side;
        System.out.println("Enter the value of the side");
        side = input.nextInt();
        Cube cube = new Cube(side);
        System.out.println("Side :" + side);
        System.out.println("Volume :" + cube.getVolume());
        System.out.println("Length :" + cube.getLength());
        System.out.println("Width :" + cube.getWidth());
        System.out.println("Height :" + cube.getHeight());
    }
}


abstract class Shape {

    private int length;
    private int width;
    private int height;

    public Shape(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    //get and set length
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    //get and set width
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    //get and set height
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

}

class Cube extends Shape{ //will be the main function
    public Cube(int side) {
        super(side, side, side);
    }

    int getVolume() {
        return getLength() * getWidth() * getHeight();
    }
}

