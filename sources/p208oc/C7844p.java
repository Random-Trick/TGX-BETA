package p208oc;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import be.C1357a0;

public class C7844p {
    public static FrameLayout.LayoutParams m14881a(int i, float f, int i2, float f2, float f3, float f4, float f5) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m14877e(i), m14877e(f), i2);
        layoutParams.setMargins(C1357a0.m37544i(f2), C1357a0.m37544i(f3), C1357a0.m37544i(f4), C1357a0.m37544i(f5));
        return layoutParams;
    }

    public static LinearLayout.LayoutParams m14880b(int i, int i2) {
        return new LinearLayout.LayoutParams(m14877e(i), m14877e(i2));
    }

    public static LinearLayout.LayoutParams m14879c(int i, int i2, float f, int i3, int i4, int i5, int i6, int i7) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m14877e(i), m14877e(i2), f);
        layoutParams.setMargins(C1357a0.m37544i(i4), C1357a0.m37544i(i5), C1357a0.m37544i(i6), C1357a0.m37544i(i7));
        layoutParams.gravity = i3;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams m14878d(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m14877e(i), m14877e(i2));
        layoutParams.setMargins(C1357a0.m37544i(i4), C1357a0.m37544i(i5), C1357a0.m37544i(i6), C1357a0.m37544i(i7));
        layoutParams.gravity = i3;
        return layoutParams;
    }

    public static int m14877e(float f) {
        if (f >= 0.0f) {
            f = C1357a0.m37544i(f);
        }
        return (int) f;
    }
}
