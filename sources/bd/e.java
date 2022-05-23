package bd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import ce.a0;
import ce.j0;
import ce.p0;
import eb.f;
import eb.k;
import eb.l;
import hd.i;
import ib.h;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.j2;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import yd.g;
import zd.ya;

@SuppressLint({"ViewConstructor"})
public class e extends c {
    public FrameLayout R;
    public FrameLayout S;
    public WebView T;
    public View U;
    public View V;
    public int W;
    public WebChromeClient.CustomViewCallback f4113a0;
    public final f f4114b0 = new f(0, new k.b() {
        @Override
        public final void n4(int i10, float f10, float f11, k kVar) {
            e.this.d2(i10, f10, f11, kVar);
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
            l.a(this, i10, f10, kVar);
        }
    }, db.b.f7287b, 180);

    public class a extends WebViewClient {
        public a() {
        }

        @Override
        public void onPageFinished(WebView webView, String str) {
            e.this.f4114b0.p(false, true);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            j0.c0(str);
            return true;
        }
    }

    public e(Context context, v4<?> v4Var) {
        super(context, v4Var);
        j0.i0(this);
    }

    public void d2(int i10, float f10, float f11, k kVar) {
        this.U.setAlpha(h.d(f10));
    }

    @Override
    public void B0(j2 j2Var) {
        this.T.loadUrl(this.M.f13073c);
    }

    @Override
    public boolean B1() {
        i iVar = this.M;
        if (iVar.f13075e == 0 || iVar.f13076f == 0) {
            return false;
        }
        C1(a0.g());
        return true;
    }

    @Override
    public int C1(int i10) {
        int a22 = a2(i10);
        this.W = a22;
        this.R.setLayoutParams(FrameLayoutFix.r1(-1, a22, 48));
        return c2() ? a0.f() : this.N + this.W;
    }

    @Override
    public void D1(boolean z10) {
        this.Q.s2(z10);
    }

    @Override
    public void G1() {
        this.T.destroy();
    }

    @Override
    public boolean H1(String str) {
        return false;
    }

    @Override
    @SuppressLint({"SetJavaScriptEnabled"})
    public boolean I1(i iVar) {
        ya.o1().w2().W0(Log.TAG_CAMERA, true);
        WebView webView = new WebView(getContext());
        this.T = webView;
        g.j(webView, R.id.theme_color_placeholder);
        this.T.getSettings().setDomStorageEnabled(true);
        this.T.getSettings().setJavaScriptEnabled(true);
        this.T.getSettings().setAllowContentAccess(true);
        this.T.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        this.T.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.T.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.T, true);
        this.T.setLayoutParams(FrameLayoutFix.r1(-1, -1, 48));
        this.T.setWebViewClient(new a());
        this.T.setWebChromeClient(new b());
        this.U = p0.o0(getContext(), FrameLayoutFix.r1(a0.i(48.0f), a0.i(48.0f), 17));
        this.f4114b0.p(true, false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.S = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.S.setVisibility(8);
        this.S.setFitsSystemWindows(true);
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.R = frameLayout2;
        frameLayout2.addView(this.T);
        this.R.addView(this.U);
        addView(this.R);
        addView(this.S);
        return super.I1(iVar);
    }

    public final int a2(int i10) {
        int i11;
        i iVar = this.M;
        return (iVar.f13071a != 99 || (i11 = iVar.f13076f) == 1) ? (int) Math.min(iVar.f13076f / (iVar.f13075e / i10), a0.l() / 2.0f) : i11;
    }

    public final boolean c2() {
        return this.V != null;
    }

    public final void f2(boolean z10) {
        org.thunderdog.challegram.a r10 = j0.r(getContext());
        r10.s3(16, z10);
        if (z10) {
            r10.setRequestedOrientation(6);
            r10.v3(1, false);
            return;
        }
        r10.setRequestedOrientation(-1);
        r10.v3(0, false);
    }

    @Override
    public int getPreviewHeight() {
        return a0.e();
    }

    @Override
    public void w(j2 j2Var) {
        ya.o1().w2().W0(Log.TAG_CAMERA, false);
        if (c2()) {
            f2(false);
        }
    }

    public class b extends WebChromeClient {
        public b() {
        }

        @Override
        public void onHideCustomView() {
            if (e.this.V != null) {
                e.this.S.setVisibility(8);
                e.this.S.removeView(e.this.V);
                e.this.f4113a0.onCustomViewHidden();
                e.this.V = null;
                e.this.f4113a0 = null;
                e.this.f2(false);
            }
        }

        @Override
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (e.this.V != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            e.this.V = view;
            e.this.S.setVisibility(0);
            e.this.S.addView(e.this.V, FrameLayoutFix.q1(-1, -1));
            e.this.f4113a0 = customViewCallback;
            e.this.f2(true);
        }

        @Override
        public void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
            onShowCustomView(view, customViewCallback);
        }
    }
}
