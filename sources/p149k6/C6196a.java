package p149k6;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import p074f5.C4271a;
import p118i5.C5217a;
import p118i5.C5224h;
import p133j5.AbstractC5867f;
import p134j6.AbstractC5891f;
import p163l5.AbstractC6325c;
import p163l5.AbstractC6346h;
import p163l5.AbstractC6355k;
import p163l5.C6336e;
import p163l5.C6369o0;
import p163l5.C6378r;

public class C6196a extends AbstractC6346h<C6202g> implements AbstractC5891f {
    public static final int f19598v0 = 0;
    public final boolean f19599r0 = true;
    public final C6336e f19600s0;
    public final Bundle f19601t0;
    public final Integer f19602u0;

    public C6196a(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, boolean z, @RecentlyNonNull C6336e eVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull AbstractC5867f.AbstractC5869b bVar, @RecentlyNonNull AbstractC5867f.AbstractC5870c cVar) {
        super(context, looper, 44, eVar, bVar, cVar);
        this.f19600s0 = eVar;
        this.f19601t0 = bundle;
        this.f19602u0 = eVar.m20601i();
    }

    @RecentlyNonNull
    public static Bundle m21075n0(@RecentlyNonNull C6336e eVar) {
        eVar.m20602h();
        Integer i = eVar.m20601i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.m20609a());
        if (i != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i.intValue());
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
    public final Bundle mo943D() {
        if (!m20669B().getPackageName().equals(this.f19600s0.m20606d())) {
            this.f19601t0.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f19600s0.m20606d());
        }
        return this.f19601t0;
    }

    @Override
    @RecentlyNonNull
    public final String mo942H() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override
    @RecentlyNonNull
    public final String mo941I() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override
    public final void mo21079c() {
        m20637i(new AbstractC6325c.C6329d());
    }

    @Override
    public final void mo21078f(AbstractC6201f fVar) {
        C6378r.m20506l(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.f19600s0.m20608b();
            ((C6202g) m20666G()).m21071I1(new C6205j(1, new C6369o0(b, ((Integer) C6378r.m20507k(this.f19602u0)).intValue(), "<<default account>>".equals(b.name) ? C4271a.m28315a(m20669B()).m28314b() : null)), fVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.mo21074r0(new C6207l(1, new C5217a(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override
    public final void mo21077k(@RecentlyNonNull AbstractC6355k kVar, boolean z) {
        try {
            ((C6202g) m20666G()).m21072H1(kVar, ((Integer) C6378r.m20507k(this.f19602u0)).intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override
    public final void mo21076l() {
        try {
            ((C6202g) m20666G()).m21073G1(((Integer) C6378r.m20507k(this.f19602u0)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override
    public final int mo939p() {
        return C5224h.f17372a;
    }

    @Override
    public final boolean mo20627t() {
        return this.f19599r0;
    }

    @Override
    @RecentlyNonNull
    public final IInterface mo938w(@RecentlyNonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C6202g ? (C6202g) queryLocalInterface : new C6202g(iBinder);
    }
}
