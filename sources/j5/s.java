package j5;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import m5.r;
import m5.u1;
import m5.v1;
import u5.b;
import u5.d;

public abstract class s extends u1 {
    public final int f15085a;

    public s(byte[] bArr) {
        r.a(bArr.length == 25);
        this.f15085a = Arrays.hashCode(bArr);
    }

    public static byte[] t(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override
    public final int Z0() {
        return this.f15085a;
    }

    public final boolean equals(Object obj) {
        b p10;
        if (obj != null && (obj instanceof v1)) {
            try {
                v1 v1Var = (v1) obj;
                if (v1Var.Z0() == this.f15085a && (p10 = v1Var.p()) != null) {
                    return Arrays.equals(r(), (byte[]) d.t(p10));
                }
                return false;
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f15085a;
    }

    @Override
    public final b p() {
        return d.x0(r());
    }

    public abstract byte[] r();
}
