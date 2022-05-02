package p179m8;

import java.util.ArrayList;
import java.util.List;
import p093g8.AbstractC4531n;
import p093g8.C4525h;
import p105h8.C5022a;

public final class C6796b {
    public final C5022a f21280a;
    public final int f21282c;
    public final int f21283d;
    public final int f21284e;
    public final int f21285f;
    public final float f21286g;
    public final AbstractC4531n f21288i;
    public final List<C6795a> f21281b = new ArrayList(5);
    public final int[] f21287h = new int[3];

    public C6796b(C5022a aVar, int i, int i2, int i3, int i4, float f, AbstractC4531n nVar) {
        this.f21280a = aVar;
        this.f21282c = i;
        this.f21283d = i2;
        this.f21284e = i3;
        this.f21285f = i4;
        this.f21286g = f;
        this.f21288i = nVar;
    }

    public static float m19030a(int[] iArr, int i) {
        return (i - iArr[2]) - (iArr[1] / 2.0f);
    }

    public final float m19029b(int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: p179m8.C6796b.m19029b(int, int, int, int):float");
    }

    public C6795a m19028c() {
        C6795a e;
        C6795a e2;
        int i = this.f21282c;
        int i2 = this.f21285f;
        int i3 = this.f21284e + i;
        int i4 = this.f21283d + (i2 / 2);
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i5 & 1) == 0 ? (i5 + 1) / 2 : -((i5 + 1) / 2)) + i4;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i7 = i;
            while (i7 < i3 && !this.f21280a.m24281d(i7, i6)) {
                i7++;
            }
            int i8 = 0;
            while (i7 < i3) {
                if (!this.f21280a.m24281d(i7, i6)) {
                    if (i8 == 1) {
                        i8++;
                    }
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i8 != 2) {
                    i8++;
                    iArr[i8] = iArr[i8] + 1;
                } else if (m19027d(iArr) && (e2 = m19026e(iArr, i6, i7)) != null) {
                    return e2;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i8 = 1;
                }
                i7++;
            }
            if (m19027d(iArr) && (e = m19026e(iArr, i6, i3)) != null) {
                return e;
            }
        }
        if (!this.f21281b.isEmpty()) {
            return this.f21281b.get(0);
        }
        throw C4525h.m27496a();
    }

    public final boolean m19027d(int[] iArr) {
        float f = this.f21286g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    public final C6795a m19026e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float a = m19030a(iArr, i2);
        float b = m19029b(i, (int) a, iArr[1] * 2, i3);
        if (Float.isNaN(b)) {
            return null;
        }
        float f = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (C6795a aVar : this.f21281b) {
            if (aVar.m19032f(f, b, a)) {
                return aVar.m19031g(b, a, f);
            }
        }
        C6795a aVar2 = new C6795a(a, b, f);
        this.f21281b.add(aVar2);
        AbstractC4531n nVar = this.f21288i;
        if (nVar == null) {
            return null;
        }
        nVar.m27484a(aVar2);
        return null;
    }
}
