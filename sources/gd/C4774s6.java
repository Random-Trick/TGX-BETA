package gd;

import android.graphics.Rect;
import android.view.View;
import gd.C4587b;
import ie.C5455v0;
import ie.RunnableC5390g;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p156kd.AbstractC6264v;
import p156kd.C6246h;
import p350yd.HandlerC10770jj;
import td.C9357x2;

public class C4774s6 extends AbstractC4705m6 {
    public final boolean f16199M = false;
    public final String f16200c;

    public C4774s6(AbstractC4761s4 s4Var, TdApi.MessageForwardOriginHiddenUser messageForwardOriginHiddenUser) {
        super(s4Var);
        this.f16200c = messageForwardOriginHiddenUser.senderName;
    }

    @Override
    public void mo25216a() {
    }

    @Override
    public String mo25215b() {
        return this.f16200c;
    }

    @Override
    public C6246h mo25214c() {
        return null;
    }

    @Override
    public C4587b.C4588a mo25213d() {
        return new C4587b.C4588a(C4779t2.m25582W0(this.f16200c), this.f16199M ? null : C4779t2.m25722B1(this.f16200c), this.f16199M ? R.drawable.baseline_phone_24 : 0, 0);
    }

    @Override
    public void mo25212f() {
    }

    @Override
    public boolean mo25211g(View view, final RunnableC5390g gVar, final C5455v0 v0Var, HandlerC10770jj.C10788q qVar, final AbstractC6264v vVar) {
        C9357x2.AbstractC9363f fVar;
        C9357x2.C9365h h = this.f15807a.mo4347s().m14584H3().m8984h(view, this.f15807a.f16101P0);
        if (gVar != null) {
            fVar = new C9357x2.AbstractC9363f() {
                @Override
                public final void mo8098f1(View view2, Rect rect) {
                    RunnableC5390g.this.m22995G0(rect, v0Var);
                }
            };
        } else {
            fVar = vVar != null ? new C9357x2.AbstractC9363f() {
                @Override
                public final void mo8098f1(View view2, Rect rect) {
                    AbstractC6264v.this.mo20248a1(rect);
                }
            } : null;
        }
        h.m8948u(fVar).m8958i(this.f15807a.m26096P0()).m8972C(this.f15807a.mo4348c(), this.f16199M ? R.string.ForwardAuthorImported : R.string.ForwardAuthorHidden).m8919F();
        return true;
    }

    public C4774s6(AbstractC4761s4 s4Var, TdApi.MessageForwardOriginMessageImport messageForwardOriginMessageImport) {
        super(s4Var);
        this.f16200c = messageForwardOriginMessageImport.senderName;
    }
}
