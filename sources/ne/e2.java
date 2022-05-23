package ne;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.viewpager.widget.ViewPager;
import ce.a0;
import ce.j0;
import hd.a1;
import hd.f1;
import ib.i;
import ie.b1;
import ie.s;
import ie.t;
import java.util.ArrayList;
import java.util.Iterator;
import k0.h;
import ld.p;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.e2;
import org.json.JSONObject;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import yd.g;

public class e2 extends FrameLayoutFix implements ViewPager.i, Runnable, kb.c, t, b1 {
    public int M;
    public c N;
    public WebView O;
    public d2 P;
    public p Q;
    public ld.c R;
    public final ld.b S = new ld.b(this);
    public int T;
    public boolean U;
    public a1 V;
    public boolean W;
    public boolean f17967a0;
    public float f17968b0;
    public boolean f17969c0;
    public h<Drawable> f17970d0;

    public class a extends WebView {
        public a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            e2.this.U = true;
            return super.onTouchEvent(motionEvent);
        }
    }

    public class b extends WebViewClient {
        public b() {
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!e2.this.U) {
                return false;
            }
            j0.c0(str);
            return true;
        }
    }

    public static class c extends e2.a {
        public final ArrayList<g3> M = new ArrayList<>(4);
        public final ArrayList<g3> N = new ArrayList<>(4);
        public final v4<?> O;
        public f1 P;
        public final Context f17973c;

        public c(Context context, v4<?> v4Var) {
            this.f17973c = context;
            this.O = v4Var;
        }

        @Override
        public void b(ViewGroup viewGroup, int i10, Object obj) {
            g3 g3Var = (g3) obj;
            viewGroup.removeView(g3Var);
            this.N.remove(g3Var);
            g3Var.clear();
            this.M.add(g3Var);
        }

        @Override
        public int e() {
            f1 f1Var = this.P;
            if (f1Var != null) {
                return f1Var.a0();
            }
            return 0;
        }

        @Override
        public Object j(ViewGroup viewGroup, int i10) {
            g3 g3Var;
            if (this.M.isEmpty()) {
                g3Var = new g3(this.f17973c);
                g3Var.setBackgroundColorId(R.id.theme_color_placeholder);
                g3Var.A();
                g3Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            } else {
                ArrayList<g3> arrayList = this.M;
                g3Var = arrayList.remove(arrayList.size() - 1);
            }
            f1 f1Var = this.P;
            g3Var.setWrapper(f1Var != null ? f1Var.c0(i10) : null);
            this.N.add(g3Var);
            viewGroup.addView(g3Var);
            return g3Var;
        }

        @Override
        public boolean k(View view, Object obj) {
            return obj == view;
        }

        public void v() {
            Iterator<g3> it = this.M.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
            Iterator<g3> it2 = this.N.iterator();
            while (it2.hasNext()) {
                it2.next().e();
            }
        }

        public void w() {
            Iterator<g3> it = this.M.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            Iterator<g3> it2 = this.N.iterator();
            while (it2.hasNext()) {
                it2.next().b();
            }
        }

        public void x(f1 f1Var) {
            if (this.P != f1Var) {
                this.P = f1Var;
                l();
            }
        }
    }

    public static class d {
        public final e2 f17974a;

        public d(e2 e2Var) {
            this.f17974a = e2Var;
        }

        public void b(String str, String str2) {
            if ("resize_frame".equals(str)) {
                try {
                    int s10 = i.s(new JSONObject(str2).getString("height"));
                    if (this.f17974a.T != s10) {
                        this.f17974a.T = s10;
                        if (this.f17974a.V != null) {
                            this.f17974a.V.D(this.f17974a);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }

        @JavascriptInterface
        public final void postEvent(final String str, final String str2) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    e2.d.this.b(str, str2);
                }
            });
        }
    }

    public e2(Context context) {
        super(context);
    }

    private void setInSlideShow(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            if (!z10) {
                removeCallbacks(this);
            }
        }
    }

    public final void E1() {
        if (this.M == 3) {
            setInSlideShow(this.f17967a0 && !this.f17969c0);
        }
    }

    public final void G1() {
        if (this.O == null) {
            a aVar = new a(getContext());
            this.O = aVar;
            g.j(aVar, R.id.theme_color_placeholder);
            this.O.getSettings().setJavaScriptEnabled(true);
            this.O.getSettings().setAllowContentAccess(true);
            this.O.addJavascriptInterface(new d(this), "TelegramWebviewProxy");
            this.O.getSettings().setDomStorageEnabled(true);
            this.O.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
            this.O.getSettings().setMixedContentMode(0);
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.O, false);
            this.O.setWebViewClient(new b());
            addView(this.O);
        }
    }

    public void H1(int i10, v4<?> v4Var) {
        this.M = i10;
        if (i10 == 1) {
            this.R = new ld.c(this, 0);
            this.Q = new p(this, 0);
            G1();
            setWillNotDraw(false);
        } else if (i10 == 3) {
            this.N = new c(getContext(), v4Var);
            org.thunderdog.challegram.widget.ViewPager viewPager = new org.thunderdog.challegram.widget.ViewPager(getContext());
            viewPager.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            viewPager.setOverScrollMode(2);
            viewPager.c(this);
            viewPager.setAdapter(this.N);
            addView(viewPager);
            i4 i4Var = new i4(getContext());
            i4Var.setLayoutParams(FrameLayoutFix.r1(-1, a0.i(36.0f), 80));
            i4Var.a(this.N.e(), 0.0f);
            addView(i4Var);
        } else if (i10 == 4) {
            ScrollView scrollView = new ScrollView(getContext());
            scrollView.setHorizontalScrollBarEnabled(true);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setLayoutParams(FrameLayoutFix.q1(-1, -2));
            d2 d2Var = new d2(getContext(), v4Var.c());
            this.P = d2Var;
            d2Var.setLayoutParams(FrameLayoutFix.q1(-2, -2));
            scrollView.addView(this.P);
            addView(scrollView);
        }
    }

    public final void I1(a1 a1Var) {
        int i10 = this.M;
        if (i10 == 1) {
            f1 f1Var = (f1) a1Var;
            f1Var.S(this.R);
            f1Var.R(this.Q);
            G1();
            if (a1Var.b()) {
                this.O.setVerticalScrollBarEnabled(true);
                this.O.setHorizontalScrollBarEnabled(true);
            } else {
                this.O.setVerticalScrollBarEnabled(false);
                this.O.setHorizontalScrollBarEnabled(false);
            }
            this.T = 0;
            try {
                this.O.loadUrl("about:blank");
            } catch (Throwable th) {
                Log.e(th);
            }
            f1Var.j0(this.O);
        } else if (i10 == 3) {
            f1 f1Var2 = (f1) a1Var;
            org.thunderdog.challegram.widget.ViewPager viewPager = (org.thunderdog.challegram.widget.ViewPager) getChildAt(0);
            viewPager.setAdapter(null);
            this.N.x(f1Var2);
            viewPager.setAdapter(this.N);
            i4 i4Var = (i4) getChildAt(1);
            int b02 = f1Var2.b0();
            if (viewPager.getCurrentItem() != b02) {
                viewPager.N(b02, false);
            }
            i4Var.a(this.N.e(), b02);
            db.g.a(viewPager);
            setWillNotDraw(!a1Var.I());
        } else if (i10 == 4) {
            this.P.setBlock(a1Var);
        }
    }

    @Override
    public void J() {
        WebView webView = this.O;
        if (webView != null) {
            webView.destroy();
            removeView(this.O);
            this.O = null;
        }
    }

    @Override
    public void Q2() {
        setBlock(null);
        this.S.Q2();
        int i10 = this.M;
        if (i10 == 1) {
            this.Q.b0();
            this.R.b0();
        } else if (i10 == 3) {
            E1();
        } else if (i10 == 4) {
            this.P.Q2();
        }
    }

    @Override
    public void U3(int i10) {
        this.f17969c0 = i10 != 0;
        E1();
    }

    @Override
    public Drawable Z(int i10, int i11) {
        return s.a(this, i10, i11);
    }

    public void b() {
        this.S.i();
        int i10 = this.M;
        if (i10 == 1) {
            this.R.b();
            this.Q.b();
            WebView webView = this.O;
            if (webView != null) {
                webView.onPause();
            }
        } else if (i10 == 3) {
            this.N.w();
            this.f17967a0 = false;
            E1();
        } else if (i10 == 4) {
            this.P.b();
        }
    }

    public void e() {
        this.S.b();
        int i10 = this.M;
        if (i10 == 1) {
            this.R.e();
            this.Q.e();
            WebView webView = this.O;
            if (webView != null) {
                webView.onResume();
            }
        } else if (i10 == 3) {
            this.N.v();
            this.f17967a0 = true;
            E1();
        } else if (i10 == 4) {
            this.P.e();
        }
    }

    public int getExactWebViewHeight() {
        int i10 = this.T;
        if (i10 != 0) {
            return a0.i(i10);
        }
        return 0;
    }

    public int getMode() {
        return this.M;
    }

    @Override
    public final h<Drawable> getSparseDrawableHolder() {
        h<Drawable> hVar = this.f17970d0;
        if (hVar != null) {
            return hVar;
        }
        h<Drawable> hVar2 = new h<>();
        this.f17970d0 = hVar2;
        return hVar2;
    }

    @Override
    public final Resources getSparseDrawableResources() {
        return getResources();
    }

    public float getViewPagerPosition() {
        return this.f17968b0;
    }

    @Override
    public void onDraw(Canvas canvas) {
        a1 a1Var = this.V;
        if (a1Var != null) {
            a1Var.i(this, canvas, this.R, this.Q, this.S);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        View childAt;
        int defaultSize = FrameLayout.getDefaultSize(getSuggestedMinimumWidth(), i10);
        a1 a1Var = this.V;
        if (a1Var == null) {
            super.onMeasure(defaultSize, i11);
            return;
        }
        int s10 = a1Var.s(this, defaultSize);
        View childAt2 = getChildAt(0);
        if (childAt2 != null) {
            this.V.c(this, (FrameLayout.LayoutParams) childAt2.getLayoutParams(), defaultSize, s10);
            if (this.M == 3 && (childAt = getChildAt(1)) != null) {
                this.V.c(this, (FrameLayout.LayoutParams) childAt.getLayoutParams(), defaultSize, s10);
            }
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(s10, Log.TAG_TDLIB_OPTIONS));
    }

    @Override
    public void r4(int i10) {
        a1 a1Var = this.V;
        if (a1Var != null) {
            ((f1) a1Var).m0(i10);
        }
    }

    @Override
    public void run() {
        int i10 = 0;
        org.thunderdog.challegram.widget.ViewPager viewPager = (org.thunderdog.challegram.widget.ViewPager) getChildAt(0);
        int currentItem = viewPager.getCurrentItem();
        int i11 = currentItem + 1;
        if (i11 < this.N.e()) {
            i10 = i11;
        }
        if (currentItem != i10) {
            viewPager.N(i10, true);
        }
    }

    public void setBlock(a1 a1Var) {
        a1 a1Var2 = this.V;
        if (a1Var2 != a1Var) {
            if (a1Var2 != null) {
                a1Var2.h(this);
                this.V = null;
            }
            this.V = a1Var;
            int measuredWidth = getMeasuredWidth();
            int i10 = 0;
            if (a1Var != null) {
                a1Var.e();
                a1Var.d(this);
                I1(a1Var);
                if (measuredWidth != 0) {
                    i10 = a1Var.s(this, measuredWidth);
                }
            }
            if (measuredWidth != 0 && getMeasuredHeight() != i10) {
                requestLayout();
            }
        }
    }

    @Override
    public void x(int i10, float f10, int i11) {
        float f11 = i10 + f10;
        this.f17968b0 = f11;
        i4 i4Var = (i4) getChildAt(1);
        if (i4Var != null) {
            i4Var.setPositionFactor(f11);
        }
    }
}
