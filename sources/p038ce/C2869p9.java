package p038ce;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import be.C1357a0;
import be.C1405v;
import ge.C4896n;
import je.C6011c;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p038ce.x00;
import p082fd.C4403w;
import p350yd.C10930q6;
import td.AbstractC9201h1;
import td.AbstractC9213j1;
import td.C9270q1;
import td.C9289s;
import td.View$OnClickListenerC9170d1;

public class C2869p9 extends d40<C2870a> implements AbstractC9201h1, AbstractC9213j1 {

    public static class C2870a {
        public long f9629a;
        public TdApi.Game f9630b;
        public String f9631c;
        public String f9632d;
        public TdApi.Message f9633e;
        public View$OnClickListenerC2971rh f9634f;

        public C2870a(long j, TdApi.Game game, String str, String str2, TdApi.Message message, View$OnClickListenerC2971rh rhVar) {
            this.f9629a = j;
            this.f9630b = game;
            this.f9631c = str;
            this.f9632d = str2;
            this.f9633e = message;
            this.f9634f = rhVar;
        }
    }

    public C2869p9(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    @Override
    public void mo419J(int i, View view) {
        if (i != R.id.menu_btn_forward) {
            if (i == R.id.menu_btn_more) {
                m9302Yd(new int[]{R.id.btn_openLink}, new String[]{C4403w.m27869i1(R.string.OpenInExternalApp)}, 0);
            }
        } else if (m9139w9() != null) {
            C2870a x9 = m9131x9();
            x00 x00Var = new x00(this.f30165a, this.f30167b);
            x00Var.m30994Vi(new x00.C3281m(x9.f9630b, x9.f9629a, x9.f9633e, false));
            x00Var.m30960ej();
        }
    }

    @Override
    public void mo8864N0(int i) {
        if (i == R.id.btn_openLink && m9139w9() != null) {
            C1405v.m37138E(m9139w9().f9632d);
        }
    }

    @Override
    @SuppressLint({"AddJavascriptInterface"})
    public void mo33118Qe(C9289s sVar, WebView webView) {
        if (m9139w9() != null) {
            sVar.setTitle(m9139w9().f9630b.title);
            sVar.setSubtitle(m9139w9().f9631c);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            webView.addJavascriptInterface(new C6011c(this), "TelegramWebviewProxy");
        }
        if (m9139w9() != null) {
            webView.loadUrl(m9139w9().f9632d);
        }
    }

    @Override
    public boolean mo8863S8(C9270q1 q1Var, float f, float f2) {
        return f2 < ((float) C4896n.m24478e()) || f <= ((float) C1357a0.m37541i(15.0f));
    }

    public final void m33117Te() {
        if (m9131x9().f9634f != null) {
            m9131x9().f9634f.m32651Mp((!m9339Ta() || m9347Sa() || this.f30165a.m14582I0() != 0) ? TdApi.ChatActionCancel.CONSTRUCTOR : TdApi.ChatActionStartPlayingGame.CONSTRUCTOR);
        }
    }

    @Override
    public int mo418W9() {
        return R.id.menu_game;
    }

    @Override
    public void mo6904d6() {
        super.mo6904d6();
        m33117Te();
    }

    @Override
    public void mo6871o6() {
        super.mo6871o6();
        m33117Te();
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_game) {
            d1Var.m10076Y1(linearLayout, this);
            d1Var.m10069b2(linearLayout, this);
        }
    }

    @Override
    public void mo9159tc() {
        super.mo9159tc();
        m33117Te();
    }
}
