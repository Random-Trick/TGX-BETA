package n8;

import h8.h;
import h8.n;
import i8.a;
import java.util.ArrayList;
import java.util.List;

public final class b {
    public final a f17755a;
    public final int f17757c;
    public final int f17758d;
    public final int f17759e;
    public final int f17760f;
    public final float f17761g;
    public final n f17763i;
    public final List<a> f17756b = new ArrayList(5);
    public final int[] f17762h = new int[3];

    public b(a aVar, int i10, int i11, int i12, int i13, float f10, n nVar) {
        this.f17755a = aVar;
        this.f17757c = i10;
        this.f17758d = i11;
        this.f17759e = i12;
        this.f17760f = i13;
        this.f17761g = f10;
        this.f17763i = nVar;
    }

    public static float a(int[] iArr, int i10) {
        return (i10 - iArr[2]) - (iArr[1] / 2.0f);
    }

    public final float b(int r10, int r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: n8.b.b(int, int, int, int):float");
    }

    public a c() {
        a e10;
        a e11;
        int i10 = this.f17757c;
        int i11 = this.f17760f;
        int i12 = this.f17759e + i10;
        int i13 = this.f17758d + (i11 / 2);
        int[] iArr = new int[3];
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = ((i14 & 1) == 0 ? (i14 + 1) / 2 : -((i14 + 1) / 2)) + i13;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i16 = i10;
            while (i16 < i12 && !this.f17755a.d(i16, i15)) {
                i16++;
            }
            int i17 = 0;
            while (i16 < i12) {
                if (!this.f17755a.d(i16, i15)) {
                    if (i17 == 1) {
                        i17++;
                    }
                    iArr[i17] = iArr[i17] + 1;
                } else if (i17 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i17 != 2) {
                    i17++;
                    iArr[i17] = iArr[i17] + 1;
                } else if (d(iArr) && (e11 = e(iArr, i15, i16)) != null) {
                    return e11;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i17 = 1;
                }
                i16++;
            }
            if (d(iArr) && (e10 = e(iArr, i15, i12)) != null) {
                return e10;
            }
        }
        if (!this.f17756b.isEmpty()) {
            return this.f17756b.get(0);
        }
        throw h.a();
    }

    public final boolean d(int[] iArr) {
        float f10 = this.f17761g;
        float f11 = f10 / 2.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f10 - iArr[i10]) >= f11) {
                return false;
            }
        }
        return true;
    }

    public final a e(int[] iArr, int i10, int i11) {
        int i12 = iArr[0] + iArr[1] + iArr[2];
        float a10 = a(iArr, i11);
        float b10 = b(i10, (int) a10, iArr[1] * 2, i12);
        if (Float.isNaN(b10)) {
            return null;
        }
        float f10 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (a aVar : this.f17756b) {
            if (aVar.f(f10, b10, a10)) {
                return aVar.g(b10, a10, f10);
            }
        }
        a aVar2 = new a(a10, b10, f10);
        this.f17756b.add(aVar2);
        n nVar = this.f17763i;
        if (nVar == null) {
            return null;
        }
        nVar.a(aVar2);
        return null;
    }
}
