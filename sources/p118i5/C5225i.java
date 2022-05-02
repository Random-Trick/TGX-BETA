package p118i5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import p163l5.C6378r;

@CheckReturnValue
public class C5225i {
    @Nullable
    public static C5225i f17375b;
    public final Context f17376a;

    public C5225i(@RecentlyNonNull Context context) {
        this.f17376a = context.getApplicationContext();
    }

    @RecentlyNonNull
    public static C5225i m23567a(@RecentlyNonNull Context context) {
        C6378r.m20506k(context);
        synchronized (C5225i.class) {
            if (f17375b == null) {
                C5239w.m23558a(context);
                f17375b = new C5225i(context);
            }
        }
        return f17375b;
    }

    @Nullable
    public static final AbstractBinderC5235s m23566b(PackageInfo packageInfo, AbstractBinderC5235s... sVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        BinderC5236t tVar = new BinderC5236t(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < sVarArr.length; i++) {
            if (sVarArr[i].equals(tVar)) {
                return sVarArr[i];
            }
        }
        return null;
    }

    public static final boolean m23565c(@RecentlyNonNull PackageInfo packageInfo, boolean z) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if ((z ? m23566b(packageInfo, C5238v.f17386a) : m23566b(packageInfo, C5238v.f17386a[0])) != null) {
                return true;
            }
        }
        return false;
    }
}
