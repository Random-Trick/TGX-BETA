package p315w8;

import org.thunderdog.challegram.Log;
import p330x8.C10159b;

public class C9994f {
    public int[] f32531a;
    public boolean f32532b;

    public static C9994f m6303a(C10159b bVar, int i) {
        C9994f fVar = new C9994f();
        fVar.f32531a = new int[i];
        int i2 = 8;
        int i3 = 8;
        int i4 = 0;
        while (i4 < i) {
            if (i2 != 0) {
                i2 = ((bVar.m5883h("deltaScale") + i3) + Log.TAG_CRASH) % Log.TAG_CRASH;
                fVar.f32532b = i4 == 0 && i2 == 0;
            }
            int[] iArr = fVar.f32531a;
            if (i2 != 0) {
                i3 = i2;
            }
            iArr[i4] = i3;
            i3 = iArr[i4];
            i4++;
        }
        return fVar;
    }

    public String toString() {
        return "ScalingList{scalingList=" + this.f32531a + ", useDefaultScalingMatrixFlag=" + this.f32532b + '}';
    }
}
