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
    public C8872e f28654M;
    public C8863a f28655N;
    public float f28657P;
    public C3950k f28658Q;
    public float f28659R;
    public int f28660S;
    public int f28661T;
    public float f28662U;
    public int f28663V;
    public float f28664W;
    public float f28665a;
    public AbstractC8870c f28666a0;
    public int f28667b;
    public float f28668b0;
    public int f28669c;
    public AbstractC8868a f28670c0;
    public AbstractC8869b f28671d0;
    public float f28656O = 1.0f;
    public float[] f28672e0 = new float[3];

    public interface AbstractC8868a {
        void mo11057k7(C8867c cVar);
    }

    public interface AbstractC8869b {
        void mo11056a(C8867c cVar, int i);
    }

    public interface AbstractC8870c {
        void mo11055a();
    }

    public C8867c(Context context) {
        super(context);
        setBackgroundResource(R.drawable.knob_shadow);
    }

    private void setColorImpl(int i) {
        if (this.f28667b != i) {
            this.f28667b = i;
            m11065c();
        }
    }

    private void setForceRadiusFactor(float f) {
        if (this.f28657P != f) {
            this.f28657P = f;
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
            this.f28669c = 0;
            return;
        }
        float f = red;
        float f2 = green;
        float f3 = blue;
        float max2 = Math.max(224.0f / f, Math.max(224.0f / f2, 224.0f / f3));
        this.f28669c = Color.argb(255, (int) (f * max2), (int) (f2 * max2), (int) (f3 * max2));
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

    public float m11067a(float f) {
        return ((this.f28665a * 16.0f) + 4.0f) * f;
    }

    public void m11066b(float[] fArr) {
        fArr[0] = this.f28668b0;
        float[] fArr2 = this.f28672e0;
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
    }

    public final void m11065c() {
        AbstractC8868a aVar = this.f28670c0;
        if (aVar != null) {
            aVar.mo11057k7(this);
        }
    }

    public void m11064d(boolean z) {
        if (z) {
            setScaleFactor(0.0f);
            setRadiusFactor(0.25f);
            m11062f(-52480, -1.0f);
            return;
        }
        setScaleFactor(0.0f);
        setRadiusFactor(1.0f);
        m11062f(-52480, -1.0f);
    }

    public void m11063e(float f, float f2, float f3) {
        if (this.f28668b0 == f) {
            float[] fArr = this.f28672e0;
            if (fArr[1] == f2 && fArr[2] == f3) {
                return;
            }
        }
        this.f28668b0 = f;
        float[] fArr2 = this.f28672e0;
        fArr2[0] = f == 1.0f ? 0.0f : 360.0f * f;
        fArr2[1] = f2;
        fArr2[2] = f3;
        setColorImpl(Color.HSVToColor(fArr2));
        setStrokeColor(this.f28667b);
        m11059i();
        m11058j();
        C8863a aVar = this.f28655N;
        if (aVar != null) {
            aVar.m11082a(f, this.f28672e0);
        }
        invalidate();
        AbstractC8869b bVar = this.f28671d0;
        if (bVar != null) {
            bVar.mo11056a(this, this.f28667b);
        }
    }

    public void m11062f(int i, float f) {
        AbstractC8869b bVar;
        boolean z = true;
        if (this.f28667b != i) {
            setColorImpl(i);
            Color.colorToHSV(i, this.f28672e0);
            setStrokeColor(i);
            if (f == -1.0f) {
                f = this.f28672e0[0] / 360.0f;
            }
            if (this.f28668b0 != f) {
                this.f28668b0 = f;
                m11059i();
            }
            if (this.f28662U > 0.0f) {
                m11058j();
            }
            C8863a aVar = this.f28655N;
            if (aVar != null) {
                aVar.m11082a(f, this.f28672e0);
            }
            invalidate();
        } else if (this.f28668b0 == f || f < 0.0f || f > 1.0f) {
            z = false;
        } else {
            this.f28668b0 = f;
            m11059i();
        }
        if (z && (bVar = this.f28671d0) != null) {
            bVar.mo11056a(this, i);
        }
    }

    public void m11061g(float f, boolean z) {
        if (z) {
            C3950k kVar = this.f28658Q;
            if (kVar == null) {
                float f2 = this.f28657P;
                if (f2 != f) {
                    C3950k kVar2 = new C3950k(0, this, C2057b.f7280b, 120L, f2);
                    this.f28658Q = kVar2;
                    kVar2.m29544i(f);
                } else {
                    return;
                }
            } else if (kVar.m29531v() && this.f28659R == f) {
                return;
            }
            this.f28658Q.m29544i(f);
        } else {
            C3950k kVar3 = this.f28658Q;
            if (kVar3 != null) {
                kVar3.m29541l(f);
            }
            setForceRadiusFactor(f);
        }
        this.f28659R = f;
    }

    public int getBrushColor() {
        return this.f28667b;
    }

    public float[] getHsv() {
        return this.f28672e0;
    }

    public float getHue() {
        return this.f28668b0;
    }

    public int getRadius() {
        float f = (this.f28665a * 16.0f) + 4.0f;
        return C1357a0.m37541i(f + ((20.0f - f) * this.f28657P));
    }

    public void m11060h(int i, int i2) {
        if (this.f28660S != i) {
            this.f28660S = i;
            m11059i();
        }
        if (this.f28661T != i2) {
            this.f28661T = i2;
            m11058j();
        }
    }

    public final void m11059i() {
        float f = this.f28663V * this.f28668b0;
        if (this.f28662U != 0.0f) {
            int measuredWidth = getMeasuredWidth() / 2;
            f += (((Math.max(C1357a0.m37541i(8.0f) + measuredWidth, Math.min((this.f28660S - measuredWidth) - C1357a0.m37541i(8.0f), this.f28660S * this.f28672e0[1])) - getLeft()) - measuredWidth) - f) * this.f28662U;
        }
        setTranslationX(f);
        AbstractC8870c cVar = this.f28666a0;
        if (cVar != null) {
            cVar.mo11055a();
        }
    }

    public final void m11058j() {
        float f = this.f28664W;
        if (this.f28662U != 0.0f) {
            float f2 = this.f28672e0[2];
            int i = this.f28661T;
            f += (((((((-i) * f2) + i) - (getTop() - this.f28654M.getTop())) - (getMeasuredHeight() / 2)) - C1357a0.m37541i(64.0f)) - f) * this.f28662U;
        }
        setTranslationY(f);
        AbstractC8870c cVar = this.f28666a0;
        if (cVar != null) {
            cVar.mo11055a();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int measuredWidth;
        int radius = getRadius();
        float measuredWidth2 = getMeasuredWidth() / 2;
        float measuredHeight = getMeasuredHeight() / 2;
        canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth - C1357a0.m37541i(2.0f), C1410y.m37039g(-1));
        canvas.drawCircle(measuredWidth2, measuredHeight, radius, C1410y.m37039g(this.f28667b));
        int i = this.f28669c;
        if (i != 0 && i != this.f28667b) {
            canvas.drawCircle(measuredWidth2, measuredHeight, radius - C1357a0.m37541i(0.5f), C1410y.m37075E0(this.f28669c));
        }
    }

    public void setBaseY(float f) {
        if (this.f28664W != f) {
            this.f28664W = f;
            m11058j();
        }
    }

    public void setBrushChangeListener(AbstractC8868a aVar) {
        this.f28670c0 = aVar;
    }

    public void setColorChangeListener(AbstractC8869b bVar) {
        this.f28671d0 = bVar;
    }

    public void setDirection(C8863a aVar) {
        this.f28655N = aVar;
    }

    public void setHue(float f) {
        float[] fArr = this.f28672e0;
        m11063e(f, fArr[1], fArr[2]);
    }

    public void setInToneFactor(float f) {
        if (this.f28662U != f) {
            this.f28662U = f;
            m11059i();
            m11058j();
        }
    }

    public void setPositionChangeListener(AbstractC8870c cVar) {
        this.f28666a0 = cVar;
    }

    public void setRadiusFactor(float f) {
        if (this.f28665a != f) {
            this.f28665a = f;
            m11065c();
            invalidate();
        }
        m11061g(0.0f, true);
    }

    public void setScaleFactor(float f) {
        if (this.f28656O != f) {
            this.f28656O = f;
            float f2 = 1.0f;
            if (f != 1.0f) {
                float i = C1357a0.m37541i(24.0f) / C1357a0.m37541i(44.0f);
                f2 = ((1.0f - i) * f) + i;
            }
            setScaleX(f2);
            setScaleY(f2);
        }
    }

    public void setTargetWidth(int i) {
        if (this.f28663V != i) {
            this.f28663V = i;
            m11059i();
        }
    }

    public void setTone(C8872e eVar) {
        this.f28654M = eVar;
    }
}
