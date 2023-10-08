import ru.netelogy.javaqa.freelancer1.services.BonusService;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        System.out.println("1. " + expected + "== ? ==" + actual);

        expected = 3;
        actual = service.calculate(10_000, 3_000, 20_000);
        System.out.println("2. " + expected + "== ? ==" + actual);
    }
}