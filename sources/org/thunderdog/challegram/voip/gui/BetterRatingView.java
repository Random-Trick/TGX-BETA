package org.thunderdog.challegram.voip.gui;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.c;
import ce.y;
import org.thunderdog.challegram.R;

public class BetterRatingView extends View {
    private OnRatingChangeListener listener;
    private Paint paint = new Paint();
    private int numStars = 5;
    private int selectedRating = 0;
    private Drawable filledStar = c.f(R.drawable.baseline_star_24);
    private Drawable hollowStar = c.f(R.drawable.baseline_star_border_24);

    public interface OnRatingChangeListener {
        void onRatingChanged(int i10);
    }

    public BetterRatingView(Context context) {
        super(context);
    }

    public int getRating() {
        return this.selectedRating;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10 = 0;
        while (i10 < this.numStars) {
            this.paint.setColor(j.o0());
            c.b(canvas, i10 < this.selectedRating ? this.filledStar : this.hollowStar, a0.i(48.0f) * i10, 0.0f, y.J());
            i10++;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension((this.numStars * a0.i(32.0f)) + ((this.numStars - 1) * a0.i(16.0f)), a0.i(32.0f));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        float i11 = a0.i(-8.0f);
        for (int i12 = 0; i12 < this.numStars; i12++) {
            if (motionEvent.getX() <= i11 || motionEvent.getX() >= a0.i(48.0f) + i11 || this.selectedRating == (i10 = i12 + 1)) {
                i11 += a0.i(48.0f);
            } else {
                this.selectedRating = i10;
                OnRatingChangeListener onRatingChangeListener = this.listener;
                if (onRatingChangeListener != null) {
                    onRatingChangeListener.onRatingChanged(i10);
                }
                invalidate();
                return true;
            }
        }
        return true;
    }

    public void setOnRatingChangeListener(OnRatingChangeListener onRatingChangeListener) {
        this.listener = onRatingChangeListener;
    }
}
