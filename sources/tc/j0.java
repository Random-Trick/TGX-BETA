package tc;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.o;
import ce.p0;
import ce.y;
import gd.b0;
import kb.c;
import ld.p;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import yd.d;

public class j0 extends FrameLayoutFix implements c {
    public final p M;
    public final TextView N;
    public b0.b O;

    public j0(Context context) {
        super(context);
        int i10 = a0.i(9.0f);
        int i11 = a0.i(8.0f);
        int i12 = a0.i(30.0f);
        p pVar = new p(this, 0);
        this.M = pVar;
        int i13 = i11 + i12;
        int i14 = i12 + i10;
        pVar.K0(i11, i10, i13, i14);
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-2, -2, 19);
        r12.leftMargin = i13 + a0.i(17.0f);
        r12.rightMargin = i11;
        b2 b2Var = new b2(context);
        this.N = b2Var;
        b2Var.setTextColor(j.P0());
        b2Var.setTextSize(1, 16.0f);
        b2Var.setTypeface(o.k());
        b2Var.setSingleLine(true);
        b2Var.setEllipsize(TextUtils.TruncateAt.END);
        b2Var.setLayoutParams(r12);
        addView(b2Var);
        setWillNotDraw(false);
        p0.T(this);
        d.g(this);
        setLayoutParams(new RecyclerView.LayoutParams(-1, i14 + i10));
    }

    @Override
    public void Q2() {
        this.M.G(null);
    }

    public void b() {
        this.M.b();
    }

    public void e() {
        this.M.e();
    }

    public b0.b getBucket() {
        return this.O;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.M.e0()) {
            canvas.drawRect(this.M.getLeft(), this.M.getTop(), this.M.getRight(), this.M.getBottom(), y.U());
        }
        this.M.draw(canvas);
    }

    public void setBucket(b0.b bVar) {
        b0.b bVar2 = this.O;
        if (bVar2 == null || bVar2.d() != bVar.d()) {
            this.O = bVar;
            this.N.setText(bVar.g());
            this.M.G(bVar.i());
        }
    }
}
