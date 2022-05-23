package td;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import ce.a0;
import ce.y;
import eb.k;
import org.thunderdog.challegram.R;

public class c extends View implements k.b {
    public e M;
    public td.a N;
    public float P;
    public k Q;
    public float R;
    public int S;
    public int T;
    public float U;
    public int V;
    public float W;
    public float f23408a;
    public AbstractC0219c f23409a0;
    public int f23410b;
    public float f23411b0;
    public int f23412c;
    public a f23413c0;
    public b f23414d0;
    public float O = 1.0f;
    public float[] f23415e0 = new float[3];

    public interface a {
        void O5(c cVar);
    }

    public interface b {
        void a(c cVar, int i10);
    }

    public interface AbstractC0219c {
        void a();
    }

    public c(Context context) {
        super(context);
        setBackgroundResource(R.drawable.knob_shadow);
    }

    private void setColorImpl(int i10) {
        if (this.f23410b != i10) {
            this.f23410b = i10;
            c();
        }
    }

    private void setForceRadiusFactor(float f10) {
        if (this.P != f10) {
            this.P = f10;
            invalidate();
        }
    }

    private void setStrokeColor(int i10) {
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        int min = Math.min(red, Math.min(green, blue));
        int max = Math.max(red, Math.max(green, blue));
        if (((red + green) + blue) / 3 < 224.0f || (max - min) / 255.0f >= 0.1f) {
            this.f23412c = 0;
            return;
        }
        float f10 = red;
        float f11 = green;
        float f12 = blue;
        float max2 = Math.max(224.0f / f10, Math.max(224.0f / f11, 224.0f / f12));
        this.f23412c = Color.argb(255, (int) (f10 * max2), (int) (f11 * max2), (int) (f12 * max2));
    }

    public float a(float f10) {
        return ((this.f23408a * 16.0f) + 4.0f) * f10;
    }

    public void b(float[] fArr) {
        fArr[0] = this.f23411b0;
        float[] fArr2 = this.f23415e0;
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
    }

    public final void c() {
        a aVar = this.f23413c0;
        if (aVar != null) {
            aVar.O5(this);
        }
    }

    public void d(boolean z10) {
        if (z10) {
            setScaleFactor(0.0f);
            setRadiusFactor(0.25f);
            f(-52480, -1.0f);
            return;
        }
        setScaleFactor(0.0f);
        setRadiusFactor(1.0f);
        f(-52480, -1.0f);
    }

    public void e(float f10, float f11, float f12) {
        if (this.f23411b0 == f10) {
            float[] fArr = this.f23415e0;
            if (fArr[1] == f11 && fArr[2] == f12) {
                return;
            }
        }
        this.f23411b0 = f10;
        float[] fArr2 = this.f23415e0;
        fArr2[0] = f10 == 1.0f ? 0.0f : 360.0f * f10;
        fArr2[1] = f11;
        fArr2[2] = f12;
        setColorImpl(Color.HSVToColor(fArr2));
        setStrokeColor(this.f23410b);
        i();
        j();
        td.a aVar = this.N;
        if (aVar != null) {
            aVar.a(f10, this.f23415e0);
        }
        invalidate();
        b bVar = this.f23414d0;
        if (bVar != null) {
            bVar.a(this, this.f23410b);
        }
    }

    public void f(int i10, float f10) {
        b bVar;
        boolean z10 = true;
        if (this.f23410b != i10) {
            setColorImpl(i10);
            Color.colorToHSV(i10, this.f23415e0);
            setStrokeColor(i10);
            if (f10 == -1.0f) {
                f10 = this.f23415e0[0] / 360.0f;
            }
            if (this.f23411b0 != f10) {
                this.f23411b0 = f10;
                i();
            }
            if (this.U > 0.0f) {
                j();
            }
            td.a aVar = this.N;
            if (aVar != null) {
                aVar.a(f10, this.f23415e0);
            }
            invalidate();
        } else if (this.f23411b0 == f10 || f10 < 0.0f || f10 > 1.0f) {
            z10 = false;
        } else {
            this.f23411b0 = f10;
            i();
        }
        if (z10 && (bVar = this.f23414d0) != null) {
            bVar.a(this, i10);
        }
    }

    public void g(float f10, boolean z10) {
        if (z10) {
            k kVar = this.Q;
            if (kVar == null) {
                float f11 = this.P;
                if (f11 != f10) {
                    k kVar2 = new k(0, this, db.b.f7287b, 120L, f11);
                    this.Q = kVar2;
                    kVar2.i(f10);
                } else {
                    return;
                }
            } else if (kVar.v() && this.R == f10) {
                return;
            }
            this.Q.i(f10);
        } else {
            k kVar3 = this.Q;
            if (kVar3 != null) {
                kVar3.l(f10);
            }
            setForceRadiusFactor(f10);
        }
        this.R = f10;
    }

    public int getBrushColor() {
        return this.f23410b;
    }

    public float[] getHsv() {
        return this.f23415e0;
    }

    public float getHue() {
        return this.f23411b0;
    }

    public int getRadius() {
        float f10 = (this.f23408a * 16.0f) + 4.0f;
        return a0.i(f10 + ((20.0f - f10) * this.P));
    }

    public void h(int i10, int i11) {
        if (this.S != i10) {
            this.S = i10;
            i();
        }
        if (this.T != i11) {
            this.T = i11;
            j();
        }
    }

    public final void i() {
        float f10 = this.V * this.f23411b0;
        if (this.U != 0.0f) {
            int measuredWidth = getMeasuredWidth() / 2;
            f10 += (((Math.max(a0.i(8.0f) + measuredWidth, Math.min((this.S - measuredWidth) - a0.i(8.0f), this.S * this.f23415e0[1])) - getLeft()) - measuredWidth) - f10) * this.U;
        }
        setTranslationX(f10);
        AbstractC0219c cVar = this.f23409a0;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void j() {
        float f10 = this.W;
        if (this.U != 0.0f) {
            float f11 = this.f23415e0[2];
            int i10 = this.T;
            f10 += (((((((-i10) * f11) + i10) - (getTop() - this.M.getTop())) - (getMeasuredHeight() / 2)) - a0.i(64.0f)) - f10) * this.U;
        }
        setTranslationY(f10);
        AbstractC0219c cVar = this.f23409a0;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            setForceRadiusFactor(f10);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth;
        int radius = getRadius();
        float measuredWidth2 = getMeasuredWidth() / 2;
        float measuredHeight = getMeasuredHeight() / 2;
        canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth - a0.i(2.0f), y.g(-1));
        canvas.drawCircle(measuredWidth2, measuredHeight, radius, y.g(this.f23410b));
        int i10 = this.f23412c;
        if (i10 != 0 && i10 != this.f23410b) {
            canvas.drawCircle(measuredWidth2, measuredHeight, radius - a0.i(0.5f), y.D0(this.f23412c));
        }
    }

    public void setBaseY(float f10) {
        if (this.W != f10) {
            this.W = f10;
            j();
        }
    }

    public void setBrushChangeListener(a aVar) {
        this.f23413c0 = aVar;
    }

    public void setColorChangeListener(b bVar) {
        this.f23414d0 = bVar;
    }

    public void setDirection(td.a aVar) {
        this.N = aVar;
    }

    public void setHue(float f10) {
        float[] fArr = this.f23415e0;
        e(f10, fArr[1], fArr[2]);
    }

    public void setInToneFactor(float f10) {
        if (this.U != f10) {
            this.U = f10;
            i();
            j();
        }
    }

    public void setPositionChangeListener(AbstractC0219c cVar) {
        this.f23409a0 = cVar;
    }

    public void setRadiusFactor(float f10) {
        if (this.f23408a != f10) {
            this.f23408a = f10;
            c();
            invalidate();
        }
        g(0.0f, true);
    }

    public void setScaleFactor(float f10) {
        if (this.O != f10) {
            this.O = f10;
            float f11 = 1.0f;
            if (f10 != 1.0f) {
                float i10 = a0.i(24.0f) / a0.i(44.0f);
                f11 = ((1.0f - i10) * f10) + i10;
            }
            setScaleX(f11);
            setScaleY(f11);
        }
    }

    public void setTargetWidth(int i10) {
        if (this.V != i10) {
            this.V = i10;
            i();
        }
    }

    public void setTone(e eVar) {
        this.M = eVar;
    }
}
