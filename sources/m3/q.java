package m3;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import c5.a;
import c5.c;
import c5.l0;
import java.io.IOException;
import m3.h;

public final class q extends o2 {
    public static final h.a<q> T = p.f16871a;
    public final int M;
    public final String N;
    public final int O;
    public final q1 P;
    public final int Q;
    public final o4.q R;
    public final boolean S;

    public q(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, false);
    }

    public static q e(Bundle bundle) {
        return new q(bundle);
    }

    public static q g(Throwable th, String str, int i10, q1 q1Var, int i11, boolean z10, int i12) {
        return new q(1, th, null, i12, str, i10, q1Var, q1Var == null ? 4 : i11, z10);
    }

    public static q h(IOException iOException, int i10) {
        return new q(0, iOException, i10);
    }

    @Deprecated
    public static q i(RuntimeException runtimeException) {
        return j(runtimeException, 1000);
    }

    public static q j(RuntimeException runtimeException, int i10) {
        return new q(2, runtimeException, i10);
    }

    public static String k(int i10, String str, String str2, int i11, q1 q1Var, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            String valueOf = String.valueOf(q1Var);
            String Q = l0.Q(i12);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 53 + valueOf.length() + String.valueOf(Q).length());
            sb2.append(str2);
            sb2.append(" error, index=");
            sb2.append(i11);
            sb2.append(", format=");
            sb2.append(valueOf);
            sb2.append(", format_supported=");
            sb2.append(Q);
            str3 = sb2.toString();
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        String valueOf2 = String.valueOf(str3);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 2 + String.valueOf(str).length());
        sb3.append(valueOf2);
        sb3.append(": ");
        sb3.append(str);
        return sb3.toString();
    }

    public q f(o4.q qVar) {
        return new q((String) l0.j(getMessage()), getCause(), this.f16856a, this.M, this.N, this.O, this.P, this.Q, qVar, this.f16857b, this.S);
    }

    public q(int i10, Throwable th, String str, int i11, String str2, int i12, q1 q1Var, int i13, boolean z10) {
        this(k(i10, str, str2, i12, q1Var, i13), th, i11, i10, str2, i12, q1Var, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    public q(Bundle bundle) {
        super(bundle);
        this.M = bundle.getInt(o2.d(1001), 2);
        this.N = bundle.getString(o2.d(1002));
        this.O = bundle.getInt(o2.d(1003), -1);
        this.P = (q1) c.e(q1.f16897q0, bundle.getBundle(o2.d(1004)));
        this.Q = bundle.getInt(o2.d(1005), 4);
        this.S = bundle.getBoolean(o2.d(1006), false);
        this.R = null;
    }

    public q(String str, Throwable th, int i10, int i11, String str2, int i12, q1 q1Var, int i13, o4.q qVar, long j10, boolean z10) {
        super(str, th, i10, j10);
        boolean z11 = false;
        a.a(!z10 || i11 == 1);
        a.a((th != null || i11 == 3) ? true : z11);
        this.M = i11;
        this.N = str2;
        this.O = i12;
        this.P = q1Var;
        this.Q = i13;
        this.R = qVar;
        this.S = z10;
    }
}
