package p033c6;

public final class C1698d8 {
    public Long f6205a;
    public EnumC1846n8 f6206b;
    public Boolean f6207c;
    public Boolean f6208d;
    public Boolean f6209e;

    public final C1698d8 m36086a(Boolean bool) {
        this.f6208d = bool;
        return this;
    }

    public final C1698d8 m36085b(Boolean bool) {
        this.f6209e = bool;
        return this;
    }

    public final C1698d8 m36084c(Long l) {
        this.f6205a = Long.valueOf(l.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final C1698d8 m36083d(EnumC1846n8 n8Var) {
        this.f6206b = n8Var;
        return this;
    }

    public final C1698d8 m36082e(Boolean bool) {
        this.f6207c = bool;
        return this;
    }

    public final C1728f8 m36081f() {
        return new C1728f8(this, null);
    }
}