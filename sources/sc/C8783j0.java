package sc;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1389o;
import be.C1399s0;
import be.C1410y;
import me.C6847b2;
import me.vkryl.android.widget.FrameLayoutFix;
import p082fd.C4356b0;
import p139jb.AbstractC5911c;
import p156kd.C6257p;
import p335xd.C10189d;
import p364zd.C11524j;

public class C8783j0 extends FrameLayoutFix implements AbstractC5911c {
    public final C6257p f28339M;
    public final TextView f28340N;
    public C4356b0.C4358b f28341O;

    public C8783j0(Context context) {
        super(context);
        int i = C1357a0.m37544i(9.0f);
        int i2 = C1357a0.m37544i(8.0f);
        int i3 = C1357a0.m37544i(30.0f);
        C6257p pVar = new C6257p(this, 0);
        this.f28339M = pVar;
        int i4 = i2 + i3;
        int i5 = i3 + i;
        pVar.mo20257K0(i2, i, i4, i5);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, -2, 19);
        t1.leftMargin = i4 + C1357a0.m37544i(17.0f);
        t1.rightMargin = i2;
        C6847b2 b2Var = new C6847b2(context);
        this.f28340N = b2Var;
        b2Var.setTextColor(C11524j.m217S0());
        b2Var.setTextSize(1, 16.0f);
        b2Var.setTypeface(C1389o.m37261k());
        b2Var.setSingleLine(true);
        b2Var.setEllipsize(TextUtils.TruncateAt.END);
        b2Var.setLayoutParams(t1);
        addView(b2Var);
        setWillNotDraw(false);
        C1399s0.m37196a0(this);
        C10189d.m5797g(this);
        setLayoutParams(new RecyclerView.LayoutParams(-1, i5 + i));
    }

    @Override
    public void mo4501a3() {
        this.f28339M.m20820G(null);
    }

    public void m11415b() {
        this.f28339M.mo20248b();
    }

    public void m11414f() {
        this.f28339M.mo20246f();
    }

    public C4356b0.C4358b getBucket() {
        return this.f28341O;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f28339M.mo20247c0()) {
            canvas.drawRect(this.f28339M.getLeft(), this.f28339M.getTop(), this.f28339M.getRight(), this.f28339M.getBottom(), C1410y.m37060U());
        }
        this.f28339M.draw(canvas);
    }

    public void setBucket(C4356b0.C4358b bVar) {
        C4356b0.C4358b bVar2 = this.f28341O;
        if (bVar2 == null || bVar2.m28178d() != bVar.m28178d()) {
            this.f28341O = bVar;
            this.f28340N.setText(bVar.m28175g());
            this.f28339M.m20820G(bVar.m28173i());
        }
    }
}
