package org.thunderdog.challegram.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

public class CustomImageView extends ImageView {
    public boolean f25809a;

    public CustomImageView(Context context) {
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (motionEvent.getAction() != 0 || (getVisibility() == 0 && getAlpha() == 1.0f)) && super.onTouchEvent(motionEvent);
    }

    @Override
    public void requestLayout() {
        if (!this.f25809a) {
            super.requestLayout();
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        this.f25809a = true;
        super.setImageBitmap(bitmap);
        this.f25809a = false;
    }

    public CustomImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
