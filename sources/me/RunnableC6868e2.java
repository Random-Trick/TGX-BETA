package me;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import be.C1357a0;
import be.C1379j0;
import gd.AbstractC4576a1;
import gd.C4632f1;
import java.util.ArrayList;
import java.util.Iterator;
import me.RunnableC6868e2;
import me.vkryl.android.widget.FrameLayoutFix;
import org.json.JSONObject;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2065g;
import p057e2.AbstractC4117a;
import p108hb.C5070i;
import p111he.AbstractC5101b1;
import p111he.AbstractC5143t;
import p111he.C5141s;
import p139jb.AbstractC5911c;
import p143k0.C6038h;
import p156kd.C6238b;
import p156kd.C6240c;
import p156kd.C6257p;
import p335xd.C10192g;
import td.AbstractC9323v4;

public class RunnableC6868e2 extends FrameLayoutFix implements ViewPager.AbstractC1054i, Runnable, AbstractC5911c, AbstractC5143t, AbstractC5101b1 {
    public int f21592M;
    public C6871c f21593N;
    public WebView f21594O;
    public C6861d2 f21595P;
    public C6257p f21596Q;
    public C6240c f21597R;
    public final C6238b f21598S = new C6238b(this);
    public int f21599T;
    public boolean f21600U;
    public AbstractC4576a1 f21601V;
    public boolean f21602W;
    public boolean f21603a0;
    public float f21604b0;
    public boolean f21605c0;
    public C6038h<Drawable> f21606d0;

    public class C6869a extends WebView {
        public C6869a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            RunnableC6868e2.this.f21600U = true;
            return super.onTouchEvent(motionEvent);
        }
    }

    public class C6870b extends WebViewClient {
        public C6870b() {
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!RunnableC6868e2.this.f21600U) {
                return false;
            }
            C1379j0.m37336c0(str);
            return true;
        }
    }

    public static class C6871c extends AbstractC4117a {
        public final ArrayList<C6888g3> f21609M = new ArrayList<>(4);
        public final ArrayList<C6888g3> f21610N = new ArrayList<>(4);
        public final AbstractC9323v4<?> f21611O;
        public C4632f1 f21612P;
        public final Context f21613c;

        public C6871c(Context context, AbstractC9323v4<?> v4Var) {
            this.f21613c = context;
            this.f21611O = v4Var;
        }

        @Override
        public void mo8826b(ViewGroup viewGroup, int i, Object obj) {
            C6888g3 g3Var = (C6888g3) obj;
            viewGroup.removeView(g3Var);
            this.f21610N.remove(g3Var);
            g3Var.clear();
            this.f21609M.add(g3Var);
        }

        @Override
        public int mo8825e() {
            C4632f1 f1Var = this.f21612P;
            if (f1Var != null) {
                return f1Var.m26702b0();
            }
            return 0;
        }

        @Override
        public Object mo8823j(ViewGroup viewGroup, int i) {
            C6888g3 g3Var;
            if (this.f21609M.isEmpty()) {
                g3Var = new C6888g3(this.f21613c);
                g3Var.setBackgroundColorId(R.id.theme_color_placeholder);
                g3Var.m18574y();
                g3Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            } else {
                ArrayList<C6888g3> arrayList = this.f21609M;
                g3Var = arrayList.remove(arrayList.size() - 1);
            }
            C4632f1 f1Var = this.f21612P;
            g3Var.setWrapper(f1Var != null ? f1Var.m26699d0(i) : null);
            this.f21610N.add(g3Var);
            viewGroup.addView(g3Var);
            return g3Var;
        }

        @Override
        public boolean mo8822k(View view, Object obj) {
            return obj == view;
        }

        public void m18714v() {
            Iterator<C6888g3> it = this.f21609M.iterator();
            while (it.hasNext()) {
                it.next().m18579f();
            }
            Iterator<C6888g3> it2 = this.f21610N.iterator();
            while (it2.hasNext()) {
                it2.next().m18579f();
            }
        }

        public void m18713w() {
            Iterator<C6888g3> it = this.f21609M.iterator();
            while (it.hasNext()) {
                it.next().m18580b();
            }
            Iterator<C6888g3> it2 = this.f21610N.iterator();
            while (it2.hasNext()) {
                it2.next().m18580b();
            }
        }

        public void m18712x(C4632f1 f1Var) {
            if (this.f21612P != f1Var) {
                this.f21612P = f1Var;
                m28888l();
            }
        }
    }

    public static class C6872d {
        public final RunnableC6868e2 f21614a;

        public C6872d(RunnableC6868e2 e2Var) {
            this.f21614a = e2Var;
        }

        public void m18710b(String str, String str2) {
            if ("resize_frame".equals(str)) {
                try {
                    int s = C5070i.m24051s(new JSONObject(str2).getString("height"));
                    if (this.f21614a.f21599T != s) {
                        this.f21614a.f21599T = s;
                        if (this.f21614a.f21601V != null) {
                            this.f21614a.f21601V.m27295E(this.f21614a);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }

        @JavascriptInterface
        public final void postEvent(final String str, final String str2) {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    RunnableC6868e2.C6872d.this.m18710b(str, str2);
                }
            });
        }
    }

    public RunnableC6868e2(Context context) {
        super(context);
    }

    private void setInSlideShow(boolean z) {
        if (this.f21602W != z) {
            this.f21602W = z;
            if (!z) {
                removeCallbacks(this);
            }
        }
    }

    public final void m18721I1() {
        if (this.f21592M == 3) {
            setInSlideShow(this.f21603a0 && !this.f21605c0);
        }
    }

    @Override
    public void mo18720J() {
        WebView webView = this.f21594O;
        if (webView != null) {
            webView.destroy();
            removeView(this.f21594O);
            this.f21594O = null;
        }
    }

    public final void m18719J1() {
        if (this.f21594O == null) {
            C6869a aVar = new C6869a(getContext());
            this.f21594O = aVar;
            C10192g.m5781j(aVar, R.id.theme_color_placeholder);
            this.f21594O.getSettings().setJavaScriptEnabled(true);
            this.f21594O.getSettings().setAllowContentAccess(true);
            int i = Build.VERSION.SDK_INT;
            if (i >= 17) {
                this.f21594O.addJavascriptInterface(new C6872d(this), "TelegramWebviewProxy");
            }
            this.f21594O.getSettings().setDomStorageEnabled(true);
            this.f21594O.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
            if (i >= 21) {
                this.f21594O.getSettings().setMixedContentMode(0);
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.f21594O, false);
            }
            this.f21594O.setWebViewClient(new C6870b());
            addView(this.f21594O);
        }
    }

    public void m18718L1(int i, AbstractC9323v4<?> v4Var) {
        this.f21592M = i;
        if (i == 1) {
            this.f21597R = new C6240c(this, 0);
            this.f21596Q = new C6257p(this, 0);
            m18719J1();
            setWillNotDraw(false);
        } else if (i == 3) {
            this.f21593N = new C6871c(getContext(), v4Var);
            org.thunderdog.challegram.widget.ViewPager viewPager = new org.thunderdog.challegram.widget.ViewPager(getContext());
            viewPager.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            viewPager.setOverScrollMode(2);
            viewPager.mo18020c(this);
            viewPager.setAdapter(this.f21593N);
            addView(viewPager);
            C6937j4 j4Var = new C6937j4(getContext());
            j4Var.setLayoutParams(FrameLayoutFix.m18007t1(-1, C1357a0.m37541i(36.0f), 80));
            j4Var.m18401a(this.f21593N.mo8825e(), 0.0f);
            addView(j4Var);
        } else if (i == 4) {
            ScrollView scrollView = new ScrollView(getContext());
            scrollView.setHorizontalScrollBarEnabled(true);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setLayoutParams(FrameLayoutFix.m18008s1(-1, -2));
            C6861d2 d2Var = new C6861d2(getContext(), v4Var.mo4348c());
            this.f21595P = d2Var;
            d2Var.setLayoutParams(FrameLayoutFix.m18008s1(-2, -2));
            scrollView.addView(this.f21595P);
            addView(scrollView);
        }
    }

    public final void m18717M1(AbstractC4576a1 a1Var) {
        int i = this.f21592M;
        if (i == 1) {
            C4632f1 f1Var = (C4632f1) a1Var;
            f1Var.mo26457T(this.f21597R);
            f1Var.mo26458S(this.f21596Q);
            m18719J1();
            if (a1Var.mo26703b()) {
                this.f21594O.setVerticalScrollBarEnabled(true);
                this.f21594O.setHorizontalScrollBarEnabled(true);
            } else {
                this.f21594O.setVerticalScrollBarEnabled(false);
                this.f21594O.setHorizontalScrollBarEnabled(false);
            }
            this.f21599T = 0;
            try {
                this.f21594O.loadUrl("about:blank");
            } catch (Throwable th) {
                Log.m14723e(th);
            }
            f1Var.m26691k0(this.f21594O);
        } else if (i == 3) {
            C4632f1 f1Var2 = (C4632f1) a1Var;
            org.thunderdog.challegram.widget.ViewPager viewPager = (org.thunderdog.challegram.widget.ViewPager) getChildAt(0);
            viewPager.setAdapter(null);
            this.f21593N.m18712x(f1Var2);
            viewPager.setAdapter(this.f21593N);
            C6937j4 j4Var = (C6937j4) getChildAt(1);
            int c0 = f1Var2.m26700c0();
            if (viewPager.getCurrentItem() != c0) {
                viewPager.mo18027N(c0, false);
            }
            j4Var.m18401a(this.f21593N.mo8825e(), c0);
            C2065g.m35721a(viewPager);
            setWillNotDraw(!a1Var.m27291J());
        } else if (i == 4) {
            this.f21595P.setBlock(a1Var);
        }
    }

    @Override
    public Drawable mo14042X(int i, int i2) {
        return C5141s.m23833a(this, i, i2);
    }

    @Override
    public void mo4501a3() {
        setBlock(null);
        this.f21598S.mo4501a3();
        int i = this.f21592M;
        if (i == 1) {
            this.f21596Q.mo20249Z();
            this.f21597R.mo20249Z();
        } else if (i == 3) {
            m18721I1();
        } else if (i == 4) {
            this.f21595P.mo4501a3();
        }
    }

    public void m18716b() {
        this.f21598S.m20994i();
        int i = this.f21592M;
        if (i == 1) {
            this.f21597R.mo20247b();
            this.f21596Q.mo20247b();
            WebView webView = this.f21594O;
            if (webView != null) {
                webView.onPause();
            }
        } else if (i == 3) {
            this.f21593N.m18713w();
            this.f21603a0 = false;
            m18721I1();
        } else if (i == 4) {
            this.f21595P.m18739b();
        }
    }

    public void m18715f() {
        this.f21598S.m21001b();
        int i = this.f21592M;
        if (i == 1) {
            this.f21597R.mo20245f();
            this.f21596Q.mo20245f();
            WebView webView = this.f21594O;
            if (webView != null) {
                webView.onResume();
            }
        } else if (i == 3) {
            this.f21593N.m18714v();
            this.f21603a0 = true;
            m18721I1();
        } else if (i == 4) {
            this.f21595P.m18738f();
        }
    }

    public int getExactWebViewHeight() {
        int i = this.f21599T;
        if (i != 0) {
            return C1357a0.m37541i(i);
        }
        return 0;
    }

    public int getMode() {
        return this.f21592M;
    }

    @Override
    public final C6038h<Drawable> getSparseDrawableHolder() {
        C6038h<Drawable> hVar = this.f21606d0;
        if (hVar != null) {
            return hVar;
        }
        C6038h<Drawable> hVar2 = new C6038h<>();
        this.f21606d0 = hVar2;
        return hVar2;
    }

    @Override
    public final Resources getSparseDrawableResources() {
        return getResources();
    }

    public float getViewPagerPosition() {
        return this.f21604b0;
    }

    @Override
    public void mo8853h4(int i) {
        this.f21605c0 = i != 0;
        m18721I1();
    }

    @Override
    public void onDraw(Canvas canvas) {
        AbstractC4576a1 a1Var = this.f21601V;
        if (a1Var != null) {
            a1Var.m27281h(this, canvas, this.f21597R, this.f21596Q, this.f21598S);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        View childAt;
        int defaultSize = FrameLayout.getDefaultSize(getSuggestedMinimumWidth(), i);
        AbstractC4576a1 a1Var = this.f21601V;
        if (a1Var == null) {
            super.onMeasure(defaultSize, i2);
            return;
        }
        int s = a1Var.m27277s(this, defaultSize);
        View childAt2 = getChildAt(0);
        if (childAt2 != null) {
            this.f21601V.mo26701c(this, (FrameLayout.LayoutParams) childAt2.getLayoutParams(), defaultSize, s);
            if (this.f21592M == 3 && (childAt = getChildAt(1)) != null) {
                this.f21601V.mo26701c(this, (FrameLayout.LayoutParams) childAt.getLayoutParams(), defaultSize, s);
            }
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(s, Log.TAG_TDLIB_OPTIONS));
    }

    @Override
    public void run() {
        int i = 0;
        org.thunderdog.challegram.widget.ViewPager viewPager = (org.thunderdog.challegram.widget.ViewPager) getChildAt(0);
        int currentItem = viewPager.getCurrentItem();
        int i2 = currentItem + 1;
        if (i2 < this.f21593N.mo8825e()) {
            i = i2;
        }
        if (currentItem != i) {
            viewPager.mo18027N(i, true);
        }
    }

    public void setBlock(AbstractC4576a1 a1Var) {
        AbstractC4576a1 a1Var2 = this.f21601V;
        if (a1Var2 != a1Var) {
            if (a1Var2 != null) {
                a1Var2.m27282g(this);
                this.f21601V = null;
            }
            this.f21601V = a1Var;
            int measuredWidth = getMeasuredWidth();
            int i = 0;
            if (a1Var != null) {
                a1Var.mo26698e();
                a1Var.m27283d(this);
                m18717M1(a1Var);
                if (measuredWidth != 0) {
                    i = a1Var.m27277s(this, measuredWidth);
                }
            }
            if (measuredWidth != 0 && getMeasuredHeight() != i) {
                requestLayout();
            }
        }
    }

    @Override
    public void mo8833x(int i, float f, int i2) {
        float f2 = i + f;
        this.f21604b0 = f2;
        C6937j4 j4Var = (C6937j4) getChildAt(1);
        if (j4Var != null) {
            j4Var.setPositionFactor(f2);
        }
    }

    @Override
    public void mo8832x4(int i) {
        AbstractC4576a1 a1Var = this.f21601V;
        if (a1Var != null) {
            ((C4632f1) a1Var).m26688n0(i);
        }
    }
}
