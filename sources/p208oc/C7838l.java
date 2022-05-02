package p208oc;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import be.C1357a0;
import p208oc.C7838l;

public class C7838l {
    public boolean f25206a;
    public AbstractC7840b f25207b;
    public int f25208c;
    public boolean f25209d;
    public float f25210e;
    public float f25211f;
    public long f25212g;
    public ValueAnimator f25213h;
    public Rect f25214i = new Rect();
    public Rect f25215j = new Rect();
    public Rect f25216k = new Rect();
    public float f25217l = 0.7f;
    public float f25218m = 1.0f;
    public float f25219n = 0.1f;
    public C7839a[] f25220o = {null, null};

    public class C7839a {
        public final int f25221a;
        public int f25222b;
        public int f25223c;
        public float f25224d;
        public float f25225e;
        public ValueAnimator f25226f;
        public ValueAnimator f25227g;
        public float f25228h = 0.0f;

        public C7839a(int i) {
            this.f25221a = i;
        }

        public void m14893c(ValueAnimator valueAnimator) {
            this.f25228h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C7838l.this.f25207b.invalidate();
        }

        public void m14894b() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f25226f = ofFloat;
            ofFloat.setDuration(600L);
            this.f25226f.setInterpolator(AbstractC7821f.f25067J1);
            this.f25226f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C7838l.C7839a.this.m14893c(valueAnimator);
                }
            });
            this.f25226f.start();
        }

        public void m14892d() {
            ValueAnimator valueAnimator = this.f25226f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.f25227g;
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
        this.f25207b = bVar;
    }

    public void m14899g(float f, float f2, float f3, float f4, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f25217l = f + ((f2 - f) * floatValue);
        this.f25218m = f3 + ((f4 - f3) * floatValue);
        this.f25207b.mo14891a(f2, f4, false);
    }

    public boolean m14904b(int i, int i2, int i3) {
        if (this.f25206a) {
            return false;
        }
        if (i3 == 0) {
            if (this.f25214i.contains(i, i2)) {
                C7839a[] aVarArr = this.f25220o;
                if (aVarArr[0] != null) {
                    aVarArr[1] = aVarArr[0];
                }
                aVarArr[0] = new C7839a(1);
                C7839a[] aVarArr2 = this.f25220o;
                aVarArr2[0].f25224d = this.f25217l;
                aVarArr2[0].f25222b = i;
                aVarArr2[0].f25223c = i;
                aVarArr2[0].m14894b();
                ValueAnimator valueAnimator = this.f25213h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                return true;
            } else if (this.f25215j.contains(i, i2)) {
                C7839a[] aVarArr3 = this.f25220o;
                if (aVarArr3[0] != null) {
                    aVarArr3[1] = aVarArr3[0];
                }
                aVarArr3[0] = new C7839a(2);
                C7839a[] aVarArr4 = this.f25220o;
                aVarArr4[0].f25225e = this.f25218m;
                aVarArr4[0].f25222b = i;
                aVarArr4[0].f25223c = i;
                aVarArr4[0].m14894b();
                ValueAnimator valueAnimator2 = this.f25213h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                return true;
            } else if (this.f25216k.contains(i, i2)) {
                this.f25220o[0] = new C7839a(4);
                C7839a[] aVarArr5 = this.f25220o;
                aVarArr5[0].f25225e = this.f25218m;
                aVarArr5[0].f25224d = this.f25217l;
                aVarArr5[0].f25222b = i;
                aVarArr5[0].f25223c = i;
                aVarArr5[0].m14894b();
                ValueAnimator valueAnimator3 = this.f25213h;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                return true;
            } else {
                Rect rect = this.f25214i;
                if (i2 < rect.bottom && i2 > rect.top) {
                    this.f25209d = true;
                    this.f25210e = i;
                    this.f25211f = i2;
                    this.f25212g = System.currentTimeMillis();
                    ValueAnimator valueAnimator4 = this.f25213h;
                    if (valueAnimator4 != null) {
                        if (valueAnimator4.isRunning()) {
                            this.f25207b.mo14891a(this.f25217l, this.f25218m, true);
                        }
                        this.f25213h.cancel();
                    }
                    return true;
                }
            }
        } else if (i3 == 1) {
            C7839a[] aVarArr6 = this.f25220o;
            if (aVarArr6[0] == null || aVarArr6[0].f25221a == 4) {
                return false;
            }
            if (this.f25214i.contains(i, i2)) {
                C7839a[] aVarArr7 = this.f25220o;
                if (aVarArr7[0].f25221a != 1) {
                    aVarArr7[1] = new C7839a(1);
                    C7839a[] aVarArr8 = this.f25220o;
                    aVarArr8[1].f25224d = this.f25217l;
                    aVarArr8[1].f25222b = i;
                    aVarArr8[1].f25223c = i;
                    aVarArr8[1].m14894b();
                    ValueAnimator valueAnimator5 = this.f25213h;
                    if (valueAnimator5 != null) {
                        valueAnimator5.cancel();
                    }
                    return true;
                }
            }
            if (this.f25215j.contains(i, i2)) {
                C7839a[] aVarArr9 = this.f25220o;
                if (aVarArr9[0].f25221a == 2) {
                    return false;
                }
                aVarArr9[1] = new C7839a(2);
                C7839a[] aVarArr10 = this.f25220o;
                aVarArr10[1].f25225e = this.f25218m;
                aVarArr10[1].f25222b = i;
                aVarArr10[1].f25223c = i;
                aVarArr10[1].m14894b();
                ValueAnimator valueAnimator6 = this.f25213h;
                if (valueAnimator6 != null) {
                    valueAnimator6.cancel();
                }
                return true;
            }
        }
        return false;
    }

    public boolean m14903c() {
        return this.f25220o[0] != null || this.f25209d;
    }

    public C7839a m14902d() {
        C7839a[] aVarArr = this.f25220o;
        if (aVarArr[0] != null && aVarArr[0].f25221a == 1) {
            return aVarArr[0];
        }
        if (aVarArr[1] == null || aVarArr[1].f25221a != 1) {
            return null;
        }
        return aVarArr[1];
    }

    public C7839a m14901e() {
        C7839a[] aVarArr = this.f25220o;
        if (aVarArr[0] != null && aVarArr[0].f25221a == 4) {
            return aVarArr[0];
        }
        if (aVarArr[1] == null || aVarArr[1].f25221a != 4) {
            return null;
        }
        return aVarArr[1];
    }

    public C7839a m14900f() {
        C7839a[] aVarArr = this.f25220o;
        if (aVarArr[0] != null && aVarArr[0].f25221a == 2) {
            return aVarArr[0];
        }
        if (aVarArr[1] == null || aVarArr[1].f25221a != 2) {
            return null;
        }
        return aVarArr[1];
    }

    public boolean m14898h(int i, int i2, int i3) {
        C7839a aVar;
        boolean z = false;
        if (this.f25209d || (aVar = this.f25220o[i3]) == null) {
            return false;
        }
        int i4 = aVar.f25221a;
        float f = aVar.f25224d;
        float f2 = aVar.f25225e;
        int i5 = aVar.f25222b;
        aVar.f25223c = i;
        if (i4 == 1) {
            float f3 = f - ((i5 - i) / this.f25208c);
            this.f25217l = f3;
            if (f3 < 0.0f) {
                this.f25217l = 0.0f;
            }
            float f4 = this.f25218m;
            float f5 = this.f25219n;
            if (f4 - this.f25217l < f5) {
                this.f25217l = f4 - f5;
            }
            z = true;
        }
        if (i4 == 2) {
            float f6 = f2 - ((i5 - i) / this.f25208c);
            this.f25218m = f6;
            if (f6 > 1.0f) {
                this.f25218m = 1.0f;
            }
            float f7 = this.f25218m;
            float f8 = this.f25217l;
            float f9 = this.f25219n;
            if (f7 - f8 < f9) {
                this.f25218m = f8 + f9;
            }
            z = true;
        }
        if (i4 == 4) {
            float f10 = i5 - i;
            int i6 = this.f25208c;
            float f11 = f - (f10 / i6);
            this.f25217l = f11;
            this.f25218m = f2 - (f10 / i6);
            if (f11 < 0.0f) {
                this.f25217l = 0.0f;
                this.f25218m = f2 - f;
            }
            if (this.f25218m > 1.0f) {
                this.f25218m = 1.0f;
                this.f25217l = 1.0f - (f2 - f);
            }
            z = true;
        }
        if (z) {
            this.f25207b.mo14890b();
        }
        return true;
    }

    public void m14897i() {
        C7839a[] aVarArr = this.f25220o;
        if (aVarArr[0] != null) {
            aVarArr[0].m14892d();
        }
        C7839a[] aVarArr2 = this.f25220o;
        if (aVarArr2[1] != null) {
            aVarArr2[1].m14892d();
        }
        C7839a[] aVarArr3 = this.f25220o;
        aVarArr3[0] = null;
        aVarArr3[1] = null;
    }

    public boolean m14896j(MotionEvent motionEvent, int i) {
        final float f;
        final float f2;
        if (i != 0) {
            C7839a[] aVarArr = this.f25220o;
            if (aVarArr[1] != null) {
                aVarArr[1].m14892d();
            }
            this.f25220o[1] = null;
        } else if (this.f25209d) {
            this.f25209d = false;
            float x = this.f25210e - motionEvent.getX();
            float y = this.f25211f - motionEvent.getY();
            if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f25212g < 300 && Math.sqrt((x * x) + (y * y)) < C1357a0.m37544i(10.0f)) {
                float horizontalPadding = (this.f25210e - AbstractC7821f.getHorizontalPadding()) / this.f25208c;
                final float f3 = this.f25218m;
                final float f4 = this.f25217l;
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
                this.f25213h = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f25207b.mo14891a(f2, f, true);
                this.f25213h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C7838l.this.m14899g(f4, f2, f3, f, valueAnimator);
                    }
                });
                this.f25213h.setInterpolator(AbstractC7821f.f25067J1);
                this.f25213h.start();
            }
            return true;
        } else {
            C7839a[] aVarArr2 = this.f25220o;
            if (aVarArr2[0] != null) {
                aVarArr2[0].m14892d();
            }
            C7839a[] aVarArr3 = this.f25220o;
            aVarArr3[0] = null;
            if (aVarArr3[1] != null) {
                aVarArr3[0] = aVarArr3[1];
                aVarArr3[1] = null;
            }
        }
        return false;
    }
}
