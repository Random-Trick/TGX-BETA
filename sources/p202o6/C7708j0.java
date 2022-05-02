package p202o6;

public final class C7708j0 extends AbstractC7663b {
    public final int f24714b;
    public final String f24715c;
    public final String f24716d;

    public C7708j0(int i, String str, String str2) {
        this.f24714b = i;
        this.f24715c = str;
        this.f24716d = str2;
    }

    @Override
    public final String mo15199a() {
        return this.f24716d;
    }

    @Override
    public final int mo15198b() {
        return this.f24714b;
    }

    @Override
    public final String mo15197c() {
        return this.f24715c;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7663b) {
            AbstractC7663b bVar = (AbstractC7663b) obj;
            if (this.f24714b == bVar.mo15198b() && ((str = this.f24715c) != null ? str.equals(bVar.mo15197c()) : bVar.mo15197c() == null) && ((str2 = this.f24716d) != null ? str2.equals(bVar.mo15199a()) : bVar.mo15199a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f24714b ^ 1000003) * 1000003;
        String str = this.f24715c;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f24716d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        int i = this.f24714b;
        String str = this.f24715c;
        String str2 = this.f24716d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb2.append("AssetPackLocation{packStorageMethod=");
        sb2.append(i);
        sb2.append(", path=");
        sb2.append(str);
        sb2.append(", assetsPath=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
