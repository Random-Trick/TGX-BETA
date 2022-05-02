package p291uc;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import be.C1357a0;
import be.C1399s0;
import ie.C5375a;

public class C9549h extends View {
    public final C5375a f30948a = new C5375a.C5377b().m23019d(new C9550a()).m23021b();

    public class C9550a implements C5375a.AbstractC5378c {
        public C9550a() {
        }

        @Override
        public boolean mo8363d(C5375a aVar) {
            return C1399s0.m37218C(C9549h.this);
        }

        @Override
        public void mo8362j(C5375a aVar, boolean z) {
            if (z && Build.VERSION.SDK_INT >= 21) {
                C9549h.this.invalidateOutline();
            }
            C9549h.this.invalidate();
        }
    }

    public C9549h(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setMinimumHeight(C1357a0.m37541i(28.0f));
    }

    public void m8364a(int i, boolean z, boolean z2) {
        this.f30948a.m23026u(i, z, z2);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        this.f30948a.m23039d(canvas, paddingLeft + (((getMeasuredWidth() - paddingLeft) - getPaddingRight()) / 2), getMeasuredHeight() / 2, 1, 1.0f);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setPivotX(getPaddingLeft() + ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()));
        setPivotY(getPaddingTop() + ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()));
    }
}
