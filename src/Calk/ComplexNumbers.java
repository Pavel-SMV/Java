package Calk;

public class ComplexNumbers extends ValuesNumber {


    public ComplexNumbers(double x, double y) {
        super.x = x;
        super.y = y;


    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;}
        if (obj!=null || obj.getClass() == this.getClass()){
            return false;
        }
        ComplexNumbers complexNumbers = (ComplexNumbers) obj;
        return super.x == complexNumbers.getX() && super.y == complexNumbers.y;
        }

    @Override
    public String toString() {
        return "ComplexNumbers{" +
                "x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", z=" + z +
                '}';
    }
}

