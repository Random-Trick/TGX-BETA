package p038ce;

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
import be.C1357a0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p335xd.C10192g;
import p350yd.C10930q6;
import td.AbstractC9323v4;
import td.C9289s;

public class d40<T> extends AbstractC9323v4<T> {
    public WebView f7889n0;
    public C9289s f7890o0;

    public class C2275a extends FrameLayoutFix {
        public C2275a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    public class C2276b extends WebViewClient {
        public C2276b() {
        }

        @Override
        public void onPageFinished(WebView webView, String str) {
            Uri uri;
            try {
                uri = Uri.parse(str);
            } catch (Throwable unused) {
                uri = null;
            }
            if (uri == null || !d40.this.m35147Se(uri)) {
                super.onPageFinished(webView, str);
            }
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return d40.this.m35147Se(webResourceRequest.getUrl()) || super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public class C2277c extends WebViewClient {
        public C2277c() {
        }

        @Override
        public void onPageFinished(WebView webView, String str) {
            Uri uri;
            try {
                uri = Uri.parse(str);
            } catch (Throwable unused) {
                uri = null;
            }
            if (uri == null || !d40.this.m35147Se(uri)) {
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
            return (uri != null && d40.this.m35147Se(uri)) || super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public class C2278d extends WebChromeClient {
        public C2278d() {
        }

        @Override
        public void onProgressChanged(WebView webView, int i) {
            d40.this.m35148Re(i / 100.0f);
        }
    }

    public d40(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public View mo8869G9() {
        return this.f7890o0;
    }

    @Override
    public View mo8868Ga() {
        return this.f7889n0;
    }

    public boolean m35149Pe() {
        return false;
    }

    public void mo33118Qe(C9289s sVar, WebView webView) {
        throw null;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_webkit;
    }

    public void m35148Re(float f) {
        C9289s sVar = this.f7890o0;
        if (sVar != null) {
            sVar.m9633C1(f);
        }
    }

    public boolean m35147Se(Uri uri) {
        return false;
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f7889n0.destroy();
    }

    @Override
    @SuppressLint({"SetJavaScriptEnabled"})
    public final View mo403oc(Context context) {
        C9289s sVar = new C9289s(mo4347s());
        this.f7890o0 = sVar;
        sVar.setThemedTextColor(this);
        this.f7890o0.m9632D1(C1357a0.m37541i(49.0f), true);
        C2275a aVar = new C2275a(context);
        C10192g.m5782i(aVar, R.id.theme_color_filling, this);
        aVar.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        WebView webView = new WebView(context);
        this.f7889n0 = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f7889n0.getSettings().setDomStorageEnabled(true);
        this.f7889n0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            this.f7889n0.getSettings().setMixedContentMode(0);
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.f7889n0, true);
        }
        if (!m35149Pe()) {
            this.f7889n0.setWebViewClient(new WebViewClient());
        } else if (i >= 24) {
            this.f7889n0.setWebViewClient(new C2276b());
        } else {
            this.f7889n0.setWebViewClient(new C2277c());
        }
        this.f7889n0.setWebChromeClient(new C2278d());
        mo33118Qe(this.f7890o0, this.f7889n0);
        aVar.addView(this.f7889n0);
        return aVar;
    }
}
