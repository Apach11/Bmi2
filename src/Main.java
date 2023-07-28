public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 89;
        double height = 1.72;
        int Bmi = service.calculate (weight, height);

        System.out.println("Имт " + Bmi);
    }
}