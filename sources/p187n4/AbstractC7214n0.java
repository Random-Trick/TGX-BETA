package p187n4;

import java.util.Arrays;
import java.util.Random;

public interface AbstractC7214n0 {

    public static class C7215a implements AbstractC7214n0 {
        public final Random f22974a;
        public final int[] f22975b;
        public final int[] f22976c;

        public C7215a(int i) {
            this(i, new Random());
        }

        public static int[] m17326i(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int nextInt = random.nextInt(i3);
                iArr[i2] = iArr[nextInt];
                iArr[nextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }

        @Override
        public int mo17325a() {
            return this.f22975b.length;
        }

        @Override
        public AbstractC7214n0 mo17324b(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[this.f22975b.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f22975b;
                if (i4 >= iArr2.length) {
                    return new C7215a(iArr, new Random(this.f22974a.nextLong()));
                }
                if (iArr2[i4] < i || iArr2[i4] >= i2) {
                    iArr[i4 - i5] = iArr2[i4] >= i ? iArr2[i4] - i3 : iArr2[i4];
                } else {
                    i5++;
                }
                i4++;
            }
        }

        @Override
        public int mo17323c() {
            int[] iArr = this.f22975b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override
        public int mo17322d(int i) {
            int i2 = this.f22976c[i] - 1;
            if (i2 >= 0) {
                return this.f22975b[i2];
            }
            return -1;
        }

        @Override
        public int mo17321e(int i) {
            int i2 = this.f22976c[i] + 1;
            int[] iArr = this.f22975b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override
        public AbstractC7214n0 mo17320f(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f22974a.nextInt(this.f22975b.length + 1);
                int i5 = i4 + 1;
                int nextInt = this.f22974a.nextInt(i5);
                iArr2[i4] = iArr2[nextInt];
                iArr2[nextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f22975b.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f22975b;
                if (i3 >= iArr4.length + i2) {
                    return new C7215a(iArr3, new Random(this.f22974a.nextLong()));
                }
                if (i6 >= i2 || i7 != iArr[i6]) {
                    i7++;
                    iArr3[i3] = iArr4[i7];
                    if (iArr3[i3] >= i) {
                        iArr3[i3] = iArr3[i3] + i2;
                    }
                } else {
                    i6++;
                    iArr3[i3] = iArr2[i6];
                }
                i3++;
            }
        }

        @Override
        public int mo17319g() {
            int[] iArr = this.f22975b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override
        public AbstractC7214n0 mo17318h() {
            return new C7215a(0, new Random(this.f22974a.nextLong()));
        }

        public C7215a(int i, Random random) {
            this(m17326i(i, random), random);
        }

        public C7215a(int[] iArr, Random random) {
            this.f22975b = iArr;
            this.f22974a = random;
            this.f22976c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f22976c[iArr[i]] = i;
            }
        }
    }

    public static final class C7216b implements AbstractC7214n0 {
        public final int f22977a;

        public C7216b(int i) {
            this.f22977a = i;
        }

        @Override
        public int mo17325a() {
            return this.f22977a;
        }

        @Override
        public AbstractC7214n0 mo17324b(int i, int i2) {
            return new C7216b((this.f22977a - i2) + i);
        }

        @Override
        public int mo17323c() {
            return this.f22977a > 0 ? 0 : -1;
        }

        @Override
        public int mo17322d(int i) {
            int i2 = i - 1;
            if (i2 >= 0) {
                return i2;
            }
            return -1;
        }

        @Override
        public int mo17321e(int i) {
            int i2 = i + 1;
            if (i2 < this.f22977a) {
                return i2;
            }
            return -1;
        }

        @Override
        public AbstractC7214n0 mo17320f(int i, int i2) {
            return new C7216b(this.f22977a + i2);
        }

        @Override
        public int mo17319g() {
            int i = this.f22977a;
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }

        @Override
        public AbstractC7214n0 mo17318h() {
            return new C7216b(0);
        }
    }

    int mo17325a();

    AbstractC7214n0 mo17324b(int i, int i2);

    int mo17323c();

    int mo17322d(int i);

    int mo17321e(int i);

    AbstractC7214n0 mo17320f(int i, int i2);

    int mo17319g();

    AbstractC7214n0 mo17318h();
}
