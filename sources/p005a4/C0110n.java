package p005a4;

import p020b5.C1189b0;
import p270t3.AbstractC8959g;

public final class C0110n {
    public static final int[] f416a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean m42274a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : f416a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean m42273b(AbstractC8959g gVar) {
        return m42272c(gVar, true, false);
    }

    public static boolean m42272c(AbstractC8959g gVar, boolean z, boolean z2) {
        boolean z3;
        long a = gVar.mo6046a();
        long j = 4096;
        long j2 = -1;
        int i = (a > (-1L) ? 1 : (a == (-1L) ? 0 : -1));
        if (i != 0 && a <= 4096) {
            j = a;
        }
        int i2 = (int) j;
        C1189b0 b0Var = new C1189b0(64);
        boolean z4 = false;
        int i3 = 0;
        boolean z5 = false;
        while (i3 < i2) {
            b0Var.m38151L(8);
            byte[] d = b0Var.m38142d();
            int i4 = z4 ? 1 : 0;
            int i5 = z4 ? 1 : 0;
            int i6 = z4 ? 1 : 0;
            int i7 = z4 ? 1 : 0;
            if (!gVar.mo10812e(d, i4, 8, true)) {
                break;
            }
            long F = b0Var.m38157F();
            int n = b0Var.m38132n();
            int i8 = 16;
            if (F == 1) {
                gVar.mo10805q(b0Var.m38142d(), 8, 8);
                b0Var.m38148O(16);
                F = b0Var.m38123w();
            } else {
                if (F == 0) {
                    long a2 = gVar.mo6046a();
                    if (a2 != j2) {
                        F = (a2 - gVar.mo6045f()) + 8;
                    }
                }
                i8 = 8;
            }
            long j3 = i8;
            if (F < j3) {
                return z4;
            }
            i3 += i8;
            if (n == 1836019574) {
                i2 += (int) F;
                if (i != 0 && i2 > a) {
                    i2 = (int) a;
                }
                j2 = -1;
            } else if (n == 1836019558 || n == 1836475768) {
                z3 = true;
                break;
            } else {
                a = a;
                if ((i3 + F) - j3 >= i2) {
                    break;
                }
                int i9 = (int) (F - j3);
                i3 += i9;
                if (n == 1718909296) {
                    if (i9 < 8) {
                        return false;
                    }
                    b0Var.m38151L(i9);
                    gVar.mo10805q(b0Var.m38142d(), 0, i9);
                    int i10 = i9 / 4;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= i10) {
                            break;
                        }
                        if (i11 == 1) {
                            b0Var.m38146Q(4);
                        } else if (m42274a(b0Var.m38132n(), z2)) {
                            z5 = true;
                            break;
                        }
                        i11++;
                    }
                    if (!z5) {
                        return false;
                    }
                } else if (i9 != 0) {
                    gVar.mo10811h(i9);
                }
                j2 = -1;
                z4 = false;
            }
        }
        z3 = false;
        return z5 && z == z3;
    }

    public static boolean m42271d(AbstractC8959g gVar, boolean z) {
        return m42272c(gVar, false, z);
    }
}
