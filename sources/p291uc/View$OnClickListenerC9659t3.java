package p291uc;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import be.C1357a0;
import be.C1363c0;
import be.C1399s0;
import gd.C4779t2;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5070i;
import p139jb.AbstractC5911c;
import p156kd.C6240c;
import p193nb.C7321e;
import p350yd.C10930q6;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class View$OnClickListenerC9659t3 extends FrameLayoutFix implements View.OnClickListener, AbstractC5911c {
    public int f31370M = C1357a0.m37541i(60.0f);
    public int f31371N = C1357a0.m37541i(7.0f);
    public C6240c f31372O = new C6240c(this, 0);
    public RunnableC9651s3 f31373P;
    public AbstractC9660a f31374Q;
    public int f31375R;
    public ImageView f31376S;

    public interface AbstractC9660a {
        void mo7841a4(View$OnClickListenerC9659t3 t3Var);
    }

    public View$OnClickListenerC9659t3(Context context, C10930q6 q6Var) {
        super(context);
        setWillNotDraw(false);
        RunnableC9651s3 s3Var = new RunnableC9651s3(q6Var);
        this.f31373P = s3Var;
        s3Var.m7889X(this);
    }

    public void m7847C1(AbstractC9660a aVar, AbstractC9323v4<?> v4Var) {
        this.f31374Q = aVar;
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(C1357a0.m37541i(56.0f), -1);
        s1.gravity = C4403w.m27989F1();
        ImageView imageView = new ImageView(getContext());
        this.f31376S = imageView;
        imageView.setImageResource(R.drawable.baseline_close_24);
        this.f31376S.setColorFilter(C11524j.m159q0());
        v4Var.m9184q8(this.f31376S, R.id.theme_color_icon);
        this.f31376S.setScaleType(ImageView.ScaleType.CENTER);
        this.f31376S.setLayoutParams(s1);
        this.f31376S.setOnClickListener(this);
        C1399s0.m37193a0(this.f31376S);
        this.f31376S.setBackgroundResource(R.drawable.bg_btn_header);
        addView(this.f31376S);
        v4Var.m9163t8(this);
    }

    public void m7846D1() {
        this.f31373P.m7896Q(this.f31372O);
    }

    public final void m7845E1() {
        int measuredWidth = getMeasuredWidth();
        if (this.f31375R != measuredWidth) {
            this.f31375R = measuredWidth;
            this.f31373P.m7902K((measuredWidth - this.f31370M) - C1357a0.m37541i(12.0f));
        }
    }

    public void m7844F1(TdApi.Message message, CharSequence charSequence) {
        m7845E1();
        this.f31373P.m7894S(charSequence, message);
        invalidate();
    }

    public void m7843G1(String str, TdApi.WebPage webPage) {
        TdApi.Sticker sticker;
        m7845E1();
        TdApi.Minithumbnail minithumbnail = null;
        if (webPage == null) {
            this.f31373P.m7892U(C4403w.m27869i1(R.string.GettingLinkInfo), new C4779t2.C4783d(str, false), null, null);
        } else {
            String b = C1363c0.m37445b(webPage.title, webPage.siteName);
            if (C5070i.m24061i(b)) {
                if (webPage.photo != null || ((sticker = webPage.sticker) != null && Math.max(sticker.width, sticker.height) > 512)) {
                    b = C4403w.m27869i1(R.string.Photo);
                } else if (webPage.video != null) {
                    b = C4403w.m27869i1(R.string.Video);
                } else {
                    TdApi.Document document = webPage.document;
                    if (document != null || webPage.voiceNote != null) {
                        b = document != null ? document.fileName : C4403w.m27869i1(R.string.Audio);
                        if (C5070i.m24061i(b)) {
                            b = C4403w.m27869i1(R.string.File);
                        }
                    } else if (webPage.audio != null) {
                        b = C4779t2.m25472m2(webPage.audio) + " – " + C4779t2.m25521f2(webPage.audio);
                    } else if (webPage.sticker != null) {
                        b = C4403w.m27869i1(R.string.Sticker);
                    } else {
                        b = C4403w.m27869i1(R.string.LinkPreview);
                    }
                }
            }
            String str2 = !C7321e.m16965a1(webPage.description) ? webPage.description.text : webPage.displayUrl;
            RunnableC9651s3 s3Var = this.f31373P;
            C4779t2.C4783d dVar = new C4779t2.C4783d(str2, false);
            TdApi.Photo photo = webPage.photo;
            if (photo != null) {
                minithumbnail = photo.minithumbnail;
            }
            s3Var.m7892U(b, dVar, minithumbnail, C4779t2.m25416u2(webPage));
        }
        invalidate();
    }

    public void m7842Z() {
        this.f31372O.mo20249Z();
    }

    @Override
    public void mo4501a3() {
        m7842Z();
        this.f31373P.mo4501a3();
    }

    public RunnableC9651s3 getReply() {
        return this.f31373P;
    }

    @Override
    public void onClick(View view) {
        AbstractC9660a aVar = this.f31374Q;
        if (aVar != null) {
            aVar.mo7841a4(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.f31373P.m7874k(canvas, this.f31370M, this.f31371N, getMeasuredWidth() - this.f31370M, this.f31373P.m7883b0(false), this.f31372O, C4403w.m27984G2());
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m7845E1();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f31373P.m7899N(this, motionEvent) || super.onTouchEvent(motionEvent);
    }

    public void setPinnedMessage(TdApi.Message message) {
        m7845E1();
        this.f31373P.m7893T(C4403w.m27869i1(R.string.PinnedMessage), message, true);
        invalidate();
    }
}
