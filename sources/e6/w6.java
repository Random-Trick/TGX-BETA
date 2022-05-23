package e6;

public final class w6 extends y6 {
    public String f11156a;
    public Boolean f11157b;
    public Integer f11158c;

    @Override
    public final y6 a(boolean z10) {
        this.f11157b = Boolean.TRUE;
        return this;
    }

    @Override
    public final y6 b(int i10) {
        this.f11158c = 1;
        return this;
    }

    @Override
    public final z6 c() {
        Boolean bool;
        String str = this.f11156a;
        if (str != null && (bool = this.f11157b) != null && this.f11158c != null) {
            return new x6(str, bool.booleanValue(), this.f11158c.intValue(), null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f11156a == null) {
            sb2.append(" libraryName");
        }
        if (this.f11157b == null) {
            sb2.append(" enableFirelog");
        }
        if (this.f11158c == null) {
            sb2.append(" firelogEventType");
        }
        String valueOf = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(valueOf.length() + 28);
        sb3.append("Missing required properties:");
        sb3.append(valueOf);
        throw new IllegalStateException(sb3.toString());
    }

    public final y6 d(String str) {
        this.f11156a = "vision-common";
        return this;
    }
}
