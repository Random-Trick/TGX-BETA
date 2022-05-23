package p6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class j1 extends OutputStream {
    public long M;
    public long N;
    public FileOutputStream O;
    public m3 P;
    public final l2 f20675a = new l2();
    public final File f20676b;
    public final g3 f20677c;

    public j1(File file, g3 g3Var) {
        this.f20676b = file;
        this.f20677c = g3Var;
    }

    @Override
    public final void write(int i10) {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    @Override
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        while (i11 > 0) {
            if (this.M == 0 && this.N == 0) {
                int b10 = this.f20675a.b(bArr, i10, i11);
                if (b10 != -1) {
                    i10 += b10;
                    i11 -= b10;
                    m3 c10 = this.f20675a.c();
                    this.P = c10;
                    if (c10.d()) {
                        this.M = 0L;
                        this.f20677c.l(this.P.f(), 0, this.P.f().length);
                        this.N = this.P.f().length;
                    } else if (!this.P.h() || this.P.g()) {
                        byte[] f10 = this.P.f();
                        this.f20677c.l(f10, 0, f10.length);
                        this.M = this.P.b();
                    } else {
                        this.f20677c.j(this.P.f());
                        File file = new File(this.f20676b, this.P.c());
                        file.getParentFile().mkdirs();
                        this.M = this.P.b();
                        this.O = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.P.g()) {
                if (this.P.d()) {
                    this.f20677c.e(this.N, bArr, i10, i11);
                    this.N += i11;
                    i12 = i11;
                } else if (this.P.h()) {
                    i12 = (int) Math.min(i11, this.M);
                    this.O.write(bArr, i10, i12);
                    long j10 = this.M - i12;
                    this.M = j10;
                    if (j10 == 0) {
                        this.O.close();
                    }
                } else {
                    i12 = (int) Math.min(i11, this.M);
                    this.f20677c.e((this.P.f().length + this.P.b()) - this.M, bArr, i10, i12);
                    this.M -= i12;
                }
                i10 += i12;
                i11 -= i12;
            }
        }
    }
}
