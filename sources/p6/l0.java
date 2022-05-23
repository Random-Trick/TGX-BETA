package p6;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.Map;

public final class l0 extends c {
    public final long f20700a;
    public final Map f20701b;

    public l0(long j10, Map map) {
        this.f20700a = j10;
        this.f20701b = map;
    }

    @Override
    public final Map<String, AssetPackState> a() {
        return this.f20701b;
    }

    @Override
    public final long b() {
        return this.f20700a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f20700a == cVar.b() && this.f20701b.equals(cVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f20700a;
        return this.f20701b.hashCode() ^ ((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j10 = this.f20700a;
        String obj = this.f20701b.toString();
        StringBuilder sb2 = new StringBuilder(obj.length() + 61);
        sb2.append("AssetPackStates{totalBytes=");
        sb2.append(j10);
        sb2.append(", packStates=");
        sb2.append(obj);
        sb2.append("}");
        return sb2.toString();
    }
}
