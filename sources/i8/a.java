package i8;

import java.util.Arrays;

public final class a implements Cloneable {
    public final int[] M;
    public final int f14046a;
    public final int f14047b;
    public final int f14048c;

    public a(int i10) {
        this(i10, i10);
    }

    public final String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f14047b * (this.f14046a + 1));
        for (int i10 = 0; i10 < this.f14047b; i10++) {
            for (int i11 = 0; i11 < this.f14046a; i11++) {
                sb2.append(d(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public a clone() {
        return new a(this.f14046a, this.f14047b, this.f14048c, (int[]) this.M.clone());
    }

    public void c(int i10, int i11) {
        int i12 = (i11 * this.f14048c) + (i10 / 32);
        int[] iArr = this.M;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    public boolean d(int i10, int i11) {
        return ((this.M[(i11 * this.f14048c) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    public int[] e() {
        int length = this.M.length - 1;
        while (length >= 0 && this.M[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i10 = this.f14048c;
        int i11 = length / i10;
        int i12 = (length % i10) << 5;
        int i13 = 31;
        while ((this.M[length] >>> i13) == 0) {
            i13--;
        }
        return new int[]{i12 + i13, i11};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f14046a == aVar.f14046a && this.f14047b == aVar.f14047b && this.f14048c == aVar.f14048c && Arrays.equals(this.M, aVar.M);
    }

    public int f() {
        return this.f14047b;
    }

    public int[] g() {
        int[] iArr;
        int i10 = 0;
        while (true) {
            iArr = this.M;
            if (i10 >= iArr.length || iArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == iArr.length) {
            return null;
        }
        int i11 = this.f14048c;
        int i12 = i10 / i11;
        int i13 = (i10 % i11) << 5;
        int i14 = iArr[i10];
        int i15 = 0;
        while ((i14 << (31 - i15)) == 0) {
            i15++;
        }
        return new int[]{i13 + i15, i12};
    }

    public int h() {
        return this.f14046a;
    }

    public int hashCode() {
        int i10 = this.f14046a;
        return (((((((i10 * 31) + i10) * 31) + this.f14047b) * 31) + this.f14048c) * 31) + Arrays.hashCode(this.M);
    }

    public void i(int i10, int i11) {
        int i12 = (i11 * this.f14048c) + (i10 / 32);
        int[] iArr = this.M;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public void j(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i14 = i12 + i10;
            int i15 = i13 + i11;
            if (i15 > this.f14047b || i14 > this.f14046a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i11 < i15) {
                int i16 = this.f14048c * i11;
                for (int i17 = i10; i17 < i14; i17++) {
                    int[] iArr = this.M;
                    int i18 = (i17 / 32) + i16;
                    iArr[i18] = iArr[i18] | (1 << (i17 & 31));
                }
                i11++;
            }
        }
    }

    public String k(String str, String str2) {
        return a(str, str2, "\n");
    }

    public String toString() {
        return k("X ", "  ");
    }

    public a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f14046a = i10;
        this.f14047b = i11;
        int i12 = (i10 + 31) / 32;
        this.f14048c = i12;
        this.M = new int[i12 * i11];
    }

    public a(int i10, int i11, int i12, int[] iArr) {
        this.f14046a = i10;
        this.f14047b = i11;
        this.f14048c = i12;
        this.M = iArr;
    }
}
