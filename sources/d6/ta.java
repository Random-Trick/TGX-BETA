package d6;

public final class ta extends va {
    public final String f7010a;
    public final boolean f7011b;
    public final int f7012c;

    public ta(String str, boolean z10, int i10, sa saVar) {
        this.f7010a = str;
        this.f7011b = z10;
        this.f7012c = i10;
    }

    @Override
    public final int a() {
        return this.f7012c;
    }

    @Override
    public final String b() {
        return this.f7010a;
    }

    @Override
    public final boolean c() {
        return this.f7011b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof va) {
            va vaVar = (va) obj;
            if (this.f7010a.equals(vaVar.b()) && this.f7011b == vaVar.c() && this.f7012c == vaVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7010a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f7011b ? 1237 : 1231)) * 1000003) ^ this.f7012c;
    }

    public final String toString() {
        String str = this.f7010a;
        boolean z10 = this.f7011b;
        int i10 = this.f7012c;
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
