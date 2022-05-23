package o6;

public final class a0 extends d {
    public final int f19221a;
    public final boolean f19222b;

    public a0(int i10, boolean z10, z zVar) {
        this.f19221a = i10;
        this.f19222b = z10;
    }

    @Override
    public final boolean a() {
        return this.f19222b;
    }

    @Override
    public final int b() {
        return this.f19221a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f19221a == dVar.b() && this.f19222b == dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f19221a ^ 1000003) * 1000003) ^ (true != this.f19222b ? 1237 : 1231);
    }

    public final String toString() {
        int i10 = this.f19221a;
        boolean z10 = this.f19222b;
        StringBuilder sb2 = new StringBuilder(73);
        sb2.append("AppUpdateOptions{appUpdateType=");
        sb2.append(i10);
        sb2.append(", allowAssetPackDeletion=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }
}
