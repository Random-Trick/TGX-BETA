package hd;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import gb.j;
import ie.t;
import ld.p;
import ld.v;
import ne.g1;
import org.drinkless.td.libcore.telegram.TdApi;

public abstract class c {
    public j f12825a;

    public abstract void a(int i10);

    public abstract <T extends View & t> void b(T t10, Canvas canvas, int i10, int i11, v vVar, v vVar2, int i12, int i13, float f10, float f11);

    public abstract int c(int i10);

    public abstract TdApi.File d();

    public abstract g1 f();

    public abstract int h();

    public abstract int j();

    public abstract boolean l(View view, MotionEvent motionEvent);

    public abstract void m(p pVar);

    public abstract void n(ld.c cVar);

    public void p(j jVar) {
        this.f12825a = jVar;
    }
}
