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
                View$OnClickListenerC3209vr.this.m31230ei(new File(C10536ab.m4796H0(false)).length(), false);
                View$OnClickListenerC3209vr.this.m31230ei(new File(C10536ab.m4796H0(true)).length(), true);
                C1379j0.m37335e0(this, 1500L);
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
                int j = raVar.m32838j();
                cVar.setIconColorId(j != R.id.btn_eraseDatabase ? j != R.id.btn_launchApp ? 0 : R.id.theme_color_iconActive : R.id.theme_color_iconNegative);
            }
            switch (raVar.m32838j()) {
                case R.id.btn_log_android:
                    cVar.getToggler().m10185r(Log.checkSetting(1), false);
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
                        cVar.setData(C4403w.m27846o2(R.string.xFiles, 0L));
                        return;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(C1363c0.m37426m(View$OnClickListenerC3209vr.this.f10717K0.f25457d));
                        if (View$OnClickListenerC3209vr.this.f10717K0.f25455b > 0) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(View$OnClickListenerC3209vr.this.f10717K0.f25455b);
                            sb2.append(" log");
                            if (View$OnClickListenerC3209vr.this.f10717K0.f25455b != 1) {
                                sb2.append('s');
                            }
                        }
                        if (View$OnClickListenerC3209vr.this.f10717K0.f25456c > 0) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(View$OnClickListenerC3209vr.this.f10717K0.f25456c);
                            sb2.append(" crash");
                            if (View$OnClickListenerC3209vr.this.f10717K0.f25456c != 1) {
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
                    cVar.setData(View$OnClickListenerC3209vr.m31199zh(isCapturing2 ? 5 : Log.getLogLevel()));
                    return;
                case R.id.btn_secret_debugQrRegions:
                    cVar.getToggler().m10185r(C4868i.m24727c2().m24778V2(), z);
                    return;
                case R.id.btn_secret_disableNetwork:
                    cVar.getToggler().m10185r(C4868i.m24727c2().m24737b0(), z);
                    return;
                case R.id.btn_secret_disableQrProcess:
                    cVar.getToggler().m10185r(C4868i.m24727c2().m24904D2(), z);
                    return;
                case R.id.btn_secret_dontReadMessages:
                    cVar.getToggler().m10185r(C4868i.m24727c2().m24781V(), z);
                    return;
                case R.id.btn_secret_forceQrZxing:
                    cVar.getToggler().m10185r(C4868i.m24727c2().m24897E2(), z);
                    return;
                case R.id.btn_secret_forceTcpInCalls:
                    cVar.getToggler().m10185r(C4868i.m24727c2().m24729c0(), z);
                    return;
                case R.id.btn_secret_forceTdlibRestarts:
                    cVar.getToggler().m10185r(C4868i.m24727c2().m24721d0(), z);
                    return;
                case R.id.btn_secret_replacePhoneNumber:
                    cVar.getToggler().m10185r(C4868i.m24727c2().m24876H2(), z);
                    return;
                case R.id.btn_switchRtl:
                    cVar.getToggler().m10185r(C4403w.m27986G2(), z);
                    return;
                case R.id.btn_tdlib_androidLogs:
                    cVar.getToggler().m10185r(C4868i.m24727c2().m24720d1().m24503j(), z);
                    return;
                case R.id.btn_tdlib_logSize:
                    cVar.setData(C1363c0.m37426m(C4868i.m24727c2().m24720d1().m24508e()));
                    return;
                case R.id.btn_tdlib_verbosity:
                    String str = (String) raVar.m32847d();
                    C4868i.C4887r d1 = C4868i.m24727c2().m24720d1();
                    int h = d1.m24505h(str);
                    if (str == null || h != d1.m24509d(str)) {
                        cVar.setData(View$OnClickListenerC3209vr.m31199zh(h));
                        C9139d toggler = cVar.getToggler();
                        if (str == null ? h > 0 : h <= d1.m24505h(null)) {
                            z4 = true;
                        }
                        toggler.m10185r(z4, z);
                        return;
                    }
                    cVar.setData("Default");
                    C9139d toggler2 = cVar.getToggler();
                    if (h <= d1.m24505h(null)) {
                        z3 = true;
                    }
                    toggler2.m10185r(z3, z);
                    return;
                case R.id.btn_tdlib_viewLogs:
                    cVar.setData(C1363c0.m37426m(View$OnClickListenerC3209vr.this.f10715I0[0]));
                    return;
                case R.id.btn_tdlib_viewLogsOld:
                    cVar.setData(C1363c0.m37426m(View$OnClickListenerC3209vr.this.f10715I0[1]));
                    return;
                default:
                    return;
            }
        }

        @Override
        public void mo9531c2(C2964ra raVar, int i, C6981o oVar) {
            oVar.setEnabled(false);
            C11131y6 y6Var = (C11131y6) raVar.m32847d();
            oVar.setTitle(y6Var.m1455u());
            oVar.m18194g1(y6Var.m1463m(false), y6Var.m1462n());
            oVar.setSubtitle(C4403w.m27871i1(R.string.LaunchAppUserSubtitle));
        }
    }

    public class C3212c implements HandlerC10770jj.AbstractC10782l {
        public C3212c() {
        }

        @Override
        public void mo3341a() {
            View$OnClickListenerC3209vr.this.f10723Q0 = false;
            ((MainActivity) View$OnClickListenerC3209vr.this.f30168a).m14640m5();
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
                View$OnClickListenerC3209vr.this.m9284bc().m9748M().m9514B(false);
                if (!this.f10727a.get()) {
                    ((MainActivity) View$OnClickListenerC3209vr.this.f30168a).m14640m5();
                    C1379j0.m37295y0(R.string.EraseDatabaseDone, 0);
                    return;
                }
                C1379j0.m37295y0(R.string.EraseDatabaseError, 0);
            }
        }
    }

    public class C3214e implements AbstractC9323v4.AbstractC9336m {
        public C3214e() {
        }

        @Override
        public boolean mo4197a(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
            int s;
            if (!C5070i.m24058m(str) || (s = C5070i.m24052s(str)) <= 0 || View$OnClickListenerC3209vr.this.m9347Sa()) {
                return false;
            }
            if (View$OnClickListenerC3209vr.this.f30161T != null) {
                View$OnClickListenerC3209vr.this.f30161T.m9748M().m9507f();
            }
            View$OnClickListenerC3209vr.this.f30170b.m2134zc(s);
            return true;
        }
    }

    public View$OnClickListenerC3209vr(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m31288Bh() {
        if (!m9347Sa()) {
            m31216li(this.f10717K0);
            m31218ki(false);
        }
    }

    public void m31286Ch(Log.C7879b bVar) {
        if (!m9347Sa()) {
            C1379j0.m37337d0(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3209vr.this.m31288Bh();
                }
            });
        }
    }

    public void m31284Dh(Log.C7879b bVar) {
        if (!m9347Sa()) {
            m31216li(bVar);
        }
    }

    public void m31282Eh(final Log.C7879b bVar) {
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3209vr.this.m31284Dh(bVar);
            }
        });
    }

    public void m31280Fh(List list, boolean z) {
        if (z && !m9347Sa() && m9339Ta() && m9284bc() != null) {
            C1379j0.m37295y0(R.string.EraseDatabaseProgress, 0);
            m9284bc().m9748M().m9514B(true);
            this.f10723Q0 = true;
            ((C11131y6) list.remove(list.size() - 1)).mo1480c().m2509c5(new C3213d(new AtomicBoolean(), list));
        }
    }

    public void m31278Gh(final List list) {
        m9172re(C4403w.m27984H0(this, R.string.EraseDatabaseWarn2, new Object[0]), new AbstractC5917i() {
            @Override
            public final void mo1322a(boolean z) {
                View$OnClickListenerC3209vr.this.m31280Fh(list, z);
            }
        });
    }

    public void m31274Ih(boolean z) {
        if (z) {
            View$OnClickListenerC3209vr vrVar = new View$OnClickListenerC3209vr(this.f30168a, this.f30170b);
            vrVar.m31220ji(new C3215f(1, this.f10712F0).m31196c(this.f10711E0));
            m9291ac(vrVar);
        }
    }

    public static void m31272Jh(TdApi.Object object) {
        TdApi.LanguagePackInfo[] languagePackInfoArr;
        if (object instanceof TdApi.LocalizationTargetInfo) {
            StringBuilder sb2 = new StringBuilder();
            for (TdApi.LanguagePackInfo languagePackInfo : ((TdApi.LocalizationTargetInfo) object).languagePacks) {
                if (!languagePackInfo.isBeta && languagePackInfo.isOfficial) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append("'");
                    sb2.append(languagePackInfo.f25408id);
                    sb2.append("'");
                }
            }
            C1379j0.m37328i(sb2.toString(), R.string.CopiedText);
        }
    }

    public void m31270Kh() {
        this.f30170b.m2946A4().m1370u0(mo4347s(), false, null);
    }

    public void m31268Lh() {
        C1379j0.m37293z0("Contacts reset done", 0);
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3209vr.this.m31270Kh();
            }
        });
    }

    public void m31266Mh(TdApi.Object object) {
        if (!m9347Sa()) {
            k30 k30Var = new k30(this.f30168a, this.f30170b);
            k30Var.m9476Ad(k30.C2608a.m34037g("TDLib Database Stats", ((TdApi.DatabaseStatistics) object).statistics, "text/plain"));
            m9291ac(k30Var);
        }
    }

    public void m31264Nh(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
        } else if (constructor == -1123912880) {
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3209vr.this.m31266Mh(object);
                }
            });
        }
    }

    public static void m31262Oh(int i, int i2) {
        C1379j0.m37293z0(C4403w.m27846o2(R.string.ReadAllChatsDone, i + i2), 0);
    }

    public void m31260Ph(final int i) {
        this.f30170b.m2732Na(C7317b.f23228b, new AbstractC5919k() {
            @Override
            public final void mo3250a(int i2) {
                View$OnClickListenerC3209vr.m31262Oh(i, i2);
            }
        });
    }

    public void m31258Qh() {
        this.f30170b.m2732Na(C7317b.f23227a, new AbstractC5919k() {
            @Override
            public final void mo3250a(int i) {
                View$OnClickListenerC3209vr.this.m31260Ph(i);
            }
        });
    }

    public boolean m31256Rh(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        if (!C5070i.m24058m(str)) {
            return false;
        }
        long w = C5070i.m24048w(str);
        if (w < EnumC6459p.f20156b.mo20396b(1.0d)) {
            return false;
        }
        C4868i.m24727c2().m24720d1().m24497p(w);
        this.f10714H0.m34133s3(R.id.btn_tdlib_logSize);
        return true;
    }

    public void m31254Sh(int i) {
        int N0;
        if (!m9347Sa() && (N0 = this.f10714H0.m34227N0(R.id.btn_tdlib)) != -1) {
            if (i > 0) {
                int i2 = N0 + 1;
                this.f10714H0.m34243F0().add(i2, new C2964ra(11));
                int i3 = N0 + 2;
                this.f10714H0.m34243F0().add(i3, new C2964ra(4, (int) R.id.btn_testingUtils, 0, (int) R.string.TestMode, false));
                this.f10714H0.m39311M(i2, 2);
                if (i == 1) {
                    this.f10714H0.m34132t0(i3 + 2, new C2964ra(9, 0, 0, C1363c0.m37428l(this, "To unlock more Testing Utilities you have to be a member of @tgandroidtests.", null), false));
                    return;
                }
                return;
            }
            this.f10714H0.m34132t0(N0 + 2, new C2964ra(9, 0, 0, C1363c0.m37428l(this, "To unlock Testing Utilities you have to be subscribed to @tgx_android or be a member of @tgandroidtests.", null), false));
        }
    }

    public void m31252Th(final int i) {
        this.f10711E0 = i;
        this.f30170b.m2469ed(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3209vr.this.m31254Sh(i);
            }
        });
    }

    public void m31250Uh() {
        if (!m9347Sa()) {
            m31200yh();
        }
    }

    public void m31248Vh() {
        if (!m9347Sa()) {
            m31200yh();
        }
    }

    public boolean m31246Wh(View view, int i) {
        if (i != R.id.btn_deleteAll) {
            return true;
        }
        m31204uh();
        return true;
    }

    public static void m31244Xh(Runnable runnable) {
        try {
            C4897o.m24459o();
            C1379j0.m37337d0(runnable);
        } catch (Error e) {
            throw e;
        } catch (RuntimeException e2) {
        } catch (Throwable th) {
            throw new AssertionError(th);
        }
    }

    public void m31242Yh(int i, boolean z) {
        if (z) {
            m31222ii(i, false);
        }
    }

    public void m31240Zh() {
        if (!m9347Sa()) {
            m9387Md(false);
        }
        C1379j0.m37293z0("Test completed successfully", 0);
    }

    public void m31238ai(C4868i.C4887r rVar, String str, int i, SparseIntArray sparseIntArray) {
        rVar.m24495r(str, sparseIntArray.get(R.id.btn_tdlib_verbosity, 1) - 1);
        if (C5070i.m24062i(str)) {
            this.f10714H0.m34189b3(R.id.btn_tdlib_verbosity);
        } else {
            this.f10714H0.m34136r3(str);
        }
    }

    public boolean m31236bi(String str, C4868i.C4887r rVar, View$OnFocusChangeListenerC7069y1 y1Var, String str2) {
        int t;
        if (!C5070i.m24058m(str2) || (t = C5070i.m24051t(str2, -1)) < 0) {
            return false;
        }
        if (str != null && t < 1) {
            return false;
        }
        rVar.m24495r(str, t);
        if (C5070i.m24062i(str)) {
            this.f10714H0.m34133s3(R.id.btn_tdlib_verbosity);
        } else {
            this.f10714H0.m34136r3(str);
        }
        return true;
    }

    public void m31234ci(final String str, int i, final C4868i.C4887r rVar) {
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
                bi = View$OnClickListenerC3209vr.this.m31236bi(str, rVar, y1Var, str3);
                return bi;
            }
        }, true);
    }

    public void m31232di(C9180e2[] e2VarArr, final String str, final int i, final C4868i.C4887r rVar, View view, int i2, C2964ra raVar, TextView textView, C2546iq iqVar) {
        if (raVar.m32838j() == 7 && e2VarArr[0] != null && e2VarArr[0].f29644e != null && !e2VarArr[0].f29644e.m18446A2()) {
            e2VarArr[0].f29644e.m18408y2(true);
            C1379j0.m37335e0(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3209vr.this.m31234ci(str, i, rVar);
                }
            }, 200L);
        }
    }

    public boolean m31228fi(final boolean z, View view, View view2, int i) {
        switch (i) {
            case R.id.btn_saveFile:
                C4779t2.m25526e5(new File(C10536ab.m4796H0(z)), "text/plain");
                break;
            case R.id.btn_tdlib_clearLogs:
                HandlerC10770jj.m3793L2(z, new AbstractC5920l() {
                    @Override
                    public final void mo3050a(long j) {
                        View$OnClickListenerC3209vr.this.m31230ei(z, j);
                    }
                });
                break;
            case R.id.btn_tdlib_shareLogs:
                boolean z2 = false;
                if (C4868i.m24727c2().m24842M1().m24505h(null) != 0) {
                    mo4347s().m14584H3().m8985g(view).m8969F(this, this.f30170b, R.drawable.baseline_warning_24, C4403w.m27984H0(this, R.string.DebugShareError, new Object[0]));
                    break;
                } else {
                    C10930q6 q6Var = this.f30170b;
                    if (q6Var == null || q6Var.m2930B4().m4680k1()) {
                        z2 = true;
                    }
                    HandlerC10770jj.m3648Z7(this, z, z2);
                    break;
                }
                break;
            case R.id.btn_tdlib_viewLogs:
                k30 k30Var = new k30(this.f30168a, this.f30170b);
                k30Var.m9476Ad(k30.C2608a.m34038f("TDLib Log", C10536ab.m4796H0(z), "text/plain"));
                m9291ac(k30Var);
                break;
        }
        return true;
    }

    public static String m31199zh(int i) {
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

    public final String m31290Ah(boolean z) {
        C10930q6 q6Var = this.f30170b;
        String Vc = q6Var != null ? q6Var.m2607Vc() : null;
        StringBuilder sb2 = new StringBuilder();
        if (Vc == null) {
            Vc = "???";
        }
        sb2.append(Vc);
        sb2.append(z ? ".1507" : "");
        return sb2.toString();
    }

    @Override
    public void mo14706G6(int i, int i2, String str, Throwable th) {
        if (i2 <= 2 || m31226gi()) {
            C1379j0.m37337d0(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3209vr.this.m31248Vh();
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
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3209vr.this.m31250Uh();
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
            return C4403w.m27871i1(R.string.LaunchTitle);
        }
        int i = this.f10710D0;
        if (i == 0) {
            return "0.24.6.1507-arm64-v8a";
        }
        if (i == 1) {
            return C4403w.m27871i1(R.string.TestMode);
        }
        if (i == 2) {
            return "TDLib " + m31290Ah(false);
        }
        throw new AssertionError(this.f10710D0);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        Log.removeOutputListener(this);
    }

    public final boolean m31226gi() {
        Log.C7879b bVar;
        return this.f10719M0 == 0 || (this.f10718L0 && ((bVar = this.f10717K0) == null || bVar.m14707a() || SystemClock.elapsedRealtime() - this.f10719M0 >= 1000));
    }

    public final void m31224hi(final Runnable runnable) {
        C1379j0.m37293z0("Running tests, please do nothing and wait...", 0);
        C4383l.m28061a().m28060b(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3209vr.m31244Xh(runnable);
            }
        });
    }

    public final void m31222ii(final int i, boolean z) {
        if (this.f10722P0 == 0) {
            if (z) {
                m9172re("Test may take some time. Don't be scared if it crashes.\n\nWarning: don't do anything in the app while test is running.", new AbstractC5917i() {
                    @Override
                    public final void mo1322a(boolean z2) {
                        View$OnClickListenerC3209vr.this.m31242Yh(i, z2);
                    }
                });
                return;
            }
            m9387Md(true);
            Runnable trVar = new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3209vr.this.m31240Zh();
                }
            };
            this.f10722P0 = i;
            if (i != 1) {
                this.f10722P0 = 0;
            } else {
                m31224hi(trVar);
            }
        }
    }

    public void m31220ji(C3215f fVar) {
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

    public final void m31218ki(boolean z) {
        if (this.f10720N0 != z) {
            this.f10720N0 = z;
            this.f10714H0.m34133s3(R.id.btn_log_files);
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
                this.f10714H0.m34133s3(R.id.btn_log_tags);
                return;
            case R.id.btn_log_verbosity:
                Log.setLogLevel(sparseIntArray.get(R.id.btn_log_verbosity, 1) - 1);
                this.f10714H0.m34133s3(R.id.btn_log_verbosity);
                return;
            default:
                return;
        }
    }

    public final void m31216li(Log.C7879b bVar) {
        this.f10717K0 = bVar;
        this.f10718L0 = true;
        this.f10714H0.m34133s3(R.id.btn_log_files);
    }

    public final void m31230ei(long j, boolean z) {
        long[] jArr = this.f10715I0;
        if (jArr[z ? 1 : 0] != j) {
            jArr[z] = j;
            C2546iq iqVar = this.f10714H0;
            if (iqVar != null) {
                iqVar.m34133s3(z != 0 ? R.id.btn_tdlib_viewLogsOld : R.id.btn_tdlib_viewLogs);
            }
        }
    }

    @SuppressLint({"ResourceType"})
    public final void m31212ni(final String str) {
        ArrayList arrayList = new ArrayList(7);
        final C4868i.C4887r d1 = C4868i.m24727c2().m24720d1();
        final int h = d1.m24505h(str);
        int d = str != null ? d1.m24509d(str) : -1;
        if (str != null && (d <= 0 || d >= 6)) {
            arrayList.add(new C2964ra(13, d + 1, 0, m31199zh(d) + " (Default)", (int) R.id.btn_tdlib_verbosity, d == h));
        }
        int i = str != null ? 1 : 0;
        while (i < 7) {
            boolean z = i == 6;
            String zh = z ? "MORE" : m31199zh(i);
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
        C9188f2 c = new C9188f2(R.id.btn_tdlib_verbosity).m9996p(raVarArr).m10002j(new AbstractC9323v4.AbstractC9343r() {
            @Override
            public final void mo1773l6(int i3, SparseIntArray sparseIntArray) {
                View$OnClickListenerC3209vr.this.m31238ai(d1, str, i3, sparseIntArray);
            }
        }).m10009c(false);
        c.m9998n(new AbstractC9323v4.AbstractC9337n() {
            @Override
            public final void mo3907a(View view, int i3, C2964ra raVar, TextView textView, C2546iq iqVar) {
                View$OnClickListenerC3209vr.this.m31232di(r2, str, h, d1, view, i3, raVar, textView, iqVar);
            }
        });
        final C9180e2[] e2VarArr = {m9206me(c)};
    }

    public final void m31210oi(final View view, final boolean z) {
        m31205th(z);
        if (this.f10715I0[z ? 1 : 0] == 0) {
            C1379j0.m37293z0("Log is empty", 0);
            return;
        }
        C5320c cVar = new C5320c(4);
        C5320c cVar2 = new C5320c(4);
        C5320c cVar3 = new C5320c(4);
        C5146u0 u0Var = new C5146u0(4);
        cVar.m23285a(R.id.btn_tdlib_viewLogs);
        cVar2.m23285a(R.drawable.baseline_visibility_24);
        cVar3.m23285a(1);
        u0Var.m23817a(R.string.Open);
        cVar.m23285a(R.id.btn_tdlib_shareLogs);
        C10930q6 q6Var = this.f30170b;
        cVar2.m23285a((q6Var == null || q6Var.m2930B4().m4680k1()) ? R.drawable.baseline_share_24 : R.drawable.baseline_forward_24);
        cVar3.m23285a(1);
        u0Var.m23817a(R.string.Share);
        cVar.m23285a(R.id.btn_saveFile);
        cVar2.m23285a(R.drawable.baseline_file_download_24);
        cVar3.m23285a(1);
        u0Var.m23817a(R.string.SaveToDownloads);
        cVar.m23285a(R.id.btn_tdlib_clearLogs);
        cVar2.m23285a(R.drawable.baseline_delete_24);
        cVar3.m23285a(2);
        u0Var.m23817a(R.string.Delete);
        m9261ee(C7389v0.m16565x0(C10536ab.m4796H0(z)) + " (" + C1363c0.m37426m(this.f10715I0[z]) + ")", cVar.m23281e(), u0Var.m23814d(), cVar3.m23281e(), cVar2.m23281e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view2, int i) {
                boolean fi;
                fi = View$OnClickListenerC3209vr.this.m31228fi(z, view, view2, i);
                return fi;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23936a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23935b(this, i);
            }
        });
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        switch (id2) {
            case R.id.btn_appLogs:
                View$OnClickListenerC3209vr vrVar = new View$OnClickListenerC3209vr(this.f30168a, this.f30170b);
                vrVar.m31220ji(new C3215f(0, this.f10712F0).m31196c(this.f10711E0));
                m9291ac(vrVar);
                return;
            case R.id.btn_debugSwitchRtl:
                this.f30168a.m14525W();
                return;
            case R.id.btn_eraseDatabase:
                if (this.f10723Q0) {
                    return;
                }
                if (this.f10712F0.f16673f != -1) {
                    this.f30170b.m2930B4().m4706d3(this.f10712F0.f16673f).m2485dd().m3713T2(this, false, new C3212c());
                    return;
                } else {
                    ((MainActivity) mo4347s()).m14643l4(C4403w.m27984H0(this, R.string.EraseDatabaseWarn, new Object[0]), C4403w.m27871i1(R.string.EraseConfirm), new AbstractC5918j() {
                        @Override
                        public final void mo1330a(Object obj) {
                            View$OnClickListenerC3209vr.this.m31278Gh((List) obj);
                        }
                    });
                    return;
                }
            case R.id.btn_launchApp:
                ((MainActivity) this.f30168a).m14640m5();
                return;
            case R.id.btn_shareError:
                C1405v.m37131O(m31202wh() + "\n" + this.f10712F0.f16669b);
                return;
            case R.id.btn_showError:
                AbstractC9323v4<?> k30Var = new k30(this.f30168a, this.f30170b);
                k30Var.m9476Ad(k30.C2608a.m34037g(m31202wh(), this.f10712F0.f16669b, "text/plain"));
                m9291ac(k30Var);
                return;
            case R.id.btn_switchRtl:
                C4868i.m24727c2().m24716d5(C4403w.m27862k2(), this.f10714H0.m34204W2(view));
                return;
            case R.id.btn_update:
                C1405v.m37142D();
                return;
            default:
                switch (id2) {
                    case R.id.btn_log_android:
                        Log.setSetting(1, ((C9137c) view).getToggler().m10183t(true));
                        return;
                    case R.id.btn_log_files:
                        AbstractC9323v4<?> jvVar = new View$OnClickListenerC2593jv(this.f30168a, this.f30170b);
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
                            raVarArr2[i3] = new C2964ra(13, i4, 0, m31199zh(i3), (int) R.id.btn_log_verbosity, i3 == logLevel);
                            i3 = i4;
                        }
                        m9192oe(R.id.btn_log_verbosity, raVarArr2, this, false);
                        return;
                    default:
                        switch (id2) {
                            case R.id.btn_secret_copyLanguageCodes:
                                this.f30170b.m2270r4().m14783o(new TdApi.GetLocalizationTargetInfo(false), C2552ir.f8722a);
                                return;
                            case R.id.btn_secret_databaseStats:
                                AbstractC9323v4<?> k30Var2 = new k30(this.f30168a, this.f30170b);
                                k30Var2.m9476Ad(k30.C2608a.m34037g("App Database Stats", C4868i.m24727c2().m24638n3().m17962s("leveldb.stats") + "\n\nMemory usage: " + C4868i.m24727c2().m24638n3().m17962s("leveldb.approximate-memory-usage"), "text/plain"));
                                m9291ac(k30Var2);
                                return;
                            case R.id.btn_secret_debugQrRegions:
                                C4868i.m24727c2().m24880G5(this.f10714H0.m34204W2(view));
                                return;
                            case R.id.btn_secret_deleteContacts:
                                this.f30170b.m2946A4().m1413Y(true, new Runnable() {
                                    @Override
                                    public final void run() {
                                        View$OnClickListenerC3209vr.this.m31268Lh();
                                    }
                                });
                                return;
                            case R.id.btn_secret_deleteProfilePhoto:
                                TdApi.User Z9 = this.f30170b.m2550Z9();
                                if (!(Z9 == null || Z9.profilePhoto == null)) {
                                    this.f30170b.m2270r4().m14783o(new TdApi.DeleteFile(Z9.profilePhoto.small.f25376id), this.f30170b.m2392ja());
                                    this.f30170b.m2270r4().m14783o(new TdApi.DeleteFile(Z9.profilePhoto.big.f25376id), this.f30170b.m2392ja());
                                    return;
                                }
                                return;
                            case R.id.btn_secret_disableNetwork:
                                C4868i.m24727c2().m24559x4(this.f10714H0.m34204W2(view));
                                C10536ab.m4667o1().m4694g3().m28140o();
                                return;
                            case R.id.btn_secret_disableQrProcess:
                                C4868i.m24727c2().m24552y4(this.f10714H0.m34204W2(view));
                                return;
                            case R.id.btn_secret_dontReadMessages:
                                if (this.f10714H0.m34227N0(R.id.btn_secret_dontReadMessages) != -1) {
                                    boolean z = !C4868i.m24727c2().m24781V();
                                    C4868i.m24727c2().m24545z4(z);
                                    if (z != C4868i.m24727c2().m24781V()) {
                                        C1379j0.m37293z0("You can't enable that", 0);
                                        return;
                                    } else {
                                        this.f10714H0.m34133s3(R.id.btn_secret_dontReadMessages);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            case R.id.btn_secret_dropHidden:
                                this.f30170b.m2440ga().m3070v1(false);
                                return;
                            case R.id.btn_secret_dropSavedScrollPositions:
                                C4868i.m24727c2().m24819P3(this.f30170b.mo1484a(), null);
                                return;
                            case R.id.btn_secret_forceQrZxing:
                                C4868i.m24727c2().m24846L4(this.f10714H0.m34204W2(view));
                                return;
                            case R.id.btn_secret_forceTcpInCalls:
                                C4868i.m24727c2().m24860J4(this.f10714H0.m34204W2(view));
                                return;
                            case R.id.btn_secret_forceTdlibRestarts:
                                C10536ab.m4667o1().m4746T2(this.f10714H0.m34204W2(view));
                                return;
                            case R.id.btn_secret_qrTest:
                                m9380Nc(new AbstractC9323v4.C9334k().m9108c(true).m9106e(true).m9110a(false).m9105f(true).m9103h(true).m9107d(2).m9104g(C2940qq.f9782a));
                                return;
                            case R.id.btn_secret_readAllChats:
                                m9322Vd(C4403w.m27871i1(R.string.ReadAllChatsInfo), null, new Runnable() {
                                    @Override
                                    public final void run() {
                                        View$OnClickListenerC3209vr.this.m31258Qh();
                                    }
                                });
                                return;
                            case R.id.btn_secret_replacePhoneNumber:
                                C4868i.m24727c2().m24839M4(this.f10714H0.m34204W2(view));
                                return;
                            case R.id.btn_secret_resetLocalNotificationSettings:
                                this.f30170b.m2440ga().m3128g2(true);
                                return;
                            case R.id.btn_secret_resetTutorials:
                                C4868i.m24727c2().m24784U3();
                                C1379j0.m37293z0("Hints reset completed", 0);
                                return;
                            case R.id.btn_secret_sendAllChangeLogs:
                                this.f30170b.m2398j4(false, true);
                                return;
                            case R.id.btn_secret_stressTest:
                                m9364Pc("Stress test", "Restart count", R.string.Done, R.string.Cancel, "50", new C3214e(), true);
                                return;
                            case R.id.btn_secret_tdlibDatabaseStats:
                                C1379j0.m37293z0("Calculating. Please wait...", 0);
                                this.f30170b.m2270r4().m14783o(new TdApi.GetDatabaseStatistics(), new Client.AbstractC7865g() {
                                    @Override
                                    public final void mo255t2(TdApi.Object object) {
                                        View$OnClickListenerC3209vr.this.m31264Nh(object);
                                    }
                                });
                                return;
                            default:
                                switch (id2) {
                                    case R.id.btn_tdlib:
                                        m9290ad(this.f10711E0, this.f10712F0);
                                        return;
                                    case R.id.btn_tdlib_androidLogs:
                                        C4868i.m24727c2().m24720d1().m24496q(this.f10714H0.m34204W2(view));
                                        return;
                                    default:
                                        switch (id2) {
                                            case R.id.btn_tdlib_logSize:
                                                m9364Pc("Maximum Log Size", "Amount of bytes", R.string.Done, R.string.Cancel, String.valueOf(C4868i.m24727c2().m24720d1().m24508e()), new AbstractC9323v4.AbstractC9336m() {
                                                    @Override
                                                    public final boolean mo4197a(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
                                                        boolean Rh;
                                                        Rh = View$OnClickListenerC3209vr.this.m31256Rh(y1Var, str);
                                                        return Rh;
                                                    }
                                                }, true);
                                                return;
                                            case R.id.btn_tdlib_resetLogSettings:
                                                C4868i.m24727c2().m24720d1().m24501l();
                                                this.f10714H0.m34196Z2();
                                                C1379j0.m37293z0("Done. Restart is required for some changes to apply.", 0);
                                                return;
                                            default:
                                                switch (id2) {
                                                    case R.id.btn_tdlib_verbosity:
                                                        m31212ni((String) ((C2964ra) view.getTag()).m32847d());
                                                        return;
                                                    case R.id.btn_tdlib_viewLogs:
                                                        m31210oi(view, false);
                                                        return;
                                                    case R.id.btn_tdlib_viewLogsOld:
                                                        m31210oi(view, true);
                                                        return;
                                                    default:
                                                        switch (id2) {
                                                            case R.id.btn_test_crash1:
                                                                Tracer.m14767m("[SUCCESS] INDIRECT " + C5069h.m24080n(0, 10000));
                                                                return;
                                                            case R.id.btn_test_crash2:
                                                                Tracer.m14766n("[SUCCESS] DIRECT " + (-C5069h.m24080n(0, 10000)));
                                                                return;
                                                            case R.id.btn_test_crash3:
                                                                Tracer.m14765o("[SUCCESS] INDIRECT NATIVE " + C5069h.m24080n(0, 10000));
                                                                return;
                                                            case R.id.btn_test_crash4:
                                                                Tracer.m14764p("[SUCCESS] DIRECT NATIVE " + (-C5069h.m24080n(0, 10000)));
                                                                return;
                                                            case R.id.btn_test_crashDirect:
                                                                throw new RuntimeException("This is a default test");
                                                            case R.id.btn_test_crashDirectNative:
                                                                Tracer.m14763q("[SUCCESS] DIRECT THROW " + (-C5069h.m24080n(0, 10000)));
                                                                return;
                                                            case R.id.btn_test_database:
                                                                m31222ii(1, true);
                                                                return;
                                                            case R.id.btn_test_recovery_tdlib:
                                                                String x = ((C2964ra) view.getTag()).m32824x();
                                                                if (C5070i.m24062i(x)) {
                                                                    x = "some tdlib bug";
                                                                }
                                                                C4868i.m24727c2().m24768W5(this.f30170b.m2188w6(), x);
                                                                System.exit(0);
                                                                return;
                                                            case R.id.btn_testingUtils:
                                                                AbstractC5917i wqVar = new AbstractC5917i() {
                                                                    @Override
                                                                    public final void mo1322a(boolean z2) {
                                                                        View$OnClickListenerC3209vr.this.m31274Ih(z2);
                                                                    }
                                                                };
                                                                if (this.f10712F0 != null) {
                                                                    wqVar.mo1322a(true);
                                                                    return;
                                                                } else {
                                                                    m9172re(C4403w.m27984H0(this, R.string.TestModeWarn, new Object[0]), wqVar);
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
            m31216li(Log.getLogFiles());
        }
        Log.C7879b bVar2 = this.f10717K0;
        if (bVar2 == null || bVar2.m14707a()) {
            return false;
        }
        m9261ee("Clear " + C1363c0.m37426m(this.f10717K0.f25457d) + "?", new int[]{R.id.btn_deleteAll, R.id.btn_cancel}, new String[]{"Delete all logs", "Cancel"}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view2, int i) {
                boolean Wh;
                Wh = View$OnClickListenerC3209vr.this.m31246Wh(view2, i);
                return Wh;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23936a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23935b(this, i);
            }
        });
        return true;
    }

    @Override
    public boolean mo31076pg() {
        return true;
    }

    @Override
    public void mo30635rg(Context context, CustomRecyclerView customRecyclerView) {
        m31205th(false);
        boolean z = true;
        m31205th(true);
        if (this.f10713G0) {
            C9289s sVar = new C9289s(context);
            this.f10721O0 = sVar;
            sVar.setThemedTextColor(this);
            this.f10721O0.m9631D1(C1357a0.m37544i(18.0f), true);
            this.f10721O0.setTitle(mo9313X9());
            this.f10721O0.setSubtitle(m31202wh());
        }
        C3211b bVar = new C3211b(this);
        this.f10714H0 = bVar;
        bVar.m34241F2(this);
        ArrayList arrayList = new ArrayList();
        if (this.f10713G0) {
            int i = this.f10712F0.f16673f;
            if (i != -1) {
                C11131y6 U = C10536ab.m4664p1(i).m4745U(this.f10712F0.f16673f);
                if (U.m1460p() != null) {
                    arrayList.add(new C2964ra(57).m32873G(U));
                    arrayList.add(new C2964ra(3));
                }
            }
            if (this.f10712F0.m24532c() == 1 && !C5070i.m24062i(this.f10712F0.f16669b)) {
                arrayList.add(new C2964ra(9, 0, 0, (CharSequence) this.f10712F0.f16669b, false));
            }
            if (!arrayList.isEmpty()) {
                arrayList.add(new C2964ra(2));
            }
            arrayList.add(new C2964ra(4, R.id.btn_launchApp, R.drawable.baseline_warning_24, R.string.LaunchApp).m32846d0(R.id.theme_color_textNeutral));
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(4, R.id.btn_update, R.drawable.baseline_system_update_24, R.string.LaunchAppCheckUpdate));
            if (this.f10710D0 != 2) {
                arrayList.add(new C2964ra(11));
                if (this.f10712F0.m24532c() == 2) {
                    arrayList.add(new C2964ra(4, R.id.btn_showError, R.drawable.baseline_info_24, R.string.LaunchAppViewError));
                } else {
                    arrayList.add(new C2964ra(4, R.id.btn_shareError, R.drawable.baseline_share_24, R.string.LaunchAppShareError));
                }
            }
            int c = this.f10712F0.m24532c();
            if (c == 1 || c == 4) {
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, R.id.btn_eraseDatabase, R.drawable.baseline_delete_forever_24, R.string.LaunchAppEraseDatabase).m32846d0(R.id.theme_color_textNegative));
            }
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(9, 0, 0, m31203vh(), false));
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
            arrayList.add(new C2964ra(9, 0, 0, C4403w.m27980I0(this, R.string.DebugAppLogsInfo, new Object[0]), false));
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
            C10930q6 q6Var = this.f30170b;
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
                if (this.f10711E0 >= 3 || C4868i.m24727c2().m24721d0()) {
                    if (arrayList.size() > size) {
                        arrayList.add(new C2964ra(11));
                    }
                    arrayList.add(new C2964ra(7, (int) R.id.btn_secret_forceTdlibRestarts, 0, "Force TDLib restarts", C4868i.m24727c2().m24721d0()));
                }
                if (this.f10711E0 >= 4 && this.f30170b.m2848G6()) {
                    arrayList.add(new C2964ra(11));
                    arrayList.add(new C2964ra(4, (int) R.id.btn_secret_sendAllChangeLogs, 0, (CharSequence) "Send all change logs", false));
                }
                if (this.f10711E0 >= 5) {
                    arrayList.add(new C2964ra(11));
                    arrayList.add(new C2964ra(4, (int) R.id.btn_secret_copyLanguageCodes, 0, (CharSequence) "Copy language codes list", false));
                }
                TdApi.User Z9 = this.f30170b.m2550Z9();
                if (!(Z9 == null || Z9.profilePhoto == null)) {
                    arrayList.add(new C2964ra(11));
                    arrayList.add(new C2964ra(4, (int) R.id.btn_secret_deleteProfilePhoto, 0, (CharSequence) "Delete profile photo from cache", false));
                }
            }
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(4, (int) R.id.btn_secret_dropSavedScrollPositions, 0, (CharSequence) "Drop saved scroll positions", false));
            if (this.f10711E0 >= 5 || C4868i.m24727c2().m24781V()) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(7, (int) R.id.btn_secret_dontReadMessages, 0, (CharSequence) "Don't read messages", false));
            }
            if (arrayList.size() > size) {
                arrayList.add(new C2964ra(11));
            }
            arrayList.add(new C2964ra(4, (int) R.id.btn_secret_resetTutorials, 0, (CharSequence) "Reset tutorials", false));
            if (this.f30170b != null) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(4, (int) R.id.btn_secret_resetLocalNotificationSettings, 0, (CharSequence) "Reset local notification settings", false));
            }
            if (this.f30170b != null) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(4, (int) R.id.btn_secret_dropHidden, 0, (CharSequence) "Drop hidden notification identifiers", false));
            }
            if (this.f10711E0 >= 1 || C4868i.m24727c2().m24876H2()) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(7, (int) R.id.btn_secret_replacePhoneNumber, 0, "Hide phone number in drawer", C4868i.m24727c2().m24876H2()));
            }
            if (this.f10711E0 >= 1 || C4868i.m24727c2().m24729c0()) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(7, (int) R.id.btn_secret_forceTcpInCalls, 0, "Force TCP in calls", C4868i.m24727c2().m24729c0()));
            }
            if (this.f10711E0 >= 3 || C4868i.m24727c2().m24737b0()) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(7, (int) R.id.btn_secret_disableNetwork, 0, "Force disable network", C4868i.m24727c2().m24737b0()));
            }
            if (this.f10711E0 >= 3 || C4868i.m24727c2().m24904D2()) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(7, (int) R.id.btn_secret_disableQrProcess, 0, "Disable QR processing", C4868i.m24727c2().m24904D2()));
            }
            if (this.f10711E0 >= 3 || C4868i.m24727c2().m24897E2()) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(7, (int) R.id.btn_secret_forceQrZxing, 0, "Force ZXing in QR scanner", C4868i.m24727c2().m24897E2()));
            }
            if (this.f10711E0 >= 3 || C4868i.m24727c2().m24778V2()) {
                if (arrayList.size() > size) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(7, (int) R.id.btn_secret_debugQrRegions, 0, "Show QR scanner UI regions", C4868i.m24727c2().m24897E2()));
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
                arrayList.add(new C2964ra(4, (int) R.id.btn_test_recovery_tdlib, 0, (CharSequence) "Crash & enter recovery mode (disk full)", false).m32850b0("database or disk is full"));
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, (int) R.id.btn_test_recovery_tdlib, 0, (CharSequence) "Crash & enter recovery mode (database broken)", false).m32850b0("Wrong key or database is corrupted"));
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(4, (int) R.id.btn_test_recovery_tdlib, 0, (CharSequence) "Crash & enter recovery mode (other external error)", false).m32850b0("I/O error"));
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
                arrayList.add(new C2964ra(4, R.id.btn_shareError, R.drawable.baseline_share_24, R.string.LaunchAppShareError).m32846d0(R.id.theme_color_textNegative));
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
            C4868i.C4887r d1 = C4868i.m24727c2().m24720d1();
            if (this.f10711E0 >= 4 || d1.m24503j()) {
                arrayList.add(new C2964ra(11));
                arrayList.add(new C2964ra(7, (int) R.id.btn_tdlib_androidLogs, 0, (int) R.string.DebugLogcatOnly, false));
            }
            arrayList.add(new C2964ra(11));
            arrayList.add(new C2964ra(4, (int) R.id.btn_tdlib_resetLogSettings, 0, (int) R.string.DebugReset, false));
            arrayList.add(new C2964ra(3));
            List<String> f = d1.m24507f();
            if (f != null && !f.isEmpty()) {
                arrayList.add(new C2964ra(8, 0, 0, (int) R.string.DebugModules, false));
                for (String str : f) {
                    if (z) {
                        arrayList.add(new C2964ra(2));
                        z = false;
                    } else {
                        arrayList.add(new C2964ra(11));
                    }
                    arrayList.add(new C2964ra(92, (int) R.id.btn_tdlib_verbosity, 0, (CharSequence) str, false).m32873G(str));
                }
                arrayList.add(new C2964ra(3));
                arrayList.add(new C2964ra(9, 0, 0, C4403w.m27980I0(this, R.string.DebugModulesInfo, new Object[0]), false));
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
        this.f10714H0.m34119x2(arrayList, false);
        if (this.f10710D0 == 0 && this.f30170b != null) {
            m31200yh();
            Log.addOutputListener(this);
            if (this.f10712F0 == null) {
                this.f30170b.m2476e6(new AbstractC5919k() {
                    @Override
                    public final void mo3250a(int i3) {
                        View$OnClickListenerC3209vr.this.m31252Th(i3);
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
            C1379j0.m37335e0(new RunnableC3210a(), 1500L);
            return;
        }
        Runnable runnable = this.f10716J0;
        if (runnable != null) {
            C1379j0.m37333f0(runnable);
            this.f10716J0 = null;
        }
    }

    public final void m31205th(boolean z) {
        try {
            m31230ei(new File(C10536ab.m4796H0(z)).length(), z);
        } catch (Throwable unused) {
        }
    }

    public final void m31204uh() {
        Log.C7879b bVar;
        if (this.f10718L0 && (bVar = this.f10717K0) != null && !bVar.m14707a() && !this.f10720N0) {
            m31218ki(true);
            Log.deleteAll(this.f10717K0, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    View$OnClickListenerC3209vr.this.m31286Ch((Log.C7879b) obj);
                }
            }, null);
        }
    }

    public final CharSequence m31203vh() {
        int i;
        int c = this.f10712F0.m24532c();
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
        return C4403w.m27980I0(this, i, m31201xh(), C7389v0.m16721J0());
    }

    public final String m31202wh() {
        int c = this.f10712F0.m24532c();
        if (c == 1) {
            return C4403w.m27867j1(R.string.LaunchSubtitleTdlibIssue, m31290Ah(true));
        }
        if (c == 2) {
            return C4403w.m27871i1(R.string.LaunchSubtitleDiskFull);
        }
        if (c == 3) {
            return C4403w.m27871i1(R.string.LaunchSubtitleExternalError);
        }
        if (c != 4) {
            return null;
        }
        return C4403w.m27871i1(R.string.LaunchSubtitleDatabaseBroken);
    }

    public final String m31201xh() {
        return C1363c0.m37426m(C7389v0.m16597p0());
    }

    public final void m31200yh() {
        if (m31226gi()) {
            this.f10719M0 = SystemClock.elapsedRealtime();
            Log.getLogFiles(new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    View$OnClickListenerC3209vr.this.m31282Eh((Log.C7879b) obj);
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
            if (eVar.m24532c() == 1) {
                this.f10731a = 2;
            } else {
                this.f10731a = 3;
            }
        }

        public C3215f m31196c(int i) {
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
