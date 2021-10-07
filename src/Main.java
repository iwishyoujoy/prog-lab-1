import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        short[] A = new short[9];
        short k = 19;
        for (int i = 0; i < A.length; i++) {
            A[i] = k;
            k -= 2;
        }

        float[] x = new float[14];
        final int MIN = -11;
        final int MAX = 7;
        for (int i = 0; i < x.length; i++) {
            x[i] = ((float) (Math.random() * (MAX - MIN)) + MIN);
        }
        double[][] a = new double[9][14];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                double y = x[j];
                switch (A[i]) {
                    case 9:
                        a[i][j] = Math.log(Math.pow(Math.tan(Math.pow(((0.25 - Math.pow((y * (3 + y)), 3)) /
                                (Math.pow(y, (y - 1) / 6))), Math.cos(y))), 2));
                        break;
                    case 11:
                    case 15:
                    case 17:
                    case 19:
                        a[i][j] = Math.pow((4 / (Math.pow(Math.E, Math.pow(1 - y, 2)) + 0.25)), 2);
                        break;
                    default:
                        a[i][j] = Math.tan(Math.cos(Math.cos(Math.pow((4 * (0.5 - y)), 3))));
                        break;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%.5f" + "\t", a[i][j]);
            }
            System.out.println();
        }
    }
}