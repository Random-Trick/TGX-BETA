package p033c6;

public final class C1932ta extends AbstractC1960va {
    public final String f6946a;
    public final boolean f6947b;
    public final int f6948c;

    public C1932ta(String str, boolean z, int i, C1918sa saVar) {
        this.f6946a = str;
        this.f6947b = z;
        this.f6948c = i;
    }

    @Override
    public final int mo35846a() {
        return this.f6948c;
    }

    @Override
    public final String mo35845b() {
        return this.f6946a;
    }

    @Override
    public final boolean mo35844c() {
        return this.f6947b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1960va) {
            AbstractC1960va vaVar = (AbstractC1960va) obj;
            if (this.f6946a.equals(vaVar.mo35845b()) && this.f6947b == vaVar.mo35844c() && this.f6948c == vaVar.mo35846a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f6946a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f6947b ? 1237 : 1231)) * 1000003) ^ this.f6948c;
    }

    public final String toString() {
        String str = this.f6946a;
        boolean z = this.f6947b;
        int i = this.f6948c;
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
