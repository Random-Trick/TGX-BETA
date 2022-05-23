package pc;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ce.a0;

public class p {
    public static FrameLayout.LayoutParams a(int i10, float f10, int i11, float f11, float f12, float f13, float f14) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(e(i10), e(f10), i11);
        layoutParams.setMargins(a0.i(f11), a0.i(f12), a0.i(f13), a0.i(f14));
        return layoutParams;
    }

    public static LinearLayout.LayoutParams b(int i10, int i11) {
        return new LinearLayout.LayoutParams(e(i10), e(i11));
    }

    public static LinearLayout.LayoutParams c(int i10, int i11, float f10, int i12, int i13, int i14, int i15, int i16) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(e(i10), e(i11), f10);
        layoutParams.setMargins(a0.i(i13), a0.i(i14), a0.i(i15), a0.i(i16));
        layoutParams.gravity = i12;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams d(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(e(i10), e(i11));
        layoutParams.setMargins(a0.i(i13), a0.i(i14), a0.i(i15), a0.i(i16));
        layoutParams.gravity = i12;
        return layoutParams;
    }

    public static int e(float f10) {
        if (f10 >= 0.0f) {
            f10 = a0.i(f10);
        }
        return (int) f10;
    }
}
