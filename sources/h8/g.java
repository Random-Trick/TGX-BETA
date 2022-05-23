package h8;

public abstract class g {
    public final int f12603a;
    public final int f12604b;

    public g(int i10, int i11) {
        this.f12603a = i10;
        this.f12604b = i11;
    }

    public final int a() {
        return this.f12604b;
    }

    public abstract byte[] b();

    public abstract byte[] c(int i10, byte[] bArr);

    public final int d() {
        return this.f12603a;
    }

    public final String toString() {
        int i10 = this.f12603a;
        byte[] bArr = new byte[i10];
        StringBuilder sb2 = new StringBuilder(this.f12604b * (i10 + 1));
        for (int i11 = 0; i11 < this.f12604b; i11++) {
            bArr = c(i11, bArr);
            for (int i12 = 0; i12 < this.f12603a; i12++) {
                int i13 = bArr[i12] & 255;
                sb2.append(i13 < 64 ? '#' : i13 < 128 ? '+' : i13 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
