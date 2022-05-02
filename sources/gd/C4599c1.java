package gd;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p111he.AbstractC5143t;
import p156kd.AbstractC6264v;
import p156kd.C6238b;
import p292ud.C9773p0;
import td.AbstractC9323v4;

public class C4599c1 extends AbstractC4576a1 {
    public final C4756s f15200W;
    public final C9773p0.AbstractC9776c f15201X;

    public C4599c1(AbstractC9323v4<?> v4Var, TdApi.PageBlock pageBlock, String str, C9773p0.AbstractC9776c cVar) {
        super(v4Var, pageBlock);
        C4756s sVar = (C4756s) AbstractC4718o.m26343Y(v4Var.mo4347s(), v4Var.mo4348c(), pageBlock, cVar);
        this.f15200W = sVar;
        this.f15201X = cVar;
        if (sVar == null) {
            throw new UnsupportedOperationException(pageBlock.toString());
        } else if (pageBlock.getConstructor() == -63371245) {
            sVar.m26258j0(false);
        }
    }

    @Override
    public boolean mo26326C(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean mo26461H() {
        return true;
    }

    @Override
    public boolean mo26660L(View view, boolean z) {
        if (z) {
            return false;
        }
        this.f15036a.mo4348c().m2930B4().m4636w2().m7105H0(this.f15036a.mo4348c(), this.f15200W.m26267a0(), this.f15201X);
        return true;
    }

    public C4756s m27067Y() {
        return this.f15200W;
    }

    @Override
    public int mo26324f(View view, int i) {
        return 0;
    }

    @Override
    public <T extends View & AbstractC5143t> void mo26323i(T t, Canvas canvas, AbstractC6264v vVar, AbstractC6264v vVar2, C6238b bVar) {
    }

    @Override
    public int mo26322p() {
        return 0;
    }

    @Override
    public int mo26321q() {
        return 0;
    }

    @Override
    public int mo26320z() {
        return 41;
    }
}
