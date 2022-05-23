package c4;

import c5.a;
import java.util.Arrays;

public final class u {
    public final int f4761a;
    public boolean f4762b;
    public boolean f4763c;
    public byte[] f4764d;
    public int f4765e;

    public u(int i10, int i11) {
        this.f4761a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f4764d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f4762b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f4764d;
            int length = bArr2.length;
            int i13 = this.f4765e;
            if (length < i13 + i12) {
                this.f4764d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f4764d, this.f4765e, i12);
            this.f4765e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f4762b) {
            return false;
        }
        this.f4765e -= i10;
        this.f4762b = false;
        this.f4763c = true;
        return true;
    }

    public boolean c() {
        return this.f4763c;
    }

    public void d() {
        this.f4762b = false;
        this.f4763c = false;
    }

    public void e(int i10) {
        boolean z10 = true;
        a.f(!this.f4762b);
        if (i10 != this.f4761a) {
            z10 = false;
        }
        this.f4762b = z10;
        if (z10) {
            this.f4765e = 3;
            this.f4763c = false;
        }
    }
}
