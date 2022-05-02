package p038ce;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import be.C1405v;
import gd.C4779t2;
import ge.C4868i;
import ge.C4897o;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import lb.EnumC6459p;
import me.C6981o;
import me.View$OnFocusChangeListenerC7069y1;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.MainActivity;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p038ce.View$OnClickListenerC2593jv;
import p038ce.k30;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5069h;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5917i;
import p139jb.AbstractC5918j;
import p139jb.AbstractC5919k;
import p139jb.AbstractC5920l;
import p193nb.C7317b;
import p350yd.C10536ab;
import p350yd.C10930q6;
import p350yd.C11131y6;
import p350yd.HandlerC10770jj;
import tc.C9137c;
import tc.C9139d;
import td.AbstractC9323v4;
import td.C9180e2;
import td.C9188f2;
import td.C9289s;

public class View$OnClickListenerC3209vr extends AbstractC3204vo<C3215f> implements View.OnClickListener, AbstractC9323v4.AbstractC9343r, View.OnLongClickListener, Log.AbstractC7880c {
    public C4868i.C4873e f10712F0;
    public boolean f10713G0;
    public C2546iq f10714H0;
    public Runnable f10716J0;
    public Log.C7879b f10717K0;
    public boolean f10718L0;
    public long f10719M0;
    public boolean f10720N0;
    public C9289s f10721O0;
    public int f10722P0;
    public boolean f10723Q0;
    public int f10710D0 = 0;
    public int f10711E0 = 0;
    public final long[] f10715I0 = new long[2];

    public class RunnableC3210a implements Runnable {
        public RunnableC3210a() {
        }

        @Override
        public void run() {
            if (View$OnClickListenerC3209vr.this.m9339Ta()) {
                View$OnClickListenerC3209vr.this.m31228ei(new File(C10536ab.m4796H0(false)).length(), false);
                View$OnClickListenerC3209vr.this.m31228ei(new File(C10536ab.m4796H0(true)).length(), true);
                C1379j0.m37332e0(this, 1500L);
            }
        }
    }

    public class C3211b extends C2546iq {
        public C3211b(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            int[] iArr;
            boolean z2 = false;
            boolean z3 = false;
            r1 = false;
            boolean z4 = false;
            z2 = false;
            z2 = false;
            z2 = false;
            z2 = false;
            if (View$OnClickListenerC3209vr.this.f10713G0) {
                int j = raVar.m32835j();
                cVar.setIconColorId(j != R.id.btn_eraseDatabase ? j != R.id.btn_launchApp ? 0 : R.id.theme_color_iconActive : R.id.theme_color_iconNegative);
            }
            switch (raVar.m32835j()) {
                case R.id.btn_log_android:
                    cVar.getToggler().m10186r(Log.checkSetting(1), false);
                    return;
                case R.id.btn_log_files:
                    if (!Log.isCapturing() && View$OnClickListenerC3209vr.this.f10718L0 && !View$OnClickListenerC3209vr.this.f10720N0 && View$OnClickListenerC3209vr.this.f10717K0 != null && !View$OnClickListenerC3209vr.this.f10717K0.m14707a()) {
                        z2 = true;
                    }
                    if (z) {
                        cVar.setEnabledAnimated(z2);
                    } else {
                        cVar.setEnabled(z2);
                    }
                    if (!View$OnClickListenerC3209vr.this.f10718L0) {
                        cVar.setData(R.string.LoadingInformation);
                        return;
                    } else if (View$OnClickListenerC3209vr.this.f10717K0 == null || View$OnClickListenerC3209vr.this.f10717K0.m14707a()) {
                        cVar.setData(C4403w.m27844o2(R.string.xFiles, 0L));
                        return;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(C1363c0.m37423m(View$OnClickListenerC3209vr.this.f10717K0.f25454d));
                        if (View$OnClickListenerC3209vr.this.f10717K0.f25452b > 0) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(View$OnClickListenerC3209vr.this.f10717K0.f25452b);
                            sb2.append(" log");
                            if (View$OnClickListenerC3209vr.this.f10717K0.f25452b != 1) {
                                sb2.append('s');
                            }
                        }
                        if (View$OnClickListenerC3209vr.this.f10717K0.f25453c > 0) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(View$OnClickListenerC3209vr.this.f10717K0.f25453c);
                            sb2.append(" crash");
                            if (View$OnClickListenerC3209vr.this.f10717K0.f25453c != 1) {
                                sb2.append("es");
                            }
                        }
                        cVar.setData(sb2.toString());
                        return;
                    }
                case R.id.btn_log_tags:
                    boolean isCapturing = Log.isCapturing();
                    if (z) {
                        cVar.setEnabledAnimated(!isCapturing);
                    } else {
                        cVar.setEnabled(!isCapturing);
                    }
                    StringBuilder sb3 = new StringBuilder();
                    for (int i : Log.TAGS) {
                        if (Log.isEnabled(i)) {
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(Log.getLogTag(i));
                        }
                    }
                    if (sb3.length() == 0) {
                        sb3.append("None");
                    }
                    cVar.setData(sb3.toString());
                    return;
                case R.id.btn_log_verbosity:
                    boolean isCapturing2 = Log.isCapturing();
                    if (z) {
                        cVar.setEnabledAnimated(!isCapturing2);
                    } else {
                        cVar.setEnabled(!isCapturing2);
                    }
                    cVar.setData(View$OnClickListenerC3209vr.m31197zh(isCapturing2 ? 5 : Log.getLogLevel()));
                    return;
                case R.id.btn_secret_debugQrRegions:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24777V2(), z);
                    return;
                case R.id.btn_secret_disableNetwork:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24736b0(), z);
                    return;
                case R.id.btn_secret_disableQrProcess:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24903D2(), z);
                    return;
                case R.id.btn_secret_dontReadMessages:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24780V(), z);
                    return;
                case R.id.btn_secret_forceQrZxing:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24896E2(), z);
                    return;
                case R.id.btn_secret_forceTcpInCalls:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24728c0(), z);
                    return;
                case R.id.btn_secret_forceTdlibRestarts:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24720d0(), z);
                    return;
                case R.id.btn_secret_replacePhoneNumber:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24875H2(), z);
                    return;
                case R.id.btn_switchRtl:
                    cVar.getToggler().m10186r(C4403w.m27984G2(), z);
                    return;
                case R.id.btn_tdlib_androidLogs:
                    cVar.getToggler().m10186r(C4868i.m24726c2().m24719d1().m24502j(), z);
                    return;
                case R.id.btn_tdlib_logSize:
                    cVar.setData(C1363c0.m37423m(C4868i.m24726c2().m24719d1().m24507e()));
                    return;
                case R.id.btn_tdlib_verbosity:
                    String str = (String) raVar.m32844d();
                    C4868i.C4887r d1 = C4868i.m24726c2().m24719d1();
                    int h = d1.m24504h(str);
                    if (str == null || h != d1.m24508d(str)) {
                        cVar.setData(View$OnClickListenerC3209vr.m31197zh(h));
                        C9139d toggler = cVar.getToggler();
                        if (str == null ? h > 0 : h <= d1.m24504h(null)) {
                            z4 = true;
                        }
                        toggler.m10186r(z4, z);
                        return;
                    }
                    cVar.setData("Default");
                    C9139d toggler2 = cVar.getToggler();
                    if (h <= d1.m24504h(null)) {
                        z3 = true;
                    }
                    toggler2.m10186r(z3, z);
                    return;
                case R.id.btn_tdlib_viewLogs:
                    cVar.setData(C1363c0.m37423m(View$OnClickListenerC3209vr.this.f10715I0[0]));
                    return;
                case R.id.btn_tdlib_viewLogsOld:
                    cVar.setData(C1363c0.m37423m(View$OnClickListenerC3209vr.this.f10715I0[1]));
                    return;
                default:
                    return;
            }
        }

        @Override
        public void mo9531c2(C2964ra raVar, int i, C6981o oVar) {
            oVar.setEnabled(false);
            C11131y6 y6Var = (C11131y6) raVar.m32844d();
            oVar.setTitle(y6Var.m1455u());
            oVar.m18194g1(y6Var.m1463m(false), y6Var.m1462n());
            oVar.setSubtitle(C4403w.m27869i1(R.string.LaunchAppUserSubtitle));
        }
    }

    public class C3212c implements HandlerC10770jj.AbstractC10782l {
        public C3212c() {
        }

        @Override
        public void mo3341a() {
            View$OnClickListenerC3209vr.this.f10723Q0 = false;
            ((MainActivity) View$OnClickListenerC3209vr.this.f30165a).m14641l5();
        }

        @Override
        public void mo3340b() {
            View$OnClickListenerC3209vr.this.f10723Q0 = true;
        }
    }

    public class C3213d implements AbstractC5917i {
        public final AtomicBoolean f10727a;
        public final List f10728b;

        public C3213d(AtomicBoolean atomicBoolean, List list) {
            this.f10727a = atomicBoolean;
            this.f10728b = list;
        }

        @Override
        public void mo1322a(boolean z) {
            if (!z) {
                this.f10727a.set(true);
            }
            if (!this.f10728b.isEmpty()) {
                List list = this.f10728b;
                ((C11131y6) list.remove(list.size() - 1)).mo1480c().m2509c5(this);
                return;
            }
            View$OnClickListenerC3209vr.this.f10723Q0 = false;
            if (!View$OnClickListenerC3209vr.this.m9347Sa() && View$OnClickListenerC3209vr.this.m9284bc() != null) {
                View$OnClickListenerC3209vr.this.m9284bc().m9749M().m9514B(false);
                if (!this.f10727a.get()) {
                    ((MainActivity) View$OnClickListenerC3209vr.this.f30165a).m14641l5();
                    C1379j0.m37292y0(R.string.EraseDatabaseDone, 0);
                    return;
                }
                C1379j0.m37292y0(R.string.EraseDatabaseError, 0);
            }
        }
    }

    public class C3214e implements AbstractC9323v4.AbstractC9336m {
        public C3214e() {
        }

        @Override
        public boolean mo4197a(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
            int s;
            if (!C5070i.m24057m(str) || (s = C5070i.m24051s(str)) <= 0 || View$OnClickListenerC3209vr.this.m9347Sa()) {
                return false;
            }
            if (View$OnClickListenerC3209vr.this.f30158T != null) {
                View$OnClickListenerC3209vr.this.f30158T.m9749M().m9507f();
            }
            View$OnClickListenerC3209vr.this.f30167b.m2134zc(s);
            return true;
        }
    }

    public View$OnClickListenerC3209vr(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m31286Bh() {
        if (!m9347Sa()) {
            m31214li(this.f10717K0);
            m31216ki(false);
        }
    }

    public void m31284Ch(Log.C7879b bVar) {
        if (!m9347Sa()) {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3209vr.this.m31286Bh();
                }
            });
        }
    }

    public void m31282Dh(Log.C7879b bVar) {
        if (!m9347Sa()) {
            m31214li(bVar);
        }
    }

    public void m31280Eh(final Log.C7879b bVar) {
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3209vr.this.m31282Dh(bVar);
            }
        });
    }

    public void m31278Fh(List list, boolean z) {
        if (z && !m9347Sa() && m9339Ta() && m9284bc() != null) {
            C1379j0.m37292y0(R.string.EraseDatabaseProgress, 0);
            m9284bc().m9749M().m9514B(true);
            this.f10723Q0 = true;
            ((C11131y6) list.remove(list.size() - 1)).mo1480c().m2509c5(new C3213d(new AtomicBoolean(), list));
        }
    }

    public void m31276Gh(final List list) {
        m9172re(C4403w.m27982H0(this, R.string.EraseDatabaseWarn2, new Object[0]), new AbstractC5917i() {
            @Override
            public final void mo1322a(boolean z) {
                View$OnClickListenerC3209vr.this.m31278Fh(list, z);
            }
        });
    }

    public void m31272Ih(boolean z) {
        if (z) {
            View$OnClickListenerC3209vr vrVar = new View$OnClickListenerC3209vr(this.f30165a, this.f30167b);
            vrVar.m31218ji(new C3215f(1, this.f10712F0).m31194c(this.f10711E0));
            m9291ac(vrVar);
        }
    }

    public static void m31270Jh(TdApi.Object object) {
        TdApi.LanguagePackInfo[] languagePackInfoArr;
        if (object instanceof TdApi.LocalizationTargetInfo) {
            StringBuilder sb2 = new StringBuilder();
            for (TdApi.LanguagePackInfo languagePackInfo : ((TdApi.LocalizationTargetInfo) object).languagePacks) {
                if (!languagePackInfo.isBeta && languagePackInfo.isOfficial) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append("'");
                    sb2.append(languagePackInfo.f25405id);
                    sb2.append("'");
                }
            }
            C1379j0.m37325i(sb2.toString(), R.string.CopiedText);
        }
    }

    public void m31268Kh() {
        this.f30167b.m2946A4().m1370u0(mo4347s(), false, null);
    }

    public void m31266Lh() {
        C1379j0.m37290z0("Contacts reset done", 0);
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3209vr.this.m31268Kh();
            }
        });
    }

    public void m31264Mh(TdApi.Object object) {
        if (!m9347Sa()) {
            k30 k30Var = new k30(this.f30165a, this.f30167b);
            k30Var.m9476Ad(k30.C2608a.m34034g("TDLib Database Stats", ((TdApi.DatabaseStatistics) object).statistics, "text/plain"));
            m9291ac(k30Var);
        }
    }

    public void m31262Nh(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -1123912880) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3209vr.this.m31264Mh(object);
                }
            });
        }
    }

    public static void m31260Oh(int i, int i2) {
        C1379j0.m37290z0(C4403w.m27844o2(R.string.ReadAllChatsDone, i + i2), 0);
    }

    public void m31258Ph(final int i) {
        this.f30167b.m2732Na(C7317b.f23225b, new AbstractC5919k() {
            @Override
            public final void mo3250a(int i2) {
                View$OnClickListenerC3209vr.m31260Oh(i, i2);
            }
        });
    }

    public void m31256Qh() {
        this.f30167b.m2732Na(C7317b.f23224a, new AbstractC5919k() {
            @Override
            public final void mo3250a(int i) {
                View$OnClickListenerC3209vr.this.m31258Ph(i);
            }
        });
    }

    public boolean m31254Rh(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        if (!C5070i.m24057m(str)) {
            return false;
        }
        long w = C5070i.m24047w(str);
        if (w < EnumC6459p.f20156b.mo20395b(1.0d)) {
            return false;
        }
        C4868i.m24726c2().m24719d1().m24496p(w);
        this.f10714H0.m34130s3(R.id.btn_tdlib_logSize);
        return true;
    }

    public void m31252Sh(int i) {
        int N0;
        if (!m9347Sa() && (N0 = this.f10714H0.m34224N0(R.id.btn_tdlib)) != -1) {
            if (i > 0) {
                int i2 = N0 + 1;
                this.f10714H0.m34240F0().add(i2, new C2964ra(11));
                int i3 = N0 + 2;
                this.f10714H0.m34240F0().add(i3, new C2964ra(4, (int) R.id.btn_testingUtils, 0, (int) R.string.TestMode, false));
                this.f10714H0.m39308M(i2, 2);
                if (i == 1) {
                    this.f10714H0.m34129t0(i3 + 2, new C2964ra(9, 0, 0, C1363c0.m37425l(this, "To unlock more Testing Utilities you have to be a member of @tgandroidtests.", null), false));
                    return;
                }
                return;
            }
            this.f10714H0.m34129t0(N0 + 2, new C2964ra(9, 0, 0, C1363c0.m37425l(this, "To unlock Testing Utilities you have to be subscribed to @tgx_android or be a member of @tgandroidtests.", null), false));
        }
    }

    public void m31250Th(final int i) {
        this.f10711E0 = i;
        this.f30167b.m2469ed(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3209vr.this.m31252Sh(i);
            }
        });
    }

    public void m31248Uh() {
        if (!m9347Sa()) {
            m31198yh();
        }
    }

    public void m31246Vh() {
        if (!m9347Sa()) {
            m31198yh();
        }
    }

    public boolean m31244Wh(View view, int i) {
        if (i != R.id.btn_deleteAll) {
            return true;
        }
        m31202uh();
        return true;
    }

    public static void m31242Xh(Runnable runnable) {
        try {
            C4897o.m24458o();
            C1379j0.m37334d0(runnable);
        } catch (Error e) {
            throw e;
        } catch (RuntimeException e2) {
        } catch (Throwable th) {
            throw new AssertionError(th);
        }
    }

    public void m31240Yh(int i, boolean z) {
        if (z) {
            m31220ii(i, false);
        }
    }

    public void m31238Zh() {
        if (!m9347Sa()) {
            m9387Md(false);
        }
        C1379j0.m37290z0("Test completed successfully", 0);
    }

    public void m31236ai(C4868i.C4887r rVar, String str, int i, SparseIntArray sparseIntArray) {
        rVar.m24494r(str, sparseIntArray.get(R.id.btn_tdlib_verbosity, 1) - 1);
        if (C5070i.m24061i(str)) {
            this.f10714H0.m34186b3(R.id.btn_tdlib_verbosity);
        } else {
            this.f10714H0.m34133r3(str);
        }
    }

    public boolean m31234bi(String str, C4868i.C4887r rVar, View$OnFocusChangeListenerC7069y1 y1Var, String str2) {
        int t;
        if (!C5070i.m24057m(str2) || (t = C5070i.m24050t(str2, -1)) < 0) {
            return false;
        }
        if (str != null && t < 1) {
            return false;
        }
        rVar.m24494r(str, t);
        if (C5070i.m24061i(str)) {
            this.f10714H0.m34130s3(R.id.btn_tdlib_verbosity);
        } else {
            this.f10714H0.m34133r3(str);
        }
        return true;
    }

    public void m31232ci(final String str, int i, final C4868i.C4887r rVar) {
        String str2 = str != null ? str : "Verbosity Level";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Integer ");
        sb2.append(str != null ? 1 : 0);
        sb2.append("..");
        sb2.append(Integer.MAX_VALUE);
        String sb3 = sb2.toString();
        if (i == -1) {
            i = 0;
        }
        m9364Pc(str2, sb3, R.string.Save, R.string.Cancel, Integer.toString(i), new AbstractC9323v4.AbstractC9336m() {
            @Override
            public final boolean mo4197a(View$OnFocusChangeListenerC7069y1 y1Var, String str3) {
                boolean bi;
                bi = View$OnClickListenerC3209vr.this.m31234bi(str, rVar, y1Var, str3);
                return bi;
            }
        }, true);
    }

    public void m31230di(C9180e2[] e2VarArr, final String str, final int i, final C4868i.C4887r rVar, View view, int i2, C2964ra raVar, TextView textView, C2546iq iqVar) {
        if (raVar.m32835j() == 7 && e2VarArr[0] != null && e2VarArr[0].f29641e != null && !e2VarArr[0].f29641e.m18446A2()) {
            e2VarArr[0].f29641e.m18408y2(true);
            C1379j0.m37332e0(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3209vr.this.m31232ci(str, i, rVar);
                }
            }, 200L);
        }
    }

    public boolean m31226fi(final boolean z, View view, View view2, int i) {
        switch (i) {
            case R.id.btn_saveFile:
                C4779t2.m25525e5(new File(C10536ab.m4796H0(z)), "text/plain");
                break;
            case R.id.btn_tdlib_clearLogs:
                HandlerC10770jj.m3793L2(z, new AbstractC5920l() {
                    @Override
                    public final void mo3050a(long j) {
                        View$OnClickListenerC3209vr.this.m31228ei(z, j);
                    }
                });
                break;
            case R.id.btn_tdlib_shareLogs:
                boolean z2 = false;
                if (C4868i.m24726c2().m24841M1().m24504h(null) != 0) {
                    mo4347s().m14584H3().m8985g(view).m8969F(this, this.f30167b, R.drawable.baseline_warning_24, C4403w.m27982H0(this, R.string.DebugShareError, new Object[0]));
                    break;
                } else {
                    C10930q6 q6Var = this.f30167b;
                    if (q6Var == null || q6Var.m2930B4().m4680k1()) {
                        z2 = true;
                    }
                    HandlerC10770jj.m3648Z7(this, z, z2);
                    break;
                }
                break;
            case R.id.btn_tdlib_viewLogs:
                k30 k30Var = new k30(this.f30165a, this.f30167b);
                k30Var.m9476Ad(k30.C2608a.m34035f("TDLib Log", C10536ab.m4796H0(z), "text/plain"));
                m9291ac(k30Var);
                break;
        }
        return true;
    }

    public static String m31197zh(int i) {
        switch (i) {
            case -1:
                return "-1";
            case 0:
                return "ASSERT";
            case 1:
                return "ERROR";
            case 2:
                return "WARNING";
            case 3:
                return "INFO";
            case 4:
                return "DEBUG";
            case 5:
                return "VERBOSE";
            default:
                return "MORE:" + i;
        }
    }

    @Override
    public int mo408A9() {
        if (this.f10713G0) {
            return 4;
        }
        return super.mo408A9();
    }

    public final String m31288Ah(boolean z) {
        C10930q6 q6Var = this.f30167b;
        String Vc = q6Var != null ? q6Var.m2607Vc() : null;
        StringBuilder sb2 = new StringBuilder();
        if (Vc == null) {
            Vc = "???";
        }
        sb2.append(Vc);
        sb2.append(z ? ".1506" : "");
        return sb2.toString();
    }

    @Override
    public void mo14706G6(int i, int i2, String str, Throwable th) {
        if (i2 <= 2 || m31224gi()) {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3209vr.this.m31246Vh();
                }
            });
        }
    }

    @Override
    public View mo8869G9() {
        return this.f10721O0;
    }

    @Override
    public void mo14705Q6() {
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3209vr.this.m31248Uh();
            }
        });
    }

    @Override
    public int mo407R9() {
        return R.id.controller_bug_killer;
    }

    @Override
    public CharSequence mo9313X9() {
        if (this.f10713G0) {
            return C4403w.m27869i1(R.string.LaunchTitle);
        }
        int i = this.f10710D0;
        if (i == 0) {
            return "0.24.6.1506-arm64-v8a";
        }
        if (i == 1) {
            return C4403w.m27869i1(R.string.TestMode);
        }
        if (i == 2) {
            return "TDLib " + m31288Ah(false);
        }
        throw new AssertionError(this.f10710D0);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        Log.removeOutputListener(this);
    }

    public final boolean m31224gi() {
        Log.C7879b bVar;
        return this.f10719M0 == 0 || (this.f10718L0 && ((bVar = this.f10717K0) == null || bVar.m14707a() || SystemClock.elapsedRealtime() - this.f10719M0 >= 1000));
    }

    public final void m31222hi(final Runnable runnable) {
        C1379j0.m37290z0("Running tests, please do nothing and wait...", 0);
        C4383l.m28059a().m28058b(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3209vr.m31242Xh(runnable);
            }
        });
    }

    public final void m31220ii(final int i, boolean z) {
        if (this.f10722P0 == 0) {
            if (z) {
                m9172re("Test may take some time. Don't be scared if it crashes.\n\nWarning: don't do anything in the app while test is running.", new AbstractC5917i() {
                    @Override
                    public final void mo1322a(boolean z2) {
                        View$OnClickListenerC3209vr.this.m31240Yh(i, z2);
                    }
                });
                return;
            }
            m9387Md(true);
            Runnable trVar = new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3209vr.this.m31238Zh();
                }
            };
            this.f10722P0 = i;
            if (i != 1) {
                this.f10722P0 = 0;
            } else {
                m31222hi(trVar);
            }
        }
    }

    public void m31218ji(C3215f fVar) {
        super.m9476Ad(fVar);
        boolean z = false;
        this.f10710D0 = fVar != null ? fVar.f10731a : 0;
        this.f10711E0 = fVar != null ? fVar.f10733c : 0;
        this.f10712F0 = fVar != null ? fVar.f10732b : null;
        if (fVar != null && fVar.f10734d) {
            z = true;
        }
        this.f10713G0 = z;
    }

    public final void m31216ki(boolean z) {
        if (this.f10720N0 != z) {
            this.f10720N0 = z;
            this.f10714H0.m34130s3(R.id.btn_log_files);
        }
    }

    @Override
    public void mo1773l6(int i, SparseIntArray sparseIntArray) {
        switch (i) {
            case R.id.btn_log_tags:
                long j = 0;
                int size = sparseIntArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    j |= sparseIntArray.keyAt(i2);
                }
                Log.setEnabledTags(j);
                this.f10714H0.m34130s3(R.id.btn_log_tags);
                return;
            case R.id.btn_log_verbosity:
                Log.setLogLevel(sparseIntArray.get(R.id.btn_log_verbosity, 1) - 1);
                this.f10714H0.m34130s3(R.id.btn_log_verbosity);
                return;
            default:
                return;
        }
    }

    public final void m31214li(Log.C7879b bVar) {
        this.f10717K0 = bVar;
        this.f10718L0 = true;
        this.f10714H0.m34130s3(R.id.btn_log_files);
    }

    public final void m31228ei(long j, boolean z) {
        long[] jArr = this.f10715I0;
        if (jArr[z ? 1 : 0] != j) {
            jArr[z] = j;
            C2546iq iqVar = this.f10714H0;
            if (iqVar != null) {
                iqVar.m34130s3(z != 0 ? R.id.btn_tdlib_viewLogsOld : R.id.btn_tdlib_viewLogs);
            }
        }
    }

    @SuppressLint({"ResourceType"})
    public final void m31210ni(final String str) {
        ArrayList arrayList = new ArrayList(7);
        final C4868i.C4887r d1 = C4868i.m24726c2().m24719d1();
        final int h = d1.m24504h(str);
        int d = str != null ? d1.m24508d(str) : -1;
        if (str != null && (d <= 0 || d >= 6)) {
            arrayList.add(new C2964ra(13, d + 1, 0, m31197zh(d) + " (Default)", (int) R.id.btn_tdlib_verbosity, d == h));
        }
        int i = str != null ? 1 : 0;
        while (i < 7) {
            boolean z = i == 6;
            String zh = z ? "MORE" : m31197zh(i);
            if (str != null && i == d) {
                zh = zh + " (Default)";
            }
            String str2 = zh;
            int i2 = i + 1;
            arrayList.add(new C2964ra(z ? 4 : 13, i2, 0, str2, (int) R.id.btn_tdlib_verbosity, !z && i == h));
            i = i2;
        }
        C2964ra[] raVarArr = new C2964ra[arrayList.size()];
        arrayList.toArray(raVarArr);
        C9188f2 c = new C9188f2(R.id.btn_tdlib_verbosity).m9997p(raVarArr).m10003j(new AbstractC9323v4.AbstractC9343r() {
            @Override
            public final void mo1773l6(int i3, SparseIntArray sparseIntArray) {
                View$OnClickListenerC3209vr.this.m31236ai(d1, str, i3, sparseIntArray);
            }
        }).m10010c(false);
        c.m9999n(new AbstractC9323v4.AbstractC9337n() {
            @Override
            public final void mo3907a(View view, int i3, C2964ra raVar, TextView textView, C2546iq iqVar) {
                View$OnClickListenerC3209vr.this.m31230di(r2, str, h, d1, view, i3, raVar, textView, iqVar);
            }
        });
        final C9180e2[] e2VarArr = {m9206me(c)};
    }

    public final void m31208oi(final View view, final boolean z) {
        m31203th(z);
        if (this.f10715I0[z ? 1 : 0] == 0) {
            C1379j0.m37290z0("Log is empty", 0);
            return;
        }
        C5320c cVar = new C5320c(4);
        C5320c cVar2 = new C5320c(4);
        C5320c cVar3 = new C5320c(4);
        C5146u0 u0Var = new C5146u0(4);
        cVar.m23284a(R.id.btn_tdlib_viewLogs);
        cVar2.m23284a(R.drawable.baseline_visibility_24);
        cVar3.m23284a(1);
        u0Var.m23816a(R.string.Open);
        cVar.m23284a(R.id.btn_tdlib_shareLogs);
        C10930q6 q6Var = this.f30167b;
        cVar2.m23284a((q6Var == null || q6Var.m2930B4().m4680k1()) ? R.drawable.baseline_share_24 : R.drawable.baseline_forward_24);
        cVar3.m23284a(1);
        u0Var.m23816a(R.string.Share);
        cVar.m23284a(R.id.btn_saveFile);
        cVar2.m23284a(R.drawable.baseline_file_download_24);
        cVar3.m23284a(1);
        u0Var.m23816a(R.string.SaveToDownloads);
        cVar.m23284a(R.id.btn_tdlib_clearLogs);
        cVar2.m23284a(R.drawable.baseline_delete_24);
        cVar3.m23284a(2);
        u0Var.m23816a(R.string.Delete);
        m9261ee(C7389v0.m16565x0(C10536ab.m4796H0(z)) + " (" + C1363c0.m37423m(this.f10715I0[z]) + ")", cVar.m23280e(), u0Var.m23813d(), cVar3.m23280e(), cVar2.m23280e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view2, int i) {
                boolean fi;
                fi = View$OnClickListenerC3209vr.this.m31226fi(z, view, view2, i);
                return fi;
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
        int id2 = view.getId();
        switch (id2) {
            case R.id.btn_appLogs:
                View$OnClickListenerC3209vr vrVar = new View$OnClickListenerC3209vr(this.f30165a, this.f30167b);
                vrVar.m31218ji(new C3215f(0, this.f10712F0).m31194c(this.f10711E0));
                m9291ac(vrVar);
                return;
            case R.id.btn_debugSwitchRtl:
                this.f30165a.m14526W();
                return;
            case R.id.btn_eraseDatabase:
                if (this.f10723Q0) {
                    return;
                }
                if (this.f10712F0.f16673f != -1) {
                    this.f30167b.m2930B4().m4706d3(this.f10712F0.f16673f).m2485dd().m3713T2(this, false, new C3212c());
                    return;
                } else {
                    ((MainActivity) mo4347s()).m14644k4(C4403w.m27982H0(this, R.string.EraseDatabaseWarn, new Object[0]), C4403w.m27869i1(R.string.EraseConfirm), new AbstractC5918j() {
                        @Override
                        public final void mo1330a(Object obj) {
                            View$OnClickListenerC3209vr.this.m31276Gh((List) obj);
                        }
                    });
                    return;
                }
            case R.id.btn_launchApp:
                ((MainActivity) this.f30165a).m14641l5();
                return;
            case R.id.btn_shareError:
                C1405v.m37128O(m31200wh() + "\n" + this.f10712F0.f16669b);
                return;
            case R.id.btn_showError:
                AbstractC9323v4<?> k30Var = new k30(this.f30165a, this.f30167b);
                k30Var.m9476Ad(k30.C2608a.m34034g(m31200wh(), this.f10712F0.f16669b, "text/plain"));
                m9291ac(k30Var);
                return;
            case R.id.btn_switchRtl:
                C4868i.m24726c2().m24715d5(C4403w.m27860k2(), this.f10714H0.m34201W2(view));
                return;
            case R.id.btn_update:
                C1405v.m37139D();
                return;
            default:
                switch (id2) {
                    case R.id.btn_log_android:
                        Log.setSetting(1, ((C9137c) view).getToggler().m10184t(true));
                        return;
                    case R.id.btn_log_files:
                        AbstractC9323v4<?> jvVar = new View$OnClickListenerC2593jv(this.f30165a, this.f30167b);
                        jvVar.m9476Ad(new View$OnClickListenerC2593jv.C2595b(this.f10717K0));
                        m9291ac(jvVar);
                        return;
                    case R.id.btn_log_tags:
                        int length = Log.TAGS.length;
                        C2964ra[] raVarArr = new C2964ra[length];
                        for (int i = 0; i < length; i++) {
                            int i2 = Log.TAGS[i];
                            raVarArr[i] = new C2964ra(12, i2, 0, "[" + Log.getLogTag(i2) + "]: " + Log.getLogTagDescription(i2), Log.isEnabled(i2));
                        }
                        m9192oe(R.id.btn_log_tags, raVarArr, this, true);
                        return;
                    case R.id.btn_log_verbosity:
                        C2964ra[] raVarArr2 = new C2964ra[6];
                        int logLevel = Log.isCapturing() ? 5 : Log.getLogLevel();
                        int i3 = 0;
                        while (i3 < 6) {
                            int i4 = i3 + 1;
                            raVarArr2[i3] = new C2964ra(13, i4, 0, m31197zh(i3), (int) R.id.btn_log_verbosity, i3 == logLevel);
                            i3 = i4;
                        }
                        m9192oe(R.id.btn_log_verbosity, raVarArr2, this, false);
                        return;
                    default:
                        switch (id2) {
                            case R.id.btn_secret_copyLanguageCodes:
                                this.f30167b.m2270r4().m14783o(new TdApi.GetLocalizationTargetInfo(false), C2552ir.f8722a);
                                return;
                            case R.id.btn_secret_databaseStats:
                                AbstractC9323v4<?> k30Var2 = new k30(this.f30165a, this.f30167b);
                                k30Var2.m9476Ad(k30.C2608a.m34034g("App Database Stats", C4868i.m24726c2().m24637n3().m17962s("leveldb.stats") + "\n\nMemory usage: " + C4868i.m24726c2().m24637n3().m17962s("leveldb.approximate-memory-usage"), "text/plain"));
                                m9291ac(k30Var2);
                                return;
                            case R.id.btn_secret_debugQrRegions:
                                C4868i.m24726c2().m24879G5(this.f10714H0.m34201W2(view));
                                return;
                            case R.id.btn_secret_deleteContacts:
                                this.f30167b.m2946A4().m1413Y(true, new Runnable() {
                                    @Override
                                    public final void run() {
                                        View$OnClickListenerC3209vr.this.m31266Lh();
                                    }
                                });
                                return;
                            case R.id.btn_secret_deleteProfilePhoto:
                                TdApi.User Z9 = this.f30167b.m2550Z9();
                                if (!(Z9 == null || Z9.profilePhoto == null)) {
                                    this.f30167b.m2270r4().m14783o(new TdApi.DeleteFile(Z9.profilePhoto.small.f25373id), this.f30167b.m2392ja());
                                    this.f30167b.m2270r4().m14783o(new TdApi.DeleteFile(Z9.profilePhoto.big.f25373id), this.f30167b.m2392ja());
                                    return;
                                }
                                return;
                            case R.id.btn_secret_disableNetwork:
                                C4868i.m24726c2().m24558x4(this.f10714H0.m34201W2(view));
                                C10536ab.m4667o1().m4694g3().m28138o();
                                return;
                            case R.id.btn_secret_disableQrProcess:
                                C4868i.m24726c2().m24551y4(this.f10714H0.m34201W2(view));
                                return;
                            case R.id.btn_secret_dontReadMessages:
                                if (this.f10714H0.m34224N0(R.id.btn_secret_dontReadMessages) != -1) {
                                    boolean z = !C4868i.m24726c2().m24780V();
                                    C4868i.m24726c2().m24544z4(z);
                                    if (z != C4868i.m24726c2().m24780V()) {
                                        C1379j0.m37290z0("You can't enable that", 0);
                                        return;
                                    } else {
                                        this.f10714H0.m34130s3(R.id.btn_secret_dontReadMessages);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            case R.id.btn_secret_dropHidden:
                                this.f30167b.m2440ga().m3070v1(false);
                                return;
                            case R.id.btn_secret_dropSavedScrollPositions:
                                C4868i.m24726c2().m24818P3(this.f30167b.mo1484a(), null);
                                return;
                            case R.id.btn_secret_forceQrZxing:
                                C4868i.m24726c2().m24845L4(this.f10714H0.m34201W2(view));
                                return;
                            case R.id.btn_secret_forceTcpInCalls:
                                C4868i.m24726c2().m24859J4(this.f10714H0.m34201W2(view));
                                return;
                            case R.id.btn_secret_forceTdlibRestarts:
                                C10536ab.m4667o1().m4746T2(this.f10714H0.m34201W2(view));
                                return;
                            case R.id.btn_secret_qrTest:
                                m9380Nc(new AbstractC9323v4.C9334k().m9108c(true).m9106e(true).m9110a(false).m9105f(true).m9103h(true).m9107d(2).m9104g(C2940qq.f9782a));
                                return;
                            case R.id.btn_secret_readAllChats:
                                m9322Vd(C4403w.m27869i1(R.string.ReadAllChatsInfo), null, new Runnable() {
                                    @Override
                                    public final void run() {
                                        View$OnClickListenerC3209vr.this.m31256Qh();
                                    }
                                });
                                return;
                            case R.id.btn_secret_replacePhoneNumber:
                                C4868i.m24726c2().m24838M4(this.f10714H0.m34201W2(view));
                                return;
                            case R.id.btn_secret_resetLocalNotificationSettings:
                                this.f30167b.m2440ga().m3128g2(true);
                                return;
                            case R.id.btn_secret_resetTutorials:
                                C4868i.m24726c2().m24783U3();
                                C1379j0.m37290z0("Hints reset completed", 0);
                                return;
                            case R.id.btn_secret_sendAllChangeLogs:
                                this.f30167b.m2398j4(false, true);
                                return;
                            case R.id.btn_secret_stressTest:
                                m9364Pc("Stress test", "Restart count", R.string.Done, R.string.Cancel, "50", new C3214e(), true);
                                return;
                            case R.id.btn_secret_tdlibDatabaseStats:
                                C1379j0.m37290z0("Calculating. Please wait...", 0);
                                this.f30167b.m2270r4().m14783o(new TdApi.GetDatabaseStatistics(), new Client.AbstractC7865g() {
                                    @Override
                                    public final void mo255t2(TdApi.Object object) {
                                        View$OnClickListenerC3209vr.this.m31262Nh(object);
                                    }
                                });
                                return;
                            default:
                                switch (id2) {
                                    case R.id.btn_tdlib:
                                        m9290ad(this.f10711E0, this.f10712F0);
                                        return;
                                    case R.id.btn_tdlib_androidLogs:
                                        C4868i.m24726c2().m24719d1().m24495q(this.f10714H0.m34201W2(view));
                                        return;
                                    default:
                                        switch (id2) {
                                            case R.id.btn_tdlib_logSize:
                                                m9364Pc("Maximum Log Size", "Amount of bytes", R.string.Done, R.string.Cancel, String.valueOf(C4868i.m24726c2().m24719d1().m24507e()), new AbstractC9323v4.AbstractC9336m() {
                                                    @Override
                                                    public final boolean mo4197a(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
                                                        boolean Rh;
                                                        Rh = View$OnClickListenerC3209vr.this.m31254Rh(y1Var, str);
                                                        return Rh;
                                                    }
                                                }, true);
                                                return;
                                            case R.id.btn_tdlib_resetLogSettings:
                                                C4868i.m24726c2().m24719d1().m24500l();
                                                this.f10714H0.m34193Z2();
                                                C1379j0.m37290z0("Done. Restart is required for some changes to apply.", 0);
                                                return;
                                            default:
                                                switch (id2) {
                                                    case R.id.btn_tdlib_verbosity:
                                                        m31210ni((String) ((C2964ra) view.getTag()).m32844d());
                                                        return;
                                                    case R.id.btn_tdlib_viewLogs:
                                                        m31208oi(view, false);
                                                        return;
                                                    case R.id.btn_tdlib_viewLogsOld:
                                                        m31208oi(view, true);
                                                        return;
                                                    default:
                                                        switch (id2) {
                                                            case R.id.btn_test_crash1:
                                                                Tracer.m14767m("[SUCCESS] INDIRECT " + C5069h.m24079n(0, 10000));
                                                                return;
                                                            case R.id.btn_test_crash2:
                                                                Tracer.m14766n("[SUCCESS] DIRECT " + (-C5069h.m24079n(0, 10000)));
                                                                return;
                                                            case R.id.btn_test_crash3:
                                                                Tracer.m14765o("[SUCCESS] INDIRECT NATIVE " + C5069h.m24079n(0, 10000));
                                                                return;
                                                            case R.id.btn_test_crash4:
                                                                Tracer.m14764p("[SUCCESS] DIRECT NATIVE " + (-C5069h.m24079n(0, 10000)));
                                                                return;
                                                            case R.id.btn_test_crashDirect:
                                                                throw new RuntimeException("This is a default test");
                                                            case R.id.btn_test_crashDirectNative:
                                                                Tracer.m14763q("[SUCCESS] DIRECT THROW " + (-C5069h.m24079n(0, 10000)));
                                                                return;
                                                            case R.id.btn_test_database:
                                                                m31220ii(1, true);
                                                                return;
                                                            case R.id.btn_test_recovery_tdlib:
                                                                String x = ((C2964ra) view.getTag()).m32821x();
                                                                if (C5070i.m24061i(x)) {
                                                                    x = "some tdlib bug";
                                                                }
                                                                C4868i.m24726c2().m24767W5(this.f30167b.m2188w6(), x);
                                                                System.exit(0);
                                                                return;
                                                            case R.id.btn_testingUtils:
                                                                AbstractC5917i wqVar = new AbstractC5917i() {
                                                                    @Override
                                                                    public final void mo1322a(boolean z2) {
                                                                        View$OnClickListenerC3209vr.this.m31272Ih(z2);
                                                                    }
                                                                };
                                                                if (this.f10712F0 != null) {
                                                                    wqVar.mo1322a(true);
                                                                    return;
                                                                } else {
                                                                    m9172re(C4403w.m27982H0(this, R.string.TestModeWarn, new Object[0]), wqVar);
                                                                    return;
                                                                }
                                                            default:
                                                                return;
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getId() != R.id.btn_log_files || !this.f10718L0) {
            return false;
        }
        Log.C7879b bVar = this.f10717K0;
        if (bVar == null || bVar.m14707a()) {
            m31214li(Log.getLogFiles());
        }
        Log.C7879b bVar2 = this.f10717K0;
        if (bVar2 == null || bVar2.m14707a()) {
            return false;
        }
        m9261ee("Clear " + C1363c0.m37423m(this.f10717K0.f25454d) + "?", new int[]{R.id.btn_deleteAll, R.id.btn_cancel}, new String[]{"Delete all logs", "Cancel"}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view2, int i) {
                boolean Wh;
                Wh = View$OnClickListenerC3209vr.this.m31244Wh(view2, i);
                return Wh;
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
        return true;
    }

    @Override
    public boolean mo31074pg() {
        return true;
    }

    @Override
    public void mo30633rg(Context context, CustomRecyclerView customRecyclerView) {
        m31203th(false);
        boolean z = true;
        m31203th(true);
        if (this.f10713G0) {
            C9289s sVar = new C9289s(context);
            this.f10721O0 = sVar;
            sVar.setThemedTextColor(this);
            this.f10721O0.m9632D1(C1357a0.m37541i(18.0f), true);
            this.f10721O0.setTitle(mo9313X9());
            this.f10721O0.setSubtitle(m31200wh());
        }
        C3211b bVar = new C3211b(this);
        this.f10714H0 = bVar;
        bVar.m34238F2(this);
        ArrayList arrayList = new ArrayList();
        if (this.f10713G0) {
            int i = this.f10712F0.f16673f;
            if (i != -1) {
                C11131y6 U = C10536ab.m4664p1(i).m4745U(this.f10712F0.f16673f);
                if (U.m1460p() != null) {
                    arrayList.add(new C2964ra(57).m32870G(U));
                    arrayList.add(new C2964ra(3));
                }
            }
            if (this.f10712F0.m24531c() == 1 && !C5070i.m24061i(this.f10712F0.f16669b)) {
                arrayList.add(new C2964ra(9, 0, 0, (CharSequence) this.f10712F0.f16669b, false));
            }
            if (!arrayList.isEmpty()) {
                arrayList.add(new C2964ra(2));
            }
            arrayList.add(new C2964ra(4, R.id.btn_launchApp, R.drawable.baseline_warning_24, R.string.LaunchApp).m32843d0(R.id.theme_color_textNeutral));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(4, R.id.btn_update, R.drawable.baseline_system_update_24, R.string.LaunchAppCheckUpdate));
            if (this.f10710D0 != 2) {
                arrayList.add(new C2964ra(11));
                if (this.f10712F0.m24531c() == 2) {
                    arrayList.add(new C2964ra(4, R.id.btn_showError, R.drawable.baseline_info_24, R.string.LaunchAppViewError));
                } else {
                    arrayList.add(new C2964ra(4, R.id.btn_shareError, R.drawable.baseline_share_24, R.string.LaunchAppShareError));
                }
            }
            int c = this.f10712F0.m24531c();
            if (c == 1 || c == 4) {
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, R.id.btn_eraseDatabase, R.drawable.baseline_delete_forever_24, R.string.LaunchAppEraseDatabase).m32843d0(R.id.theme_color_textNegative));
            }
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(9, 0, 0, m31201vh(), false));
        }
        int i2 = this.f10710D0;
        if (i2 == 0) {
            if (arrayList.isEmpty()) {
                arrayList.add(new C2964ra(14));
            }
            arrayList.add(new C2964ra(8, 0, 0, (int) R.string.AppLogs, false));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(5, (int) R.id.btn_log_verbosity, 0, (int) R.string.DebugVerbosity, false));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(5, (int) R.id.btn_log_tags, 0, (int) R.string.DebugLogTags, false));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(5, (int) R.id.btn_log_files, 0, (int) R.string.DebugLogFiles, false));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(7, (int) R.id.btn_log_android, 0, (int) R.string.DebugLogcat, false));
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(9, 0, 0, C4403w.m27978I0(this, R.string.DebugAppLogsInfo, new Object[0]), false));
            if (this.f10712F0 == null) {
                arrayList.add(new C2964ra(8, 0, 0, R.string.Other));
                arrayList.add(new C2964ra(2));
                arrayList.add(new C2964ra(4, (int) R.id.btn_tdlib, 0, (int) R.string.TdlibLogs, false));
                arrayList.add(new C2964ra(3));
            }
        } else if (i2 == 1) {
            if (!arrayList.isEmpty()) {
                arrayList.add(new C2964ra(2));
            }
            int size = arrayList.size();
            C10930q6 q6Var = this.f30167b;
            if (q6Var != null && !q6Var.m2930B4().m4680k1()) {
                arrayList.add(new C2964ra(4, (int) R.id.btn_secret_readAllChats, 0, (int) R.string.ReadAllChats, false));
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, (int) R.id.btn_secret_tdlibDatabaseStats, 0, (CharSequence) "TDLib database statistics", false));
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, (int) R.id.btn_secret_databaseStats, 0, (CharSequence) "Other internal statistics", false));
                if (this.f10711E0 >= 3) {
                    arrayList.add(new C2964ra(11));
                    arrayList.add(new C2964ra(4, (int) R.id.btn_secret_stressTest, 0, (CharSequence) "Stress test TDLib restarts", false));
                }
                if (this.f10711E0 >= 3 || C4868i.m24726c2().m24720d0()) {
                    if (arrayList.size() > size) {
                        arrayList.add(new C2964ra(11));
                    }
                    arrayList.add(new C2964ra(7, (int) R.id.btn_secret_forceTdlibRestarts, 0, "Force TDLib restarts", C4868i.m24726c2().m24720d0()));
                }
                if (this.f10711E0 >= 4 && this.f30167b.m2848G6()) {
                    arrayList.add(new C2964ra(11));
                    arrayList.add(new C2964ra(4, (int) R.id.btn_secret_sendAllChangeLogs, 0, (CharSequence) "Send all change logs", false));
                }
                if (this.f10711E0 >= 5) {
                    arrayList.add(new C2964ra(11));
                    arrayList.add(new C2964ra(4, (int) R.id.btn_secret_copyLanguageCodes, 0, (CharSequence) "Copy language codes list", false));
                }
                TdApi.User Z9 = this.f30167b.m2550Z9();
                if (!(Z9 == null || Z9.profilePhoto == null)) {
                    arrayList.add(new C2964ra(11));
                    arrayList.add(new C2964ra(4, (int) R.id.btn_secret_deleteProfilePhoto, 0, (CharSequence) "Delete profile photo from cache", false));
                }
            }
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(4, (int) R.id.btn_secret_dropSavedScrollPositions, 0, (CharSequence) "Drop saved scroll positions", false));
            if (this.f10711E0 >= 5 || C4868i.m24726c2().m24780V()) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(7, (int) R.id.btn_secret_dontReadMessages, 0, (CharSequence) "Don't read messages", false));
            }
            if (arrayList.size() > size) {
                arrayList.add(new C2964ra(11));
            }
            arrayList.add(new C2964ra(4, (int) R.id.btn_secret_resetTutorials, 0, (CharSequence) "Reset tutorials", false));
            if (this.f30167b != null) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(4, (int) R.id.btn_secret_resetLocalNotificationSettings, 0, (CharSequence) "Reset local notification settings", false));
            }
            if (this.f30167b != null) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(4, (int) R.id.btn_secret_dropHidden, 0, (CharSequence) "Drop hidden notification identifiers", false));
            }
            if (this.f10711E0 >= 1 || C4868i.m24726c2().m24875H2()) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(7, (int) R.id.btn_secret_replacePhoneNumber, 0, "Hide phone number in drawer", C4868i.m24726c2().m24875H2()));
            }
            if (this.f10711E0 >= 1 || C4868i.m24726c2().m24728c0()) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(7, (int) R.id.btn_secret_forceTcpInCalls, 0, "Force TCP in calls", C4868i.m24726c2().m24728c0()));
            }
            if (this.f10711E0 >= 3 || C4868i.m24726c2().m24736b0()) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(7, (int) R.id.btn_secret_disableNetwork, 0, "Force disable network", C4868i.m24726c2().m24736b0()));
            }
            if (this.f10711E0 >= 3 || C4868i.m24726c2().m24903D2()) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(7, (int) R.id.btn_secret_disableQrProcess, 0, "Disable QR processing", C4868i.m24726c2().m24903D2()));
            }
            if (this.f10711E0 >= 3 || C4868i.m24726c2().m24896E2()) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(7, (int) R.id.btn_secret_forceQrZxing, 0, "Force ZXing in QR scanner", C4868i.m24726c2().m24896E2()));
            }
            if (this.f10711E0 >= 3 || C4868i.m24726c2().m24777V2()) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(7, (int) R.id.btn_secret_debugQrRegions, 0, "Show QR scanner UI regions", C4868i.m24726c2().m24896E2()));
            }
            if (this.f10711E0 >= 2) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(4, (int) R.id.btn_secret_qrTest, 0, (CharSequence) "Test QR scanner", false));
            }
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(8, 0, 0, (CharSequence) "Tests (crash when failed)", false));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(4, (int) R.id.btn_test_database, 0, (CharSequence) "Test database", false));
            if (this.f10711E0 >= 3) {
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, (int) R.id.btn_test_recovery_tdlib, 0, (CharSequence) "Crash & enter recovery mode (TDLib error)", false));
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, (int) R.id.btn_test_recovery_tdlib, 0, (CharSequence) "Crash & enter recovery mode (disk full)", false).m32847b0("database or disk is full"));
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, (int) R.id.btn_test_recovery_tdlib, 0, (CharSequence) "Crash & enter recovery mode (database broken)", false).m32847b0("Wrong key or database is corrupted"));
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, (int) R.id.btn_test_recovery_tdlib, 0, (CharSequence) "Crash & enter recovery mode (other external error)", false).m32847b0("I/O error"));
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, (int) R.id.btn_test_crash1, 0, (CharSequence) "Crash app (method 1, indirect)", false));
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, (int) R.id.btn_test_crash2, 0, (CharSequence) "Crash app (method 2, direct)", false));
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, (int) R.id.btn_test_crash3, 0, (CharSequence) "Crash app (method 3, native indirect)", false));
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, (int) R.id.btn_test_crash4, 0, (CharSequence) "Crash app (method 4, native direct)", false));
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, (int) R.id.btn_test_crashDirect, 0, (CharSequence) "Crash app (default)", false));
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, (int) R.id.btn_test_crashDirectNative, 0, (CharSequence) "Crash app (native)", false));
            }
            arrayList.add(new C2964ra(3));
        } else if (i2 == 2) {
            if (arrayList.isEmpty()) {
                arrayList.add(new C2964ra(14));
            }
            if (this.f10713G0) {
                arrayList.add(new C2964ra(2));
                arrayList.add(new C2964ra(4, R.id.btn_shareError, R.drawable.baseline_share_24, R.string.LaunchAppShareError).m32843d0(R.id.theme_color_textNegative));
                arrayList.add(new C2964ra(3));
            }
            arrayList.add(new C2964ra(8, 0, 0, (int) R.string.TdlibLogs, false));
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(92, (int) R.id.btn_tdlib_verbosity, 0, (int) R.string.DebugVerbosity, false));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(89, (int) R.id.btn_tdlib_logSize, 0, (int) R.string.DebugLogSize, false));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(89, (int) R.id.btn_tdlib_viewLogs, 0, (CharSequence) C10536ab.m4800G0(false).getName(), false));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(89, (int) R.id.btn_tdlib_viewLogsOld, 0, (CharSequence) C10536ab.m4800G0(true).getName(), false));
            C4868i.C4887r d1 = C4868i.m24726c2().m24719d1();
            if (this.f10711E0 >= 4 || d1.m24502j()) {
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(7, (int) R.id.btn_tdlib_androidLogs, 0, (int) R.string.DebugLogcatOnly, false));
            }
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(4, (int) R.id.btn_tdlib_resetLogSettings, 0, (int) R.string.DebugReset, false));
            arrayList.add(new C2964ra(3));
            List<String> f = d1.m24506f();
            if (f != null && !f.isEmpty()) {
                arrayList.add(new C2964ra(8, 0, 0, (int) R.string.DebugModules, false));
                for (String str : f) {
                    if (z) {
                        arrayList.add(new C2964ra(2));
                        z = false;
                    } else {
                        arrayList.add(new C2964ra(11));
                    }
                    arrayList.add(new C2964ra(92, (int) R.id.btn_tdlib_verbosity, 0, (CharSequence) str, false).m32870G(str));
                }
                arrayList.add(new C2964ra(3));
                arrayList.add(new C2964ra(9, 0, 0, C4403w.m27978I0(this, R.string.DebugModulesInfo, new Object[0]), false));
            }
            if (this.f10713G0) {
                arrayList.add(new C2964ra(2));
                arrayList.add(new C2964ra(4, (int) R.id.btn_testingUtils, 0, (int) R.string.TestMode, false));
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, (int) R.id.btn_appLogs, 0, (int) R.string.AppLogs, false));
                arrayList.add(new C2964ra(3));
            }
        } else if (i2 == 3) {
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(4, (int) R.id.btn_tdlib, 0, (int) R.string.TdlibLogs, false));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(4, (int) R.id.btn_appLogs, 0, (int) R.string.AppLogs, false));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(4, (int) R.id.btn_testingUtils, 0, (int) R.string.TestMode, false));
            arrayList.add(new C2964ra(3));
        }
        this.f10714H0.m34116x2(arrayList, false);
        if (this.f10710D0 == 0 && this.f30167b != null) {
            m31198yh();
            Log.addOutputListener(this);
            if (this.f10712F0 == null) {
                this.f30167b.m2476e6(new AbstractC5919k() {
                    @Override
                    public final void mo3250a(int i3) {
                        View$OnClickListenerC3209vr.this.m31250Th(i3);
                    }
                });
            }
        }
        customRecyclerView.setAdapter(this.f10714H0);
    }

    @Override
    public void mo9159tc() {
        super.mo9159tc();
        if (this.f10710D0 != 2) {
            return;
        }
        if (m9339Ta()) {
            C1379j0.m37332e0(new RunnableC3210a(), 1500L);
            return;
        }
        Runnable runnable = this.f10716J0;
        if (runnable != null) {
            C1379j0.m37330f0(runnable);
            this.f10716J0 = null;
        }
    }

    public final void m31203th(boolean z) {
        try {
            m31228ei(new File(C10536ab.m4796H0(z)).length(), z);
        } catch (Throwable unused) {
        }
    }

    public final void m31202uh() {
        Log.C7879b bVar;
        if (this.f10718L0 && (bVar = this.f10717K0) != null && !bVar.m14707a() && !this.f10720N0) {
            m31216ki(true);
            Log.deleteAll(this.f10717K0, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    View$OnClickListenerC3209vr.this.m31284Ch((Log.C7879b) obj);
                }
            }, null);
        }
    }

    public final CharSequence m31201vh() {
        int i;
        int c = this.f10712F0.m24531c();
        if (c == 1) {
            i = R.string.LaunchAppGuideTdlibIssue;
        } else if (c == 2) {
            i = R.string.LaunchAppGuideDiskFull;
        } else if (c == 3) {
            i = R.string.LaunchAppGuideExternalError;
        } else if (c != 4) {
            return null;
        } else {
            i = R.string.LaunchAppGuideDatabaseBroken;
        }
        return C4403w.m27978I0(this, i, m31199xh(), C7389v0.m16721J0());
    }

    public final String m31200wh() {
        int c = this.f10712F0.m24531c();
        if (c == 1) {
            return C4403w.m27865j1(R.string.LaunchSubtitleTdlibIssue, m31288Ah(true));
        }
        if (c == 2) {
            return C4403w.m27869i1(R.string.LaunchSubtitleDiskFull);
        }
        if (c == 3) {
            return C4403w.m27869i1(R.string.LaunchSubtitleExternalError);
        }
        if (c != 4) {
            return null;
        }
        return C4403w.m27869i1(R.string.LaunchSubtitleDatabaseBroken);
    }

    public final String m31199xh() {
        return C1363c0.m37423m(C7389v0.m16597p0());
    }

    public final void m31198yh() {
        if (m31224gi()) {
            this.f10719M0 = SystemClock.elapsedRealtime();
            Log.getLogFiles(new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    View$OnClickListenerC3209vr.this.m31280Eh((Log.C7879b) obj);
                }
            });
        }
    }

    public static class C3215f {
        public final int f10731a;
        public final C4868i.C4873e f10732b;
        public int f10733c;
        public boolean f10734d;

        public C3215f(C4868i.C4873e eVar) {
            this.f10733c = 0;
            this.f10732b = eVar;
            this.f10734d = true;
            if (eVar.m24531c() == 1) {
                this.f10731a = 2;
            } else {
                this.f10731a = 3;
            }
        }

        public C3215f m31194c(int i) {
            this.f10733c = i;
            return this;
        }

        public C3215f(int i, C4868i.C4873e eVar) {
            this.f10733c = 0;
            this.f10731a = i;
            this.f10732b = eVar;
        }
    }
}
