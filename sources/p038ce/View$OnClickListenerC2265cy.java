package p038ce;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import de.View$OnClickListenerC4045k;
import ge.C4864e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.C6857d;
import me.C6977n2;
import me.View$OnFocusChangeListenerC7069y1;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p038ce.View$OnClickListenerC2330e8;
import p053dd.C4007j;
import p053dd.C4012k;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5067f;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5918j;
import p139jb.AbstractC5919k;
import p143k0.C6035e;
import p193nb.C7321e;
import p350yd.AbstractC10925q1;
import p350yd.C10930q6;
import tc.C9137c;
import td.AbstractC9323v4;

public class View$OnClickListenerC2265cy extends AbstractC3204vo<Void> implements View.OnClickListener, AbstractC5117h0, View$OnClickListenerC4045k.AbstractC4051f, AbstractC10925q1 {
    public C10930q6.C10946p f7853D0;
    public int f7854E0;
    public C2546iq f7855F0;
    public boolean f7856G0;
    public C6035e<TdApi.Session> f7857H0;
    public TdApi.Session f7858I0;

    public class C2266a extends C2546iq {
        public C2266a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo33061L2(C2964ra raVar, int i, RelativeLayout relativeLayout, boolean z, TextView textView, TextView textView2, TextView textView3, TextView textView4, C6977n2 n2Var, C6857d dVar, ImageView imageView, TextView textView5, TextView textView6) {
            String str;
            int j = raVar.m32835j();
            if (j == R.id.btn_currentSession) {
                relativeLayout.setTag(View$OnClickListenerC2265cy.this.f7853D0.f35176d);
                textView.setText("");
                textView2.setText(View$OnClickListenerC2265cy.m35172fh(View$OnClickListenerC2265cy.this.f7853D0.f35176d));
                textView3.setText(View$OnClickListenerC2265cy.m35175ch(View$OnClickListenerC2265cy.this.f7853D0.f35176d));
                textView4.setText(C1363c0.m37415r(View$OnClickListenerC2265cy.this.f7853D0.f35176d.f25421ip, View$OnClickListenerC2265cy.this.f7853D0.f35176d.country));
                n2Var.m18229d(0.0f);
                imageView.setImageResource(R.drawable.baseline_device_android_x);
                textView5.setVisibility(View$OnClickListenerC2265cy.this.f7853D0.f35176d.canAcceptSecretChats ? 0 : 8);
                textView6.setVisibility(View$OnClickListenerC2265cy.this.f7853D0.f35176d.canAcceptCalls ? 0 : 8);
                textView6.setPadding(View$OnClickListenerC2265cy.this.f7853D0.f35176d.canAcceptSecretChats ? 0 : C1357a0.m37541i(48.0f), 0, 0, 0);
            } else if (j == R.id.btn_session) {
                TdApi.Session session = (TdApi.Session) raVar.m32844d();
                relativeLayout.setTag(session);
                long j2 = session.lastActiveDate;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                String V2 = C4403w.m27924V2(j2, timeUnit);
                if (!C5067f.m24107m(session.lastActiveDate, timeUnit)) {
                    str = V2 + " " + C4403w.m27932T2(session.lastActiveDate, timeUnit);
                } else {
                    str = V2;
                }
                textView.setText(str);
                textView2.setText(View$OnClickListenerC2265cy.m35172fh(session));
                textView3.setText(View$OnClickListenerC2265cy.m35175ch(session));
                textView4.setText(C1363c0.m37415r(session.f25421ip, session.country));
                boolean z2 = (View$OnClickListenerC2265cy.this.f7857H0 == null || View$OnClickListenerC2265cy.this.f7857H0.m21505f(session.f25420id) == null) ? false : true;
                relativeLayout.setEnabled(!z2);
                if (z) {
                    n2Var.m18231a(z2 ? 1.0f : 0.0f);
                } else {
                    n2Var.m18229d(z2 ? 1.0f : 0.0f);
                }
                imageView.setImageResource(C4864e.m24930a(session));
                textView5.setVisibility((!session.canAcceptSecretChats || session.isPasswordPending) ? 8 : 0);
                textView6.setVisibility((!session.canAcceptCalls || session.isPasswordPending) ? 8 : 0);
                textView6.setPadding(session.canAcceptSecretChats ? 0 : C1357a0.m37541i(48.0f), 0, 0, 0);
            }
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            if (raVar.m32876A() == 89) {
                cVar.m10215Q1(C1357a0.m37541i(63.0f), 0);
            }
            int y = raVar.m32820y(0);
            if (y == R.id.theme_color_textNegative) {
                y = R.id.theme_color_iconNegative;
            }
            cVar.setIconColorId(y);
            int j = raVar.m32835j();
            if (j == R.id.btn_qrLogin) {
                cVar.setData(C4403w.m27821u1(R.string.ScanQRLogInInfo, new Object[0]));
            } else if (j == R.id.btn_sessionTtl) {
                cVar.setData(C4403w.m27818v0((int) TimeUnit.DAYS.toSeconds(View$OnClickListenerC2265cy.this.f7854E0)));
            } else if (j == R.id.btn_terminateAllSessions) {
                cVar.setData(R.string.ClearOtherSessionsHelp);
            }
        }
    }

    public class C2267b implements C4007j.AbstractC4009b {
        public C2267b() {
        }

        @Override
        public void mo9527a(RecyclerView.AbstractC0886d0 d0Var) {
            View$OnClickListenerC2265cy.this.m35169ih((TdApi.Session) d0Var.f3479a.getTag(), false);
        }

        @Override
        public boolean mo9526b(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i) {
            if (i < 0 || i >= View$OnClickListenerC2265cy.this.f7855F0.m34240F0().size()) {
                return false;
            }
            C2964ra raVar = View$OnClickListenerC2265cy.this.f7855F0.m34240F0().get(i);
            if (raVar.m32835j() != R.id.btn_session || View$OnClickListenerC2265cy.this.f7856G0) {
                return false;
            }
            return View$OnClickListenerC2265cy.this.f7857H0 == null || View$OnClickListenerC2265cy.this.f7857H0.m21505f(raVar.m32832m()) == null;
        }

        @Override
        public float mo9525e() {
            return C4012k.m29329a(this);
        }
    }

    public View$OnClickListenerC2265cy(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public static CharSequence m35175ch(TdApi.Session session) {
        return m35174dh(session, null, null, null);
    }

    public static CharSequence m35174dh(TdApi.Session session, C4403w.AbstractC4409f fVar, C4403w.AbstractC4409f fVar2, C4403w.AbstractC4409f fVar3) {
        String str;
        CharSequence[] charSequenceArr = new CharSequence[2];
        if (!C5070i.m24061i(session.applicationName)) {
            str = session.applicationName;
        } else {
            str = "App #" + session.apiId;
        }
        charSequenceArr[0] = C4403w.m27888d3(str, fVar2);
        charSequenceArr[1] = C4403w.m27888d3(session.applicationVersion, fVar3);
        return C4403w.m27888d3(C1363c0.m37416q(" ", charSequenceArr), fVar);
    }

    public static CharSequence m35173eh(TdApi.Session session, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C4403w.AbstractC4409f p = z ? C4403w.m27843p() : null;
        C4403w.AbstractC4409f y = z ? C4403w.m27807y() : null;
        if (z) {
            spannableStringBuilder.append(C4403w.m27873h1(R.string.session_Device, p, m35172fh(session)));
        }
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append('\n');
        }
        CharSequence dh = m35174dh(session, p, null, y);
        if (z) {
            spannableStringBuilder.append(C4403w.m27862k0(R.string.session_App, dh));
        } else {
            spannableStringBuilder.append(dh);
        }
        CharSequence d3 = C4403w.m27888d3(C1363c0.m37416q(" ", C4403w.m27888d3(session.platform, null), C4403w.m27888d3(session.systemVersion, y)), p);
        if (!C5070i.m24061i(d3)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append('\n');
            }
            if (z) {
                spannableStringBuilder.append(C4403w.m27862k0(R.string.session_System, d3));
            } else {
                spannableStringBuilder.append(d3);
            }
        }
        if (z || session.isCurrent) {
            spannableStringBuilder.append('\n').append(C4403w.m27873h1(R.string.SessionLogInDate, y, C4403w.m27805y1(session.logInDate, TimeUnit.SECONDS)));
        }
        if (z) {
            spannableStringBuilder.append('\n').append(C4403w.m27873h1(R.string.SessionLastActiveDate, y, C4403w.m27805y1(session.lastActiveDate, TimeUnit.SECONDS)));
            spannableStringBuilder.append('\n').append(C1363c0.m37415r(C4403w.m27803z(session.f25421ip), session.country));
        }
        return spannableStringBuilder;
    }

    public static CharSequence m35172fh(TdApi.Session session) {
        return session.deviceModel;
    }

    public boolean m35168jh(TdApi.Session session, View view, int i) {
        if (i == R.id.btn_copyText) {
            C1379j0.m37325i(m35173eh(session, true), R.string.CopiedText);
        } else if (i == R.id.btn_terminateSession) {
            m35162ph(session);
        }
        return true;
    }

    public void m35167kh() {
        C6035e<TdApi.Session> eVar = this.f7857H0;
        if (eVar != null) {
            eVar.m21509b();
        }
        this.f7856G0 = false;
        m35176bh();
        C10930q6.C10946p pVar = this.f7853D0;
        if (pVar != null) {
            for (TdApi.Session session : pVar.f35173a) {
                m35198Fh(session.f25420id);
            }
        }
    }

    public static void m35166lh(TdApi.Error error) {
    }

    public void m35165mh(int i) {
        if (i != 0) {
            this.f30167b.m2593Wb(i, C2846ox.f9563a);
        }
    }

    public static boolean m35164nh(AbstractC5919k kVar, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        int t = C5070i.m24050t(str, -1);
        if (t < 1 || t > 366) {
            return false;
        }
        kVar.mo3250a(t);
        return true;
    }

    public boolean m35163oh(final AbstractC5919k kVar, View view, int i) {
        int i2;
        switch (i) {
            case R.id.btn_terminateIn1m:
                i2 = 31;
                break;
            case R.id.btn_terminateIn1w:
                i2 = 7;
                break;
            case R.id.btn_terminateIn3m:
                i2 = 93;
                break;
            case R.id.btn_terminateIn6m:
                i2 = 186;
                break;
            case R.id.btn_terminateInCustom:
                m9364Pc(C4403w.m27869i1(R.string.SessionTerminatesCustomAlertTitle), C4403w.m27869i1(R.string.SessionTerminatesCustomAlertHint), R.string.Done, R.string.Cancel, String.valueOf(this.f7854E0), new AbstractC9323v4.AbstractC9336m() {
                    @Override
                    public final boolean mo4197a(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
                        boolean nh;
                        nh = View$OnClickListenerC2265cy.m35164nh(AbstractC5919k.this, y1Var, str);
                        return nh;
                    }
                }, true).getEditText().setInputType(2);
                return true;
            default:
                i2 = 0;
                break;
        }
        kVar.mo3250a(i2);
        return true;
    }

    public void m35161qh(TdApi.Session session) {
        if (session.isCurrent) {
            TdApi.Session session2 = this.f7853D0.f35176d;
            session2.canAcceptSecretChats = session.canAcceptSecretChats;
            session2.canAcceptCalls = session.canAcceptCalls;
            this.f7855F0.m34130s3(R.id.btn_currentSession);
            return;
        }
        this.f7853D0.f35173a[m35171gh(session.f25420id)] = session;
        m35198Fh(session.f25420id);
    }

    public boolean m35160rh(View view, int i) {
        if (i != R.id.btn_terminateAllSessions) {
            return true;
        }
        m35202Dh();
        return true;
    }

    public void m35159sh(String str, TdApi.Object object) {
        if (object.getConstructor() == -1089332956) {
            this.f30167b.m2158y4(str, null, C2797nx.f9434a);
        }
    }

    public void m35158th(TdApi.Session session) {
        if (m35171gh(session.f25420id) == -1) {
            TdApi.Session[] sessionArr = this.f7853D0.f35173a;
            TdApi.Session[] sessionArr2 = new TdApi.Session[sessionArr.length + 1];
            System.arraycopy(sessionArr, 0, sessionArr2, 0, sessionArr.length);
            sessionArr2[this.f7853D0.f35173a.length] = session;
            C7321e.m16920p1(sessionArr2);
            this.f7853D0 = new C10930q6.C10946p(new TdApi.Sessions(sessionArr2, this.f7853D0.f35181i));
            m35177ah();
            C1379j0.m37304s0(C4403w.m27825t1(session.isPasswordPending ? R.string.ScanQRAuthorizedToastPasswordPending : R.string.ScanQRAuthorizedToast, C4403w.m27843p(), session.applicationName), 1, 0);
        }
    }

    public void m35157uh(TdApi.Session session) {
        C6035e<TdApi.Session> eVar = this.f7857H0;
        if (eVar != null) {
            eVar.m21499l(session.f25420id);
        }
        m35208Ah(session);
    }

    public void m35156vh(C10930q6.C10946p pVar) {
        m35204Ch(pVar);
        m35177ah();
    }

    public void m35155wh(final C10930q6.C10946p pVar) {
        if (pVar != null) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2265cy.this.m35156vh(pVar);
                }
            });
        }
    }

    public static void m35154xh(TdApi.Error error) {
        if (error != null) {
            C1379j0.m37302t0(error);
        }
    }

    public void m35153yh(TdApi.Session session) {
        this.f7857H0.m21499l(session.f25420id);
        int hh = m35170hh(session.f25420id);
        if (hh != -1) {
            this.f7855F0.m34160j3(hh);
        }
    }

    public void m35152zh(final TdApi.Session session, TdApi.Error error) {
        if (error != null) {
            if (this.f7857H0 != null) {
                m9135wd(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2265cy.this.m35153yh(session);
                    }
                });
            }
            C1379j0.m37302t0(error);
        }
    }

    @Override
    public boolean mo493A3(View view, int i) {
        TdApi.Session session;
        if (i != R.id.btn_terminateSession || (session = this.f7858I0) == null) {
            return true;
        }
        m35162ph(session);
        this.f7858I0 = null;
        return true;
    }

    public final void m35208Ah(TdApi.Session session) {
        C10930q6.C10946p pVar = this.f7853D0;
        if (pVar != null && !pVar.f35177e) {
            if (pVar.f35173a.length == 1) {
                m35176bh();
                return;
            }
            int gh = m35171gh(session.f25420id);
            if (gh != -1) {
                TdApi.Session[] sessionArr = this.f7853D0.f35173a;
                this.f7853D0 = new C10930q6.C10946p(new TdApi.Sessions((TdApi.Session[]) C5062b.m24146z(sessionArr, gh, new TdApi.Session[sessionArr.length - 1]), this.f7853D0.f35181i));
                int L0 = this.f7855F0.m34228L0(session);
                if (L0 != -1) {
                    int i = L0 - 1;
                    boolean z = false;
                    boolean z2 = this.f7855F0.m34240F0().get(i).m32876A() == 2;
                    if (this.f7855F0.m34240F0().get(L0 + 1).m32876A() == 3) {
                        z = true;
                    }
                    if (z2 && z) {
                        int i2 = 4;
                        int i3 = L0 + 2;
                        if (i3 < this.f7855F0.m34240F0().size() && this.f7855F0.m34240F0().get(i3).m32876A() == 9) {
                            i2 = 5;
                        }
                        this.f7855F0.m34204V1(i - 1, i2);
                    } else if (z2) {
                        this.f7855F0.m34204V1(L0, 2);
                    } else {
                        this.f7855F0.m34204V1(i, 2);
                    }
                }
            }
        }
    }

    public final void m35206Bh() {
        this.f30167b.m2569Y5(false, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                View$OnClickListenerC2265cy.this.m35155wh((C10930q6.C10946p) obj);
            }
        });
    }

    public final void m35204Ch(C10930q6.C10946p pVar) {
        this.f7853D0 = pVar;
        this.f7854E0 = pVar.f35181i;
    }

    public final void m35202Dh() {
        TdApi.Session[] sessionArr;
        C10930q6.C10946p pVar = this.f7853D0;
        if (!(pVar == null || pVar.f35177e || this.f7856G0)) {
            this.f7856G0 = true;
            if (this.f7857H0 == null) {
                this.f7857H0 = new C6035e<>();
            }
            for (TdApi.Session session : this.f7853D0.f35173a) {
                if (!session.isCurrent) {
                    this.f7857H0.m21500k(session.f25420id, session);
                    m35198Fh(session.f25420id);
                }
            }
            this.f30167b.m2592Wc(this.f7853D0.f35176d, C2897px.f9681a);
        }
    }

    @Override
    public void mo2957E6(C10930q6 q6Var, TdApi.Session session) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2265cy.this.m35167kh();
            }
        });
    }

    public final void m35162ph(final TdApi.Session session) {
        C6035e<TdApi.Session> eVar = this.f7857H0;
        if (eVar == null) {
            this.f7857H0 = new C6035e<>();
        } else if (eVar.m21505f(session.f25420id) != null) {
            return;
        }
        this.f7857H0.m21500k(session.f25420id, session);
        int hh = m35170hh(session.f25420id);
        if (hh != -1) {
            this.f7855F0.m34160j3(hh);
        }
        this.f30167b.m2577Xc(session, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                View$OnClickListenerC2265cy.this.m35152zh(session, (TdApi.Error) obj);
            }
        });
    }

    public final void m35198Fh(long j) {
        int hh = m35170hh(j);
        if (hh != -1) {
            this.f7855F0.m34160j3(hh);
        }
    }

    @Override
    public void mo2956O5(C10930q6 q6Var, final TdApi.Session session) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2265cy.this.m35158th(session);
            }
        });
    }

    @Override
    public boolean mo492Q() {
        return C5115g0.m23935a(this);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_sessions;
    }

    @Override
    public void mo2955X0(C10930q6 q6Var, final TdApi.Session session) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2265cy.this.m35157uh(session);
            }
        });
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27869i1(R.string.Devices);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f30167b.m2781K9().m1798v0(this);
    }

    public final void m35177ah() {
        boolean z;
        C10930q6.C10946p pVar = this.f7853D0;
        if (pVar != null && pVar.f35176d != null) {
            ArrayList arrayList = new ArrayList();
            if (this.f30167b.m2773L1()) {
                arrayList.add(new C2964ra(89, R.id.btn_qrLogin, R.drawable.xt3000_baseline_qrcode_scan_24, R.string.ScanQR).m32843d0(R.id.theme_color_textNeutral));
                arrayList.add(new C2964ra(11));
            }
            arrayList.add(new C2964ra(5, R.id.btn_sessionTtl, 0, R.string.SessionTerminateTtl));
            arrayList.add(new C2964ra(3));
            int i = 8;
            arrayList.add(new C2964ra(arrayList.isEmpty() ? 70 : 8, 0, 0, R.string.ThisDevice));
            int i2 = 2;
            arrayList.add(new C2964ra(2));
            int i3 = 16;
            arrayList.add(new C2964ra(16, R.id.btn_currentSession, 0, 0));
            if (this.f7853D0.f35177e) {
                arrayList.add(new C2964ra(3));
                arrayList.add(new C2964ra(18));
            } else {
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(89, R.id.btn_terminateAllSessions, R.drawable.baseline_cancel_24, R.string.TerminateAllSessions).m32843d0(R.id.theme_color_textNegative));
                arrayList.add(new C2964ra(3));
                TdApi.Session[] sessionArr = this.f7853D0.f35175c;
                int length = sessionArr.length;
                int i4 = 0;
                boolean z2 = true;
                while (i4 < length) {
                    TdApi.Session session = sessionArr[i4];
                    if (z2) {
                        arrayList.add(new C2964ra(8, 0, 0, R.string.SessionsIncompleteTitle));
                        arrayList.add(new C2964ra(2));
                        z2 = false;
                    } else {
                        arrayList.add(new C2964ra(11));
                    }
                    arrayList.add(new C2964ra(i3, R.id.btn_session, 0, 0).m32863N(session.f25420id).m32870G(session));
                    i4++;
                    i3 = 16;
                }
                if (!z2) {
                    arrayList.add(new C2964ra(3));
                    arrayList.add(new C2964ra(9, 0, 0, R.string.SessionsIncompleteInfo));
                    z = true;
                } else {
                    z = z2;
                }
                TdApi.Session[] sessionArr2 = this.f7853D0.f35174b;
                int length2 = sessionArr2.length;
                int i5 = 0;
                while (i5 < length2) {
                    TdApi.Session session2 = sessionArr2[i5];
                    if (z) {
                        arrayList.add(new C2964ra(i, 0, 0, this.f7853D0.f35175c.length > 0 ? R.string.ActiveDevices : R.string.OtherDevices));
                        arrayList.add(new C2964ra(i2));
                        z = false;
                    } else {
                        arrayList.add(new C2964ra(11));
                    }
                    arrayList.add(new C2964ra(16, R.id.btn_session, 0, 0).m32863N(session2.f25420id).m32870G(session2));
                    i5++;
                    i2 = 2;
                    i = 8;
                }
                if (!z) {
                    arrayList.add(new C2964ra(3));
                }
            }
            this.f7855F0.m34116x2(arrayList, false);
            m9204n9();
        }
    }

    @Override
    public Object mo491b2(int i) {
        return C5115g0.m23934b(this, i);
    }

    public final void m35176bh() {
        C10930q6.C10946p pVar = this.f7853D0;
        if (!(pVar == null || pVar.f35177e)) {
            List<C2964ra> F0 = this.f7855F0.m34240F0();
            int size = F0.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (F0.get(i).m32876A() == 11) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                for (int i2 = size - 1; i2 >= i; i2--) {
                    F0.remove(i2);
                }
                this.f7855F0.m39307N(i, size - i);
                int size2 = F0.size();
                F0.add(new C2964ra(3));
                F0.add(new C2964ra(18));
                this.f7855F0.m39308M(size2, 2);
            }
            C10930q6.C10946p pVar2 = this.f7853D0;
            this.f7853D0 = new C10930q6.C10946p(new TdApi.Sessions(new TdApi.Session[]{pVar2.f35176d}, pVar2.f35181i));
        }
    }

    @Override
    public void mo2954c3(C10930q6 q6Var, int i) {
        this.f7854E0 = i;
        this.f7855F0.m34130s3(R.id.btn_sessionTtl);
    }

    @Override
    public void mo2953c7(C10930q6 q6Var, boolean z) {
        m35206Bh();
    }

    @Override
    public boolean mo9270dc() {
        return this.f7853D0 == null;
    }

    public final int m35171gh(long j) {
        int i = 0;
        for (TdApi.Session session : this.f7853D0.f35173a) {
            if (session.f25420id == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int m35170hh(long j) {
        int gh = m35171gh(j);
        if (gh != -1) {
            return this.f7855F0.m34228L0(this.f7853D0.f35173a[gh]);
        }
        return -1;
    }

    public final void m35169ih(final TdApi.Session session, boolean z) {
        CharSequence[] charSequenceArr = new CharSequence[2];
        charSequenceArr[0] = C4403w.m27839q(C4403w.m27869i1(session.isPasswordPending ? R.string.TerminateIncompleteSessionQuestion : R.string.TerminateSessionQuestion));
        charSequenceArr[1] = m35173eh(session, true);
        CharSequence q = C1363c0.m37416q("\n\n", charSequenceArr);
        int[] iArr = {R.id.btn_terminateSession, R.id.btn_cancel, R.id.btn_copyText};
        String[] strArr = new String[3];
        strArr[0] = C4403w.m27869i1(session.isPasswordPending ? R.string.TerminateIncompleteSession : R.string.TerminateSession);
        strArr[1] = C4403w.m27869i1(R.string.Cancel);
        strArr[2] = C4403w.m27869i1(R.string.Copy);
        m9261ee(q, iArr, strArr, new int[]{2, 1, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24, R.drawable.baseline_content_copy_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean jh;
                jh = View$OnClickListenerC2265cy.this.m35168jh(session, view, i);
                return jh;
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
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_currentSession:
            case R.id.btn_session:
                Object tag = view.getTag();
                if (tag instanceof TdApi.Session) {
                    final TdApi.Session session = (TdApi.Session) tag;
                    View$OnClickListenerC2330e8 e8Var = new View$OnClickListenerC2330e8(this.f30165a, this.f30167b);
                    e8Var.m35078yf(new View$OnClickListenerC2330e8.C2332b(session, this.f7853D0.f35181i, new Runnable() {
                        @Override
                        public final void run() {
                            View$OnClickListenerC2265cy.this.m35162ph(session);
                        }
                    }, new AbstractC5918j() {
                        @Override
                        public final void mo1330a(Object obj) {
                            View$OnClickListenerC2265cy.this.m35161qh((TdApi.Session) obj);
                        }
                    }));
                    this.f30165a.m14552P1().m9719h0(e8Var);
                    return;
                }
                return;
            case R.id.btn_qrLogin:
                m9380Nc(new AbstractC9323v4.C9334k().m9109b(view).m9106e(true).m9110a(false).m9105f(true).m9107d(2).m9104g(this));
                return;
            case R.id.btn_sessionTtl:
                C5320c cVar = new C5320c(4);
                C5146u0 u0Var = new C5146u0(4);
                final AbstractC5919k qxVar = new AbstractC5919k() {
                    @Override
                    public final void mo3250a(int i) {
                        View$OnClickListenerC2265cy.this.m35165mh(i);
                    }
                };
                cVar.m23284a(R.id.btn_terminateIn1w);
                u0Var.m23815b(C4403w.m27844o2(R.string.SessionTerminatesInWeeks, 1L));
                cVar.m23284a(R.id.btn_terminateIn1m);
                u0Var.m23815b(C4403w.m27844o2(R.string.SessionTerminatesInMonths, 1L));
                cVar.m23284a(R.id.btn_terminateIn3m);
                u0Var.m23815b(C4403w.m27844o2(R.string.SessionTerminatesInMonths, 3L));
                cVar.m23284a(R.id.btn_terminateIn6m);
                u0Var.m23815b(C4403w.m27844o2(R.string.SessionTerminatesInMonths, 6L));
                cVar.m23284a(R.id.btn_terminateInCustom);
                u0Var.m23815b(C4403w.m27869i1(R.string.SessionTerminatesCustom));
                m9261ee(null, cVar.m23280e(), u0Var.m23813d(), null, null, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i) {
                        boolean oh;
                        oh = View$OnClickListenerC2265cy.this.m35163oh(qxVar, view2, i);
                        return oh;
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
            case R.id.btn_terminateAllSessions:
                m9261ee(C4403w.m27869i1(R.string.AreYouSureSessions), new int[]{R.id.btn_terminateAllSessions, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.TerminateAllSessions), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i) {
                        boolean rh;
                        rh = View$OnClickListenerC2265cy.this.m35160rh(view2, i);
                        return rh;
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

    @Override
    public void mo30633rg(Context context, CustomRecyclerView customRecyclerView) {
        this.f7855F0 = new C2266a(this);
        if (this.f7853D0 != null) {
            m35177ah();
        }
        if (m9139w9() == null) {
            C4007j.m29342a(customRecyclerView, new C2267b());
        }
        if (m9139w9() == null) {
            m35206Bh();
        }
        customRecyclerView.setAdapter(this.f7855F0);
        this.f30167b.m2781K9().m1850i0(this);
    }

    @Override
    public void mo1772y3(final String str) {
        if (str.startsWith("tg://")) {
            mo4348c().m2270r4().m14783o(new TdApi.GetInternalLinkType(str), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2265cy.this.m35159sh(str, object);
                }
            });
        }
    }

    @Override
    public long mo9125y9(boolean z) {
        return 400L;
    }
}
