package sd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import be.C1357a0;
import be.C1410y;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p051db.C3950k;

public class C8867c extends View implements C3950k.AbstractC3952b {
    public C8872e f28657M;
    public C8863a f28658N;
    public float f28660P;
    public C3950k f28661Q;
    public float f28662R;
    public int f28663S;
    public int f28664T;
    public float f28665U;
    public int f28666V;
    public float f28667W;
    public float f28668a;
    public AbstractC8870c f28669a0;
    public int f28670b;
    public float f28671b0;
    public int f28672c;
    public AbstractC8868a f28673c0;
    public AbstractC8869b f28674d0;
    public float f28659O = 1.0f;
    public float[] f28675e0 = new float[3];

    public interface AbstractC8868a {
        void mo11056k7(C8867c cVar);
    }

    public interface AbstractC8869b {
        void mo11055a(C8867c cVar, int i);
    }

    public interface AbstractC8870c {
        void mo11054a();
    }

    public C8867c(Context context) {
        super(context);
        setBackgroundResource(R.drawable.knob_shadow);
    }

    private void setColorImpl(int i) {
        if (this.f28670b != i) {
            this.f28670b = i;
            m11064c();
        }
    }

    private void setForceRadiusFactor(float f) {
        if (this.f28660P != f) {
            this.f28660P = f;
            invalidate();
        }
    }

    private void setStrokeColor(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int min = Math.min(red, Math.min(green, blue));
        int max = Math.max(red, Math.max(green, blue));
        if (((red + green) + blue) / 3 < 224.0f || (max - min) / 255.0f >= 0.1f) {
            this.f28672c = 0;
            return;
        }
        float f = red;
        float f2 = green;
        float f3 = blue;
        float max2 = Math.max(224.0f / f, Math.max(224.0f / f2, 224.0f / f3));
        this.f28672c = Color.argb(255, (int) (f * max2), (int) (f2 * max2), (int) (f3 * max2));
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            setForceRadiusFactor(f);
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public float m11066a(float f) {
        return ((this.f28668a * 16.0f) + 4.0f) * f;
    }

    public void m11065b(float[] fArr) {
        fArr[0] = this.f28671b0;
        float[] fArr2 = this.f28675e0;
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
    }

    public final void m11064c() {
        AbstractC8868a aVar = this.f28673c0;
        if (aVar != null) {
            aVar.mo11056k7(this);
        }
    }

    public void m11063d(boolean z) {
        if (z) {
            setScaleFactor(0.0f);
            setRadiusFactor(0.25f);
            m11061f(-52480, -1.0f);
            return;
        }
        setScaleFactor(0.0f);
        setRadiusFactor(1.0f);
        m11061f(-52480, -1.0f);
    }

    public void m11062e(float f, float f2, float f3) {
        if (this.f28671b0 == f) {
            float[] fArr = this.f28675e0;
            if (fArr[1] == f2 && fArr[2] == f3) {
                return;
            }
        }
        this.f28671b0 = f;
        float[] fArr2 = this.f28675e0;
        fArr2[0] = f == 1.0f ? 0.0f : 360.0f * f;
        fArr2[1] = f2;
        fArr2[2] = f3;
        setColorImpl(Color.HSVToColor(fArr2));
        setStrokeColor(this.f28670b);
        m11058i();
        m11057j();
        C8863a aVar = this.f28658N;
        if (aVar != null) {
            aVar.m11081a(f, this.f28675e0);
        }
        invalidate();
        AbstractC8869b bVar = this.f28674d0;
        if (bVar != null) {
            bVar.mo11055a(this, this.f28670b);
        }
    }

    public void m11061f(int i, float f) {
        AbstractC8869b bVar;
        boolean z = true;
        if (this.f28670b != i) {
            setColorImpl(i);
            Color.colorToHSV(i, this.f28675e0);
            setStrokeColor(i);
            if (f == -1.0f) {
                f = this.f28675e0[0] / 360.0f;
            }
            if (this.f28671b0 != f) {
                this.f28671b0 = f;
                m11058i();
            }
            if (this.f28665U > 0.0f) {
                m11057j();
            }
            C8863a aVar = this.f28658N;
            if (aVar != null) {
                aVar.m11081a(f, this.f28675e0);
            }
            invalidate();
        } else if (this.f28671b0 == f || f < 0.0f || f > 1.0f) {
            z = false;
        } else {
            this.f28671b0 = f;
            m11058i();
        }
        if (z && (bVar = this.f28674d0) != null) {
            bVar.mo11055a(this, i);
        }
    }

    public void m11060g(float f, boolean z) {
        if (z) {
            C3950k kVar = this.f28661Q;
            if (kVar == null) {
                float f2 = this.f28660P;
                if (f2 != f) {
                    C3950k kVar2 = new C3950k(0, this, C2057b.f7280b, 120L, f2);
                    this.f28661Q = kVar2;
                    kVar2.m29546i(f);
                } else {
                    return;
                }
            } else if (kVar.m29533v() && this.f28662R == f) {
                return;
            }
            this.f28661Q.m29546i(f);
        } else {
            C3950k kVar3 = this.f28661Q;
            if (kVar3 != null) {
                kVar3.m29543l(f);
            }
            setForceRadiusFactor(f);
        }
        this.f28662R = f;
    }

    public int getBrushColor() {
        return this.f28670b;
    }

    public float[] getHsv() {
        return this.f28675e0;
    }

    public float getHue() {
        return this.f28671b0;
    }

    public int getRadius() {
        float f = (this.f28668a * 16.0f) + 4.0f;
        return C1357a0.m37544i(f + ((20.0f - f) * this.f28660P));
    }

    public void m11059h(int i, int i2) {
        if (this.f28663S != i) {
            this.f28663S = i;
            m11058i();
        }
        if (this.f28664T != i2) {
            this.f28664T = i2;
            m11057j();
        }
    }

    public final void m11058i() {
        float f = this.f28666V * this.f28671b0;
        if (this.f28665U != 0.0f) {
            int measuredWidth = getMeasuredWidth() / 2;
            f += (((Math.max(C1357a0.m37544i(8.0f) + measuredWidth, Math.min((this.f28663S - measuredWidth) - C1357a0.m37544i(8.0f), this.f28663S * this.f28675e0[1])) - getLeft()) - measuredWidth) - f) * this.f28665U;
        }
        setTranslationX(f);
        AbstractC8870c cVar = this.f28669a0;
        if (cVar != null) {
            cVar.mo11054a();
        }
    }

    public final void m11057j() {
        float f = this.f28667W;
        if (this.f28665U != 0.0f) {
            float f2 = this.f28675e0[2];
            int i = this.f28664T;
            f += (((((((-i) * f2) + i) - (getTop() - this.f28657M.getTop())) - (getMeasuredHeight() / 2)) - C1357a0.m37544i(64.0f)) - f) * this.f28665U;
        }
        setTranslationY(f);
        AbstractC8870c cVar = this.f28669a0;
        if (cVar != null) {
            cVar.mo11054a();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth;
        int radius = getRadius();
        float measuredWidth2 = getMeasuredWidth() / 2;
        float measuredHeight = getMeasuredHeight() / 2;
        canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth - C1357a0.m37544i(2.0f), C1410y.m37042g(-1));
        canvas.drawCircle(measuredWidth2, measuredHeight, radius, C1410y.m37042g(this.f28670b));
        int i = this.f28672c;
        if (i != 0 && i != this.f28670b) {
            canvas.drawCircle(measuredWidth2, measuredHeight, radius - C1357a0.m37544i(0.5f), C1410y.m37078E0(this.f28672c));
        }
    }

    public void setBaseY(float f) {
        if (this.f28667W != f) {
            this.f28667W = f;
            m11057j();
        }
    }

    public void setBrushChangeListener(AbstractC8868a aVar) {
        this.f28673c0 = aVar;
    }

    public void setColorChangeListener(AbstractC8869b bVar) {
        this.f28674d0 = bVar;
    }

    public void setDirection(C8863a aVar) {
        this.f28658N = aVar;
    }

    public void setHue(float f) {
        float[] fArr = this.f28675e0;
        m11062e(f, fArr[1], fArr[2]);
    }

    public void setInToneFactor(float f) {
        if (this.f28665U != f) {
            this.f28665U = f;
            m11058i();
            m11057j();
        }
    }

    public void setPositionChangeListener(AbstractC8870c cVar) {
        this.f28669a0 = cVar;
    }

    public void setRadiusFactor(float f) {
        if (this.f28668a != f) {
            this.f28668a = f;
            m11064c();
            invalidate();
        }
        m11060g(0.0f, true);
    }

    public void setScaleFactor(float f) {
        if (this.f28659O != f) {
            this.f28659O = f;
            float f2 = 1.0f;
            if (f != 1.0f) {
                float i = C1357a0.m37544i(24.0f) / C1357a0.m37544i(44.0f);
                f2 = ((1.0f - i) * f) + i;
            }
            setScaleX(f2);
            setScaleY(f2);
        }
    }

    public void setTargetWidth(int i) {
        if (this.f28666V != i) {
            this.f28666V = i;
            m11058i();
        }
    }

    public void setTone(C8872e eVar) {
        this.f28657M = eVar;
    }
}
