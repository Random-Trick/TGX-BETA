package p095gc;

import java.nio.ByteBuffer;
import qa.C8298k;

public final class C4566t implements AbstractC4550f {
    public final C4549e f14997a = new C4549e();
    public boolean f14998b;
    public final AbstractC4572y f14999c;

    public C4566t(AbstractC4572y yVar) {
        C8298k.m12933e(yVar, "sink");
        this.f14999c = yVar;
    }

    @Override
    public AbstractC4550f mo27351C(int i) {
        if (!this.f14998b) {
            this.f14997a.mo27351C(i);
            return m27345m();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public AbstractC4550f mo27350O(String str) {
        C8298k.m12933e(str, "string");
        if (!this.f14998b) {
            this.f14997a.mo27350O(str);
            return m27345m();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public AbstractC4550f mo27349U(byte[] bArr, int i, int i2) {
        C8298k.m12933e(bArr, "source");
        if (!this.f14998b) {
            this.f14997a.mo27349U(bArr, i, i2);
            return m27345m();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public AbstractC4550f mo27348W(long j) {
        if (!this.f14998b) {
            this.f14997a.mo27348W(j);
            return m27345m();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public C4549e mo27338a() {
        return this.f14997a;
    }

    @Override
    public C4539b0 mo27303c() {
        return this.f14999c.mo27303c();
    }

    @Override
    public void close() {
        if (!this.f14998b) {
            Throwable th = null;
            try {
                if (this.f14997a.size() > 0) {
                    AbstractC4572y yVar = this.f14999c;
                    C4549e eVar = this.f14997a;
                    yVar.mo5030h0(eVar, eVar.size());
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f14999c.close();
            } catch (Throwable th3) {
                th = th3;
                if (th == null) {
                }
            }
            this.f14998b = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override
    public void flush() {
        if (!this.f14998b) {
            if (this.f14997a.size() > 0) {
                AbstractC4572y yVar = this.f14999c;
                C4549e eVar = this.f14997a;
                yVar.mo5030h0(eVar, eVar.size());
            }
            this.f14999c.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public void mo5030h0(C4549e eVar, long j) {
        C8298k.m12933e(eVar, "source");
        if (!this.f14998b) {
            this.f14997a.mo5030h0(eVar, j);
            m27345m();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public boolean isOpen() {
        return !this.f14998b;
    }

    @Override
    public AbstractC4550f mo27347k0(C4552h hVar) {
        C8298k.m12933e(hVar, "byteString");
        if (!this.f14998b) {
            this.f14997a.mo27347k0(hVar);
            return m27345m();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public AbstractC4550f mo27346l0(byte[] bArr) {
        C8298k.m12933e(bArr, "source");
        if (!this.f14998b) {
            this.f14997a.mo27346l0(bArr);
            return m27345m();
        }
        throw new IllegalStateException("closed".toString());
    }

    public AbstractC4550f m27345m() {
        if (!this.f14998b) {
            long A0 = this.f14997a.m27449A0();
            if (A0 > 0) {
                this.f14999c.mo5030h0(this.f14997a, A0);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public AbstractC4550f mo27344r(int i) {
        if (!this.f14998b) {
            this.f14997a.mo27344r(i);
            return m27345m();
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        return "buffer(" + this.f14999c + ')';
    }

    @Override
    public AbstractC4550f mo27343w(int i) {
        if (!this.f14998b) {
            this.f14997a.mo27343w(i);
            return m27345m();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override
    public int write(ByteBuffer byteBuffer) {
        C8298k.m12933e(byteBuffer, "source");
        if (!this.f14998b) {
            int write = this.f14997a.write(byteBuffer);
            m27345m();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }
}
