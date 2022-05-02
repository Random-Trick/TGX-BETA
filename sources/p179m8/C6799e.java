package p179m8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p093g8.AbstractC4531n;
import p093g8.C4530m;
import p093g8.EnumC4522e;
import p105h8.C5022a;

public class C6799e {
    public static final C6801b f21293f = new C6801b();
    public final C5022a f21294a;
    public boolean f21296c;
    public final AbstractC4531n f21298e;
    public final List<C6798d> f21295b = new ArrayList();
    public final int[] f21297d = new int[5];

    public static final class C6801b implements Serializable, Comparator<C6798d> {
        public C6801b() {
        }

        public int compare(C6798d dVar, C6798d dVar2) {
            return Float.compare(dVar.m19012i(), dVar2.m19012i());
        }
    }

    public C6799e(C5022a aVar, AbstractC4531n nVar) {
        this.f21294a = aVar;
        this.f21298e = nVar;
    }

    public static float m19011a(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static void m19007e(int[] iArr) {
        Arrays.fill(iArr, 0);
    }

    public static void m19006f(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    public static boolean m19003i(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 2.0f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    public static boolean m19002j(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 1.333f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    public static double m18997o(C6798d dVar, C6798d dVar2) {
        double c = dVar.m27487c() - dVar2.m27487c();
        double d = dVar.m27486d() - dVar2.m27486d();
        return (c * c) + (d * d);
    }

    public final boolean m19010b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] k = m19001k();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.f21294a.m24281d(i2 - i6, i - i6)) {
            k[2] = k[2] + 1;
            i6++;
        }
        if (k[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.f21294a.m24281d(i2 - i6, i - i6)) {
            k[1] = k[1] + 1;
            i6++;
        }
        if (k[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.f21294a.m24281d(i2 - i6, i - i6)) {
            k[0] = k[0] + 1;
            i6++;
        }
        if (k[0] == 0) {
            return false;
        }
        int f = this.f21294a.m24279f();
        int h = this.f21294a.m24277h();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 >= f || (i5 = i2 + i7) >= h || !this.f21294a.m24281d(i5, i8)) {
                break;
            }
            k[2] = k[2] + 1;
            i7++;
        }
        while (true) {
            int i9 = i + i7;
            if (i9 >= f || (i4 = i2 + i7) >= h || this.f21294a.m24281d(i4, i9)) {
                break;
            }
            k[3] = k[3] + 1;
            i7++;
        }
        if (k[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 >= f || (i3 = i2 + i7) >= h || !this.f21294a.m24281d(i3, i10)) {
                break;
            }
            k[4] = k[4] + 1;
            i7++;
        }
        if (k[4] == 0) {
            return false;
        }
        return m19002j(k);
    }

    public final float m19009c(int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: p179m8.C6799e.m19009c(int, int, int, int):float");
    }

    public final float m19008d(int r11, int r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: p179m8.C6799e.m19008d(int, int, int, int):float");
    }

    public final C6802f m19005g(Map<EnumC4522e, ?> map) {
        boolean z = map != null && map.containsKey(EnumC4522e.TRY_HARDER);
        int f = this.f21294a.m24279f();
        int h = this.f21294a.m24277h();
        int i = (f * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean z2 = false;
        while (i2 < f && !z2) {
            m19007e(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < h) {
                if (this.f21294a.m24281d(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) != 0) {
                    iArr[i4] = iArr[i4] + 1;
                } else if (i4 == 4) {
                    if (!m19003i(iArr)) {
                        m19006f(iArr);
                    } else if (m19000l(iArr, i2, i3)) {
                        if (this.f21296c) {
                            z2 = m18999m();
                        } else {
                            int h2 = m19004h();
                            if (h2 > iArr[2]) {
                                i2 += (h2 - iArr[2]) - 2;
                                i3 = h - 1;
                            }
                        }
                        m19007e(iArr);
                        i = 2;
                        i4 = 0;
                    } else {
                        m19006f(iArr);
                    }
                    i4 = 3;
                } else {
                    i4++;
                    iArr[i4] = iArr[i4] + 1;
                }
                i3++;
            }
            if (m19003i(iArr) && m19000l(iArr, i2, h)) {
                i = iArr[0];
                if (this.f21296c) {
                    z2 = m18999m();
                }
            }
            i2 += i;
        }
        C6798d[] n = m18998n();
        C4530m.m27485e(n);
        return new C6802f(n);
    }

    public final int m19004h() {
        if (this.f21295b.size() <= 1) {
            return 0;
        }
        C6798d dVar = null;
        for (C6798d dVar2 : this.f21295b) {
            if (dVar2.m19013h() >= 2) {
                if (dVar == null) {
                    dVar = dVar2;
                } else {
                    this.f21296c = true;
                    return ((int) (Math.abs(dVar.m27487c() - dVar2.m27487c()) - Math.abs(dVar.m27486d() - dVar2.m27486d()))) / 2;
                }
            }
        }
        return 0;
    }

    public final int[] m19001k() {
        m19007e(this.f21297d);
        return this.f21297d;
    }

    public final boolean m19000l(int[] iArr, int i, int i2) {
        boolean z = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a = (int) m19011a(iArr, i2);
        float d = m19008d(i, a, iArr[2], i3);
        if (!Float.isNaN(d)) {
            int i4 = (int) d;
            float c = m19009c(a, i4, iArr[2], i3);
            if (!Float.isNaN(c) && m19010b(i4, (int) c)) {
                float f = i3 / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f21295b.size()) {
                        break;
                    }
                    C6798d dVar = this.f21295b.get(i5);
                    if (dVar.m19015f(f, d, c)) {
                        this.f21295b.set(i5, dVar.m19014g(d, c, f));
                        z = true;
                        break;
                    }
                    i5++;
                }
                if (!z) {
                    C6798d dVar2 = new C6798d(c, d, f);
                    this.f21295b.add(dVar2);
                    AbstractC4531n nVar = this.f21298e;
                    if (nVar != null) {
                        nVar.m27484a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean m18999m() {
        int size = this.f21295b.size();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (C6798d dVar : this.f21295b) {
            if (dVar.m19013h() >= 2) {
                i++;
                f2 += dVar.m19012i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / size;
        for (C6798d dVar2 : this.f21295b) {
            f += Math.abs(dVar2.m19012i() - f3);
        }
        return f <= f2 * 0.05f;
    }

    public final p179m8.C6798d[] m18998n() {
        throw new UnsupportedOperationException("Method not decompiled: p179m8.C6799e.m18998n():m8.d[]");
    }
}
