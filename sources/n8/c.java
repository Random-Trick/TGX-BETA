package n8;

import h8.e;
import h8.h;
import h8.m;
import h8.n;
import i8.a;
import i8.f;
import i8.j;
import java.util.Map;

public class c {
    public final a f17764a;
    public n f17765b;

    public c(a aVar) {
        this.f17764a = aVar;
    }

    public static int c(m mVar, m mVar2, m mVar3, float f10) {
        int c10 = ((j8.a.c(m.b(mVar, mVar2) / f10) + j8.a.c(m.b(mVar, mVar3) / f10)) / 2) + 7;
        int i10 = c10 & 3;
        if (i10 == 0) {
            return c10 + 1;
        }
        if (i10 == 2) {
            return c10 - 1;
        }
        if (i10 != 3) {
            return c10;
        }
        throw h.a();
    }

    public static j d(m mVar, m mVar2, m mVar3, m mVar4, int i10) {
        float f10;
        float f11;
        float f12;
        float f13 = i10 - 3.5f;
        if (mVar4 != null) {
            f12 = f13 - 3.0f;
            f11 = mVar4.c();
            f10 = mVar4.d();
        } else {
            f11 = (mVar2.c() - mVar.c()) + mVar3.c();
            f10 = (mVar2.d() - mVar.d()) + mVar3.d();
            f12 = f13;
        }
        return j.b(3.5f, 3.5f, f13, 3.5f, f12, f12, 3.5f, f13, mVar.c(), mVar.d(), mVar2.c(), mVar2.d(), f11, f10, mVar3.c(), mVar3.d());
    }

    public static a h(a aVar, j jVar, int i10) {
        return i8.h.b().c(aVar, i10, i10, jVar);
    }

    public final float a(m mVar, m mVar2, m mVar3) {
        return (b(mVar, mVar2) + b(mVar, mVar3)) / 2.0f;
    }

    public final float b(m mVar, m mVar2) {
        float j10 = j((int) mVar.c(), (int) mVar.d(), (int) mVar2.c(), (int) mVar2.d());
        float j11 = j((int) mVar2.c(), (int) mVar2.d(), (int) mVar.c(), (int) mVar.d());
        return Float.isNaN(j10) ? j11 / 7.0f : Float.isNaN(j11) ? j10 / 7.0f : (j10 + j11) / 14.0f;
    }

    public final f e(Map<e, ?> map) {
        this.f17765b = map == null ? null : (n) map.get(e.NEED_RESULT_POINT_CALLBACK);
        return g(new e(this.f17764a, this.f17765b).g(map));
    }

    public final a f(float f10, int i10, int i11, float f11) {
        int i12 = (int) (f11 * f10);
        int max = Math.max(0, i10 - i12);
        int min = Math.min(this.f17764a.h() - 1, i10 + i12) - max;
        float f12 = 3.0f * f10;
        if (min >= f12) {
            int max2 = Math.max(0, i11 - i12);
            int min2 = Math.min(this.f17764a.f() - 1, i11 + i12) - max2;
            if (min2 >= f12) {
                return new b(this.f17764a, max, max2, min, min2, f10, this.f17765b).c();
            }
            throw h.a();
        }
        throw h.a();
    }

    public final f g(f fVar) {
        d b10 = fVar.b();
        d c10 = fVar.c();
        d a10 = fVar.a();
        float a11 = a(b10, c10, a10);
        if (a11 >= 1.0f) {
            int c11 = c(b10, c10, a10, a11);
            m8.j g10 = m8.j.g(c11);
            int e10 = g10.e() - 7;
            a aVar = null;
            if (g10.d().length > 0) {
                float c12 = (c10.c() - b10.c()) + a10.c();
                float d10 = (c10.d() - b10.d()) + a10.d();
                float f10 = 1.0f - (3.0f / e10);
                int c13 = (int) (b10.c() + ((c12 - b10.c()) * f10));
                int d11 = (int) (b10.d() + (f10 * (d10 - b10.d())));
                for (int i10 = 4; i10 <= 16; i10 <<= 1) {
                    try {
                        aVar = f(a11, c13, d11, i10);
                        break;
                    } catch (h unused) {
                    }
                }
            }
            return new f(h(this.f17764a, d(b10, c10, a10, aVar, c11), c11), aVar == null ? new m[]{a10, b10, c10} : new m[]{a10, b10, c10, aVar});
        }
        throw h.a();
    }

    public final float i(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        c cVar;
        boolean z11;
        int i19 = 1;
        boolean z12 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z12) {
            i16 = i10;
            i17 = i11;
            i14 = i12;
            i15 = i13;
        } else {
            i17 = i10;
            i16 = i11;
            i15 = i12;
            i14 = i13;
        }
        int abs = Math.abs(i15 - i17);
        int abs2 = Math.abs(i14 - i16);
        int i20 = (-abs) / 2;
        int i21 = -1;
        int i22 = i17 < i15 ? 1 : -1;
        if (i16 < i14) {
            i21 = 1;
        }
        int i23 = i15 + i22;
        int i24 = i17;
        int i25 = i16;
        int i26 = 0;
        while (true) {
            if (i24 == i23) {
                i18 = i23;
                break;
            }
            int i27 = z12 ? i25 : i24;
            int i28 = z12 ? i24 : i25;
            if (i26 == i19) {
                cVar = this;
                z10 = z12;
                i18 = i23;
                z11 = true;
            } else {
                cVar = this;
                z10 = z12;
                i18 = i23;
                z11 = false;
            }
            if (z11 == cVar.f17764a.d(i27, i28)) {
                if (i26 == 2) {
                    return j8.a.b(i24, i25, i17, i16);
                }
                i26++;
            }
            i20 += abs2;
            if (i20 > 0) {
                if (i25 == i14) {
                    break;
                }
                i25 += i21;
                i20 -= abs;
            }
            i24 += i22;
            i23 = i18;
            z12 = z10;
            i19 = 1;
        }
        if (i26 == 2) {
            return j8.a.b(i18, i14, i17, i16);
        }
        return Float.NaN;
    }

    public final float j(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float i14 = i(i10, i11, i12, i13);
        int i15 = i10 - (i12 - i10);
        int i16 = 0;
        if (i15 < 0) {
            f10 = i10 / (i10 - i15);
            i15 = 0;
        } else if (i15 >= this.f17764a.h()) {
            f10 = ((this.f17764a.h() - 1) - i10) / (i15 - i10);
            i15 = this.f17764a.h() - 1;
        } else {
            f10 = 1.0f;
        }
        float f12 = i11;
        int i17 = (int) (f12 - ((i13 - i11) * f10));
        if (i17 < 0) {
            f11 = f12 / (i11 - i17);
        } else if (i17 >= this.f17764a.f()) {
            f11 = ((this.f17764a.f() - 1) - i11) / (i17 - i11);
            i16 = this.f17764a.f() - 1;
        } else {
            i16 = i17;
            f11 = 1.0f;
        }
        return (i14 + i(i10, i11, (int) (i10 + ((i15 - i10) * f11)), i16)) - 1.0f;
    }
}
