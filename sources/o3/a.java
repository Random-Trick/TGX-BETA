package o3;

import c5.a0;
import c5.s;
import d.j;
import m3.k2;
import org.thunderdog.challegram.Log;

public final class a {
    public static final int[] f18646a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] f18647b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final class b {
        public final int f18648a;
        public final int f18649b;
        public final String f18650c;

        public b(int i10, int i11, String str) {
            this.f18648a = i10;
            this.f18649b = i11;
            this.f18650c = str;
        }
    }

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & Log.TAG_YOUTUBE) | ((i12 << 3) & j.L0))};
    }

    public static int b(a0 a0Var) {
        int h10 = a0Var.h(5);
        return h10 == 31 ? a0Var.h(6) + 32 : h10;
    }

    public static int c(a0 a0Var) {
        int h10 = a0Var.h(4);
        if (h10 == 15) {
            return a0Var.h(24);
        }
        if (h10 < 13) {
            return f18646a[h10];
        }
        throw k2.a(null, null);
    }

    public static b d(a0 a0Var, boolean z10) {
        int b10 = b(a0Var);
        int c10 = c(a0Var);
        int h10 = a0Var.h(4);
        StringBuilder sb2 = new StringBuilder(19);
        sb2.append("mp4a.40.");
        sb2.append(b10);
        String sb3 = sb2.toString();
        if (b10 == 5 || b10 == 29) {
            c10 = c(a0Var);
            b10 = b(a0Var);
            if (b10 == 22) {
                h10 = a0Var.h(4);
            }
        }
        if (z10) {
            if (!(b10 == 1 || b10 == 2 || b10 == 3 || b10 == 4 || b10 == 6 || b10 == 7 || b10 == 17)) {
                switch (b10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb4 = new StringBuilder(42);
                        sb4.append("Unsupported audio object type: ");
                        sb4.append(b10);
                        throw k2.c(sb4.toString());
                }
            }
            f(a0Var, b10, h10);
            switch (b10) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h11 = a0Var.h(2);
                    if (h11 == 2 || h11 == 3) {
                        StringBuilder sb5 = new StringBuilder(33);
                        sb5.append("Unsupported epConfig: ");
                        sb5.append(h11);
                        throw k2.c(sb5.toString());
                    }
            }
        }
        int i10 = f18647b[h10];
        if (i10 != -1) {
            return new b(c10, i10, sb3);
        }
        throw k2.a(null, null);
    }

    public static b e(byte[] bArr) {
        return d(new a0(bArr), false);
    }

    public static void f(a0 a0Var, int i10, int i11) {
        if (a0Var.g()) {
            s.i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (a0Var.g()) {
            a0Var.r(14);
        }
        boolean g10 = a0Var.g();
        if (i11 != 0) {
            if (i10 == 6 || i10 == 20) {
                a0Var.r(3);
            }
            if (g10) {
                if (i10 == 22) {
                    a0Var.r(16);
                }
                if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                    a0Var.r(3);
                }
                a0Var.r(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
