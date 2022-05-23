package d6;

public final class ra extends ua {
    public String f6948a;
    public Boolean f6949b;
    public Integer f6950c;

    @Override
    public final ua a(boolean z10) {
        this.f6949b = Boolean.TRUE;
        return this;
    }

    @Override
    public final ua b(int i10) {
        this.f6950c = 1;
        return this;
    }

    @Override
    public final va c() {
        Boolean bool;
        String str = this.f6948a;
        if (str != null && (bool = this.f6949b) != null && this.f6950c != null) {
            return new ta(str, bool.booleanValue(), this.f6950c.intValue(), null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f6948a == null) {
            sb2.append(" libraryName");
        }
        if (this.f6949b == null) {
            sb2.append(" enableFirelog");
        }
        if (this.f6950c == null) {
            sb2.append(" firelogEventType");
        }
        String valueOf = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(valueOf.length() + 28);
        sb3.append("Missing required properties:");
        sb3.append(valueOf);
        throw new IllegalStateException(sb3.toString());
    }

    public final ua d(String str) {
        this.f6948a = str;
        return this;
    }
}
