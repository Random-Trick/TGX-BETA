package hd;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import de.ap;
import ie.t;
import ld.b;
import ld.v;
import ud.v4;

public class n1 extends a1 {
    public final int W;
    public final int X;

    public n1(v4<?> v4Var, int i10, int i11) {
        super(v4Var, null);
        this.W = i10;
        this.X = i11;
    }

    @Override
    public boolean B(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override
    public int g(View view, int i10) {
        return ap.W(y());
    }

    @Override
    public <T extends View & t> void j(T t10, Canvas canvas, v vVar, v vVar2, b bVar) {
    }

    @Override
    public int l() {
        return this.X;
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
        return this.W;
    }
}
