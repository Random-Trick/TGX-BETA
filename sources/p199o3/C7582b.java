package p199o3;

import java.nio.ByteBuffer;
import org.thunderdog.challegram.Log;
import p020b5.C1187a0;
import p020b5.C1189b0;
import p020b5.C1216l0;
import p039d.C3563j;
import p174m3.C6600g1;
import p230q3.C8201m;

public final class C7582b {
    public static final int[] f24226a = {1, 2, 3, 6};
    public static final int[] f24227b = {48000, 44100, 32000};
    public static final int[] f24228c = {24000, 22050, 16000};
    public static final int[] f24229d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] f24230e = {32, 40, 48, 56, 64, 80, 96, 112, Log.TAG_YOUTUBE, 160, 192, 224, Log.TAG_CRASH, 320, 384, 448, Log.TAG_GIF_LOADER, 576, 640};
    public static final int[] f24231f = {69, 87, 104, C3563j.f11962M0, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class C7584b {
        public final String f24232a;
        public final int f24233b;
        public final int f24234c;
        public final int f24235d;
        public final int f24236e;
        public final int f24237f;

        public C7584b(String str, int i, int i2, int i3, int i4, int i5) {
            this.f24232a = str;
            this.f24233b = i;
            this.f24235d = i2;
            this.f24234c = i3;
            this.f24236e = i4;
            this.f24237f = i5;
        }
    }

    public static int m15631a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((C1216l0.m38016E(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - position;
            }
        }
        return -1;
    }

    public static int m15630b(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f24227b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f24231f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f24230e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static C6600g1 m15629c(C1189b0 b0Var, String str, String str2, C8201m mVar) {
        int i = f24227b[(b0Var.m38159D() & 192) >> 6];
        int D = b0Var.m38159D();
        int i2 = f24229d[(D & 56) >> 3];
        if ((D & 4) != 0) {
            i2++;
        }
        return new C6600g1.C6602b().m19876S(str).m19859e0("audio/ac3").m19887H(i2).m19857f0(i).m19882M(mVar).m19873V(str2).m19890E();
    }

    public static int m15628d(ByteBuffer byteBuffer) {
        int i = 3;
        if (!(((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10)) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f24226a[i] * Log.TAG_CRASH;
    }

    public static C7584b m15627e(C1187a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int e = a0Var.m38179e();
        a0Var.m38166r(40);
        boolean z = a0Var.m38176h(5) > 10;
        a0Var.m38168p(e);
        int i12 = -1;
        if (z) {
            a0Var.m38166r(16);
            int h = a0Var.m38176h(2);
            if (h == 0) {
                i12 = 0;
            } else if (h == 1) {
                i12 = 1;
            } else if (h == 2) {
                i12 = 2;
            }
            a0Var.m38166r(3);
            i2 = (a0Var.m38176h(11) + 1) * 2;
            int h2 = a0Var.m38176h(2);
            if (h2 == 3) {
                i6 = f24228c[a0Var.m38176h(2)];
                i8 = 3;
                i7 = 6;
            } else {
                i8 = a0Var.m38176h(2);
                i7 = f24226a[i8];
                i6 = f24227b[h2];
            }
            i = i7 * Log.TAG_CRASH;
            int h3 = a0Var.m38176h(3);
            boolean g = a0Var.m38177g();
            i4 = f24229d[h3] + (g ? 1 : 0);
            a0Var.m38166r(10);
            if (a0Var.m38177g()) {
                a0Var.m38166r(8);
            }
            if (h3 == 0) {
                a0Var.m38166r(5);
                if (a0Var.m38177g()) {
                    a0Var.m38166r(8);
                }
            }
            if (i12 == 1 && a0Var.m38177g()) {
                a0Var.m38166r(16);
            }
            if (a0Var.m38177g()) {
                if (h3 > 2) {
                    a0Var.m38166r(2);
                }
                if ((h3 & 1) == 0 || h3 <= 2) {
                    i10 = 6;
                } else {
                    i10 = 6;
                    a0Var.m38166r(6);
                }
                if ((h3 & 4) != 0) {
                    a0Var.m38166r(i10);
                }
                if (g && a0Var.m38177g()) {
                    a0Var.m38166r(5);
                }
                if (i12 == 0) {
                    if (a0Var.m38177g()) {
                        i11 = 6;
                        a0Var.m38166r(6);
                    } else {
                        i11 = 6;
                    }
                    if (h3 == 0 && a0Var.m38177g()) {
                        a0Var.m38166r(i11);
                    }
                    if (a0Var.m38177g()) {
                        a0Var.m38166r(i11);
                    }
                    int h4 = a0Var.m38176h(2);
                    if (h4 == 1) {
                        a0Var.m38166r(5);
                    } else if (h4 == 2) {
                        a0Var.m38166r(12);
                    } else if (h4 == 3) {
                        int h5 = a0Var.m38176h(5);
                        if (a0Var.m38177g()) {
                            a0Var.m38166r(5);
                            if (a0Var.m38177g()) {
                                a0Var.m38166r(4);
                            }
                            if (a0Var.m38177g()) {
                                a0Var.m38166r(4);
                            }
                            if (a0Var.m38177g()) {
                                a0Var.m38166r(4);
                            }
                            if (a0Var.m38177g()) {
                                a0Var.m38166r(4);
                            }
                            if (a0Var.m38177g()) {
                                a0Var.m38166r(4);
                            }
                            if (a0Var.m38177g()) {
                                a0Var.m38166r(4);
                            }
                            if (a0Var.m38177g()) {
                                a0Var.m38166r(4);
                            }
                            if (a0Var.m38177g()) {
                                if (a0Var.m38177g()) {
                                    a0Var.m38166r(4);
                                }
                                if (a0Var.m38177g()) {
                                    a0Var.m38166r(4);
                                }
                            }
                        }
                        if (a0Var.m38177g()) {
                            a0Var.m38166r(5);
                            if (a0Var.m38177g()) {
                                a0Var.m38166r(7);
                                if (a0Var.m38177g()) {
                                    a0Var.m38166r(8);
                                }
                            }
                        }
                        a0Var.m38166r((h5 + 2) * 8);
                        a0Var.m38181c();
                    }
                    if (h3 < 2) {
                        if (a0Var.m38177g()) {
                            a0Var.m38166r(14);
                        }
                        if (h3 == 0 && a0Var.m38177g()) {
                            a0Var.m38166r(14);
                        }
                    }
                    if (a0Var.m38177g()) {
                        if (i8 == 0) {
                            a0Var.m38166r(5);
                        } else {
                            for (int i13 = 0; i13 < i7; i13++) {
                                if (a0Var.m38177g()) {
                                    a0Var.m38166r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (a0Var.m38177g()) {
                a0Var.m38166r(5);
                if (h3 == 2) {
                    a0Var.m38166r(4);
                }
                if (h3 >= 6) {
                    a0Var.m38166r(2);
                }
                if (a0Var.m38177g()) {
                    a0Var.m38166r(8);
                }
                if (h3 == 0 && a0Var.m38177g()) {
                    a0Var.m38166r(8);
                }
                if (h2 < 3) {
                    a0Var.m38167q();
                }
            }
            if (i12 == 0 && i8 != 3) {
                a0Var.m38167q();
            }
            if (i12 != 2 || (i8 != 3 && !a0Var.m38177g())) {
                i9 = 6;
            } else {
                i9 = 6;
                a0Var.m38166r(6);
            }
            str = (a0Var.m38177g() && a0Var.m38176h(i9) == 1 && a0Var.m38176h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
            i3 = i6;
        } else {
            a0Var.m38166r(32);
            int h6 = a0Var.m38176h(2);
            String str2 = h6 == 3 ? null : "audio/ac3";
            int b = m15630b(h6, a0Var.m38176h(6));
            a0Var.m38166r(8);
            int h7 = a0Var.m38176h(3);
            if (!((h7 & 1) == 0 || h7 == 1)) {
                a0Var.m38166r(2);
            }
            if ((h7 & 4) != 0) {
                a0Var.m38166r(2);
            }
            if (h7 == 2) {
                a0Var.m38166r(2);
            }
            int[] iArr = f24227b;
            int i14 = h6 < iArr.length ? iArr[h6] : -1;
            i4 = f24229d[h7] + (a0Var.m38177g() ? 1 : 0);
            str = str2;
            i2 = b;
            i3 = i14;
            i5 = -1;
            i = 1536;
        }
        return new C7584b(str, i5, i4, i3, i2, i);
    }

    public static int m15626f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (!(((bArr[5] & 248) >> 3) > 10)) {
            return m15630b((bArr[4] & 192) >> 6, bArr[4] & 63);
        }
        return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
    }

    public static C6600g1 m15625g(C1189b0 b0Var, String str, String str2, C8201m mVar) {
        b0Var.m38146Q(2);
        int i = f24227b[(b0Var.m38159D() & 192) >> 6];
        int D = b0Var.m38159D();
        int i2 = f24229d[(D & 14) >> 1];
        if ((D & 1) != 0) {
            i2++;
        }
        if (((b0Var.m38159D() & 30) >> 1) > 0 && (2 & b0Var.m38159D()) != 0) {
            i2 += 2;
        }
        return new C6600g1.C6602b().m19876S(str).m19859e0((b0Var.m38145a() <= 0 || (b0Var.m38159D() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").m19887H(i2).m19857f0(i).m19882M(mVar).m19873V(str2).m19890E();
    }

    public static int m15624h(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int m15623i(byte[] bArr) {
        boolean z = false;
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & 254) != 186) {
            return 0;
        }
        if ((bArr[7] & 255) == 187) {
            z = true;
        }
        return 40 << ((bArr[z ? '\t' : '\b'] >> 4) & 7);
    }
}
