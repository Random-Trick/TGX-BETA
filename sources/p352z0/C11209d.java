package p352z0;

import android.util.Base64;
import java.util.List;
import p016b1.C1132h;

public final class C11209d {
    public final String f35900a;
    public final String f35901b;
    public final String f35902c;
    public final List<List<byte[]>> f35903d;
    public final int f35904e = 0;
    public final String f35905f;

    public C11209d(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f35900a = (String) C1132h.m38322e(str);
        this.f35901b = (String) C1132h.m38322e(str2);
        this.f35902c = (String) C1132h.m38322e(str3);
        this.f35903d = (List) C1132h.m38322e(list);
        this.f35905f = m1223a(str, str2, str3);
    }

    public final String m1223a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> m1222b() {
        return this.f35903d;
    }

    public int m1221c() {
        return this.f35904e;
    }

    public String m1220d() {
        return this.f35905f;
    }

    public String m1219e() {
        return this.f35900a;
    }

    public String m1218f() {
        return this.f35901b;
    }

    public String m1217g() {
        return this.f35902c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f35900a + ", mProviderPackage: " + this.f35901b + ", mQuery: " + this.f35902c + ", mCertificates:");
        for (int i = 0; i < this.f35903d.size(); i++) {
            sb2.append(" [");
            List<byte[]> list = this.f35903d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i2), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f35904e);
        return sb2.toString();
    }
}
