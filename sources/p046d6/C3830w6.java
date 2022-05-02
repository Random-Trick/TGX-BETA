package p046d6;

public final class C3830w6 extends AbstractC3848y6 {
    public String f12915a;
    public Boolean f12916b;
    public Integer f12917c;

    @Override
    public final AbstractC3848y6 mo29734a(boolean z) {
        this.f12916b = Boolean.TRUE;
        return this;
    }

    @Override
    public final AbstractC3848y6 mo29733b(int i) {
        this.f12917c = 1;
        return this;
    }

    @Override
    public final AbstractC3857z6 mo29732c() {
        Boolean bool;
        String str = this.f12915a;
        if (str != null && (bool = this.f12916b) != null && this.f12917c != null) {
            return new C3839x6(str, bool.booleanValue(), this.f12917c.intValue(), null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f12915a == null) {
            sb2.append(" libraryName");
        }
        if (this.f12916b == null) {
            sb2.append(" enableFirelog");
        }
        if (this.f12917c == null) {
            sb2.append(" firelogEventType");
        }
        String valueOf = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(valueOf.length() + 28);
        sb3.append("Missing required properties:");
        sb3.append(valueOf);
        throw new IllegalStateException(sb3.toString());
    }

    public final AbstractC3848y6 m29738d(String str) {
        this.f12915a = "vision-common";
        return this;
    }
}
