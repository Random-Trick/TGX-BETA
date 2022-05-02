package ad;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import be.C1357a0;
import be.C1379j0;
import be.C1399s0;
import gd.C4658i;
import me.C6924j2;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p051db.C3953l;
import p108hb.C5069h;
import p335xd.C10192g;
import p350yd.C10536ab;
import td.AbstractC9323v4;

@SuppressLint({"ViewConstructor"})
public class C0261e extends AbstractView$OnClickListenerC0259c {
    public FrameLayout f788R;
    public FrameLayout f789S;
    public WebView f790T;
    public View f791U;
    public View f792V;
    public int f793W;
    public WebChromeClient.CustomViewCallback f794a0;
    public final C3940f f795b0 = new C3940f(0, new C3950k.AbstractC3952b() {
        @Override
        public final void mo45P5(int i, float f, float f2, C3950k kVar) {
            C0261e.this.m41976f2(i, f, f2, kVar);
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            C3953l.m29526a(this, i, f, kVar);
        }
    }, C2057b.f7280b, 180);

    public class C0262a extends WebViewClient {
        public C0262a() {
        }

        @Override
        public void onPageFinished(WebView webView, String str) {
            C0261e.this.f795b0.m29575p(false, true);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C1379j0.m37336c0(str);
            return true;
        }
    }

    public C0261e(Context context, AbstractC9323v4<?> v4Var) {
        super(context, v4Var);
        C1379j0.m37324i0(this);
    }

    public void m41976f2(int i, float f, float f2, C3950k kVar) {
        this.f791U.setAlpha(C5069h.m24089d(f));
    }

    @Override
    public boolean mo41915E1() {
        C4658i iVar = this.f782M;
        if (iVar.f15552e == 0 || iVar.f15553f == 0) {
            return false;
        }
        mo41913F1(C1357a0.m37543g());
        return true;
    }

    @Override
    public int mo41913F1(int i) {
        int b2 = m41978b2(i);
        this.f793W = b2;
        this.f788R.setLayoutParams(FrameLayoutFix.m18007t1(-1, b2, 48));
        return m41977d2() ? C1357a0.m37544f() : this.f783N + this.f793W;
    }

    @Override
    public void mo41912G1(boolean z) {
        this.f786Q.m18408y2(z);
    }

    @Override
    public void mo41910J1() {
        this.f790T.destroy();
    }

    @Override
    public boolean mo41909L1(String str) {
        return false;
    }

    @Override
    @SuppressLint({"SetJavaScriptEnabled"})
    public boolean mo41908M1(C4658i iVar) {
        C10536ab.m4667o1().m4636w2().m7075W0(Log.TAG_CAMERA, true);
        WebView webView = new WebView(getContext());
        this.f790T = webView;
        C10192g.m5781j(webView, R.id.theme_color_placeholder);
        this.f790T.getSettings().setDomStorageEnabled(true);
        this.f790T.getSettings().setJavaScriptEnabled(true);
        this.f790T.getSettings().setAllowContentAccess(true);
        this.f790T.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            this.f790T.getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        if (i >= 21) {
            this.f790T.getSettings().setMixedContentMode(0);
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f790T, true);
        }
        this.f790T.setLayoutParams(FrameLayoutFix.m18007t1(-1, -1, 48));
        this.f790T.setWebViewClient(new C0262a());
        this.f790T.setWebChromeClient(new C0263b());
        this.f791U = C1399s0.m37151v0(getContext(), FrameLayoutFix.m18007t1(C1357a0.m37541i(48.0f), C1357a0.m37541i(48.0f), 17));
        this.f795b0.m29575p(true, false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f789S = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f789S.setVisibility(8);
        if (i >= 21) {
            this.f789S.setFitsSystemWindows(true);
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f788R = frameLayout2;
        frameLayout2.addView(this.f790T);
        this.f788R.addView(this.f791U);
        addView(this.f788R);
        addView(this.f789S);
        return super.mo41908M1(iVar);
    }

    public final int m41978b2(int i) {
        int i2;
        C4658i iVar = this.f782M;
        return (iVar.f15548a != 99 || (i2 = iVar.f15553f) == 1) ? (int) Math.min(iVar.f15553f / (iVar.f15552e / i), C1357a0.m37538l() / 2.0f) : i2;
    }

    public final boolean m41977d2() {
        return this.f792V != null;
    }

    @Override
    public void mo18406f0(C6924j2 j2Var) {
        this.f790T.loadUrl(this.f782M.f15550c);
    }

    @Override
    public int getPreviewHeight() {
        return C1357a0.m37545e();
    }

    public final void m41975h2(boolean z) {
        AbstractView$OnTouchListenerC7889a r = C1379j0.m37307r(getContext());
        r.m14445r3(16, z);
        if (z) {
            r.setRequestedOrientation(6);
            r.m14432u3(1, false);
            return;
        }
        r.setRequestedOrientation(-1);
        r.m14432u3(0, false);
    }

    @Override
    public void mo3000j2(C6924j2 j2Var) {
        C10536ab.m4667o1().m4636w2().m7075W0(Log.TAG_CAMERA, false);
        if (m41977d2()) {
            m41975h2(false);
        }
    }

    public class C0263b extends WebChromeClient {
        public C0263b() {
        }

        @Override
        public void onHideCustomView() {
            if (C0261e.this.f792V != null) {
                C0261e.this.f789S.setVisibility(8);
                C0261e.this.f789S.removeView(C0261e.this.f792V);
                C0261e.this.f794a0.onCustomViewHidden();
                C0261e.this.f792V = null;
                C0261e.this.f794a0 = null;
                C0261e.this.m41975h2(false);
            }
        }

        @Override
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (C0261e.this.f792V != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            C0261e.this.f792V = view;
            C0261e.this.f789S.setVisibility(0);
            C0261e.this.f789S.addView(C0261e.this.f792V, FrameLayoutFix.m18008s1(-1, -1));
            C0261e.this.f794a0 = customViewCallback;
            C0261e.this.m41975h2(true);
        }

        @Override
        public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
            onShowCustomView(view, customViewCallback);
        }
    }
}
