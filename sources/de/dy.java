package de;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.c0;
import ce.j0;
import de.e8;
import ed.j;
import ee.k;
import gd.w;
import ib.f;
import ib.i;
import ie.g0;
import ie.h0;
import ie.u0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k0.e;
import ne.d;
import ne.n2;
import ne.y1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import uc.c;
import ud.v4;
import zd.o1;
import zd.o6;

public class dy extends vo<Void> implements View.OnClickListener, h0, k.f, o1 {
    public o6.p D0;
    public int E0;
    public iq F0;
    public boolean G0;
    public e<TdApi.Session> H0;
    public TdApi.Session I0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void H2(ra raVar, int i10, RelativeLayout relativeLayout, boolean z10, TextView textView, TextView textView2, TextView textView3, TextView textView4, n2 n2Var, d dVar, ImageView imageView, TextView textView5, TextView textView6) {
            String str;
            int j10 = raVar.j();
            if (j10 == R.id.btn_currentSession) {
                relativeLayout.setTag(dy.this.D0.f28165d);
                textView.setText("");
                textView2.setText(dy.fh(dy.this.D0.f28165d));
                textView3.setText(dy.ch(dy.this.D0.f28165d));
                textView4.setText(c0.r(dy.this.D0.f28165d.ip, dy.this.D0.f28165d.country));
                n2Var.d(0.0f);
                imageView.setImageResource(R.drawable.baseline_device_android_x);
                textView5.setVisibility(dy.this.D0.f28165d.canAcceptSecretChats ? 0 : 8);
                textView6.setVisibility(dy.this.D0.f28165d.canAcceptCalls ? 0 : 8);
                textView6.setPadding(dy.this.D0.f28165d.canAcceptSecretChats ? 0 : a0.i(48.0f), 0, 0, 0);
            } else if (j10 == R.id.btn_session) {
                TdApi.Session session = (TdApi.Session) raVar.d();
                relativeLayout.setTag(session);
                long j11 = session.lastActiveDate;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                String V2 = w.V2(j11, timeUnit);
                if (!f.m(session.lastActiveDate, timeUnit)) {
                    str = V2 + " " + w.T2(session.lastActiveDate, timeUnit);
                } else {
                    str = V2;
                }
                textView.setText(str);
                textView2.setText(dy.fh(session));
                textView3.setText(dy.ch(session));
                textView4.setText(c0.r(session.ip, session.country));
                boolean z11 = (dy.this.H0 == null || dy.this.H0.f(session.f19961id) == null) ? false : true;
                relativeLayout.setEnabled(!z11);
                if (z10) {
                    n2Var.a(z11 ? 1.0f : 0.0f);
                } else {
                    n2Var.d(z11 ? 1.0f : 0.0f);
                }
                imageView.setImageResource(he.e.a(session));
                textView5.setVisibility((!session.canAcceptSecretChats || session.isPasswordPending) ? 8 : 0);
                textView6.setVisibility((!session.canAcceptCalls || session.isPasswordPending) ? 8 : 0);
                textView6.setPadding(session.canAcceptSecretChats ? 0 : a0.i(48.0f), 0, 0, 0);
            }
        }

        @Override
        public void R2(ra raVar, c cVar, boolean z10) {
            if (raVar.A() == 89) {
                cVar.O1(a0.i(63.0f), 0);
            }
            int y10 = raVar.y(0);
            if (y10 == R.id.theme_color_textNegative) {
                y10 = R.id.theme_color_iconNegative;
            }
            cVar.setIconColorId(y10);
            int j10 = raVar.j();
            if (j10 == R.id.btn_qrLogin) {
                cVar.setData(w.u1(R.string.ScanQRLogInInfo, new Object[0]));
            } else if (j10 == R.id.btn_sessionTtl) {
                cVar.setData(w.v0((int) TimeUnit.DAYS.toSeconds(dy.this.E0)));
            } else if (j10 == R.id.btn_terminateAllSessions) {
                cVar.setData(R.string.ClearOtherSessionsHelp);
            }
        }
    }

    public class b implements j.b {
        public b() {
        }

        @Override
        public void a(RecyclerView.c0 c0Var) {
            dy.this.ih((TdApi.Session) c0Var.f2982a.getTag(), false);
        }

        @Override
        public boolean b(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10) {
            if (i10 < 0 || i10 >= dy.this.F0.D0().size()) {
                return false;
            }
            ra raVar = dy.this.F0.D0().get(i10);
            if (raVar.j() != R.id.btn_session || dy.this.G0) {
                return false;
            }
            return dy.this.H0 == null || dy.this.H0.f(raVar.m()) == null;
        }

        @Override
        public float e() {
            return ed.k.a(this);
        }
    }

    public dy(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public static CharSequence ch(TdApi.Session session) {
        return dh(session, null, null, null);
    }

    public static CharSequence dh(TdApi.Session session, w.f fVar, w.f fVar2, w.f fVar3) {
        String str;
        CharSequence[] charSequenceArr = new CharSequence[2];
        if (!i.i(session.applicationName)) {
            str = session.applicationName;
        } else {
            str = "App #" + session.apiId;
        }
        charSequenceArr[0] = w.d3(str, fVar2);
        charSequenceArr[1] = w.d3(session.applicationVersion, fVar3);
        return w.d3(c0.q(" ", charSequenceArr), fVar);
    }

    public static CharSequence eh(TdApi.Session session, boolean z10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        w.f p10 = z10 ? w.p() : null;
        w.f y10 = z10 ? w.y() : null;
        if (z10) {
            spannableStringBuilder.append(w.h1(R.string.session_Device, p10, fh(session)));
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append('\n');
        }
        CharSequence dh = dh(session, p10, null, y10);
        if (z10) {
            spannableStringBuilder.append(w.k0(R.string.session_App, dh));
        } else {
            spannableStringBuilder.append(dh);
        }
        CharSequence d32 = w.d3(c0.q(" ", w.d3(session.platform, null), w.d3(session.systemVersion, y10)), p10);
        if (!i.i(d32)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append('\n');
            }
            if (z10) {
                spannableStringBuilder.append(w.k0(R.string.session_System, d32));
            } else {
                spannableStringBuilder.append(d32);
            }
        }
        if (z10 || session.isCurrent) {
            spannableStringBuilder.append('\n').append(w.h1(R.string.SessionLogInDate, y10, w.y1(session.logInDate, TimeUnit.SECONDS)));
        }
        if (z10) {
            spannableStringBuilder.append('\n').append(w.h1(R.string.SessionLastActiveDate, y10, w.y1(session.lastActiveDate, TimeUnit.SECONDS)));
            spannableStringBuilder.append('\n').append(c0.r(w.z(session.ip), session.country));
        }
        return spannableStringBuilder;
    }

    public static CharSequence fh(TdApi.Session session) {
        return session.deviceModel;
    }

    public boolean jh(TdApi.Session session, View view, int i10) {
        if (i10 == R.id.btn_copyText) {
            j0.i(eh(session, true), R.string.CopiedText);
        } else if (i10 == R.id.btn_terminateSession) {
            ph(session);
        }
        return true;
    }

    public void kh() {
        e<TdApi.Session> eVar = this.H0;
        if (eVar != null) {
            eVar.b();
        }
        this.G0 = false;
        bh();
        o6.p pVar = this.D0;
        if (pVar != null) {
            for (TdApi.Session session : pVar.f28162a) {
                Fh(session.f19961id);
            }
        }
    }

    public static void lh(TdApi.Error error) {
    }

    public void mh(int i10) {
        if (i10 != 0) {
            this.f24495b.ac(i10, px.f9110a);
        }
    }

    public static boolean nh(kb.k kVar, y1 y1Var, String str) {
        int t10 = i.t(str, -1);
        if (t10 < 1 || t10 > 366) {
            return false;
        }
        kVar.a(t10);
        return true;
    }

    public boolean oh(final kb.k kVar, View view, int i10) {
        int i11;
        switch (i10) {
            case R.id.btn_terminateIn1m:
                i11 = 31;
                break;
            case R.id.btn_terminateIn1w:
                i11 = 7;
                break;
            case R.id.btn_terminateIn3m:
                i11 = 93;
                break;
            case R.id.btn_terminateIn6m:
                i11 = 186;
                break;
            case R.id.btn_terminateInCustom:
                Pc(w.i1(R.string.SessionTerminatesCustomAlertTitle), w.i1(R.string.SessionTerminatesCustomAlertHint), R.string.Done, R.string.Cancel, String.valueOf(this.E0), new v4.m() {
                    @Override
                    public final boolean a(y1 y1Var, String str) {
                        boolean nh;
                        nh = dy.nh(kb.k.this, y1Var, str);
                        return nh;
                    }
                }, true).getEditText().setInputType(2);
                return true;
            default:
                i11 = 0;
                break;
        }
        kVar.a(i11);
        return true;
    }

    public void qh(TdApi.Session session) {
        if (session.isCurrent) {
            TdApi.Session session2 = this.D0.f28165d;
            session2.canAcceptSecretChats = session.canAcceptSecretChats;
            session2.canAcceptCalls = session.canAcceptCalls;
            this.F0.p3(R.id.btn_currentSession);
            return;
        }
        this.D0.f28162a[gh(session.f19961id)] = session;
        Fh(session.f19961id);
    }

    public boolean rh(View view, int i10) {
        if (i10 != R.id.btn_terminateAllSessions) {
            return true;
        }
        Dh();
        return true;
    }

    public void sh(String str, TdApi.Object object) {
        if (object.getConstructor() == -1089332956) {
            this.f24495b.C4(str, null, ox.f9020a);
        }
    }

    public void th(TdApi.Session session) {
        if (gh(session.f19961id) == -1) {
            TdApi.Session[] sessionArr = this.D0.f28162a;
            TdApi.Session[] sessionArr2 = new TdApi.Session[sessionArr.length + 1];
            System.arraycopy(sessionArr, 0, sessionArr2, 0, sessionArr.length);
            sessionArr2[this.D0.f28162a.length] = session;
            ob.e.r1(sessionArr2);
            this.D0 = new o6.p(new TdApi.Sessions(sessionArr2, this.D0.f28170i));
            ah();
            j0.s0(w.t1(session.isPasswordPending ? R.string.ScanQRAuthorizedToastPasswordPending : R.string.ScanQRAuthorizedToast, w.p(), session.applicationName), 1, 0);
        }
    }

    public void uh(TdApi.Session session) {
        e<TdApi.Session> eVar = this.H0;
        if (eVar != null) {
            eVar.l(session.f19961id);
        }
        Ah(session);
    }

    public void vh(o6.p pVar) {
        Ch(pVar);
        ah();
    }

    public void wh(final o6.p pVar) {
        if (pVar != null) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    dy.this.vh(pVar);
                }
            });
        }
    }

    public static void xh(TdApi.Error error) {
        if (error != null) {
            j0.t0(error);
        }
    }

    public void yh(TdApi.Session session) {
        this.H0.l(session.f19961id);
        int hh = hh(session.f19961id);
        if (hh != -1) {
            this.F0.g3(hh);
        }
    }

    public void zh(final TdApi.Session session, TdApi.Error error) {
        if (error != null) {
            if (this.H0 != null) {
                wd(new Runnable() {
                    @Override
                    public final void run() {
                        dy.this.yh(session);
                    }
                });
            }
            j0.t0(error);
        }
    }

    public final void Ah(TdApi.Session session) {
        o6.p pVar = this.D0;
        if (pVar != null && !pVar.f28166e) {
            if (pVar.f28162a.length == 1) {
                bh();
                return;
            }
            int gh = gh(session.f19961id);
            if (gh != -1) {
                TdApi.Session[] sessionArr = this.D0.f28162a;
                this.D0 = new o6.p(new TdApi.Sessions((TdApi.Session[]) ib.b.z(sessionArr, gh, new TdApi.Session[sessionArr.length - 1]), this.D0.f28170i));
                int J0 = this.F0.J0(session);
                if (J0 != -1) {
                    int i10 = J0 - 1;
                    boolean z10 = false;
                    boolean z11 = this.F0.D0().get(i10).A() == 2;
                    if (this.F0.D0().get(J0 + 1).A() == 3) {
                        z10 = true;
                    }
                    if (z11 && z10) {
                        int i11 = 4;
                        int i12 = J0 + 2;
                        if (i12 < this.F0.D0().size() && this.F0.D0().get(i12).A() == 9) {
                            i11 = 5;
                        }
                        this.F0.R1(i10 - 1, i11);
                    } else if (z11) {
                        this.F0.R1(J0, 2);
                    } else {
                        this.F0.R1(i10, 2);
                    }
                }
            }
        }
    }

    public final void Bh() {
        this.f24495b.c6(false, new kb.j() {
            @Override
            public final void a(Object obj) {
                dy.this.wh((o6.p) obj);
            }
        });
    }

    public final void Ch(o6.p pVar) {
        this.D0 = pVar;
        this.E0 = pVar.f28170i;
    }

    public final void Dh() {
        TdApi.Session[] sessionArr;
        o6.p pVar = this.D0;
        if (!(pVar == null || pVar.f28166e || this.G0)) {
            this.G0 = true;
            if (this.H0 == null) {
                this.H0 = new e<>();
            }
            for (TdApi.Session session : this.D0.f28162a) {
                if (!session.isCurrent) {
                    this.H0.k(session.f19961id, session);
                    Fh(session.f19961id);
                }
            }
            this.f24495b.ad(this.D0.f28165d, qx.f9194a);
        }
    }

    public final void ph(final TdApi.Session session) {
        e<TdApi.Session> eVar = this.H0;
        if (eVar == null) {
            this.H0 = new e<>();
        } else if (eVar.f(session.f19961id) != null) {
            return;
        }
        this.H0.k(session.f19961id, session);
        int hh = hh(session.f19961id);
        if (hh != -1) {
            this.F0.g3(hh);
        }
        this.f24495b.bd(session, new kb.j() {
            @Override
            public final void a(Object obj) {
                dy.this.zh(session, (TdApi.Error) obj);
            }
        });
    }

    @Override
    public void F5(o6 o6Var, final TdApi.Session session) {
        wd(new Runnable() {
            @Override
            public final void run() {
                dy.this.th(session);
            }
        });
    }

    public final void Fh(long j10) {
        int hh = hh(j10);
        if (hh != -1) {
            this.F0.g3(hh);
        }
    }

    @Override
    public void H5(o6 o6Var, TdApi.Session session) {
        wd(new Runnable() {
            @Override
            public final void run() {
                dy.this.kh();
            }
        });
    }

    @Override
    public boolean P() {
        return g0.a(this);
    }

    @Override
    public int R9() {
        return R.id.controller_sessions;
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.Devices);
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f24495b.O9().v0(this);
    }

    @Override
    public Object a2(int i10) {
        return g0.b(this, i10);
    }

    public final void ah() {
        boolean z10;
        o6.p pVar = this.D0;
        if (pVar != null && pVar.f28165d != null) {
            ArrayList arrayList = new ArrayList();
            if (this.f24495b.L1()) {
                arrayList.add(new ra(89, R.id.btn_qrLogin, R.drawable.xt3000_baseline_qrcode_scan_24, R.string.ScanQR).d0(R.id.theme_color_textNeutral));
                arrayList.add(new ra(11));
            }
            arrayList.add(new ra(5, R.id.btn_sessionTtl, 0, R.string.SessionTerminateTtl));
            arrayList.add(new ra(3));
            int i10 = 8;
            arrayList.add(new ra(arrayList.isEmpty() ? 70 : 8, 0, 0, R.string.ThisDevice));
            int i11 = 2;
            arrayList.add(new ra(2));
            int i12 = 16;
            arrayList.add(new ra(16, R.id.btn_currentSession, 0, 0));
            if (this.D0.f28166e) {
                arrayList.add(new ra(3));
                arrayList.add(new ra(18));
            } else {
                arrayList.add(new ra(11));
                arrayList.add(new ra(89, R.id.btn_terminateAllSessions, R.drawable.baseline_cancel_24, R.string.TerminateAllSessions).d0(R.id.theme_color_textNegative));
                arrayList.add(new ra(3));
                TdApi.Session[] sessionArr = this.D0.f28164c;
                int length = sessionArr.length;
                int i13 = 0;
                boolean z11 = true;
                while (i13 < length) {
                    TdApi.Session session = sessionArr[i13];
                    if (z11) {
                        arrayList.add(new ra(8, 0, 0, R.string.SessionsIncompleteTitle));
                        arrayList.add(new ra(2));
                        z11 = false;
                    } else {
                        arrayList.add(new ra(11));
                    }
                    arrayList.add(new ra(i12, R.id.btn_session, 0, 0).N(session.f19961id).G(session));
                    i13++;
                    i12 = 16;
                }
                if (!z11) {
                    arrayList.add(new ra(3));
                    arrayList.add(new ra(9, 0, 0, R.string.SessionsIncompleteInfo));
                    z10 = true;
                } else {
                    z10 = z11;
                }
                TdApi.Session[] sessionArr2 = this.D0.f28163b;
                int length2 = sessionArr2.length;
                int i14 = 0;
                while (i14 < length2) {
                    TdApi.Session session2 = sessionArr2[i14];
                    if (z10) {
                        arrayList.add(new ra(i10, 0, 0, this.D0.f28164c.length > 0 ? R.string.ActiveDevices : R.string.OtherDevices));
                        arrayList.add(new ra(i11));
                        z10 = false;
                    } else {
                        arrayList.add(new ra(11));
                    }
                    arrayList.add(new ra(16, R.id.btn_session, 0, 0).N(session2.f19961id).G(session2));
                    i14++;
                    i11 = 2;
                    i10 = 8;
                }
                if (!z10) {
                    arrayList.add(new ra(3));
                }
            }
            this.F0.s2(arrayList, false);
            n9();
        }
    }

    public final void bh() {
        o6.p pVar = this.D0;
        if (!(pVar == null || pVar.f28166e)) {
            List<ra> D0 = this.F0.D0();
            int size = D0.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (D0.get(i10).A() == 11) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 != -1) {
                for (int i11 = size - 1; i11 >= i10; i11--) {
                    D0.remove(i11);
                }
                this.F0.N(i10, size - i10);
                int size2 = D0.size();
                D0.add(new ra(3));
                D0.add(new ra(18));
                this.F0.M(size2, 2);
            }
            o6.p pVar2 = this.D0;
            this.D0 = new o6.p(new TdApi.Sessions(new TdApi.Session[]{pVar2.f28165d}, pVar2.f28170i));
        }
    }

    @Override
    public boolean dc() {
        return this.D0 == null;
    }

    public final int gh(long j10) {
        int i10 = 0;
        for (TdApi.Session session : this.D0.f28162a) {
            if (session.f19961id == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override
    public void h1(o6 o6Var, boolean z10) {
        Bh();
    }

    public final int hh(long j10) {
        int gh = gh(j10);
        if (gh != -1) {
            return this.F0.J0(this.D0.f28162a[gh]);
        }
        return -1;
    }

    public final void ih(final TdApi.Session session, boolean z10) {
        CharSequence[] charSequenceArr = new CharSequence[2];
        charSequenceArr[0] = w.q(w.i1(session.isPasswordPending ? R.string.TerminateIncompleteSessionQuestion : R.string.TerminateSessionQuestion));
        charSequenceArr[1] = eh(session, true);
        CharSequence q10 = c0.q("\n\n", charSequenceArr);
        int[] iArr = {R.id.btn_terminateSession, R.id.btn_cancel, R.id.btn_copyText};
        String[] strArr = new String[3];
        strArr[0] = w.i1(session.isPasswordPending ? R.string.TerminateIncompleteSession : R.string.TerminateSession);
        strArr[1] = w.i1(R.string.Cancel);
        strArr[2] = w.i1(R.string.Copy);
        ee(q10, iArr, strArr, new int[]{2, 1, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24, R.drawable.baseline_content_copy_24}, new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean jh;
                jh = dy.this.jh(session, view, i10);
                return jh;
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_currentSession:
            case R.id.btn_session:
                Object tag = view.getTag();
                if (tag instanceof TdApi.Session) {
                    final TdApi.Session session = (TdApi.Session) tag;
                    e8 e8Var = new e8(this.f24493a, this.f24495b);
                    e8Var.yf(new e8.b(session, this.D0.f28170i, new Runnable() {
                        @Override
                        public final void run() {
                            dy.this.ph(session);
                        }
                    }, new kb.j() {
                        @Override
                        public final void a(Object obj) {
                            dy.this.qh((TdApi.Session) obj);
                        }
                    }));
                    this.f24493a.Q1().h0(e8Var);
                    return;
                }
                return;
            case R.id.btn_qrLogin:
                Nc(new v4.k().b(view).e(true).a(false).f(true).d(2).g(this));
                return;
            case R.id.btn_sessionTtl:
                jb.c cVar = new jb.c(4);
                u0 u0Var = new u0(4);
                final kb.k rxVar = new kb.k() {
                    @Override
                    public final void a(int i10) {
                        dy.this.mh(i10);
                    }
                };
                cVar.a(R.id.btn_terminateIn1w);
                u0Var.b(w.o2(R.string.SessionTerminatesInWeeks, 1L));
                cVar.a(R.id.btn_terminateIn1m);
                u0Var.b(w.o2(R.string.SessionTerminatesInMonths, 1L));
                cVar.a(R.id.btn_terminateIn3m);
                u0Var.b(w.o2(R.string.SessionTerminatesInMonths, 3L));
                cVar.a(R.id.btn_terminateIn6m);
                u0Var.b(w.o2(R.string.SessionTerminatesInMonths, 6L));
                cVar.a(R.id.btn_terminateInCustom);
                u0Var.b(w.i1(R.string.SessionTerminatesCustom));
                ee(null, cVar.e(), u0Var.d(), null, null, new h0() {
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
                        boolean oh;
                        oh = dy.this.oh(rxVar, view2, i10);
                        return oh;
                    }
                });
                return;
            case R.id.btn_terminateAllSessions:
                ee(w.i1(R.string.AreYouSureSessions), new int[]{R.id.btn_terminateAllSessions, R.id.btn_cancel}, new String[]{w.i1(R.string.TerminateAllSessions), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
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
                        boolean rh;
                        rh = dy.this.rh(view2, i10);
                        return rh;
                    }
                });
                return;
            default:
                return;
        }
    }

    @Override
    public void q3(final String str) {
        if (str.startsWith("tg://")) {
            c().v4().o(new TdApi.GetInternalLinkType(str), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    dy.this.sh(str, object);
                }
            });
        }
    }

    @Override
    public void r0(o6 o6Var, int i10) {
        this.E0 = i10;
        this.F0.p3(R.id.btn_sessionTtl);
    }

    @Override
    public boolean r3(View view, int i10) {
        TdApi.Session session;
        if (i10 != R.id.btn_terminateSession || (session = this.I0) == null) {
            return true;
        }
        ph(session);
        this.I0 = null;
        return true;
    }

    @Override
    public void r7(o6 o6Var, final TdApi.Session session) {
        wd(new Runnable() {
            @Override
            public final void run() {
                dy.this.uh(session);
            }
        });
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        this.F0 = new a(this);
        if (this.D0 != null) {
            ah();
        }
        if (w9() == null) {
            j.a(customRecyclerView, new b());
        }
        if (w9() == null) {
            Bh();
        }
        customRecyclerView.setAdapter(this.F0);
        this.f24495b.O9().i0(this);
    }

    @Override
    public long y9(boolean z10) {
        return 400L;
    }
}
