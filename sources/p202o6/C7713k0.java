package p202o6;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.Objects;

public final class C7713k0 extends AssetPackState {
    public final String f24727a;
    public final int f24728b;
    public final int f24729c;
    public final long f24730d;
    public final long f24731e;
    public final int f24732f;
    public final int f24733g;
    public final String f24734h;
    public final String f24735i;

    public C7713k0(String str, int i, int i2, long j, long j2, int i3, int i4, String str2, String str3) {
        Objects.requireNonNull(str, "Null name");
        this.f24727a = str;
        this.f24728b = i;
        this.f24729c = i2;
        this.f24730d = j;
        this.f24731e = j2;
        this.f24732f = i3;
        this.f24733g = i4;
        Objects.requireNonNull(str2, "Null availableVersionTag");
        this.f24734h = str2;
        Objects.requireNonNull(str3, "Null installedVersionTag");
        this.f24735i = str3;
    }

    @Override
    public final long mo15195a() {
        return this.f24730d;
    }

    @Override
    public final int mo15194b() {
        return this.f24729c;
    }

    @Override
    public final String mo15193c() {
        return this.f24727a;
    }

    @Override
    public final int mo15192d() {
        return this.f24728b;
    }

    @Override
    public final long mo15191e() {
        return this.f24731e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.f24727a.equals(assetPackState.mo15193c()) && this.f24728b == assetPackState.mo15192d() && this.f24729c == assetPackState.mo15194b() && this.f24730d == assetPackState.mo15195a() && this.f24731e == assetPackState.mo15191e() && this.f24732f == assetPackState.mo15190f() && this.f24733g == assetPackState.mo15189g() && this.f24734h.equals(assetPackState.mo15188j()) && this.f24735i.equals(assetPackState.mo15187k())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int mo15190f() {
        return this.f24732f;
    }

    @Override
    public final int mo15189g() {
        return this.f24733g;
    }

    public final int hashCode() {
        int hashCode = this.f24727a.hashCode();
        int i = this.f24728b;
        int i2 = this.f24729c;
        long j = this.f24730d;
        long j2 = this.f24731e;
        return ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f24732f) * 1000003) ^ this.f24733g) * 1000003) ^ this.f24734h.hashCode()) * 1000003) ^ this.f24735i.hashCode();
    }

    @Override
    public final String mo15188j() {
        return this.f24734h;
    }

    @Override
    public final String mo15187k() {
        return this.f24735i;
    }

    public final String toString() {
        String str = this.f24727a;
        int i = this.f24728b;
        int i2 = this.f24729c;
        long j = this.f24730d;
        long j2 = this.f24731e;
        int i3 = this.f24732f;
        int i4 = this.f24733g;
        String str2 = this.f24734h;
        String str3 = this.f24735i;
        StringBuilder sb2 = new StringBuilder(str.length() + 261 + str2.length() + str3.length());
        sb2.append("AssetPackState{name=");
        sb2.append(str);
        sb2.append(", status=");
        sb2.append(i);
        sb2.append(", errorCode=");
        sb2.append(i2);
        sb2.append(", bytesDownloaded=");
        sb2.append(j);
        sb2.append(", totalBytesToDownload=");
        sb2.append(j2);
        sb2.append(", transferProgressPercentage=");
        sb2.append(i3);
        sb2.append(", updateAvailability=");
        sb2.append(i4);
        sb2.append(", availableVersionTag=");
        sb2.append(str2);
        sb2.append(", installedVersionTag=");
        sb2.append(str3);
        sb2.append("}");
        return sb2.toString();
    }
}
