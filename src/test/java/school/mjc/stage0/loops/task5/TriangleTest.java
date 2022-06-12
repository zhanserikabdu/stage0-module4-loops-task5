package school.mjc.stage0.loops.task5;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

class TriangleTest extends BaseIOTest {

    @Test
    void printTriangle() {
        String expected = "8    \n" +
                "88   \n" +
                "888  \n" +
                "8888 \n" +
                "88888\n";
        Triangle triangle = new Triangle();

        triangle.printTriangle(5);

        assertOutEquals(expected);
    }

    @Test
    void printTrianglePrintsMin() {
        String expected = "8  \n" +
                "88 \n" +
                "888\n";
        Triangle triangle = new Triangle();

        triangle.printTriangle(3);

        assertOutEquals(expected);
    }
}