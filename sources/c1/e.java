package c1;

import android.graphics.Rect;
import android.view.Gravity;

public final class e {
    public static void a(int i10, int i11, int i12, Rect rect, Rect rect2, int i13) {
        Gravity.apply(i10, i11, i12, rect, rect2, i13);
    }

    public static int b(int i10, int i11) {
        return Gravity.getAbsoluteGravity(i10, i11);
    }
}
