package h0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

public class t {
    public static final RectF f12449a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix a(Rect rect) {
        return b(new RectF(rect));
    }

    public static Matrix b(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f12449a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static Matrix c(RectF rectF, RectF rectF2, int i10) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f12449a, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i10);
        matrix.postConcat(b(rectF2));
        return matrix;
    }

    public static boolean d(int i10) {
        if (i10 == 90 || i10 == 270) {
            return true;
        }
        if (i10 == 0 || i10 == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i10);
    }

    public static boolean e(Size size, boolean z10, Size size2, boolean z11) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (z10) {
            f10 = size.getWidth() / size.getHeight();
            f11 = f10;
        } else {
            f10 = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            f11 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z11) {
            f12 = size2.getWidth() / size2.getHeight();
            f13 = f12;
        } else {
            f13 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
            f12 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
        }
        return f10 >= f12 && f13 >= f11;
    }

    public static int f(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 90;
        }
        if (i10 == 2) {
            return 180;
        }
        if (i10 == 3) {
            return 270;
        }
        throw new IllegalStateException("Unexpected rotation value " + i10);
    }
}
