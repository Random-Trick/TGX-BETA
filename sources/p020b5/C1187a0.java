package p020b5;

import java.nio.charset.Charset;
import org.thunderdog.challegram.Log;

public final class C1187a0 {
    public byte[] f4469a;
    public int f4470b;
    public int f4471c;
    public int f4472d;

    public C1187a0() {
        this.f4469a = C1216l0.f4531f;
    }

    public final void m38180a() {
        int i;
        int i2 = this.f4470b;
        C1186a.m38184f(i2 >= 0 && (i2 < (i = this.f4472d) || (i2 == i && this.f4471c == 0)));
    }

    public int m38179b() {
        return ((this.f4472d - this.f4470b) * 8) - this.f4471c;
    }

    public void m38178c() {
        if (this.f4471c != 0) {
            this.f4471c = 0;
            this.f4470b++;
            m38180a();
        }
    }

    public int m38177d() {
        C1186a.m38184f(this.f4471c == 0);
        return this.f4470b;
    }

    public int m38176e() {
        return (this.f4470b * 8) + this.f4471c;
    }

    public void m38175f(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.f4471c, i2);
        int i3 = this.f4471c;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.f4469a;
        int i5 = this.f4470b;
        bArr[i5] = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        int i6 = i2 - min;
        bArr[i5] = (byte) (((i >>> i6) << i4) | bArr[i5]);
        int i7 = i5 + 1;
        while (i6 > 8) {
            i7++;
            this.f4469a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f4469a;
        bArr2[i7] = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | bArr2[i7]);
        m38163r(i2);
        m38180a();
    }

    public boolean m38174g() {
        boolean z = (this.f4469a[this.f4470b] & (Log.TAG_YOUTUBE >> this.f4471c)) != 0;
        m38164q();
        return z;
    }

    public int m38173h(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f4471c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f4471c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f4471c = i4;
            byte[] bArr = this.f4469a;
            int i5 = this.f4470b;
            this.f4470b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f4469a;
        int i6 = this.f4470b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f4471c = 0;
            this.f4470b = i6 + 1;
        }
        m38180a();
        return i7;
    }

    public void m38172i(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f4469a;
            int i4 = this.f4470b;
            int i5 = i4 + 1;
            this.f4470b = i5;
            byte b = bArr2[i4];
            int i6 = this.f4471c;
            bArr[i] = (byte) (b << i6);
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | bArr[i]);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 != 0) {
            bArr[i3] = (byte) (bArr[i3] & (255 >> i7));
            int i8 = this.f4471c;
            if (i8 + i7 > 8) {
                int i9 = bArr[i3];
                byte[] bArr3 = this.f4469a;
                int i10 = this.f4470b;
                this.f4470b = i10 + 1;
                bArr[i3] = (byte) (i9 | ((bArr3[i10] & 255) << i8));
                this.f4471c = i8 - 8;
            }
            int i11 = this.f4471c + i7;
            this.f4471c = i11;
            byte[] bArr4 = this.f4469a;
            int i12 = this.f4470b;
            bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i7))) | bArr[i3]);
            if (i11 == 8) {
                this.f4471c = 0;
                this.f4470b = i12 + 1;
            }
            m38180a();
        }
    }

    public long m38171j(int i) {
        return i <= 32 ? C1216l0.m38010F0(m38173h(i)) : C1216l0.m38012E0(m38173h(i - 32), m38173h(32));
    }

    public void m38170k(byte[] bArr, int i, int i2) {
        C1186a.m38184f(this.f4471c == 0);
        System.arraycopy(this.f4469a, this.f4470b, bArr, i, i2);
        this.f4470b += i2;
        m38180a();
    }

    public String m38169l(int i, Charset charset) {
        byte[] bArr = new byte[i];
        m38170k(bArr, 0, i);
        return new String(bArr, charset);
    }

    public void m38168m(C1189b0 b0Var) {
        m38166o(b0Var.m38139d(), b0Var.m38137f());
        m38165p(b0Var.m38138e() * 8);
    }

    public void m38167n(byte[] bArr) {
        m38166o(bArr, bArr.length);
    }

    public void m38166o(byte[] bArr, int i) {
        this.f4469a = bArr;
        this.f4470b = 0;
        this.f4471c = 0;
        this.f4472d = i;
    }

    public void m38165p(int i) {
        int i2 = i / 8;
        this.f4470b = i2;
        this.f4471c = i - (i2 * 8);
        m38180a();
    }

    public void m38164q() {
        int i = this.f4471c + 1;
        this.f4471c = i;
        if (i == 8) {
            this.f4471c = 0;
            this.f4470b++;
        }
        m38180a();
    }

    public void m38163r(int i) {
        int i2 = i / 8;
        int i3 = this.f4470b + i2;
        this.f4470b = i3;
        int i4 = this.f4471c + (i - (i2 * 8));
        this.f4471c = i4;
        if (i4 > 7) {
            this.f4470b = i3 + 1;
            this.f4471c = i4 - 8;
        }
        m38180a();
    }

    public void m38162s(int i) {
        C1186a.m38184f(this.f4471c == 0);
        this.f4470b += i;
        m38180a();
    }

    public C1187a0(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C1187a0(byte[] bArr, int i) {
        this.f4469a = bArr;
        this.f4472d = i;
    }
}
