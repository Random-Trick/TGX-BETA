package pc;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import ce.a0;
import pc.l;

public class l {
    public boolean f21104a;
    public b f21105b;
    public int f21106c;
    public boolean f21107d;
    public float f21108e;
    public float f21109f;
    public long f21110g;
    public ValueAnimator f21111h;
    public Rect f21112i = new Rect();
    public Rect f21113j = new Rect();
    public Rect f21114k = new Rect();
    public float f21115l = 0.7f;
    public float f21116m = 1.0f;
    public float f21117n = 0.1f;
    public a[] f21118o = {null, null};

    public class a {
        public final int f21119a;
        public int f21120b;
        public int f21121c;
        public float f21122d;
        public float f21123e;
        public ValueAnimator f21124f;
        public ValueAnimator f21125g;
        public float f21126h = 0.0f;

        public a(int i10) {
            this.f21119a = i10;
        }

        public void c(ValueAnimator valueAnimator) {
            this.f21126h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            l.this.f21105b.invalidate();
        }

        public void b() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f21124f = ofFloat;
            ofFloat.setDuration(600L);
            this.f21124f.setInterpolator(f.J1);
            this.f21124f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    l.a.this.c(valueAnimator);
                }
            });
            this.f21124f.start();
        }

        public void d() {
            ValueAnimator valueAnimator = this.f21124f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.f21125g;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
        }
    }

    public interface b {
        void a(float f10, float f11, boolean z10);

        void b();

        void invalidate();
    }

    public l(b bVar) {
        this.f21105b = bVar;
    }

    public void g(float f10, float f11, float f12, float f13, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f21115l = f10 + ((f11 - f10) * floatValue);
        this.f21116m = f12 + ((f13 - f12) * floatValue);
        this.f21105b.a(f11, f13, false);
    }

    public boolean b(int i10, int i11, int i12) {
        if (this.f21104a) {
            return false;
        }
        if (i12 == 0) {
            if (this.f21112i.contains(i10, i11)) {
                a[] aVarArr = this.f21118o;
                if (aVarArr[0] != null) {
                    aVarArr[1] = aVarArr[0];
                }
                aVarArr[0] = new a(1);
                a[] aVarArr2 = this.f21118o;
                aVarArr2[0].f21122d = this.f21115l;
                aVarArr2[0].f21120b = i10;
                aVarArr2[0].f21121c = i10;
                aVarArr2[0].b();
                ValueAnimator valueAnimator = this.f21111h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                return true;
            } else if (this.f21113j.contains(i10, i11)) {
                a[] aVarArr3 = this.f21118o;
                if (aVarArr3[0] != null) {
                    aVarArr3[1] = aVarArr3[0];
                }
                aVarArr3[0] = new a(2);
                a[] aVarArr4 = this.f21118o;
                aVarArr4[0].f21123e = this.f21116m;
                aVarArr4[0].f21120b = i10;
                aVarArr4[0].f21121c = i10;
                aVarArr4[0].b();
                ValueAnimator valueAnimator2 = this.f21111h;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                return true;
            } else if (this.f21114k.contains(i10, i11)) {
                this.f21118o[0] = new a(4);
                a[] aVarArr5 = this.f21118o;
                aVarArr5[0].f21123e = this.f21116m;
                aVarArr5[0].f21122d = this.f21115l;
                aVarArr5[0].f21120b = i10;
                aVarArr5[0].f21121c = i10;
                aVarArr5[0].b();
                ValueAnimator valueAnimator3 = this.f21111h;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                return true;
            } else {
                Rect rect = this.f21112i;
                if (i11 < rect.bottom && i11 > rect.top) {
                    this.f21107d = true;
                    this.f21108e = i10;
                    this.f21109f = i11;
                    this.f21110g = System.currentTimeMillis();
                    ValueAnimator valueAnimator4 = this.f21111h;
                    if (valueAnimator4 != null) {
                        if (valueAnimator4.isRunning()) {
                            this.f21105b.a(this.f21115l, this.f21116m, true);
                        }
                        this.f21111h.cancel();
                    }
                    return true;
                }
            }
        } else if (i12 == 1) {
            a[] aVarArr6 = this.f21118o;
            if (aVarArr6[0] == null || aVarArr6[0].f21119a == 4) {
                return false;
            }
            if (this.f21112i.contains(i10, i11)) {
                a[] aVarArr7 = this.f21118o;
                if (aVarArr7[0].f21119a != 1) {
                    aVarArr7[1] = new a(1);
                    a[] aVarArr8 = this.f21118o;
                    aVarArr8[1].f21122d = this.f21115l;
                    aVarArr8[1].f21120b = i10;
                    aVarArr8[1].f21121c = i10;
                    aVarArr8[1].b();
                    ValueAnimator valueAnimator5 = this.f21111h;
                    if (valueAnimator5 != null) {
                        valueAnimator5.cancel();
                    }
                    return true;
                }
            }
            if (this.f21113j.contains(i10, i11)) {
                a[] aVarArr9 = this.f21118o;
                if (aVarArr9[0].f21119a == 2) {
                    return false;
                }
                aVarArr9[1] = new a(2);
                a[] aVarArr10 = this.f21118o;
                aVarArr10[1].f21123e = this.f21116m;
                aVarArr10[1].f21120b = i10;
                aVarArr10[1].f21121c = i10;
                aVarArr10[1].b();
                ValueAnimator valueAnimator6 = this.f21111h;
                if (valueAnimator6 != null) {
                    valueAnimator6.cancel();
                }
                return true;
            }
        }
        return false;
    }

    public boolean c() {
        return this.f21118o[0] != null || this.f21107d;
    }

    public a d() {
        a[] aVarArr = this.f21118o;
        if (aVarArr[0] != null && aVarArr[0].f21119a == 1) {
            return aVarArr[0];
        }
        if (aVarArr[1] == null || aVarArr[1].f21119a != 1) {
            return null;
        }
        return aVarArr[1];
    }

    public a e() {
        a[] aVarArr = this.f21118o;
        if (aVarArr[0] != null && aVarArr[0].f21119a == 4) {
            return aVarArr[0];
        }
        if (aVarArr[1] == null || aVarArr[1].f21119a != 4) {
            return null;
        }
        return aVarArr[1];
    }

    public a f() {
        a[] aVarArr = this.f21118o;
        if (aVarArr[0] != null && aVarArr[0].f21119a == 2) {
            return aVarArr[0];
        }
        if (aVarArr[1] == null || aVarArr[1].f21119a != 2) {
            return null;
        }
        return aVarArr[1];
    }

    public boolean h(int i10, int i11, int i12) {
        a aVar;
        boolean z10 = false;
        if (this.f21107d || (aVar = this.f21118o[i12]) == null) {
            return false;
        }
        int i13 = aVar.f21119a;
        float f10 = aVar.f21122d;
        float f11 = aVar.f21123e;
        int i14 = aVar.f21120b;
        aVar.f21121c = i10;
        if (i13 == 1) {
            float f12 = f10 - ((i14 - i10) / this.f21106c);
            this.f21115l = f12;
            if (f12 < 0.0f) {
                this.f21115l = 0.0f;
            }
            float f13 = this.f21116m;
            float f14 = this.f21117n;
            if (f13 - this.f21115l < f14) {
                this.f21115l = f13 - f14;
            }
            z10 = true;
        }
        if (i13 == 2) {
            float f15 = f11 - ((i14 - i10) / this.f21106c);
            this.f21116m = f15;
            if (f15 > 1.0f) {
                this.f21116m = 1.0f;
            }
            float f16 = this.f21116m;
            float f17 = this.f21115l;
            float f18 = this.f21117n;
            if (f16 - f17 < f18) {
                this.f21116m = f17 + f18;
            }
            z10 = true;
        }
        if (i13 == 4) {
            float f19 = i14 - i10;
            int i15 = this.f21106c;
            float f20 = f10 - (f19 / i15);
            this.f21115l = f20;
            this.f21116m = f11 - (f19 / i15);
            if (f20 < 0.0f) {
                this.f21115l = 0.0f;
                this.f21116m = f11 - f10;
            }
            if (this.f21116m > 1.0f) {
                this.f21116m = 1.0f;
                this.f21115l = 1.0f - (f11 - f10);
            }
            z10 = true;
        }
        if (z10) {
            this.f21105b.b();
        }
        return true;
    }

    public void i() {
        a[] aVarArr = this.f21118o;
        if (aVarArr[0] != null) {
            aVarArr[0].d();
        }
        a[] aVarArr2 = this.f21118o;
        if (aVarArr2[1] != null) {
            aVarArr2[1].d();
        }
        a[] aVarArr3 = this.f21118o;
        aVarArr3[0] = null;
        aVarArr3[1] = null;
    }

    public boolean j(MotionEvent motionEvent, int i10) {
        final float f10;
        final float f11;
        if (i10 != 0) {
            a[] aVarArr = this.f21118o;
            if (aVarArr[1] != null) {
                aVarArr[1].d();
            }
            this.f21118o[1] = null;
        } else if (this.f21107d) {
            this.f21107d = false;
            float x10 = this.f21108e - motionEvent.getX();
            float y10 = this.f21109f - motionEvent.getY();
            if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f21110g < 300 && Math.sqrt((x10 * x10) + (y10 * y10)) < a0.i(10.0f)) {
                float horizontalPadding = (this.f21108e - f.getHorizontalPadding()) / this.f21106c;
                final float f12 = this.f21116m;
                final float f13 = this.f21115l;
                float f14 = f12 - f13;
                float f15 = f14 / 2.0f;
                float f16 = horizontalPadding - f15;
                float f17 = horizontalPadding + f15;
                if (f16 < 0.0f) {
                    f10 = f14;
                    f11 = 0.0f;
                } else if (f17 > 1.0f) {
                    f11 = 1.0f - f14;
                    f10 = 1.0f;
                } else {
                    f10 = f17;
                    f11 = f16;
                }
                this.f21111h = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.f21105b.a(f11, f10, true);
                this.f21111h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        l.this.g(f13, f11, f12, f10, valueAnimator);
                    }
                });
                this.f21111h.setInterpolator(f.J1);
                this.f21111h.start();
            }
            return true;
        } else {
            a[] aVarArr2 = this.f21118o;
            if (aVarArr2[0] != null) {
                aVarArr2[0].d();
            }
            a[] aVarArr3 = this.f21118o;
            aVarArr3[0] = null;
            if (aVarArr3[1] != null) {
                aVarArr3[0] = aVarArr3[1];
                aVarArr3[1] = null;
            }
        }
        return false;
    }
}
