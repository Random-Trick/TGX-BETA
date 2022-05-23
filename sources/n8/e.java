package n8;

import h8.m;
import h8.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class e {
    public static final b f17768f = new b();
    public final i8.a f17769a;
    public boolean f17771c;
    public final n f17773e;
    public final List<d> f17770b = new ArrayList();
    public final int[] f17772d = new int[5];

    public static final class b implements Serializable, Comparator<d> {
        public b() {
        }

        public int compare(d dVar, d dVar2) {
            return Float.compare(dVar.i(), dVar2.i());
        }
    }

    public e(i8.a aVar, n nVar) {
        this.f17769a = aVar;
        this.f17773e = nVar;
    }

    public static float a(int[] iArr, int i10) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static void e(int[] iArr) {
        Arrays.fill(iArr, 0);
    }

    public static void f(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    public static boolean i(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = f10 / 2.0f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    public static boolean j(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = f10 / 1.333f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    public static double o(d dVar, d dVar2) {
        double c10 = dVar.c() - dVar2.c();
        double d10 = dVar.d() - dVar2.d();
        return (c10 * c10) + (d10 * d10);
    }

    public final boolean b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int[] k10 = k();
        int i15 = 0;
        while (i10 >= i15 && i11 >= i15 && this.f17769a.d(i11 - i15, i10 - i15)) {
            k10[2] = k10[2] + 1;
            i15++;
        }
        if (k10[2] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && !this.f17769a.d(i11 - i15, i10 - i15)) {
            k10[1] = k10[1] + 1;
            i15++;
        }
        if (k10[1] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && this.f17769a.d(i11 - i15, i10 - i15)) {
            k10[0] = k10[0] + 1;
            i15++;
        }
        if (k10[0] == 0) {
            return false;
        }
        int f10 = this.f17769a.f();
        int h10 = this.f17769a.h();
        int i16 = 1;
        while (true) {
            int i17 = i10 + i16;
            if (i17 >= f10 || (i14 = i11 + i16) >= h10 || !this.f17769a.d(i14, i17)) {
                break;
            }
            k10[2] = k10[2] + 1;
            i16++;
        }
        while (true) {
            int i18 = i10 + i16;
            if (i18 >= f10 || (i13 = i11 + i16) >= h10 || this.f17769a.d(i13, i18)) {
                break;
            }
            k10[3] = k10[3] + 1;
            i16++;
        }
        if (k10[3] == 0) {
            return false;
        }
        while (true) {
            int i19 = i10 + i16;
            if (i19 >= f10 || (i12 = i11 + i16) >= h10 || !this.f17769a.d(i12, i19)) {
                break;
            }
            k10[4] = k10[4] + 1;
            i16++;
        }
        if (k10[4] == 0) {
            return false;
        }
        return j(k10);
    }

    public final float c(int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: n8.e.c(int, int, int, int):float");
    }

    public final float d(int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: n8.e.d(int, int, int, int):float");
    }

    public final f g(Map<h8.e, ?> map) {
        boolean z10 = map != null && map.containsKey(h8.e.TRY_HARDER);
        int f10 = this.f17769a.f();
        int h10 = this.f17769a.h();
        int i10 = (f10 * 3) / 388;
        if (i10 < 3 || z10) {
            i10 = 3;
        }
        int[] iArr = new int[5];
        int i11 = i10 - 1;
        boolean z11 = false;
        while (i11 < f10 && !z11) {
            e(iArr);
            int i12 = 0;
            int i13 = 0;
            while (i12 < h10) {
                if (this.f17769a.d(i12, i11)) {
                    if ((i13 & 1) == 1) {
                        i13++;
                    }
                    iArr[i13] = iArr[i13] + 1;
                } else if ((i13 & 1) != 0) {
                    iArr[i13] = iArr[i13] + 1;
                } else if (i13 == 4) {
                    if (!i(iArr)) {
                        f(iArr);
                    } else if (l(iArr, i11, i12)) {
                        if (this.f17771c) {
                            z11 = m();
                        } else {
                            int h11 = h();
                            if (h11 > iArr[2]) {
                                i11 += (h11 - iArr[2]) - 2;
                                i12 = h10 - 1;
                            }
                        }
                        e(iArr);
                        i10 = 2;
                        i13 = 0;
                    } else {
                        f(iArr);
                    }
                    i13 = 3;
                } else {
                    i13++;
                    iArr[i13] = iArr[i13] + 1;
                }
                i12++;
            }
            if (i(iArr) && l(iArr, i11, h10)) {
                i10 = iArr[0];
                if (this.f17771c) {
                    z11 = m();
                }
            }
            i11 += i10;
        }
        d[] n10 = n();
        m.e(n10);
        return new f(n10);
    }

    public final int h() {
        if (this.f17770b.size() <= 1) {
            return 0;
        }
        d dVar = null;
        for (d dVar2 : this.f17770b) {
            if (dVar2.h() >= 2) {
                if (dVar == null) {
                    dVar = dVar2;
                } else {
                    this.f17771c = true;
                    return ((int) (Math.abs(dVar.c() - dVar2.c()) - Math.abs(dVar.d() - dVar2.d()))) / 2;
                }
            }
        }
        return 0;
    }

    public final int[] k() {
        e(this.f17772d);
        return this.f17772d;
    }

    public final boolean l(int[] iArr, int i10, int i11) {
        boolean z10 = false;
        int i12 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a10 = (int) a(iArr, i11);
        float d10 = d(i10, a10, iArr[2], i12);
        if (!Float.isNaN(d10)) {
            int i13 = (int) d10;
            float c10 = c(a10, i13, iArr[2], i12);
            if (!Float.isNaN(c10) && b(i13, (int) c10)) {
                float f10 = i12 / 7.0f;
                int i14 = 0;
                while (true) {
                    if (i14 >= this.f17770b.size()) {
                        break;
                    }
                    d dVar = this.f17770b.get(i14);
                    if (dVar.f(f10, d10, c10)) {
                        this.f17770b.set(i14, dVar.g(d10, c10, f10));
                        z10 = true;
                        break;
                    }
                    i14++;
                }
                if (!z10) {
                    d dVar2 = new d(c10, d10, f10);
                    this.f17770b.add(dVar2);
                    n nVar = this.f17773e;
                    if (nVar != null) {
                        nVar.a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        int size = this.f17770b.size();
        float f10 = 0.0f;
        int i10 = 0;
        float f11 = 0.0f;
        for (d dVar : this.f17770b) {
            if (dVar.h() >= 2) {
                i10++;
                f11 += dVar.i();
            }
        }
        if (i10 < 3) {
            return false;
        }
        float f12 = f11 / size;
        for (d dVar2 : this.f17770b) {
            f10 += Math.abs(dVar2.i() - f12);
        }
        return f10 <= f11 * 0.05f;
    }

    public final n8.d[] n() {
        throw new UnsupportedOperationException("Method not decompiled: n8.e.n():n8.d[]");
    }
}
