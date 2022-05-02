package p291uc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import be.C1357a0;
import be.C1362c;
import be.C1399s0;
import be.C1410y;
import gd.C4587b;
import ie.C5428t;
import ie.RunnableC5390g;
import java.util.ArrayList;
import java.util.Iterator;
import me.View$OnClickListenerC6902i;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;
import p051db.C3953l;
import p051db.C3955n;
import p051db.C3965r;
import p080fb.C4343h;
import p082fd.C4403w;
import p108hb.C5064d;
import p139jb.AbstractC5911c;
import p156kd.AbstractC6264v;
import p156kd.C6238b;
import p156kd.C6246h;
import p156kd.C6257p;
import p350yd.C10930q6;
import p364zd.C11524j;

public class C9615n0 extends View$OnClickListenerC6902i implements AbstractC5911c, C6238b.AbstractC6239a {
    public C3955n<C9616a> f31156k0;
    public C3950k f31157l0;
    public TdApi.ChatJoinRequestsInfo f31158m0;
    public Runnable f31159n0;
    public final C6238b f31160o0;
    public final RectF f31161p0 = new RectF();
    public final C3965r<RunnableC5390g> f31163r0 = new C3965r<>(new C3965r.AbstractC3966a() {
        @Override
        public final void mo7848a(C3965r rVar) {
            C9615n0.this.m8020J0(rVar);
        }
    }, C2057b.f7280b, 180);
    public final Bitmap f31162q0 = C1362c.m37474o(C1362c.m37483f(R.drawable.baseline_close_18));

    public static class C9616a {
        public final long f31164a;
        public final C6246h f31165b;
        public final C4587b f31166c;
        public final Paint f31167d;

        public C9616a(C10930q6 q6Var, long j) {
            Paint paint = new Paint(1);
            this.f31167d = paint;
            this.f31164a = j;
            C6246h w2 = q6Var.m2480e2().m1579w2(j);
            this.f31165b = w2;
            if (w2 != null) {
                w2.mo20767t0(C1357a0.m37541i(12.0f) * 2);
            }
            this.f31166c = q6Var.m2480e2().m1713M2(j, false, 12.0f, null);
            paint.setColor(0);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        public void m8012c(Canvas canvas, C6238b bVar, float f, float f2, float f3) {
            int i;
            if (f3 != 0.0f) {
                C6257p k = this.f31165b != null ? bVar.m20992k(this.f31164a) : null;
                int i2 = C1357a0.m37541i(12.0f);
                int i3 = (f3 > 1.0f ? 1 : (f3 == 1.0f ? 0 : -1));
                boolean z = i3 != 0;
                if (z) {
                    float f4 = (f3 * 0.5f) + 0.5f;
                    i = C1399s0.m37199V(canvas);
                    canvas.scale(f4, f4, f, f2);
                } else {
                    i = -1;
                }
                float f5 = i2;
                canvas.drawCircle(f, f2, (C1357a0.m37541i(4.0f) * f3 * 0.5f) + f5, this.f31167d);
                if (k != null) {
                    if (i3 != 0) {
                        k.mo20250U(k.mo20252R0() * f3);
                    }
                    k.mo20256K0((int) (f - f5), (int) (f2 - f5), (int) (f + f5), (int) (f2 + f5));
                    if (k.mo20246c0()) {
                        k.mo20236m1(canvas, i2, C5064d.m24131a(f3, C11524j.m241G0()));
                    }
                    k.mo20259D0(i2);
                    k.draw(canvas);
                    if (i3 != 0) {
                        k.mo20253P();
                    }
                } else {
                    C4587b bVar2 = this.f31166c;
                    if (bVar2 != null) {
                        bVar2.m27214b(canvas, f, f2, f3);
                    }
                }
                if (z) {
                    C1399s0.m37201T(canvas, i);
                }
            }
        }

        public float m8011d(float f) {
            return f == 1.0f ? C1357a0.m37541i(12.0f) + C1357a0.m37541i(4.0f) : (C1357a0.m37541i(12.0f) + C1357a0.m37541i(4.0f)) * f;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C9616a) && ((C9616a) obj).f31164a == this.f31164a;
        }

        public int hashCode() {
            long j = this.f31164a;
            return (int) (j ^ (j >>> 32));
        }
    }

    public C9615n0(Context context, C10930q6 q6Var) {
        super(context, q6Var);
        C6238b bVar = new C6238b(this);
        this.f31160o0 = bVar;
        setWillNotDraw(false);
        bVar.m21001b();
    }

    public static void m8021F0(Canvas canvas, Bitmap bitmap, int i, int i2) {
        canvas.drawBitmap(bitmap, i - (bitmap.getWidth() / 2), i2 - (bitmap.getHeight() / 2), C1410y.m37068J());
    }

    public void m8020J0(C3965r rVar) {
        invalidate();
    }

    public void m8019M0(int i, float f, float f2, C3950k kVar) {
        C3955n<C9616a> nVar = this.f31156k0;
        if (nVar != null) {
            nVar.m29520i(f);
        }
        invalidate();
    }

    @Override
    public void mo7428C(View view, float f, float f2) {
        Runnable runnable;
        if (!this.f31161p0.contains(f, f2) || (runnable = this.f31159n0) == null) {
            super.mo7428C(view, f, f2);
        } else {
            runnable.run();
        }
    }

    public void m8018O0(TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo, boolean z) {
        long[] jArr = chatJoinRequestsInfo.userIds;
        this.f31158m0 = chatJoinRequestsInfo;
        this.f31163r0.m29462u(new RunnableC5390g.C5392b(C4403w.m27844o2(R.string.xJoinRequests, chatJoinRequestsInfo.totalCount), C1357a0.m37541i(300.0f), C1410y.m37083A0(16.0f), C5428t.AbstractC5441d.f17877H).m22888b().m22868v().m22884f(), z);
        m8016U0();
        m8017Q0(jArr, z);
        if (this.f31157l0 == null) {
            this.f31157l0 = new C3950k(0, new C3950k.AbstractC3952b() {
                @Override
                public final void mo45P5(int i, float f, float f2, C3950k kVar) {
                    C9615n0.this.m8019M0(i, f, f2, kVar);
                }

                @Override
                public void mo35Y0(int i, float f, C3950k kVar) {
                    C3953l.m29526a(this, i, f, kVar);
                }
            }, C2057b.f7280b, 280L);
        }
        this.f31157l0.m29541l(0.0f);
        this.f31157l0.m29544i(1.0f);
    }

    public final void m8017Q0(long[] jArr, boolean z) {
        if (jArr == null || jArr.length <= 0) {
            C3955n<C9616a> nVar = this.f31156k0;
            if (nVar != null) {
                nVar.m29519m(z);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            C9616a aVar = new C9616a(this.f21820b, j);
            arrayList.add(aVar);
            if (aVar.f31165b != null) {
                this.f31160o0.m20992k(j).m20819G(aVar.f31165b);
            }
        }
        if (this.f31156k0 == null) {
            this.f31156k0 = new C3955n<>(new C4343h(this));
        }
        this.f31156k0.m29524B(arrayList, z);
    }

    public final void m8016U0() {
        if (!this.f31163r0.isEmpty() && getMeasuredWidth() > 0) {
            Iterator<C3955n.C3958c<RunnableC5390g>> it = this.f31163r0.iterator();
            while (it.hasNext()) {
                it.next().f13320a.m22910q((getMeasuredWidth() - C1357a0.m37541i(48.0f)) - C1357a0.m37541i(48.0f));
            }
        }
    }

    @Override
    public void mo4501a3() {
        this.f31160o0.mo4501a3();
    }

    public TdApi.ChatJoinRequestsInfo getInfo() {
        return this.f31158m0;
    }

    @Override
    public boolean mo8015h(int i, AbstractC6264v vVar, long j) {
        C3955n<C9616a> nVar = this.f31156k0;
        if (nVar == null) {
            return false;
        }
        Iterator<C3955n.C3958c<C9616a>> it = nVar.iterator();
        while (it.hasNext()) {
            if (it.next().f13320a.f31164a == j) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean mo7418n0(View view, float f, float f2) {
        return this.f31161p0.contains(f, f2) || super.mo7418n0(view, f, f2);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = C1357a0.m37541i(12.0f) + C1357a0.m37541i(24.0f);
        if (this.f31156k0 != null) {
            int measuredHeight = getMeasuredHeight() / 2;
            int i2 = C1357a0.m37541i(12.0f) + C1357a0.m37541i(12.0f);
            int i3 = (C1357a0.m37541i(12.0f) * 2) - C1357a0.m37541i(4.0f);
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            for (int size = this.f31156k0.size() - 1; size >= 0; size--) {
                C3955n.C3958c<C9616a> s = this.f31156k0.m29517s(size);
                s.f13320a.m8012c(canvas, this.f31160o0, i2 + (s.m29494p() * i3), measuredHeight, s.m29491s());
                i = (int) (i + s.f13320a.m8011d(s.m29491s()));
            }
            canvas.restore();
        }
        m8021F0(canvas, this.f31162q0, getMeasuredWidth() - C1357a0.m37541i(20.0f), getMeasuredHeight() / 2);
        Iterator<C3955n.C3958c<RunnableC5390g>> it = this.f31163r0.iterator();
        while (it.hasNext()) {
            C3955n.C3958c<RunnableC5390g> next = it.next();
            next.f13320a.m22899v(canvas, i, getMeasuredWidth(), 0, (getMeasuredHeight() / 2) - C1357a0.m37541i(9.0f), null, next.m29491s());
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m8016U0();
        this.f31161p0.set(getMeasuredWidth() - C1357a0.m37541i(48.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setOnDismissRunnable(Runnable runnable) {
        this.f31159n0 = runnable;
    }
}
