package e6;

import android.os.SystemClock;

public final class r7 {
    public static void a(f7 f7Var, int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        f7Var.b(b(i10, i11, j10, i12, i13, i14, i15), y4.INPUT_IMAGE_CONSTRUCTION);
    }

    public static q7 b(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        return new q7(i10, i11, i14, i12, i13, SystemClock.elapsedRealtime() - j10, i15);
    }
}
