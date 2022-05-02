package p021b6;

public final class C1283s extends AbstractC1285u {
    public final String f4642a;
    public final boolean f4643b;
    public final int f4644c;

    public C1283s(String str, boolean z, int i, C1282r rVar) {
        this.f4642a = str;
        this.f4643b = z;
        this.f4644c = i;
    }

    @Override
    public final int mo37797a() {
        return this.f4644c;
    }

    @Override
    public final String mo37796b() {
        return this.f4642a;
    }

    @Override
    public final boolean mo37795c() {
        return this.f4643b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1285u) {
            AbstractC1285u uVar = (AbstractC1285u) obj;
            if (this.f4642a.equals(uVar.mo37796b()) && this.f4643b == uVar.mo37795c() && this.f4644c == uVar.mo37797a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f4642a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f4643b ? 1237 : 1231)) * 1000003) ^ this.f4644c;
    }

    public final String toString() {
        String str = this.f4642a;
        boolean z = this.f4643b;
        int i = this.f4644c;
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
