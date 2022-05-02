package p105h8;

import java.util.Arrays;

public final class C5022a implements Cloneable {
    public final int[] f16935M;
    public final int f16936a;
    public final int f16937b;
    public final int f16938c;

    public C5022a(int i) {
        this(i, i);
    }

    public final String m24284a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f16937b * (this.f16936a + 1));
        for (int i = 0; i < this.f16937b; i++) {
            for (int i2 = 0; i2 < this.f16936a; i2++) {
                sb2.append(m24281d(i2, i) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public C5022a clone() {
        return new C5022a(this.f16936a, this.f16937b, this.f16938c, (int[]) this.f16935M.clone());
    }

    public void m24282c(int i, int i2) {
        int i3 = (i2 * this.f16938c) + (i / 32);
        int[] iArr = this.f16935M;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public boolean m24281d(int i, int i2) {
        return ((this.f16935M[(i2 * this.f16938c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public int[] m24280e() {
        int length = this.f16935M.length - 1;
        while (length >= 0 && this.f16935M[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.f16938c;
        int i2 = length / i;
        int i3 = (length % i) << 5;
        int i4 = 31;
        while ((this.f16935M[length] >>> i4) == 0) {
            i4--;
        }
        return new int[]{i3 + i4, i2};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5022a)) {
            return false;
        }
        C5022a aVar = (C5022a) obj;
        return this.f16936a == aVar.f16936a && this.f16937b == aVar.f16937b && this.f16938c == aVar.f16938c && Arrays.equals(this.f16935M, aVar.f16935M);
    }

    public int m24279f() {
        return this.f16937b;
    }

    public int[] m24278g() {
        int[] iArr;
        int i = 0;
        while (true) {
            iArr = this.f16935M;
            if (i >= iArr.length || iArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == iArr.length) {
            return null;
        }
        int i2 = this.f16938c;
        int i3 = i / i2;
        int i4 = (i % i2) << 5;
        int i5 = iArr[i];
        int i6 = 0;
        while ((i5 << (31 - i6)) == 0) {
            i6++;
        }
        return new int[]{i4 + i6, i3};
    }

    public int m24277h() {
        return this.f16936a;
    }

    public int hashCode() {
        int i = this.f16936a;
        return (((((((i * 31) + i) * 31) + this.f16937b) * 31) + this.f16938c) * 31) + Arrays.hashCode(this.f16935M);
    }

    public void m24276i(int i, int i2) {
        int i3 = (i2 * this.f16938c) + (i / 32);
        int[] iArr = this.f16935M;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public void m24275j(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.f16937b || i5 > this.f16936a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.f16938c * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.f16935M;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    public String m24274k(String str, String str2) {
        return m24284a(str, str2, "\n");
    }

    public String toString() {
        return m24274k("X ", "  ");
    }

    public C5022a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f16936a = i;
        this.f16937b = i2;
        int i3 = (i + 31) / 32;
        this.f16938c = i3;
        this.f16935M = new int[i3 * i2];
    }

    public C5022a(int i, int i2, int i3, int[] iArr) {
        this.f16936a = i;
        this.f16937b = i2;
        this.f16938c = i3;
        this.f16935M = iArr;
    }
}
