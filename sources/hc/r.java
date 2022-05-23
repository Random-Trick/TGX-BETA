package hc;

import ja.b;
import java.util.List;
import java.util.RandomAccess;
import ra.g;

public final class r extends b<h> implements RandomAccess {
    public static final a M = new a(null);
    public final h[] f12661b;
    public final int[] f12662c;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public static void b(a aVar, long j10, e eVar, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            aVar.a((i13 & 1) != 0 ? 0L : j10, eVar, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        public final void a(long j10, e eVar, int i10, List<? extends h> list, int i11, int i12, List<Integer> list2) {
            int i13;
            int i14;
            int i15;
            int i16;
            e eVar2;
            int i17 = i10;
            if (i11 < i12) {
                for (int i18 = i11; i18 < i12; i18++) {
                    if (!(list.get(i18).r() >= i17)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                h hVar = list.get(i11);
                h hVar2 = list.get(i12 - 1);
                if (i17 == hVar.r()) {
                    i14 = list2.get(i11).intValue();
                    int i19 = i11 + 1;
                    hVar = list.get(i19);
                    i13 = i19;
                } else {
                    i13 = i11;
                    i14 = -1;
                }
                if (hVar.d(i17) != hVar2.d(i17)) {
                    int i20 = 1;
                    for (int i21 = i13 + 1; i21 < i12; i21++) {
                        if (list.get(i21 - 1).d(i17) != list.get(i21).d(i17)) {
                            i20++;
                        }
                    }
                    long c10 = j10 + c(eVar) + 2 + (i20 * 2);
                    eVar.v(i20);
                    eVar.v(i14);
                    for (int i22 = i13; i22 < i12; i22++) {
                        byte d10 = list.get(i22).d(i17);
                        if (i22 == i13 || d10 != list.get(i22 - 1).d(i17)) {
                            eVar.v(d10 & 255);
                        }
                    }
                    e eVar3 = new e();
                    while (i13 < i12) {
                        byte d11 = list.get(i13).d(i17);
                        int i23 = i13 + 1;
                        int i24 = i23;
                        while (true) {
                            if (i24 >= i12) {
                                i15 = i12;
                                break;
                            } else if (d11 != list.get(i24).d(i17)) {
                                i15 = i24;
                                break;
                            } else {
                                i24++;
                            }
                        }
                        if (i23 == i15 && i17 + 1 == list.get(i13).r()) {
                            eVar.v(list2.get(i13).intValue());
                            i16 = i15;
                            eVar2 = eVar3;
                        } else {
                            eVar.v(((int) (c10 + c(eVar3))) * (-1));
                            i16 = i15;
                            eVar2 = eVar3;
                            a(c10, eVar3, i17 + 1, list, i13, i15, list2);
                        }
                        eVar3 = eVar2;
                        i13 = i16;
                    }
                    eVar.X0(eVar3);
                    return;
                }
                int min = Math.min(hVar.r(), hVar2.r());
                int i25 = 0;
                for (int i26 = i17; i26 < min && hVar.d(i26) == hVar2.d(i26); i26++) {
                    i25++;
                }
                long c11 = j10 + c(eVar) + 2 + i25 + 1;
                eVar.v(-i25);
                eVar.v(i14);
                int i27 = i17 + i25;
                while (i17 < i27) {
                    eVar.v(hVar.d(i17) & 255);
                    i17++;
                }
                if (i13 + 1 == i12) {
                    if (i27 == list.get(i13).r()) {
                        eVar.v(list2.get(i13).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                e eVar4 = new e();
                eVar.v(((int) (c(eVar4) + c11)) * (-1));
                a(c11, eVar4, i27, list, i13, i12, list2);
                eVar.X0(eVar4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final long c(e eVar) {
            return eVar.size() / 4;
        }

        public final hc.r d(hc.h... r17) {
            throw new UnsupportedOperationException("Method not decompiled: hc.r.a.d(hc.h[]):hc.r");
        }
    }

    public r(h[] hVarArr, int[] iArr, g gVar) {
        this(hVarArr, iArr);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof h) {
            return f((h) obj);
        }
        return false;
    }

    public boolean f(h hVar) {
        return super.contains(hVar);
    }

    public h get(int i10) {
        return this.f12661b[i10];
    }

    @Override
    public int getSize() {
        return this.f12661b.length;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj instanceof h) {
            return m((h) obj);
        }
        return -1;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return r((h) obj);
        }
        return -1;
    }

    public int m(h hVar) {
        return super.indexOf(hVar);
    }

    public int r(h hVar) {
        return super.lastIndexOf(hVar);
    }

    public r(h[] hVarArr, int[] iArr) {
        this.f12661b = hVarArr;
        this.f12662c = iArr;
    }
}
