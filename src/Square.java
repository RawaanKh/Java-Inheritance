public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side,side);

    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side);
    }
    public double getSide(){

        return this.getWidth()*this.getWidth();
    }
    public double setSide(double width){

        return width;
    }

    @Override
    public String toString() {
        return "Square{}";
    }
}
