package ld;

import ae.j;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import ce.p0;
import ce.y;
import ib.d;

public final class u {
    public static void a(v vVar) {
        throw new UnsupportedOperationException();
    }

    public static void b(v vVar, Canvas canvas, Path path) {
        vVar.F0(canvas, path, 1.0f);
    }

    public static void c(v vVar, Canvas canvas, Path path, float f10) {
        int i10;
        if (path != null) {
            int left = vVar.getLeft();
            int top = vVar.getTop();
            boolean z10 = (left == 0 && top == 0) ? false : true;
            if (z10) {
                i10 = canvas.save();
                canvas.translate(left, top);
            } else {
                i10 = -1;
            }
            canvas.drawPath(path, f10 != 1.0f ? y.g(d.a(f10, j.E0())) : y.U());
            if (z10) {
                p0.N(canvas, i10);
            }
        }
    }

    public static void d(v vVar, Canvas canvas, int i10) {
        vVar.j1(canvas, i10, j.E0());
    }

    public static void e(v vVar, Canvas canvas, int i10, int i11) {
        if (i10 > 0) {
            RectF a02 = y.a0();
            a02.set(vVar.getLeft(), vVar.getTop(), vVar.getRight(), vVar.getBottom());
            float f10 = i10 * 2;
            if (a02.width() == f10 && a02.height() == f10) {
                canvas.drawCircle(a02.centerX(), a02.centerY(), i10, y.g(i11));
                return;
            }
            float f11 = i10;
            canvas.drawRoundRect(a02, f11, f11, y.g(i11));
            return;
        }
        canvas.drawRect(vVar.getLeft(), vVar.getTop(), vVar.getRight(), vVar.getBottom(), y.g(i11));
    }

    public static void f(v vVar, View view, Rect rect) {
        rect.set(vVar.getLeft(), vVar.getTop(), vVar.getRight(), vVar.getBottom());
    }

    public static boolean g(v vVar, float f10, float f11) {
        return f10 >= ((float) vVar.getLeft()) && f10 <= ((float) vVar.getRight()) && f11 >= ((float) vVar.getTop()) && f11 <= ((float) vVar.getBottom());
    }

    public static void h(v vVar, int i10) {
        throw new UnsupportedOperationException();
    }

    public static void i(v vVar, Rect rect) {
        rect.set(vVar.getLeft(), vVar.getTop(), vVar.getRight(), vVar.getBottom());
    }
}
