package p352z0;

import android.util.Base64;
import java.util.List;
import p016b1.C1132h;

public final class C11209d {
    public final String f35903a;
    public final String f35904b;
    public final String f35905c;
    public final List<List<byte[]>> f35906d;
    public final int f35907e = 0;
    public final String f35908f;

    public C11209d(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f35903a = (String) C1132h.m38325e(str);
        this.f35904b = (String) C1132h.m38325e(str2);
        this.f35905c = (String) C1132h.m38325e(str3);
        this.f35906d = (List) C1132h.m38325e(list);
        this.f35908f = m1223a(str, str2, str3);
    }

    public final String m1223a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> m1222b() {
        return this.f35906d;
    }

    public int m1221c() {
        return this.f35907e;
    }

    public String m1220d() {
        return this.f35908f;
    }

    public String m1219e() {
        return this.f35903a;
    }

    public String m1218f() {
        return this.f35904b;
    }

    public String m1217g() {
        return this.f35905c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f35903a + ", mProviderPackage: " + this.f35904b + ", mQuery: " + this.f35905c + ", mCertificates:");
        for (int i = 0; i < this.f35906d.size(); i++) {
            sb2.append(" [");
            List<byte[]> list = this.f35906d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i2), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f35907e);
        return sb2.toString();
    }
}
