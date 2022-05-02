package p033c6;

public final class C1904ra extends AbstractC1946ua {
    public String f6879a;
    public Boolean f6880b;
    public Integer f6881c;

    @Override
    public final AbstractC1946ua mo35867a(boolean z) {
        this.f6880b = Boolean.TRUE;
        return this;
    }

    @Override
    public final AbstractC1946ua mo35866b(int i) {
        this.f6881c = 1;
        return this;
    }

    @Override
    public final AbstractC1960va mo35865c() {
        Boolean bool;
        String str = this.f6879a;
        if (str != null && (bool = this.f6880b) != null && this.f6881c != null) {
            return new C1932ta(str, bool.booleanValue(), this.f6881c.intValue(), null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f6879a == null) {
            sb2.append(" libraryName");
        }
        if (this.f6880b == null) {
            sb2.append(" enableFirelog");
        }
        if (this.f6881c == null) {
            sb2.append(" firelogEventType");
        }
        String valueOf = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(valueOf.length() + 28);
        sb3.append("Missing required properties:");
        sb3.append(valueOf);
        throw new IllegalStateException(sb3.toString());
    }

    public final AbstractC1946ua m35916d(String str) {
        this.f6879a = str;
        return this;
    }
}
