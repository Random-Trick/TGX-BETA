package b5;

import android.net.Uri;
import android.util.Base64;
import c5.a;
import c5.l0;
import java.net.URLDecoder;
import m3.k2;
import z6.d;

public final class i extends f {
    public o f3887e;
    public byte[] f3888f;
    public int f3889g;
    public int f3890h;

    public i() {
        super(false);
    }

    @Override
    public int b(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f3890h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(l0.j(this.f3888f), this.f3889g, bArr, i10, min);
        this.f3889g += min;
        this.f3890h -= min;
        s(min);
        return min;
    }

    @Override
    public void close() {
        if (this.f3888f != null) {
            this.f3888f = null;
            t();
        }
        this.f3887e = null;
    }

    @Override
    public long d(o oVar) {
        u(oVar);
        this.f3887e = oVar;
        Uri uri = oVar.f3904a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String valueOf = String.valueOf(scheme);
        a.b(equals, valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
        String[] B0 = l0.B0(uri.getSchemeSpecificPart(), ",");
        if (B0.length == 2) {
            String str = B0[1];
            if (B0[0].contains(";base64")) {
                try {
                    this.f3888f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    String valueOf2 = String.valueOf(str);
                    throw k2.b(valueOf2.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf2) : new String("Error while parsing Base64 encoded string: "), e10);
                }
            } else {
                this.f3888f = l0.f0(URLDecoder.decode(str, d.f27012a.name()));
            }
            long j10 = oVar.f3910g;
            byte[] bArr = this.f3888f;
            if (j10 <= bArr.length) {
                int i10 = (int) j10;
                this.f3889g = i10;
                int length = bArr.length - i10;
                this.f3890h = length;
                long j11 = oVar.f3911h;
                if (j11 != -1) {
                    this.f3890h = (int) Math.min(length, j11);
                }
                v(oVar);
                long j12 = oVar.f3911h;
                return j12 != -1 ? j12 : this.f3890h;
            }
            this.f3888f = null;
            throw new l(2008);
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(valueOf3.length() + 23);
        sb2.append("Unexpected URI format: ");
        sb2.append(valueOf3);
        throw k2.b(sb2.toString(), null);
    }

    @Override
    public Uri p() {
        o oVar = this.f3887e;
        if (oVar != null) {
            return oVar.f3904a;
        }
        return null;
    }
}
