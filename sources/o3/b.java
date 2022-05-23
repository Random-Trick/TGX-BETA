package o3;

import c5.a0;
import c5.b0;
import c5.l0;
import d.j;
import java.nio.ByteBuffer;
import m3.q1;
import org.thunderdog.challegram.Log;
import q3.m;

public final class b {
    public static final int[] f18669a = {1, 2, 3, 6};
    public static final int[] f18670b = {48000, 44100, 32000};
    public static final int[] f18671c = {24000, 22050, 16000};
    public static final int[] f18672d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] f18673e = {32, 40, 48, 56, 64, 80, 96, 112, Log.TAG_YOUTUBE, 160, 192, 224, Log.TAG_CRASH, 320, 384, 448, Log.TAG_GIF_LOADER, 576, 640};
    public static final int[] f18674f = {69, 87, 104, j.M0, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class C0166b {
        public final String f18675a;
        public final int f18676b;
        public final int f18677c;
        public final int f18678d;
        public final int f18679e;
        public final int f18680f;

        public C0166b(String str, int i10, int i11, int i12, int i13, int i14) {
            this.f18675a = str;
            this.f18676b = i10;
            this.f18678d = i11;
            this.f18677c = i12;
            this.f18679e = i13;
            this.f18680f = i14;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((l0.F(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    public static int b(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f18670b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f18674f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f18673e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static q1 c(b0 b0Var, String str, String str2, m mVar) {
        int i10 = f18670b[(b0Var.D() & 192) >> 6];
        int D = b0Var.D();
        int i11 = f18672d[(D & 56) >> 3];
        if ((D & 4) != 0) {
            i11++;
        }
        return new q1.b().S(str).e0("audio/ac3").H(i11).f0(i10).M(mVar).V(str2).E();
    }

    public static int d(ByteBuffer byteBuffer) {
        int i10 = 3;
        if (!(((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10)) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i10 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f18669a[i10] * Log.TAG_CRASH;
    }

    public static C0166b e(a0 a0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int e10 = a0Var.e();
        a0Var.r(40);
        boolean z10 = a0Var.h(5) > 10;
        a0Var.p(e10);
        int i21 = -1;
        if (z10) {
            a0Var.r(16);
            int h10 = a0Var.h(2);
            if (h10 == 0) {
                i21 = 0;
            } else if (h10 == 1) {
                i21 = 1;
            } else if (h10 == 2) {
                i21 = 2;
            }
            a0Var.r(3);
            i11 = (a0Var.h(11) + 1) * 2;
            int h11 = a0Var.h(2);
            if (h11 == 3) {
                i15 = f18671c[a0Var.h(2)];
                i17 = 3;
                i16 = 6;
            } else {
                i17 = a0Var.h(2);
                i16 = f18669a[i17];
                i15 = f18670b[h11];
            }
            i10 = i16 * Log.TAG_CRASH;
            int h12 = a0Var.h(3);
            boolean g10 = a0Var.g();
            i13 = f18672d[h12] + (g10 ? 1 : 0);
            a0Var.r(10);
            if (a0Var.g()) {
                a0Var.r(8);
            }
            if (h12 == 0) {
                a0Var.r(5);
                if (a0Var.g()) {
                    a0Var.r(8);
                }
            }
            if (i21 == 1 && a0Var.g()) {
                a0Var.r(16);
            }
            if (a0Var.g()) {
                if (h12 > 2) {
                    a0Var.r(2);
                }
                if ((h12 & 1) == 0 || h12 <= 2) {
                    i19 = 6;
                } else {
                    i19 = 6;
                    a0Var.r(6);
                }
                if ((h12 & 4) != 0) {
                    a0Var.r(i19);
                }
                if (g10 && a0Var.g()) {
                    a0Var.r(5);
                }
                if (i21 == 0) {
                    if (a0Var.g()) {
                        i20 = 6;
                        a0Var.r(6);
                    } else {
                        i20 = 6;
                    }
                    if (h12 == 0 && a0Var.g()) {
                        a0Var.r(i20);
                    }
                    if (a0Var.g()) {
                        a0Var.r(i20);
                    }
                    int h13 = a0Var.h(2);
                    if (h13 == 1) {
                        a0Var.r(5);
                    } else if (h13 == 2) {
                        a0Var.r(12);
                    } else if (h13 == 3) {
                        int h14 = a0Var.h(5);
                        if (a0Var.g()) {
                            a0Var.r(5);
                            if (a0Var.g()) {
                                a0Var.r(4);
                            }
                            if (a0Var.g()) {
                                a0Var.r(4);
                            }
                            if (a0Var.g()) {
                                a0Var.r(4);
                            }
                            if (a0Var.g()) {
                                a0Var.r(4);
                            }
                            if (a0Var.g()) {
                                a0Var.r(4);
                            }
                            if (a0Var.g()) {
                                a0Var.r(4);
                            }
                            if (a0Var.g()) {
                                a0Var.r(4);
                            }
                            if (a0Var.g()) {
                                if (a0Var.g()) {
                                    a0Var.r(4);
                                }
                                if (a0Var.g()) {
                                    a0Var.r(4);
                                }
                            }
                        }
                        if (a0Var.g()) {
                            a0Var.r(5);
                            if (a0Var.g()) {
                                a0Var.r(7);
                                if (a0Var.g()) {
                                    a0Var.r(8);
                                }
                            }
                        }
                        a0Var.r((h14 + 2) * 8);
                        a0Var.c();
                    }
                    if (h12 < 2) {
                        if (a0Var.g()) {
                            a0Var.r(14);
                        }
                        if (h12 == 0 && a0Var.g()) {
                            a0Var.r(14);
                        }
                    }
                    if (a0Var.g()) {
                        if (i17 == 0) {
                            a0Var.r(5);
                        } else {
                            for (int i22 = 0; i22 < i16; i22++) {
                                if (a0Var.g()) {
                                    a0Var.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (a0Var.g()) {
                a0Var.r(5);
                if (h12 == 2) {
                    a0Var.r(4);
                }
                if (h12 >= 6) {
                    a0Var.r(2);
                }
                if (a0Var.g()) {
                    a0Var.r(8);
                }
                if (h12 == 0 && a0Var.g()) {
                    a0Var.r(8);
                }
                if (h11 < 3) {
                    a0Var.q();
                }
            }
            if (i21 == 0 && i17 != 3) {
                a0Var.q();
            }
            if (i21 != 2 || (i17 != 3 && !a0Var.g())) {
                i18 = 6;
            } else {
                i18 = 6;
                a0Var.r(6);
            }
            str = (a0Var.g() && a0Var.h(i18) == 1 && a0Var.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i14 = i21;
            i12 = i15;
        } else {
            a0Var.r(32);
            int h15 = a0Var.h(2);
            String str2 = h15 == 3 ? null : "audio/ac3";
            int b10 = b(h15, a0Var.h(6));
            a0Var.r(8);
            int h16 = a0Var.h(3);
            if (!((h16 & 1) == 0 || h16 == 1)) {
                a0Var.r(2);
            }
            if ((h16 & 4) != 0) {
                a0Var.r(2);
            }
            if (h16 == 2) {
                a0Var.r(2);
            }
            int[] iArr = f18670b;
            int i23 = h15 < iArr.length ? iArr[h15] : -1;
            i13 = f18672d[h16] + (a0Var.g() ? 1 : 0);
            str = str2;
            i11 = b10;
            i12 = i23;
            i14 = -1;
            i10 = 1536;
        }
        return new C0166b(str, i14, i13, i12, i11, i10);
    }

    public static int f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (!(((bArr[5] & 248) >> 3) > 10)) {
            return b((bArr[4] & 192) >> 6, bArr[4] & 63);
        }
        return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
    }

    public static q1 g(b0 b0Var, String str, String str2, m mVar) {
        b0Var.Q(2);
        int i10 = f18670b[(b0Var.D() & 192) >> 6];
        int D = b0Var.D();
        int i11 = f18672d[(D & 14) >> 1];
        if ((D & 1) != 0) {
            i11++;
        }
        if (((b0Var.D() & 30) >> 1) > 0 && (2 & b0Var.D()) != 0) {
            i11 += 2;
        }
        return new q1.b().S(str).e0((b0Var.a() <= 0 || (b0Var.D() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").H(i11).f0(i10).M(mVar).V(str2).E();
    }

    public static int h(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int i(byte[] bArr) {
        boolean z10 = false;
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & 254) != 186) {
            return 0;
        }
        if ((bArr[7] & 255) == 187) {
            z10 = true;
        }
        return 40 << ((bArr[z10 ? '\t' : '\b'] >> 4) & 7);
    }
}
