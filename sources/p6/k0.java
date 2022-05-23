package p6;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.util.Objects;

public final class k0 extends AssetPackState {
    public final String f20684a;
    public final int f20685b;
    public final int f20686c;
    public final long f20687d;
    public final long f20688e;
    public final int f20689f;
    public final int f20690g;
    public final String f20691h;
    public final String f20692i;

    public k0(String str, int i10, int i11, long j10, long j11, int i12, int i13, String str2, String str3) {
        Objects.requireNonNull(str, "Null name");
        this.f20684a = str;
        this.f20685b = i10;
        this.f20686c = i11;
        this.f20687d = j10;
        this.f20688e = j11;
        this.f20689f = i12;
        this.f20690g = i13;
        Objects.requireNonNull(str2, "Null availableVersionTag");
        this.f20691h = str2;
        Objects.requireNonNull(str3, "Null installedVersionTag");
        this.f20692i = str3;
    }

    @Override
    public final long a() {
        return this.f20687d;
    }

    @Override
    public final int b() {
        return this.f20686c;
    }

    @Override
    public final String c() {
        return this.f20684a;
    }

    @Override
    public final int d() {
        return this.f20685b;
    }

    @Override
    public final long e() {
        return this.f20688e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.f20684a.equals(assetPackState.c()) && this.f20685b == assetPackState.d() && this.f20686c == assetPackState.b() && this.f20687d == assetPackState.a() && this.f20688e == assetPackState.e() && this.f20689f == assetPackState.f() && this.f20690g == assetPackState.g() && this.f20691h.equals(assetPackState.j()) && this.f20692i.equals(assetPackState.k())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int f() {
        return this.f20689f;
    }

    @Override
    public final int g() {
        return this.f20690g;
    }

    public final int hashCode() {
        int hashCode = this.f20684a.hashCode();
        int i10 = this.f20685b;
        int i11 = this.f20686c;
        long j10 = this.f20687d;
        long j11 = this.f20688e;
        return ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ i10) * 1000003) ^ i11) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f20689f) * 1000003) ^ this.f20690g) * 1000003) ^ this.f20691h.hashCode()) * 1000003) ^ this.f20692i.hashCode();
    }

    @Override
    public final String j() {
        return this.f20691h;
    }

    @Override
    public final String k() {
        return this.f20692i;
    }

    public final String toString() {
        String str = this.f20684a;
        int i10 = this.f20685b;
        int i11 = this.f20686c;
        long j10 = this.f20687d;
        long j11 = this.f20688e;
        int i12 = this.f20689f;
        int i13 = this.f20690g;
        String str2 = this.f20691h;
        String str3 = this.f20692i;
        StringBuilder sb2 = new StringBuilder(str.length() + 261 + str2.length() + str3.length());
        sb2.append("AssetPackState{name=");
        sb2.append(str);
        sb2.append(", status=");
        sb2.append(i10);
        sb2.append(", errorCode=");
        sb2.append(i11);
        sb2.append(", bytesDownloaded=");
        sb2.append(j10);
        sb2.append(", totalBytesToDownload=");
        sb2.append(j11);
        sb2.append(", transferProgressPercentage=");
        sb2.append(i12);
        sb2.append(", updateAvailability=");
        sb2.append(i13);
        sb2.append(", availableVersionTag=");
        sb2.append(str2);
        sb2.append(", installedVersionTag=");
        sb2.append(str3);
        sb2.append("}");
        return sb2.toString();
    }
}
