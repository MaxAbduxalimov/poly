public class MathFunctions {
    public static long add(long a, long b) {
        return a + b;
    }

    public static double add(long a, double b) {
        return a + b;
    }

    public static double add(double a, long b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    //istalgan toifadagi ikkita sonni ayirmasini qaytaradigan (sub) methodi.
    public static long sub(long a, long b) {
        return a - b;
    }

    public static double sub(long a, double b) {
        return a - b;
    }

    public static double sub(double a, long b) {
        return a - b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    //istalgan toifadagi ikkita sonni ko’paytmasini qaytaradigan (multiply) methodi.

    public static long multiply(long a, long b) {
        return a * b;
    }

    public static double multiply(long a, double b) {
        return a * b;
    }

    public static double multiply(double a, long b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    //Istalgan toifadagi ikkita sonning bo'linmasini qaytaradigan div metodi

    public static long div(long a, long b) {
        return a / b;
    }

    public static double div(long a, double b) {
        return a / b;
    }

    public static double div(double a, long b) {
        return a / b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    //istalgan toifadagi bitta sonning absolyut qiymatini qaytaradigan (abs) methodi.
    public static byte abs(byte a) {
        return (a < 0) ? (byte) (-1 * a) : a;
    }

    public static short abs(short a) {
        return (a < 0) ? (short) (-1 * a) : a;
    }

    public static int abs(int a) {
        return (a < 0) ? (byte) (-1 * a) : a;
    }

    public static long abs(long a) {
        return (a < 0) ? (byte) (-1 * a) : a;
    }

    public static float abs(float a) {
        return (a < 0) ? (float) (-1 * a) : a;
    }

    public static double abs(double a) {
        return (a < 0) ? (double) (-1 * a) : a;
    }
    //istalgan toifadagi bitta sonning kvadrat qiymatini qaytaradigan (pow) methodi.

    public static short pow(byte a) {
        return (short) (a * a);
    }
    public static int pow(short a) {
        return  a * a;
    }
    public static int pow(int a) {
        return  a * a;
    }
    public static long pow(long a) {
        return a * a;
    }
    public static double pow(float a) {
        return a * a;
    }
    public static double pow(double a) {
        return a * a;
    }
}
