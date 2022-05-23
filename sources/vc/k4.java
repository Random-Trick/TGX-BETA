package vc;

import android.content.Context;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public class k4 extends RecyclerView {
    public boolean f25087t1;
    public int f25088u1;

    public class a extends RecyclerView.t {
        public a() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0 || i10 == 1) {
                k4.this.f25087t1 = false;
            }
        }
    }

    public k4(Context context) {
        super(context);
        k(new a());
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f25087t1 && motionEvent.getAction() == 0) {
            C1();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f25088u1 != getMeasuredWidth()) {
            this.f25088u1 = getMeasuredWidth();
            ((j4) getAdapter()).f0(false);
        }
    }

    @Override
    public void u1(int i10, int i11) {
        this.f25087t1 = i10 != 0;
        super.u1(i10, i11);
    }
}
