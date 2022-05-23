package ne;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import ce.a0;
import ce.y;
import hd.b;
import hd.t2;
import kb.c;
import ld.h;
import ld.p;
import org.drinkless.td.libcore.telegram.TdApi;
import wc.a;
import zd.o6;

public class t3 extends View implements c {
    public int N;
    public final Paint f18386a;
    public final p[] f18387b = new p[3];
    public final Rect f18388c = new Rect();
    public final b[] M = new b[3];

    public t3(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f18386a = paint;
        int i10 = 0;
        setWillNotDraw(false);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        while (true) {
            p[] pVarArr = this.f18387b;
            if (i10 < pVarArr.length) {
                pVarArr[i10] = a();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public void Q2() {
        for (p pVar : this.f18387b) {
            pVar.b();
        }
    }

    public final p a() {
        p pVar = new p(this, 1);
        pVar.E0(0);
        pVar.e();
        return pVar;
    }

    public final void b(Canvas canvas, p pVar) {
        canvas.drawCircle(pVar.J0(), pVar.x0(), pVar.t() + a0.i(2.0f), this.f18386a);
        canvas.drawCircle(pVar.J0(), pVar.x0(), pVar.t(), y.g(j.E0()));
    }

    public final void c(Canvas canvas, int i10, p pVar) {
        if (i10 != 0 || this.N != 2) {
            if ((i10 == 2 || this.N != 1) && this.N != 3) {
                b(canvas, pVar);
                b[] bVarArr = this.M;
                if (bVarArr[i10] != null) {
                    bVarArr[i10].a(canvas, pVar.J0(), pVar.x0());
                }
                pVar.draw(canvas);
            }
        }
    }

    public final void d(long[] jArr, int i10, o6 o6Var, p pVar) {
        if (jArr.length > i10) {
            TdApi.User e42 = o6Var.e4(jArr[i10]);
            if (e42 == null || t2.u3(e42.profilePhoto)) {
                this.M[i10] = new b(12.0f, new b.a(t2.I0(e42, o6Var.fa()), t2.E1(e42)), null);
                pVar.G(null);
                return;
            }
            this.M[i10] = null;
            h hVar = new h(o6Var, e42.profilePhoto.small);
            hVar.t0(a.getDefaultAvatarCacheSize());
            pVar.G(hVar);
            return;
        }
        this.M[i10] = null;
        pVar.G(null);
    }

    public final void e(p pVar, int i10, int i11, int i12, int i13) {
        pVar.K0(i10, i12, i11, i13);
        pVar.E0(Math.min(pVar.getWidth(), pVar.getHeight()) / 2);
    }

    public void f(o6 o6Var, TdApi.Users users) {
        long[] jArr = users.userIds;
        int i10 = 0;
        while (true) {
            p[] pVarArr = this.f18387b;
            if (i10 < pVarArr.length) {
                d(jArr, i10, o6Var, pVarArr[i10]);
                i10++;
            } else {
                g(jArr);
                return;
            }
        }
    }

    public final void g(long[] jArr) {
        if (jArr.length == 1) {
            b[] bVarArr = this.M;
            bVarArr[2] = bVarArr[0];
            p[] pVarArr = this.f18387b;
            pVarArr[2].G(pVarArr[0].r());
            this.N = 1;
        } else if (jArr.length == 2) {
            b[] bVarArr2 = this.M;
            bVarArr2[2] = bVarArr2[1];
            bVarArr2[1] = bVarArr2[0];
            p[] pVarArr2 = this.f18387b;
            pVarArr2[2].G(pVarArr2[1].r());
            p[] pVarArr3 = this.f18387b;
            pVarArr3[1].G(pVarArr3[0].r());
            this.N = 2;
        } else if (jArr.length == 0) {
            this.N = 3;
        } else {
            this.N = 0;
        }
        invalidate();
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        for (int length = this.f18387b.length - 1; length >= 0; length--) {
            c(canvas, length, this.f18387b[length]);
        }
        canvas.restore();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        float i12 = a0.i(24.0f);
        float f10 = i12 / 2.0f;
        float f11 = i12 / 4.0f;
        this.f18388c.set(paddingLeft, paddingTop, measuredWidth, measuredHeight);
        int centerY = (int) (this.f18388c.centerY() - f10);
        int centerY2 = (int) (this.f18388c.centerY() + f10);
        float f12 = 3.0f * f10;
        e(this.f18387b[0], (int) ((this.f18388c.centerX() - f12) + f11), (int) ((this.f18388c.centerX() - f10) + f11), centerY, centerY2);
        e(this.f18387b[1], (int) (this.f18388c.centerX() - f10), (int) (this.f18388c.centerX() + f10), centerY, centerY2);
        e(this.f18387b[2], (int) ((this.f18388c.centerX() + f10) - f11), (int) ((this.f18388c.centerX() + f12) - f11), centerY, centerY2);
    }
}
