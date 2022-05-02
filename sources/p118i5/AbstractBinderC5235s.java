package p118i5;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p163l5.AbstractBinderC6389u1;
import p163l5.AbstractC6392v1;
import p163l5.C6378r;
import p272t5.AbstractC8983b;
import p272t5.BinderC8986d;

public abstract class AbstractBinderC5235s extends AbstractBinderC6389u1 {
    public final int f17382a;

    public AbstractBinderC5235s(byte[] bArr) {
        C6378r.m20517a(bArr.length == 25);
        this.f17382a = Arrays.hashCode(bArr);
    }

    public static byte[] m23562t(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public final int mo20478Z0() {
        return this.f17382a;
    }

    public final boolean equals(Object obj) {
        AbstractC8983b p;
        if (obj != null && (obj instanceof AbstractC6392v1)) {
            try {
                AbstractC6392v1 v1Var = (AbstractC6392v1) obj;
                if (v1Var.mo20478Z0() == this.f17382a && (p = v1Var.mo20477p()) != null) {
                    return Arrays.equals(mo23560s(), (byte[]) BinderC8986d.m10762t(p));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17382a;
    }

    @Override
    public final AbstractC8983b mo20477p() {
        return BinderC8986d.m10763E0(mo23560s());
    }

    public abstract byte[] mo23560s();
}
