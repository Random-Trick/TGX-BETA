package z0;

import android.util.Base64;
import b1.h;
import java.util.List;

public final class d {
    public final String f26774a;
    public final String f26775b;
    public final String f26776c;
    public final List<List<byte[]>> f26777d;
    public final int f26778e = 0;
    public final String f26779f;

    public d(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f26774a = (String) h.e(str);
        this.f26775b = (String) h.e(str2);
        this.f26776c = (String) h.e(str3);
        this.f26777d = (List) h.e(list);
        this.f26779f = a(str, str2, str3);
    }

    public final String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f26777d;
    }

    public int c() {
        return this.f26778e;
    }

    public String d() {
        return this.f26779f;
    }

    public String e() {
        return this.f26774a;
    }

    public String f() {
        return this.f26775b;
    }

    public String g() {
        return this.f26776c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f26774a + ", mProviderPackage: " + this.f26775b + ", mQuery: " + this.f26776c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f26777d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f26777d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f26778e);
        return sb2.toString();
    }
}
