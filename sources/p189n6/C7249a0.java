package p189n6;

public final class C7249a0 extends AbstractC7254d {
    public final int f23081a;
    public final boolean f23082b;

    public C7249a0(int i, boolean z, C7278z zVar) {
        this.f23081a = i;
        this.f23082b = z;
    }

    @Override
    public final boolean mo17192a() {
        return this.f23082b;
    }

    @Override
    public final int mo17191b() {
        return this.f23081a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7254d) {
            AbstractC7254d dVar = (AbstractC7254d) obj;
            if (this.f23081a == dVar.mo17191b() && this.f23082b == dVar.mo17192a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f23081a ^ 1000003) * 1000003) ^ (true != this.f23082b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.f23081a;
        boolean z = this.f23082b;
        StringBuilder sb2 = new StringBuilder(73);
        sb2.append("AppUpdateOptions{appUpdateType=");
        sb2.append(i);
        sb2.append(", allowAssetPackDeletion=");
        sb2.append(z);
        sb2.append("}");
        return sb2.toString();
    }
}
