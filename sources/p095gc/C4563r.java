package p095gc;

import java.util.List;
import java.util.RandomAccess;
import p123ia.AbstractC5277b;
import qa.C8294g;

public final class C4563r extends AbstractC5277b<C4552h> implements RandomAccess {
    public static final C4564a f14992M = new C4564a(null);
    public final C4552h[] f14993b;
    public final int[] f14994c;

    public static final class C4564a {
        public C4564a() {
        }

        public static void m27354b(C4564a aVar, long j, C4549e eVar, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            aVar.m27355a((i4 & 1) != 0 ? 0L : j, eVar, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        public final void m27355a(long j, C4549e eVar, int i, List<? extends C4552h> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            C4549e eVar2;
            int i8 = i;
            if (i2 < i3) {
                for (int i9 = i2; i9 < i3; i9++) {
                    if (!(list.get(i9).m27406r() >= i8)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                C4552h hVar = list.get(i2);
                C4552h hVar2 = list.get(i3 - 1);
                if (i8 == hVar.m27406r()) {
                    i5 = list2.get(i2).intValue();
                    int i10 = i2 + 1;
                    hVar = list.get(i10);
                    i4 = i10;
                } else {
                    i4 = i2;
                    i5 = -1;
                }
                if (hVar.m27414d(i8) != hVar2.m27414d(i8)) {
                    int i11 = 1;
                    for (int i12 = i4 + 1; i12 < i3; i12++) {
                        if (list.get(i12 - 1).m27414d(i8) != list.get(i12).m27414d(i8)) {
                            i11++;
                        }
                    }
                    long c = j + m27353c(eVar) + 2 + (i11 * 2);
                    eVar.mo27343w(i11);
                    eVar.mo27343w(i5);
                    for (int i13 = i4; i13 < i3; i13++) {
                        byte d = list.get(i13).m27414d(i8);
                        if (i13 == i4 || d != list.get(i13 - 1).m27414d(i8)) {
                            eVar.mo27343w(d & 255);
                        }
                    }
                    C4549e eVar3 = new C4549e();
                    while (i4 < i3) {
                        byte d2 = list.get(i4).m27414d(i8);
                        int i14 = i4 + 1;
                        int i15 = i14;
                        while (true) {
                            if (i15 >= i3) {
                                i6 = i3;
                                break;
                            } else if (d2 != list.get(i15).m27414d(i8)) {
                                i6 = i15;
                                break;
                            } else {
                                i15++;
                            }
                        }
                        if (i14 == i6 && i8 + 1 == list.get(i4).m27406r()) {
                            eVar.mo27343w(list2.get(i4).intValue());
                            i7 = i6;
                            eVar2 = eVar3;
                        } else {
                            eVar.mo27343w(((int) (c + m27353c(eVar3))) * (-1));
                            i7 = i6;
                            eVar2 = eVar3;
                            m27355a(c, eVar3, i8 + 1, list, i4, i6, list2);
                        }
                        eVar3 = eVar2;
                        i4 = i7;
                    }
                    eVar.m27426X0(eVar3);
                    return;
                }
                int min = Math.min(hVar.m27406r(), hVar2.m27406r());
                int i16 = 0;
                for (int i17 = i8; i17 < min && hVar.m27414d(i17) == hVar2.m27414d(i17); i17++) {
                    i16++;
                }
                long c2 = j + m27353c(eVar) + 2 + i16 + 1;
                eVar.mo27343w(-i16);
                eVar.mo27343w(i5);
                int i18 = i8 + i16;
                while (i8 < i18) {
                    eVar.mo27343w(hVar.m27414d(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (i18 == list.get(i4).m27406r()) {
                        eVar.mo27343w(list2.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                C4549e eVar4 = new C4549e();
                eVar.mo27343w(((int) (m27353c(eVar4) + c2)) * (-1));
                m27355a(c2, eVar4, i18, list, i4, i3, list2);
                eVar.m27426X0(eVar4);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final long m27353c(C4549e eVar) {
            return eVar.size() / 4;
        }

        public final p095gc.C4563r m27352d(p095gc.C4552h... r17) {
            throw new UnsupportedOperationException("Method not decompiled: p095gc.C4563r.C4564a.m27352d(gc.h[]):gc.r");
        }

        public C4564a(C8294g gVar) {
            this();
        }
    }

    public C4563r(C4552h[] hVarArr, int[] iArr, C8294g gVar) {
        this(hVarArr, iArr);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof C4552h) {
            return m27359h((C4552h) obj);
        }
        return false;
    }

    @Override
    public int getSize() {
        return this.f14993b.length;
    }

    public boolean m27359h(C4552h hVar) {
        return super.contains(hVar);
    }

    public C4552h get(int i) {
        return this.f14993b[i];
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj instanceof C4552h) {
            return m27357m((C4552h) obj);
        }
        return -1;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (obj instanceof C4552h) {
            return m27356r((C4552h) obj);
        }
        return -1;
    }

    public int m27357m(C4552h hVar) {
        return super.indexOf(hVar);
    }

    public int m27356r(C4552h hVar) {
        return super.lastIndexOf(hVar);
    }

    public C4563r(C4552h[] hVarArr, int[] iArr) {
        this.f14993b = hVarArr;
        this.f14994c = iArr;
    }
}
