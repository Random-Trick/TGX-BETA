package d6;

public final class t7 {
    public Long f7004a;
    public Long f7005b;
    public Long f7006c;
    public Long f7007d;
    public Long f7008e;
    public Long f7009f;

    public final t7 a(Long l10) {
        this.f7006c = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final t7 b(Long l10) {
        this.f7007d = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final t7 c(Long l10) {
        this.f7004a = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final t7 d(Long l10) {
        this.f7008e = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final t7 e(Long l10) {
        this.f7005b = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final t7 f(Long l10) {
        this.f7009f = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final v7 g() {
        return new v7(this, null);
    }
}
