package p291uc;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import me.AbstractC6828a;
import p139jb.AbstractC5911c;
import p168ld.RunnableC6507m;

public class C9555h3 extends View implements AbstractC6828a, AbstractC5911c {
    public final RunnableC6507m f30976a = new RunnableC6507m(this);

    public C9555h3(Context context) {
        super(context);
    }

    public RunnableC6507m m8319a() {
        return this.f30976a;
    }

    @Override
    public void mo4501a3() {
        this.f30976a.mo20250Z();
    }

    @Override
    public void mo8229b() {
        this.f30976a.mo20248b();
    }

    @Override
    public void mo8225f() {
        this.f30976a.mo20246f();
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.f30976a.draw(canvas);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f30976a.mo20257K0(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
