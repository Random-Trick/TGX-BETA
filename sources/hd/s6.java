package hd;

import android.graphics.Rect;
import android.view.View;
import hd.b;
import je.g;
import je.v0;
import ld.h;
import ld.v;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.x2;
import zd.hj;

public class s6 extends m6 {
    public final boolean M = false;
    public final String f13521c;

    public s6(s4 s4Var, TdApi.MessageForwardOriginHiddenUser messageForwardOriginHiddenUser) {
        super(s4Var);
        this.f13521c = messageForwardOriginHiddenUser.senderName;
    }

    @Override
    public void a() {
    }

    @Override
    public String b() {
        return this.f13521c;
    }

    @Override
    public h c() {
        return null;
    }

    @Override
    public b.a d() {
        return new b.a(t2.W0(this.f13521c), this.M ? null : t2.B1(this.f13521c), this.M ? R.drawable.baseline_phone_24 : 0, 0);
    }

    @Override
    public void f() {
    }

    @Override
    public boolean g(View view, final g gVar, final v0 v0Var, hj.q qVar, final v vVar) {
        x2.f fVar;
        x2.h h10 = this.f13273a.t().I3().h(view, this.f13273a.P0);
        if (gVar != null) {
            fVar = new x2.f() {
                @Override
                public final void d1(View view2, Rect rect) {
                    g.this.G0(rect, v0Var);
                }
            };
        } else {
            fVar = vVar != null ? new x2.f() {
                @Override
                public final void d1(View view2, Rect rect) {
                    v.this.Z0(rect);
                }
            } : null;
        }
        h10.u(fVar).i(this.f13273a.Q0()).C(this.f13273a.c(), this.M ? R.string.ForwardAuthorImported : R.string.ForwardAuthorHidden).F();
        return true;
    }

    public s6(s4 s4Var, TdApi.MessageForwardOriginMessageImport messageForwardOriginMessageImport) {
        super(s4Var);
        this.f13521c = messageForwardOriginMessageImport.senderName;
    }
}
