package ld;

import org.drinkless.td.libcore.telegram.TdApi;
import zd.o6;

public class s extends h {
    public int f16425d0;
    public long f16424c0 = -1;
    public int f16423b0 = -1;
    public int f16422a0 = -1;

    public s(o6 o6Var, TdApi.File file) {
        super(o6Var, file);
    }

    @Override
    public byte C() {
        return (byte) 6;
    }

    public long D0() {
        return this.f16424c0;
    }

    public int E0() {
        return this.f16423b0;
    }

    public int F0() {
        return this.f16422a0;
    }

    public int G0() {
        return this.Q;
    }

    public void H0(long j10) {
        this.f16424c0 = j10;
    }

    public void I0(int i10) {
        this.f16423b0 = i10;
        this.f16422a0 = i10;
    }

    public void J0(int i10, int i11) {
        this.f16422a0 = i10;
        this.f16423b0 = i11;
    }

    public void K0(int i10) {
        this.f16425d0 = i10;
    }

    @Override
    public String d() {
        StringBuilder e10 = e(new StringBuilder("video_"));
        if (this.f16422a0 > 0 && this.f16423b0 > 0) {
            e10.append(':');
            e10.append(this.f16422a0);
            e10.append('x');
            e10.append(this.f16423b0);
        }
        if (this.f16424c0 != 0) {
            e10.append(':');
            e10.append(this.f16424c0);
        }
        e10.append(':');
        e10.append(this.f16361a.local.path);
        return e10.toString();
    }

    @Override
    public void t0(int i10) {
        super.t0(i10);
        I0(i10);
    }
}
