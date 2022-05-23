package l6;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import k5.f;
import k6.f;
import m5.c;
import m5.e;
import m5.h;
import m5.k;
import m5.o0;
import m5.r;

public class a extends h<g> implements f {
    public static final int f16282v0 = 0;
    public final boolean f16283r0 = true;
    public final e f16284s0;
    public final Bundle f16285t0;
    public final Integer f16286u0;

    public a(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, boolean z10, @RecentlyNonNull e eVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull f.b bVar, @RecentlyNonNull f.c cVar) {
        super(context, looper, 44, eVar, bVar, cVar);
        this.f16284s0 = eVar;
        this.f16285t0 = bundle;
        this.f16286u0 = eVar.i();
    }

    @RecentlyNonNull
    public static Bundle n0(@RecentlyNonNull e eVar) {
        eVar.h();
        Integer i10 = eVar.i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.a());
        if (i10 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i10.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override
    @RecentlyNonNull
    public final Bundle D() {
        if (!B().getPackageName().equals(this.f16284s0.d())) {
            this.f16285t0.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f16284s0.d());
        }
        return this.f16285t0;
    }

    @Override
    @RecentlyNonNull
    public final String H() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override
    @RecentlyNonNull
    public final String I() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override
    public final void c() {
        r(new c.d());
    }

    @Override
    public final void e(@RecentlyNonNull k kVar, boolean z10) {
        try {
            ((g) G()).F1(kVar, ((Integer) r.k(this.f16286u0)).intValue(), z10);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override
    public final void j(f fVar) {
        r.l(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b10 = this.f16284s0.b();
            ((g) G()).G1(new j(1, new o0(b10, ((Integer) r.k(this.f16286u0)).intValue(), "<<default account>>".equals(b10.name) ? g5.a.a(B()).b() : null)), fVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.u(new l(1, new j5.a(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override
    public final void l() {
        try {
            ((g) G()).E1(((Integer) r.k(this.f16286u0)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override
    public final int p() {
        return j5.h.f15078a;
    }

    @Override
    public final boolean u() {
        return this.f16283r0;
    }

    @Override
    @RecentlyNonNull
    public final IInterface w(@RecentlyNonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }
}
