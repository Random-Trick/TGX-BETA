package de;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ce.a0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import ud.s;
import ud.v4;
import yd.g;
import zd.o6;

public class e40<T> extends v4<T> {
    public WebView f7826n0;
    public s f7827o0;

    public class a extends FrameLayoutFix {
        public a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    public class b extends WebViewClient {
        public b() {
        }

        @Override
        public void onPageFinished(WebView webView, String str) {
            Uri uri;
            try {
                uri = Uri.parse(str);
            } catch (Throwable unused) {
                uri = null;
            }
            if (uri == null || !e40.this.Se(uri)) {
                super.onPageFinished(webView, str);
            }
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return e40.this.Se(webResourceRequest.getUrl()) || super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public class c extends WebViewClient {
        public c() {
        }

        @Override
        public void onPageFinished(WebView webView, String str) {
            Uri uri;
            try {
                uri = Uri.parse(str);
            } catch (Throwable unused) {
                uri = null;
            }
            if (uri == null || !e40.this.Se(uri)) {
                super.onPageFinished(webView, str);
            }
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri uri;
            try {
                uri = Uri.parse(str);
            } catch (Throwable unused) {
                uri = null;
            }
            return (uri != null && e40.this.Se(uri)) || super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public class d extends WebChromeClient {
        public d() {
        }

        @Override
        public void onProgressChanged(WebView webView, int i10) {
            e40.this.Re(i10 / 100.0f);
        }
    }

    public e40(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public View G9() {
        return this.f7827o0;
    }

    @Override
    public View Ga() {
        return this.f7826n0;
    }

    public boolean Pe() {
        return false;
    }

    public void Qe(s sVar, WebView webView) {
        throw null;
    }

    @Override
    public int R9() {
        return R.id.controller_webkit;
    }

    public void Re(float f10) {
        s sVar = this.f7827o0;
        if (sVar != null) {
            sVar.z1(f10);
        }
    }

    public boolean Se(Uri uri) {
        return false;
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f7826n0.destroy();
    }

    @Override
    @SuppressLint({"SetJavaScriptEnabled"})
    public final View oc(Context context) {
        s sVar = new s(t());
        this.f7827o0 = sVar;
        sVar.setThemedTextColor(this);
        this.f7827o0.A1(a0.i(49.0f), true);
        a aVar = new a(context);
        g.i(aVar, R.id.theme_color_filling, this);
        aVar.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        WebView webView = new WebView(context);
        this.f7826n0 = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f7826n0.getSettings().setDomStorageEnabled(true);
        this.f7826n0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        int i10 = Build.VERSION.SDK_INT;
        this.f7826n0.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f7826n0, true);
        if (!Pe()) {
            this.f7826n0.setWebViewClient(new WebViewClient());
        } else if (i10 >= 24) {
            this.f7826n0.setWebViewClient(new b());
        } else {
            this.f7826n0.setWebViewClient(new c());
        }
        this.f7826n0.setWebChromeClient(new d());
        Qe(this.f7827o0, this.f7826n0);
        aVar.addView(this.f7826n0);
        return aVar;
    }
}
