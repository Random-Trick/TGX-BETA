package x8;

import org.thunderdog.challegram.Log;
import y8.b;

public class f {
    public int[] f26111a;
    public boolean f26112b;

    public static f a(b bVar, int i10) {
        f fVar = new f();
        fVar.f26111a = new int[i10];
        int i11 = 8;
        int i12 = 8;
        int i13 = 0;
        while (i13 < i10) {
            if (i11 != 0) {
                i11 = ((bVar.h("deltaScale") + i12) + Log.TAG_CRASH) % Log.TAG_CRASH;
                fVar.f26112b = i13 == 0 && i11 == 0;
            }
            int[] iArr = fVar.f26111a;
            if (i11 != 0) {
                i12 = i11;
            }
            iArr[i13] = i12;
            i12 = iArr[i13];
            i13++;
        }
        return fVar;
    }

    public String toString() {
        return "ScalingList{scalingList=" + this.f26111a + ", useDefaultScalingMatrixFlag=" + this.f26112b + '}';
    }
}
