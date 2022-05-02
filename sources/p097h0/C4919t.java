package p097h0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

public class C4919t {
    public static final RectF f16781a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix m24454a(Rect rect) {
        return m24453b(new RectF(rect));
    }

    public static Matrix m24453b(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(f16781a, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static Matrix m24452c(RectF rectF, RectF rectF2, int i) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, f16781a, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i);
        matrix.postConcat(m24453b(rectF2));
        return matrix;
    }

    public static boolean m24451d(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i);
    }

    public static boolean m24450e(Size size, boolean z, Size size2, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        if (z) {
            f = size.getWidth() / size.getHeight();
            f2 = f;
        } else {
            f = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            f2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z2) {
            f3 = size2.getWidth() / size2.getHeight();
            f4 = f3;
        } else {
            f4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
            f3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
        }
        return f >= f3 && f4 >= f2;
    }

    public static int m24449f(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalStateException("Unexpected rotation value " + i);
    }
}
