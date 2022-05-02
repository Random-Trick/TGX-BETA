package org.thunderdog.challegram.widget;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import cd.C2099j;
import cd.C2104l;
import org.thunderdog.challegram.Log;
import p139jb.AbstractC5911c;
import p208oc.C7844p;
import p350yd.C10930q6;
import p364zd.AbstractC11535t;
import p364zd.C11524j;

public class EmbeddableStickerView extends LinearLayout implements AbstractC11535t, AbstractC5911c {
    public final C2099j f25807a;
    public final TextView f25808b;

    public class C7936a extends C2099j {
        public C7936a(Context context) {
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

    public void m14048a() {
        this.f25807a.m35608d();
    }

    @Override
    public void mo4501a3() {
        this.f25807a.mo4501a3();
    }

    public void m14047b() {
        this.f25807a.m35603i();
    }

    @Override
    public void mo90c(boolean z) {
        m14045e();
        invalidate();
    }

    public void m14046d(C10930q6 q6Var) {
        this.f25807a.m35602j(q6Var);
    }

    public void m14045e() {
        this.f25808b.setTextColor(C11524j.m213U0());
        this.f25808b.setHighlightColor(C11524j.m209W0());
    }

    public void setCaptionText(CharSequence charSequence) {
        this.f25808b.setText(charSequence);
    }

    public void setSticker(C2104l lVar) {
        if (lVar != null && !lVar.m35570n()) {
            lVar.m35575i().m20298H(false);
        }
        this.f25807a.setSticker(lVar);
    }

    public EmbeddableStickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EmbeddableStickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        C7936a aVar = new C7936a(context);
        this.f25807a = aVar;
        aVar.setLayoutParams(C7844p.m14878d(Log.TAG_YOUTUBE, Log.TAG_YOUTUBE, 1, 0, 8, 0, 0));
        addView(aVar);
        TextView textView = new TextView(context);
        this.f25808b = textView;
        textView.setGravity(1);
        textView.setTextSize(14.0f);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(C11524j.m209W0());
        addView(textView, C7844p.m14879c(-2, -2, 1.0f, 16, 16, 8, 16, 8));
        m14045e();
    }
}
