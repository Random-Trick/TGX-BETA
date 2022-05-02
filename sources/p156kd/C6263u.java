package p156kd;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import be.C1399s0;
import be.C1410y;
import p108hb.C5064d;
import p364zd.C11524j;

public final class C6263u {
    public static void m20761a(AbstractC6264v vVar) {
        throw new UnsupportedOperationException();
    }

    public static void m20760b(AbstractC6264v vVar, Canvas canvas, Path path) {
        vVar.mo20259E0(canvas, path, 1.0f);
    }

    public static void m20759c(AbstractC6264v vVar, Canvas canvas, Path path, float f) {
        int i;
        if (path != null) {
            int left = vVar.getLeft();
            int top = vVar.getTop();
            boolean z = (left == 0 && top == 0) ? false : true;
            if (z) {
                i = canvas.save();
                canvas.translate(left, top);
            } else {
                i = -1;
            }
            canvas.drawPath(path, f != 1.0f ? C1410y.m37042g(C5064d.m24132a(f, C11524j.m241G0())) : C1410y.m37060U());
            if (z) {
                C1399s0.m37204T(canvas, i);
            }
        }
    }

    public static void m20758d(AbstractC6264v vVar, Canvas canvas, int i) {
        vVar.mo20237m1(canvas, i, C11524j.m241G0());
    }

    public static void m20757e(AbstractC6264v vVar, Canvas canvas, int i, int i2) {
        if (i > 0) {
            RectF a0 = C1410y.m37053a0();
            a0.set(vVar.getLeft(), vVar.getTop(), vVar.getRight(), vVar.getBottom());
            float f = i * 2;
            if (a0.width() == f && a0.height() == f) {
                canvas.drawCircle(a0.centerX(), a0.centerY(), i, C1410y.m37042g(i2));
                return;
            }
            float f2 = i;
            canvas.drawRoundRect(a0, f2, f2, C1410y.m37042g(i2));
            return;
        }
        canvas.drawRect(vVar.getLeft(), vVar.getTop(), vVar.getRight(), vVar.getBottom(), C1410y.m37042g(i2));
    }

    public static void m20756f(AbstractC6264v vVar, View view, Rect rect) {
        rect.set(vVar.getLeft(), vVar.getTop(), vVar.getRight(), vVar.getBottom());
    }

    public static boolean m20755g(AbstractC6264v vVar, float f, float f2) {
        return f >= ((float) vVar.getLeft()) && f <= ((float) vVar.getRight()) && f2 >= ((float) vVar.getTop()) && f2 <= ((float) vVar.getBottom());
    }

    public static void m20754h(AbstractC6264v vVar, int i) {
        throw new UnsupportedOperationException();
    }

    public static void m20753i(AbstractC6264v vVar, Rect rect) {
        rect.set(vVar.getLeft(), vVar.getTop(), vVar.getRight(), vVar.getBottom());
    }
}
