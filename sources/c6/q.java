package c6;

public final class q extends t {
    public String f4964a;
    public Boolean f4965b;
    public Integer f4966c;

    @Override
    public final t a(boolean z10) {
        this.f4965b = Boolean.TRUE;
        return this;
    }

    @Override
    public final t b(int i10) {
        this.f4966c = 1;
        return this;
    }

    @Override
    public final u c() {
        Boolean bool;
        String str = this.f4964a;
        if (str != null && (bool = this.f4965b) != null && this.f4966c != null) {
            return new s(str, bool.booleanValue(), this.f4966c.intValue(), null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f4964a == null) {
            sb2.append(" libraryName");
        }
        if (this.f4965b == null) {
            sb2.append(" enableFirelog");
        }
        if (this.f4966c == null) {
            sb2.append(" firelogEventType");
        }
        String valueOf = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(valueOf.length() + 28);
        sb3.append("Missing required properties:");
        sb3.append(valueOf);
        throw new IllegalStateException(sb3.toString());
    }

    public final t d(String str) {
        this.f4964a = "common";
        return this;
    }
}
