package p179m8;

import java.util.Map;
import p093g8.AbstractC4531n;
import p093g8.C4525h;
import p093g8.C4530m;
import p093g8.EnumC4522e;
import p105h8.AbstractC5029h;
import p105h8.C5022a;
import p105h8.C5027f;
import p105h8.C5031j;
import p121i8.C5262a;
import p166l8.C6426j;

public class C6797c {
    public final C5022a f21289a;
    public AbstractC4531n f21290b;

    public C6797c(C5022a aVar) {
        this.f21289a = aVar;
    }

    public static int m19023c(C4530m mVar, C4530m mVar2, C4530m mVar3, float f) {
        int c = ((C5262a.m23492c(C4530m.m27488b(mVar, mVar2) / f) + C5262a.m23492c(C4530m.m27488b(mVar, mVar3) / f)) / 2) + 7;
        int i = c & 3;
        if (i == 0) {
            return c + 1;
        }
        if (i == 2) {
            return c - 1;
        }
        if (i != 3) {
            return c;
        }
        throw C4525h.m27496a();
    }

    public static C5031j m19022d(C4530m mVar, C4530m mVar2, C4530m mVar3, C4530m mVar4, int i) {
        float f;
        float f2;
        float f3;
        float f4 = i - 3.5f;
        if (mVar4 != null) {
            f3 = f4 - 3.0f;
            f2 = mVar4.m27487c();
            f = mVar4.m27486d();
        } else {
            f2 = (mVar2.m27487c() - mVar.m27487c()) + mVar3.m27487c();
            f = (mVar2.m27486d() - mVar.m27486d()) + mVar3.m27486d();
            f3 = f4;
        }
        return C5031j.m24248b(3.5f, 3.5f, f4, 3.5f, f3, f3, 3.5f, f4, mVar.m27487c(), mVar.m27486d(), mVar2.m27487c(), mVar2.m27486d(), f2, f, mVar3.m27487c(), mVar3.m27486d());
    }

    public static C5022a m19018h(C5022a aVar, C5031j jVar, int i) {
        return AbstractC5029h.m24256b().mo24255c(aVar, i, i, jVar);
    }

    public final float m19025a(C4530m mVar, C4530m mVar2, C4530m mVar3) {
        return (m19024b(mVar, mVar2) + m19024b(mVar, mVar3)) / 2.0f;
    }

    public final float m19024b(C4530m mVar, C4530m mVar2) {
        float j = m19016j((int) mVar.m27487c(), (int) mVar.m27486d(), (int) mVar2.m27487c(), (int) mVar2.m27486d());
        float j2 = m19016j((int) mVar2.m27487c(), (int) mVar2.m27486d(), (int) mVar.m27487c(), (int) mVar.m27486d());
        return Float.isNaN(j) ? j2 / 7.0f : Float.isNaN(j2) ? j / 7.0f : (j + j2) / 14.0f;
    }

    public final C5027f m19021e(Map<EnumC4522e, ?> map) {
        this.f21290b = map == null ? null : (AbstractC4531n) map.get(EnumC4522e.NEED_RESULT_POINT_CALLBACK);
        return m19019g(new C6799e(this.f21289a, this.f21290b).m19005g(map));
    }

    public final C6795a m19020f(float f, int i, int i2, float f2) {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f21289a.m24277h() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (min >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f21289a.m24279f() - 1, i2 + i3) - max2;
            if (min2 >= f3) {
                return new C6796b(this.f21289a, max, max2, min, min2, f, this.f21290b).m19028c();
            }
            throw C4525h.m27496a();
        }
        throw C4525h.m27496a();
    }

    public final C5027f m19019g(C6802f fVar) {
        C6798d b = fVar.m18994b();
        C6798d c = fVar.m18993c();
        C6798d a = fVar.m18995a();
        float a2 = m19025a(b, c, a);
        if (a2 >= 1.0f) {
            int c2 = m19023c(b, c, a, a2);
            C6426j g = C6426j.m20418g(c2);
            int e = g.m20420e() - 7;
            C6795a aVar = null;
            if (g.m20421d().length > 0) {
                float c3 = (c.m27487c() - b.m27487c()) + a.m27487c();
                float d = (c.m27486d() - b.m27486d()) + a.m27486d();
                float f = 1.0f - (3.0f / e);
                int c4 = (int) (b.m27487c() + ((c3 - b.m27487c()) * f));
                int d2 = (int) (b.m27486d() + (f * (d - b.m27486d())));
                for (int i = 4; i <= 16; i <<= 1) {
                    try {
                        aVar = m19020f(a2, c4, d2, i);
                        break;
                    } catch (C4525h unused) {
                    }
                }
            }
            return new C5027f(m19018h(this.f21289a, m19022d(b, c, a, aVar, c2), c2), aVar == null ? new C4530m[]{a, b, c} : new C4530m[]{a, b, c, aVar});
        }
        throw C4525h.m27496a();
    }

    public final float m19017i(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        C6797c cVar;
        boolean z2;
        int i10 = 1;
        boolean z3 = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z3) {
            i7 = i;
            i8 = i2;
            i5 = i3;
            i6 = i4;
        } else {
            i8 = i;
            i7 = i2;
            i6 = i3;
            i5 = i4;
        }
        int abs = Math.abs(i6 - i8);
        int abs2 = Math.abs(i5 - i7);
        int i11 = (-abs) / 2;
        int i12 = -1;
        int i13 = i8 < i6 ? 1 : -1;
        if (i7 < i5) {
            i12 = 1;
        }
        int i14 = i6 + i13;
        int i15 = i8;
        int i16 = i7;
        int i17 = 0;
        while (true) {
            if (i15 == i14) {
                i9 = i14;
                break;
            }
            int i18 = z3 ? i16 : i15;
            int i19 = z3 ? i15 : i16;
            if (i17 == i10) {
                cVar = this;
                z = z3;
                i9 = i14;
                z2 = true;
            } else {
                cVar = this;
                z = z3;
                i9 = i14;
                z2 = false;
            }
            if (z2 == cVar.f21289a.m24281d(i18, i19)) {
                if (i17 == 2) {
                    return C5262a.m23493b(i15, i16, i8, i7);
                }
                i17++;
            }
            i11 += abs2;
            if (i11 > 0) {
                if (i16 == i5) {
                    break;
                }
                i16 += i12;
                i11 -= abs;
            }
            i15 += i13;
            i14 = i9;
            z3 = z;
            i10 = 1;
        }
        if (i17 == 2) {
            return C5262a.m23493b(i9, i5, i8, i7);
        }
        return Float.NaN;
    }

    public final float m19016j(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float i5 = m19017i(i, i2, i3, i4);
        int i6 = i - (i3 - i);
        int i7 = 0;
        if (i6 < 0) {
            f = i / (i - i6);
            i6 = 0;
        } else if (i6 >= this.f21289a.m24277h()) {
            f = ((this.f21289a.m24277h() - 1) - i) / (i6 - i);
            i6 = this.f21289a.m24277h() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = i2;
        int i8 = (int) (f3 - ((i4 - i2) * f));
        if (i8 < 0) {
            f2 = f3 / (i2 - i8);
        } else if (i8 >= this.f21289a.m24279f()) {
            f2 = ((this.f21289a.m24279f() - 1) - i2) / (i8 - i2);
            i7 = this.f21289a.m24279f() - 1;
        } else {
            i7 = i8;
            f2 = 1.0f;
        }
        return (i5 + m19017i(i, i2, (int) (i + ((i6 - i) * f2)), i7)) - 1.0f;
    }
}
