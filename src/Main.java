public class Main {
    public static void main(String[] args) {
        BmiServiced service = new BmiServiced();
        double index = service.calculate(95, 189);
        System.out.println("Ваш индекс " + index);
    }
}