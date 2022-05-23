package j5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import m5.r;

@CheckReturnValue
public class i {
    @Nullable
    public static i f15081b;
    public final Context f15082a;

    public i(@RecentlyNonNull Context context) {
        this.f15082a = context.getApplicationContext();
    }

    @RecentlyNonNull
    public static i a(@RecentlyNonNull Context context) {
        r.k(context);
        synchronized (i.class) {
            if (f15081b == null) {
                w.a(context);
                f15081b = new i(context);
            }
        }
        return f15081b;
    }

    @Nullable
    public static final s b(PackageInfo packageInfo, s... sVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        t tVar = new t(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            if (sVarArr[i10].equals(tVar)) {
                return sVarArr[i10];
            }
        }
        return null;
    }

    public static final boolean c(@RecentlyNonNull PackageInfo packageInfo, boolean z10) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if ((z10 ? b(packageInfo, v.f15089a) : b(packageInfo, v.f15089a[0])) != null) {
                return true;
            }
        }
        return false;
    }
}
