package p202o6;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.Map;

public final class C7718l0 extends AbstractC7669c {
    public final long f24746a;
    public final Map f24747b;

    public C7718l0(long j, Map map) {
        this.f24746a = j;
        this.f24747b = map;
    }

    @Override
    public final Map<String, AssetPackState> mo15180a() {
        return this.f24747b;
    }

    @Override
    public final long mo15179b() {
        return this.f24746a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7669c) {
            AbstractC7669c cVar = (AbstractC7669c) obj;
            if (this.f24746a == cVar.mo15179b() && this.f24747b.equals(cVar.mo15180a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f24746a;
        return this.f24747b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f24746a;
        String obj = this.f24747b.toString();
        StringBuilder sb2 = new StringBuilder(obj.length() + 61);
        sb2.append("AssetPackStates{totalBytes=");
        sb2.append(j);
        sb2.append(", packStates=");
        sb2.append(obj);
        sb2.append("}");
        return sb2.toString();
    }
}
