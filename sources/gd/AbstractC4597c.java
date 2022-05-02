package gd;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import me.C6883g1;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p080fb.AbstractC4345j;
import p111he.AbstractC5143t;
import p156kd.AbstractC6264v;
import p156kd.C6240c;
import p156kd.C6257p;

public abstract class AbstractC4597c {
    public AbstractC4345j f15197a;

    public abstract void mo25247a(int i);

    public abstract <T extends View & AbstractC5143t> void mo25246c(T t, Canvas canvas, int i, int i2, AbstractC6264v vVar, AbstractC6264v vVar2, int i3, int i4, float f, float f2);

    public abstract int mo25245d(int i);

    public abstract TdApi.File mo25244g();

    public abstract C6883g1 mo25243h();

    public abstract int mo25242i();

    public abstract int mo25241j();

    public abstract boolean mo25240k(View view, MotionEvent motionEvent);

    public abstract void mo25239l(C6257p pVar);

    public abstract void mo25238m(C6240c cVar);

    public void mo25237n(AbstractC4345j jVar) {
        this.f15197a = jVar;
    }
}
