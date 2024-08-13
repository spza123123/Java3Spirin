public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.sum(45f, 5d));
        System.out.println(calc.divide(45d, 5));
        System.out.println(calc.multiply(45, 5f));
        System.out.println(calc.subtract(45d, 5f));
        Integer [] a = {1,2,3};
        Integer [] b = {1,2,3};

        System.out.println(calc.compareArrays(a, b));
    }


}