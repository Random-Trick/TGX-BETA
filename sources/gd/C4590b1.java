package gd;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1410y;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p156kd.AbstractC6264v;
import p156kd.C6238b;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C4590b1 extends AbstractC4576a1 {
    public C4590b1(AbstractC9323v4<?> v4Var, TdApi.PageBlock pageBlock) {
        super(v4Var, pageBlock);
    }

    @Override
    public boolean mo26325C(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override
    public int mo26323f(View view, int i) {
        return C1357a0.m37541i(20.0f);
    }

    @Override
    public void mo26322i(View view, Canvas canvas, AbstractC6264v vVar, AbstractC6264v vVar2, C6238b bVar) {
        int i = C1357a0.m37541i(9.0f);
        int measuredWidth = (view.getMeasuredWidth() - m27297A()) / 2;
        int x = (measuredWidth - (measuredWidth / 2)) + m27274x(true);
        canvas.drawRect(x, i, x + measuredWidth, i + C1357a0.m37541i(1.0f), C1410y.m37039g(C11524j.m228N(R.id.theme_color_iv_separator)));
    }

    @Override
    public int mo26321p() {
        return C1357a0.m37541i(1.0f);
    }

    @Override
    public int mo26320q() {
        return C1357a0.m37541i(9.0f);
    }

    @Override
    public int mo26319z() {
        return 48;
    }
}
