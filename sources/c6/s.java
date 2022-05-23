package c6;

public final class s extends u {
    public final String f4967a;
    public final boolean f4968b;
    public final int f4969c;

    public s(String str, boolean z10, int i10, r rVar) {
        this.f4967a = str;
        this.f4968b = z10;
        this.f4969c = i10;
    }

    @Override
    public final int a() {
        return this.f4969c;
    }

    @Override
    public final String b() {
        return this.f4967a;
    }

    @Override
    public final boolean c() {
        return this.f4968b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f4967a.equals(uVar.b()) && this.f4968b == uVar.c() && this.f4969c == uVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f4967a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f4968b ? 1237 : 1231)) * 1000003) ^ this.f4969c;
    }

    public final String toString() {
        String str = this.f4967a;
        boolean z10 = this.f4968b;
        int i10 = this.f4969c;
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
