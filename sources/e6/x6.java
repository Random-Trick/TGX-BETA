package e6;

public final class x6 extends z6 {
    public final String f11177a;
    public final boolean f11178b;
    public final int f11179c;

    public x6(String str, boolean z10, int i10, v6 v6Var) {
        this.f11177a = str;
        this.f11178b = z10;
        this.f11179c = i10;
    }

    @Override
    public final int a() {
        return this.f11179c;
    }

    @Override
    public final String b() {
        return this.f11177a;
    }

    @Override
    public final boolean c() {
        return this.f11178b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z6) {
            z6 z6Var = (z6) obj;
            if (this.f11177a.equals(z6Var.b()) && this.f11178b == z6Var.c() && this.f11179c == z6Var.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f11177a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f11178b ? 1237 : 1231)) * 1000003) ^ this.f11179c;
    }

    public final String toString() {
        String str = this.f11177a;
        boolean z10 = this.f11178b;
        int i10 = this.f11179c;
        StringBuilder sb2 = new StringBuilder(str.length() + 84);
        sb2.append("MLKitLoggingOptions{libraryName=");
        sb2.append(str);
        sb2.append(", enableFirelog=");
        sb2.append(z10);
        sb2.append(", firelogEventType=");
        sb2.append(i10);
        sb2.append("}");
        return sb2.toString();
    }
}
