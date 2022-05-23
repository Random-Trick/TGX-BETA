package de;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import ce.a0;
import ce.v;
import de.y00;
import gd.w;
import he.n;
import ke.c;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.d1;
import ud.h1;
import ud.j1;
import ud.q1;
import ud.s;
import zd.o6;

public class p9 extends e40<a> implements h1, j1 {

    public static class a {
        public long f9059a;
        public TdApi.Game f9060b;
        public String f9061c;
        public String f9062d;
        public TdApi.Message f9063e;
        public rh f9064f;

        public a(long j10, TdApi.Game game, String str, String str2, TdApi.Message message, rh rhVar) {
            this.f9059a = j10;
            this.f9060b = game;
            this.f9061c = str;
            this.f9062d = str2;
            this.f9063e = message;
            this.f9064f = rhVar;
        }
    }

    public p9(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    @Override
    public void J(int i10, View view) {
        if (i10 != R.id.menu_btn_forward) {
            if (i10 == R.id.menu_btn_more) {
                Yd(new int[]{R.id.btn_openLink}, new String[]{w.i1(R.string.OpenInExternalApp)}, 0);
            }
        } else if (w9() != null) {
            a x92 = x9();
            y00 y00Var = new y00(this.f24493a, this.f24495b);
            y00Var.Vi(new y00.m(x92.f9060b, x92.f9059a, x92.f9063e, false));
            y00Var.ej();
        }
    }

    @Override
    public void P0(int i10) {
        if (i10 == R.id.btn_openLink && w9() != null) {
            v.E(w9().f9062d);
        }
    }

    @Override
    @SuppressLint({"AddJavascriptInterface"})
    public void Qe(s sVar, WebView webView) {
        if (w9() != null) {
            sVar.setTitle(w9().f9060b.title);
            sVar.setSubtitle(w9().f9061c);
        }
        webView.addJavascriptInterface(new c(this), "TelegramWebviewProxy");
        if (w9() != null) {
            webView.loadUrl(w9().f9062d);
        }
    }

    @Override
    public boolean S8(q1 q1Var, float f10, float f11) {
        return f11 < ((float) n.e()) || f10 <= ((float) a0.i(15.0f));
    }

    public final void Te() {
        if (x9().f9064f != null) {
            x9().f9064f.Mp((!Ta() || Sa() || this.f24493a.L0() != 0) ? TdApi.ChatActionCancel.CONSTRUCTOR : TdApi.ChatActionStartPlayingGame.CONSTRUCTOR);
        }
    }

    @Override
    public int W9() {
        return R.id.menu_game;
    }

    @Override
    public void c6() {
        super.c6();
        Te();
    }

    @Override
    public void o6() {
        super.o6();
        Te();
    }

    @Override
    public void tc() {
        super.tc();
        Te();
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_game) {
            d1Var.X1(linearLayout, this);
            d1Var.a2(linearLayout, this);
        }
    }
}
