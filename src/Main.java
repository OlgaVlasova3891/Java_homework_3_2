public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double weight = 75.3; // Вес
        double height = 1.64; // Рост
        int bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}