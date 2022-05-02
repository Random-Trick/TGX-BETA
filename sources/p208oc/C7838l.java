package p208oc;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import be.C1357a0;
import p208oc.C7838l;

public class C7838l {
    public boolean f25203a;
    public AbstractC7840b f25204b;
    public int f25205c;
    public boolean f25206d;
    public float f25207e;
    public float f25208f;
    public long f25209g;
    public ValueAnimator f25210h;
    public Rect f25211i = new Rect();
    public Rect f25212j = new Rect();
    public Rect f25213k = new Rect();
    public float f25214l = 0.7f;
    public float f25215m = 1.0f;
    public float f25216n = 0.1f;
    public C7839a[] f25217o = {null, null};

    public class C7839a {
        public final int f25218a;
        public int f25219b;
        public int f25220c;
        public float f25221d;
        public float f25222e;
        public ValueAnimator f25223f;
        public ValueAnimator f25224g;
        public float f25225h = 0.0f;

        public C7839a(int i) {
            this.f25218a = i;
        }

        public void m14893c(ValueAnimator valueAnimator) {
            this.f25225h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C7838l.this.f25204b.invalidate();
        }

        public void m14894b() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f25223f = ofFloat;
            ofFloat.setDuration(600L);
            this.f25223f.setInterpolator(AbstractC7821f.f25064J1);
            this.f25223f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C7838l.C7839a.this.m14893c(valueAnimator);
                }
            });
            this.f25223f.start();
        }

        public void m14892d() {
            ValueAnimator valueAnimator = this.f25223f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.f25224g;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
    }

    public interface AbstractC7840b {
        void mo14891a(float f, float f2, boolean z);

        void mo14890b();

        void invalidate();
    }

    public C7838l(AbstractC7840b bVar) {
        this.f25204b = bVar;
    }

    public void m14899g(float f, float f2, float f3, float f4, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f25214l = f + ((f2 - f) * floatValue);
        this.f25215m = f3 + ((f4 - f3) * floatValue);
        this.f25204b.mo14891a(f2, f4, false);
    }

    public boolean m14904b(int i, int i2, int i3) {
        if (this.f25203a) {
            return false;
        }
        if (i3 == 0) {
            if (this.f25211i.contains(i, i2)) {
                C7839a[] aVarArr = this.f25217o;
                if (aVarArr[0] != null) {
                    aVarArr[1] = aVarArr[0];
                }
                aVarArr[0] = new C7839a(1);
                C7839a[] aVarArr2 = this.f25217o;
                aVarArr2[0].f25221d = this.f25214l;
                aVarArr2[0].f25219b = i;
                aVarArr2[0].f25220c = i;
                aVarArr2[0].m14894b();
                ValueAnimator valueAnimator = this.f25210h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                return true;
            } else if (this.f25212j.contains(i, i2)) {
                C7839a[] aVarArr3 = this.f25217o;
                if (aVarArr3[0] != null) {
                    aVarArr3[1] = aVarArr3[0];
                }
                aVarArr3[0] = new C7839a(2);
                C7839a[] aVarArr4 = this.f25217o;
                aVarArr4[0].f25222e = this.f25215m;
                aVarArr4[0].f25219b = i;
                aVarArr4[0].f25220c = i;
                aVarArr4[0].m14894b();
                ValueAnimator valueAnimator2 = this.f25210h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                return true;
            } else if (this.f25213k.contains(i, i2)) {
                this.f25217o[0] = new C7839a(4);
                C7839a[] aVarArr5 = this.f25217o;
                aVarArr5[0].f25222e = this.f25215m;
                aVarArr5[0].f25221d = this.f25214l;
                aVarArr5[0].f25219b = i;
                aVarArr5[0].f25220c = i;
                aVarArr5[0].m14894b();
                ValueAnimator valueAnimator3 = this.f25210h;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                return true;
            } else {
                Rect rect = this.f25211i;
                if (i2 < rect.bottom && i2 > rect.top) {
                    this.f25206d = true;
                    this.f25207e = i;
                    this.f25208f = i2;
                    this.f25209g = System.currentTimeMillis();
                    ValueAnimator valueAnimator4 = this.f25210h;
                    if (valueAnimator4 != null) {
                        if (valueAnimator4.isRunning()) {
                            this.f25204b.mo14891a(this.f25214l, this.f25215m, true);
                        }
                        this.f25210h.cancel();
                    }
                    return true;
                }
            }
        } else if (i3 == 1) {
            C7839a[] aVarArr6 = this.f25217o;
            if (aVarArr6[0] == null || aVarArr6[0].f25218a == 4) {
                return false;
            }
            if (this.f25211i.contains(i, i2)) {
                C7839a[] aVarArr7 = this.f25217o;
                if (aVarArr7[0].f25218a != 1) {
                    aVarArr7[1] = new C7839a(1);
                    C7839a[] aVarArr8 = this.f25217o;
                    aVarArr8[1].f25221d = this.f25214l;
                    aVarArr8[1].f25219b = i;
                    aVarArr8[1].f25220c = i;
                    aVarArr8[1].m14894b();
                    ValueAnimator valueAnimator5 = this.f25210h;
                    if (valueAnimator5 != null) {
                        valueAnimator5.cancel();
                    }
                    return true;
                }
            }
            if (this.f25212j.contains(i, i2)) {
                C7839a[] aVarArr9 = this.f25217o;
                if (aVarArr9[0].f25218a == 2) {
                    return false;
                }
                aVarArr9[1] = new C7839a(2);
                C7839a[] aVarArr10 = this.f25217o;
                aVarArr10[1].f25222e = this.f25215m;
                aVarArr10[1].f25219b = i;
                aVarArr10[1].f25220c = i;
                aVarArr10[1].m14894b();
                ValueAnimator valueAnimator6 = this.f25210h;
                if (valueAnimator6 != null) {
                    valueAnimator6.cancel();
                }
                return true;
            }
        }
        return false;
    }

    public boolean m14903c() {
        return this.f25217o[0] != null || this.f25206d;
    }

    public C7839a m14902d() {
        C7839a[] aVarArr = this.f25217o;
        if (aVarArr[0] != null && aVarArr[0].f25218a == 1) {
            return aVarArr[0];
        }
        if (aVarArr[1] == null || aVarArr[1].f25218a != 1) {
            return null;
        }
        return aVarArr[1];
    }

    public C7839a m14901e() {
        C7839a[] aVarArr = this.f25217o;
        if (aVarArr[0] != null && aVarArr[0].f25218a == 4) {
            return aVarArr[0];
        }
        if (aVarArr[1] == null || aVarArr[1].f25218a != 4) {
            return null;
        }
        return aVarArr[1];
    }

    public C7839a m14900f() {
        C7839a[] aVarArr = this.f25217o;
        if (aVarArr[0] != null && aVarArr[0].f25218a == 2) {
            return aVarArr[0];
        }
        if (aVarArr[1] == null || aVarArr[1].f25218a != 2) {
            return null;
        }
        return aVarArr[1];
    }

    public boolean m14898h(int i, int i2, int i3) {
        C7839a aVar;
        boolean z = false;
        if (this.f25206d || (aVar = this.f25217o[i3]) == null) {
            return false;
        }
        int i4 = aVar.f25218a;
        float f = aVar.f25221d;
        float f2 = aVar.f25222e;
        int i5 = aVar.f25219b;
        aVar.f25220c = i;
        if (i4 == 1) {
            float f3 = f - ((i5 - i) / this.f25205c);
            this.f25214l = f3;
            if (f3 < 0.0f) {
                this.f25214l = 0.0f;
            }
            float f4 = this.f25215m;
            float f5 = this.f25216n;
            if (f4 - this.f25214l < f5) {
                this.f25214l = f4 - f5;
            }
            z = true;
        }
        if (i4 == 2) {
            float f6 = f2 - ((i5 - i) / this.f25205c);
            this.f25215m = f6;
            if (f6 > 1.0f) {
                this.f25215m = 1.0f;
            }
            float f7 = this.f25215m;
            float f8 = this.f25214l;
            float f9 = this.f25216n;
            if (f7 - f8 < f9) {
                this.f25215m = f8 + f9;
            }
            z = true;
        }
        if (i4 == 4) {
            float f10 = i5 - i;
            int i6 = this.f25205c;
            float f11 = f - (f10 / i6);
            this.f25214l = f11;
            this.f25215m = f2 - (f10 / i6);
            if (f11 < 0.0f) {
                this.f25214l = 0.0f;
                this.f25215m = f2 - f;
            }
            if (this.f25215m > 1.0f) {
                this.f25215m = 1.0f;
                this.f25214l = 1.0f - (f2 - f);
            }
            z = true;
        }
        if (z) {
            this.f25204b.mo14890b();
        }
        return true;
    }

    public void m14897i() {
        C7839a[] aVarArr = this.f25217o;
        if (aVarArr[0] != null) {
            aVarArr[0].m14892d();
        }
        C7839a[] aVarArr2 = this.f25217o;
        if (aVarArr2[1] != null) {
            aVarArr2[1].m14892d();
        }
        C7839a[] aVarArr3 = this.f25217o;
        aVarArr3[0] = null;
        aVarArr3[1] = null;
    }

    public boolean m14896j(MotionEvent motionEvent, int i) {
        final float f;
        final float f2;
        if (i != 0) {
            C7839a[] aVarArr = this.f25217o;
            if (aVarArr[1] != null) {
                aVarArr[1].m14892d();
            }
            this.f25217o[1] = null;
        } else if (this.f25206d) {
            this.f25206d = false;
            float x = this.f25207e - motionEvent.getX();
            float y = this.f25208f - motionEvent.getY();
            if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f25209g < 300 && Math.sqrt((x * x) + (y * y)) < C1357a0.m37541i(10.0f)) {
                float horizontalPadding = (this.f25207e - AbstractC7821f.getHorizontalPadding()) / this.f25205c;
                final float f3 = this.f25215m;
                final float f4 = this.f25214l;
                float f5 = f3 - f4;
                float f6 = f5 / 2.0f;
                float f7 = horizontalPadding - f6;
                float f8 = horizontalPadding + f6;
                if (f7 < 0.0f) {
                    f = f5;
                    f2 = 0.0f;
                } else if (f8 > 1.0f) {
                    f2 = 1.0f - f5;
                    f = 1.0f;
                } else {
                    f = f8;
                    f2 = f7;
                }
                this.f25210h = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f25204b.mo14891a(f2, f, true);
                this.f25210h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C7838l.this.m14899g(f4, f2, f3, f, valueAnimator);
                    }
                });
                this.f25210h.setInterpolator(AbstractC7821f.f25064J1);
                this.f25210h.start();
            }
            return true;
        } else {
            C7839a[] aVarArr2 = this.f25217o;
            if (aVarArr2[0] != null) {
                aVarArr2[0].m14892d();
            }
            C7839a[] aVarArr3 = this.f25217o;
            aVarArr3[0] = null;
            if (aVarArr3[1] != null) {
                aVarArr3[0] = aVarArr3[1];
                aVarArr3[1] = null;
            }
        }
        return false;
    }
}
