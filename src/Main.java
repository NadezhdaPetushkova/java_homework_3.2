public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mHeight = 1.87;
        double kgWeight = 98;
        int bmiIndex = service.calculate(mHeight, kgWeight);
        System.out.println("Ваш индекс массы тела: " + bmiIndex);
    }
}