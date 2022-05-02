package p046d6;

public final class C3839x6 extends AbstractC3857z6 {
    public final String f12936a;
    public final boolean f12937b;
    public final int f12938c;

    public C3839x6(String str, boolean z, int i, C3821v6 v6Var) {
        this.f12936a = str;
        this.f12937b = z;
        this.f12938c = i;
    }

    @Override
    public final int mo29728a() {
        return this.f12938c;
    }

    @Override
    public final String mo29727b() {
        return this.f12936a;
    }

    @Override
    public final boolean mo29726c() {
        return this.f12937b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3857z6) {
            AbstractC3857z6 z6Var = (AbstractC3857z6) obj;
            if (this.f12936a.equals(z6Var.mo29727b()) && this.f12937b == z6Var.mo29726c() && this.f12938c == z6Var.mo29728a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f12936a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f12937b ? 1237 : 1231)) * 1000003) ^ this.f12938c;
    }

    public final String toString() {
        String str = this.f12936a;
        boolean z = this.f12937b;
        int i = this.f12938c;
        StringBuilder sb2 = new StringBuilder(str.length() + 84);
        sb2.append("MLKitLoggingOptions{libraryName=");
        sb2.append(str);
        sb2.append(", enableFirelog=");
        sb2.append(z);
        sb2.append(", firelogEventType=");
        sb2.append(i);
        sb2.append("}");
        return sb2.toString();
    }
}
