package o4;

import java.util.Arrays;
import java.util.Random;

public interface l0 {

    public static class a implements l0 {
        public final Random f19137a;
        public final int[] f19138b;
        public final int[] f19139c;

        public a(int i10) {
            this(i10, new Random());
        }

        public static int[] i(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int nextInt = random.nextInt(i12);
                iArr[i11] = iArr[nextInt];
                iArr[nextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override
        public int a() {
            return this.f19138b.length;
        }

        @Override
        public l0 b(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f19138b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f19138b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f19137a.nextLong()));
                }
                if (iArr2[i13] < i10 || iArr2[i13] >= i11) {
                    iArr[i13 - i14] = iArr2[i13] >= i10 ? iArr2[i13] - i12 : iArr2[i13];
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override
        public int c() {
            int[] iArr = this.f19138b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override
        public int d(int i10) {
            int i11 = this.f19139c[i10] - 1;
            if (i11 >= 0) {
                return this.f19138b[i11];
            }
            return -1;
        }

        @Override
        public int e(int i10) {
            int i11 = this.f19139c[i10] + 1;
            int[] iArr = this.f19138b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override
        public l0 f(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f19137a.nextInt(this.f19138b.length + 1);
                int i14 = i13 + 1;
                int nextInt = this.f19137a.nextInt(i14);
                iArr2[i13] = iArr2[nextInt];
                iArr2[nextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f19138b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f19138b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f19137a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    i16++;
                    iArr3[i12] = iArr4[i16];
                    if (iArr3[i12] >= i10) {
                        iArr3[i12] = iArr3[i12] + i11;
                    }
                } else {
                    i15++;
                    iArr3[i12] = iArr2[i15];
                }
                i12++;
            }
        }

        @Override
        public int g() {
            int[] iArr = this.f19138b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override
        public l0 h() {
            return new a(0, new Random(this.f19137a.nextLong()));
        }

        public a(int i10, Random random) {
            this(i(i10, random), random);
        }

        public a(int[] iArr, Random random) {
            this.f19138b = iArr;
            this.f19137a = random;
            this.f19139c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f19139c[iArr[i10]] = i10;
            }
        }
    }

    public static final class b implements l0 {
        public final int f19140a;

        public b(int i10) {
            this.f19140a = i10;
        }

        @Override
        public int a() {
            return this.f19140a;
        }

        @Override
        public l0 b(int i10, int i11) {
            return new b((this.f19140a - i11) + i10);
        }

        @Override
        public int c() {
            return this.f19140a > 0 ? 0 : -1;
        }

        @Override
        public int d(int i10) {
            int i11 = i10 - 1;
            if (i11 >= 0) {
                return i11;
            }
            return -1;
        }

        @Override
        public int e(int i10) {
            int i11 = i10 + 1;
            if (i11 < this.f19140a) {
                return i11;
            }
            return -1;
        }

        @Override
        public l0 f(int i10, int i11) {
            return new b(this.f19140a + i11);
        }

        @Override
        public int g() {
            int i10 = this.f19140a;
            if (i10 > 0) {
                return i10 - 1;
            }
            return -1;
        }

        @Override
        public l0 h() {
            return new b(0);
        }
    }

    int a();

    l0 b(int i10, int i11);

    int c();

    int d(int i10);

    int e(int i10);

    l0 f(int i10, int i11);

    int g();

    l0 h();
}
