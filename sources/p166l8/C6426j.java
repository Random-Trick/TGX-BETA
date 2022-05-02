package p166l8;

import org.thunderdog.challegram.Log;
import p039d.C3563j;
import p093g8.C4523f;
import p105h8.C5022a;

public final class C6426j {
    public static final int[] f20108e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final C6426j[] f20109f = m20423b();
    public final int f20110a;
    public final int[] f20111b;
    public final C6428b[] f20112c;
    public final int f20113d;

    public static final class C6427a {
        public final int f20114a;
        public final int f20115b;

        public C6427a(int i, int i2) {
            this.f20114a = i;
            this.f20115b = i2;
        }

        public int m20414a() {
            return this.f20114a;
        }

        public int m20413b() {
            return this.f20115b;
        }
    }

    public static final class C6428b {
        public final int f20116a;
        public final C6427a[] f20117b;

        public C6428b(int i, C6427a... aVarArr) {
            this.f20116a = i;
            this.f20117b = aVarArr;
        }

        public C6427a[] m20412a() {
            return this.f20117b;
        }

        public int m20411b() {
            return this.f20116a;
        }
    }

    public C6426j(int i, int[] iArr, C6428b... bVarArr) {
        C6427a[] a;
        this.f20110a = i;
        this.f20111b = iArr;
        this.f20112c = bVarArr;
        int b = bVarArr[0].m20411b();
        int i2 = 0;
        for (C6427a aVar : bVarArr[0].m20412a()) {
            i2 += aVar.m20414a() * (aVar.m20413b() + b);
        }
        this.f20113d = i2;
    }

    public static C6426j[] m20423b() {
        return new C6426j[]{new C6426j(1, new int[0], new C6428b(7, new C6427a(1, 19)), new C6428b(10, new C6427a(1, 16)), new C6428b(13, new C6427a(1, 13)), new C6428b(17, new C6427a(1, 9))), new C6426j(2, new int[]{6, 18}, new C6428b(10, new C6427a(1, 34)), new C6428b(16, new C6427a(1, 28)), new C6428b(22, new C6427a(1, 22)), new C6428b(28, new C6427a(1, 16))), new C6426j(3, new int[]{6, 22}, new C6428b(15, new C6427a(1, 55)), new C6428b(26, new C6427a(1, 44)), new C6428b(18, new C6427a(2, 17)), new C6428b(22, new C6427a(2, 13))), new C6426j(4, new int[]{6, 26}, new C6428b(20, new C6427a(1, 80)), new C6428b(18, new C6427a(2, 32)), new C6428b(26, new C6427a(2, 24)), new C6428b(16, new C6427a(4, 9))), new C6426j(5, new int[]{6, 30}, new C6428b(26, new C6427a(1, 108)), new C6428b(24, new C6427a(2, 43)), new C6428b(18, new C6427a(2, 15), new C6427a(2, 16)), new C6428b(22, new C6427a(2, 11), new C6427a(2, 12))), new C6426j(6, new int[]{6, 34}, new C6428b(18, new C6427a(2, 68)), new C6428b(16, new C6427a(4, 27)), new C6428b(24, new C6427a(4, 19)), new C6428b(28, new C6427a(4, 15))), new C6426j(7, new int[]{6, 22, 38}, new C6428b(20, new C6427a(2, 78)), new C6428b(18, new C6427a(4, 31)), new C6428b(18, new C6427a(2, 14), new C6427a(4, 15)), new C6428b(26, new C6427a(4, 13), new C6427a(1, 14))), new C6426j(8, new int[]{6, 24, 42}, new C6428b(24, new C6427a(2, 97)), new C6428b(22, new C6427a(2, 38), new C6427a(2, 39)), new C6428b(22, new C6427a(4, 18), new C6427a(2, 19)), new C6428b(26, new C6427a(4, 14), new C6427a(2, 15))), new C6426j(9, new int[]{6, 26, 46}, new C6428b(30, new C6427a(2, C3563j.f11937H0)), new C6428b(22, new C6427a(3, 36), new C6427a(2, 37)), new C6428b(20, new C6427a(4, 16), new C6427a(4, 17)), new C6428b(24, new C6427a(4, 12), new C6427a(4, 13))), new C6426j(10, new int[]{6, 28, 50}, new C6428b(18, new C6427a(2, 68), new C6427a(2, 69)), new C6428b(26, new C6427a(4, 43), new C6427a(1, 44)), new C6428b(24, new C6427a(6, 19), new C6427a(2, 20)), new C6428b(28, new C6427a(6, 15), new C6427a(2, 16))), new C6426j(11, new int[]{6, 30, 54}, new C6428b(20, new C6427a(4, 81)), new C6428b(30, new C6427a(1, 50), new C6427a(4, 51)), new C6428b(28, new C6427a(4, 22), new C6427a(4, 23)), new C6428b(24, new C6427a(3, 12), new C6427a(8, 13))), new C6426j(12, new int[]{6, 32, 58}, new C6428b(24, new C6427a(2, 92), new C6427a(2, 93)), new C6428b(22, new C6427a(6, 36), new C6427a(2, 37)), new C6428b(26, new C6427a(4, 20), new C6427a(6, 21)), new C6428b(28, new C6427a(7, 14), new C6427a(4, 15))), new C6426j(13, new int[]{6, 34, 62}, new C6428b(26, new C6427a(4, 107)), new C6428b(22, new C6427a(8, 37), new C6427a(1, 38)), new C6428b(24, new C6427a(8, 20), new C6427a(4, 21)), new C6428b(22, new C6427a(12, 11), new C6427a(4, 12))), new C6426j(14, new int[]{6, 26, 46, 66}, new C6428b(30, new C6427a(3, C3563j.f11932G0), new C6427a(1, C3563j.f11937H0)), new C6428b(24, new C6427a(4, 40), new C6427a(5, 41)), new C6428b(20, new C6427a(11, 16), new C6427a(5, 17)), new C6428b(24, new C6427a(11, 12), new C6427a(5, 13))), new C6426j(15, new int[]{6, 26, 48, 70}, new C6428b(22, new C6427a(5, 87), new C6427a(1, 88)), new C6428b(24, new C6427a(5, 41), new C6427a(5, 42)), new C6428b(30, new C6427a(5, 24), new C6427a(7, 25)), new C6428b(24, new C6427a(11, 12), new C6427a(7, 13))), new C6426j(16, new int[]{6, 26, 50, 74}, new C6428b(24, new C6427a(5, 98), new C6427a(1, 99)), new C6428b(28, new C6427a(7, 45), new C6427a(3, 46)), new C6428b(24, new C6427a(15, 19), new C6427a(2, 20)), new C6428b(30, new C6427a(3, 15), new C6427a(13, 16))), new C6426j(17, new int[]{6, 30, 54, 78}, new C6428b(28, new C6427a(1, 107), new C6427a(5, 108)), new C6428b(28, new C6427a(10, 46), new C6427a(1, 47)), new C6428b(28, new C6427a(1, 22), new C6427a(15, 23)), new C6428b(28, new C6427a(2, 14), new C6427a(17, 15))), new C6426j(18, new int[]{6, 30, 56, 82}, new C6428b(30, new C6427a(5, C3563j.f11957L0), new C6427a(1, C3563j.f11962M0)), new C6428b(26, new C6427a(9, 43), new C6427a(4, 44)), new C6428b(28, new C6427a(17, 22), new C6427a(1, 23)), new C6428b(28, new C6427a(2, 14), new C6427a(19, 15))), new C6426j(19, new int[]{6, 30, 58, 86}, new C6428b(28, new C6427a(3, 113), new C6427a(4, C3563j.f11927F0)), new C6428b(26, new C6427a(3, 44), new C6427a(11, 45)), new C6428b(26, new C6427a(17, 21), new C6427a(4, 22)), new C6428b(26, new C6427a(9, 13), new C6427a(16, 14))), new C6426j(20, new int[]{6, 34, 62, 90}, new C6428b(28, new C6427a(3, 107), new C6427a(5, 108)), new C6428b(26, new C6427a(3, 41), new C6427a(13, 42)), new C6428b(30, new C6427a(15, 24), new C6427a(5, 25)), new C6428b(28, new C6427a(15, 15), new C6427a(10, 16))), new C6426j(21, new int[]{6, 28, 50, 72, 94}, new C6428b(28, new C6427a(4, C3563j.f11937H0), new C6427a(4, C3563j.f11942I0)), new C6428b(26, new C6427a(17, 42)), new C6428b(28, new C6427a(17, 22), new C6427a(6, 23)), new C6428b(30, new C6427a(19, 16), new C6427a(6, 17))), new C6426j(22, new int[]{6, 26, 50, 74, 98}, new C6428b(28, new C6427a(2, 111), new C6427a(7, 112)), new C6428b(28, new C6427a(17, 46)), new C6428b(30, new C6427a(7, 24), new C6427a(16, 25)), new C6428b(24, new C6427a(34, 13))), new C6426j(23, new int[]{6, 30, 54, 78, 102}, new C6428b(30, new C6427a(4, C3563j.f11962M0), new C6427a(5, C3563j.f11967N0)), new C6428b(28, new C6427a(4, 47), new C6427a(14, 48)), new C6428b(30, new C6427a(11, 24), new C6427a(14, 25)), new C6428b(30, new C6427a(16, 15), new C6427a(14, 16))), new C6426j(24, new int[]{6, 28, 54, 80, 106}, new C6428b(30, new C6427a(6, C3563j.f11942I0), new C6427a(4, C3563j.f11947J0)), new C6428b(28, new C6427a(6, 45), new C6427a(14, 46)), new C6428b(30, new C6427a(11, 24), new C6427a(16, 25)), new C6428b(30, new C6427a(30, 16), new C6427a(2, 17))), new C6426j(25, new int[]{6, 32, 58, 84, 110}, new C6428b(26, new C6427a(8, 106), new C6427a(4, 107)), new C6428b(28, new C6427a(8, 47), new C6427a(13, 48)), new C6428b(30, new C6427a(7, 24), new C6427a(22, 25)), new C6428b(30, new C6427a(22, 15), new C6427a(13, 16))), new C6426j(26, new int[]{6, 30, 58, 86, C3563j.f11927F0}, new C6428b(28, new C6427a(10, C3563j.f11927F0), new C6427a(2, C3563j.f11932G0)), new C6428b(28, new C6427a(19, 46), new C6427a(4, 47)), new C6428b(28, new C6427a(28, 22), new C6427a(6, 23)), new C6428b(30, new C6427a(33, 16), new C6427a(4, 17))), new C6426j(27, new int[]{6, 34, 62, 90, C3563j.f11947J0}, new C6428b(30, new C6427a(8, C3563j.f11967N0), new C6427a(4, C3563j.f11972O0)), new C6428b(28, new C6427a(22, 45), new C6427a(3, 46)), new C6428b(30, new C6427a(8, 23), new C6427a(26, 24)), new C6428b(30, new C6427a(12, 15), new C6427a(28, 16))), new C6426j(28, new int[]{6, 26, 50, 74, 98, C3563j.f11967N0}, new C6428b(30, new C6427a(3, C3563j.f11942I0), new C6427a(10, C3563j.f11947J0)), new C6428b(28, new C6427a(3, 45), new C6427a(23, 46)), new C6428b(30, new C6427a(4, 24), new C6427a(31, 25)), new C6428b(30, new C6427a(11, 15), new C6427a(31, 16))), new C6426j(29, new int[]{6, 30, 54, 78, 102, 126}, new C6428b(30, new C6427a(7, C3563j.f11937H0), new C6427a(7, C3563j.f11942I0)), new C6428b(28, new C6427a(21, 45), new C6427a(7, 46)), new C6428b(30, new C6427a(1, 23), new C6427a(37, 24)), new C6428b(30, new C6427a(19, 15), new C6427a(26, 16))), new C6426j(30, new int[]{6, 26, 52, 78, 104, 130}, new C6428b(30, new C6427a(5, C3563j.f11932G0), new C6427a(10, C3563j.f11937H0)), new C6428b(28, new C6427a(19, 47), new C6427a(10, 48)), new C6428b(30, new C6427a(15, 24), new C6427a(25, 25)), new C6428b(30, new C6427a(23, 15), new C6427a(25, 16))), new C6426j(31, new int[]{6, 30, 56, 82, 108, 134}, new C6428b(30, new C6427a(13, C3563j.f11932G0), new C6427a(3, C3563j.f11937H0)), new C6428b(28, new C6427a(2, 46), new C6427a(29, 47)), new C6428b(30, new C6427a(42, 24), new C6427a(1, 25)), new C6428b(30, new C6427a(23, 15), new C6427a(28, 16))), new C6426j(32, new int[]{6, 34, 60, 86, 112, 138}, new C6428b(30, new C6427a(17, C3563j.f11932G0)), new C6428b(28, new C6427a(10, 46), new C6427a(23, 47)), new C6428b(30, new C6427a(10, 24), new C6427a(35, 25)), new C6428b(30, new C6427a(19, 15), new C6427a(35, 16))), new C6426j(33, new int[]{6, 30, 58, 86, C3563j.f11927F0, 142}, new C6428b(30, new C6427a(17, C3563j.f11932G0), new C6427a(1, C3563j.f11937H0)), new C6428b(28, new C6427a(14, 46), new C6427a(21, 47)), new C6428b(30, new C6427a(29, 24), new C6427a(19, 25)), new C6428b(30, new C6427a(11, 15), new C6427a(46, 16))), new C6426j(34, new int[]{6, 34, 62, 90, C3563j.f11947J0, 146}, new C6428b(30, new C6427a(13, C3563j.f11932G0), new C6427a(6, C3563j.f11937H0)), new C6428b(28, new C6427a(14, 46), new C6427a(23, 47)), new C6428b(30, new C6427a(44, 24), new C6427a(7, 25)), new C6428b(30, new C6427a(59, 16), new C6427a(1, 17))), new C6426j(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new C6428b(30, new C6427a(12, C3563j.f11962M0), new C6427a(7, C3563j.f11967N0)), new C6428b(28, new C6427a(12, 47), new C6427a(26, 48)), new C6428b(30, new C6427a(39, 24), new C6427a(14, 25)), new C6428b(30, new C6427a(22, 15), new C6427a(41, 16))), new C6426j(36, new int[]{6, 24, 50, 76, 102, Log.TAG_YOUTUBE, 154}, new C6428b(30, new C6427a(6, C3563j.f11962M0), new C6427a(14, C3563j.f11967N0)), new C6428b(28, new C6427a(6, 47), new C6427a(34, 48)), new C6428b(30, new C6427a(46, 24), new C6427a(10, 25)), new C6428b(30, new C6427a(2, 15), new C6427a(64, 16))), new C6426j(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C6428b(30, new C6427a(17, C3563j.f11967N0), new C6427a(4, C3563j.f11972O0)), new C6428b(28, new C6427a(29, 46), new C6427a(14, 47)), new C6428b(30, new C6427a(49, 24), new C6427a(10, 25)), new C6428b(30, new C6427a(24, 15), new C6427a(46, 16))), new C6426j(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C6428b(30, new C6427a(4, C3563j.f11967N0), new C6427a(18, C3563j.f11972O0)), new C6428b(28, new C6427a(13, 46), new C6427a(32, 47)), new C6428b(30, new C6427a(48, 24), new C6427a(14, 25)), new C6428b(30, new C6427a(42, 15), new C6427a(32, 16))), new C6426j(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C6428b(30, new C6427a(20, C3563j.f11942I0), new C6427a(4, C3563j.f11947J0)), new C6428b(28, new C6427a(40, 47), new C6427a(7, 48)), new C6428b(30, new C6427a(43, 24), new C6427a(22, 25)), new C6428b(30, new C6427a(10, 15), new C6427a(67, 16))), new C6426j(40, new int[]{6, 30, 58, 86, C3563j.f11927F0, 142, 170}, new C6428b(30, new C6427a(19, C3563j.f11947J0), new C6427a(6, C3563j.f11952K0)), new C6428b(28, new C6427a(18, 47), new C6427a(31, 48)), new C6428b(30, new C6427a(34, 24), new C6427a(34, 25)), new C6428b(30, new C6427a(20, 15), new C6427a(61, 16)))};
    }

    public static C6426j m20422c(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        while (true) {
            int[] iArr = f20108e;
            if (i2 < iArr.length) {
                int i5 = iArr[i2];
                if (i5 == i) {
                    return m20416i(i2 + 7);
                }
                int e = C6423g.m20428e(i, i5);
                if (e < i4) {
                    i3 = i2 + 7;
                    i4 = e;
                }
                i2++;
            } else if (i4 <= 3) {
                return m20416i(i3);
            } else {
                return null;
            }
        }
    }

    public static C6426j m20418g(int i) {
        if (i % 4 == 1) {
            try {
                return m20416i((i - 17) / 4);
            } catch (IllegalArgumentException unused) {
                throw C4523f.m27499a();
            }
        } else {
            throw C4523f.m27499a();
        }
    }

    public static C6426j m20416i(int i) {
        if (i > 0 && i <= 40) {
            return f20109f[i - 1];
        }
        throw new IllegalArgumentException();
    }

    public C5022a m20424a() {
        int e = m20420e();
        C5022a aVar = new C5022a(e);
        aVar.m24275j(0, 0, 9, 9);
        int i = e - 8;
        aVar.m24275j(i, 0, 8, 9);
        aVar.m24275j(0, i, 9, 8);
        int length = this.f20111b.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f20111b[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if (!((i2 == 0 && (i4 == 0 || i4 == length - 1)) || (i2 == length - 1 && i4 == 0))) {
                    aVar.m24275j(this.f20111b[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = e - 17;
        aVar.m24275j(6, 9, 1, i5);
        aVar.m24275j(9, 6, i5, 1);
        if (this.f20110a > 6) {
            int i6 = e - 11;
            aVar.m24275j(i6, 0, 3, 6);
            aVar.m24275j(0, i6, 6, 3);
        }
        return aVar;
    }

    public int[] m20421d() {
        return this.f20111b;
    }

    public int m20420e() {
        return (this.f20110a * 4) + 17;
    }

    public C6428b m20419f(EnumC6422f fVar) {
        return this.f20112c[fVar.ordinal()];
    }

    public int m20417h() {
        return this.f20113d;
    }

    public int m20415j() {
        return this.f20110a;
    }

    public String toString() {
        return String.valueOf(this.f20110a);
    }
}
