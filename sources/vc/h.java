package vc;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import ce.a0;
import ce.p0;
import je.a;

public class h extends View {
    public final je.a f24963a = new a.b().d(new a()).b();

    public class a implements a.c {
        public a() {
        }

        @Override
        public boolean d(je.a aVar) {
            return p0.z(h.this);
        }

        @Override
        public void m(je.a aVar, boolean z10) {
            if (z10) {
                h.this.invalidateOutline();
            }
            h.this.invalidate();
        }
    }

    public h(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setMinimumHeight(a0.i(28.0f));
    }

    public void a(int i10, boolean z10, boolean z11) {
        this.f24963a.v(i10, z10, z11);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        this.f24963a.e(canvas, paddingLeft + (((getMeasuredWidth() - paddingLeft) - getPaddingRight()) / 2), getMeasuredHeight() / 2, 1, 1.0f);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotX(getPaddingLeft() + ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()));
        setPivotY(getPaddingTop() + ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()));
    }
}
