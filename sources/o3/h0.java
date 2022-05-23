package o3;

public final class h0 {
    public static final String[] f18799a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] f18800b = {44100, 48000, 32000};
    public static final int[] f18801c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] f18802d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] f18803e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f18804f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] f18805g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {
        public int f18806a;
        public String f18807b;
        public int f18808c;
        public int f18809d;
        public int f18810e;
        public int f18811f;
        public int f18812g;

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!h0.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f18806a = i11;
            this.f18807b = h0.f18799a[3 - i12];
            int i15 = h0.f18800b[i14];
            this.f18809d = i15;
            int i16 = 2;
            if (i11 == 2) {
                this.f18809d = i15 / 2;
            } else if (i11 == 0) {
                this.f18809d = i15 / 4;
            }
            int i17 = (i10 >>> 9) & 1;
            this.f18812g = h0.k(i11, i12);
            if (i12 == 3) {
                int i18 = i11 == 3 ? h0.f18801c[i13 - 1] : h0.f18802d[i13 - 1];
                this.f18811f = i18;
                this.f18808c = (((i18 * 12) / this.f18809d) + i17) * 4;
            } else {
                int i19 = 144;
                if (i11 == 3) {
                    int i20 = i12 == 2 ? h0.f18803e[i13 - 1] : h0.f18804f[i13 - 1];
                    this.f18811f = i20;
                    this.f18808c = ((i20 * 144) / this.f18809d) + i17;
                } else {
                    int i21 = h0.f18805g[i13 - 1];
                    this.f18811f = i21;
                    if (i12 == 1) {
                        i19 = 72;
                    }
                    this.f18808c = ((i19 * i21) / this.f18809d) + i17;
                }
            }
            if (((i10 >> 6) & 3) == 3) {
                i16 = 1;
            }
            this.f18810e = i16;
            return true;
        }
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f18800b[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f18801c[i13 - 1] : f18802d[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f18803e[i13 - 1] : f18804f[i13 - 1];
        } else {
            i15 = f18805g[i13 - 1];
        }
        int i18 = 144;
        if (i11 == 3) {
            return ((i15 * 144) / i16) + i17;
        }
        if (i12 == 1) {
            i18 = 72;
        }
        return ((i18 * i15) / i16) + i17;
    }

    public static int k(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static boolean l(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
