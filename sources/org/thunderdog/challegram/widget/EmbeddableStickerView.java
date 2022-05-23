package org.thunderdog.challegram.widget;

import ae.t;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import dd.j;
import dd.l;
import kb.c;
import org.thunderdog.challegram.Log;
import pc.p;
import zd.o6;

public class EmbeddableStickerView extends LinearLayout implements t, c {
    public final j f20215a;
    public final TextView f20216b;

    public class a extends j {
        public a(Context context) {
            super(context);
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }
    }

    public EmbeddableStickerView(Context context) {
        this(context, null, 0);
    }

    @Override
    public void Q2() {
        this.f20215a.Q2();
    }

    public void a() {
        this.f20215a.d();
    }

    public void b() {
        this.f20215a.i();
    }

    @Override
    public void c(boolean z10) {
        e();
        invalidate();
    }

    public void d(o6 o6Var) {
        this.f20215a.j(o6Var);
    }

    public void e() {
        this.f20216b.setTextColor(ae.j.R0());
        this.f20216b.setHighlightColor(ae.j.T0());
    }

    public void setCaptionText(CharSequence charSequence) {
        this.f20216b.setText(charSequence);
    }

    public void setSticker(l lVar) {
        if (lVar != null && !lVar.n()) {
            lVar.i().H(false);
        }
        this.f20215a.setSticker(lVar);
    }

    public EmbeddableStickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EmbeddableStickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        a aVar = new a(context);
        this.f20215a = aVar;
        aVar.setLayoutParams(p.d(Log.TAG_YOUTUBE, Log.TAG_YOUTUBE, 1, 0, 8, 0, 0));
        addView(aVar);
        TextView textView = new TextView(context);
        this.f20216b = textView;
        textView.setGravity(1);
        textView.setTextSize(14.0f);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(ae.j.T0());
        addView(textView, p.c(-2, -2, 1.0f, 16, 16, 8, 16, 8));
        e();
    }
}
