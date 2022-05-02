package p038ce;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1379j0;
import gd.AbstractC4761s4;
import ge.C4864e;
import ie.C5428t;
import ie.C5459x0;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p139jb.AbstractC5918j;
import p350yd.C10930q6;
import tc.C9137c;
import td.AbstractC9323v4;
import td.C9289s;

@SuppressLint({"NonConstantResourceId"})
public class View$OnClickListenerC2330e8 extends AbstractC2420g6<C2332b> implements View.OnClickListener {
    public C9289s f8017v0;
    public C2546iq f8018w0;
    public TdApi.Session f8019x0;
    public boolean f8020y0;
    public boolean f8021z0;

    public class C2331a extends C2546iq {
        public C2331a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            if (raVar.m32835j() == R.id.btn_sessionLogout) {
                cVar.setIconColorId(R.id.theme_color_textNegative);
            } else {
                cVar.setIconColorId(R.id.theme_color_icon);
            }
            int j = raVar.m32835j();
            int i = R.string.SessionAccept;
            CharSequence charSequence = null;
            switch (j) {
                case R.id.btn_sessionAcceptCalls:
                    cVar.getToggler().m10186r(View$OnClickListenerC2330e8.this.f8021z0, z);
                    if (!View$OnClickListenerC2330e8.this.f8021z0) {
                        i = R.string.SessionReject;
                    }
                    cVar.setData(i);
                    break;
                case R.id.btn_sessionAcceptSecretChats:
                    cVar.getToggler().m10186r(View$OnClickListenerC2330e8.this.f8020y0, z);
                    if (!View$OnClickListenerC2330e8.this.f8020y0) {
                        i = R.string.SessionReject;
                    }
                    cVar.setData(i);
                    break;
                case R.id.btn_sessionApp:
                    cVar.setText(new C5459x0(View$OnClickListenerC2330e8.this.f8019x0.applicationName + " " + View$OnClickListenerC2330e8.this.f8019x0.applicationVersion, AbstractC4761s4.m26211D9(), C5428t.AbstractC5441d.f17872C, null));
                    break;
                case R.id.btn_sessionCountry:
                    cVar.setData(R.string.SessionLocation);
                    break;
                case R.id.btn_sessionDevice:
                    cVar.setText(new C5459x0(View$OnClickListenerC2330e8.this.f8019x0.deviceModel, AbstractC4761s4.m26211D9(), C5428t.AbstractC5441d.f17872C, null));
                    break;
                case R.id.btn_sessionFirstLogin:
                    cVar.setData(View$OnClickListenerC2330e8.this.f8019x0.isPasswordPending ? R.string.SessionAttempt : R.string.SessionFirstLogin);
                    break;
                case R.id.btn_sessionIp:
                    cVar.setData(R.string.SessionIP);
                    break;
                case R.id.btn_sessionLastLogin:
                    cVar.setData(R.string.SessionLastLogin);
                    break;
                case R.id.btn_sessionLogout:
                    if (!View$OnClickListenerC2330e8.this.f8019x0.isCurrent && !View$OnClickListenerC2330e8.this.f8019x0.isPasswordPending) {
                        charSequence = C4403w.m27881f1(View$OnClickListenerC2330e8.this.f8019x0.lastActiveDate + TimeUnit.DAYS.toSeconds(View$OnClickListenerC2330e8.this.m9131x9().f8024b), TimeUnit.SECONDS, View$OnClickListenerC2330e8.this.f30167b.m2898D4(), TimeUnit.MILLISECONDS, true, 0, R.string.session_WillTerminate, false);
                    }
                    cVar.setData(charSequence);
                    break;
                case R.id.btn_sessionPlatform:
                    cVar.setData(R.string.SessionSystem);
                    break;
            }
            cVar.setTag(raVar.m32824u());
        }
    }

    public static class C2332b {
        public final TdApi.Session f8023a;
        public final int f8024b;
        public final Runnable f8025c;
        public final AbstractC5918j<TdApi.Session> f8026d;

        public C2332b(TdApi.Session session, int i, Runnable runnable, AbstractC5918j<TdApi.Session> jVar) {
            this.f8023a = session;
            this.f8024b = i;
            this.f8025c = runnable;
            this.f8026d = jVar;
        }
    }

    public View$OnClickListenerC2330e8(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public boolean m35082uf(View view, int i) {
        if (i != R.id.btn_terminateSession) {
            return true;
        }
        m9298Zb();
        m9131x9().f8025c.run();
        return true;
    }

    public static void m35081vf(TdApi.Object object) {
    }

    public void m35080wf() {
        TdApi.Session session = this.f8019x0;
        session.canAcceptSecretChats = this.f8020y0;
        session.canAcceptCalls = this.f8021z0;
        m9131x9().f8026d.mo1330a(this.f8019x0);
        m9298Zb();
    }

    public void m35079xf() {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2330e8.this.m35080wf();
            }
        });
    }

    @Override
    public View mo8869G9() {
        return this.f8017v0;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_editSession;
    }

    @Override
    public int mo31415Re() {
        return R.id.theme_color_background;
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27869i1(this.f8019x0.isPasswordPending ? R.string.SessionAttemptDetails : R.string.SessionDetails);
    }

    @Override
    public void mo30697Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        TdApi.Session session = this.f8019x0;
        if (!session.isPasswordPending && !session.isCurrent) {
            C9289s sVar = new C9289s(mo4347s());
            this.f8017v0 = sVar;
            sVar.setThemedTextColor(this);
            this.f8017v0.m9632D1(C1357a0.m37541i(49.0f), true);
            this.f8017v0.setTitle(R.string.SessionDetails);
            this.f8017v0.setSubtitle(C4403w.m27918X0(this.f8019x0.lastActiveDate, TimeUnit.SECONDS, this.f30167b.m2898D4(), TimeUnit.MILLISECONDS, true, 60, R.string.session_LastActive, false));
        }
        m34628df(R.drawable.baseline_check_24);
        m34623jf(true);
        this.f8018w0 = new C2331a(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(37, (int) R.id.btn_sessionApp, (int) R.drawable.baseline_apps_24, (int) R.string.SessionApp, false));
        arrayList.add(new C2964ra(11));
        arrayList.add(new C2964ra(37, (int) R.id.btn_sessionDevice, (int) R.drawable.baseline_devices_other_24, (int) R.string.SessionDevice, false));
        arrayList.add(new C2964ra(11));
        int a = C4864e.m24930a(this.f8019x0);
        arrayList.add(new C2964ra(89, (int) R.id.btn_sessionPlatform, a, (CharSequence) (this.f8019x0.platform + " " + this.f8019x0.systemVersion).trim(), false));
        arrayList.add(new C2964ra(11));
        arrayList.add(new C2964ra(89, (int) R.id.btn_sessionCountry, (int) R.drawable.baseline_location_on_24, (CharSequence) this.f8019x0.country, false));
        arrayList.add(new C2964ra(11));
        arrayList.add(new C2964ra(89, (int) R.id.btn_sessionIp, (int) R.drawable.baseline_router_24, (CharSequence) this.f8019x0.f25421ip, false));
        arrayList.add(new C2964ra(3));
        if (!this.f8019x0.isPasswordPending) {
            arrayList.add(new C2964ra(8, 0, 0, R.string.SessionAccepts));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(92, R.id.btn_sessionAcceptSecretChats, R.drawable.baseline_lock_24, R.string.SessionSecretChats));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(92, R.id.btn_sessionAcceptCalls, R.drawable.baseline_call_24, R.string.SessionCalls));
            arrayList.add(new C2964ra(3));
        }
        arrayList.add(new C2964ra(2));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        arrayList.add(new C2964ra(89, (int) R.id.btn_sessionFirstLogin, (int) R.drawable.baseline_exit_to_app_24, (CharSequence) C4403w.m27805y1(this.f8019x0.logInDate, timeUnit), false));
        TdApi.Session session2 = this.f8019x0;
        if (!session2.isPasswordPending && !session2.isCurrent) {
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(89, (int) R.id.btn_sessionLastLogin, (int) R.drawable.baseline_history_24, (CharSequence) C4403w.m27805y1(this.f8019x0.lastActiveDate, timeUnit), false));
        }
        arrayList.add(new C2964ra(3));
        arrayList.add(new C2964ra(2));
        TdApi.Session session3 = this.f8019x0;
        boolean z = session3.isPasswordPending;
        arrayList.add(new C2964ra((z || session3.isCurrent) ? 4 : 89, R.id.btn_sessionLogout, R.drawable.baseline_dangerous_24, session3.isCurrent ? R.string.LogOut : z ? R.string.TerminateIncompleteSession : R.string.TerminateSession).m32843d0(R.id.theme_color_textNegative));
        arrayList.add(new C2964ra(3));
        this.f8018w0.m34116x2(arrayList, false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setAdapter(this.f8018w0);
        m35084sf();
    }

    @Override
    public boolean mo30696af() {
        m34626ff(true);
        ArrayList arrayList = new ArrayList();
        boolean z = this.f8020y0;
        TdApi.Session session = this.f8019x0;
        if (z != session.canAcceptSecretChats) {
            arrayList.add(new TdApi.ToggleSessionCanAcceptSecretChats(session.f25420id, z));
        }
        boolean z2 = this.f8021z0;
        TdApi.Session session2 = this.f8019x0;
        if (z2 != session2.canAcceptCalls) {
            arrayList.add(new TdApi.ToggleSessionCanAcceptCalls(session2.f25420id, z2));
        }
        this.f30167b.m2311ob((TdApi.Function[]) arrayList.toArray(new TdApi.Function[0]), C2288d8.f7922a, new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2330e8.this.m35079xf();
            }
        });
        return true;
    }

    @Override
    public boolean mo404jc(boolean z) {
        if (!m35083tf()) {
            return false;
        }
        m9179qe(null);
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_sessionAcceptCalls:
                this.f8021z0 = this.f8018w0.m34201W2(view);
                this.f8018w0.m34130s3(R.id.btn_sessionAcceptCalls);
                m35084sf();
                return;
            case R.id.btn_sessionAcceptSecretChats:
                this.f8020y0 = this.f8018w0.m34201W2(view);
                this.f8018w0.m34130s3(R.id.btn_sessionAcceptSecretChats);
                m35084sf();
                return;
            case R.id.btn_sessionApp:
                C1379j0.m37325i(this.f8019x0.applicationName + " " + this.f8019x0.applicationVersion, R.string.CopiedText);
                return;
            case R.id.btn_sessionCountry:
            case R.id.btn_sessionFirstLogin:
            case R.id.btn_sessionIp:
            case R.id.btn_sessionLastLogin:
            case R.id.btn_sessionPlatform:
                C1379j0.m37325i((CharSequence) view.getTag(), R.string.CopiedText);
                return;
            case R.id.btn_sessionDevice:
                C1379j0.m37325i(this.f8019x0.deviceModel, R.string.CopiedText);
                return;
            case R.id.btn_sessionLogout:
                TdApi.Session session = this.f8019x0;
                if (session.isCurrent) {
                    m9291ac(new View$OnClickListenerC2639kv(this.f30165a, this.f30167b));
                    return;
                }
                int[] iArr = {R.id.btn_terminateSession, R.id.btn_cancel};
                String[] strArr = new String[2];
                strArr[0] = C4403w.m27869i1(session.isPasswordPending ? R.string.TerminateIncompleteSession : R.string.TerminateSession);
                strArr[1] = C4403w.m27869i1(R.string.Cancel);
                m9261ee(null, iArr, strArr, new int[]{2, 1}, new int[]{R.drawable.baseline_dangerous_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i) {
                        boolean uf;
                        uf = View$OnClickListenerC2330e8.this.m35082uf(view2, i);
                        return uf;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23935a(this);
                    }

                    @Override
                    public Object mo491b2(int i) {
                        return C5115g0.m23934b(this, i);
                    }
                });
                return;
            default:
                return;
        }
    }

    public final void m35084sf() {
        mo31397hf(m35083tf());
    }

    public final boolean m35083tf() {
        boolean z = this.f8020y0;
        TdApi.Session session = this.f8019x0;
        return (z == session.canAcceptSecretChats && this.f8021z0 == session.canAcceptCalls) ? false : true;
    }

    @Override
    public boolean mo9134we() {
        return !m35083tf();
    }

    public void m35078yf(C2332b bVar) {
        super.m9476Ad(bVar);
        TdApi.Session session = bVar.f8023a;
        this.f8019x0 = session;
        this.f8020y0 = session.canAcceptSecretChats;
        this.f8021z0 = session.canAcceptCalls;
    }
}
