package p189n6;

public final class C7249a0 extends AbstractC7254d {
    public final int f23084a;
    public final boolean f23085b;

    public C7249a0(int i, boolean z, C7278z zVar) {
        this.f23084a = i;
        this.f23085b = z;
    }

    @Override
    public final boolean mo17192a() {
        return this.f23085b;
    }

    @Override
    public final int mo17191b() {
        return this.f23084a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7254d) {
            AbstractC7254d dVar = (AbstractC7254d) obj;
            if (this.f23084a == dVar.mo17191b() && this.f23085b == dVar.mo17192a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f23084a ^ 1000003) * 1000003) ^ (true != this.f23085b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f23084a;
        boolean z = this.f23085b;
        StringBuilder sb2 = new StringBuilder(73);
        sb2.append("AppUpdateOptions{appUpdateType=");
        sb2.append(i);
        sb2.append(", allowAssetPackDeletion=");
        sb2.append(z);
        sb2.append("}");
        return sb2.toString();
    }
}
