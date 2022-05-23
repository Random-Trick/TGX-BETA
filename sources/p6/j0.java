package p6;

public final class j0 extends b {
    public final int f20672b;
    public final String f20673c;
    public final String f20674d;

    public j0(int i10, String str, String str2) {
        this.f20672b = i10;
        this.f20673c = str;
        this.f20674d = str2;
    }

    @Override
    public final String a() {
        return this.f20674d;
    }

    @Override
    public final int b() {
        return this.f20672b;
    }

    @Override
    public final String c() {
        return this.f20673c;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f20672b == bVar.b() && ((str = this.f20673c) != null ? str.equals(bVar.c()) : bVar.c() == null) && ((str2 = this.f20674d) != null ? str2.equals(bVar.a()) : bVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f20672b ^ 1000003) * 1000003;
        String str = this.f20673c;
        int i11 = 0;
        int hashCode = (i10 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f20674d;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode ^ i11;
    }

    public final String toString() {
        int i10 = this.f20672b;
        String str = this.f20673c;
        String str2 = this.f20674d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb2.append("AssetPackLocation{packStorageMethod=");
        sb2.append(i10);
        sb2.append(", path=");
        sb2.append(str);
        sb2.append(", assetsPath=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
