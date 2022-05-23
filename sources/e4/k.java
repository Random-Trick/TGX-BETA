package e4;

import java.util.NoSuchElementException;

public final class k {
    public int f10498a = 0;
    public int f10499b = -1;
    public int f10500c = 0;
    public int[] f10501d;
    public int f10502e;

    public k() {
        int[] iArr = new int[16];
        this.f10501d = iArr;
        this.f10502e = iArr.length - 1;
    }

    public void a(int i10) {
        if (this.f10500c == this.f10501d.length) {
            c();
        }
        int i11 = (this.f10499b + 1) & this.f10502e;
        this.f10499b = i11;
        this.f10501d[i11] = i10;
        this.f10500c++;
    }

    public void b() {
        this.f10498a = 0;
        this.f10499b = -1;
        this.f10500c = 0;
    }

    public final void c() {
        int[] iArr = this.f10501d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i10 = this.f10498a;
            int i11 = length2 - i10;
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            System.arraycopy(this.f10501d, 0, iArr2, i11, i10);
            this.f10498a = 0;
            this.f10499b = this.f10500c - 1;
            this.f10501d = iArr2;
            this.f10502e = iArr2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    public boolean d() {
        return this.f10500c == 0;
    }

    public int e() {
        int i10 = this.f10500c;
        if (i10 != 0) {
            int[] iArr = this.f10501d;
            int i11 = this.f10498a;
            int i12 = iArr[i11];
            this.f10498a = (i11 + 1) & this.f10502e;
            this.f10500c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }
}
