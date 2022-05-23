package e6;

public final class r4 {
    public Long f11064a;
    public s4 f11065b;
    public m4 f11066c;
    public Integer f11067d;
    public Integer f11068e;
    public Integer f11069f;
    public Integer f11070g;

    public final r4 b(Long l10) {
        this.f11064a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final r4 c(Integer num) {
        this.f11067d = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final r4 d(m4 m4Var) {
        this.f11066c = m4Var;
        return this;
    }

    public final r4 e(Integer num) {
        this.f11069f = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final r4 f(s4 s4Var) {
        this.f11065b = s4Var;
        return this;
    }

    public final r4 g(Integer num) {
        this.f11068e = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final r4 h(Integer num) {
        this.f11070g = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final t4 j() {
        return new t4(this, null);
    }
}
