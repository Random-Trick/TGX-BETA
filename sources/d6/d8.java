package d6;

public final class d8 {
    public Long f6450a;
    public n8 f6451b;
    public Boolean f6452c;
    public Boolean f6453d;
    public Boolean f6454e;

    public final d8 a(Boolean bool) {
        this.f6453d = bool;
        return this;
    }

    public final d8 b(Boolean bool) {
        this.f6454e = bool;
        return this;
    }

    public final d8 c(Long l10) {
        this.f6450a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final d8 d(n8 n8Var) {
        this.f6451b = n8Var;
        return this;
    }

    public final d8 e(Boolean bool) {
        this.f6452c = bool;
        return this;
    }

    public final f8 f() {
        return new f8(this, null);
    }
}
