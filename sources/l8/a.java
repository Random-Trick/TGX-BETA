package l8;

import h8.c;
import h8.h;
import h8.k;
import h8.l;
import h8.m;
import i8.d;
import i8.f;
import java.util.List;
import java.util.Map;
import m8.e;
import m8.i;

public class a {
    public static final m[] f16311b = new m[0];
    public final e f16312a = new e();

    public static i8.a c(i8.a aVar) {
        int[] g10 = aVar.g();
        int[] e10 = aVar.e();
        if (g10 == null || e10 == null) {
            throw h.a();
        }
        float d10 = d(g10, aVar);
        int i10 = g10[1];
        int i11 = e10[1];
        int i12 = g10[0];
        int i13 = e10[0];
        if (i12 >= i13 || i10 >= i11) {
            throw h.a();
        }
        int i14 = i11 - i10;
        if (i14 == i13 - i12 || (i13 = i12 + i14) < aVar.h()) {
            int round = Math.round(((i13 - i12) + 1) / d10);
            int round2 = Math.round((i14 + 1) / d10);
            if (round <= 0 || round2 <= 0) {
                throw h.a();
            } else if (round2 == round) {
                int i15 = (int) (d10 / 2.0f);
                int i16 = i10 + i15;
                int i17 = i12 + i15;
                int i18 = (((int) ((round - 1) * d10)) + i17) - i13;
                if (i18 > 0) {
                    if (i18 <= i15) {
                        i17 -= i18;
                    } else {
                        throw h.a();
                    }
                }
                int i19 = (((int) ((round2 - 1) * d10)) + i16) - i11;
                if (i19 > 0) {
                    if (i19 <= i15) {
                        i16 -= i19;
                    } else {
                        throw h.a();
                    }
                }
                i8.a aVar2 = new i8.a(round, round2);
                for (int i20 = 0; i20 < round2; i20++) {
                    int i21 = ((int) (i20 * d10)) + i16;
                    for (int i22 = 0; i22 < round; i22++) {
                        if (aVar.d(((int) (i22 * d10)) + i17, i21)) {
                            aVar2.i(i22, i20);
                        }
                    }
                }
                return aVar2;
            } else {
                throw h.a();
            }
        } else {
            throw h.a();
        }
    }

    public static float d(int[] iArr, i8.a aVar) {
        int f10 = aVar.f();
        int h10 = aVar.h();
        int i10 = iArr[0];
        boolean z10 = true;
        int i11 = iArr[1];
        int i12 = 0;
        while (i10 < h10 && i11 < f10) {
            if (z10 != aVar.d(i10, i11)) {
                i12++;
                if (i12 == 5) {
                    break;
                }
                z10 = !z10;
            }
            i10++;
            i11++;
        }
        if (i10 != h10 && i11 != f10) {
            return (i10 - iArr[0]) / 7.0f;
        }
        throw h.a();
    }

    public k a(c cVar) {
        return b(cVar, null);
    }

    public final k b(c cVar, Map<h8.e, ?> map) {
        m[] mVarArr;
        d dVar;
        if (map == null || !map.containsKey(h8.e.PURE_BARCODE)) {
            f e10 = new n8.c(cVar.a()).e(map);
            dVar = this.f16312a.b(e10.a(), map);
            mVarArr = e10.b();
        } else {
            dVar = this.f16312a.b(c(cVar.a()), map);
            mVarArr = f16311b;
        }
        if (dVar.c() instanceof i) {
            ((i) dVar.c()).a(mVarArr);
        }
        k kVar = new k(dVar.g(), dVar.d(), mVarArr, h8.a.QR_CODE);
        List<byte[]> a10 = dVar.a();
        if (a10 != null) {
            kVar.c(l.BYTE_SEGMENTS, a10);
        }
        String b10 = dVar.b();
        if (b10 != null) {
            kVar.c(l.ERROR_CORRECTION_LEVEL, b10);
        }
        if (dVar.h()) {
            kVar.c(l.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(dVar.f()));
            kVar.c(l.STRUCTURED_APPEND_PARITY, Integer.valueOf(dVar.e()));
        }
        return kVar;
    }
}
