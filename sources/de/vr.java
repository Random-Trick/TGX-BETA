package de;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import ce.a0;
import ce.c0;
import ce.j0;
import ce.v;
import de.kv;
import de.l30;
import gd.w;
import hd.t2;
import he.i;
import ib.h;
import ie.g0;
import ie.h0;
import ie.u0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kb.j;
import kb.k;
import kb.l;
import mb.p;
import ne.o;
import ne.y1;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.drinkmore.Tracer;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.MainActivity;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.e2;
import ud.f2;
import ud.s;
import ud.v4;
import zd.hj;
import zd.o6;
import zd.w6;
import zd.ya;

public class vr extends vo<f> implements View.OnClickListener, v4.r, View.OnLongClickListener, Log.c {
    public i.e F0;
    public boolean G0;
    public iq H0;
    public Runnable J0;
    public Log.b K0;
    public boolean L0;
    public long M0;
    public boolean N0;
    public s O0;
    public int P0;
    public boolean Q0;
    public int D0 = 0;
    public int E0 = 0;
    public final long[] I0 = new long[2];

    public class a implements Runnable {
        public a() {
        }

        @Override
        public void run() {
            if (vr.this.Ta()) {
                vr.this.ei(new File(ya.H0(false)).length(), false);
                vr.this.ei(new File(ya.H0(true)).length(), true);
                j0.e0(this, 1500L);
            }
        }
    }

    public class b extends iq {
        public b(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void R2(ra raVar, uc.c cVar, boolean z10) {
            int[] iArr;
            boolean z11 = false;
            boolean z12 = false;
            r1 = false;
            boolean z13 = false;
            z11 = false;
            z11 = false;
            z11 = false;
            z11 = false;
            if (vr.this.G0) {
                int j10 = raVar.j();
                cVar.setIconColorId(j10 != R.id.btn_eraseDatabase ? j10 != R.id.btn_launchApp ? 0 : R.id.theme_color_iconActive : R.id.theme_color_iconNegative);
            }
            switch (raVar.j()) {
                case R.id.btn_log_android:
                    cVar.getToggler().r(Log.checkSetting(1), false);
                    return;
                case R.id.btn_log_files:
                    if (!Log.isCapturing() && vr.this.L0 && !vr.this.N0 && vr.this.K0 != null && !vr.this.K0.a()) {
                        z11 = true;
                    }
                    if (z10) {
                        cVar.setEnabledAnimated(z11);
                    } else {
                        cVar.setEnabled(z11);
                    }
                    if (!vr.this.L0) {
                        cVar.setData(R.string.LoadingInformation);
                        return;
                    } else if (vr.this.K0 == null || vr.this.K0.a()) {
                        cVar.setData(w.o2(R.string.xFiles, 0L));
                        return;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(c0.m(vr.this.K0.f19993d));
                        if (vr.this.K0.f19991b > 0) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(vr.this.K0.f19991b);
                            sb2.append(" log");
                            if (vr.this.K0.f19991b != 1) {
                                sb2.append('s');
                            }
                        }
                        if (vr.this.K0.f19992c > 0) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(vr.this.K0.f19992c);
                            sb2.append(" crash");
                            if (vr.this.K0.f19992c != 1) {
                                sb2.append("es");
                            }
                        }
                        cVar.setData(sb2.toString());
                        return;
                    }
                case R.id.btn_log_tags:
                    boolean isCapturing = Log.isCapturing();
                    if (z10) {
                        cVar.setEnabledAnimated(!isCapturing);
                    } else {
                        cVar.setEnabled(!isCapturing);
                    }
                    StringBuilder sb3 = new StringBuilder();
                    for (int i10 : Log.TAGS) {
                        if (Log.isEnabled(i10)) {
                            if (sb3.length() > 0) {
                                sb3.append(", ");
                            }
                            sb3.append(Log.getLogTag(i10));
                        }
                    }
                    if (sb3.length() == 0) {
                        sb3.append("None");
                    }
                    cVar.setData(sb3.toString());
                    return;
                case R.id.btn_log_verbosity:
                    boolean isCapturing2 = Log.isCapturing();
                    if (z10) {
                        cVar.setEnabledAnimated(!isCapturing2);
                    } else {
                        cVar.setEnabled(!isCapturing2);
                    }
                    cVar.setData(vr.zh(isCapturing2 ? 5 : Log.getLogLevel()));
                    return;
                case R.id.btn_secret_debugQrRegions:
                    cVar.getToggler().r(i.c2().V2(), z10);
                    return;
                case R.id.btn_secret_disableNetwork:
                    cVar.getToggler().r(i.c2().b0(), z10);
                    return;
                case R.id.btn_secret_disableQrProcess:
                    cVar.getToggler().r(i.c2().D2(), z10);
                    return;
                case R.id.btn_secret_dontReadMessages:
                    cVar.getToggler().r(i.c2().V(), z10);
                    return;
                case R.id.btn_secret_forceQrZxing:
                    cVar.getToggler().r(i.c2().E2(), z10);
                    return;
                case R.id.btn_secret_forceTcpInCalls:
                    cVar.getToggler().r(i.c2().c0(), z10);
                    return;
                case R.id.btn_secret_forceTdlibRestarts:
                    cVar.getToggler().r(i.c2().d0(), z10);
                    return;
                case R.id.btn_secret_replacePhoneNumber:
                    cVar.getToggler().r(i.c2().H2(), z10);
                    return;
                case R.id.btn_switchRtl:
                    cVar.getToggler().r(w.G2(), z10);
                    return;
                case R.id.btn_tdlib_androidLogs:
                    cVar.getToggler().r(i.c2().d1().j(), z10);
                    return;
                case R.id.btn_tdlib_logSize:
                    cVar.setData(c0.m(i.c2().d1().e()));
                    return;
                case R.id.btn_tdlib_verbosity:
                    String str = (String) raVar.d();
                    i.r d12 = i.c2().d1();
                    int h10 = d12.h(str);
                    if (str == null || h10 != d12.d(str)) {
                        cVar.setData(vr.zh(h10));
                        uc.d toggler = cVar.getToggler();
                        if (str == null ? h10 > 0 : h10 <= d12.h(null)) {
                            z13 = true;
                        }
                        toggler.r(z13, z10);
                        return;
                    }
                    cVar.setData("Default");
                    uc.d toggler2 = cVar.getToggler();
                    if (h10 <= d12.h(null)) {
                        z12 = true;
                    }
                    toggler2.r(z12, z10);
                    return;
                case R.id.btn_tdlib_viewLogs:
                    cVar.setData(c0.m(vr.this.I0[0]));
                    return;
                case R.id.btn_tdlib_viewLogsOld:
                    cVar.setData(c0.m(vr.this.I0[1]));
                    return;
                default:
                    return;
            }
        }

        @Override
        public void Y1(ra raVar, int i10, o oVar) {
            oVar.setEnabled(false);
            w6 w6Var = (w6) raVar.d();
            oVar.setTitle(w6Var.u());
            oVar.m1(w6Var.m(false), w6Var.n());
            oVar.setSubtitle(w.i1(R.string.LaunchAppUserSubtitle));
        }
    }

    public class c implements hj.l {
        public c() {
        }

        @Override
        public void a() {
            vr.this.Q0 = false;
            ((MainActivity) vr.this.f24493a).o5();
        }

        @Override
        public void b() {
            vr.this.Q0 = true;
        }
    }

    public class d implements kb.i {
        public final AtomicBoolean f9867a;
        public final List f9868b;

        public d(AtomicBoolean atomicBoolean, List list) {
            this.f9867a = atomicBoolean;
            this.f9868b = list;
        }

        @Override
        public void a(boolean z10) {
            if (!z10) {
                this.f9867a.set(true);
            }
            if (!this.f9868b.isEmpty()) {
                List list = this.f9868b;
                ((w6) list.remove(list.size() - 1)).c().g5(this);
                return;
            }
            vr.this.Q0 = false;
            if (!vr.this.Sa() && vr.this.bc() != null) {
                vr.this.bc().M().B(false);
                if (!this.f9867a.get()) {
                    ((MainActivity) vr.this.f24493a).o5();
                    j0.y0(R.string.EraseDatabaseDone, 0);
                    return;
                }
                j0.y0(R.string.EraseDatabaseError, 0);
            }
        }
    }

    public class e implements v4.m {
        public e() {
        }

        @Override
        public boolean a(y1 y1Var, String str) {
            int s10;
            if (!ib.i.m(str) || (s10 = ib.i.s(str)) <= 0 || vr.this.Sa()) {
                return false;
            }
            if (vr.this.T != null) {
                vr.this.T.M().f();
            }
            vr.this.f24495b.Dc(s10);
            return true;
        }
    }

    public vr(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Bh() {
        if (!Sa()) {
            li(this.K0);
            ki(false);
        }
    }

    public void Ch(Log.b bVar) {
        if (!Sa()) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    vr.this.Bh();
                }
            });
        }
    }

    public void Dh(Log.b bVar) {
        if (!Sa()) {
            li(bVar);
        }
    }

    public void Eh(final Log.b bVar) {
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                vr.this.Dh(bVar);
            }
        });
    }

    public void Fh(List list, boolean z10) {
        if (z10 && !Sa() && Ta() && bc() != null) {
            j0.y0(R.string.EraseDatabaseProgress, 0);
            bc().M().B(true);
            this.Q0 = true;
            ((w6) list.remove(list.size() - 1)).c().g5(new d(new AtomicBoolean(), list));
        }
    }

    public void Gh(final List list) {
        re(w.H0(this, R.string.EraseDatabaseWarn2, new Object[0]), new kb.i() {
            @Override
            public final void a(boolean z10) {
                vr.this.Fh(list, z10);
            }
        });
    }

    public void Ih(boolean z10) {
        if (z10) {
            vr vrVar = new vr(this.f24493a, this.f24495b);
            vrVar.ji(new f(1, this.F0).c(this.E0));
            ac(vrVar);
        }
    }

    public static void Jh(TdApi.Object object) {
        TdApi.LanguagePackInfo[] languagePackInfoArr;
        if (object instanceof TdApi.LocalizationTargetInfo) {
            StringBuilder sb2 = new StringBuilder();
            for (TdApi.LanguagePackInfo languagePackInfo : ((TdApi.LocalizationTargetInfo) object).languagePacks) {
                if (!languagePackInfo.isBeta && languagePackInfo.isOfficial) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append("'");
                    sb2.append(languagePackInfo.f19945id);
                    sb2.append("'");
                }
            }
            j0.i(sb2.toString(), R.string.CopiedText);
        }
    }

    public void Kh() {
        this.f24495b.E4().u0(t(), false, null);
    }

    public void Lh() {
        j0.z0("Contacts reset done", 0);
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                vr.this.Kh();
            }
        });
    }

    public void Mh(TdApi.Object object) {
        if (!Sa()) {
            l30 l30Var = new l30(this.f24493a, this.f24495b);
            l30Var.Ad(l30.a.g("TDLib Database Stats", ((TdApi.DatabaseStatistics) object).statistics, "text/plain"));
            ac(l30Var);
        }
    }

    public void Nh(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -1123912880) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    vr.this.Mh(object);
                }
            });
        }
    }

    public static void Oh(int i10, int i11) {
        j0.z0(w.o2(R.string.ReadAllChatsDone, i10 + i11), 0);
    }

    public void Ph(final int i10) {
        this.f24495b.Ra(ob.b.f19339b, new k() {
            @Override
            public final void a(int i11) {
                vr.Oh(i10, i11);
            }
        });
    }

    public void Qh() {
        this.f24495b.Ra(ob.b.f19338a, new k() {
            @Override
            public final void a(int i10) {
                vr.this.Ph(i10);
            }
        });
    }

    public boolean Rh(y1 y1Var, String str) {
        if (!ib.i.m(str)) {
            return false;
        }
        long w10 = ib.i.w(str);
        if (w10 < p.f17345b.b(1.0d)) {
            return false;
        }
        i.c2().d1().p(w10);
        this.H0.p3(R.id.btn_tdlib_logSize);
        return true;
    }

    public void Sh(int i10) {
        int L0;
        if (!Sa() && (L0 = this.H0.L0(R.id.btn_tdlib)) != -1) {
            if (i10 > 0) {
                int i11 = L0 + 1;
                this.H0.D0().add(i11, new ra(11));
                int i12 = L0 + 2;
                this.H0.D0().add(i12, new ra(4, (int) R.id.btn_testingUtils, 0, (int) R.string.TestMode, false));
                this.H0.M(i11, 2);
                if (i10 == 1) {
                    this.H0.s0(i12 + 2, new ra(9, 0, 0, c0.l(this, "To unlock more Testing Utilities you have to be a member of @tgandroidtests.", null), false));
                    return;
                }
                return;
            }
            this.H0.s0(L0 + 2, new ra(9, 0, 0, c0.l(this, "To unlock Testing Utilities you have to be subscribed to @tgx_android or be a member of @tgandroidtests.", null), false));
        }
    }

    public void Th(final int i10) {
        this.E0 = i10;
        this.f24495b.id(new Runnable() {
            @Override
            public final void run() {
                vr.this.Sh(i10);
            }
        });
    }

    public void Uh() {
        if (!Sa()) {
            yh();
        }
    }

    public void Vh() {
        if (!Sa()) {
            yh();
        }
    }

    public boolean Wh(View view, int i10) {
        if (i10 != R.id.btn_deleteAll) {
            return true;
        }
        uh();
        return true;
    }

    public static void Xh(Runnable runnable) {
        try {
            he.o.o();
            j0.d0(runnable);
        } catch (Error e10) {
            throw e10;
        } catch (RuntimeException e11) {
        } catch (Throwable th) {
            throw new AssertionError(th);
        }
    }

    public void Yh(int i10, boolean z10) {
        if (z10) {
            ii(i10, false);
        }
    }

    public void Zh() {
        if (!Sa()) {
            Md(false);
        }
        j0.z0("Test completed successfully", 0);
    }

    public void ai(i.r rVar, String str, int i10, SparseIntArray sparseIntArray) {
        rVar.r(str, sparseIntArray.get(R.id.btn_tdlib_verbosity, 1) - 1);
        if (ib.i.i(str)) {
            this.H0.Y2(R.id.btn_tdlib_verbosity);
        } else {
            this.H0.o3(str);
        }
    }

    public boolean bi(String str, i.r rVar, y1 y1Var, String str2) {
        int t10;
        if (!ib.i.m(str2) || (t10 = ib.i.t(str2, -1)) < 0) {
            return false;
        }
        if (str != null && t10 < 1) {
            return false;
        }
        rVar.r(str, t10);
        if (ib.i.i(str)) {
            this.H0.p3(R.id.btn_tdlib_verbosity);
        } else {
            this.H0.o3(str);
        }
        return true;
    }

    public void ci(final String str, int i10, final i.r rVar) {
        String str2 = str != null ? str : "Verbosity Level";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Integer ");
        sb2.append(str != null ? 1 : 0);
        sb2.append("..");
        sb2.append(Integer.MAX_VALUE);
        String sb3 = sb2.toString();
        if (i10 == -1) {
            i10 = 0;
        }
        Pc(str2, sb3, R.string.Save, R.string.Cancel, Integer.toString(i10), new v4.m() {
            @Override
            public final boolean a(y1 y1Var, String str3) {
                boolean bi;
                bi = vr.this.bi(str, rVar, y1Var, str3);
                return bi;
            }
        }, true);
    }

    public void di(e2[] e2VarArr, final String str, final int i10, final i.r rVar, View view, int i11, ra raVar, TextView textView, iq iqVar) {
        if (raVar.j() == 7 && e2VarArr[0] != null && e2VarArr[0].f24138e != null && !e2VarArr[0].f24138e.u2()) {
            e2VarArr[0].f24138e.s2(true);
            j0.e0(new Runnable() {
                @Override
                public final void run() {
                    vr.this.ci(str, i10, rVar);
                }
            }, 200L);
        }
    }

    public boolean fi(final boolean z10, View view, View view2, int i10) {
        switch (i10) {
            case R.id.btn_saveFile:
                t2.e5(new File(ya.H0(z10)), "text/plain");
                break;
            case R.id.btn_tdlib_clearLogs:
                hj.L2(z10, new l() {
                    @Override
                    public final void a(long j10) {
                        vr.this.ei(z10, j10);
                    }
                });
                break;
            case R.id.btn_tdlib_shareLogs:
                boolean z11 = false;
                if (i.c2().M1().h(null) != 0) {
                    t().I3().g(view).F(this, this.f24495b, R.drawable.baseline_warning_24, w.H0(this, R.string.DebugShareError, new Object[0]));
                    break;
                } else {
                    o6 o6Var = this.f24495b;
                    if (o6Var == null || o6Var.F4().k1()) {
                        z11 = true;
                    }
                    hj.Z7(this, z10, z11);
                    break;
                }
                break;
            case R.id.btn_tdlib_viewLogs:
                l30 l30Var = new l30(this.f24493a, this.f24495b);
                l30Var.Ad(l30.a.f("TDLib Log", ya.H0(z10), "text/plain"));
                ac(l30Var);
                break;
        }
        return true;
    }

    public static String zh(int i10) {
        switch (i10) {
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
                return "MORE:" + i10;
        }
    }

    @Override
    public int A9() {
        if (this.G0) {
            return 4;
        }
        return super.A9();
    }

    public final String Ah(boolean z10) {
        o6 o6Var = this.f24495b;
        String Zc = o6Var != null ? o6Var.Zc() : null;
        StringBuilder sb2 = new StringBuilder();
        if (Zc == null) {
            Zc = "???";
        }
        sb2.append(Zc);
        sb2.append(z10 ? ".1519" : "");
        return sb2.toString();
    }

    @Override
    public void D6(int i10, int i11, String str, Throwable th) {
        if (i11 <= 2 || gi()) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    vr.this.Vh();
                }
            });
        }
    }

    @Override
    public View G9() {
        return this.O0;
    }

    @Override
    public void Q6() {
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                vr.this.Uh();
            }
        });
    }

    @Override
    public int R9() {
        return R.id.controller_bug_killer;
    }

    @Override
    public CharSequence X9() {
        if (this.G0) {
            return w.i1(R.string.LaunchTitle);
        }
        int i10 = this.D0;
        if (i10 == 0) {
            return "0.24.8.1519-arm64-v8a";
        }
        if (i10 == 1) {
            return w.i1(R.string.TestMode);
        }
        if (i10 == 2) {
            return "TDLib " + Ah(false);
        }
        throw new AssertionError(this.D0);
    }

    @Override
    public void Z8() {
        super.Z8();
        Log.removeOutputListener(this);
    }

    public final boolean gi() {
        Log.b bVar;
        return this.M0 == 0 || (this.L0 && ((bVar = this.K0) == null || bVar.a() || SystemClock.elapsedRealtime() - this.M0 >= 1000));
    }

    public final void hi(final Runnable runnable) {
        j0.z0("Running tests, please do nothing and wait...", 0);
        gd.l.a().b(new Runnable() {
            @Override
            public final void run() {
                vr.Xh(runnable);
            }
        });
    }

    public final void ii(final int i10, boolean z10) {
        if (this.P0 == 0) {
            if (z10) {
                re("Test may take some time. Don't be scared if it crashes.\n\nWarning: don't do anything in the app while test is running.", new kb.i() {
                    @Override
                    public final void a(boolean z11) {
                        vr.this.Yh(i10, z11);
                    }
                });
                return;
            }
            Md(true);
            Runnable trVar = new Runnable() {
                @Override
                public final void run() {
                    vr.this.Zh();
                }
            };
            this.P0 = i10;
            if (i10 != 1) {
                this.P0 = 0;
            } else {
                hi(trVar);
            }
        }
    }

    public void ji(f fVar) {
        super.Ad(fVar);
        boolean z10 = false;
        this.D0 = fVar != null ? fVar.f9871a : 0;
        this.E0 = fVar != null ? fVar.f9873c : 0;
        this.F0 = fVar != null ? fVar.f9872b : null;
        if (fVar != null && fVar.f9874d) {
            z10 = true;
        }
        this.G0 = z10;
    }

    public final void ki(boolean z10) {
        if (this.N0 != z10) {
            this.N0 = z10;
            this.H0.p3(R.id.btn_log_files);
        }
    }

    @Override
    public void l6(int i10, SparseIntArray sparseIntArray) {
        switch (i10) {
            case R.id.btn_log_tags:
                long j10 = 0;
                int size = sparseIntArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    j10 |= sparseIntArray.keyAt(i11);
                }
                Log.setEnabledTags(j10);
                this.H0.p3(R.id.btn_log_tags);
                return;
            case R.id.btn_log_verbosity:
                Log.setLogLevel(sparseIntArray.get(R.id.btn_log_verbosity, 1) - 1);
                this.H0.p3(R.id.btn_log_verbosity);
                return;
            default:
                return;
        }
    }

    public final void li(Log.b bVar) {
        this.K0 = bVar;
        this.L0 = true;
        this.H0.p3(R.id.btn_log_files);
    }

    public final void ei(long j10, boolean z10) {
        long[] jArr = this.I0;
        if (jArr[z10 ? 1 : 0] != j10) {
            jArr[z10] = j10;
            iq iqVar = this.H0;
            if (iqVar != null) {
                iqVar.p3(z10 != 0 ? R.id.btn_tdlib_viewLogsOld : R.id.btn_tdlib_viewLogs);
            }
        }
    }

    @SuppressLint({"ResourceType"})
    public final void ni(final String str) {
        ArrayList arrayList = new ArrayList(7);
        final i.r d12 = i.c2().d1();
        final int h10 = d12.h(str);
        int d10 = str != null ? d12.d(str) : -1;
        if (str != null && (d10 <= 0 || d10 >= 6)) {
            arrayList.add(new ra(13, d10 + 1, 0, zh(d10) + " (Default)", (int) R.id.btn_tdlib_verbosity, d10 == h10));
        }
        int i10 = str != null ? 1 : 0;
        while (i10 < 7) {
            boolean z10 = i10 == 6;
            String zh = z10 ? "MORE" : zh(i10);
            if (str != null && i10 == d10) {
                zh = zh + " (Default)";
            }
            String str2 = zh;
            int i11 = i10 + 1;
            arrayList.add(new ra(z10 ? 4 : 13, i11, 0, str2, (int) R.id.btn_tdlib_verbosity, !z10 && i10 == h10));
            i10 = i11;
        }
        ra[] raVarArr = new ra[arrayList.size()];
        arrayList.toArray(raVarArr);
        f2 c10 = new f2(R.id.btn_tdlib_verbosity).p(raVarArr).j(new v4.r() {
            @Override
            public final void l6(int i12, SparseIntArray sparseIntArray) {
                vr.this.ai(d12, str, i12, sparseIntArray);
            }
        }).c(false);
        c10.n(new v4.n() {
            @Override
            public final void a(View view, int i12, ra raVar, TextView textView, iq iqVar) {
                vr.this.di(r2, str, h10, d12, view, i12, raVar, textView, iqVar);
            }
        });
        final e2[] e2VarArr = {me(c10)};
    }

    public final void oi(final View view, final boolean z10) {
        th(z10);
        if (this.I0[z10 ? 1 : 0] == 0) {
            j0.z0("Log is empty", 0);
            return;
        }
        jb.c cVar = new jb.c(4);
        jb.c cVar2 = new jb.c(4);
        jb.c cVar3 = new jb.c(4);
        u0 u0Var = new u0(4);
        cVar.a(R.id.btn_tdlib_viewLogs);
        cVar2.a(R.drawable.baseline_visibility_24);
        cVar3.a(1);
        u0Var.a(R.string.Open);
        cVar.a(R.id.btn_tdlib_shareLogs);
        o6 o6Var = this.f24495b;
        cVar2.a((o6Var == null || o6Var.F4().k1()) ? R.drawable.baseline_share_24 : R.drawable.baseline_forward_24);
        cVar3.a(1);
        u0Var.a(R.string.Share);
        cVar.a(R.id.btn_saveFile);
        cVar2.a(R.drawable.baseline_file_download_24);
        cVar3.a(1);
        u0Var.a(R.string.SaveToDownloads);
        cVar.a(R.id.btn_tdlib_clearLogs);
        cVar2.a(R.drawable.baseline_delete_24);
        cVar3.a(2);
        u0Var.a(R.string.Delete);
        ee(v0.x0(ya.H0(z10)) + " (" + c0.m(this.I0[z10]) + ")", cVar.e(), u0Var.d(), cVar3.e(), cVar2.e(), new h0() {
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
                boolean fi;
                fi = vr.this.fi(z10, view, view2, i10);
                return fi;
            }
        });
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        switch (id2) {
            case R.id.btn_appLogs:
                vr vrVar = new vr(this.f24493a, this.f24495b);
                vrVar.ji(new f(0, this.F0).c(this.E0));
                ac(vrVar);
                return;
            case R.id.btn_debugSwitchRtl:
                this.f24493a.Y();
                return;
            case R.id.btn_eraseDatabase:
                if (this.Q0) {
                    return;
                }
                if (this.F0.f13855f != -1) {
                    this.f24495b.F4().d3(this.F0.f13855f).hd().T2(this, false, new c());
                    return;
                } else {
                    ((MainActivity) t()).p4(w.H0(this, R.string.EraseDatabaseWarn, new Object[0]), w.i1(R.string.EraseConfirm), new j() {
                        @Override
                        public final void a(Object obj) {
                            vr.this.Gh((List) obj);
                        }
                    });
                    return;
                }
            case R.id.btn_launchApp:
                ((MainActivity) this.f24493a).o5();
                return;
            case R.id.btn_shareError:
                v.N(wh() + "\n" + this.F0.f13851b);
                return;
            case R.id.btn_showError:
                v4<?> l30Var = new l30(this.f24493a, this.f24495b);
                l30Var.Ad(l30.a.g(wh(), this.F0.f13851b, "text/plain"));
                ac(l30Var);
                return;
            case R.id.btn_switchRtl:
                i.c2().d5(w.k2(), this.H0.S2(view));
                return;
            case R.id.btn_update:
                v.D();
                return;
            default:
                switch (id2) {
                    case R.id.btn_log_android:
                        Log.setSetting(1, ((uc.c) view).getToggler().t(true));
                        return;
                    case R.id.btn_log_files:
                        v4<?> kvVar = new kv(this.f24493a, this.f24495b);
                        kvVar.Ad(new kv.b(this.K0));
                        ac(kvVar);
                        return;
                    case R.id.btn_log_tags:
                        int length = Log.TAGS.length;
                        ra[] raVarArr = new ra[length];
                        for (int i10 = 0; i10 < length; i10++) {
                            int i11 = Log.TAGS[i10];
                            raVarArr[i10] = new ra(12, i11, 0, "[" + Log.getLogTag(i11) + "]: " + Log.getLogTagDescription(i11), Log.isEnabled(i11));
                        }
                        oe(R.id.btn_log_tags, raVarArr, this, true);
                        return;
                    case R.id.btn_log_verbosity:
                        ra[] raVarArr2 = new ra[6];
                        int logLevel = Log.isCapturing() ? 5 : Log.getLogLevel();
                        int i12 = 0;
                        while (i12 < 6) {
                            int i13 = i12 + 1;
                            raVarArr2[i12] = new ra(13, i13, 0, zh(i12), (int) R.id.btn_log_verbosity, i12 == logLevel);
                            i12 = i13;
                        }
                        oe(R.id.btn_log_verbosity, raVarArr2, this, false);
                        return;
                    default:
                        switch (id2) {
                            case R.id.btn_secret_copyLanguageCodes:
                                this.f24495b.v4().o(new TdApi.GetLocalizationTargetInfo(false), ir.f8330a);
                                return;
                            case R.id.btn_secret_databaseStats:
                                v4<?> l30Var2 = new l30(this.f24493a, this.f24495b);
                                l30Var2.Ad(l30.a.g("App Database Stats", i.c2().n3().s("leveldb.stats") + "\n\nMemory usage: " + i.c2().n3().s("leveldb.approximate-memory-usage"), "text/plain"));
                                ac(l30Var2);
                                return;
                            case R.id.btn_secret_debugQrRegions:
                                i.c2().G5(this.H0.S2(view));
                                return;
                            case R.id.btn_secret_deleteContacts:
                                this.f24495b.E4().Y(true, new Runnable() {
                                    @Override
                                    public final void run() {
                                        vr.this.Lh();
                                    }
                                });
                                return;
                            case R.id.btn_secret_deleteProfilePhoto:
                                TdApi.User da2 = this.f24495b.da();
                                if (!(da2 == null || da2.profilePhoto == null)) {
                                    this.f24495b.v4().o(new TdApi.DeleteFile(da2.profilePhoto.small.f19913id), this.f24495b.na());
                                    this.f24495b.v4().o(new TdApi.DeleteFile(da2.profilePhoto.big.f19913id), this.f24495b.na());
                                    return;
                                }
                                return;
                            case R.id.btn_secret_disableNetwork:
                                i.c2().x4(this.H0.S2(view));
                                ya.o1().g3().o();
                                return;
                            case R.id.btn_secret_disableQrProcess:
                                i.c2().y4(this.H0.S2(view));
                                return;
                            case R.id.btn_secret_dontReadMessages:
                                if (this.H0.L0(R.id.btn_secret_dontReadMessages) != -1) {
                                    boolean z10 = !i.c2().V();
                                    i.c2().z4(z10);
                                    if (z10 != i.c2().V()) {
                                        j0.z0("You can't enable that", 0);
                                        return;
                                    } else {
                                        this.H0.p3(R.id.btn_secret_dontReadMessages);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            case R.id.btn_secret_dropHidden:
                                this.f24495b.ka().v1(false);
                                return;
                            case R.id.btn_secret_dropSavedScrollPositions:
                                i.c2().P3(this.f24495b.a(), null);
                                return;
                            case R.id.btn_secret_forceQrZxing:
                                i.c2().L4(this.H0.S2(view));
                                return;
                            case R.id.btn_secret_forceTcpInCalls:
                                i.c2().J4(this.H0.S2(view));
                                return;
                            case R.id.btn_secret_forceTdlibRestarts:
                                ya.o1().T2(this.H0.S2(view));
                                return;
                            case R.id.btn_secret_qrTest:
                                Nc(new v4.k().c(true).e(true).a(false).f(true).h(true).d(2).g(qq.f9184a));
                                return;
                            case R.id.btn_secret_readAllChats:
                                Vd(w.i1(R.string.ReadAllChatsInfo), null, new Runnable() {
                                    @Override
                                    public final void run() {
                                        vr.this.Qh();
                                    }
                                });
                                return;
                            case R.id.btn_secret_replacePhoneNumber:
                                i.c2().M4(this.H0.S2(view));
                                return;
                            case R.id.btn_secret_resetLocalNotificationSettings:
                                this.f24495b.ka().g2(true);
                                return;
                            case R.id.btn_secret_resetTutorials:
                                i.c2().U3();
                                j0.z0("Hints reset completed", 0);
                                return;
                            case R.id.btn_secret_sendAllChangeLogs:
                                this.f24495b.n4(false, true);
                                return;
                            case R.id.btn_secret_stressTest:
                                Pc("Stress test", "Restart count", R.string.Done, R.string.Cancel, "50", new e(), true);
                                return;
                            case R.id.btn_secret_tdlibDatabaseStats:
                                j0.z0("Calculating. Please wait...", 0);
                                this.f24495b.v4().o(new TdApi.GetDatabaseStatistics(), new Client.g() {
                                    @Override
                                    public final void r2(TdApi.Object object) {
                                        vr.this.Nh(object);
                                    }
                                });
                                return;
                            default:
                                switch (id2) {
                                    case R.id.btn_tdlib:
                                        ad(this.E0, this.F0);
                                        return;
                                    case R.id.btn_tdlib_androidLogs:
                                        i.c2().d1().q(this.H0.S2(view));
                                        return;
                                    default:
                                        switch (id2) {
                                            case R.id.btn_tdlib_logSize:
                                                Pc("Maximum Log Size", "Amount of bytes", R.string.Done, R.string.Cancel, String.valueOf(i.c2().d1().e()), new v4.m() {
                                                    @Override
                                                    public final boolean a(y1 y1Var, String str) {
                                                        boolean Rh;
                                                        Rh = vr.this.Rh(y1Var, str);
                                                        return Rh;
                                                    }
                                                }, true);
                                                return;
                                            case R.id.btn_tdlib_resetLogSettings:
                                                i.c2().d1().l();
                                                this.H0.V2();
                                                j0.z0("Done. Restart is required for some changes to apply.", 0);
                                                return;
                                            default:
                                                switch (id2) {
                                                    case R.id.btn_tdlib_verbosity:
                                                        ni((String) ((ra) view.getTag()).d());
                                                        return;
                                                    case R.id.btn_tdlib_viewLogs:
                                                        oi(view, false);
                                                        return;
                                                    case R.id.btn_tdlib_viewLogsOld:
                                                        oi(view, true);
                                                        return;
                                                    default:
                                                        switch (id2) {
                                                            case R.id.btn_test_crash1:
                                                                Tracer.m("[SUCCESS] INDIRECT " + h.n(0, 10000));
                                                                return;
                                                            case R.id.btn_test_crash2:
                                                                Tracer.n("[SUCCESS] DIRECT " + (-h.n(0, 10000)));
                                                                return;
                                                            case R.id.btn_test_crash3:
                                                                Tracer.o("[SUCCESS] INDIRECT NATIVE " + h.n(0, 10000));
                                                                return;
                                                            case R.id.btn_test_crash4:
                                                                Tracer.p("[SUCCESS] DIRECT NATIVE " + (-h.n(0, 10000)));
                                                                return;
                                                            case R.id.btn_test_crashDirect:
                                                                throw new RuntimeException("This is a default test");
                                                            case R.id.btn_test_crashDirectNative:
                                                                Tracer.q("[SUCCESS] DIRECT THROW " + (-h.n(0, 10000)));
                                                                return;
                                                            case R.id.btn_test_database:
                                                                ii(1, true);
                                                                return;
                                                            case R.id.btn_test_recovery_tdlib:
                                                                String x10 = ((ra) view.getTag()).x();
                                                                if (ib.i.i(x10)) {
                                                                    x10 = "some tdlib bug";
                                                                }
                                                                i.c2().W5(this.f24495b.A6(), x10);
                                                                System.exit(0);
                                                                return;
                                                            case R.id.btn_testingUtils:
                                                                kb.i wqVar = new kb.i() {
                                                                    @Override
                                                                    public final void a(boolean z11) {
                                                                        vr.this.Ih(z11);
                                                                    }
                                                                };
                                                                if (this.F0 != null) {
                                                                    wqVar.a(true);
                                                                    return;
                                                                } else {
                                                                    re(w.H0(this, R.string.TestModeWarn, new Object[0]), wqVar);
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
        if (view.getId() != R.id.btn_log_files || !this.L0) {
            return false;
        }
        Log.b bVar = this.K0;
        if (bVar == null || bVar.a()) {
            li(Log.getLogFiles());
        }
        Log.b bVar2 = this.K0;
        if (bVar2 == null || bVar2.a()) {
            return false;
        }
        ee("Clear " + c0.m(this.K0.f19993d) + "?", new int[]{R.id.btn_deleteAll, R.id.btn_cancel}, new String[]{"Delete all logs", "Cancel"}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
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
                boolean Wh;
                Wh = vr.this.Wh(view2, i10);
                return Wh;
            }
        });
        return true;
    }

    @Override
    public boolean pg() {
        return true;
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        th(false);
        boolean z10 = true;
        th(true);
        if (this.G0) {
            s sVar = new s(context);
            this.O0 = sVar;
            sVar.setThemedTextColor(this);
            this.O0.A1(a0.i(18.0f), true);
            this.O0.setTitle(X9());
            this.O0.setSubtitle(wh());
        }
        b bVar = new b(this);
        this.H0 = bVar;
        bVar.B2(this);
        ArrayList arrayList = new ArrayList();
        if (this.G0) {
            int i10 = this.F0.f13855f;
            if (i10 != -1) {
                w6 U = ya.p1(i10).U(this.F0.f13855f);
                if (U.p() != null) {
                    arrayList.add(new ra(57).G(U));
                    arrayList.add(new ra(3));
                }
            }
            if (this.F0.c() == 1 && !ib.i.i(this.F0.f13851b)) {
                arrayList.add(new ra(9, 0, 0, (CharSequence) this.F0.f13851b, false));
            }
            if (!arrayList.isEmpty()) {
                arrayList.add(new ra(2));
            }
            arrayList.add(new ra(4, R.id.btn_launchApp, R.drawable.baseline_warning_24, R.string.LaunchApp).d0(R.id.theme_color_textNeutral));
            arrayList.add(new ra(11));
            arrayList.add(new ra(4, R.id.btn_update, R.drawable.baseline_system_update_24, R.string.LaunchAppCheckUpdate));
            if (this.D0 != 2) {
                arrayList.add(new ra(11));
                if (this.F0.c() == 2) {
                    arrayList.add(new ra(4, R.id.btn_showError, R.drawable.baseline_info_24, R.string.LaunchAppViewError));
                } else {
                    arrayList.add(new ra(4, R.id.btn_shareError, R.drawable.baseline_share_24, R.string.LaunchAppShareError));
                }
            }
            int c10 = this.F0.c();
            if (c10 == 1 || c10 == 4) {
                arrayList.add(new ra(11));
                arrayList.add(new ra(4, R.id.btn_eraseDatabase, R.drawable.baseline_delete_forever_24, R.string.LaunchAppEraseDatabase).d0(R.id.theme_color_textNegative));
            }
            arrayList.add(new ra(3));
            arrayList.add(new ra(9, 0, 0, vh(), false));
        }
        int i11 = this.D0;
        if (i11 == 0) {
            if (arrayList.isEmpty()) {
                arrayList.add(new ra(14));
            }
            arrayList.add(new ra(8, 0, 0, (int) R.string.AppLogs, false));
            arrayList.add(new ra(2));
            arrayList.add(new ra(5, (int) R.id.btn_log_verbosity, 0, (int) R.string.DebugVerbosity, false));
            arrayList.add(new ra(11));
            arrayList.add(new ra(5, (int) R.id.btn_log_tags, 0, (int) R.string.DebugLogTags, false));
            arrayList.add(new ra(11));
            arrayList.add(new ra(5, (int) R.id.btn_log_files, 0, (int) R.string.DebugLogFiles, false));
            arrayList.add(new ra(11));
            arrayList.add(new ra(7, (int) R.id.btn_log_android, 0, (int) R.string.DebugLogcat, false));
            arrayList.add(new ra(3));
            arrayList.add(new ra(9, 0, 0, w.I0(this, R.string.DebugAppLogsInfo, new Object[0]), false));
            if (this.F0 == null) {
                arrayList.add(new ra(8, 0, 0, R.string.Other));
                arrayList.add(new ra(2));
                arrayList.add(new ra(4, (int) R.id.btn_tdlib, 0, (int) R.string.TdlibLogs, false));
                arrayList.add(new ra(3));
            }
        } else if (i11 == 1) {
            if (!arrayList.isEmpty()) {
                arrayList.add(new ra(2));
            }
            int size = arrayList.size();
            o6 o6Var = this.f24495b;
            if (o6Var != null && !o6Var.F4().k1()) {
                arrayList.add(new ra(4, (int) R.id.btn_secret_readAllChats, 0, (int) R.string.ReadAllChats, false));
                arrayList.add(new ra(11));
                arrayList.add(new ra(4, (int) R.id.btn_secret_tdlibDatabaseStats, 0, (CharSequence) "TDLib database statistics", false));
                arrayList.add(new ra(11));
                arrayList.add(new ra(4, (int) R.id.btn_secret_databaseStats, 0, (CharSequence) "Other internal statistics", false));
                if (this.E0 >= 3) {
                    arrayList.add(new ra(11));
                    arrayList.add(new ra(4, (int) R.id.btn_secret_stressTest, 0, (CharSequence) "Stress test TDLib restarts", false));
                }
                if (this.E0 >= 3 || i.c2().d0()) {
                    if (arrayList.size() > size) {
                        arrayList.add(new ra(11));
                    }
                    arrayList.add(new ra(7, (int) R.id.btn_secret_forceTdlibRestarts, 0, "Force TDLib restarts", i.c2().d0()));
                }
                if (this.E0 >= 4 && this.f24495b.K6()) {
                    arrayList.add(new ra(11));
                    arrayList.add(new ra(4, (int) R.id.btn_secret_sendAllChangeLogs, 0, (CharSequence) "Send all change logs", false));
                }
                if (this.E0 >= 5) {
                    arrayList.add(new ra(11));
                    arrayList.add(new ra(4, (int) R.id.btn_secret_copyLanguageCodes, 0, (CharSequence) "Copy language codes list", false));
                }
                TdApi.User da2 = this.f24495b.da();
                if (!(da2 == null || da2.profilePhoto == null)) {
                    arrayList.add(new ra(11));
                    arrayList.add(new ra(4, (int) R.id.btn_secret_deleteProfilePhoto, 0, (CharSequence) "Delete profile photo from cache", false));
                }
            }
            arrayList.add(new ra(11));
            arrayList.add(new ra(4, (int) R.id.btn_secret_dropSavedScrollPositions, 0, (CharSequence) "Drop saved scroll positions", false));
            if (this.E0 >= 5 || i.c2().V()) {
                if (arrayList.size() > size) {
                    arrayList.add(new ra(11));
                }
                arrayList.add(new ra(7, (int) R.id.btn_secret_dontReadMessages, 0, (CharSequence) "Don't read messages", false));
            }
            if (arrayList.size() > size) {
                arrayList.add(new ra(11));
            }
            arrayList.add(new ra(4, (int) R.id.btn_secret_resetTutorials, 0, (CharSequence) "Reset tutorials", false));
            if (this.f24495b != null) {
                if (arrayList.size() > size) {
                    arrayList.add(new ra(11));
                }
                arrayList.add(new ra(4, (int) R.id.btn_secret_resetLocalNotificationSettings, 0, (CharSequence) "Reset local notification settings", false));
            }
            if (this.f24495b != null) {
                if (arrayList.size() > size) {
                    arrayList.add(new ra(11));
                }
                arrayList.add(new ra(4, (int) R.id.btn_secret_dropHidden, 0, (CharSequence) "Drop hidden notification identifiers", false));
            }
            if (this.E0 >= 1 || i.c2().H2()) {
                if (arrayList.size() > size) {
                    arrayList.add(new ra(11));
                }
                arrayList.add(new ra(7, (int) R.id.btn_secret_replacePhoneNumber, 0, "Hide phone number in drawer", i.c2().H2()));
            }
            if (this.E0 >= 1 || i.c2().c0()) {
                if (arrayList.size() > size) {
                    arrayList.add(new ra(11));
                }
                arrayList.add(new ra(7, (int) R.id.btn_secret_forceTcpInCalls, 0, "Force TCP in calls", i.c2().c0()));
            }
            if (this.E0 >= 3 || i.c2().b0()) {
                if (arrayList.size() > size) {
                    arrayList.add(new ra(11));
                }
                arrayList.add(new ra(7, (int) R.id.btn_secret_disableNetwork, 0, "Force disable network", i.c2().b0()));
            }
            if (this.E0 >= 3 || i.c2().D2()) {
                if (arrayList.size() > size) {
                    arrayList.add(new ra(11));
                }
                arrayList.add(new ra(7, (int) R.id.btn_secret_disableQrProcess, 0, "Disable QR processing", i.c2().D2()));
            }
            if (this.E0 >= 3 || i.c2().E2()) {
                if (arrayList.size() > size) {
                    arrayList.add(new ra(11));
                }
                arrayList.add(new ra(7, (int) R.id.btn_secret_forceQrZxing, 0, "Force ZXing in QR scanner", i.c2().E2()));
            }
            if (this.E0 >= 3 || i.c2().V2()) {
                if (arrayList.size() > size) {
                    arrayList.add(new ra(11));
                }
                arrayList.add(new ra(7, (int) R.id.btn_secret_debugQrRegions, 0, "Show QR scanner UI regions", i.c2().E2()));
            }
            if (this.E0 >= 2) {
                if (arrayList.size() > size) {
                    arrayList.add(new ra(11));
                }
                arrayList.add(new ra(4, (int) R.id.btn_secret_qrTest, 0, (CharSequence) "Test QR scanner", false));
            }
            arrayList.add(new ra(3));
            arrayList.add(new ra(8, 0, 0, (CharSequence) "Tests (crash when failed)", false));
            arrayList.add(new ra(2));
            arrayList.add(new ra(4, (int) R.id.btn_test_database, 0, (CharSequence) "Test database", false));
            if (this.E0 >= 3) {
                arrayList.add(new ra(11));
                arrayList.add(new ra(4, (int) R.id.btn_test_recovery_tdlib, 0, (CharSequence) "Crash & enter recovery mode (TDLib error)", false));
                arrayList.add(new ra(11));
                arrayList.add(new ra(4, (int) R.id.btn_test_recovery_tdlib, 0, (CharSequence) "Crash & enter recovery mode (disk full)", false).b0("database or disk is full"));
                arrayList.add(new ra(11));
                arrayList.add(new ra(4, (int) R.id.btn_test_recovery_tdlib, 0, (CharSequence) "Crash & enter recovery mode (database broken)", false).b0("Wrong key or database is corrupted"));
                arrayList.add(new ra(11));
                arrayList.add(new ra(4, (int) R.id.btn_test_recovery_tdlib, 0, (CharSequence) "Crash & enter recovery mode (other external error)", false).b0("I/O error"));
                arrayList.add(new ra(11));
                arrayList.add(new ra(4, (int) R.id.btn_test_crash1, 0, (CharSequence) "Crash app (method 1, indirect)", false));
                arrayList.add(new ra(11));
                arrayList.add(new ra(4, (int) R.id.btn_test_crash2, 0, (CharSequence) "Crash app (method 2, direct)", false));
                arrayList.add(new ra(11));
                arrayList.add(new ra(4, (int) R.id.btn_test_crash3, 0, (CharSequence) "Crash app (method 3, native indirect)", false));
                arrayList.add(new ra(11));
                arrayList.add(new ra(4, (int) R.id.btn_test_crash4, 0, (CharSequence) "Crash app (method 4, native direct)", false));
                arrayList.add(new ra(11));
                arrayList.add(new ra(4, (int) R.id.btn_test_crashDirect, 0, (CharSequence) "Crash app (default)", false));
                arrayList.add(new ra(11));
                arrayList.add(new ra(4, (int) R.id.btn_test_crashDirectNative, 0, (CharSequence) "Crash app (native)", false));
            }
            arrayList.add(new ra(3));
        } else if (i11 == 2) {
            if (arrayList.isEmpty()) {
                arrayList.add(new ra(14));
            }
            if (this.G0) {
                arrayList.add(new ra(2));
                arrayList.add(new ra(4, R.id.btn_shareError, R.drawable.baseline_share_24, R.string.LaunchAppShareError).d0(R.id.theme_color_textNegative));
                arrayList.add(new ra(3));
            }
            arrayList.add(new ra(8, 0, 0, (int) R.string.TdlibLogs, false));
            arrayList.add(new ra(2));
            arrayList.add(new ra(92, (int) R.id.btn_tdlib_verbosity, 0, (int) R.string.DebugVerbosity, false));
            arrayList.add(new ra(11));
            arrayList.add(new ra(89, (int) R.id.btn_tdlib_logSize, 0, (int) R.string.DebugLogSize, false));
            arrayList.add(new ra(11));
            arrayList.add(new ra(89, (int) R.id.btn_tdlib_viewLogs, 0, (CharSequence) ya.G0(false).getName(), false));
            arrayList.add(new ra(11));
            arrayList.add(new ra(89, (int) R.id.btn_tdlib_viewLogsOld, 0, (CharSequence) ya.G0(true).getName(), false));
            i.r d12 = i.c2().d1();
            if (this.E0 >= 4 || d12.j()) {
                arrayList.add(new ra(11));
                arrayList.add(new ra(7, (int) R.id.btn_tdlib_androidLogs, 0, (int) R.string.DebugLogcatOnly, false));
            }
            arrayList.add(new ra(11));
            arrayList.add(new ra(4, (int) R.id.btn_tdlib_resetLogSettings, 0, (int) R.string.DebugReset, false));
            arrayList.add(new ra(3));
            List<String> f10 = d12.f();
            if (f10 != null && !f10.isEmpty()) {
                arrayList.add(new ra(8, 0, 0, (int) R.string.DebugModules, false));
                for (String str : f10) {
                    if (z10) {
                        arrayList.add(new ra(2));
                        z10 = false;
                    } else {
                        arrayList.add(new ra(11));
                    }
                    arrayList.add(new ra(92, (int) R.id.btn_tdlib_verbosity, 0, (CharSequence) str, false).G(str));
                }
                arrayList.add(new ra(3));
                arrayList.add(new ra(9, 0, 0, w.I0(this, R.string.DebugModulesInfo, new Object[0]), false));
            }
            if (this.G0) {
                arrayList.add(new ra(2));
                arrayList.add(new ra(4, (int) R.id.btn_testingUtils, 0, (int) R.string.TestMode, false));
                arrayList.add(new ra(11));
                arrayList.add(new ra(4, (int) R.id.btn_appLogs, 0, (int) R.string.AppLogs, false));
                arrayList.add(new ra(3));
            }
        } else if (i11 == 3) {
            arrayList.add(new ra(2));
            arrayList.add(new ra(4, (int) R.id.btn_tdlib, 0, (int) R.string.TdlibLogs, false));
            arrayList.add(new ra(11));
            arrayList.add(new ra(4, (int) R.id.btn_appLogs, 0, (int) R.string.AppLogs, false));
            arrayList.add(new ra(11));
            arrayList.add(new ra(4, (int) R.id.btn_testingUtils, 0, (int) R.string.TestMode, false));
            arrayList.add(new ra(3));
        }
        this.H0.s2(arrayList, false);
        if (this.D0 == 0 && this.f24495b != null) {
            yh();
            Log.addOutputListener(this);
            if (this.F0 == null) {
                this.f24495b.j6(new k() {
                    @Override
                    public final void a(int i12) {
                        vr.this.Th(i12);
                    }
                });
            }
        }
        customRecyclerView.setAdapter(this.H0);
    }

    @Override
    public void tc() {
        super.tc();
        if (this.D0 != 2) {
            return;
        }
        if (Ta()) {
            j0.e0(new a(), 1500L);
            return;
        }
        Runnable runnable = this.J0;
        if (runnable != null) {
            j0.f0(runnable);
            this.J0 = null;
        }
    }

    public final void th(boolean z10) {
        try {
            ei(new File(ya.H0(z10)).length(), z10);
        } catch (Throwable unused) {
        }
    }

    public final void uh() {
        Log.b bVar;
        if (this.L0 && (bVar = this.K0) != null && !bVar.a() && !this.N0) {
            ki(true);
            Log.deleteAll(this.K0, new j() {
                @Override
                public final void a(Object obj) {
                    vr.this.Ch((Log.b) obj);
                }
            }, null);
        }
    }

    public final CharSequence vh() {
        int i10;
        int c10 = this.F0.c();
        if (c10 == 1) {
            i10 = R.string.LaunchAppGuideTdlibIssue;
        } else if (c10 == 2) {
            i10 = R.string.LaunchAppGuideDiskFull;
        } else if (c10 == 3) {
            i10 = R.string.LaunchAppGuideExternalError;
        } else if (c10 != 4) {
            return null;
        } else {
            i10 = R.string.LaunchAppGuideDatabaseBroken;
        }
        return w.I0(this, i10, xh(), v0.J0());
    }

    public final String wh() {
        int c10 = this.F0.c();
        if (c10 == 1) {
            return w.j1(R.string.LaunchSubtitleTdlibIssue, Ah(true));
        }
        if (c10 == 2) {
            return w.i1(R.string.LaunchSubtitleDiskFull);
        }
        if (c10 == 3) {
            return w.i1(R.string.LaunchSubtitleExternalError);
        }
        if (c10 != 4) {
            return null;
        }
        return w.i1(R.string.LaunchSubtitleDatabaseBroken);
    }

    public final String xh() {
        return c0.m(v0.p0());
    }

    public final void yh() {
        if (gi()) {
            this.M0 = SystemClock.elapsedRealtime();
            Log.getLogFiles(new j() {
                @Override
                public final void a(Object obj) {
                    vr.this.Eh((Log.b) obj);
                }
            });
        }
    }

    public static class f {
        public final int f9871a;
        public final i.e f9872b;
        public int f9873c;
        public boolean f9874d;

        public f(i.e eVar) {
            this.f9873c = 0;
            this.f9872b = eVar;
            this.f9874d = true;
            if (eVar.c() == 1) {
                this.f9871a = 2;
            } else {
                this.f9871a = 3;
            }
        }

        public f c(int i10) {
            this.f9873c = i10;
            return this;
        }

        public f(int i10, i.e eVar) {
            this.f9873c = 0;
            this.f9871a = i10;
            this.f9872b = eVar;
        }
    }
}
