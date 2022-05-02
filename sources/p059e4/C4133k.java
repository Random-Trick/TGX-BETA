package p059e4;

import java.util.NoSuchElementException;

public final class C4133k {
    public int f13938a = 0;
    public int f13939b = -1;
    public int f13940c = 0;
    public int[] f13941d;
    public int f13942e;

    public C4133k() {
        int[] iArr = new int[16];
        this.f13941d = iArr;
        this.f13942e = iArr.length - 1;
    }

    public void m28819a(int i) {
        if (this.f13940c == this.f13941d.length) {
            m28817c();
        }
        int i2 = (this.f13939b + 1) & this.f13942e;
        this.f13939b = i2;
        this.f13941d[i2] = i;
        this.f13940c++;
    }

    public void m28818b() {
        this.f13938a = 0;
        this.f13939b = -1;
        this.f13940c = 0;
    }

    public final void m28817c() {
        int[] iArr = this.f13941d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i = this.f13938a;
            int i2 = length2 - i;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.f13941d, 0, iArr2, i2, i);
            this.f13938a = 0;
            this.f13939b = this.f13940c - 1;
            this.f13941d = iArr2;
            this.f13942e = iArr2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    public boolean m28816d() {
        return this.f13940c == 0;
    }

    public int m28815e() {
        int i = this.f13940c;
        if (i != 0) {
            int[] iArr = this.f13941d;
            int i2 = this.f13938a;
            int i3 = iArr[i2];
            this.f13938a = (i2 + 1) & this.f13942e;
            this.f13940c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }
}
