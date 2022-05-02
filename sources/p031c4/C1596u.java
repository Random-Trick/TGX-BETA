package p031c4;

import java.util.Arrays;
import p020b5.C1186a;

public final class C1596u {
    public final int f5844a;
    public boolean f5845b;
    public boolean f5846c;
    public byte[] f5847d;
    public int f5848e;

    public C1596u(int i, int i2) {
        this.f5844a = i;
        byte[] bArr = new byte[i2 + 3];
        this.f5847d = bArr;
        bArr[2] = 1;
    }

    public void m36326a(byte[] bArr, int i, int i2) {
        if (this.f5845b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f5847d;
            int length = bArr2.length;
            int i4 = this.f5848e;
            if (length < i4 + i3) {
                this.f5847d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f5847d, this.f5848e, i3);
            this.f5848e += i3;
        }
    }

    public boolean m36325b(int i) {
        if (!this.f5845b) {
            return false;
        }
        this.f5848e -= i;
        this.f5845b = false;
        this.f5846c = true;
        return true;
    }

    public boolean m36324c() {
        return this.f5846c;
    }

    public void m36323d() {
        this.f5845b = false;
        this.f5846c = false;
    }

    public void m36322e(int i) {
        boolean z = true;
        C1186a.m38184f(!this.f5845b);
        if (i != this.f5844a) {
            z = false;
        }
        this.f5845b = z;
        if (z) {
            this.f5848e = 3;
            this.f5846c = false;
        }
    }
}
