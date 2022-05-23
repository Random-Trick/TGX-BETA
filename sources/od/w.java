package od;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import ce.a0;
import ce.y;
import kb.c;
import ld.h;
import ld.p;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;

public class w extends FrameLayoutFix implements c {
    public p M = new p(this, 0);
    public h N;

    public static class a extends View {
        public a(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            int paddingTop;
            int i10;
            int paddingLeft = getPaddingLeft() + (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / 2);
            float f10 = paddingLeft;
            float paddingTop2 = getPaddingTop() + (((getMeasuredHeight() - getPaddingLeft()) - getPaddingRight()) / 2);
            canvas.drawCircle(f10, paddingTop2, a0.i(12.0f), y.g(-1));
            canvas.drawCircle(f10, paddingTop2, a0.i(10.0f), y.g(-1813674));
            int i11 = a0.i(5.0f);
            int i12 = a0.i(3.0f) / 2;
            canvas.drawRect(paddingLeft - i11, paddingTop - i12, paddingLeft + i11, paddingTop + i12 + (i10 % 2), y.g(-1));
        }
    }

    public w(Context context) {
        super(context);
        setWillNotDraw(false);
        int i10 = a0.i(4.0f);
        int i11 = a0.i(16.0f);
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(a0.i(24.0f) + i10 + i11, a0.i(24.0f) + i10 + i11, 53);
        a aVar = new a(context);
        aVar.setId(R.id.btn_removePhoto);
        aVar.setLayoutParams(r12);
        aVar.setPadding(i11, i10, i10, i11);
        addView(aVar);
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

    public h getImage() {
        return this.N;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.M.e0()) {
            canvas.drawRect(this.M.getLeft(), this.M.getTop(), this.M.getRight(), this.M.getBottom(), y.g(587202559));
        }
        this.M.draw(canvas);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(a0.i(100.0f), Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(a0.i(100.0f), Log.TAG_TDLIB_OPTIONS));
        this.M.K0(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setImage(h hVar) {
        this.N = hVar;
        this.M.G(hVar);
    }

    public void setOnDeleteClick(View.OnClickListener onClickListener) {
        getChildAt(0).setOnClickListener(onClickListener);
    }
}
