package s;

import androidx.camera.core.u;
import t.f;

public final class j1 {
    public static u a(f fVar) {
        int d10 = fVar.d();
        int i10 = 5;
        if (d10 == 1) {
            i10 = 1;
        } else if (d10 == 2) {
            i10 = 2;
        } else if (d10 == 3) {
            i10 = 3;
        } else if (d10 == 4) {
            i10 = 4;
        } else if (d10 != 5) {
            i10 = d10 != 10001 ? 0 : 6;
        }
        return new u(i10, fVar);
    }
}
