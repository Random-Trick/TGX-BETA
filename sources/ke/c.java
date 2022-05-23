package ke;

import android.webkit.JavascriptInterface;
import ce.j0;
import de.p9;
import de.y00;

public final class c {
    public final p9 f15954a;

    public c(p9 p9Var) {
        this.f15954a = p9Var;
    }

    public void b(String str) {
        if (this.f15954a.w9() != null && this.f15954a.x9().f9063e != null) {
            p9.a x92 = this.f15954a.x9();
            if ("share_game".equals(str)) {
                y00 y00Var = new y00(this.f15954a.t(), this.f15954a.c());
                y00Var.Vi(new y00.m(x92.f9060b, x92.f9059a, x92.f9063e, false));
                y00Var.ej();
            } else if ("share_score".equals(str)) {
                y00 y00Var2 = new y00(this.f15954a.t(), this.f15954a.c());
                y00Var2.Vi(new y00.m(x92.f9060b, x92.f9059a, x92.f9063e, true));
                y00Var2.ej();
            }
        }
    }

    @JavascriptInterface
    public final void postEvent(final String str, String str2) {
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                c.this.b(str);
            }
        });
    }
}
