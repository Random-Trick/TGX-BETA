package gd;

import ad.AbstractView$OnClickListenerC0259c;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1359b;
import be.C1363c0;
import be.C1410y;
import gd.C4602c4;
import gd.C4630f0;
import gd.C4666i7;
import ie.AbstractC5411l0;
import ie.RunnableC5390g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import me.C6883g1;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p038ce.View$OnClickListenerC3147u9;
import p080fb.AbstractC4345j;
import p080fb.C4335b;
import p080fb.C4336c;
import p082fd.C4403w;
import p108hb.C5070i;
import p156kd.AbstractC6264v;
import p156kd.C6240c;
import p156kd.C6246h;
import p156kd.C6257p;
import p168ld.C6503j;
import p168ld.RunnableC6507m;
import p193nb.C7321e;
import p194nd.View$OnClickListenerC7430j1;
import p225pd.C8112b;
import p291uc.C9552h1;
import p292ud.C9773p0;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import td.AbstractC9323v4;

public class C4666i7 implements C6883g1.AbstractC6886c, C4630f0.AbstractC4631a, C4602c4.AbstractC4606b, Client.AbstractC7865g {
    public static int f15582A0 = 0;
    public static int f15583B0 = 0;
    public static int f15584C0 = 0;
    public static int f15585D0 = 0;
    public static int f15586E0 = 0;
    public static int f15587F0 = 0;
    public static int f15588G0 = 0;
    public static float f15589t0 = 4.0f;
    public static float f15590u0 = 2.0f;
    public static int f15591v0;
    public static int f15592w0;
    public static int f15593x0;
    public static int f15594y0;
    public static int f15595z0;
    public int f15596M;
    public int f15597N;
    public long f15598O;
    public long f15599P;
    public final C4656h6 f15600Q;
    public final TdApi.WebPage f15601R;
    public final String f15602S;
    public AbstractC4597c f15603T;
    public int f15604U;
    public float f15605V;
    public String f15606W;
    public ArrayList<C8112b> f15607X;
    public int f15608Y;
    public int f15609Z;
    public int f15610a;
    public int f15611a0;
    public boolean f15612b;
    public int f15613b0;
    public int f15614c;
    public int f15615c0;
    public int f15616d0;
    public RunnableC5390g f15617e0;
    public RunnableC5390g f15618f0;
    public RunnableC5390g f15619g0;
    public AbstractC4345j f15620h0;
    public C4630f0 f15621i0;
    public C6246h f15622j0;
    public C6246h f15623k0;
    public C6503j f15624l0;
    public int f15625m0;
    public int f15626n0;
    public String f15627o0;
    public int f15628p0;
    public int f15629q0;
    public C4602c4 f15630r0;
    public final C4336c f15631s0 = new C4336c(new C4667a());

    public class C4667a implements C4336c.AbstractC4337a {
        public C4667a() {
        }

        @Override
        public boolean mo7429B(float f, float f2) {
            return C4335b.m28258d(this, f, f2);
        }

        @Override
        public void mo7428C(View view, float f, float f2) {
            if (C4666i7.this.f15601R.sticker != null && C4666i7.this.f15601R.sticker.setId != 0) {
                C4666i7.this.f15600Q.mo4348c().m2485dd().m3777M8(C4666i7.this.f15600Q.m26096P0(), C4666i7.this.f15601R.sticker.setId);
            }
        }

        @Override
        public void mo7427F(View view, float f, float f2) {
            C4335b.m28254h(this, view, f, f2);
        }

        @Override
        public boolean mo7426K4() {
            return C4335b.m28261a(this);
        }

        @Override
        public boolean mo7425W6(float f, float f2) {
            return C4335b.m28259c(this, f, f2);
        }

        @Override
        public void mo7424Z4(View view, float f, float f2) {
            C4335b.m28256f(this, view, f, f2);
        }

        @Override
        public void mo7419f3(View view, float f, float f2) {
            C4335b.m28257e(this, view, f, f2);
        }

        @Override
        public long getLongPressDuration() {
            return C4335b.m28260b(this);
        }

        @Override
        public boolean mo7418n0(View view, float f, float f2) {
            C9552h1 h1Var = (C9552h1) view;
            AbstractC6264v gifReceiver = C4666i7.this.m26570W() ? h1Var.getGifReceiver() : h1Var.getPreviewReceiver();
            return (gifReceiver == null || !gifReceiver.mo20239k1(f, f2, 0, 0) || (C4666i7.this.f15624l0 == null && C4666i7.this.f15622j0 == null) || C4666i7.this.f15601R.sticker == null || C4666i7.this.f15601R.sticker.setId == 0) ? false : true;
        }

        @Override
        public void mo7417o2(View view, float f, float f2) {
            C4335b.m28255g(this, view, f, f2);
        }

        @Override
        public void mo7416p(View view, float f, float f2) {
            C4335b.m28253i(this, view, f, f2);
        }

        @Override
        public boolean mo7415z4(View view, float f, float f2) {
            return C4335b.m28251k(this, view, f, f2);
        }

        @Override
        public void mo7414z6(View view, MotionEvent motionEvent, float f, float f2, float f3, float f4) {
            C4335b.m28252j(this, view, motionEvent, f, f2, f3, f4);
        }
    }

    public class C4668b implements Client.AbstractC7865g {
        public final boolean[] f15633M;
        public final TdApi.WebPage f15634N;
        public final String f15635O;
        public final int f15637a;
        public final C4602c4.C4603a f15638b;
        public final View f15639c;

        public C4668b(int i, C4602c4.C4603a aVar, View view, boolean[] zArr, TdApi.WebPage webPage, String str) {
            this.f15637a = i;
            this.f15638b = aVar;
            this.f15639c = view;
            this.f15633M = zArr;
            this.f15634N = webPage;
            this.f15635O = str;
        }

        public static void m26525e(int i, C4602c4.C4603a aVar, View view) {
            if (i == aVar.m26966P()) {
                aVar.m26908x0();
                aVar.m26975K0(view, R.string.InstantViewUnsupported);
            }
        }

        public static void m26524f(int i, C4602c4.C4603a aVar, View view, boolean[] zArr, TdApi.WebPageInstantView webPageInstantView) {
            StringBuilder sb2;
            String str;
            if (i == aVar.m26966P()) {
                aVar.m26908x0();
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
                aVar.m26973L0(view, sb3.toString());
            }
        }

        public void m26523g(int i, C4602c4.C4603a aVar, TdApi.WebPage webPage, TdApi.WebPageInstantView webPageInstantView, String str, View view) {
            if (i == aVar.m26966P()) {
                aVar.m26908x0();
                View$OnClickListenerC3147u9 u9Var = new View$OnClickListenerC3147u9(C4666i7.this.f15600Q.m26096P0().mo4347s(), C4666i7.this.f15600Q.mo4348c());
                u9Var.m9476Ad(new View$OnClickListenerC3147u9.C3149b(webPage, webPageInstantView, str));
                try {
                    u9Var.m31337bf();
                } catch (UnsupportedOperationException e) {
                    Log.m14710w("Unsupported Instant View block:%s", e, webPage.url);
                    aVar.m26975K0(view, R.string.InstantViewUnsupported);
                    u9Var.mo417Z8();
                } catch (Throwable th) {
                    Log.m14725e("Unable to open Instant View, url:%s", th, webPage.url);
                    aVar.m26975K0(view, R.string.InstantViewError);
                    u9Var.mo417Z8();
                }
            }
        }

        public static void m26522h(int i, C4602c4.C4603a aVar, View view, TdApi.Object object) {
            if (i == aVar.m26966P()) {
                aVar.m26908x0();
                aVar.m26973L0(view, C4779t2.m25378z5(object));
            }
        }

        @Override
        public void mo255t2(final TdApi.Object object) {
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                HandlerC10770jj dd = C4666i7.this.f15600Q.mo4348c().m2485dd();
                final int i = this.f15637a;
                final C4602c4.C4603a aVar = this.f15638b;
                final View view = this.f15639c;
                dd.post(new Runnable() {
                    @Override
                    public final void run() {
                        C4666i7.C4668b.m26522h(i, aVar, view, object);
                    }
                });
            } else if (constructor != 778202453) {
                Log.unexpectedTdlibResponse(object, TdApi.GetWebPageInstantView.class, TdApi.WebPageInstantView.class);
                HandlerC10770jj dd2 = C4666i7.this.f15600Q.mo4348c().m2485dd();
                final C4602c4.C4603a aVar2 = this.f15638b;
                Objects.requireNonNull(aVar2);
                dd2.post(new Runnable() {
                    @Override
                    public final void run() {
                        C4602c4.C4603a.this.m26908x0();
                    }
                });
            } else {
                final TdApi.WebPageInstantView webPageInstantView = (TdApi.WebPageInstantView) object;
                if (!C4779t2.m25388y2(webPageInstantView.version)) {
                    HandlerC10770jj dd3 = C4666i7.this.f15600Q.mo4348c().m2485dd();
                    final int i2 = this.f15637a;
                    final C4602c4.C4603a aVar3 = this.f15638b;
                    final View view2 = this.f15639c;
                    dd3.post(new Runnable() {
                        @Override
                        public final void run() {
                            C4666i7.C4668b.m26525e(i2, aVar3, view2);
                        }
                    });
                    return;
                }
                TdApi.PageBlock[] pageBlockArr = webPageInstantView.pageBlocks;
                if (pageBlockArr == null || pageBlockArr.length == 0) {
                    boolean[] zArr = this.f15633M;
                    if (!zArr[0] && !webPageInstantView.isFull) {
                        zArr[0] = true;
                        C4666i7.this.f15600Q.mo4348c().m2270r4().m14783o(new TdApi.GetWebPageInstantView(this.f15634N.url, false), this);
                        return;
                    }
                    HandlerC10770jj dd4 = C4666i7.this.f15600Q.mo4348c().m2485dd();
                    final int i3 = this.f15637a;
                    final C4602c4.C4603a aVar4 = this.f15638b;
                    final View view3 = this.f15639c;
                    final boolean[] zArr2 = this.f15633M;
                    dd4.post(new Runnable() {
                        @Override
                        public final void run() {
                            C4666i7.C4668b.m26524f(i3, aVar4, view3, zArr2, webPageInstantView);
                        }
                    });
                    return;
                }
                HandlerC10770jj dd5 = C4666i7.this.f15600Q.mo4348c().m2485dd();
                final int i4 = this.f15637a;
                final C4602c4.C4603a aVar5 = this.f15638b;
                final TdApi.WebPage webPage = this.f15634N;
                final String str = this.f15635O;
                final View view4 = this.f15639c;
                dd5.post(new Runnable() {
                    @Override
                    public final void run() {
                        C4666i7.C4668b.this.m26523g(i4, aVar5, webPage, webPageInstantView, str, view4);
                    }
                });
            }
        }
    }

    public C4666i7(C4656h6 h6Var, TdApi.WebPage webPage, String str) {
        if (f15595z0 == 0) {
            m26580M();
        }
        this.f15620h0 = h6Var.f16101P0;
        this.f15600Q = h6Var;
        this.f15601R = webPage;
        this.f15602S = str;
        this.f15598O = h6Var.m26145K2();
        this.f15599P = h6Var.m26115N3();
    }

    public static void m26580M() {
        f15591v0 = C1357a0.m37541i(2.0f);
        f15592w0 = C1357a0.m37541i(12.0f);
        f15593x0 = C1357a0.m37541i(60.0f);
        f15594y0 = C1357a0.m37541i(23.0f);
        f15582A0 = C1357a0.m37541i(3.0f);
        f15595z0 = C1357a0.m37541i(10.0f);
        f15583B0 = C1357a0.m37541i(8.0f);
        f15584C0 = C1357a0.m37541i(6.0f);
        f15585D0 = C1357a0.m37541i(5.0f);
        f15586E0 = C1357a0.m37541i(20.0f);
        f15587F0 = C1357a0.m37541i(14.5f);
        f15588G0 = C1357a0.m37541i(1.0f);
    }

    public static boolean m26577P(int i) {
        if (i == 2 || i == 5) {
            return true;
        }
        switch (i) {
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

    public static boolean m26576Q(int i) {
        switch (i) {
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

    public int m26574S(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i4 + i;
        int i8 = i6 + i7;
        int i9 = this.f15613b0;
        return (i8 < i9 || i7 >= i9 + f15593x0) ? i5 : i2;
    }

    public int m26573T(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i4 + i;
        int i8 = i6 + i7;
        int i9 = this.f15613b0;
        return (i8 < i9 || i7 >= i9 + f15593x0) ? i5 : i2;
    }

    public int m26572U(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i4 + i;
        int i8 = i6 + i7;
        int i9 = this.f15613b0;
        return (i8 < i9 || i7 >= i9 + f15593x0) ? i5 : i2;
    }

    public static boolean m26569X(TdApi.WebPage webPage) {
        if (webPage == null || !C4779t2.m25381z2(webPage)) {
            return false;
        }
        TdApi.Photo photo = webPage.photo;
        if (photo == null || C4779t2.m25422t3(photo)) {
            TdApi.Video video = webPage.video;
            return video != null && Math.max(video.width, video.height) >= 400;
        }
        TdApi.PhotoSize A0 = C7321e.m17018A0(webPage.photo);
        return A0 != null && Math.max(A0.width, A0.height) >= 400;
    }

    public static void m26554h0() {
        f15595z0 = 0;
    }

    public int m26592A(boolean z) {
        AbstractC4597c cVar = this.f15603T;
        if (cVar != null) {
            return cVar.mo25244d(0);
        }
        return 0;
    }

    public ArrayList<C8112b> m26591B() {
        return this.f15607X;
    }

    public int m26590C() {
        return this.f15608Y;
    }

    public final Client.AbstractC7865g m26589D(View view, C4602c4.C4603a aVar, TdApi.WebPage webPage, String str) {
        return new C4668b(aVar.m26966P(), aVar, view, new boolean[1], webPage, str);
    }

    public int m26588E() {
        return -1;
    }

    public int m26587F() {
        return this.f15596M;
    }

    public C4630f0 m26586G() {
        return this.f15621i0;
    }

    public TdApi.File m26585H() {
        AbstractC4597c cVar = this.f15603T;
        if (cVar != null) {
            return cVar.mo25243g();
        }
        C4630f0 f0Var = this.f15621i0;
        if (f0Var != null) {
            return f0Var.m26767P();
        }
        return null;
    }

    public int m26584I() {
        return this.f15614c;
    }

    public TdApi.WebPage m26583J() {
        return this.f15601R;
    }

    public int m26582K() {
        if (this.f15630r0 != null) {
            return this.f15596M;
        }
        int i = this.f15625m0;
        int i2 = 0;
        int i3 = i != 0 ? i + f15595z0 : 0;
        AbstractC4597c cVar = this.f15603T;
        int j = cVar != null ? f15595z0 + cVar.mo25240j() : 0;
        RunnableC5390g gVar = this.f15617e0;
        int width = gVar != null ? f15595z0 + gVar.getWidth() : 0;
        int i4 = this.f15621i0 != null ? this.f15611a0 + this.f15615c0 : 0;
        RunnableC5390g gVar2 = this.f15618f0;
        int width2 = gVar2 != null ? f15595z0 + gVar2.getWidth() : 0;
        RunnableC5390g gVar3 = this.f15619g0;
        if (gVar3 != null) {
            i2 = f15595z0 + gVar3.getWidth();
        }
        return Math.max(i3, Math.max(j, Math.max(width, Math.max(i4, Math.max(width2, i2)))));
    }

    public final boolean m26581L() {
        return !C5070i.m24061i(this.f15601R.siteName) || !C5070i.m24061i(this.f15601R.title) || !C7321e.m16965a1(this.f15601R.description) || m26575R();
    }

    public boolean m26579N() {
        return (this.f15610a & 1) != 0;
    }

    public boolean m26578O(String str) {
        if (C5070i.m24061i(str)) {
            return false;
        }
        if (!str.contains("://")) {
            str = "https://" + str;
        }
        try {
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(this.f15601R.url);
            String host = parse.getHost();
            Locale locale = Locale.ROOT;
            if (C5070i.m24067c(host.toLowerCase(locale).replaceAll("^(?:www\\.|m\\.)", ""), parse2.getHost().toLowerCase(locale).replaceAll("^(?:www\\.|m\\.)", ""))) {
                return C5070i.m24067c(parse.getPath(), parse2.getPath());
            }
            return false;
        } catch (Throwable th) {
            Log.m14720i("Invalid url", th, new Object[0]);
            return false;
        }
    }

    public boolean m26575R() {
        return this.f15614c == 18;
    }

    public boolean m26570W() {
        C4630f0 f0Var = this.f15621i0;
        return (f0Var != null && f0Var.m26762U()) || this.f15624l0 != null;
    }

    public boolean m26568Y() {
        return this.f15614c != 19 && C4779t2.m25381z2(this.f15601R) && !m26567Z();
    }

    public boolean m26567Z() {
        int i = this.f15614c;
        return i != 19 && (i == 16 || C4779t2.m25483k5(this.f15601R.displayUrl));
    }

    @Override
    public void mo26566a(View view, C4602c4 c4Var, C4602c4.C4603a aVar) {
        if (m26568Y()) {
            aVar.m26910w0();
            aVar.m26977J0();
            this.f15600Q.mo4348c().m2270r4().m14783o(new TdApi.GetWebPageInstantView(this.f15602S, false), m26589D(view, aVar, this.f15601R, this.f15600Q.m26624fa(this.f15601R)));
            return;
        }
        m26562c0(view, false);
    }

    public void m26565a0() {
        C4630f0 f0Var = this.f15621i0;
        if (f0Var != null) {
            f0Var.m26779G().m18654P();
        }
    }

    @Override
    public void mo15929b(TdApi.File file, int i) {
    }

    public boolean m26564b0(C9552h1 h1Var, MotionEvent motionEvent, int i, int i2, RunnableC5390g.AbstractC5393c cVar) {
        C4602c4 c4Var = this.f15630r0;
        if (c4Var != null && c4Var.m27000w(h1Var, motionEvent)) {
            return true;
        }
        C4630f0 f0Var = this.f15621i0;
        if (f0Var != null && f0Var.m26745h0(h1Var, motionEvent)) {
            return true;
        }
        AbstractC4597c cVar2 = this.f15603T;
        if (cVar2 != null && cVar2.mo25239k(h1Var, motionEvent)) {
            return true;
        }
        if ((this.f15622j0 != null || this.f15624l0 != null) && this.f15631s0.m28246e(h1Var, motionEvent)) {
            return true;
        }
        RunnableC5390g gVar = this.f15617e0;
        if (gVar != null && gVar.m22965V0(h1Var, motionEvent, cVar)) {
            return true;
        }
        RunnableC5390g gVar2 = this.f15618f0;
        if (gVar2 != null && gVar2.m22965V0(h1Var, motionEvent, cVar)) {
            return true;
        }
        RunnableC5390g gVar3 = this.f15619g0;
        return gVar3 != null && gVar3.m22965V0(h1Var, motionEvent, cVar);
    }

    @Override
    public boolean mo26563c(View view, C4602c4 c4Var, C4602c4.C4603a aVar) {
        AbstractC9323v4<?> Z9;
        String str;
        if (this.f15614c != 19 || (Z9 = this.f15600Q.m26096P0().m9300Z9()) == null) {
            return false;
        }
        if (this.f15600Q.mo25841p6()) {
            str = this.f15600Q.m26620ja();
        } else {
            C4656h6 h6Var = this.f15600Q;
            str = this.f15600Q.f16099O0.m2637Tc(h6Var.f16099O0.m2462f4(h6Var.m26621ia()));
        }
        Z9.m9316Wd(str, this.f15600Q.m25916h8(), null);
        return false;
    }

    public boolean m26562c0(View view, boolean z) {
        C4602c4 c4Var;
        if (m26584I() == 18) {
            this.f15600Q.mo4348c().m2485dd().m3858E7(this.f15600Q.m26096P0(), this.f15602S, this.f15630r0.m27009n().m26995A0(view).m3326e());
            return true;
        } else if (this.f15621i0 != null && z && m26576Q(this.f15614c)) {
            View$OnClickListenerC7430j1.m16181lk(this.f15600Q);
            return true;
        } else if (z && (c4Var = this.f15630r0) != null && c4Var.m27014i(view)) {
            return true;
        } else {
            int I = m26584I();
            if (I == 3 || I == 4) {
                View$OnClickListenerC7430j1.m16181lk(this.f15600Q);
            } else if (I != 19) {
                switch (I) {
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        this.f15600Q.mo4348c().m2485dd().m3858E7(this.f15600Q.m26096P0(), this.f15602S, this.f15630r0.m27009n().m26995A0(view).m3326e());
                        break;
                    default:
                        C4630f0 f0Var = this.f15621i0;
                        if (f0Var == null || !f0Var.m26757Z()) {
                            if (!AbstractView$OnClickListenerC0259c.m41987S1(this.f15600Q.m26096P0(), this.f15601R, this.f15600Q.m25870m6())) {
                                if (this.f15621i0 != null && this.f15601R.photo != null) {
                                    View$OnClickListenerC7430j1.m16181lk(this.f15600Q);
                                    break;
                                } else {
                                    this.f15600Q.mo4348c().m2485dd().m3858E7(this.f15600Q.m26096P0(), this.f15602S, new HandlerC10770jj.C10788q(this.f15630r0.m27009n().m26995A0(view)).m3327d());
                                    break;
                                }
                            }
                        } else {
                            View$OnClickListenerC7430j1.m16181lk(this.f15600Q);
                            break;
                        }
                        break;
                }
            } else {
                this.f15600Q.m26625ea();
            }
            return true;
        }
    }

    public boolean m26560d0(View view, C4656h6 h6Var) {
        RunnableC5390g gVar;
        RunnableC5390g gVar2;
        C4602c4 c4Var;
        RunnableC5390g gVar3 = this.f15617e0;
        return (gVar3 != null && gVar3.m22963W0(view)) || ((gVar = this.f15618f0) != null && gVar.m22963W0(view)) || (((gVar2 = this.f15619g0) != null && gVar2.m22963W0(view)) || ((c4Var = this.f15630r0) != null && c4Var.m26998y(view)));
    }

    @Override
    public boolean mo15925e(C6883g1 g1Var, View view, TdApi.File file, long j) {
        return m26562c0(view, true);
    }

    public void m26559e0(C6257p pVar, int i, int i2) {
        C6246h hVar = this.f15622j0;
        if (hVar != null) {
            pVar.m20819G(hVar);
            return;
        }
        C4630f0 f0Var = this.f15621i0;
        if (f0Var != null) {
            f0Var.m26737l0(pVar);
            return;
        }
        AbstractC4597c cVar = this.f15603T;
        if (cVar != null) {
            cVar.mo25238l(pVar);
        } else {
            pVar.m20819G(null);
        }
    }

    @Override
    public void mo15923f(TdApi.File file, float f) {
    }

    public void m26558f0(RunnableC6507m mVar, int i, int i2) {
        C6503j jVar = this.f15624l0;
        if (jVar != null) {
            mVar.m20231r(jVar);
            return;
        }
        C4630f0 f0Var = this.f15621i0;
        if (f0Var != null) {
            f0Var.m26739k0(mVar);
        } else {
            mVar.m20231r(null);
        }
    }

    public void m26556g0(C6240c cVar, int i, int i2) {
        if (this.f15622j0 == null && this.f15624l0 == null) {
            C4630f0 f0Var = this.f15621i0;
            if (f0Var != null) {
                f0Var.m26735m0(cVar);
                return;
            }
            AbstractC4597c cVar2 = this.f15603T;
            if (cVar2 != null) {
                cVar2.mo25237m(cVar);
            } else {
                cVar.clear();
            }
        } else {
            cVar.m20977j(null, this.f15623k0);
        }
    }

    public final void m26552i0(int i, int i2, int i3) {
        TdApi.Sticker sticker;
        this.f15612b = true;
        int F4 = this.f15600Q.m26195F4();
        TdApi.Sticker sticker2 = this.f15601R.sticker;
        if (sticker2 == null || (Math.max(sticker2.width, sticker2.height) > 512 && !C7321e.m16976V0(this.f15601R.sticker.type))) {
            TdApi.WebPage webPage = this.f15601R;
            if (webPage.sticker != null) {
                this.f15621i0 = new C4630f0(this.f15600Q.mo4347s(), this.f15600Q.mo4348c(), C4779t2.m25551b0(this.f15601R.sticker), this.f15598O, this.f15599P, (AbstractC4761s4) this.f15600Q, false);
                m26550j0(C1363c0.m37423m(this.f15601R.sticker.sticker.size));
            } else if (webPage.video != null) {
                this.f15621i0 = new C4630f0(this.f15600Q.mo4347s(), this.f15600Q.mo4348c(), this.f15601R.video, this.f15598O, this.f15599P, (AbstractC4761s4) this.f15600Q, false);
            } else {
                Objects.requireNonNull(webPage.photo);
                AbstractView$OnTouchListenerC7889a s = this.f15600Q.mo4347s();
                C10930q6 c = this.f15600Q.mo4348c();
                TdApi.WebPage webPage2 = this.f15601R;
                this.f15621i0 = new C4630f0(s, c, webPage2.photo, this.f15598O, this.f15599P, this.f15600Q, false, false, C4658i.m26603i(webPage2));
            }
            this.f15621i0.m26790A0(this.f15620h0);
            this.f15621i0.m26723s0(this);
            float F = this.f15621i0.m26781F();
            float E = this.f15621i0.m26783E();
            float min = Math.min(i / F, F4 / E);
            int i4 = (int) (F * min);
            int i5 = (int) (min * E);
            this.f15621i0.m26740k(i4, i5);
            this.f15615c0 = i4;
            this.f15616d0 = i5;
        } else {
            float i6 = C1357a0.m37541i(190.0f);
            TdApi.Sticker sticker3 = this.f15601R.sticker;
            float min2 = Math.min(i6 / sticker3.width, i6 / sticker3.height);
            int i7 = (int) (sticker.width * min2);
            int i8 = (int) (sticker.height * min2);
            if (C7321e.m16976V0(this.f15601R.sticker.type)) {
                C6503j jVar = new C6503j(this.f15600Q.mo4348c(), this.f15601R.sticker);
                this.f15624l0 = jVar;
                jVar.m20297I(1);
            } else {
                C6246h hVar = new C6246h(this.f15600Q.mo4348c(), this.f15601R.sticker.sticker);
                this.f15622j0 = hVar;
                hVar.m20897s0(1);
                this.f15622j0.m20889x0();
                this.f15622j0.mo20767t0(Math.max(i7, i8));
            }
            C6246h D5 = C4779t2.m25704D5(this.f15600Q.mo4348c(), this.f15601R.sticker.thumbnail);
            this.f15623k0 = D5;
            if (D5 != null) {
                D5.m20897s0(1);
                this.f15623k0.m20889x0();
            }
            this.f15625m0 = i7;
            this.f15626n0 = i8;
            this.f15597N += i8;
        }
        int i9 = this.f15609Z + i2;
        this.f15609Z = i9;
        this.f15611a0 = f15595z0;
        this.f15613b0 = i9;
        this.f15597N += this.f15616d0 + i3;
    }

    public final void m26550j0(String str) {
        this.f15627o0 = str;
        this.f15628p0 = (int) C7389v0.m16680T1(str, C1410y.m37071G0(13.0f, false, true));
    }

    @Override
    public boolean mo26549k(View view, C4630f0 f0Var) {
        if ((!m26577P(this.f15614c) || this.f15612b || this.f15601R.photo == null) && this.f15607X == null) {
            return m26562c0(view, true);
        }
        this.f15621i0.f15393f0.m18617m();
        View$OnClickListenerC7430j1.m16181lk(this.f15600Q);
        return true;
    }

    public final void m26571V(ArrayList<C8112b> arrayList, String str, float f, int i) {
        if (!m26579N()) {
            this.f15607X = arrayList;
            this.f15606W = str;
            this.f15605V = f;
            this.f15608Y = i;
            C4630f0 f0Var = this.f15621i0;
            if (f0Var != null) {
                f0Var.m26779G().m18606r0(true);
            }
            AbstractC4345j jVar = this.f15620h0;
            if (jVar != null) {
                jVar.invalidate();
            }
        }
    }

    public final void m26546l0(TdApi.Photo photo) {
        if (C7321e.m17004H0(photo) != null) {
            this.f15612b = false;
            C4630f0 f0Var = new C4630f0(this.f15600Q.mo4347s(), this.f15600Q.mo4348c(), photo, this.f15598O, this.f15599P, this.f15600Q, false, false, C4658i.m26603i(this.f15601R));
            this.f15621i0 = f0Var;
            f0Var.m26790A0(this.f15620h0);
            this.f15621i0.m26733n0(true);
            this.f15621i0.m26723s0(this);
            C4630f0 f0Var2 = this.f15621i0;
            int i = f15593x0;
            f0Var2.m26740k(i, i);
            this.f15621i0.m26790A0(this.f15620h0);
        }
    }

    public void m26544m0(AbstractC4345j jVar) {
        this.f15620h0 = jVar;
        RunnableC5390g gVar = this.f15617e0;
        if (gVar != null) {
            gVar.m22914o1(jVar);
        }
        RunnableC5390g gVar2 = this.f15618f0;
        if (gVar2 != null) {
            gVar2.m22914o1(jVar);
        }
        RunnableC5390g gVar3 = this.f15619g0;
        if (gVar3 != null) {
            gVar3.m22914o1(jVar);
        }
        C4630f0 f0Var = this.f15621i0;
        if (f0Var != null) {
            f0Var.m26790A0(jVar);
        }
        AbstractC4597c cVar = this.f15603T;
        if (cVar != null) {
            cVar.mo25236n(jVar);
        }
        C4602c4 c4Var = this.f15630r0;
        if (c4Var != null) {
            c4Var.m27024B(jVar);
        }
    }

    public void m26542n0(long j, long j2, boolean z) {
        this.f15599P = j2;
        C4630f0 f0Var = this.f15621i0;
        if (f0Var != null) {
            f0Var.m26778G0(j, j2, z);
        }
        AbstractC4597c cVar = this.f15603T;
        if (!(cVar == null || cVar.mo25242h() == null)) {
            this.f15603T.mo25242h().m18653P0(j, j2, z);
        }
        ArrayList<C8112b> arrayList = this.f15607X;
        if (arrayList != null) {
            Iterator<C8112b> it = arrayList.iterator();
            while (it.hasNext()) {
                C8112b next = it.next();
                next.m13473x().m18653P0(j, j2, z);
                next.m13541O0(this.f15600Q.m25993Z3());
            }
        }
    }

    public void m26541o(TdApi.ChatType chatType) {
        C4630f0 f0Var = this.f15621i0;
        if (f0Var != null) {
            f0Var.m26779G().m18619l(chatType);
        }
    }

    public final void m26540p(TdApi.WebPage webPage, int i) {
        C4630f0 f0Var = new C4630f0(this.f15600Q.mo4347s(), this.f15600Q.mo4348c(), webPage.animation, this.f15598O, this.f15599P, this.f15600Q, false, false, false, C4658i.m26603i(webPage));
        this.f15621i0 = f0Var;
        f0Var.m26723s0(this);
        this.f15621i0.m26790A0(this.f15620h0);
        int F4 = this.f15600Q.m26195F4();
        float F = this.f15621i0.m26781F();
        float E = this.f15621i0.m26783E();
        float min = Math.min(i / F, F4 / E);
        int i2 = (int) (F * min);
        int i3 = (int) (min * E);
        this.f15621i0.m26740k(i2, i3);
        this.f15615c0 = i2;
        this.f15616d0 = i3;
        if (m26581L()) {
            this.f15609Z += f15583B0;
        }
        this.f15611a0 = f15595z0;
        this.f15613b0 = this.f15609Z;
        this.f15597N += this.f15616d0 + (m26581L() ? f15583B0 + f15591v0 : -f15582A0);
    }

    public final void m26539q(TdApi.WebPage webPage, int i) {
        final int i2;
        final int i3;
        if (m26569X(webPage) || !m26577P(this.f15614c) || C4779t2.m25422t3(webPage.photo)) {
            i2 = i;
        } else {
            int i4 = f15593x0;
            i2 = (i - f15592w0) - i4;
            this.f15611a0 = this.f15596M - i4;
            this.f15613b0 = f15594y0;
            this.f15616d0 = i4;
            this.f15615c0 = i4;
            if (this.f15621i0 == null) {
                m26546l0(webPage.photo);
            }
        }
        int i5 = 0;
        boolean z = this.f15621i0 != null && !this.f15612b;
        if (!C5070i.m24061i(webPage.siteName) || m26575R()) {
            final int i6 = C1357a0.m37541i(f15590u0) + 0;
            RunnableC5390g.AbstractC5397g e7Var = z ? new RunnableC5390g.AbstractC5397g() {
                @Override
                public final int mo9971a(int i7, int i8, int i9, int i10) {
                    int S;
                    S = C4666i7.this.m26574S(i6, i2, i7, i8, i9, i10);
                    return S;
                }
            } : null;
            String i1 = m26575R() ? C4403w.m27869i1(R.string.ChatBackground) : webPage.siteName;
            RunnableC5390g f = new RunnableC5390g.C5392b(i1, i, AbstractC4761s4.m26125M4(), this.f15600Q.m26175H2()).m22874p(2).m22875o(e7Var).m22865y((C4403w.m27984G2() ? Log.TAG_CRASH : 0) | 4).m22883g().m22881i(new AbstractC5411l0[]{AbstractC5411l0.m22791D(this.f15600Q.f16099O0, i1, new TdApi.TextEntity(0, i1.length(), new TdApi.TextEntityTypeTextUrl(this.f15602S)), this.f15600Q.m25916h8())}).m22884f();
            this.f15617e0 = f;
            i3 = i6 + f.getHeight();
        } else {
            this.f15617e0 = null;
            i3 = 0;
        }
        if (C5070i.m24061i(webPage.title) || m26575R()) {
            this.f15618f0 = null;
        } else {
            if (i3 > 0) {
                i3 += C1357a0.m37541i(f15589t0);
            }
            RunnableC5390g f2 = new RunnableC5390g.C5392b(webPage.title, i, AbstractC4761s4.m26125M4(), this.f15600Q.m26134L4()).m22874p(C4779t2.m25381z2(webPage) ? -1 : 4).m22875o(z ? new RunnableC5390g.AbstractC5397g() {
                @Override
                public final int mo9971a(int i7, int i8, int i9, int i10) {
                    int T;
                    T = C4666i7.this.m26573T(i3, i2, i7, i8, i9, i10);
                    return T;
                }
            } : null).m22865y((C4403w.m27984G2() ? Log.TAG_CRASH : 0) | 4).m22883g().m22884f();
            this.f15618f0 = f2;
            i3 += f2.getHeight();
        }
        if (!C7321e.m16965a1(webPage.description)) {
            if (i3 > 0) {
                i3 += C1357a0.m37541i(f15589t0);
            }
            RunnableC5390g.C5392b o = new RunnableC5390g.C5392b(webPage.description.text, i, AbstractC4761s4.m26125M4(), this.f15600Q.m26134L4()).m22874p(8).m22875o(z ? new RunnableC5390g.AbstractC5397g() {
                @Override
                public final int mo9971a(int i7, int i8, int i9, int i10) {
                    int U;
                    U = C4666i7.this.m26572U(i3, i2, i7, i8, i9, i10);
                    return U;
                }
            } : null);
            if (C4403w.m27984G2()) {
                i5 = Log.TAG_CRASH;
            }
            RunnableC5390g.C5392b y = o.m22865y(i5);
            C4656h6 h6Var = this.f15600Q;
            RunnableC5390g f3 = y.m22881i(AbstractC5411l0.m22789F(h6Var.f16099O0, webPage.description, h6Var.m25916h8())).m22884f();
            this.f15619g0 = f3;
            i3 += f3.getHeight();
        } else {
            this.f15619g0 = null;
        }
        int i7 = this.f15597N + i3;
        this.f15597N = i7;
        AbstractC4597c cVar = this.f15603T;
        if (cVar != null) {
            this.f15597N = i7 + cVar.mo25241i();
        }
        this.f15609Z = this.f15597N;
    }

    public void m26538r(int i) {
        char c;
        this.f15596M = i;
        int i2 = i - f15595z0;
        this.f15597N = 0;
        if (this.f15614c == 0) {
            String str = this.f15601R.type;
            str.hashCode();
            switch (str.hashCode()) {
                case -1890252483:
                    if (str.equals("sticker")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1597886577:
                    if (str.equals("telegram_megagroup")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -830003081:
                    if (str.equals("telegram_adx")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -830001783:
                    if (str.equals("telegram_bot")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -732377866:
                    if (str.equals("article")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -590382139:
                    if (str.equals("telegram_channel")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -374407479:
                    if (str.equals("telegram_message")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 96801:
                    if (str.equals("app")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 102340:
                    if (str.equals("gif")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 39771094:
                    if (str.equals("telegram_chat")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 40318025:
                    if (str.equals("telegram_user")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 93166550:
                    if (str.equals("audio")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 106642994:
                    if (str.equals("photo")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 112202875:
                    if (str.equals("video")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 112386354:
                    if (str.equals("voice")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 415483692:
                    if (str.equals("telegram_background")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 861720859:
                    if (str.equals("document")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 1231177137:
                    if (str.equals("telegram_album")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 1248607499:
                    if (str.equals("telegram_theme")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 11:
                case 14:
                case 16:
                    TdApi.WebPage webPage = this.f15601R;
                    if (webPage.video == null) {
                        TdApi.Sticker sticker = webPage.sticker;
                        if (sticker == null) {
                            if (webPage.animation == null) {
                                if (webPage.voiceNote != null || webPage.audio != null || webPage.document != null) {
                                    this.f15614c = 6;
                                    break;
                                } else {
                                    Log.m14709w("WebPage, received null for %s", webPage.type);
                                    break;
                                }
                            } else {
                                this.f15614c = 3;
                                break;
                            }
                        } else {
                            this.f15614c = Math.max(sticker.width, sticker.height) <= 512 ? 7 : 4;
                            break;
                        }
                    } else {
                        this.f15614c = 1;
                        break;
                    }
                    break;
                case 1:
                    this.f15614c = 11;
                    break;
                case 2:
                    this.f15614c = 19;
                    break;
                case 3:
                    this.f15614c = 13;
                    break;
                case 4:
                    if (this.f15601R.video == null) {
                        this.f15614c = 2;
                        break;
                    } else {
                        this.f15614c = 1;
                        break;
                    }
                case 5:
                    this.f15614c = 10;
                    break;
                case 6:
                    this.f15614c = 15;
                    break;
                case 7:
                    this.f15614c = 5;
                    break;
                case '\b':
                    TdApi.WebPage webPage2 = this.f15601R;
                    if (webPage2.animation == null) {
                        Log.m14709w("WebPage, received null %s", webPage2.type);
                        break;
                    } else {
                        this.f15614c = 3;
                        break;
                    }
                case '\t':
                    this.f15614c = 12;
                    break;
                case '\n':
                    this.f15614c = 14;
                    break;
                case '\f':
                    TdApi.WebPage webPage3 = this.f15601R;
                    if (webPage3.photo == null) {
                        Log.m14709w("WebPage, received null %s", webPage3.type);
                        break;
                    } else {
                        this.f15614c = 4;
                        break;
                    }
                case '\r':
                    this.f15614c = 1;
                    break;
                case 15:
                    this.f15614c = 18;
                    break;
                case 17:
                    this.f15614c = 16;
                    break;
                case 18:
                    this.f15614c = 17;
                    break;
                default:
                    Log.m14709w("Unsupported WebPage content, type: %s", this.f15601R.type);
                    break;
            }
        }
        if (!m26576Q(this.f15614c) && this.f15600Q.mo4348c().m2485dd().m3513n3(this.f15602S) == 1) {
            this.f15614c = 15;
        }
        if (m26581L()) {
            m26539q(this.f15601R, i2);
        }
        if (m26569X(this.f15601R)) {
            TdApi.WebPage webPage4 = this.f15601R;
            if (webPage4.animation != null) {
                m26540p(webPage4, i2);
            } else if (webPage4.video != null) {
                m26535u(webPage4, i2);
            } else {
                m26537s(webPage4, i2);
            }
        } else {
            int i3 = this.f15614c;
            if (i3 == 1) {
                m26535u(this.f15601R, i2);
            } else if (i3 != 19) {
                if (i3 == 3) {
                    m26540p(this.f15601R, i2);
                } else if (i3 != 4) {
                    if (i3 == 18) {
                        String[] split = this.f15602S.split("/bg/");
                        if (split.length == 2) {
                            this.f15603T = new C4799t7(this.f15600Q, this.f15601R, split[1]);
                        } else {
                            TdApi.Document document = this.f15601R.document;
                            if (document != null) {
                                this.f15603T = new C4707n(this.f15600Q, document);
                            } else {
                                this.f15603T = null;
                            }
                        }
                    } else {
                        TdApi.WebPage webPage5 = this.f15601R;
                        TdApi.Audio audio = webPage5.audio;
                        if (audio != null) {
                            this.f15603T = new C4707n(this.f15600Q, audio, (TdApi.Message) null, (C9773p0.AbstractC9776c) null);
                        } else {
                            TdApi.VoiceNote voiceNote = webPage5.voiceNote;
                            if (voiceNote != null) {
                                this.f15603T = new C4707n(this.f15600Q, voiceNote, (TdApi.Message) null, (C9773p0.AbstractC9776c) null);
                            } else {
                                TdApi.Document document2 = webPage5.document;
                                if (document2 != null) {
                                    this.f15603T = new C4707n(this.f15600Q, document2);
                                } else {
                                    this.f15603T = null;
                                }
                            }
                        }
                    }
                    AbstractC4597c cVar = this.f15603T;
                    if (cVar != null) {
                        cVar.mo25236n(this.f15620h0);
                        this.f15603T.mo25246a(i2);
                        if (m26581L()) {
                            this.f15597N += f15583B0;
                        }
                        int i4 = this.f15597N;
                        this.f15604U = i4;
                        this.f15597N = i4 + this.f15603T.mo25241i();
                    } else if (m26577P(this.f15614c)) {
                        if (this.f15621i0 != null) {
                            int i5 = this.f15597N;
                            int i6 = this.f15613b0;
                            int i7 = this.f15616d0;
                            if (i5 < i6 + i7) {
                                this.f15597N = i6 + i7;
                            }
                        }
                        this.f15597N += f15591v0;
                    } else {
                        TdApi.WebPage webPage6 = this.f15601R;
                        if (webPage6.video != null) {
                            m26535u(webPage6, i2);
                        } else if (webPage6.animation != null) {
                            m26540p(webPage6, i2);
                        } else if (!(webPage6.photo == null && webPage6.sticker == null)) {
                            m26537s(webPage6, i2);
                        }
                    }
                } else {
                    m26537s(this.f15601R, i2);
                }
            }
        }
        m26536t();
        if ((this.f15610a & 2) == 0 && m26567Z()) {
            this.f15610a |= 2;
            this.f15600Q.mo4348c().m2270r4().m14783o(new TdApi.GetWebPageInstantView(this.f15602S, false), this);
        }
        m26544m0(this.f15620h0);
        this.f15597N += f15582A0;
    }

    public final void m26537s(TdApi.WebPage webPage, int i) {
        if (m26581L()) {
            int i2 = f15583B0;
            m26552i0(i, i2, f15591v0 + i2);
            return;
        }
        m26552i0(i, 0, -f15582A0);
    }

    public final void m26536t() {
        int i;
        int i2;
        if (m26568Y()) {
            i2 = R.string.InstantView;
            i = R.drawable.deproko_baseline_instantview_24;
        } else {
            switch (this.f15614c) {
                case 10:
                    i2 = R.string.OpenChannel;
                    break;
                case 11:
                    i2 = R.string.OpenGroup;
                    break;
                case 12:
                    i2 = R.string.OpenChat;
                    break;
                case 13:
                    i2 = R.string.OpenBot;
                    break;
                case 14:
                    i2 = R.string.OpenProfile;
                    break;
                case 15:
                case 16:
                    if (this.f15600Q.mo4348c().m2235t7(this.f15602S)) {
                        i2 = R.string.OpenMessage;
                        break;
                    }
                case 17:
                default:
                    i2 = 0;
                    break;
                case 18:
                    i2 = R.string.ChatBackgroundView;
                    break;
                case 19:
                    i2 = this.f15600Q.m26622ha();
                    break;
            }
            i = 0;
        }
        if (i2 != 0) {
            int i3 = this.f15597N + C1357a0.m37541i(6.0f);
            this.f15629q0 = i3;
            this.f15597N = i3 + C4602c4.m27008o();
            C4602c4 c4Var = new C4602c4(this.f15600Q, false);
            this.f15630r0 = c4Var;
            c4Var.m27025A(i, C4403w.m27869i1(i2), this.f15596M - f15595z0, this.f15614c != 19, this);
        }
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        TdApi.PageBlock[] pageBlockArr;
        C8112b bVar;
        if (object.getConstructor() == 778202453) {
            TdApi.PageBlock[] pageBlockArr2 = ((TdApi.WebPageInstantView) object).pageBlocks;
            int length = pageBlockArr2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    TdApi.PageBlock pageBlock = pageBlockArr2[i];
                    int constructor = pageBlock.getConstructor();
                    if (constructor != 539217375) {
                        if (constructor == 1163760110) {
                            pageBlockArr = ((TdApi.PageBlockCollage) pageBlock).pageBlocks;
                            break;
                        }
                        i++;
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
                C4630f0 f0Var = this.f15621i0;
                TdApi.File P = f0Var != null ? f0Var.m26767P() : null;
                int i2 = P != null ? P.f25373id : 0;
                final ArrayList arrayList = new ArrayList(pageBlockArr.length);
                int length2 = pageBlockArr.length;
                int i3 = 0;
                int i4 = -1;
                int i5 = 0;
                while (true) {
                    if (i3 >= length2) {
                        break;
                    }
                    TdApi.PageBlock pageBlock2 = pageBlockArr[i3];
                    int constructor2 = pageBlock2.getConstructor();
                    if (constructor2 == 417601156) {
                        TdApi.PageBlockPhoto pageBlockPhoto = (TdApi.PageBlockPhoto) pageBlock2;
                        String h2 = C4779t2.m25507h2(pageBlockPhoto.caption.text);
                        bVar = C8112b.m13525W0(this.f15600Q.mo4347s(), this.f15600Q.mo4348c(), pageBlockPhoto.photo, new TdApi.FormattedText(h2, RunnableC5390g.m22996G(h2, 1)));
                    } else if (constructor2 == 510041394) {
                        TdApi.PageBlockVideo pageBlockVideo = (TdApi.PageBlockVideo) pageBlock2;
                        String h22 = C4779t2.m25507h2(pageBlockVideo.caption.text);
                        bVar = C8112b.m13523X0(this.f15600Q.mo4347s(), this.f15600Q.mo4348c(), pageBlockVideo.video, new TdApi.FormattedText(h22, RunnableC5390g.m22996G(h22, 1)));
                    } else if (constructor2 != 1355669513) {
                        bVar = null;
                    } else {
                        TdApi.PageBlockAnimation pageBlockAnimation = (TdApi.PageBlockAnimation) pageBlock2;
                        String h23 = C4779t2.m25507h2(pageBlockAnimation.caption.text);
                        bVar = C8112b.m13529U0(this.f15600Q.mo4347s(), this.f15600Q.mo4348c(), pageBlockAnimation.animation, new TdApi.FormattedText(h23, RunnableC5390g.m22996G(h23, 1)));
                    }
                    if (bVar == null) {
                        arrayList.clear();
                        break;
                    }
                    if (i4 == -1 && bVar.m13475w() == i2) {
                        bVar.m13541O0(this.f15600Q.m25993Z3());
                        i4 = i5;
                    }
                    arrayList.add(bVar);
                    i5++;
                    i3++;
                }
                if (arrayList.size() > 1) {
                    if (i4 == -1) {
                        i4 = 0;
                    }
                    if (!m26579N()) {
                        final String j1 = C4403w.m27865j1(R.string.XofY, Integer.valueOf(i4 + 1), Integer.valueOf(arrayList.size()));
                        final float T1 = C7389v0.m16680T1(j1, C1410y.m37071G0(13.0f, false, true));
                        final int i6 = i4;
                        this.f15600Q.mo4348c().m2485dd().post(new Runnable() {
                            @Override
                            public final void run() {
                                C4666i7.this.m26571V(arrayList, j1, T1, i6);
                            }
                        });
                    }
                }
            }
        }
    }

    public final void m26535u(TdApi.WebPage webPage, int i) {
        if (webPage.video != null || webPage.photo != null) {
            int i2 = webPage.duration;
            if (i2 != 0) {
                m26550j0(C1363c0.m37433h(i2));
            }
            if (m26581L()) {
                int i3 = f15583B0;
                m26552i0(i, i3, f15591v0 + i3);
                return;
            }
            m26552i0(i, 0, -f15582A0);
        }
    }

    public void m26534v() {
        this.f15610a |= 1;
    }

    public void m26533w(C9552h1 h1Var, Canvas canvas, int i, int i2, AbstractC6264v vVar, AbstractC6264v vVar2, float f) {
        Canvas canvas2;
        int i3;
        C9552h1 h1Var2;
        int i4;
        int K = m26582K();
        boolean G2 = C4403w.m27984G2();
        if (this.f15614c != 19) {
            m26532x(canvas, i, i2, K, G2);
        }
        AbstractC4597c cVar = this.f15603T;
        int i5 = 0;
        if (cVar != null) {
            int i6 = G2 ? i : f15595z0 + i;
            int i7 = i2 + this.f15604U;
            C4656h6 h6Var = this.f15600Q;
            int W2 = h6Var != null ? h6Var.m26023W2() : 0;
            C4656h6 h6Var2 = this.f15600Q;
            if (h6Var2 != null) {
                i5 = h6Var2.m25985a3();
            }
            i4 = 19;
            i3 = i;
            canvas2 = canvas;
            int i8 = W2;
            h1Var2 = h1Var;
            cVar.mo25245c(h1Var, canvas, i6, i7, vVar, vVar2, i8, i5, f, 0.0f);
        } else {
            i3 = i;
            canvas2 = canvas;
            h1Var2 = h1Var;
            i4 = 19;
            C4630f0 f0Var = this.f15621i0;
            if (f0Var != null) {
                int i9 = G2 ? ((K + i3) - this.f15611a0) - this.f15615c0 : this.f15611a0 + i3;
                int i10 = i2 + this.f15613b0;
                f0Var.m26724s(h1Var, canvas, i9, i10, vVar, vVar2, 1.0f);
                String str = null;
                float f2 = 0.0f;
                if (!C5070i.m24061i(this.f15627o0)) {
                    str = this.f15627o0;
                    f2 = this.f15628p0;
                } else if (!C5070i.m24061i(this.f15606W)) {
                    str = this.f15606W;
                    f2 = this.f15605V;
                }
                if (!C5070i.m24061i(str)) {
                    int i11 = i9 + this.f15615c0;
                    int i12 = i10 + this.f15616d0;
                    RectF a0 = C1410y.m37050a0();
                    if (str.charAt(0) == '1') {
                        int i13 = f15584C0;
                        a0.set((((i11 - i13) - (f15585D0 * 2)) - f2) + f15588G0, (i12 - i13) - f15586E0, i11 - i13, i12 - i13);
                    } else {
                        int i14 = f15584C0;
                        a0.set(((i11 - i14) - (f15585D0 * 2)) - f2, (i12 - i14) - f15586E0, i11 - i14, i12 - i14);
                    }
                    canvas2.drawRoundRect(a0, C1357a0.m37541i(4.0f), C1357a0.m37541i(4.0f), C1410y.m37039g(1275068416));
                    int i15 = f15584C0;
                    canvas2.drawText(str, ((i11 - i15) - f15585D0) - f2, ((i12 - i15) - f15586E0) + f15587F0, C1410y.m37071G0(13.0f, false, false));
                }
            } else if (!(this.f15622j0 == null && this.f15624l0 == null)) {
                int i16 = G2 ? ((i3 + K) - this.f15611a0) - this.f15615c0 : this.f15611a0 + i3;
                int i17 = i2 + this.f15613b0;
                C1359b.m37498u(canvas, vVar, vVar2, false, true, i16, i17, i16 + this.f15625m0, i17 + this.f15626n0);
            }
        }
        C4602c4 c4Var = this.f15630r0;
        if (c4Var == null) {
            return;
        }
        if (this.f15614c == i4) {
            c4Var.m27013j(h1Var2, canvas2, i3, i2 + this.f15629q0);
        } else {
            c4Var.m27013j(h1Var2, canvas2, G2 ? i3 : f15595z0 + i3, i2 + this.f15629q0);
        }
    }

    public final void m26532x(Canvas canvas, int i, int i2, int i3, boolean z) {
        RectF a0 = C1410y.m37050a0();
        if (z) {
            int i4 = i + i3;
            a0.set(i4 - f15582A0, i2, i4, this.f15597N + i2);
        } else {
            a0.set(i, i2, f15582A0 + i, this.f15597N + i2);
        }
        int i5 = f15582A0;
        canvas.drawRoundRect(a0, i5 / 2, i5 / 2, C1410y.m37039g(this.f15600Q.m26031V4()));
        int i6 = 0;
        if (this.f15617e0 != null) {
            int i7 = C1357a0.m37541i(f15590u0) + 0;
            RunnableC5390g gVar = this.f15617e0;
            int i8 = z ? i : f15595z0 + i;
            int i9 = i + i3;
            if (z) {
                i9 -= f15595z0;
            }
            gVar.m22901u(canvas, i8, i9, 0, i2 + i7);
            i6 = this.f15617e0.getHeight() + i7;
        }
        if (this.f15618f0 != null) {
            if (i6 > 0) {
                i6 += C1357a0.m37541i(f15589t0);
            }
            RunnableC5390g gVar2 = this.f15618f0;
            int i10 = z ? i : f15595z0 + i;
            int i11 = i + i3;
            if (z) {
                i11 -= f15595z0;
            }
            gVar2.m22901u(canvas, i10, i11, 0, i2 + i6);
            i6 += this.f15618f0.getHeight();
        }
        if (this.f15619g0 != null) {
            if (i6 > 0) {
                i6 += C1357a0.m37541i(f15589t0);
            }
            RunnableC5390g gVar3 = this.f15619g0;
            int i12 = z ? i : f15595z0 + i;
            int i13 = i + i3;
            if (z) {
                i13 -= f15595z0;
            }
            gVar3.m22901u(canvas, i12, i13, 0, i2 + i6);
            this.f15619g0.getHeight();
        }
    }

    public C4707n m26531y() {
        AbstractC4597c cVar = this.f15603T;
        if (cVar instanceof C4707n) {
            return (C4707n) cVar;
        }
        return null;
    }

    public int m26530z() {
        return this.f15597N;
    }
}
