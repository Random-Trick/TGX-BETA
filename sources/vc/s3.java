package vc;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ce.a0;
import ce.c0;
import ce.p0;
import gd.w;
import hd.t2;
import ib.i;
import kb.c;
import me.vkryl.android.widget.FrameLayoutFix;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.o6;

public class s3 extends FrameLayoutFix implements View.OnClickListener, c {
    public int M = a0.i(60.0f);
    public int N = a0.i(7.0f);
    public ld.c O = new ld.c(this, 0);
    public r3 P;
    public a Q;
    public int R;
    public ImageView S;

    public interface a {
        void J0(s3 s3Var);
    }

    public s3(Context context, o6 o6Var) {
        super(context);
        setWillNotDraw(false);
        r3 r3Var = new r3(o6Var);
        this.P = r3Var;
        r3Var.X(this);
    }

    public void A1() {
        this.P.Q(this.O);
    }

    public final void B1() {
        int measuredWidth = getMeasuredWidth();
        if (this.R != measuredWidth) {
            this.R = measuredWidth;
            this.P.K((measuredWidth - this.M) - a0.i(12.0f));
        }
    }

    public void C1(TdApi.Message message, CharSequence charSequence) {
        B1();
        this.P.S(charSequence, message);
        invalidate();
    }

    public void D1(String str, TdApi.WebPage webPage) {
        TdApi.Sticker sticker;
        B1();
        TdApi.Minithumbnail minithumbnail = null;
        if (webPage == null) {
            this.P.U(w.i1(R.string.GettingLinkInfo), new t2.d(str, false), null, null);
        } else {
            String b10 = c0.b(webPage.title, webPage.siteName);
            if (i.i(b10)) {
                if (webPage.photo != null || ((sticker = webPage.sticker) != null && Math.max(sticker.width, sticker.height) > 512)) {
                    b10 = w.i1(R.string.Photo);
                } else if (webPage.video != null) {
                    b10 = w.i1(R.string.Video);
                } else {
                    TdApi.Document document = webPage.document;
                    if (document != null || webPage.voiceNote != null) {
                        b10 = document != null ? document.fileName : w.i1(R.string.Audio);
                        if (i.i(b10)) {
                            b10 = w.i1(R.string.File);
                        }
                    } else if (webPage.audio != null) {
                        b10 = t2.m2(webPage.audio) + " – " + t2.f2(webPage.audio);
                    } else if (webPage.sticker != null) {
                        b10 = w.i1(R.string.Sticker);
                    } else {
                        b10 = w.i1(R.string.LinkPreview);
                    }
                }
            }
            String str2 = !e.c1(webPage.description) ? webPage.description.text : webPage.displayUrl;
            r3 r3Var = this.P;
            t2.d dVar = new t2.d(str2, false);
            TdApi.Photo photo = webPage.photo;
            if (photo != null) {
                minithumbnail = photo.minithumbnail;
            }
            r3Var.U(b10, dVar, minithumbnail, t2.u2(webPage));
        }
        invalidate();
    }

    @Override
    public void Q2() {
        b0();
        this.P.Q2();
    }

    public void b0() {
        this.O.b0();
    }

    public r3 getReply() {
        return this.P;
    }

    @Override
    public void onClick(View view) {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.J0(this);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.P.k(canvas, this.M, this.N, getMeasuredWidth() - this.M, this.P.b0(false), this.O, w.G2());
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        B1();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.P.N(this, motionEvent) || super.onTouchEvent(motionEvent);
    }

    public void setPinnedMessage(TdApi.Message message) {
        B1();
        this.P.T(w.i1(R.string.PinnedMessage), message, true);
        invalidate();
    }

    public void z1(a aVar, v4<?> v4Var) {
        this.Q = aVar;
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(a0.i(56.0f), -1);
        q12.gravity = w.F1();
        ImageView imageView = new ImageView(getContext());
        this.S = imageView;
        imageView.setImageResource(R.drawable.baseline_close_24);
        this.S.setColorFilter(j.o0());
        v4Var.q8(this.S, R.id.theme_color_icon);
        this.S.setScaleType(ImageView.ScaleType.CENTER);
        this.S.setLayoutParams(q12);
        this.S.setOnClickListener(this);
        p0.T(this.S);
        this.S.setBackgroundResource(R.drawable.bg_btn_header);
        addView(this.S);
        v4Var.t8(this);
    }
}
