package de;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.j0;
import gd.w;
import hd.s4;
import he.e;
import ie.g0;
import ie.h0;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import je.t;
import je.x0;
import kb.j;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import uc.c;
import ud.s;
import ud.v4;
import zd.o6;

@SuppressLint({"NonConstantResourceId"})
public class e8 extends g6<b> implements View.OnClickListener {
    public s f7843v0;
    public iq f7844w0;
    public TdApi.Session f7845x0;
    public boolean f7846y0;
    public boolean f7847z0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void R2(ra raVar, c cVar, boolean z10) {
            if (raVar.j() == R.id.btn_sessionLogout) {
                cVar.setIconColorId(R.id.theme_color_textNegative);
            } else {
                cVar.setIconColorId(R.id.theme_color_icon);
            }
            int j10 = raVar.j();
            int i10 = R.string.SessionAccept;
            CharSequence charSequence = null;
            switch (j10) {
                case R.id.btn_sessionAcceptCalls:
                    cVar.getToggler().r(e8.this.f7847z0, z10);
                    if (!e8.this.f7847z0) {
                        i10 = R.string.SessionReject;
                    }
                    cVar.setData(i10);
                    break;
                case R.id.btn_sessionAcceptSecretChats:
                    cVar.getToggler().r(e8.this.f7846y0, z10);
                    if (!e8.this.f7846y0) {
                        i10 = R.string.SessionReject;
                    }
                    cVar.setData(i10);
                    break;
                case R.id.btn_sessionApp:
                    cVar.setText(new x0(e8.this.f7845x0.applicationName + " " + e8.this.f7845x0.applicationVersion, s4.D9(), t.d.C, null));
                    break;
                case R.id.btn_sessionCountry:
                    cVar.setData(R.string.SessionLocation);
                    break;
                case R.id.btn_sessionDevice:
                    cVar.setText(new x0(e8.this.f7845x0.deviceModel, s4.D9(), t.d.C, null));
                    break;
                case R.id.btn_sessionFirstLogin:
                    cVar.setData(e8.this.f7845x0.isPasswordPending ? R.string.SessionAttempt : R.string.SessionFirstLogin);
                    break;
                case R.id.btn_sessionIp:
                    cVar.setData(R.string.SessionIP);
                    break;
                case R.id.btn_sessionLastLogin:
                    cVar.setData(R.string.SessionLastLogin);
                    break;
                case R.id.btn_sessionLogout:
                    if (!e8.this.f7845x0.isCurrent && !e8.this.f7845x0.isPasswordPending) {
                        charSequence = w.f1(e8.this.f7845x0.lastActiveDate + TimeUnit.DAYS.toSeconds(e8.this.x9().f7850b), TimeUnit.SECONDS, e8.this.f24495b.H4(), TimeUnit.MILLISECONDS, true, 0, R.string.session_WillTerminate, false);
                    }
                    cVar.setData(charSequence);
                    break;
                case R.id.btn_sessionPlatform:
                    cVar.setData(R.string.SessionSystem);
                    break;
            }
            cVar.setTag(raVar.u());
        }
    }

    public static class b {
        public final TdApi.Session f7849a;
        public final int f7850b;
        public final Runnable f7851c;
        public final j<TdApi.Session> f7852d;

        public b(TdApi.Session session, int i10, Runnable runnable, j<TdApi.Session> jVar) {
            this.f7849a = session;
            this.f7850b = i10;
            this.f7851c = runnable;
            this.f7852d = jVar;
        }
    }

    public e8(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public boolean uf(View view, int i10) {
        if (i10 != R.id.btn_terminateSession) {
            return true;
        }
        Zb();
        x9().f7851c.run();
        return true;
    }

    public static void vf(TdApi.Object object) {
    }

    public void wf() {
        TdApi.Session session = this.f7845x0;
        session.canAcceptSecretChats = this.f7846y0;
        session.canAcceptCalls = this.f7847z0;
        x9().f7852d.a(this.f7845x0);
        Zb();
    }

    public void xf() {
        wd(new Runnable() {
            @Override
            public final void run() {
                e8.this.wf();
            }
        });
    }

    @Override
    public View G9() {
        return this.f7843v0;
    }

    @Override
    public int R9() {
        return R.id.controller_editSession;
    }

    @Override
    public int Re() {
        return R.id.theme_color_background;
    }

    @Override
    public CharSequence X9() {
        return w.i1(this.f7845x0.isPasswordPending ? R.string.SessionAttemptDetails : R.string.SessionDetails);
    }

    @Override
    public void Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        TdApi.Session session = this.f7845x0;
        if (!session.isPasswordPending && !session.isCurrent) {
            s sVar = new s(t());
            this.f7843v0 = sVar;
            sVar.setThemedTextColor(this);
            this.f7843v0.A1(a0.i(49.0f), true);
            this.f7843v0.setTitle(R.string.SessionDetails);
            this.f7843v0.setSubtitle(w.X0(this.f7845x0.lastActiveDate, TimeUnit.SECONDS, this.f24495b.H4(), TimeUnit.MILLISECONDS, true, 60, R.string.session_LastActive, false));
        }
        df(R.drawable.baseline_check_24);
        jf(true);
        this.f7844w0 = new a(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ra(37, (int) R.id.btn_sessionApp, (int) R.drawable.baseline_apps_24, (int) R.string.SessionApp, false));
        arrayList.add(new ra(11));
        arrayList.add(new ra(37, (int) R.id.btn_sessionDevice, (int) R.drawable.baseline_devices_other_24, (int) R.string.SessionDevice, false));
        arrayList.add(new ra(11));
        int a10 = e.a(this.f7845x0);
        arrayList.add(new ra(89, (int) R.id.btn_sessionPlatform, a10, (CharSequence) (this.f7845x0.platform + " " + this.f7845x0.systemVersion).trim(), false));
        arrayList.add(new ra(11));
        arrayList.add(new ra(89, (int) R.id.btn_sessionCountry, (int) R.drawable.baseline_location_on_24, (CharSequence) this.f7845x0.country, false));
        arrayList.add(new ra(11));
        arrayList.add(new ra(89, (int) R.id.btn_sessionIp, (int) R.drawable.baseline_router_24, (CharSequence) this.f7845x0.ip, false));
        arrayList.add(new ra(3));
        if (!this.f7845x0.isPasswordPending) {
            arrayList.add(new ra(8, 0, 0, R.string.SessionAccepts));
            arrayList.add(new ra(2));
            arrayList.add(new ra(92, R.id.btn_sessionAcceptSecretChats, R.drawable.baseline_lock_24, R.string.SessionSecretChats));
            arrayList.add(new ra(11));
            arrayList.add(new ra(92, R.id.btn_sessionAcceptCalls, R.drawable.baseline_call_24, R.string.SessionCalls));
            arrayList.add(new ra(3));
        }
        arrayList.add(new ra(2));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        arrayList.add(new ra(89, (int) R.id.btn_sessionFirstLogin, (int) R.drawable.baseline_exit_to_app_24, (CharSequence) w.y1(this.f7845x0.logInDate, timeUnit), false));
        TdApi.Session session2 = this.f7845x0;
        if (!session2.isPasswordPending && !session2.isCurrent) {
            arrayList.add(new ra(11));
            arrayList.add(new ra(89, (int) R.id.btn_sessionLastLogin, (int) R.drawable.baseline_history_24, (CharSequence) w.y1(this.f7845x0.lastActiveDate, timeUnit), false));
        }
        arrayList.add(new ra(3));
        arrayList.add(new ra(2));
        TdApi.Session session3 = this.f7845x0;
        boolean z10 = session3.isPasswordPending;
        arrayList.add(new ra((z10 || session3.isCurrent) ? 4 : 89, R.id.btn_sessionLogout, R.drawable.baseline_dangerous_24, session3.isCurrent ? R.string.LogOut : z10 ? R.string.TerminateIncompleteSession : R.string.TerminateSession).d0(R.id.theme_color_textNegative));
        arrayList.add(new ra(3));
        this.f7844w0.s2(arrayList, false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setAdapter(this.f7844w0);
        sf();
    }

    @Override
    public boolean af() {
        ff(true);
        ArrayList arrayList = new ArrayList();
        boolean z10 = this.f7846y0;
        TdApi.Session session = this.f7845x0;
        if (z10 != session.canAcceptSecretChats) {
            arrayList.add(new TdApi.ToggleSessionCanAcceptSecretChats(session.f19961id, z10));
        }
        boolean z11 = this.f7847z0;
        TdApi.Session session2 = this.f7845x0;
        if (z11 != session2.canAcceptCalls) {
            arrayList.add(new TdApi.ToggleSessionCanAcceptCalls(session2.f19961id, z11));
        }
        this.f24495b.sb((TdApi.Function[]) arrayList.toArray(new TdApi.Function[0]), d8.f7761a, new Runnable() {
            @Override
            public final void run() {
                e8.this.xf();
            }
        });
        return true;
    }

    @Override
    public boolean jc(boolean z10) {
        if (!tf()) {
            return false;
        }
        qe(null);
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_sessionAcceptCalls:
                this.f7847z0 = this.f7844w0.S2(view);
                this.f7844w0.p3(R.id.btn_sessionAcceptCalls);
                sf();
                return;
            case R.id.btn_sessionAcceptSecretChats:
                this.f7846y0 = this.f7844w0.S2(view);
                this.f7844w0.p3(R.id.btn_sessionAcceptSecretChats);
                sf();
                return;
            case R.id.btn_sessionApp:
                j0.i(this.f7845x0.applicationName + " " + this.f7845x0.applicationVersion, R.string.CopiedText);
                return;
            case R.id.btn_sessionCountry:
            case R.id.btn_sessionFirstLogin:
            case R.id.btn_sessionIp:
            case R.id.btn_sessionLastLogin:
            case R.id.btn_sessionPlatform:
                j0.i((CharSequence) view.getTag(), R.string.CopiedText);
                return;
            case R.id.btn_sessionDevice:
                j0.i(this.f7845x0.deviceModel, R.string.CopiedText);
                return;
            case R.id.btn_sessionLogout:
                TdApi.Session session = this.f7845x0;
                if (session.isCurrent) {
                    ac(new lv(this.f24493a, this.f24495b));
                    return;
                }
                int[] iArr = {R.id.btn_terminateSession, R.id.btn_cancel};
                String[] strArr = new String[2];
                strArr[0] = w.i1(session.isPasswordPending ? R.string.TerminateIncompleteSession : R.string.TerminateSession);
                strArr[1] = w.i1(R.string.Cancel);
                ee(null, iArr, strArr, new int[]{2, 1}, new int[]{R.drawable.baseline_dangerous_24, R.drawable.baseline_cancel_24}, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i10) {
                        return g0.b(this, i10);
                    }

                    @Override
                    public final boolean r3(View view2, int i10) {
                        boolean uf;
                        uf = e8.this.uf(view2, i10);
                        return uf;
                    }
                });
                return;
            default:
                return;
        }
    }

    public final void sf() {
        hf(tf());
    }

    public final boolean tf() {
        boolean z10 = this.f7846y0;
        TdApi.Session session = this.f7845x0;
        return (z10 == session.canAcceptSecretChats && this.f7847z0 == session.canAcceptCalls) ? false : true;
    }

    @Override
    public boolean we() {
        return !tf();
    }

    public void yf(b bVar) {
        super.Ad(bVar);
        TdApi.Session session = bVar.f7849a;
        this.f7845x0 = session;
        this.f7846y0 = session.canAcceptSecretChats;
        this.f7847z0 = session.canAcceptCalls;
    }
}
