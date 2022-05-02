package p046d6;

import android.os.SystemClock;

public final class C3786r7 {
    public static void m29759a(C3672f7 f7Var, int i, int i2, long j, int i3, int i4, int i5, int i6) {
        f7Var.m29836b(m29758b(i, i2, j, i3, i4, i5, i6), EnumC3846y4.INPUT_IMAGE_CONSTRUCTION);
    }

    public static C3777q7 m29758b(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        return new C3777q7(i, i2, i5, i3, i4, SystemClock.elapsedRealtime() - j, i6);
    }
}
