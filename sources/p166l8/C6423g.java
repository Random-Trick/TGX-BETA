package p166l8;

public final class C6423g {
    public static final int[][] f20091c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
    public final EnumC6422f f20092a;
    public final byte f20093b;

    public C6423g(int i) {
        this.f20092a = EnumC6422f.m20433a((i >> 3) & 3);
        this.f20093b = (byte) (i & 7);
    }

    public static C6423g m20432a(int i, int i2) {
        C6423g b = m20431b(i, i2);
        return b != null ? b : m20431b(i ^ 21522, i2 ^ 21522);
    }

    public static C6423g m20431b(int i, int i2) {
        int[][] iArr;
        int e;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr2 : f20091c) {
            int i5 = iArr2[0];
            if (i5 == i || i5 == i2) {
                return new C6423g(iArr2[1]);
            }
            int e2 = m20428e(i, i5);
            if (e2 < i3) {
                i4 = iArr2[1];
                i3 = e2;
            }
            if (i != i2 && (e = m20428e(i2, i5)) < i3) {
                i4 = iArr2[1];
                i3 = e;
            }
        }
        if (i3 <= 3) {
            return new C6423g(i4);
        }
        return null;
    }

    public static int m20428e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    public byte m20430c() {
        return this.f20093b;
    }

    public EnumC6422f m20429d() {
        return this.f20092a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6423g)) {
            return false;
        }
        C6423g gVar = (C6423g) obj;
        return this.f20092a == gVar.f20092a && this.f20093b == gVar.f20093b;
    }

    public int hashCode() {
        return (this.f20092a.ordinal() << 3) | this.f20093b;
    }
}
