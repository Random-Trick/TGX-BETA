package p202o6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class C7709j1 extends OutputStream {
    public long f24717M;
    public long f24718N;
    public FileOutputStream f24719O;
    public AbstractC7726m3 f24720P;
    public final C7720l2 f24721a = new C7720l2();
    public final File f24722b;
    public final C7696g3 f24723c;

    public C7709j1(File file, C7696g3 g3Var) {
        this.f24722b = file;
        this.f24723c = g3Var;
    }

    @Override
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        while (i2 > 0) {
            if (this.f24717M == 0 && this.f24718N == 0) {
                int b = this.f24721a.m15176b(bArr, i, i2);
                if (b != -1) {
                    i += b;
                    i2 -= b;
                    AbstractC7726m3 c = this.f24721a.m15175c();
                    this.f24720P = c;
                    if (c.mo15162d()) {
                        this.f24717M = 0L;
                        this.f24723c.m15214l(this.f24720P.mo15160f(), 0, this.f24720P.mo15160f().length);
                        this.f24718N = this.f24720P.mo15160f().length;
                    } else if (!this.f24720P.m15166h() || this.f24720P.m15167g()) {
                        byte[] f = this.f24720P.mo15160f();
                        this.f24723c.m15214l(f, 0, f.length);
                        this.f24717M = this.f24720P.mo15164b();
                    } else {
                        this.f24723c.m15216j(this.f24720P.mo15160f());
                        File file = new File(this.f24722b, this.f24720P.mo15163c());
                        file.getParentFile().mkdirs();
                        this.f24717M = this.f24720P.mo15164b();
                        this.f24719O = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.f24720P.m15167g()) {
                if (this.f24720P.mo15162d()) {
                    this.f24723c.m15221e(this.f24718N, bArr, i, i2);
                    this.f24718N += i2;
                    i3 = i2;
                } else if (this.f24720P.m15166h()) {
                    i3 = (int) Math.min(i2, this.f24717M);
                    this.f24719O.write(bArr, i, i3);
                    long j = this.f24717M - i3;
                    this.f24717M = j;
                    if (j == 0) {
                        this.f24719O.close();
                    }
                } else {
                    i3 = (int) Math.min(i2, this.f24717M);
                    this.f24723c.m15221e((this.f24720P.mo15160f().length + this.f24720P.mo15164b()) - this.f24717M, bArr, i, i3);
                    this.f24717M -= i3;
                }
                i += i3;
                i2 -= i3;
            }
        }
    }
}
