package p194nd;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import be.C1357a0;
import be.C1410y;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p139jb.AbstractC5911c;
import p156kd.C6246h;
import p156kd.C6257p;

public class C7508w extends FrameLayoutFix implements AbstractC5911c {
    public C6257p f24028M = new C6257p(this, 0);
    public C6246h f24029N;

    public static class C7509a extends View {
        public C7509a(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            int paddingTop;
            int i;
            int paddingLeft = getPaddingLeft() + (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / 2);
            float f = paddingLeft;
            float paddingTop2 = getPaddingTop() + (((getMeasuredHeight() - getPaddingLeft()) - getPaddingRight()) / 2);
            canvas.drawCircle(f, paddingTop2, C1357a0.m37544i(12.0f), C1410y.m37042g(-1));
            canvas.drawCircle(f, paddingTop2, C1357a0.m37544i(10.0f), C1410y.m37042g(-1813674));
            int i2 = C1357a0.m37544i(5.0f);
            int i3 = C1357a0.m37544i(3.0f) / 2;
            canvas.drawRect(paddingLeft - i2, paddingTop - i3, paddingLeft + i2, paddingTop + i3 + (i % 2), C1410y.m37042g(-1));
        }
    }

    public C7508w(Context context) {
        super(context);
        setWillNotDraw(false);
        int i = C1357a0.m37544i(4.0f);
        int i2 = C1357a0.m37544i(16.0f);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(C1357a0.m37544i(24.0f) + i + i2, C1357a0.m37544i(24.0f) + i + i2, 53);
        C7509a aVar = new C7509a(context);
        aVar.setId(R.id.btn_removePhoto);
        aVar.setLayoutParams(t1);
        aVar.setPadding(i2, i, i, i2);
        addView(aVar);
    }

    @Override
    public void mo4501a3() {
        this.f24028M.m20820G(null);
    }

    public void m15759b() {
        this.f24028M.mo20248b();
    }

    public void m15758f() {
        this.f24028M.mo20246f();
    }

    public C6246h getImage() {
        return this.f24029N;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f24028M.mo20247c0()) {
            canvas.drawRect(this.f24028M.getLeft(), this.f24028M.getTop(), this.f24028M.getRight(), this.f24028M.getBottom(), C1410y.m37042g(587202559));
        }
        this.f24028M.draw(canvas);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(C1357a0.m37544i(100.0f), Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(C1357a0.m37544i(100.0f), Log.TAG_TDLIB_OPTIONS));
        this.f24028M.mo20257K0(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setImage(C6246h hVar) {
        this.f24029N = hVar;
        this.f24028M.m20820G(hVar);
    }

    public void setOnDeleteClick(View.OnClickListener onClickListener) {
        getChildAt(0).setOnClickListener(onClickListener);
    }
}
