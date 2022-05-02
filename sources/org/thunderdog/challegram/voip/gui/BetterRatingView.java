package org.thunderdog.challegram.voip.gui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1410y;
import org.thunderdog.challegram.R;
import p364zd.C11524j;

public class BetterRatingView extends View {
    private OnRatingChangeListener listener;
    private Paint paint = new Paint();
    private int numStars = 5;
    private int selectedRating = 0;
    private Drawable filledStar = C1362c.m37483f(R.drawable.baseline_star_24);
    private Drawable hollowStar = C1362c.m37483f(R.drawable.baseline_star_border_24);

    public interface OnRatingChangeListener {
        void onRatingChanged(int i);
    }

    public BetterRatingView(Context context) {
        super(context);
    }

    public int getRating() {
        return this.selectedRating;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i = 0;
        while (i < this.numStars) {
            this.paint.setColor(C11524j.m159q0());
            C1362c.m37487b(canvas, i < this.selectedRating ? this.filledStar : this.hollowStar, C1357a0.m37541i(48.0f) * i, 0.0f, C1410y.m37068J());
            i++;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        setMeasuredDimension((this.numStars * C1357a0.m37541i(32.0f)) + ((this.numStars - 1) * C1357a0.m37541i(16.0f)), C1357a0.m37541i(32.0f));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        float i2 = C1357a0.m37541i(-8.0f);
        for (int i3 = 0; i3 < this.numStars; i3++) {
            if (motionEvent.getX() <= i2 || motionEvent.getX() >= C1357a0.m37541i(48.0f) + i2 || this.selectedRating == (i = i3 + 1)) {
                i2 += C1357a0.m37541i(48.0f);
            } else {
                this.selectedRating = i;
                OnRatingChangeListener onRatingChangeListener = this.listener;
                if (onRatingChangeListener != null) {
                    onRatingChangeListener.onRatingChanged(i);
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
