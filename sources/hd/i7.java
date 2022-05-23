package hd;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.c0;
import ce.y;
import de.u9;
import gb.c;
import gb.j;
import gd.w;
import hd.c4;
import hd.f0;
import hd.i7;
import ib.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import je.g;
import je.l0;
import ld.h;
import ld.p;
import ld.v;
import md.m;
import ne.g1;
import ob.e;
import oc.v0;
import od.j1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import vd.o0;
import zd.hj;
import zd.o6;

public class i7 implements g1.c, f0.a, c4.b, Client.g {
    public static int A0 = 0;
    public static int B0 = 0;
    public static int C0 = 0;
    public static int D0 = 0;
    public static int E0 = 0;
    public static int F0 = 0;
    public static int G0 = 0;
    public static float f13099t0 = 4.0f;
    public static float f13100u0 = 2.0f;
    public static int f13101v0;
    public static int f13102w0;
    public static int f13103x0;
    public static int f13104y0;
    public static int f13105z0;
    public int M;
    public int N;
    public long O;
    public long P;
    public final h6 Q;
    public final TdApi.WebPage R;
    public final String S;
    public c T;
    public int U;
    public float V;
    public String W;
    public ArrayList<qd.b> X;
    public int Y;
    public int Z;
    public int f13106a;
    public int f13107a0;
    public boolean f13108b;
    public int f13109b0;
    public int f13110c;
    public int f13111c0;
    public int f13112d0;
    public g f13113e0;
    public g f13114f0;
    public g f13115g0;
    public j f13116h0;
    public f0 f13117i0;
    public h f13118j0;
    public h f13119k0;
    public md.j f13120l0;
    public int f13121m0;
    public int f13122n0;
    public String f13123o0;
    public int f13124p0;
    public int f13125q0;
    public c4 f13126r0;
    public final c f13127s0 = new c(new a());

    public class a implements c.a {
        public a() {
        }

        @Override
        public boolean B(float f10, float f11) {
            return gb.b.d(this, f10, f11);
        }

        @Override
        public void C(View view, float f10, float f11) {
            if (i7.this.R.sticker != null && i7.this.R.sticker.setId != 0) {
                i7.this.Q.c().hd().M8(i7.this.Q.Q0(), i7.this.R.sticker.setId);
            }
        }

        @Override
        public boolean E4() {
            return gb.b.a(this);
        }

        @Override
        public void G(View view, float f10, float f11) {
            gb.b.h(this, view, f10, f11);
        }

        @Override
        public void U2(View view, float f10, float f11) {
            gb.b.e(this, view, f10, f11);
        }

        @Override
        public void U4(View view, float f10, float f11) {
            gb.b.f(this, view, f10, f11);
        }

        @Override
        public boolean X6(float f10, float f11) {
            return gb.b.c(this, f10, f11);
        }

        @Override
        public long getLongPressDuration() {
            return gb.b.b(this);
        }

        @Override
        public boolean m0(View view, float f10, float f11) {
            vc.g1 g1Var = (vc.g1) view;
            v gifReceiver = i7.this.W() ? g1Var.getGifReceiver() : g1Var.getPreviewReceiver();
            return (gifReceiver == null || !gifReceiver.h1(f10, f11, 0, 0) || (i7.this.f13120l0 == null && i7.this.f13118j0 == null) || i7.this.R.sticker == null || i7.this.R.sticker.setId == 0) ? false : true;
        }

        @Override
        public void o(View view, float f10, float f11) {
            gb.b.i(this, view, f10, f11);
        }

        @Override
        public void o2(View view, float f10, float f11) {
            gb.b.g(this, view, f10, f11);
        }

        @Override
        public boolean s4(View view, float f10, float f11) {
            return gb.b.k(this, view, f10, f11);
        }

        @Override
        public void z6(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
            gb.b.j(this, view, motionEvent, f10, f11, f12, f13);
        }
    }

    public class b implements Client.g {
        public final boolean[] M;
        public final TdApi.WebPage N;
        public final String O;
        public final int f13129a;
        public final c4.a f13130b;
        public final View f13131c;

        public b(int i10, c4.a aVar, View view, boolean[] zArr, TdApi.WebPage webPage, String str) {
            this.f13129a = i10;
            this.f13130b = aVar;
            this.f13131c = view;
            this.M = zArr;
            this.N = webPage;
            this.O = str;
        }

        public static void e(int i10, c4.a aVar, View view) {
            if (i10 == aVar.P()) {
                aVar.x0();
                aVar.K0(view, R.string.InstantViewUnsupported);
            }
        }

        public static void f(int i10, c4.a aVar, View view, boolean[] zArr, TdApi.WebPageInstantView webPageInstantView) {
            StringBuilder sb2;
            String str;
            if (i10 == aVar.P()) {
                aVar.x0();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("TDLib: instantView.pageBlocks returned null ");
                if (zArr[0]) {
                    sb2 = new StringBuilder();
                    str = "twice isFull == ";
                } else {
                    sb2 = new StringBuilder();
                    str = "with isFull == ";
                }
                sb2.append(str);
                sb2.append(webPageInstantView.isFull);
                sb3.append(sb2.toString());
                aVar.L0(view, sb3.toString());
            }
        }

        public void g(int i10, c4.a aVar, TdApi.WebPage webPage, TdApi.WebPageInstantView webPageInstantView, String str, View view) {
            if (i10 == aVar.P()) {
                aVar.x0();
                u9 u9Var = new u9(i7.this.Q.Q0().t(), i7.this.Q.c());
                u9Var.Ad(new u9.b(webPage, webPageInstantView, str));
                try {
                    u9Var.bf();
                } catch (UnsupportedOperationException e10) {
                    Log.w("Unsupported Instant View block:%s", e10, webPage.url);
                    aVar.K0(view, R.string.InstantViewUnsupported);
                    u9Var.Z8();
                } catch (Throwable th) {
                    Log.e("Unable to open Instant View, url:%s", th, webPage.url);
                    aVar.K0(view, R.string.InstantViewError);
                    u9Var.Z8();
                }
            }
        }

        public static void h(int i10, c4.a aVar, View view, TdApi.Object object) {
            if (i10 == aVar.P()) {
                aVar.x0();
                aVar.L0(view, t2.z5(object));
            }
        }

        @Override
        public void r2(final TdApi.Object object) {
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                hj hd2 = i7.this.Q.c().hd();
                final int i10 = this.f13129a;
                final c4.a aVar = this.f13130b;
                final View view = this.f13131c;
                hd2.post(new Runnable() {
                    @Override
                    public final void run() {
                        i7.b.h(i10, aVar, view, object);
                    }
                });
            } else if (constructor != 778202453) {
                Log.unexpectedTdlibResponse(object, TdApi.GetWebPageInstantView.class, TdApi.WebPageInstantView.class);
                hj hd3 = i7.this.Q.c().hd();
                final c4.a aVar2 = this.f13130b;
                Objects.requireNonNull(aVar2);
                hd3.post(new Runnable() {
                    @Override
                    public final void run() {
                        c4.a.this.x0();
                    }
                });
            } else {
                final TdApi.WebPageInstantView webPageInstantView = (TdApi.WebPageInstantView) object;
                if (!t2.y2(webPageInstantView.version)) {
                    hj hd4 = i7.this.Q.c().hd();
                    final int i11 = this.f13129a;
                    final c4.a aVar3 = this.f13130b;
                    final View view2 = this.f13131c;
                    hd4.post(new Runnable() {
                        @Override
                        public final void run() {
                            i7.b.e(i11, aVar3, view2);
                        }
                    });
                    return;
                }
                TdApi.PageBlock[] pageBlockArr = webPageInstantView.pageBlocks;
                if (pageBlockArr == null || pageBlockArr.length == 0) {
                    boolean[] zArr = this.M;
                    if (!zArr[0] && !webPageInstantView.isFull) {
                        zArr[0] = true;
                        i7.this.Q.c().v4().o(new TdApi.GetWebPageInstantView(this.N.url, false), this);
                        return;
                    }
                    hj hd5 = i7.this.Q.c().hd();
                    final int i12 = this.f13129a;
                    final c4.a aVar4 = this.f13130b;
                    final View view3 = this.f13131c;
                    final boolean[] zArr2 = this.M;
                    hd5.post(new Runnable() {
                        @Override
                        public final void run() {
                            i7.b.f(i12, aVar4, view3, zArr2, webPageInstantView);
                        }
                    });
                    return;
                }
                hj hd6 = i7.this.Q.c().hd();
                final int i13 = this.f13129a;
                final c4.a aVar5 = this.f13130b;
                final TdApi.WebPage webPage = this.N;
                final String str = this.O;
                final View view4 = this.f13131c;
                hd6.post(new Runnable() {
                    @Override
                    public final void run() {
                        i7.b.this.g(i13, aVar5, webPage, webPageInstantView, str, view4);
                    }
                });
            }
        }
    }

    public i7(h6 h6Var, TdApi.WebPage webPage, String str) {
        if (f13105z0 == 0) {
            M();
        }
        this.f13116h0 = h6Var.P0;
        this.Q = h6Var;
        this.R = webPage;
        this.S = str;
        this.O = h6Var.I2();
        this.P = h6Var.K3();
    }

    public static void M() {
        f13101v0 = a0.i(2.0f);
        f13102w0 = a0.i(12.0f);
        f13103x0 = a0.i(60.0f);
        f13104y0 = a0.i(23.0f);
        A0 = a0.i(3.0f);
        f13105z0 = a0.i(10.0f);
        B0 = a0.i(8.0f);
        C0 = a0.i(6.0f);
        D0 = a0.i(5.0f);
        E0 = a0.i(20.0f);
        F0 = a0.i(14.5f);
        G0 = a0.i(1.0f);
    }

    public static boolean P(int i10) {
        if (i10 == 2 || i10 == 5) {
            return true;
        }
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return true;
            default:
                return false;
        }
    }

    public static boolean Q(int i10) {
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                return true;
            default:
                return false;
        }
    }

    public int S(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = i13 + i10;
        int i17 = i15 + i16;
        int i18 = this.f13109b0;
        return (i17 < i18 || i16 >= i18 + f13103x0) ? i14 : i11;
    }

    public int T(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = i13 + i10;
        int i17 = i15 + i16;
        int i18 = this.f13109b0;
        return (i17 < i18 || i16 >= i18 + f13103x0) ? i14 : i11;
    }

    public int U(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16 = i13 + i10;
        int i17 = i15 + i16;
        int i18 = this.f13109b0;
        return (i17 < i18 || i16 >= i18 + f13103x0) ? i14 : i11;
    }

    public static boolean X(TdApi.WebPage webPage) {
        if (webPage == null || !t2.z2(webPage)) {
            return false;
        }
        TdApi.Photo photo = webPage.photo;
        if (photo == null || t2.t3(photo)) {
            TdApi.Video video = webPage.video;
            return video != null && Math.max(video.width, video.height) >= 400;
        }
        TdApi.PhotoSize C02 = e.C0(webPage.photo);
        return C02 != null && Math.max(C02.width, C02.height) >= 400;
    }

    public static void h0() {
        f13105z0 = 0;
    }

    public int A(boolean z10) {
        c cVar = this.T;
        if (cVar != null) {
            return cVar.c(0);
        }
        return 0;
    }

    public ArrayList<qd.b> B() {
        return this.X;
    }

    public int C() {
        return this.Y;
    }

    public final Client.g D(View view, c4.a aVar, TdApi.WebPage webPage, String str) {
        return new b(aVar.P(), aVar, view, new boolean[1], webPage, str);
    }

    public int E() {
        return -1;
    }

    public int F() {
        return this.M;
    }

    public f0 G() {
        return this.f13117i0;
    }

    public TdApi.File H() {
        c cVar = this.T;
        if (cVar != null) {
            return cVar.d();
        }
        f0 f0Var = this.f13117i0;
        if (f0Var != null) {
            return f0Var.P();
        }
        return null;
    }

    public int I() {
        return this.f13110c;
    }

    public TdApi.WebPage J() {
        return this.R;
    }

    public int K() {
        if (this.f13126r0 != null) {
            return this.M;
        }
        int i10 = this.f13121m0;
        int i11 = 0;
        int i12 = i10 != 0 ? i10 + f13105z0 : 0;
        c cVar = this.T;
        int j10 = cVar != null ? f13105z0 + cVar.j() : 0;
        g gVar = this.f13113e0;
        int width = gVar != null ? f13105z0 + gVar.getWidth() : 0;
        int i13 = this.f13117i0 != null ? this.f13107a0 + this.f13111c0 : 0;
        g gVar2 = this.f13114f0;
        int width2 = gVar2 != null ? f13105z0 + gVar2.getWidth() : 0;
        g gVar3 = this.f13115g0;
        if (gVar3 != null) {
            i11 = f13105z0 + gVar3.getWidth();
        }
        return Math.max(i12, Math.max(j10, Math.max(width, Math.max(i13, Math.max(width2, i11)))));
    }

    public final boolean L() {
        return !i.i(this.R.siteName) || !i.i(this.R.title) || !e.c1(this.R.description) || R();
    }

    public boolean N() {
        return (this.f13106a & 1) != 0;
    }

    public boolean O(String str) {
        if (i.i(str)) {
            return false;
        }
        if (!str.contains("://")) {
            str = "https://" + str;
        }
        try {
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(this.R.url);
            String host = parse.getHost();
            Locale locale = Locale.ROOT;
            if (i.c(host.toLowerCase(locale).replaceAll("^(?:www\\.|m\\.)", ""), parse2.getHost().toLowerCase(locale).replaceAll("^(?:www\\.|m\\.)", ""))) {
                return i.c(parse.getPath(), parse2.getPath());
            }
            return false;
        } catch (Throwable th) {
            Log.i("Invalid url", th, new Object[0]);
            return false;
        }
    }

    public boolean R() {
        return this.f13110c == 18;
    }

    public boolean W() {
        f0 f0Var = this.f13117i0;
        return (f0Var != null && f0Var.U()) || this.f13120l0 != null;
    }

    public boolean Y() {
        return this.f13110c != 19 && t2.z2(this.R) && !Z();
    }

    public boolean Z() {
        int i10 = this.f13110c;
        return i10 != 19 && (i10 == 16 || t2.k5(this.R.displayUrl));
    }

    @Override
    public boolean a(View view, c4 c4Var, c4.a aVar) {
        v4<?> Z9;
        String str;
        if (this.f13110c != 19 || (Z9 = this.Q.Q0().Z9()) == null) {
            return false;
        }
        if (this.Q.o6()) {
            str = this.Q.ja();
        } else {
            h6 h6Var = this.Q;
            str = this.Q.O0.Xc(h6Var.O0.j4(h6Var.ia()));
        }
        Z9.Wd(str, this.Q.h8(), null);
        return false;
    }

    public void a0() {
        f0 f0Var = this.f13117i0;
        if (f0Var != null) {
            f0Var.G().R();
        }
    }

    @Override
    public void b(View view, c4 c4Var, c4.a aVar) {
        if (Y()) {
            aVar.w0();
            aVar.J0();
            this.Q.c().v4().o(new TdApi.GetWebPageInstantView(this.S, false), D(view, aVar, this.R, this.Q.fa(this.R)));
            return;
        }
        c0(view, false);
    }

    public boolean b0(vc.g1 g1Var, MotionEvent motionEvent, int i10, int i11, g.c cVar) {
        c4 c4Var = this.f13126r0;
        if (c4Var != null && c4Var.w(g1Var, motionEvent)) {
            return true;
        }
        f0 f0Var = this.f13117i0;
        if (f0Var != null && f0Var.i0(g1Var, motionEvent)) {
            return true;
        }
        c cVar2 = this.T;
        if (cVar2 != null && cVar2.l(g1Var, motionEvent)) {
            return true;
        }
        if ((this.f13118j0 != null || this.f13120l0 != null) && this.f13127s0.e(g1Var, motionEvent)) {
            return true;
        }
        g gVar = this.f13113e0;
        if (gVar != null && gVar.V0(g1Var, motionEvent, cVar)) {
            return true;
        }
        g gVar2 = this.f13114f0;
        if (gVar2 != null && gVar2.V0(g1Var, motionEvent, cVar)) {
            return true;
        }
        g gVar3 = this.f13115g0;
        return gVar3 != null && gVar3.V0(g1Var, motionEvent, cVar);
    }

    public boolean c0(View view, boolean z10) {
        c4 c4Var;
        if (I() == 18) {
            this.Q.c().hd().E7(this.Q.Q0(), this.S, this.f13126r0.n().A0(view).e());
            return true;
        } else if (this.f13117i0 != null && z10 && Q(this.f13110c)) {
            j1.lk(this.Q);
            return true;
        } else if (z10 && (c4Var = this.f13126r0) != null && c4Var.i(view)) {
            return true;
        } else {
            int I = I();
            if (I == 3 || I == 4) {
                j1.lk(this.Q);
            } else if (I != 19) {
                switch (I) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        this.Q.c().hd().E7(this.Q.Q0(), this.S, this.f13126r0.n().A0(view).e());
                        break;
                    default:
                        f0 f0Var = this.f13117i0;
                        if (f0Var == null || !f0Var.a0()) {
                            if (!bd.c.P1(this.Q.Q0(), this.R, this.Q.l6())) {
                                if (this.f13117i0 != null && this.R.photo != null) {
                                    j1.lk(this.Q);
                                    break;
                                } else {
                                    this.Q.c().hd().E7(this.Q.Q0(), this.S, new hj.q(this.f13126r0.n().A0(view)).d());
                                    break;
                                }
                            }
                        } else {
                            j1.lk(this.Q);
                            break;
                        }
                        break;
                }
            } else {
                this.Q.ea();
            }
            return true;
        }
    }

    public boolean d0(View view, h6 h6Var) {
        g gVar;
        g gVar2;
        c4 c4Var;
        g gVar3 = this.f13113e0;
        return (gVar3 != null && gVar3.W0(view)) || ((gVar = this.f13114f0) != null && gVar.W0(view)) || (((gVar2 = this.f13115g0) != null && gVar2.W0(view)) || ((c4Var = this.f13126r0) != null && c4Var.y(view)));
    }

    @Override
    public void e(TdApi.File file, int i10) {
    }

    public void e0(p pVar, int i10, int i11) {
        h hVar = this.f13118j0;
        if (hVar != null) {
            pVar.G(hVar);
            return;
        }
        f0 f0Var = this.f13117i0;
        if (f0Var != null) {
            f0Var.m0(pVar);
            return;
        }
        c cVar = this.T;
        if (cVar != null) {
            cVar.m(pVar);
        } else {
            pVar.G(null);
        }
    }

    @Override
    public boolean f(View view, f0 f0Var) {
        if ((!P(this.f13110c) || this.f13108b || this.R.photo == null) && this.X == null) {
            return c0(view, true);
        }
        this.f13117i0.f12964f0.n();
        j1.lk(this.Q);
        return true;
    }

    public void f0(m mVar, int i10, int i11) {
        md.j jVar = this.f13120l0;
        if (jVar != null) {
            mVar.r(jVar);
            return;
        }
        f0 f0Var = this.f13117i0;
        if (f0Var != null) {
            f0Var.l0(mVar);
        } else {
            mVar.r(null);
        }
    }

    @Override
    public void g(TdApi.File file, float f10) {
    }

    public void g0(ld.c cVar, int i10, int i11) {
        if (this.f13118j0 == null && this.f13120l0 == null) {
            f0 f0Var = this.f13117i0;
            if (f0Var != null) {
                f0Var.n0(cVar);
                return;
            }
            c cVar2 = this.T;
            if (cVar2 != null) {
                cVar2.n(cVar);
            } else {
                cVar.clear();
            }
        } else {
            cVar.j(null, this.f13119k0);
        }
    }

    public final void i0(int i10, int i11, int i12) {
        TdApi.Sticker sticker;
        this.f13108b = true;
        int F4 = this.Q.F4();
        TdApi.Sticker sticker2 = this.R.sticker;
        if (sticker2 == null || (Math.max(sticker2.width, sticker2.height) > 512 && !e.X0(this.R.sticker.type))) {
            TdApi.WebPage webPage = this.R;
            if (webPage.sticker != null) {
                this.f13117i0 = new f0(this.Q.t(), this.Q.c(), t2.b0(this.R.sticker), this.O, this.P, (s4) this.Q, false);
                j0(c0.m(this.R.sticker.sticker.size));
            } else if (webPage.video != null) {
                this.f13117i0 = new f0(this.Q.t(), this.Q.c(), this.R.video, this.O, this.P, (s4) this.Q, false);
            } else {
                Objects.requireNonNull(webPage.photo);
                org.thunderdog.challegram.a t10 = this.Q.t();
                o6 c10 = this.Q.c();
                TdApi.WebPage webPage2 = this.R;
                this.f13117i0 = new f0(t10, c10, webPage2.photo, this.O, this.P, this.Q, false, false, i.i(webPage2));
            }
            this.f13117i0.C0(this.f13116h0);
            this.f13117i0.t0(this);
            float F = this.f13117i0.F();
            float E = this.f13117i0.E();
            float min = Math.min(i10 / F, F4 / E);
            int i13 = (int) (F * min);
            int i14 = (int) (min * E);
            this.f13117i0.j(i13, i14);
            this.f13111c0 = i13;
            this.f13112d0 = i14;
        } else {
            float i15 = a0.i(190.0f);
            TdApi.Sticker sticker3 = this.R.sticker;
            float min2 = Math.min(i15 / sticker3.width, i15 / sticker3.height);
            int i16 = (int) (sticker.width * min2);
            int i17 = (int) (sticker.height * min2);
            if (e.X0(this.R.sticker.type)) {
                md.j jVar = new md.j(this.Q.c(), this.R.sticker);
                this.f13120l0 = jVar;
                jVar.I(1);
            } else {
                h hVar = new h(this.Q.c(), this.R.sticker.sticker);
                this.f13118j0 = hVar;
                hVar.s0(1);
                this.f13118j0.x0();
                this.f13118j0.t0(Math.max(i16, i17));
            }
            h D5 = t2.D5(this.Q.c(), this.R.sticker.thumbnail);
            this.f13119k0 = D5;
            if (D5 != null) {
                D5.s0(1);
                this.f13119k0.x0();
            }
            this.f13121m0 = i16;
            this.f13122n0 = i17;
            this.N += i17;
        }
        int i18 = this.Z + i11;
        this.Z = i18;
        this.f13107a0 = f13105z0;
        this.f13109b0 = i18;
        this.N += this.f13112d0 + i12;
    }

    public final void j0(String str) {
        this.f13123o0 = str;
        this.f13124p0 = (int) v0.T1(str, y.F0(13.0f, false, true));
    }

    @Override
    public boolean k(g1 g1Var, View view, TdApi.File file, long j10) {
        return c0(view, true);
    }

    public final void V(ArrayList<qd.b> arrayList, String str, float f10, int i10) {
        if (!N()) {
            this.X = arrayList;
            this.W = str;
            this.V = f10;
            this.Y = i10;
            f0 f0Var = this.f13117i0;
            if (f0Var != null) {
                f0Var.G().t0(true);
            }
            j jVar = this.f13116h0;
            if (jVar != null) {
                jVar.invalidate();
            }
        }
    }

    public final void l0(TdApi.Photo photo) {
        if (e.J0(photo) != null) {
            this.f13108b = false;
            f0 f0Var = new f0(this.Q.t(), this.Q.c(), photo, this.O, this.P, this.Q, false, false, i.i(this.R));
            this.f13117i0 = f0Var;
            f0Var.C0(this.f13116h0);
            this.f13117i0.o0(true);
            this.f13117i0.t0(this);
            f0 f0Var2 = this.f13117i0;
            int i10 = f13103x0;
            f0Var2.j(i10, i10);
            this.f13117i0.C0(this.f13116h0);
        }
    }

    public void m0(j jVar) {
        this.f13116h0 = jVar;
        g gVar = this.f13113e0;
        if (gVar != null) {
            gVar.o1(jVar);
        }
        g gVar2 = this.f13114f0;
        if (gVar2 != null) {
            gVar2.o1(jVar);
        }
        g gVar3 = this.f13115g0;
        if (gVar3 != null) {
            gVar3.o1(jVar);
        }
        f0 f0Var = this.f13117i0;
        if (f0Var != null) {
            f0Var.C0(jVar);
        }
        c cVar = this.T;
        if (cVar != null) {
            cVar.p(jVar);
        }
        c4 c4Var = this.f13126r0;
        if (c4Var != null) {
            c4Var.B(jVar);
        }
    }

    public void n0(long j10, long j11, boolean z10) {
        this.P = j11;
        f0 f0Var = this.f13117i0;
        if (f0Var != null) {
            f0Var.I0(j10, j11, z10);
        }
        c cVar = this.T;
        if (!(cVar == null || cVar.f() == null)) {
            this.T.f().V0(j10, j11, z10);
        }
        ArrayList<qd.b> arrayList = this.X;
        if (arrayList != null) {
            Iterator<qd.b> it = arrayList.iterator();
            while (it.hasNext()) {
                qd.b next = it.next();
                next.x().V0(j10, j11, z10);
                next.O0(this.Q.X3());
            }
        }
    }

    public void o(TdApi.ChatType chatType) {
        f0 f0Var = this.f13117i0;
        if (f0Var != null) {
            f0Var.G().m(chatType);
        }
    }

    public final void p(TdApi.WebPage webPage, int i10) {
        f0 f0Var = new f0(this.Q.t(), this.Q.c(), webPage.animation, this.O, this.P, this.Q, false, false, false, i.i(webPage));
        this.f13117i0 = f0Var;
        f0Var.t0(this);
        this.f13117i0.C0(this.f13116h0);
        int F4 = this.Q.F4();
        float F = this.f13117i0.F();
        float E = this.f13117i0.E();
        float min = Math.min(i10 / F, F4 / E);
        int i11 = (int) (F * min);
        int i12 = (int) (min * E);
        this.f13117i0.j(i11, i12);
        this.f13111c0 = i11;
        this.f13112d0 = i12;
        if (L()) {
            this.Z += B0;
        }
        this.f13107a0 = f13105z0;
        this.f13109b0 = this.Z;
        this.N += this.f13112d0 + (L() ? B0 + f13101v0 : -A0);
    }

    public final void q(TdApi.WebPage webPage, int i10) {
        final int i11;
        final int i12;
        if (X(webPage) || !P(this.f13110c) || t2.t3(webPage.photo)) {
            i11 = i10;
        } else {
            int i13 = f13103x0;
            i11 = (i10 - f13102w0) - i13;
            this.f13107a0 = this.M - i13;
            this.f13109b0 = f13104y0;
            this.f13112d0 = i13;
            this.f13111c0 = i13;
            if (this.f13117i0 == null) {
                l0(webPage.photo);
            }
        }
        int i14 = 0;
        boolean z10 = this.f13117i0 != null && !this.f13108b;
        if (!i.i(webPage.siteName) || R()) {
            final int i15 = a0.i(f13100u0) + 0;
            g.AbstractC0133g f7Var = z10 ? new g.AbstractC0133g() {
                @Override
                public final int a(int i16, int i17, int i18, int i19) {
                    int S;
                    S = i7.this.S(i15, i11, i16, i17, i18, i19);
                    return S;
                }
            } : null;
            String i16 = R() ? w.i1(R.string.ChatBackground) : webPage.siteName;
            g f10 = new g.b(i16, i10, s4.L4(), this.Q.F2()).p(2).o(f7Var).y((w.G2() ? Log.TAG_CRASH : 0) | 4).g().i(new l0[]{l0.D(this.Q.O0, i16, new TdApi.TextEntity(0, i16.length(), new TdApi.TextEntityTypeTextUrl(this.S)), this.Q.h8())}).f();
            this.f13113e0 = f10;
            i12 = i15 + f10.getHeight();
        } else {
            this.f13113e0 = null;
            i12 = 0;
        }
        if (i.i(webPage.title) || R()) {
            this.f13114f0 = null;
        } else {
            if (i12 > 0) {
                i12 += a0.i(f13099t0);
            }
            g f11 = new g.b(webPage.title, i10, s4.L4(), this.Q.K4()).p(t2.z2(webPage) ? -1 : 4).o(z10 ? new g.AbstractC0133g() {
                @Override
                public final int a(int i17, int i18, int i19, int i20) {
                    int T;
                    T = i7.this.T(i12, i11, i17, i18, i19, i20);
                    return T;
                }
            } : null).y((w.G2() ? Log.TAG_CRASH : 0) | 4).g().f();
            this.f13114f0 = f11;
            i12 += f11.getHeight();
        }
        if (!e.c1(webPage.description)) {
            if (i12 > 0) {
                i12 += a0.i(f13099t0);
            }
            g.b o10 = new g.b(webPage.description.text, i10, s4.L4(), this.Q.K4()).p(8).o(z10 ? new g.AbstractC0133g() {
                @Override
                public final int a(int i17, int i18, int i19, int i20) {
                    int U;
                    U = i7.this.U(i12, i11, i17, i18, i19, i20);
                    return U;
                }
            } : null);
            if (w.G2()) {
                i14 = Log.TAG_CRASH;
            }
            g.b y10 = o10.y(i14);
            h6 h6Var = this.Q;
            g f12 = y10.i(l0.F(h6Var.O0, webPage.description, h6Var.h8())).f();
            this.f13115g0 = f12;
            i12 += f12.getHeight();
        } else {
            this.f13115g0 = null;
        }
        int i17 = this.N + i12;
        this.N = i17;
        c cVar = this.T;
        if (cVar != null) {
            this.N = i17 + cVar.h();
        }
        this.Z = this.N;
    }

    public void r(int i10) {
        char c10;
        this.M = i10;
        int i11 = i10 - f13105z0;
        this.N = 0;
        if (this.f13110c == 0) {
            String str = this.R.type;
            str.hashCode();
            switch (str.hashCode()) {
                case -1890252483:
                    if (str.equals("sticker")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1597886577:
                    if (str.equals("telegram_megagroup")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -830003081:
                    if (str.equals("telegram_adx")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -830001783:
                    if (str.equals("telegram_bot")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -732377866:
                    if (str.equals("article")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -590382139:
                    if (str.equals("telegram_channel")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -374407479:
                    if (str.equals("telegram_message")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 96801:
                    if (str.equals("app")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 102340:
                    if (str.equals("gif")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 39771094:
                    if (str.equals("telegram_chat")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 40318025:
                    if (str.equals("telegram_user")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 93166550:
                    if (str.equals("audio")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 106642994:
                    if (str.equals("photo")) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 112202875:
                    if (str.equals("video")) {
                        c10 = '\r';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 112386354:
                    if (str.equals("voice")) {
                        c10 = 14;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 415483692:
                    if (str.equals("telegram_background")) {
                        c10 = 15;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 861720859:
                    if (str.equals("document")) {
                        c10 = 16;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1231177137:
                    if (str.equals("telegram_album")) {
                        c10 = 17;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1248607499:
                    if (str.equals("telegram_theme")) {
                        c10 = 18;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                case 11:
                case 14:
                case 16:
                    TdApi.WebPage webPage = this.R;
                    if (webPage.video == null) {
                        TdApi.Sticker sticker = webPage.sticker;
                        if (sticker == null) {
                            if (webPage.animation == null) {
                                if (webPage.voiceNote != null || webPage.audio != null || webPage.document != null) {
                                    this.f13110c = 6;
                                    break;
                                } else {
                                    Log.w("WebPage, received null for %s", webPage.type);
                                    break;
                                }
                            } else {
                                this.f13110c = 3;
                                break;
                            }
                        } else {
                            this.f13110c = Math.max(sticker.width, sticker.height) <= 512 ? 7 : 4;
                            break;
                        }
                    } else {
                        this.f13110c = 1;
                        break;
                    }
                    break;
                case 1:
                    this.f13110c = 11;
                    break;
                case 2:
                    this.f13110c = 19;
                    break;
                case 3:
                    this.f13110c = 13;
                    break;
                case 4:
                    if (this.R.video == null) {
                        this.f13110c = 2;
                        break;
                    } else {
                        this.f13110c = 1;
                        break;
                    }
                case 5:
                    this.f13110c = 10;
                    break;
                case 6:
                    this.f13110c = 15;
                    break;
                case 7:
                    this.f13110c = 5;
                    break;
                case '\b':
                    TdApi.WebPage webPage2 = this.R;
                    if (webPage2.animation == null) {
                        Log.w("WebPage, received null %s", webPage2.type);
                        break;
                    } else {
                        this.f13110c = 3;
                        break;
                    }
                case '\t':
                    this.f13110c = 12;
                    break;
                case '\n':
                    this.f13110c = 14;
                    break;
                case '\f':
                    TdApi.WebPage webPage3 = this.R;
                    if (webPage3.photo == null) {
                        Log.w("WebPage, received null %s", webPage3.type);
                        break;
                    } else {
                        this.f13110c = 4;
                        break;
                    }
                case '\r':
                    this.f13110c = 1;
                    break;
                case 15:
                    this.f13110c = 18;
                    break;
                case 17:
                    this.f13110c = 16;
                    break;
                case 18:
                    this.f13110c = 17;
                    break;
                default:
                    Log.w("Unsupported WebPage content, type: %s", this.R.type);
                    break;
            }
        }
        if (!Q(this.f13110c) && this.Q.c().hd().n3(this.S) == 1) {
            this.f13110c = 15;
        }
        if (L()) {
            q(this.R, i11);
        }
        if (X(this.R)) {
            TdApi.WebPage webPage4 = this.R;
            if (webPage4.animation != null) {
                p(webPage4, i11);
            } else if (webPage4.video != null) {
                u(webPage4, i11);
            } else {
                s(webPage4, i11);
            }
        } else {
            int i12 = this.f13110c;
            if (i12 == 1) {
                u(this.R, i11);
            } else if (i12 != 19) {
                if (i12 == 3) {
                    p(this.R, i11);
                } else if (i12 != 4) {
                    if (i12 == 18) {
                        String[] split = this.S.split("/bg/");
                        if (split.length == 2) {
                            this.T = new t7(this.Q, this.R, split[1]);
                        } else {
                            TdApi.Document document = this.R.document;
                            if (document != null) {
                                this.T = new n(this.Q, document);
                            } else {
                                this.T = null;
                            }
                        }
                    } else {
                        TdApi.WebPage webPage5 = this.R;
                        TdApi.Audio audio = webPage5.audio;
                        if (audio != null) {
                            this.T = new n(this.Q, audio, (TdApi.Message) null, (o0.c) null);
                        } else {
                            TdApi.VoiceNote voiceNote = webPage5.voiceNote;
                            if (voiceNote != null) {
                                this.T = new n(this.Q, voiceNote, (TdApi.Message) null, (o0.c) null);
                            } else {
                                TdApi.Document document2 = webPage5.document;
                                if (document2 != null) {
                                    this.T = new n(this.Q, document2);
                                } else {
                                    this.T = null;
                                }
                            }
                        }
                    }
                    c cVar = this.T;
                    if (cVar != null) {
                        cVar.p(this.f13116h0);
                        this.T.a(i11);
                        if (L()) {
                            this.N += B0;
                        }
                        int i13 = this.N;
                        this.U = i13;
                        this.N = i13 + this.T.h();
                    } else if (P(this.f13110c)) {
                        if (this.f13117i0 != null) {
                            int i14 = this.N;
                            int i15 = this.f13109b0;
                            int i16 = this.f13112d0;
                            if (i14 < i15 + i16) {
                                this.N = i15 + i16;
                            }
                        }
                        this.N += f13101v0;
                    } else {
                        TdApi.WebPage webPage6 = this.R;
                        if (webPage6.video != null) {
                            u(webPage6, i11);
                        } else if (webPage6.animation != null) {
                            p(webPage6, i11);
                        } else if (!(webPage6.photo == null && webPage6.sticker == null)) {
                            s(webPage6, i11);
                        }
                    }
                } else {
                    s(this.R, i11);
                }
            }
        }
        t();
        if ((this.f13106a & 2) == 0 && Z()) {
            this.f13106a |= 2;
            this.Q.c().v4().o(new TdApi.GetWebPageInstantView(this.S, false), this);
        }
        m0(this.f13116h0);
        this.N += A0;
    }

    @Override
    public void r2(TdApi.Object object) {
        TdApi.PageBlock[] pageBlockArr;
        qd.b bVar;
        if (object.getConstructor() == 778202453) {
            TdApi.PageBlock[] pageBlockArr2 = ((TdApi.WebPageInstantView) object).pageBlocks;
            int length = pageBlockArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    TdApi.PageBlock pageBlock = pageBlockArr2[i10];
                    int constructor = pageBlock.getConstructor();
                    if (constructor != 539217375) {
                        if (constructor == 1163760110) {
                            pageBlockArr = ((TdApi.PageBlockCollage) pageBlock).pageBlocks;
                            break;
                        }
                        i10++;
                    } else {
                        pageBlockArr = ((TdApi.PageBlockSlideshow) pageBlock).pageBlocks;
                        break;
                    }
                } else {
                    pageBlockArr = null;
                    break;
                }
            }
            if (pageBlockArr != null && pageBlockArr.length > 1) {
                f0 f0Var = this.f13117i0;
                TdApi.File P = f0Var != null ? f0Var.P() : null;
                int i11 = P != null ? P.f19913id : 0;
                final ArrayList arrayList = new ArrayList(pageBlockArr.length);
                int length2 = pageBlockArr.length;
                int i12 = 0;
                int i13 = -1;
                int i14 = 0;
                while (true) {
                    if (i12 >= length2) {
                        break;
                    }
                    TdApi.PageBlock pageBlock2 = pageBlockArr[i12];
                    int constructor2 = pageBlock2.getConstructor();
                    if (constructor2 == 417601156) {
                        TdApi.PageBlockPhoto pageBlockPhoto = (TdApi.PageBlockPhoto) pageBlock2;
                        String h22 = t2.h2(pageBlockPhoto.caption.text);
                        bVar = qd.b.W0(this.Q.t(), this.Q.c(), pageBlockPhoto.photo, new TdApi.FormattedText(h22, g.G(h22, 1)));
                    } else if (constructor2 == 510041394) {
                        TdApi.PageBlockVideo pageBlockVideo = (TdApi.PageBlockVideo) pageBlock2;
                        String h23 = t2.h2(pageBlockVideo.caption.text);
                        bVar = qd.b.X0(this.Q.t(), this.Q.c(), pageBlockVideo.video, new TdApi.FormattedText(h23, g.G(h23, 1)));
                    } else if (constructor2 != 1355669513) {
                        bVar = null;
                    } else {
                        TdApi.PageBlockAnimation pageBlockAnimation = (TdApi.PageBlockAnimation) pageBlock2;
                        String h24 = t2.h2(pageBlockAnimation.caption.text);
                        bVar = qd.b.U0(this.Q.t(), this.Q.c(), pageBlockAnimation.animation, new TdApi.FormattedText(h24, g.G(h24, 1)));
                    }
                    if (bVar == null) {
                        arrayList.clear();
                        break;
                    }
                    if (i13 == -1 && bVar.w() == i11) {
                        bVar.O0(this.Q.X3());
                        i13 = i14;
                    }
                    arrayList.add(bVar);
                    i14++;
                    i12++;
                }
                if (arrayList.size() > 1) {
                    if (i13 == -1) {
                        i13 = 0;
                    }
                    if (!N()) {
                        final String j12 = w.j1(R.string.XofY, Integer.valueOf(i13 + 1), Integer.valueOf(arrayList.size()));
                        final float T1 = v0.T1(j12, y.F0(13.0f, false, true));
                        final int i15 = i13;
                        this.Q.c().hd().post(new Runnable() {
                            @Override
                            public final void run() {
                                i7.this.V(arrayList, j12, T1, i15);
                            }
                        });
                    }
                }
            }
        }
    }

    public final void s(TdApi.WebPage webPage, int i10) {
        if (L()) {
            int i11 = B0;
            i0(i10, i11, f13101v0 + i11);
            return;
        }
        i0(i10, 0, -A0);
    }

    public final void t() {
        int i10;
        int i11;
        if (Y()) {
            i11 = R.string.InstantView;
            i10 = R.drawable.deproko_baseline_instantview_24;
        } else {
            switch (this.f13110c) {
                case 10:
                    i11 = R.string.OpenChannel;
                    break;
                case 11:
                    i11 = R.string.OpenGroup;
                    break;
                case 12:
                    i11 = R.string.OpenChat;
                    break;
                case 13:
                    i11 = R.string.OpenBot;
                    break;
                case 14:
                    i11 = R.string.OpenProfile;
                    break;
                case 15:
                case 16:
                    if (this.Q.c().x7(this.S)) {
                        i11 = R.string.OpenMessage;
                        break;
                    }
                case 17:
                default:
                    i11 = 0;
                    break;
                case 18:
                    i11 = R.string.ChatBackgroundView;
                    break;
                case 19:
                    i11 = this.Q.ha();
                    break;
            }
            i10 = 0;
        }
        if (i11 != 0) {
            int i12 = this.N + a0.i(6.0f);
            this.f13125q0 = i12;
            this.N = i12 + c4.o();
            c4 c4Var = new c4(this.Q, false);
            this.f13126r0 = c4Var;
            c4Var.A(i10, w.i1(i11), this.M - f13105z0, this.f13110c != 19, this);
        }
    }

    public final void u(TdApi.WebPage webPage, int i10) {
        if (webPage.video != null || webPage.photo != null) {
            int i11 = webPage.duration;
            if (i11 != 0) {
                j0(c0.h(i11));
            }
            if (L()) {
                int i12 = B0;
                i0(i10, i12, f13101v0 + i12);
                return;
            }
            i0(i10, 0, -A0);
        }
    }

    public void v() {
        this.f13106a |= 1;
    }

    public void w(vc.g1 g1Var, Canvas canvas, int i10, int i11, v vVar, v vVar2, float f10) {
        Canvas canvas2;
        int i12;
        vc.g1 g1Var2;
        int i13;
        int K = K();
        boolean G2 = w.G2();
        if (this.f13110c != 19) {
            x(canvas, i10, i11, K, G2);
        }
        c cVar = this.T;
        int i14 = 0;
        if (cVar != null) {
            int i15 = G2 ? i10 : f13105z0 + i10;
            int i16 = i11 + this.U;
            h6 h6Var = this.Q;
            int V2 = h6Var != null ? h6Var.V2() : 0;
            h6 h6Var2 = this.Q;
            if (h6Var2 != null) {
                i14 = h6Var2.Z2();
            }
            i13 = 19;
            i12 = i10;
            canvas2 = canvas;
            int i17 = V2;
            g1Var2 = g1Var;
            cVar.b(g1Var, canvas, i15, i16, vVar, vVar2, i17, i14, f10, 0.0f);
        } else {
            i12 = i10;
            canvas2 = canvas;
            g1Var2 = g1Var;
            i13 = 19;
            f0 f0Var = this.f13117i0;
            if (f0Var != null) {
                int i18 = G2 ? ((K + i12) - this.f13107a0) - this.f13111c0 : this.f13107a0 + i12;
                int i19 = i11 + this.f13109b0;
                f0Var.s(g1Var, canvas, i18, i19, vVar, vVar2, 1.0f);
                String str = null;
                float f11 = 0.0f;
                if (!i.i(this.f13123o0)) {
                    str = this.f13123o0;
                    f11 = this.f13124p0;
                } else if (!i.i(this.W)) {
                    str = this.W;
                    f11 = this.V;
                }
                if (!i.i(str)) {
                    int i20 = i18 + this.f13111c0;
                    int i21 = i19 + this.f13112d0;
                    RectF a02 = y.a0();
                    if (str.charAt(0) == '1') {
                        int i22 = C0;
                        a02.set((((i20 - i22) - (D0 * 2)) - f11) + G0, (i21 - i22) - E0, i20 - i22, i21 - i22);
                    } else {
                        int i23 = C0;
                        a02.set(((i20 - i23) - (D0 * 2)) - f11, (i21 - i23) - E0, i20 - i23, i21 - i23);
                    }
                    canvas2.drawRoundRect(a02, a0.i(4.0f), a0.i(4.0f), y.g(1275068416));
                    int i24 = C0;
                    canvas2.drawText(str, ((i20 - i24) - D0) - f11, ((i21 - i24) - E0) + F0, y.F0(13.0f, false, false));
                }
            } else if (!(this.f13118j0 == null && this.f13120l0 == null)) {
                int i25 = G2 ? ((i12 + K) - this.f13107a0) - this.f13111c0 : this.f13107a0 + i12;
                int i26 = i11 + this.f13109b0;
                ce.b.u(canvas, vVar, vVar2, false, true, i25, i26, i25 + this.f13121m0, i26 + this.f13122n0);
            }
        }
        c4 c4Var = this.f13126r0;
        if (c4Var == null) {
            return;
        }
        if (this.f13110c == i13) {
            c4Var.j(g1Var2, canvas2, i12, i11 + this.f13125q0);
        } else {
            c4Var.j(g1Var2, canvas2, G2 ? i12 : f13105z0 + i12, i11 + this.f13125q0);
        }
    }

    public final void x(Canvas canvas, int i10, int i11, int i12, boolean z10) {
        RectF a02 = y.a0();
        if (z10) {
            int i13 = i10 + i12;
            a02.set(i13 - A0, i11, i13, this.N + i11);
        } else {
            a02.set(i10, i11, A0 + i10, this.N + i11);
        }
        int i14 = A0;
        canvas.drawRoundRect(a02, i14 / 2, i14 / 2, y.g(this.Q.V4()));
        int i15 = 0;
        if (this.f13113e0 != null) {
            int i16 = a0.i(f13100u0) + 0;
            g gVar = this.f13113e0;
            int i17 = z10 ? i10 : f13105z0 + i10;
            int i18 = i10 + i12;
            if (z10) {
                i18 -= f13105z0;
            }
            gVar.u(canvas, i17, i18, 0, i11 + i16);
            i15 = this.f13113e0.getHeight() + i16;
        }
        if (this.f13114f0 != null) {
            if (i15 > 0) {
                i15 += a0.i(f13099t0);
            }
            g gVar2 = this.f13114f0;
            int i19 = z10 ? i10 : f13105z0 + i10;
            int i20 = i10 + i12;
            if (z10) {
                i20 -= f13105z0;
            }
            gVar2.u(canvas, i19, i20, 0, i11 + i15);
            i15 += this.f13114f0.getHeight();
        }
        if (this.f13115g0 != null) {
            if (i15 > 0) {
                i15 += a0.i(f13099t0);
            }
            g gVar3 = this.f13115g0;
            int i21 = z10 ? i10 : f13105z0 + i10;
            int i22 = i10 + i12;
            if (z10) {
                i22 -= f13105z0;
            }
            gVar3.u(canvas, i21, i22, 0, i11 + i15);
            this.f13115g0.getHeight();
        }
    }

    public n y() {
        c cVar = this.T;
        if (cVar instanceof n) {
            return (n) cVar;
        }
        return null;
    }

    public int z() {
        return this.N;
    }
}
