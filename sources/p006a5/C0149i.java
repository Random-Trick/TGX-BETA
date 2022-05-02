package p006a5;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import p020b5.C1186a;
import p020b5.C1216l0;
import p174m3.C6556a2;
import p343y6.C10428d;

public final class C0149i extends AbstractC0139f {
    public C0159o f533e;
    public byte[] f534f;
    public int f535g;
    public int f536h;

    public C0149i() {
        super(false);
    }

    @Override
    public int mo4414b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f536h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(C1216l0.m37971j(this.f534f), this.f535g, bArr, i, min);
        this.f535g += min;
        this.f536h -= min;
        m42228s(min);
        return min;
    }

    @Override
    public long mo4413c(C0159o oVar) {
        m42226u(oVar);
        this.f533e = oVar;
        Uri uri = oVar.f553a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String valueOf = String.valueOf(scheme);
        C1186a.m38191b(equals, valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
        String[] A0 = C1216l0.m38023A0(uri.getSchemeSpecificPart(), ",");
        if (A0.length == 2) {
            String str = A0[1];
            if (A0[0].contains(";base64")) {
                try {
                    this.f534f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    String valueOf2 = String.valueOf(str);
                    throw C6556a2.m20112b(valueOf2.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf2) : new String("Error while parsing Base64 encoded string: "), e);
                }
            } else {
                this.f534f = C1216l0.m37980e0(URLDecoder.decode(str, C10428d.f33499a.name()));
            }
            long j = oVar.f559g;
            byte[] bArr = this.f534f;
            if (j <= bArr.length) {
                int i = (int) j;
                this.f535g = i;
                int length = bArr.length - i;
                this.f536h = length;
                long j2 = oVar.f560h;
                if (j2 != -1) {
                    this.f536h = (int) Math.min(length, j2);
                }
                m42225v(oVar);
                long j3 = oVar.f560h;
                return j3 != -1 ? j3 : this.f536h;
            }
            this.f534f = null;
            throw new C0156l(2008);
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(valueOf3.length() + 23);
        sb2.append("Unexpected URI format: ");
        sb2.append(valueOf3);
        throw C6556a2.m20112b(sb2.toString(), null);
    }

    @Override
    public void close() {
        if (this.f534f != null) {
            this.f534f = null;
            m42227t();
        }
        this.f533e = null;
    }

    @Override
    public Uri mo4412p() {
        C0159o oVar = this.f533e;
        if (oVar != null) {
            return oVar.f553a;
        }
        return null;
    }
}
