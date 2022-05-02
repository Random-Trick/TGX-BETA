package p199o3;

import org.thunderdog.challegram.Log;
import p020b5.C1187a0;
import p020b5.C1230s;
import p039d.C3563j;
import p174m3.C6556a2;

public final class C7576a {
    public static final int[] f24196a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] f24197b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final class C7578b {
        public final int f24198a;
        public final int f24199b;
        public final String f24200c;

        public C7578b(int i, int i2, String str) {
            this.f24198a = i;
            this.f24199b = i2;
            this.f24200c = str;
        }
    }

    public static byte[] m15653a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & Log.TAG_YOUTUBE) | ((i3 << 3) & C3563j.f11957L0))};
    }

    public static int m15652b(C1187a0 a0Var) {
        int h = a0Var.m38173h(5);
        return h == 31 ? a0Var.m38173h(6) + 32 : h;
    }

    public static int m15651c(C1187a0 a0Var) {
        int h = a0Var.m38173h(4);
        if (h == 15) {
            return a0Var.m38173h(24);
        }
        if (h < 13) {
            return f24196a[h];
        }
        throw C6556a2.m20112a(null, null);
    }

    public static C7578b m15650d(C1187a0 a0Var, boolean z) {
        int b = m15652b(a0Var);
        int c = m15651c(a0Var);
        int h = a0Var.m38173h(4);
        StringBuilder sb2 = new StringBuilder(19);
        sb2.append("mp4a.40.");
        sb2.append(b);
        String sb3 = sb2.toString();
        if (b == 5 || b == 29) {
            c = m15651c(a0Var);
            b = m15652b(a0Var);
            if (b == 22) {
                h = a0Var.m38173h(4);
            }
        }
        if (z) {
            if (!(b == 1 || b == 2 || b == 3 || b == 4 || b == 6 || b == 7 || b == 17)) {
                switch (b) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb4 = new StringBuilder(42);
                        sb4.append("Unsupported audio object type: ");
                        sb4.append(b);
                        throw C6556a2.m20110c(sb4.toString());
                }
            }
            m15648f(a0Var, b, h);
            switch (b) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h2 = a0Var.m38173h(2);
                    if (h2 == 2 || h2 == 3) {
                        StringBuilder sb5 = new StringBuilder(33);
                        sb5.append("Unsupported epConfig: ");
                        sb5.append(h2);
                        throw C6556a2.m20110c(sb5.toString());
                    }
            }
        }
        int i = f24197b[h];
        if (i != -1) {
            return new C7578b(c, i, sb3);
        }
        throw C6556a2.m20112a(null, null);
    }

    public static C7578b m15649e(byte[] bArr) {
        return m15650d(new C1187a0(bArr), false);
    }

    public static void m15648f(C1187a0 a0Var, int i, int i2) {
        if (a0Var.m38174g()) {
            C1230s.m37881i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (a0Var.m38174g()) {
            a0Var.m38163r(14);
        }
        boolean g = a0Var.m38174g();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                a0Var.m38163r(3);
            }
            if (g) {
                if (i == 22) {
                    a0Var.m38163r(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    a0Var.m38163r(3);
                }
                a0Var.m38163r(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
}
