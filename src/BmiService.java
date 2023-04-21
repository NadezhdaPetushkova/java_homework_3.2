public class BmiService {
    public int calculate(double mHeight, double kgWeight) {
        double bmiIndex = kgWeight / (mHeight * mHeight);
        return (int) bmiIndex;
    }
}
