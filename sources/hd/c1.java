package hd;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import ie.t;
import ld.b;
import ld.v;
import org.drinkless.td.libcore.telegram.TdApi;
import ud.v4;
import vd.o0;

public class c1 extends a1 {
    public final s W;
    public final o0.c X;

    public c1(v4<?> v4Var, TdApi.PageBlock pageBlock, String str, o0.c cVar) {
        super(v4Var, pageBlock);
        s sVar = (s) o.Y(v4Var.t(), v4Var.c(), pageBlock, cVar);
        this.W = sVar;
        this.X = cVar;
        if (sVar == null) {
            throw new UnsupportedOperationException(pageBlock.toString());
        } else if (pageBlock.getConstructor() == -63371245) {
            sVar.j0(false);
        }
    }

    @Override
    public boolean B(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean G() {
        return true;
    }

    @Override
    public boolean K(View view, boolean z10) {
        if (z10) {
            return false;
        }
        this.f12692a.c().F4().w2().H0(this.f12692a.c(), this.W.a0(), this.X);
        return true;
    }

    public s X() {
        return this.W;
    }

    @Override
    public int g(View view, int i10) {
        return 0;
    }

    @Override
    public <T extends View & t> void j(T t10, Canvas canvas, v vVar, v vVar2, b bVar) {
    }

    @Override
    public int p() {
        return 0;
    }

    @Override
    public int q() {
        return 0;
    }

    @Override
    public int y() {
        return 41;
    }
}
