public class BmiService {
    public int calculate(double weight, double height) {

        double x = Math.pow(height, 2);

        double result;
        result = weight / x;
        return (int) result;

    }

}
