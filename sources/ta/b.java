package ta;

public class b extends a {
    public static final int a(float f10) {
        if (!Float.isNaN(f10)) {
            return Math.round(f10);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
