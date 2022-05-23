package vc;

import ae.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import ce.a0;
import ce.p0;
import ce.y;
import eb.k;
import eb.l;
import eb.n;
import eb.r;
import gd.w;
import ib.d;
import java.util.ArrayList;
import java.util.Iterator;
import je.g;
import je.t;
import kb.c;
import ld.b;
import ld.h;
import ld.p;
import ld.v;
import ne.i;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import zd.o6;

public class m0 extends i implements c, b.a {
    public n<a> f25102k0;
    public k f25103l0;
    public TdApi.ChatJoinRequestsInfo f25104m0;
    public Runnable f25105n0;
    public final b f25106o0;
    public final RectF f25107p0 = new RectF();
    public final r<g> f25109r0 = new r<>(new r.a() {
        @Override
        public final void a(r rVar) {
            m0.this.L0(rVar);
        }
    }, db.b.f7287b, 180);
    public final Bitmap f25108q0 = ce.c.o(ce.c.f(R.drawable.baseline_close_18));

    public static class a {
        public final long f25110a;
        public final h f25111b;
        public final hd.b f25112c;
        public final Paint f25113d;

        public a(o6 o6Var, long j10) {
            Paint paint = new Paint(1);
            this.f25113d = paint;
            this.f25110a = j10;
            h v22 = o6Var.e2().v2(j10);
            this.f25111b = v22;
            if (v22 != null) {
                v22.t0(a0.i(12.0f) * 2);
            }
            this.f25112c = o6Var.e2().L2(j10, false, 12.0f, null);
            paint.setColor(0);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        public void c(Canvas canvas, b bVar, float f10, float f11, float f12) {
            int i10;
            if (f12 != 0.0f) {
                p k10 = this.f25111b != null ? bVar.k(this.f25110a) : null;
                int i11 = a0.i(12.0f);
                int i12 = (f12 > 1.0f ? 1 : (f12 == 1.0f ? 0 : -1));
                boolean z10 = i12 != 0;
                if (z10) {
                    float f13 = (f12 * 0.5f) + 0.5f;
                    i10 = p0.O(canvas);
                    canvas.scale(f13, f13, f10, f11);
                } else {
                    i10 = -1;
                }
                float f14 = i11;
                canvas.drawCircle(f10, f11, (a0.i(4.0f) * f12 * 0.5f) + f14, this.f25113d);
                if (k10 != null) {
                    if (i12 != 0) {
                        k10.V(k10.R0() * f12);
                    }
                    k10.K0((int) (f10 - f14), (int) (f11 - f14), (int) (f10 + f14), (int) (f11 + f14));
                    if (k10.e0()) {
                        k10.j1(canvas, i11, d.a(f12, j.E0()));
                    }
                    k10.E0(i11);
                    k10.draw(canvas);
                    if (i12 != 0) {
                        k10.Q();
                    }
                } else {
                    hd.b bVar2 = this.f25112c;
                    if (bVar2 != null) {
                        bVar2.b(canvas, f10, f11, f12);
                    }
                }
                if (z10) {
                    p0.N(canvas, i10);
                }
            }
        }

        public float d(float f10) {
            return f10 == 1.0f ? a0.i(12.0f) + a0.i(4.0f) : (a0.i(12.0f) + a0.i(4.0f)) * f10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && ((a) obj).f25110a == this.f25110a;
        }

        public int hashCode() {
            long j10 = this.f25110a;
            return (int) (j10 ^ (j10 >>> 32));
        }
    }

    public m0(Context context, o6 o6Var) {
        super(context, o6Var);
        b bVar = new b(this);
        this.f25106o0 = bVar;
        setWillNotDraw(false);
        bVar.b();
    }

    public static void G0(Canvas canvas, Bitmap bitmap, int i10, int i11) {
        canvas.drawBitmap(bitmap, i10 - (bitmap.getWidth() / 2), i11 - (bitmap.getHeight() / 2), y.J());
    }

    public void L0(r rVar) {
        invalidate();
    }

    public void P0(int i10, float f10, float f11, k kVar) {
        n<a> nVar = this.f25102k0;
        if (nVar != null) {
            nVar.g(f10);
        }
        invalidate();
    }

    @Override
    public void C(View view, float f10, float f11) {
        Runnable runnable;
        if (!this.f25107p0.contains(f10, f11) || (runnable = this.f25105n0) == null) {
            super.C(view, f10, f11);
        } else {
            runnable.run();
        }
    }

    public void Q0(TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo, boolean z10) {
        long[] jArr = chatJoinRequestsInfo.userIds;
        this.f25104m0 = chatJoinRequestsInfo;
        this.f25109r0.u(new g.b(w.o2(R.string.xJoinRequests, chatJoinRequestsInfo.totalCount), a0.i(300.0f), y.A0(16.0f), t.d.H).b().v().f(), z10);
        Y0();
        V0(jArr, z10);
        if (this.f25103l0 == null) {
            this.f25103l0 = new k(0, new k.b() {
                @Override
                public final void n4(int i10, float f10, float f11, k kVar) {
                    m0.this.P0(i10, f10, f11, kVar);
                }

                @Override
                public void o4(int i10, float f10, k kVar) {
                    l.a(this, i10, f10, kVar);
                }
            }, db.b.f7287b, 280L);
        }
        this.f25103l0.l(0.0f);
        this.f25103l0.i(1.0f);
    }

    @Override
    public void Q2() {
        this.f25106o0.Q2();
    }

    public final void V0(long[] jArr, boolean z10) {
        if (jArr == null || jArr.length <= 0) {
            n<a> nVar = this.f25102k0;
            if (nVar != null) {
                nVar.m(z10);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            a aVar = new a(this.f18085b, j10);
            arrayList.add(aVar);
            if (aVar.f25111b != null) {
                this.f25106o0.k(j10).G(aVar.f25111b);
            }
        }
        if (this.f25102k0 == null) {
            this.f25102k0 = new n<>(new gb.h(this));
        }
        this.f25102k0.B(arrayList, z10);
    }

    public final void Y0() {
        if (!this.f25109r0.isEmpty() && getMeasuredWidth() > 0) {
            Iterator<n.c<g>> it = this.f25109r0.iterator();
            while (it.hasNext()) {
                it.next().f11479a.q((getMeasuredWidth() - a0.i(48.0f)) - a0.i(48.0f));
            }
        }
    }

    public TdApi.ChatJoinRequestsInfo getInfo() {
        return this.f25104m0;
    }

    @Override
    public boolean j(int i10, v vVar, long j10) {
        n<a> nVar = this.f25102k0;
        if (nVar == null) {
            return false;
        }
        Iterator<n.c<a>> it = nVar.iterator();
        while (it.hasNext()) {
            if (it.next().f11479a.f25110a == j10) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean m0(View view, float f10, float f11) {
        return this.f25107p0.contains(f10, f11) || super.m0(view, f10, f11);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i10 = a0.i(12.0f) + a0.i(24.0f);
        if (this.f25102k0 != null) {
            int measuredHeight = getMeasuredHeight() / 2;
            int i11 = a0.i(12.0f) + a0.i(12.0f);
            int i12 = (a0.i(12.0f) * 2) - a0.i(4.0f);
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            for (int size = this.f25102k0.size() - 1; size >= 0; size--) {
                n.c<a> s10 = this.f25102k0.s(size);
                s10.f11479a.c(canvas, this.f25106o0, i11 + (s10.p() * i12), measuredHeight, s10.s());
                i10 = (int) (i10 + s10.f11479a.d(s10.s()));
            }
            canvas.restore();
        }
        G0(canvas, this.f25108q0, getMeasuredWidth() - a0.i(20.0f), getMeasuredHeight() / 2);
        Iterator<n.c<g>> it = this.f25109r0.iterator();
        while (it.hasNext()) {
            n.c<g> next = it.next();
            next.f11479a.v(canvas, i10, getMeasuredWidth(), 0, (getMeasuredHeight() / 2) - a0.i(9.0f), null, next.s());
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Y0();
        this.f25107p0.set(getMeasuredWidth() - a0.i(48.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setOnDismissRunnable(Runnable runnable) {
        this.f25105n0 = runnable;
    }
}
