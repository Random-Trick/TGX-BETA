package p174m3;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import p020b5.C1186a;
import p020b5.C1190c;
import p020b5.C1216l0;
import p174m3.AbstractC6609h;
import p187n4.C7226r;

public final class C6681q extends C6591e2 {
    public static final AbstractC6609h.AbstractC6610a<C6681q> f20907T = C6677p.f20902a;
    public final int f20908M;
    public final String f20909N;
    public final int f20910O;
    public final C6600g1 f20911P;
    public final int f20912Q;
    public final C7226r f20913R;
    public final boolean f20914S;

    public C6681q(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static C6681q m19584e(Bundle bundle) {
        return new C6681q(bundle);
    }

    public static C6681q m19582g(Throwable th, String str, int i, C6600g1 g1Var, int i2, boolean z, int i3) {
        return new C6681q(1, th, null, i3, str, i, g1Var, g1Var == null ? 4 : i2, z);
    }

    public static C6681q m19581h(IOException iOException, int i) {
        return new C6681q(0, iOException, i);
    }

    @Deprecated
    public static C6681q m19580i(RuntimeException runtimeException) {
        return m19579j(runtimeException, 1000);
    }

    public static C6681q m19579j(RuntimeException runtimeException, int i) {
        return new C6681q(2, runtimeException, i);
    }

    public static String m19578k(int i, String str, String str2, int i2, C6600g1 g1Var, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            String valueOf = String.valueOf(g1Var);
            String P = C1216l0.m37997P(i3);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 53 + valueOf.length() + String.valueOf(P).length());
            sb2.append(str2);
            sb2.append(" error, index=");
            sb2.append(i2);
            sb2.append(", format=");
            sb2.append(valueOf);
            sb2.append(", format_supported=");
            sb2.append(P);
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

    public C6681q m19583f(C7226r rVar) {
        return new C6681q((String) C1216l0.m37968j(getMessage()), getCause(), this.f20523a, this.f20908M, this.f20909N, this.f20910O, this.f20911P, this.f20912Q, rVar, this.f20524b, this.f20914S);
    }

    public C6681q(int i, Throwable th, String str, int i2, String str2, int i3, C6600g1 g1Var, int i4, boolean z) {
        this(m19578k(i, str, str2, i3, g1Var, i4), th, i2, i, str2, i3, g1Var, i4, null, SystemClock.elapsedRealtime(), z);
    }

    public C6681q(Bundle bundle) {
        super(bundle);
        this.f20908M = bundle.getInt(C6591e2.m19928d(1001), 2);
        this.f20909N = bundle.getString(C6591e2.m19928d(1002));
        this.f20910O = bundle.getInt(C6591e2.m19928d(1003), -1);
        this.f20911P = (C6600g1) C1190c.m38112e(C6600g1.f20566q0, bundle.getBundle(C6591e2.m19928d(1004)));
        this.f20912Q = bundle.getInt(C6591e2.m19928d(1005), 4);
        this.f20914S = bundle.getBoolean(C6591e2.m19928d(1006), false);
        this.f20913R = null;
    }

    public C6681q(String str, Throwable th, int i, int i2, String str2, int i3, C6600g1 g1Var, int i4, C7226r rVar, long j, boolean z) {
        super(str, th, i, j);
        boolean z2 = false;
        C1186a.m38189a(!z || i2 == 1);
        C1186a.m38189a((th != null || i2 == 3) ? true : z2);
        this.f20908M = i2;
        this.f20909N = str2;
        this.f20910O = i3;
        this.f20911P = g1Var;
        this.f20912Q = i4;
        this.f20913R = rVar;
        this.f20914S = z;
    }
}
