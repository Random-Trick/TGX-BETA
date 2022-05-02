package p027c0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.AbstractC0688y2;
import java.util.HashMap;
import java.util.Map;
import p016b1.C1132h;
import p085g0.C4439a;

public class C1429n {
    public static Map<AbstractC0688y2, Rect> m36957a(Rect rect, boolean z, Rational rational, int i, int i2, int i3, Map<AbstractC0688y2, Size> map) {
        C1132h.m38325b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        HashMap hashMap = new HashMap();
        RectF rectF2 = new RectF(rect);
        for (Map.Entry<AbstractC0688y2, Size> entry : map.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF3 = new RectF(0.0f, 0.0f, entry.getValue().getWidth(), entry.getValue().getHeight());
            matrix.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.CENTER);
            hashMap.put(entry.getKey(), matrix);
            RectF rectF4 = new RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        RectF g = m36951g(rectF2, C4439a.m27666d(i, rational), i2, z, i3, i);
        HashMap hashMap2 = new HashMap();
        RectF rectF5 = new RectF();
        Matrix matrix2 = new Matrix();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, g);
            Rect rect2 = new Rect();
            rectF5.round(rect2);
            hashMap2.put((AbstractC0688y2) entry2.getKey(), rect2);
        }
        return hashMap2;
    }

    public static RectF m36956b(boolean z, int i, RectF rectF, RectF rectF2) {
        boolean z2 = true;
        boolean z3 = i == 0 && !z;
        boolean z4 = i == 90 && z;
        if (z3 || z4) {
            return rectF2;
        }
        boolean z5 = i == 0 && z;
        boolean z6 = i == 270 && !z;
        if (z5 || z6) {
            return m36955c(rectF2, rectF.centerX());
        }
        boolean z7 = i == 90 && !z;
        boolean z8 = i == 180 && z;
        if (z7 || z8) {
            return m36954d(rectF2, rectF.centerY());
        }
        boolean z9 = i == 180 && !z;
        if (i != 270 || !z) {
            z2 = false;
        }
        if (z9 || z2) {
            return m36955c(m36954d(rectF2, rectF.centerY()), rectF.centerX());
        }
        throw new IllegalArgumentException("Invalid argument: mirrored " + z + " rotation " + i);
    }

    public static RectF m36955c(RectF rectF, float f) {
        return new RectF(m36953e(rectF.right, f), rectF.top, m36953e(rectF.left, f), rectF.bottom);
    }

    public static RectF m36954d(RectF rectF, float f) {
        return new RectF(rectF.left, m36952f(rectF.bottom, f), rectF.right, m36952f(rectF.top, f));
    }

    public static float m36953e(float f, float f2) {
        return (f2 + f2) - f;
    }

    public static float m36952f(float f, float f2) {
        return (f2 + f2) - f;
    }

    @SuppressLint({"SwitchIntDef"})
    public static RectF m36951g(RectF rectF, Rational rational, int i, boolean z, int i2, int i3) {
        if (i == 3) {
            return rectF;
        }
        Matrix matrix = new Matrix();
        RectF rectF2 = new RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i == 0) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.START);
        } else if (i == 1) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
        } else if (i == 2) {
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.END);
        } else {
            throw new IllegalStateException("Unexpected scale type: " + i);
        }
        RectF rectF3 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        return m36956b(m36950h(z, i2), i3, rectF, rectF3);
    }

    public static boolean m36950h(boolean z, int i) {
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        return z ^ z2;
    }
}
