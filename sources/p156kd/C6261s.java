package p156kd;

import org.drinkless.p210td.libcore.telegram.TdApi;
import p350yd.C10930q6;

public class C6261s extends C6246h {
    public int f19782d0;
    public long f19781c0 = -1;
    public int f19780b0 = -1;
    public int f19779a0 = -1;

    public C6261s(C10930q6 q6Var, TdApi.File file) {
        super(q6Var, file);
    }

    @Override
    public byte mo20778C() {
        return (byte) 6;
    }

    public long m20777D0() {
        return this.f19781c0;
    }

    public int m20776E0() {
        return this.f19780b0;
    }

    public int m20775F0() {
        return this.f19779a0;
    }

    public int m20774G0() {
        return this.f19694Q;
    }

    public void m20773H0(long j) {
        this.f19781c0 = j;
    }

    public void m20772I0(int i) {
        this.f19780b0 = i;
        this.f19779a0 = i;
    }

    public void m20771J0(int i, int i2) {
        this.f19779a0 = i;
        this.f19780b0 = i2;
    }

    public void m20770K0(int i) {
        this.f19782d0 = i;
    }

    @Override
    public String mo20769d() {
        StringBuilder e = m20923e(new StringBuilder("video_"));
        if (this.f19779a0 > 0 && this.f19780b0 > 0) {
            e.append(':');
            e.append(this.f19779a0);
            e.append('x');
            e.append(this.f19780b0);
        }
        if (this.f19781c0 != 0) {
            e.append(':');
            e.append(this.f19781c0);
        }
        e.append(':');
        e.append(this.f19704a.local.path);
        return e.toString();
    }

    @Override
    public void mo20768t0(int i) {
        super.mo20768t0(i);
        m20772I0(i);
    }
}
