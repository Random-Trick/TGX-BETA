package sa;

public class C8710b extends C8709a {
    public static final int m11702a(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
