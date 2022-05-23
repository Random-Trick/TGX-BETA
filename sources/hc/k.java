package hc;

import java.util.concurrent.TimeUnit;

public class k extends b0 {
    public b0 f12651f;

    public k(b0 b0Var) {
        ra.k.e(b0Var, "delegate");
        this.f12651f = b0Var;
    }

    @Override
    public b0 a() {
        return this.f12651f.a();
    }

    @Override
    public b0 b() {
        return this.f12651f.b();
    }

    @Override
    public long c() {
        return this.f12651f.c();
    }

    @Override
    public b0 d(long j10) {
        return this.f12651f.d(j10);
    }

    @Override
    public boolean e() {
        return this.f12651f.e();
    }

    @Override
    public void f() {
        this.f12651f.f();
    }

    @Override
    public b0 g(long j10, TimeUnit timeUnit) {
        ra.k.e(timeUnit, "unit");
        return this.f12651f.g(j10, timeUnit);
    }

    public final b0 i() {
        return this.f12651f;
    }

    public final k j(b0 b0Var) {
        ra.k.e(b0Var, "delegate");
        this.f12651f = b0Var;
        return this;
    }
}
