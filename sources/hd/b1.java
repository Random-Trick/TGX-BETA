package hd;

import ae.j;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.y;
import ld.b;
import ld.v;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;

public class b1 extends a1 {
    public b1(v4<?> v4Var, TdApi.PageBlock pageBlock) {
        super(v4Var, pageBlock);
    }

    @Override
    public boolean B(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override
    public int g(View view, int i10) {
        return a0.i(20.0f);
    }

    @Override
    public void j(View view, Canvas canvas, v vVar, v vVar2, b bVar) {
        int i10 = a0.i(9.0f);
        int measuredWidth = (view.getMeasuredWidth() - z()) / 2;
        int w10 = (measuredWidth - (measuredWidth / 2)) + w(true);
        canvas.drawRect(w10, i10, w10 + measuredWidth, i10 + a0.i(1.0f), y.g(j.L(R.id.theme_color_iv_separator)));
    }

    @Override
    public int p() {
        return a0.i(1.0f);
    }

    @Override
    public int q() {
        return a0.i(9.0f);
    }

    @Override
    public int y() {
        return 48;
    }
}
