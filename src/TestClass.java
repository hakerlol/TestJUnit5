import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestClass {
    @Test
    void firstTest() {
        try {
            WorkClass.someFunction(0);
        } catch (NullPointerException e) {
            System.out.println("Передан 0");
        }
    }

    @Test
    void secondTest() {
        try {
            WorkClass.someFunction(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Передано отрицательное число");
        }
    }

    @Test
    void thirdTest() {
        try {
            WorkClass.someFunction(1);
        } catch (IllegalArgumentException e) {
            System.out.println("Передано отрицательное число");
        } catch (NullPointerException e) {
            System.out.println("Передано 0");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Передано положительное число");
        }

    }

    @Test
    void forthTest() {
        try {
            WorkClass.someFunction(-5);
        } catch (Exception e) {
            System.out.println("Передано что-то не то");
        }
    }

    @Test
    void fifthTest() {
        try {
            WorkClass.someFunction(28);
        } catch (IllegalArgumentException e) {
            System.out.println("Передано отрицательное число");
        } catch (NullPointerException e) {
            System.out.println("Передано 0");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Передано положительное число");
        } catch (Exception e) {
            System.out.println("Передано что-то не то");
        }
    }

    @Test
    void annotationTest() {
        Assertions.assertThrows(IndexOutOfBoundsException.class, ()-> WorkClass.someFunction(28));
    }

    @Test
    void nullAssert() {
        String result = WorkClass.getString(null);
        Assertions.assertNull(result);
    }

    @Test
    private void sameAssert() {
        String result = WorkClass.getString("there is smh");
        Assertions.assertNotNull(result);
    }

    @Test
    void equalsAssert() {
        String result = WorkClass.getString("test is completed");
        Assertions.assertEquals("test's completed", result);
    }
}
