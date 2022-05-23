package hc;

import java.nio.ByteBuffer;
import ra.k;

public final class t implements f {
    public final e f12665a = new e();
    public boolean f12666b;
    public final y f12667c;

    public t(y yVar) {
        k.e(yVar, "sink");
        this.f12667c = yVar;
    }

    @Override
    public f D(int i10) {
        if (!this.f12666b) {
            this.f12665a.D(i10);
            return m();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public f P(String str) {
        k.e(str, "string");
        if (!this.f12666b) {
            this.f12665a.P(str);
            return m();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public f V(byte[] bArr, int i10, int i11) {
        k.e(bArr, "source");
        if (!this.f12666b) {
            this.f12665a.V(bArr, i10, i11);
            return m();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public f X(long j10) {
        if (!this.f12666b) {
            this.f12665a.X(j10);
            return m();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public e a() {
        return this.f12665a;
    }

    @Override
    public b0 c() {
        return this.f12667c.c();
    }

    @Override
    public void c0(e eVar, long j10) {
        k.e(eVar, "source");
        if (!this.f12666b) {
            this.f12665a.c0(eVar, j10);
            m();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public void close() {
        if (!this.f12666b) {
            Throwable th = null;
            try {
                if (this.f12665a.size() > 0) {
                    y yVar = this.f12667c;
                    e eVar = this.f12665a;
                    yVar.c0(eVar, eVar.size());
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f12667c.close();
            } catch (Throwable th3) {
                th = th3;
                if (th == null) {
                }
            }
            this.f12666b = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override
    public void flush() {
        if (!this.f12666b) {
            if (this.f12665a.size() > 0) {
                y yVar = this.f12667c;
                e eVar = this.f12665a;
                yVar.c0(eVar, eVar.size());
            }
            this.f12667c.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public boolean isOpen() {
        return !this.f12666b;
    }

    @Override
    public f l0(byte[] bArr) {
        k.e(bArr, "source");
        if (!this.f12666b) {
            this.f12665a.l0(bArr);
            return m();
        }
        throw new IllegalStateException("closed".toString());
    }

    public f m() {
        if (!this.f12666b) {
            long A0 = this.f12665a.A0();
            if (A0 > 0) {
                this.f12667c.c0(this.f12665a, A0);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public f n0(h hVar) {
        k.e(hVar, "byteString");
        if (!this.f12666b) {
            this.f12665a.n0(hVar);
            return m();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public f r(int i10) {
        if (!this.f12666b) {
            this.f12665a.r(i10);
            return m();
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        return "buffer(" + this.f12667c + ')';
    }

    @Override
    public f v(int i10) {
        if (!this.f12666b) {
            this.f12665a.v(i10);
            return m();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public int write(ByteBuffer byteBuffer) {
        k.e(byteBuffer, "source");
        if (!this.f12666b) {
            int write = this.f12665a.write(byteBuffer);
            m();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }
}
