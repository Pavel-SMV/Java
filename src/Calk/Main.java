package Calk;

public class Main {


    public static void main(String[] args) {
        ValuesNumber complexTest1;
        complexTest1 = new ComplexNumbers(14,15);
        complexTest1.setW(2.0);
        complexTest1.setZ(3.4);
        CalculateComplex calculateComplex = new CalculateComplex(complexTest1.getX(), complexTest1.getY());
        System.out.println("sum=" + calculateComplex.sum());


    }
}
