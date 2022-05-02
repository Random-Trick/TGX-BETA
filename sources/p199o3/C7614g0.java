package p199o3;

public final class C7614g0 {
    public static final String[] f24365a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] f24366b = {44100, 48000, 32000};
    public static final int[] f24367c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] f24368d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] f24369e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f24370f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] f24371g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class C7615a {
        public int f24372a;
        public String f24373b;
        public int f24374c;
        public int f24375d;
        public int f24376e;
        public int f24377f;
        public int f24378g;

        public boolean m15473a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if (!C7614g0.m15475l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f24372a = i2;
            this.f24373b = C7614g0.f24365a[3 - i3];
            int i6 = C7614g0.f24366b[i5];
            this.f24375d = i6;
            int i7 = 2;
            if (i2 == 2) {
                this.f24375d = i6 / 2;
            } else if (i2 == 0) {
                this.f24375d = i6 / 4;
            }
            int i8 = (i >>> 9) & 1;
            this.f24378g = C7614g0.m15476k(i2, i3);
            if (i3 == 3) {
                int i9 = i2 == 3 ? C7614g0.f24367c[i4 - 1] : C7614g0.f24368d[i4 - 1];
                this.f24377f = i9;
                this.f24374c = (((i9 * 12) / this.f24375d) + i8) * 4;
            } else {
                int i10 = 144;
                if (i2 == 3) {
                    int i11 = i3 == 2 ? C7614g0.f24369e[i4 - 1] : C7614g0.f24370f[i4 - 1];
                    this.f24377f = i11;
                    this.f24374c = ((i11 * 144) / this.f24375d) + i8;
                } else {
                    int i12 = C7614g0.f24371g[i4 - 1];
                    this.f24377f = i12;
                    if (i3 == 1) {
                        i10 = 72;
                    }
                    this.f24374c = ((i10 * i12) / this.f24375d) + i8;
                }
            }
            if (((i >> 6) & 3) == 3) {
                i7 = 1;
            }
            this.f24376e = i7;
            return true;
        }
    }

    public static int m15477j(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!m15475l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f24366b[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f24367c[i4 - 1] : f24368d[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f24369e[i4 - 1] : f24370f[i4 - 1];
        } else {
            i6 = f24371g[i4 - 1];
        }
        int i9 = 144;
        if (i2 == 3) {
            return ((i6 * 144) / i7) + i8;
        }
        if (i3 == 1) {
            i9 = 72;
        }
        return ((i9 * i6) / i7) + i8;
    }

    public static int m15476k(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static boolean m15475l(int i) {
        return (i & (-2097152)) == -2097152;
    }

    public static int m15474m(int i) {
        int i2;
        int i3;
        if (!m15475l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return m15476k(i2, i3);
    }
}
