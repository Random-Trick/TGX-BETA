package oe;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import bd.a;
import ce.a0;
import de.b;
import eb.k;
import ib.h;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.c0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import zd.o6;
import zd.z;

public class a extends FrameLayoutFix implements View.OnClickListener, k.b, a.AbstractC0060a {
    public b M;
    public c0 N;
    public c0 O;
    public c0 P;
    public bd.a Q;
    public boolean R;
    public AbstractC0170a S;
    public final b T;
    public o6 U;
    public TdApi.Call V;
    public float W;
    public int f19878a0;
    public float[] f19879b0 = new float[2];
    public k[] f19880c0 = new k[2];
    public k[] f19881d0 = new k[2];
    public float[] f19882e0 = new float[2];
    public float f19883f0;
    public boolean f19884g0;
    public k f19885h0;

    public interface AbstractC0170a {
        void M0(TdApi.Call call);

        void X4(TdApi.Call call);

        void e1(TdApi.Call call);

        void i1(TdApi.Call call, boolean z10);
    }

    public a(Context context, b bVar) {
        super(context);
        this.T = bVar;
        int i10 = a0.i(4.0f);
        int i11 = a0.i(70.5f);
        int i12 = a0.i(24.0f);
        int i13 = a0.i(70.5f);
        this.Q = new bd.a(context, this);
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-1, i11, 80);
        int i14 = i11 + i12;
        r12.rightMargin = i14;
        r12.leftMargin = i14;
        r12.bottomMargin = i13;
        b bVar2 = new b(context);
        this.M = bVar2;
        bVar2.setLayoutParams(r12);
        addView(this.M);
        int i15 = i11 + (i10 * 2);
        FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(i15, i15, 83);
        r13.leftMargin = i12;
        r13.bottomMargin = i13;
        c0 c0Var = new c0(context);
        this.N = c0Var;
        c0Var.setId(R.id.btn_acceptOrHangCall);
        this.N.d(R.drawable.baseline_phone_36, 70.5f, 4.0f, R.id.theme_color_circleButtonPositive, R.id.theme_color_circleButtonPositiveIcon);
        this.N.setLayoutParams(r13);
        this.N.setOnClickListener(this);
        addView(this.N);
        FrameLayout.LayoutParams r14 = FrameLayoutFix.r1(i15, i15, 83);
        r14.leftMargin = i12;
        r14.bottomMargin = i13;
        c0 c0Var2 = new c0(context);
        this.P = c0Var2;
        c0Var2.setId(R.id.btn_closeCall);
        this.P.d(R.drawable.baseline_close_36, 70.5f, 4.0f, R.id.theme_color_circleButtonOverlay, R.id.theme_color_circleButtonOverlayIcon);
        this.P.setLayoutParams(r14);
        this.P.m(true, false);
        this.P.setOnClickListener(this);
        addView(this.P);
        FrameLayout.LayoutParams r15 = FrameLayoutFix.r1(i15, i15, 85);
        r15.rightMargin = i12;
        r15.bottomMargin = i13;
        c0 c0Var3 = new c0(context);
        this.O = c0Var3;
        c0Var3.setId(R.id.btn_declineCall);
        this.O.d(R.drawable.baseline_phone_36, 70.5f, 4.0f, R.id.theme_color_circleButtonNegative, R.id.theme_color_circleButtonNegativeIcon);
        this.O.l(135.0f, false);
        this.O.setLayoutParams(r15);
        this.O.setOnClickListener(this);
        addView(this.O);
    }

    private int getTargetAcceptX() {
        return ((getMeasuredWidth() / 2) - (this.N.getMeasuredWidth() / 2)) - ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).leftMargin;
    }

    private int getTargetDeclineX() {
        return ((-getMeasuredWidth()) / 2) + (this.O.getMeasuredWidth() / 2) + ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).rightMargin;
    }

    private void setCloseFactor(float f10) {
        if (this.f19883f0 != f10) {
            this.f19883f0 = f10;
            I1();
            K1();
        }
    }

    public final void A1(boolean z10, boolean z11) {
        if (this.f19884g0 != z10) {
            this.f19884g0 = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (z11) {
                if (this.f19885h0 == null) {
                    this.f19885h0 = new k(0, this, db.b.f7287b, 180L, this.f19883f0);
                }
                this.f19885h0.i(f10);
            } else {
                k kVar = this.f19885h0;
                if (kVar != null) {
                    kVar.l(f10);
                }
                setCloseFactor(f10);
            }
            this.P.m(!this.f19884g0, z11);
        }
    }

    public final void B1(float f10, int i10, boolean z10) {
        if (z10) {
            k[] kVarArr = this.f19880c0;
            if (kVarArr[i10] == null) {
                kVarArr[i10] = new k(i10 + 100, this, new OvershootInterpolator(2.2f), 280L, this.f19879b0[i10]);
            }
            this.f19880c0[i10].i(f10);
            return;
        }
        k[] kVarArr2 = this.f19880c0;
        if (kVarArr2[i10] != null) {
            kVarArr2[i10].l(f10);
        }
        C1(f10, i10);
    }

    public final void C1(float f10, int i10) {
        float[] fArr = this.f19879b0;
        if (fArr[i10] != f10) {
            fArr[i10] = f10;
            K1();
        }
    }

    public final void D1(int i10, boolean z10) {
        E1(i10, false, 0, z10);
    }

    public final void E1(int r7, boolean r8, int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: oe.a.E1(int, boolean, int, boolean):void");
    }

    public final void G1(float f10, int i10, boolean z10) {
        if (z10) {
            k[] kVarArr = this.f19881d0;
            if (kVarArr[i10] == null) {
                kVarArr[i10] = new k(i10 + 200, this, db.b.f7287b, 180L, this.f19882e0[i10]);
            }
            this.f19881d0[i10].i(f10);
            return;
        }
        k[] kVarArr2 = this.f19881d0;
        if (kVarArr2[i10] != null) {
            kVarArr2[i10].l(f10);
        }
        H1(f10, i10);
    }

    public final void H1(float f10, int i10) {
        float[] fArr = this.f19882e0;
        if (fArr[i10] != f10) {
            fArr[i10] = f10;
            if (i10 == 0) {
                I1();
            }
            this.M.setAlpha(h.d(1.0f - f10));
        }
    }

    public final void I1() {
        float f10 = this.f19882e0[0] * (1.0f - this.f19883f0);
        this.N.l(135.0f * f10, false);
        this.N.j(R.id.theme_color_circleButtonPositive, R.id.theme_color_circleButtonNegative, f10);
    }

    public final void K1() {
        this.P.setTranslationX(getTargetAcceptX() * 0.5f);
        this.N.setTranslationX(getTargetAcceptX() * (this.f19879b0[0] + (this.f19883f0 * 0.5f)));
        this.O.setTranslationX(getTargetDeclineX() * this.f19879b0[1]);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            setCloseFactor(f10);
        } else if (i10 == 100 || i10 == 101) {
            C1(f10, i10 - 100);
        } else if (i10 == 200 || i10 == 201) {
            H1(f10, i10 - 200);
        }
    }

    @Override
    public boolean n7(float f10, float f11) {
        if (this.f19878a0 == 0 || Math.abs(f10) < a0.i(150.0f) || ((f10 <= 0.0f || this.f19878a0 != 1) && (f10 >= 0.0f || this.f19878a0 != 2))) {
            return false;
        }
        E1(0, true, this.f19878a0, true);
        return true;
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onClick(View view) {
        if (this.S != null && this.V != null) {
            int id2 = view.getId();
            if (id2 == R.id.btn_acceptOrHangCall) {
                int constructor = this.V.state.getConstructor();
                if (constructor != -975215467) {
                    if (constructor == 1073048620) {
                        TdApi.Call call = this.V;
                        if (call.isOutgoing) {
                            this.S.i1(call, false);
                            return;
                        } else {
                            this.S.M0(call);
                            return;
                        }
                    } else if (constructor != 1394310213) {
                        this.S.i1(this.V, true);
                        return;
                    }
                }
                this.S.X4(this.V);
            } else if (id2 == R.id.btn_closeCall) {
                this.S.e1(this.V);
            } else if (id2 == R.id.btn_declineCall) {
                this.S.i1(this.V, false);
            }
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.R;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        K1();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if (this.f19878a0 != 0) {
                    this.Q.a(motionEvent);
                }
                E1(0, true, 0, true);
            } else if (action == 2) {
                float f10 = x10 - this.W;
                int i10 = this.f19878a0;
                if (i10 == 1) {
                    float targetAcceptX = getTargetAcceptX();
                    B1(Math.min(Math.max(0.0f, f10), targetAcceptX) / targetAcceptX, 0, false);
                } else if (i10 == 2) {
                    float targetDeclineX = getTargetDeclineX();
                    B1(Math.max(Math.min(0.0f, f10), targetDeclineX) / targetDeclineX, 1, false);
                }
                if (this.f19878a0 != 0) {
                    this.Q.a(motionEvent);
                }
            } else if (action == 3) {
                if (this.f19878a0 != 0) {
                    this.Q.a(motionEvent);
                }
                D1(0, true);
            }
            return false;
        }
        this.f19878a0 = 0;
        this.W = x10;
        if (!this.R) {
            return false;
        }
        if (x10 >= this.N.getLeft() && x10 <= this.N.getRight() && y10 >= this.N.getTop() && y10 <= this.N.getBottom()) {
            z c02 = this.U.F4().c0();
            Context context = getContext();
            o6 o6Var = this.U;
            TdApi.Call call = this.V;
            if (!c02.D(context, o6Var, call, call.userId, this.T)) {
                return true;
            }
            D1(1, true);
            this.Q.a(motionEvent);
            return true;
        } else if (x10 < this.O.getLeft() || x10 > this.O.getRight() || y10 < this.O.getTop() || y10 > this.O.getBottom()) {
            return false;
        } else {
            D1(2, true);
            this.Q.a(motionEvent);
            return true;
        }
    }

    public void setCallback(AbstractC0170a aVar) {
        this.S = aVar;
    }

    public void z1(o6 o6Var, TdApi.Call call, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        TdApi.Call call2 = this.V;
        if (call2 == null || call2.state != call.state) {
            this.U = o6Var;
            this.V = call;
            this.R = false;
            float f10 = 1.0f;
            float f11 = 0.0f;
            switch (call.state.getConstructor()) {
                case TdApi.CallStateReady.CONSTRUCTOR:
                case TdApi.CallStateExchangingKeys.CONSTRUCTOR:
                    z11 = false;
                    z13 = true;
                    z12 = false;
                    break;
                case TdApi.CallStateError.CONSTRUCTOR:
                    z11 = false;
                    z13 = true;
                    z12 = true;
                    break;
                case TdApi.CallStatePending.CONSTRUCTOR:
                    if (!call.isOutgoing) {
                        this.R = true;
                        z11 = true;
                        z13 = true;
                        f10 = 0.0f;
                        z12 = false;
                        break;
                    }
                    z11 = false;
                    z13 = true;
                    z12 = false;
                case TdApi.CallStateDiscarded.CONSTRUCTOR:
                    int constructor = ((TdApi.CallStateDiscarded) call.state).reason.getConstructor();
                    if (!(constructor == -1342872670 || constructor == 438216166 || call.isOutgoing)) {
                        z11 = true;
                        z13 = false;
                        f10 = 0.0f;
                        f11 = 1.0f;
                        z12 = false;
                        break;
                    }
                    z11 = false;
                    z13 = true;
                    z12 = true;
                    break;
                default:
                    throw new IllegalArgumentException("call.state == " + call.state);
            }
            if (this.f19878a0 != 0) {
                this.f19878a0 = 0;
                getParent().requestDisallowInterceptTouchEvent(false);
                this.O.setIsDragging(false);
                this.N.setIsDragging(false);
            }
            this.O.m(!z11, z10);
            this.N.m(!z13, z10);
            A1(z12, z10);
            G1(f10, 0, z10);
            B1(f10, 0, z10);
            G1(f11, 1, z10);
            B1(f11, 1, z10);
        }
    }
}
