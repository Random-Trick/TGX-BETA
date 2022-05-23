package a4;

import c5.b0;
import t3.g;

public final class n {
    public static final int[] f357a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f357a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(g gVar) {
        return c(gVar, true, false);
    }

    public static boolean c(g gVar, boolean z10, boolean z11) {
        boolean z12;
        long a10 = gVar.a();
        long j10 = 4096;
        long j11 = -1;
        int i10 = (a10 > (-1L) ? 1 : (a10 == (-1L) ? 0 : -1));
        if (i10 != 0 && a10 <= 4096) {
            j10 = a10;
        }
        int i11 = (int) j10;
        b0 b0Var = new b0(64);
        boolean z13 = false;
        int i12 = 0;
        boolean z14 = false;
        while (i12 < i11) {
            b0Var.L(8);
            byte[] d10 = b0Var.d();
            int i13 = z13 ? 1 : 0;
            int i14 = z13 ? 1 : 0;
            int i15 = z13 ? 1 : 0;
            int i16 = z13 ? 1 : 0;
            if (!gVar.e(d10, i13, 8, true)) {
                break;
            }
            long F = b0Var.F();
            int n10 = b0Var.n();
            int i17 = 16;
            if (F == 1) {
                gVar.q(b0Var.d(), 8, 8);
                b0Var.O(16);
                F = b0Var.w();
            } else {
                if (F == 0) {
                    long a11 = gVar.a();
                    if (a11 != j11) {
                        F = (a11 - gVar.f()) + 8;
                    }
                }
                i17 = 8;
            }
            long j12 = i17;
            if (F < j12) {
                return z13;
            }
            i12 += i17;
            if (n10 == 1836019574) {
                i11 += (int) F;
                if (i10 != 0 && i11 > a10) {
                    i11 = (int) a10;
                }
                j11 = -1;
            } else if (n10 == 1836019558 || n10 == 1836475768) {
                z12 = true;
                break;
            } else {
                a10 = a10;
                if ((i12 + F) - j12 >= i11) {
                    break;
                }
                int i18 = (int) (F - j12);
                i12 += i18;
                if (n10 == 1718909296) {
                    if (i18 < 8) {
                        return false;
                    }
                    b0Var.L(i18);
                    gVar.q(b0Var.d(), 0, i18);
                    int i19 = i18 / 4;
                    int i20 = 0;
                    while (true) {
                        if (i20 >= i19) {
                            break;
                        }
                        if (i20 == 1) {
                            b0Var.Q(4);
                        } else if (a(b0Var.n(), z11)) {
                            z14 = true;
                            break;
                        }
                        i20++;
                    }
                    if (!z14) {
                        return false;
                    }
                } else if (i18 != 0) {
                    gVar.g(i18);
                }
                j11 = -1;
                z13 = false;
            }
        }
        z12 = false;
        return z14 && z10 == z12;
    }

    public static boolean d(g gVar, boolean z10) {
        return c(gVar, false, z10);
    }
}
