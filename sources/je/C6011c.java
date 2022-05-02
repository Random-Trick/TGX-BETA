package je;

import android.webkit.JavascriptInterface;
import be.C1379j0;
import p038ce.C2869p9;
import p038ce.x00;

public final class C6011c {
    public final C2869p9 f19129a;

    public C6011c(C2869p9 p9Var) {
        this.f19129a = p9Var;
    }

    public void m21575b(String str) {
        if (this.f19129a.m9139w9() != null && this.f19129a.m9131x9().f9633e != null) {
            C2869p9.C2870a x9 = this.f19129a.m9131x9();
            if ("share_game".equals(str)) {
                x00 x00Var = new x00(this.f19129a.mo4347s(), this.f19129a.mo4348c());
                x00Var.m30996Vi(new x00.C3281m(x9.f9630b, x9.f9629a, x9.f9633e, false));
                x00Var.m30962ej();
            } else if ("share_score".equals(str)) {
                x00 x00Var2 = new x00(this.f19129a.mo4347s(), this.f19129a.mo4348c());
                x00Var2.m30996Vi(new x00.C3281m(x9.f9630b, x9.f9629a, x9.f9633e, true));
                x00Var2.m30962ej();
            }
        }
    }

    @JavascriptInterface
    public final void postEvent(final String str, String str2) {
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                C6011c.this.m21575b(str);
            }
        });
    }
}
