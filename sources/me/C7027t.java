package me;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import gd.C4779t2;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3940f;
import p051db.C3950k;
import p051db.C3953l;
import p168ld.C6503j;
import p168ld.RunnableC6507m;
import p208oc.AbstractC7821f;
import p208oc.C7816a;
import p208oc.C7833i;
import p208oc.C7843o;
import p208oc.C7845q;
import p208oc.C7850u;
import p224pc.C8105a;
import p224pc.C8108c;
import p224pc.C8109d;
import p335xd.C10192g;
import p350yd.C10930q6;
import td.AbstractC9323v4;

public class C7027t extends FrameLayout implements C3950k.AbstractC3952b, AbstractC6828a, C7833i.AbstractC7835b {
    public C7833i f22300M;
    public boolean f22301N;
    public boolean f22302O;
    public final C3940f f22303P = new C3940f(0, this, C2057b.f7280b, 120, true);
    public int f22304Q;
    public AbstractC7821f<?, ?> f22305R;
    public TdApi.Sticker f22306S;
    public final RunnableC6507m f22307a;
    public C10930q6 f22308b;
    public AbstractC7028a f22309c;

    public interface AbstractC7028a {
        AbstractC7821f.C7830i mo18061g();
    }

    public C7027t(Context context) {
        super(context);
        RunnableC6507m mVar = new RunnableC6507m(this);
        this.f22307a = mVar;
        mVar.mo20248b();
        setWillNotDraw(false);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
    }

    public void m18065h(TdApi.AnimatedEmoji animatedEmoji, C10930q6 q6Var) {
        TdApi.Sticker sticker = animatedEmoji.sticker;
        this.f22306S = sticker;
        C6503j jVar = new C6503j(q6Var, sticker.sticker, 3);
        jVar.m20298I(1);
        this.f22307a.m20232r(jVar);
        m18063j();
    }

    public void m18064i(final C10930q6 q6Var, TdApi.Object object) {
        if (object.getConstructor() == -1816658231) {
            final TdApi.AnimatedEmoji animatedEmoji = (TdApi.AnimatedEmoji) object;
            q6Var.m2549Za(new Runnable() {
                @Override
                public final void run() {
                    C7027t.this.m18065h(animatedEmoji, q6Var);
                }
            });
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            invalidate();
            m18067e();
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        C3953l.m29528a(this, i, f, kVar);
    }

    @Override
    public void mo14906a(C7833i iVar, C8105a aVar) {
        m18062k(true);
    }

    @Override
    public void mo8229b() {
        this.f22301N = false;
        m18067e();
    }

    public final void m18067e() {
        boolean z = this.f22301N && this.f22303P.m29586g() < 1.0f;
        if (this.f22302O != z) {
            this.f22302O = z;
            if (z) {
                this.f22307a.mo20246f();
            } else {
                this.f22307a.mo20248b();
            }
        }
    }

    @Override
    public void mo8225f() {
        this.f22301N = true;
        m18067e();
    }

    public void m18066g(final C10930q6 q6Var, int i, AbstractC7028a aVar, AbstractC9323v4<?> v4Var) {
        this.f22308b = q6Var;
        this.f22309c = aVar;
        this.f22304Q = i;
        C10192g.m5782i(this, R.id.theme_color_filling, v4Var);
        q6Var.m2270r4().m14783o(new TdApi.GetAnimatedEmoji(C4779t2.f16220E.f16283a), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                C7027t.this.m18064i(q6Var, object);
            }
        });
        if (i == 1) {
            this.f22305R = new C7843o(getContext());
        } else if (i == 2) {
            this.f22305R = new C7850u(getContext());
        } else if (i != 4) {
            this.f22305R = new C7845q(getContext());
        } else {
            this.f22305R = new C7816a(getContext());
        }
        this.f22305R.f25112a = aVar.mo18061g();
        addView(this.f22305R);
        addView(this.f22305R.f25106V0, -2, -2);
        this.f22305R.f25106V0.m12884g(false, true);
        this.f22305R.m14948O();
        if (v4Var != null) {
            v4Var.m9163t8(this.f22305R);
        }
    }

    public final void m18063j() {
        if (this.f22306S != null) {
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            if (measuredWidth != 0 && measuredHeight != 0) {
                int max = Math.max(C1357a0.m37544i(100.0f), (int) C1357a0.m37532u(this.f22306S.width));
                int max2 = Math.max(C1357a0.m37544i(100.0f), (int) C1357a0.m37532u(this.f22306S.height));
                int i = measuredWidth - (max / 2);
                int i2 = measuredHeight - (max2 / 2);
                this.f22307a.mo20257K0(i, i2, max + i, max2 + i2);
            }
        }
    }

    public final void m18062k(boolean z) {
        C7833i iVar = this.f22300M;
        if (iVar != null) {
            this.f22305R.setListener(iVar);
            C8105a h = this.f22300M.m14921h();
            int i = this.f22304Q;
            if (i == 1) {
                ((C7843o) this.f22305R).setData((C8108c) h);
            } else if (i == 2) {
                ((C7850u) this.f22305R).setData((C8109d) h);
            } else if (i != 4) {
                ((C7845q) this.f22305R).setData(h);
            } else {
                ((C7816a) this.f22305R).setData(h);
            }
            this.f22305R.f25106V0.m12884g(!this.f22300M.m14915n(), !z);
            return;
        }
        this.f22305R.setListener(null);
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.f22307a.setAlpha(1.0f - this.f22303P.m29586g());
        this.f22307a.draw(canvas);
    }

    @Override
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, size2 > size ? i : View.MeasureSpec.makeMeasureSpec(size2, Log.TAG_TDLIB_OPTIONS));
        m18063j();
    }

    public void setChart(C7833i iVar) {
        C7833i iVar2 = this.f22300M;
        if (iVar2 != iVar) {
            if (iVar2 != null) {
                iVar2.m14922g(this);
            }
            this.f22300M = iVar;
            if (iVar != null) {
                this.f22305R.f25106V0.f26828a = iVar.m14911r();
                m18062k(false);
                iVar.m14924e(this);
            }
        }
    }
}
