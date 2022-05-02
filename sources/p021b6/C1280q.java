package p021b6;

public final class C1280q extends AbstractC1284t {
    public String f4639a;
    public Boolean f4640b;
    public Integer f4641c;

    @Override
    public final AbstractC1284t mo37800a(boolean z) {
        this.f4640b = Boolean.TRUE;
        return this;
    }

    @Override
    public final AbstractC1284t mo37799b(int i) {
        this.f4641c = 1;
        return this;
    }

    @Override
    public final AbstractC1285u mo37798c() {
        Boolean bool;
        String str = this.f4639a;
        if (str != null && (bool = this.f4640b) != null && this.f4641c != null) {
            return new C1283s(str, bool.booleanValue(), this.f4641c.intValue(), null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f4639a == null) {
            sb2.append(" libraryName");
        }
        if (this.f4640b == null) {
            sb2.append(" enableFirelog");
        }
        if (this.f4641c == null) {
            sb2.append(" firelogEventType");
        }
        String valueOf = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(valueOf.length() + 28);
        sb3.append("Missing required properties:");
        sb3.append(valueOf);
        throw new IllegalStateException(sb3.toString());
    }

    public final AbstractC1284t m37802d(String str) {
        this.f4639a = "common";
        return this;
    }
}
