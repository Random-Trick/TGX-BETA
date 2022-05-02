package p291uc;

import android.content.Context;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public class C9606l4 extends RecyclerView {
    public boolean f31145u1;
    public int f31146v1;

    public class C9607a extends RecyclerView.AbstractC0910t {
        public C9607a() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            if (i == 0 || i == 1) {
                C9606l4.this.f31145u1 = false;
            }
        }
    }

    public C9606l4(Context context) {
        super(context);
        m39425k(new C9607a());
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f31145u1 && motionEvent.getAction() == 0) {
            m39499D1();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f31146v1 != getMeasuredWidth()) {
            this.f31146v1 = getMeasuredWidth();
            ((View$OnClickListenerC9592k4) getAdapter()).m8085g0(false);
        }
    }

    @Override
    public void mo8024v1(int i, int i2) {
        this.f31145u1 = i != 0;
        super.mo8024v1(i, i2);
    }
}
