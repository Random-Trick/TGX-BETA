package p291uc;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import me.AbstractC6828a;
import p139jb.AbstractC5911c;
import p168ld.RunnableC6507m;

public class C9555h3 extends View implements AbstractC6828a, AbstractC5911c {
    public final RunnableC6507m f30973a = new RunnableC6507m(this);

    public C9555h3(Context context) {
        super(context);
    }

    public RunnableC6507m m8319a() {
        return this.f30973a;
    }

    @Override
    public void mo4501a3() {
        this.f30973a.mo20249Z();
    }

    @Override
    public void mo8229b() {
        this.f30973a.mo20247b();
    }

    @Override
    public void mo8225f() {
        this.f30973a.mo20245f();
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.f30973a.draw(canvas);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f30973a.mo20256K0(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }
}
