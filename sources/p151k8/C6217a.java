package p151k8;

import java.util.List;
import java.util.Map;
import p093g8.C4520c;
import p093g8.C4525h;
import p093g8.C4528k;
import p093g8.C4530m;
import p093g8.EnumC4518a;
import p093g8.EnumC4522e;
import p093g8.EnumC4529l;
import p105h8.C5022a;
import p105h8.C5025d;
import p105h8.C5027f;
import p166l8.C6421e;
import p166l8.C6425i;
import p179m8.C6797c;

public class C6217a {
    public static final C4530m[] f19630b = new C4530m[0];
    public final C6421e f19631a = new C6421e();

    public static C5022a m21053c(C5022a aVar) {
        int[] g = aVar.m24279g();
        int[] e = aVar.m24281e();
        if (g == null || e == null) {
            throw C4525h.m27498a();
        }
        float d = m21052d(g, aVar);
        int i = g[1];
        int i2 = e[1];
        int i3 = g[0];
        int i4 = e[0];
        if (i3 >= i4 || i >= i2) {
            throw C4525h.m27498a();
        }
        int i5 = i2 - i;
        if (i5 == i4 - i3 || (i4 = i3 + i5) < aVar.m24278h()) {
            int round = Math.round(((i4 - i3) + 1) / d);
            int round2 = Math.round((i5 + 1) / d);
            if (round <= 0 || round2 <= 0) {
                throw C4525h.m27498a();
            } else if (round2 == round) {
                int i6 = (int) (d / 2.0f);
                int i7 = i + i6;
                int i8 = i3 + i6;
                int i9 = (((int) ((round - 1) * d)) + i8) - i4;
                if (i9 > 0) {
                    if (i9 <= i6) {
                        i8 -= i9;
                    } else {
                        throw C4525h.m27498a();
                    }
                }
                int i10 = (((int) ((round2 - 1) * d)) + i7) - i2;
                if (i10 > 0) {
                    if (i10 <= i6) {
                        i7 -= i10;
                    } else {
                        throw C4525h.m27498a();
                    }
                }
                C5022a aVar2 = new C5022a(round, round2);
                for (int i11 = 0; i11 < round2; i11++) {
                    int i12 = ((int) (i11 * d)) + i7;
                    for (int i13 = 0; i13 < round; i13++) {
                        if (aVar.m24282d(((int) (i13 * d)) + i8, i12)) {
                            aVar2.m24277i(i13, i11);
                        }
                    }
                }
                return aVar2;
            } else {
                throw C4525h.m27498a();
            }
        } else {
            throw C4525h.m27498a();
        }
    }

    public static float m21052d(int[] iArr, C5022a aVar) {
        int f = aVar.m24280f();
        int h = aVar.m24278h();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < h && i2 < f) {
            if (z != aVar.m24282d(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i != h && i2 != f) {
            return (i - iArr[0]) / 7.0f;
        }
        throw C4525h.m27498a();
    }

    public C4528k m21055a(C4520c cVar) {
        return m21054b(cVar, null);
    }

    public final C4528k m21054b(C4520c cVar, Map<EnumC4522e, ?> map) {
        C4530m[] mVarArr;
        C5025d dVar;
        if (map == null || !map.containsKey(EnumC4522e.PURE_BARCODE)) {
            C5027f e = new C6797c(cVar.m27503a()).m19022e(map);
            dVar = this.f19631a.m20436b(e.m24262a(), map);
            mVarArr = e.m24261b();
        } else {
            dVar = this.f19631a.m20436b(m21053c(cVar.m27503a()), map);
            mVarArr = f19630b;
        }
        if (dVar.m24269c() instanceof C6425i) {
            ((C6425i) dVar.m24269c()).m20426a(mVarArr);
        }
        C4528k kVar = new C4528k(dVar.m24265g(), dVar.m24268d(), mVarArr, EnumC4518a.QR_CODE);
        List<byte[]> a = dVar.m24271a();
        if (a != null) {
            kVar.m27492c(EnumC4529l.BYTE_SEGMENTS, a);
        }
        String b = dVar.m24270b();
        if (b != null) {
            kVar.m27492c(EnumC4529l.ERROR_CORRECTION_LEVEL, b);
        }
        if (dVar.m24264h()) {
            kVar.m27492c(EnumC4529l.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(dVar.m24266f()));
            kVar.m27492c(EnumC4529l.STRUCTURED_APPEND_PARITY, Integer.valueOf(dVar.m24267e()));
        }
        return kVar;
    }
}
