package p202o6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class C7709j1 extends OutputStream {
    public long f24714M;
    public long f24715N;
    public FileOutputStream f24716O;
    public AbstractC7726m3 f24717P;
    public final C7720l2 f24718a = new C7720l2();
    public final File f24719b;
    public final C7696g3 f24720c;

    public C7709j1(File file, C7696g3 g3Var) {
        this.f24719b = file;
        this.f24720c = g3Var;
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
            if (this.f24714M == 0 && this.f24715N == 0) {
                int b = this.f24718a.m15176b(bArr, i, i2);
                if (b != -1) {
                    i += b;
                    i2 -= b;
                    AbstractC7726m3 c = this.f24718a.m15175c();
                    this.f24717P = c;
                    if (c.mo15162d()) {
                        this.f24714M = 0L;
                        this.f24720c.m15214l(this.f24717P.mo15160f(), 0, this.f24717P.mo15160f().length);
                        this.f24715N = this.f24717P.mo15160f().length;
                    } else if (!this.f24717P.m15166h() || this.f24717P.m15167g()) {
                        byte[] f = this.f24717P.mo15160f();
                        this.f24720c.m15214l(f, 0, f.length);
                        this.f24714M = this.f24717P.mo15164b();
                    } else {
                        this.f24720c.m15216j(this.f24717P.mo15160f());
                        File file = new File(this.f24719b, this.f24717P.mo15163c());
                        file.getParentFile().mkdirs();
                        this.f24714M = this.f24717P.mo15164b();
                        this.f24716O = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.f24717P.m15167g()) {
                if (this.f24717P.mo15162d()) {
                    this.f24720c.m15221e(this.f24715N, bArr, i, i2);
                    this.f24715N += i2;
                    i3 = i2;
                } else if (this.f24717P.m15166h()) {
                    i3 = (int) Math.min(i2, this.f24714M);
                    this.f24716O.write(bArr, i, i3);
                    long j = this.f24714M - i3;
                    this.f24714M = j;
                    if (j == 0) {
                        this.f24716O.close();
                    }
                } else {
                    i3 = (int) Math.min(i2, this.f24714M);
                    this.f24720c.m15221e((this.f24717P.mo15160f().length + this.f24717P.mo15164b()) - this.f24714M, bArr, i, i3);
                    this.f24714M -= i3;
                }
                i += i3;
                i2 -= i3;
            }
        }
    }
}
