import static org.junit.jupiter.api.Assertions.*;
class BonusServiceTest {
    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredUnderLimit() {
        BonusService service = new BonusService();
        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 30;
        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PASS
        // если false - то FAIL

        //boolean passed = expected == actual;

        // выводим результат
        // System.out.println(passed);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredOverLimit() {
        BonusService service = new BonusService();

        long amount = 100_000_60;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredOverLimit() {
        BonusService service = new BonusService();
        long amount = 100_000_60;
        boolean registered = true;
        long expected = 3000;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredUnderLimit() {
        BonusService service = new BonusService();
        long amount = 100_000_60;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}

























