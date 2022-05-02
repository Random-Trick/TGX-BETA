package p093g8;

public abstract class AbstractC4524g {
    public final int f14919a;
    public final int f14920b;

    public AbstractC4524g(int i, int i2) {
        this.f14919a = i;
        this.f14920b = i2;
    }

    public final int m27500a() {
        return this.f14920b;
    }

    public abstract byte[] mo27497b();

    public abstract byte[] mo27496c(int i, byte[] bArr);

    public final int m27499d() {
        return this.f14919a;
    }

    public final String toString() {
        int i = this.f14919a;
        byte[] bArr = new byte[i];
        StringBuilder sb2 = new StringBuilder(this.f14920b * (i + 1));
        for (int i2 = 0; i2 < this.f14920b; i2++) {
            bArr = mo27496c(i2, bArr);
            for (int i3 = 0; i3 < this.f14919a; i3++) {
                int i4 = bArr[i3] & 255;
                sb2.append(i4 < 64 ? '#' : i4 < 128 ? '+' : i4 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
