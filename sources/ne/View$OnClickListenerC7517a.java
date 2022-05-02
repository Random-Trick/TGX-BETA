package ne;

import ad.GestureDetector$OnGestureListenerC0256a;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import be.C1357a0;
import me.C6851c0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p038ce.View$OnClickListenerC2162b;
import p051db.C3950k;
import p108hb.C5069h;
import p350yd.C10552b0;
import p350yd.C10930q6;

public class View$OnClickListenerC7517a extends FrameLayoutFix implements View.OnClickListener, C3950k.AbstractC3952b, GestureDetector$OnGestureListenerC0256a.AbstractC0257a {
    public RunnableC7519b f24034M;
    public C6851c0 f24035N;
    public C6851c0 f24036O;
    public C6851c0 f24037P;
    public GestureDetector$OnGestureListenerC0256a f24038Q;
    public boolean f24039R;
    public AbstractC7518a f24040S;
    public final View$OnClickListenerC2162b f24041T;
    public C10930q6 f24042U;
    public TdApi.Call f24043V;
    public float f24044W;
    public int f24045a0;
    public float[] f24046b0 = new float[2];
    public C3950k[] f24047c0 = new C3950k[2];
    public C3950k[] f24048d0 = new C3950k[2];
    public float[] f24049e0 = new float[2];
    public float f24050f0;
    public boolean f24051g0;
    public C3950k f24052h0;

    public interface AbstractC7518a {
        void mo15746K0(TdApi.Call call);

        void mo15745c5(TdApi.Call call);

        void mo15744j1(TdApi.Call call);

        void mo15743n1(TdApi.Call call, boolean z);
    }

    public View$OnClickListenerC7517a(Context context, View$OnClickListenerC2162b bVar) {
        super(context);
        this.f24041T = bVar;
        int i = C1357a0.m37544i(4.0f);
        int i2 = C1357a0.m37544i(70.5f);
        int i3 = C1357a0.m37544i(24.0f);
        int i4 = C1357a0.m37544i(70.5f);
        this.f24038Q = new GestureDetector$OnGestureListenerC0256a(context, this);
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, i2, 80);
        int i5 = i2 + i3;
        t1.rightMargin = i5;
        t1.leftMargin = i5;
        t1.bottomMargin = i4;
        RunnableC7519b bVar2 = new RunnableC7519b(context);
        this.f24034M = bVar2;
        bVar2.setLayoutParams(t1);
        addView(this.f24034M);
        int i6 = i2 + (i * 2);
        FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(i6, i6, 83);
        t12.leftMargin = i3;
        t12.bottomMargin = i4;
        C6851c0 c0Var = new C6851c0(context);
        this.f24035N = c0Var;
        c0Var.setId(R.id.btn_acceptOrHangCall);
        this.f24035N.m18790d(R.drawable.baseline_phone_36, 70.5f, 4.0f, R.id.theme_color_circleButtonPositive, R.id.theme_color_circleButtonPositiveIcon);
        this.f24035N.setLayoutParams(t12);
        this.f24035N.setOnClickListener(this);
        addView(this.f24035N);
        FrameLayout.LayoutParams t13 = FrameLayoutFix.m18007t1(i6, i6, 83);
        t13.leftMargin = i3;
        t13.bottomMargin = i4;
        C6851c0 c0Var2 = new C6851c0(context);
        this.f24037P = c0Var2;
        c0Var2.setId(R.id.btn_closeCall);
        this.f24037P.m18790d(R.drawable.baseline_close_36, 70.5f, 4.0f, R.id.theme_color_circleButtonOverlay, R.id.theme_color_circleButtonOverlayIcon);
        this.f24037P.setLayoutParams(t13);
        this.f24037P.m18781m(true, false);
        this.f24037P.setOnClickListener(this);
        addView(this.f24037P);
        FrameLayout.LayoutParams t14 = FrameLayoutFix.m18007t1(i6, i6, 85);
        t14.rightMargin = i3;
        t14.bottomMargin = i4;
        C6851c0 c0Var3 = new C6851c0(context);
        this.f24036O = c0Var3;
        c0Var3.setId(R.id.btn_declineCall);
        this.f24036O.m18790d(R.drawable.baseline_phone_36, 70.5f, 4.0f, R.id.theme_color_circleButtonNegative, R.id.theme_color_circleButtonNegativeIcon);
        this.f24036O.m18782l(135.0f, false);
        this.f24036O.setLayoutParams(t14);
        this.f24036O.setOnClickListener(this);
        addView(this.f24036O);
    }

    private int getTargetAcceptX() {
        return ((getMeasuredWidth() / 2) - (this.f24035N.getMeasuredWidth() / 2)) - ((ViewGroup.MarginLayoutParams) this.f24035N.getLayoutParams()).leftMargin;
    }

    private int getTargetDeclineX() {
        return ((-getMeasuredWidth()) / 2) + (this.f24036O.getMeasuredWidth() / 2) + ((ViewGroup.MarginLayoutParams) this.f24036O.getLayoutParams()).rightMargin;
    }

    private void setCloseFactor(float f) {
        if (this.f24050f0 != f) {
            this.f24050f0 = f;
            m15748M1();
            m15747N1();
        }
    }

    public void m15756C1(C10930q6 q6Var, TdApi.Call call, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        TdApi.Call call2 = this.f24043V;
        if (call2 == null || call2.state != call.state) {
            this.f24042U = q6Var;
            this.f24043V = call;
            this.f24039R = false;
            float f = 1.0f;
            float f2 = 0.0f;
            switch (call.state.getConstructor()) {
                case TdApi.CallStateReady.CONSTRUCTOR:
                case TdApi.CallStateExchangingKeys.CONSTRUCTOR:
                    z2 = false;
                    z4 = true;
                    z3 = false;
                    break;
                case TdApi.CallStateError.CONSTRUCTOR:
                    z2 = false;
                    z4 = true;
                    z3 = true;
                    break;
                case TdApi.CallStateDiscarded.CONSTRUCTOR:
                    int constructor = ((TdApi.CallStateDiscarded) call.state).reason.getConstructor();
                    if (!(constructor == -1342872670 || constructor == 438216166 || call.isOutgoing)) {
                        z2 = true;
                        z4 = false;
                        f = 0.0f;
                        f2 = 1.0f;
                        z3 = false;
                        break;
                    }
                    z2 = false;
                    z4 = true;
                    z3 = true;
                    break;
                case TdApi.CallStatePending.CONSTRUCTOR:
                    if (!call.isOutgoing) {
                        this.f24039R = true;
                        z2 = true;
                        z4 = true;
                        f = 0.0f;
                        z3 = false;
                        break;
                    }
                    z2 = false;
                    z4 = true;
                    z3 = false;
                default:
                    throw new IllegalArgumentException("call.state == " + call.state);
            }
            if (this.f24045a0 != 0) {
                this.f24045a0 = 0;
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f24036O.setIsDragging(false);
                this.f24035N.setIsDragging(false);
            }
            this.f24036O.m18781m(!z2, z);
            this.f24035N.m18781m(!z4, z);
            m15755D1(z3, z);
            m15750J1(f, 0, z);
            m15754E1(f, 0, z);
            m15750J1(f2, 1, z);
            m15754E1(f2, 1, z);
        }
    }

    public final void m15755D1(boolean z, boolean z2) {
        if (this.f24051g0 != z) {
            this.f24051g0 = z;
            float f = z ? 1.0f : 0.0f;
            if (z2) {
                if (this.f24052h0 == null) {
                    this.f24052h0 = new C3950k(0, this, C2057b.f7280b, 180L, this.f24050f0);
                }
                this.f24052h0.m29546i(f);
            } else {
                C3950k kVar = this.f24052h0;
                if (kVar != null) {
                    kVar.m29543l(f);
                }
                setCloseFactor(f);
            }
            this.f24037P.m18781m(!this.f24051g0, z2);
        }
    }

    public final void m15754E1(float f, int i, boolean z) {
        if (z) {
            C3950k[] kVarArr = this.f24047c0;
            if (kVarArr[i] == null) {
                kVarArr[i] = new C3950k(i + 100, this, new OvershootInterpolator(2.2f), 280L, this.f24046b0[i]);
            }
            this.f24047c0[i].m29546i(f);
            return;
        }
        C3950k[] kVarArr2 = this.f24047c0;
        if (kVarArr2[i] != null) {
            kVarArr2[i].m29543l(f);
        }
        m15753F1(f, i);
    }

    public final void m15753F1(float f, int i) {
        float[] fArr = this.f24046b0;
        if (fArr[i] != f) {
            fArr[i] = f;
            m15747N1();
        }
    }

    public final void m15752G1(int i, boolean z) {
        m15751I1(i, false, 0, z);
    }

    public final void m15751I1(int r7, boolean r8, int r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: ne.View$OnClickListenerC7517a.m15751I1(int, boolean, int, boolean):void");
    }

    public final void m15750J1(float f, int i, boolean z) {
        if (z) {
            C3950k[] kVarArr = this.f24048d0;
            if (kVarArr[i] == null) {
                kVarArr[i] = new C3950k(i + 200, this, C2057b.f7280b, 180L, this.f24049e0[i]);
            }
            this.f24048d0[i].m29546i(f);
            return;
        }
        C3950k[] kVarArr2 = this.f24048d0;
        if (kVarArr2[i] != null) {
            kVarArr2[i].m29543l(f);
        }
        m15749L1(f, i);
    }

    public final void m15749L1(float f, int i) {
        float[] fArr = this.f24049e0;
        if (fArr[i] != f) {
            fArr[i] = f;
            if (i == 0) {
                m15748M1();
            }
            this.f24034M.setAlpha(C5069h.m24090d(1.0f - f));
        }
    }

    public final void m15748M1() {
        float f = this.f24049e0[0] * (1.0f - this.f24050f0);
        this.f24035N.m18782l(135.0f * f, false);
        this.f24035N.m18784j(R.id.theme_color_circleButtonPositive, R.id.theme_color_circleButtonNegative, f);
    }

    public final void m15747N1() {
        this.f24037P.setTranslationX(getTargetAcceptX() * 0.5f);
        this.f24035N.setTranslationX(getTargetAcceptX() * (this.f24046b0[0] + (this.f24050f0 * 0.5f)));
        this.f24036O.setTranslationX(getTargetDeclineX() * this.f24046b0[1]);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            setCloseFactor(f);
        } else if (i == 100 || i == 101) {
            m15753F1(f, i - 100);
        } else if (i == 200 || i == 201) {
            m15749L1(f, i - 200);
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    @Override
    public boolean mo7205o7(float f, float f2) {
        if (this.f24045a0 == 0 || Math.abs(f) < C1357a0.m37544i(150.0f) || ((f <= 0.0f || this.f24045a0 != 1) && (f >= 0.0f || this.f24045a0 != 2))) {
            return false;
        }
        m15751I1(0, true, this.f24045a0, true);
        return true;
    }

    @Override
    public void onClick(View view) {
        if (this.f24040S != null && this.f24043V != null) {
            int id2 = view.getId();
            if (id2 == R.id.btn_acceptOrHangCall) {
                int constructor = this.f24043V.state.getConstructor();
                if (constructor == -975215467 || constructor == -190853167) {
                    this.f24040S.mo15745c5(this.f24043V);
                } else if (constructor != 1073048620) {
                    this.f24040S.mo15743n1(this.f24043V, true);
                } else {
                    TdApi.Call call = this.f24043V;
                    if (call.isOutgoing) {
                        this.f24040S.mo15743n1(call, false);
                    } else {
                        this.f24040S.mo15746K0(call);
                    }
                }
            } else if (id2 == R.id.btn_closeCall) {
                this.f24040S.mo15744j1(this.f24043V);
            } else if (id2 == R.id.btn_declineCall) {
                this.f24040S.mo15743n1(this.f24043V, false);
            }
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f24039R;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m15747N1();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if (this.f24045a0 != 0) {
                    this.f24038Q.m41997a(motionEvent);
                }
                m15751I1(0, true, 0, true);
            } else if (action == 2) {
                float f = x - this.f24044W;
                int i = this.f24045a0;
                if (i == 1) {
                    float targetAcceptX = getTargetAcceptX();
                    m15754E1(Math.min(Math.max(0.0f, f), targetAcceptX) / targetAcceptX, 0, false);
                } else if (i == 2) {
                    float targetDeclineX = getTargetDeclineX();
                    m15754E1(Math.max(Math.min(0.0f, f), targetDeclineX) / targetDeclineX, 1, false);
                }
                if (this.f24045a0 != 0) {
                    this.f24038Q.m41997a(motionEvent);
                }
            } else if (action == 3) {
                if (this.f24045a0 != 0) {
                    this.f24038Q.m41997a(motionEvent);
                }
                m15752G1(0, true);
            }
            return false;
        }
        this.f24045a0 = 0;
        this.f24044W = x;
        if (!this.f24039R) {
            return false;
        }
        if (x >= this.f24035N.getLeft() && x <= this.f24035N.getRight() && y >= this.f24035N.getTop() && y <= this.f24035N.getBottom()) {
            C10552b0 c0 = this.f24042U.m2930B4().m4713c0();
            Context context = getContext();
            C10930q6 q6Var = this.f24042U;
            TdApi.Call call = this.f24043V;
            if (!c0.m4607F(context, q6Var, call, call.userId, this.f24041T)) {
                return true;
            }
            m15752G1(1, true);
            this.f24038Q.m41997a(motionEvent);
            return true;
        } else if (x < this.f24036O.getLeft() || x > this.f24036O.getRight() || y < this.f24036O.getTop() || y > this.f24036O.getBottom()) {
            return false;
        } else {
            m15752G1(2, true);
            this.f24038Q.m41997a(motionEvent);
            return true;
        }
    }

    public void setCallback(AbstractC7518a aVar) {
        this.f24040S = aVar;
    }
}
