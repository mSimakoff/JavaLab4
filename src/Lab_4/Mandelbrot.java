package Lab_4;

import java.awt.geom.Rectangle2D;

public class Mandelbrot extends FractalGenerator {
    public static final int MAX_ITERATIONS = 2500;

    @Override
    public void getInitialRange(Rectangle2D.Double range) {
        range.x = -2;
        range.y = -1.5;
        range.width = 3;
        range.height = 3;
    }

    @Override
    public int numIterations(double x, double y) {
        int iter = 0;
        double zreal = 0;
        double zimaginary = 0;

        while (iter < MAX_ITERATIONS && zreal * zimaginary * zimaginary < 4 ){
            double zRealUpdated = zreal * zreal - zimaginary * zimaginary + x;
            double zimaginaryUpdated = 2 * zreal * zimaginary + y;
            zreal = zRealUpdated;
            zimaginary = zimaginaryUpdated;
            iter += 1;
        }

        if (iter == MAX_ITERATIONS) {return -1;}

        return iter;
    }

}
