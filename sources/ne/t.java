package ne;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import db.b;
import eb.f;
import eb.k;
import eb.l;
import hd.t2;
import md.j;
import md.m;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import pc.f;
import pc.i;
import pc.o;
import pc.q;
import pc.u;
import qc.c;
import qc.d;
import ud.v4;
import yd.g;
import zd.o6;

public class t extends FrameLayout implements k.b, ne.a, i.b {
    public i M;
    public boolean N;
    public boolean O;
    public final f P = new f(0, this, b.f7287b, 120, true);
    public int Q;
    public pc.f<?, ?> R;
    public TdApi.Sticker S;
    public final m f18381a;
    public o6 f18382b;
    public a f18383c;

    public interface a {
        f.i i();
    }

    public t(Context context) {
        super(context);
        m mVar = new m(this);
        this.f18381a = mVar;
        mVar.b();
        setWillNotDraw(false);
        setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
    }

    public void h(TdApi.AnimatedEmoji animatedEmoji, o6 o6Var) {
        TdApi.Sticker sticker = animatedEmoji.sticker;
        this.S = sticker;
        j jVar = new j(o6Var, sticker.sticker, 3);
        jVar.I(1);
        this.f18381a.r(jVar);
        j();
    }

    public void i(final o6 o6Var, TdApi.Object object) {
        if (object.getConstructor() == -1816658231) {
            final TdApi.AnimatedEmoji animatedEmoji = (TdApi.AnimatedEmoji) object;
            o6Var.db(new Runnable() {
                @Override
                public final void run() {
                    t.this.h(animatedEmoji, o6Var);
                }
            });
        }
    }

    @Override
    public void a(i iVar, qc.a aVar) {
        k(true);
    }

    @Override
    public void b() {
        this.N = false;
        f();
    }

    @Override
    public void e() {
        this.N = true;
        f();
    }

    public final void f() {
        boolean z10 = this.N && this.P.g() < 1.0f;
        if (this.O != z10) {
            this.O = z10;
            if (z10) {
                this.f18381a.e();
            } else {
                this.f18381a.b();
            }
        }
    }

    public void g(final o6 o6Var, int i10, a aVar, v4<?> v4Var) {
        this.f18382b = o6Var;
        this.f18383c = aVar;
        this.Q = i10;
        g.i(this, R.id.theme_color_filling, v4Var);
        o6Var.v4().o(new TdApi.GetAnimatedEmoji(t2.E.f13581a), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                t.this.i(o6Var, object);
            }
        });
        if (i10 == 1) {
            this.R = new o(getContext());
        } else if (i10 == 2) {
            this.R = new u(getContext());
        } else if (i10 != 4) {
            this.R = new q(getContext());
        } else {
            this.R = new pc.a(getContext());
        }
        this.R.f21012a = aVar.i();
        addView(this.R);
        addView(this.R.V0, -2, -2);
        this.R.V0.g(false, true);
        this.R.O();
        if (v4Var != null) {
            v4Var.t8(this.R);
        }
    }

    public final void j() {
        if (this.S != null) {
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            if (measuredWidth != 0 && measuredHeight != 0) {
                int max = Math.max(a0.i(100.0f), (int) a0.u(this.S.width));
                int max2 = Math.max(a0.i(100.0f), (int) a0.u(this.S.height));
                int i10 = measuredWidth - (max / 2);
                int i11 = measuredHeight - (max2 / 2);
                this.f18381a.K0(i10, i11, max + i10, max2 + i11);
            }
        }
    }

    public final void k(boolean z10) {
        i iVar = this.M;
        if (iVar != null) {
            this.R.setListener(iVar);
            qc.a h10 = this.M.h();
            int i10 = this.Q;
            if (i10 == 1) {
                ((o) this.R).setData((c) h10);
            } else if (i10 == 2) {
                ((u) this.R).setData((d) h10);
            } else if (i10 != 4) {
                ((q) this.R).setData(h10);
            } else {
                ((pc.a) this.R).setData(h10);
            }
            this.R.V0.g(!this.M.n(), !z10);
            return;
        }
        this.R.setListener(null);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            invalidate();
            f();
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        l.a(this, i10, f10, kVar);
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.f18381a.setAlpha(1.0f - this.P.g());
        this.f18381a.draw(canvas);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, size2 > size ? i10 : View.MeasureSpec.makeMeasureSpec(size2, Log.TAG_TDLIB_OPTIONS));
        j();
    }

    public void setChart(i iVar) {
        i iVar2 = this.M;
        if (iVar2 != iVar) {
            if (iVar2 != null) {
                iVar2.g(this);
            }
            this.M = iVar;
            if (iVar != null) {
                this.R.V0.f21839a = iVar.r();
                k(false);
                iVar.e(this);
            }
        }
    }
}
