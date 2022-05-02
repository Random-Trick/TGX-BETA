package p121i8;

public final class C5262a {
    public static float m23494a(float f, float f2, float f3, float f4) {
        double d = f - f3;
        double d2 = f2 - f4;
        return (float) Math.sqrt((d * d) + (d2 * d2));
    }

    public static float m23493b(int i, int i2, int i3, int i4) {
        double d = i - i3;
        double d2 = i2 - i4;
        return (float) Math.sqrt((d * d) + (d2 * d2));
    }

    public static int m23492c(float f) {
        return (int) (f + (f < 0.0f ? -0.5f : 0.5f));
    }
}
