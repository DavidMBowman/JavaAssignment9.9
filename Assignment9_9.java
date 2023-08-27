public class Assignment9_9 {

    private int n;
    private double side;
    private double x;
    private double y;

    public static void main(String[] args) {
        Assignment9_9 FristRegularPolygon = new Assignment9_9();
        System.out.println("the area is: " + FristRegularPolygon.getArea() + " the perimeter is " + FristRegularPolygon.getPerimeter());

        Assignment9_9 SecondRegularPolygon = new Assignment9_9(6, 4);
        System.out.println("the area is: " + SecondRegularPolygon.getArea() + " the perimeter is " + SecondRegularPolygon.getPerimeter());

        Assignment9_9 ThirdRegularPolygon = new Assignment9_9(10, 4, 5.6, 7.8);
        System.out.println("the area is: " + ThirdRegularPolygon.getArea() + " the perimeter is " + ThirdRegularPolygon.getPerimeter());
    }

    Assignment9_9() {
        n = 3;
        side = 1;
        x = 0; 
        y = 0;
    }

    Assignment9_9(int n, double side){
        this.n = n;
        this.side = side;
        x = 0;
        y = 0;
    }

    Assignment9_9(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public void setN(int newn){
        n = newn;
    }

    public int getN(){
        return n;
    }

    public void setSide(double newside){
        side = newside;
    }

    public double getSide(){
        return side;
    }

    public void setX(int newx){
        x = newx;
    }

    public double getX(){
        return x;
    }

    public void setY(int newy){
        y = newy;
    }

    public double getY(){
        return y;
    }

    public double getPerimeter(){
        return n * side;
    }

    public double getArea(){
        double s2 = side * side;
        double pin = Math.PI/n;
        double tangent = Math.tan(pin);
        return (n*s2)/(4*tangent);
    }    

}