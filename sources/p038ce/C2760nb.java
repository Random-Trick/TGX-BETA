package p038ce;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import gd.C4779t2;
import ge.C4862d;
import ge.C4868i;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import me.C6847b2;
import me.C6924j2;
import me.C6941k2;
import me.C6986o3;
import me.C6990p;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.sync.SyncAdapter;
import org.thunderdog.challegram.widget.ViewPager;
import p038ce.AbstractView$OnClickListenerC3371ys;
import p038ce.View$OnClickListenerC2805o4;
import p038ce.x00;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5096a;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5118i;
import p111he.C5120j;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5917i;
import p139jb.AbstractC5918j;
import p139jb.AbstractRunnableC5910b;
import p193nb.C7316a;
import p193nb.C7317b;
import p335xd.C10189d;
import p350yd.AbstractC10650f0;
import p350yd.AbstractC10903p0;
import p350yd.AbstractC11041ub;
import p350yd.C10619e0;
import p350yd.C10882o0;
import p350yd.C10930q6;
import p350yd.C11020tb;
import p364zd.C11524j;
import td.AbstractC9323v4;
import td.AbstractC9376x4;
import td.AbstractC9382y1;
import td.AbstractC9388z1;
import td.C9180e2;
import td.C9188f2;
import td.C9270q1;
import td.C9391z4;
import td.View$OnClickListenerC9156b5;
import td.View$OnClickListenerC9170d1;
import td.View$OnClickListenerC9347w1;

public class C2760nb extends AbstractC9376x4<Void> implements View$OnClickListenerC9347w1.AbstractC9349b, AbstractC11041ub, C5120j.AbstractC5121a, AbstractC10903p0 {
    public long f9348B0;
    public C6990p f9349C0;
    public int f9350D0;
    public boolean f9351E0;
    public View f9352F0;
    public View$OnClickListenerC2805o4 f9354H0;
    public C6986o3 f9355I0;
    public TdApi.LanguagePackInfo f9356J0;
    public C10930q6 f9357K0;
    public String f9358L0;
    public Intent f9359M0;
    public C9180e2 f9360N0;
    public boolean f9361O0;
    public FrameLayoutFix f9362x0;
    public View$OnClickListenerC9347w1 f9363y0;
    public int f9364z0 = 0;
    public int f9347A0 = -1;
    public int f9353G0 = -1;

    public class C2761a implements View$OnClickListenerC9156b5.AbstractC9160d {
        public C2761a() {
        }

        @Override
        public void mo10139a(View view, MotionEvent motionEvent, int i, boolean z) {
            if (!z || C2760nb.this.f9347A0 == -1) {
                C2760nb.this.m33581Ph(-1, motionEvent, view.getMeasuredHeight(), false);
            } else {
                C2760nb nbVar = C2760nb.this;
                nbVar.m33587Mh(nbVar.f9347A0);
                C2760nb.this.m33581Ph(-1, motionEvent, view.getMeasuredHeight(), true);
            }
            C2760nb.this.m33585Nh(view, false);
        }

        @Override
        public void mo10138b(View view, MotionEvent motionEvent, int i) {
            int i2;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            float measuredWidth = x + ((C2760nb.this.f9349C0.getMeasuredWidth() - view.getMeasuredWidth()) / 2);
            float measuredHeight = y - (view.getMeasuredHeight() + C2760nb.this.f9362x0.getTranslationY());
            if (measuredWidth >= 0.0f && measuredWidth < C2760nb.this.f9349C0.getMeasuredWidth()) {
                if (measuredHeight > C2760nb.this.f9349C0.getTop() + C2760nb.this.f9349C0.getChildAt(0).getBottom()) {
                    if (measuredHeight < C2760nb.this.f9349C0.getHeight()) {
                        i2 = 1;
                        while (i2 < C2760nb.this.f9349C0.getChildCount()) {
                            View childAt = C2760nb.this.f9349C0.getChildAt(i2);
                            if (measuredHeight >= childAt.getTop() && measuredHeight < childAt.getBottom() && childAt.getVisibility() != 8) {
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    i2 = 0;
                }
                C2760nb.this.m33581Ph(i2, motionEvent, view.getMeasuredHeight(), false);
            }
            i2 = -1;
            C2760nb.this.m33581Ph(i2, motionEvent, view.getMeasuredHeight(), false);
        }

        @Override
        public void mo10137c(View view, MotionEvent motionEvent, int i) {
            C2760nb.this.m33585Nh(view, true);
        }

        @Override
        public boolean mo10136d(View view, MotionEvent motionEvent, int i) {
            return i == 0 && C2760nb.this.m33557bi();
        }
    }

    public class C2762b extends C6990p {
        public C2762b(Context context, AbstractC9323v4 v4Var, boolean z) {
            super(context, v4Var, z);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C2760nb.this.f9352F0 != null) {
                C2760nb nbVar = C2760nb.this;
                nbVar.m33599Gh(nbVar.f9352F0);
            }
        }
    }

    public class C2763c implements C6986o3.AbstractC6988b {
        public C2763c() {
        }

        @Override
        public void mo18159a(C6986o3 o3Var) {
            if (C2760nb.this.f9355I0 == o3Var) {
                C2760nb.this.f9362x0.removeView(C2760nb.this.f9355I0);
                C2760nb.this.f9355I0.m18165j(C2760nb.this);
                C2760nb.this.f9355I0 = null;
            }
        }

        @Override
        public void mo18158b(C6986o3 o3Var, float f) {
            C2760nb.this.f9363y0.setTranslationY((-o3Var.getMeasuredHeight()) * f);
        }
    }

    public class C2764d extends RecyclerView.AbstractC0910t {
        public float f9368a;
        public float f9369b;
        public final int f9370c;

        public C2764d(int i) {
            this.f9370c = i;
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            float f = this.f9368a + i2;
            this.f9368a = f;
            if (i2 < 0 && this.f9369b - f >= C1357a0.m37534p()) {
                C2760nb.this.m33565Xh(this.f9370c, true);
                this.f9369b = this.f9368a;
            } else if (this.f9368a - this.f9369b > C1357a0.m37533q()) {
                C2760nb.this.m33565Xh(this.f9370c, false);
                this.f9369b = this.f9368a;
            }
            if (Math.abs(this.f9368a - this.f9369b) > C1357a0.m37533q()) {
                this.f9368a = 0.0f;
                this.f9369b = 0.0f;
            }
        }
    }

    public class C2765e implements AbstractView$OnTouchListenerC7889a.AbstractC7900k {
        public final AbstractView$OnTouchListenerC7889a f9372a;

        public C2765e(AbstractView$OnTouchListenerC7889a aVar) {
            this.f9372a = aVar;
        }

        @Override
        public void mo7703f(AbstractView$OnTouchListenerC7889a aVar, boolean z) {
            if (z) {
                this.f9372a.m14413y2(this);
                C2760nb.this.m33575Sh();
            }
        }
    }

    public class C2766f extends AbstractRunnableC5910b {
        public C2766f() {
        }

        @Override
        public void mo1364b() {
            C1379j0.m37292y0(R.string.ProcessingFileWait, 0);
        }
    }

    public class C2767g implements x00.AbstractC3286q {
        public final ArrayList f9375a;
        public final C10930q6 f9376b;
        public final boolean f9377c;

        public C2767g(ArrayList arrayList, C10930q6 q6Var, boolean z) {
            this.f9375a = arrayList;
            this.f9376b = q6Var;
            this.f9377c = z;
        }

        @Override
        public void mo30849a(long j, TdApi.Chat chat, TdApi.MessageSendOptions messageSendOptions, ArrayList<TdApi.Function> arrayList) {
            Iterator it = this.f9375a.iterator();
            ArrayList arrayList2 = null;
            while (it.hasNext()) {
                TdApi.InputMessageContent B = this.f9376b.m2429h5().m23151B((TdApi.InputMessageContent) it.next(), C7316a.m17051j(j));
                if (!this.f9377c) {
                    C4779t2.m25602S4(this.f9376b, j, messageSendOptions, arrayList, B);
                } else if (C4779t2.m25564Z0(B) == 1) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(B);
                    if (arrayList2.size() == 10) {
                        C4779t2.m25608R4(this.f9376b, j, messageSendOptions, arrayList, arrayList2);
                    }
                } else {
                    C4779t2.m25608R4(this.f9376b, j, messageSendOptions, arrayList, arrayList2);
                    C4779t2.m25602S4(this.f9376b, j, messageSendOptions, arrayList, B);
                }
            }
            if (this.f9377c) {
                C4779t2.m25608R4(this.f9376b, j, messageSendOptions, arrayList, arrayList2);
            }
        }

        @Override
        public CharSequence mo30848b(long j) {
            Iterator it = this.f9375a.iterator();
            while (it.hasNext()) {
                C10930q6 q6Var = this.f9376b;
                CharSequence W5 = q6Var.m2599W5(q6Var.m2771L3(j), (TdApi.InputMessageContent) it.next());
                if (W5 != null) {
                    return W5;
                }
            }
            return null;
        }
    }

    public C2760nb(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public boolean m33611Ah(TdApi.LanguagePackInfo languagePackInfo, final String str, View view, int i) {
        if (i == R.id.btn_cancel) {
            C4868i.m24726c2().m24550y5(str);
        } else if (i == R.id.btn_done) {
            this.f30167b.m2757M1(languagePackInfo, new AbstractC5917i() {
                @Override
                public final void mo1322a(boolean z) {
                    C2760nb.m33530zh(str, z);
                }
            }, true);
        } else if (i == R.id.btn_languageSettings) {
            C4868i.m24726c2().m24550y5(str);
            m9291ac(new View$OnClickListenerC2355ev(this.f30165a, this.f30167b));
        }
        return true;
    }

    public void m33609Bh(final TdApi.LanguagePackInfo languagePackInfo, Map map, final String str) {
        TdApi.LanguagePackInfo languagePackInfo2;
        if (!m9347Sa() && (languagePackInfo2 = this.f9356J0) != null && languagePackInfo.f25405id.equals(languagePackInfo2.f25405id)) {
            C5320c cVar = new C5320c(3);
            C5146u0 u0Var = new C5146u0(3);
            C5320c cVar2 = new C5320c(3);
            C5320c cVar3 = new C5320c(3);
            cVar.m23284a(R.id.btn_done);
            u0Var.m23815b(C4779t2.m25453p0(map, C4403w.m27885e1(R.string.language_continueInLanguage), C3296xa.f11006a));
            cVar2.m23284a(3);
            cVar3.m23284a(R.drawable.baseline_check_24);
            cVar.m23284a(R.id.btn_cancel);
            cVar3.m23284a(R.drawable.baseline_cancel_24);
            cVar2.m23284a(1);
            u0Var.m23816a(R.string.Cancel);
            cVar.m23284a(R.id.btn_languageSettings);
            u0Var.m23816a(R.string.MoreLanguages);
            cVar2.m23284a(1);
            cVar3.m23284a(R.drawable.baseline_language_24);
            C6924j2 ee2 = m9261ee(C1363c0.m37425l(this, C4779t2.m25453p0(map, C4403w.m27885e1(R.string.language_continueInLanguagePopupText), C3343ya.f11114a), null), cVar.m23280e(), u0Var.m23813d(), cVar2.m23280e(), cVar3.m23280e(), new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean Ah;
                    Ah = C2760nb.this.m33611Ah(languagePackInfo, str, view, i);
                    return Ah;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i) {
                    return C5115g0.m23934b(this, i);
                }
            });
            if (ee2 != null) {
                ee2.setDisableCancelOnTouchDown(true);
            }
            this.f9356J0 = null;
        }
    }

    public void m33607Ch(String[] strArr, final TdApi.LanguagePackInfo languagePackInfo, final String str, final Map map) {
        if (map == null || map.size() < strArr.length) {
            Log.m14709w("Suggested language is bad, ignoring. languagePackId:%s", languagePackInfo.f25405id);
            TdApi.LanguagePackInfo languagePackInfo2 = this.f9356J0;
            if (languagePackInfo2 != null && languagePackInfo.f25405id.equals(languagePackInfo2.f25405id)) {
                this.f9356J0 = null;
                return;
            }
            return;
        }
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C2760nb.this.m33609Bh(languagePackInfo, map, str);
            }
        });
    }

    public void m33605Dh(int i, SparseIntArray sparseIntArray) {
        SyncAdapter.m14203e(this.f30165a, this.f30167b, true);
    }

    public void m33603Eh(C6924j2 j2Var) {
        this.f9360N0 = null;
    }

    public static boolean m33601Fh(C9180e2 e2Var, View view, boolean z) {
        int N0;
        if (!z || (N0 = e2Var.f29637a.m34224N0(R.id.btn_neverAllow)) == -1 || !e2Var.f29637a.m34240F0().get(N0).m32873D()) {
            return false;
        }
        C4868i.m24726c2().m24582u2(128L);
        return false;
    }

    public static String m33591Kh(Intent intent) {
        CharSequence charSequenceExtra;
        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
        if (stringExtra == null && (charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.TEXT")) != null) {
            stringExtra = charSequenceExtra.toString();
        }
        return m33547lh(intent.getStringExtra("android.intent.extra.SUBJECT"), stringExtra);
    }

    public static boolean m33554eh(p350yd.C10930q6 r19, java.util.ArrayList<org.drinkless.p210td.libcore.telegram.TdApi.InputMessageContent> r20, java.lang.String r21, android.net.Uri r22, java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.C2760nb.m33554eh(yd.q6, java.util.ArrayList, java.lang.String, android.net.Uri, java.lang.String):boolean");
    }

    public static String m33547lh(String str, String str2) {
        if (C5070i.m24061i(str2) && C5070i.m24061i(str)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(C5070i.m24054p(str2) + 1 + C5070i.m24054p(str));
        if (!C5070i.m24061i(str) && (C5070i.m24061i(str2) || str2.startsWith("https://") || str2.startsWith("http://"))) {
            sb2.append(str);
        }
        if (!C5070i.m24061i(str2)) {
            if (sb2.length() > 0) {
                sb2.append('\n');
            }
            sb2.append(str2);
        }
        String trim = sb2.toString().trim();
        if (trim.isEmpty()) {
            return null;
        }
        return trim;
    }

    public void m33545nh() {
        C6990p pVar;
        if (!m9347Sa() && (pVar = this.f9349C0) != null) {
            pVar.getChildAt(1).setVisibility(this.f30167b.m2348m6() ? 0 : 8);
        }
    }

    public void m33544oh(int i, View$OnClickListenerC2805o4 o4Var) {
        if (this.f9353G0 == i && this.f9354H0 == o4Var) {
            m33553fh(i);
            m8836ug(0, true);
        }
    }

    public static void m33543ph(View view) {
    }

    public void m33542qh(C10930q6 q6Var, ArrayList arrayList, boolean z) {
        x00 x00Var = new x00(this.f30165a, q6Var);
        x00Var.m30994Vi(new x00.C3281m(new C2767g(arrayList, q6Var, z)).m30885D(true));
        x00Var.m30960ej();
    }

    public void m33541rh(final C10930q6 q6Var, final ArrayList arrayList, final boolean z) {
        q6Var.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                C2760nb.this.m33542qh(q6Var, arrayList, z);
            }
        });
    }

    public void m33540sh(final C10930q6 q6Var, final ArrayList arrayList, final boolean z) {
        q6Var.m2573Y1(new Runnable() {
            @Override
            public final void run() {
                C2760nb.this.m33541rh(q6Var, arrayList, z);
            }
        });
    }

    public void m33539th(int i, boolean z) {
        if (z) {
            m33575Sh();
        } else {
            C1379j0.m37292y0(R.string.NoStorageAccess, 0);
        }
    }

    public void m33538uh(java.lang.String r7, p350yd.C10930q6 r8, android.content.Intent r9) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.C2760nb.m33538uh(java.lang.String, yd.q6, android.content.Intent):void");
    }

    public void m33537vh(final C4868i.C4874f fVar) {
        if (m9339Ta() && !m9347Sa() && !this.f30165a.m14414y1()) {
            m9261ee(C4403w.m27853m1(R.string.EmojiSetUpdated, fVar.f16661M), new int[]{R.id.btn_downloadFile, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.EmojiSetUpdate), C4403w.m27869i1(R.string.Cancel)}, new int[]{3, 1}, new int[]{R.drawable.baseline_sync_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean wh;
                    wh = C2760nb.this.m33536wh(fVar, view, i);
                    return wh;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i) {
                    return C5115g0.m23934b(this, i);
                }
            });
        }
    }

    public boolean m33536wh(C4868i.C4874f fVar, View view, int i) {
        if (i == R.id.btn_cancel) {
            C4868i.m24726c2().m24769W3();
            return true;
        } else if (i != R.id.btn_downloadFile) {
            return true;
        } else {
            C3411zs zsVar = new C3411zs(this.f30165a, this.f30167b);
            zsVar.m9476Ad(new AbstractView$OnClickListenerC3371ys.C3374c(fVar));
            m9291ac(zsVar);
            return true;
        }
    }

    public static void m33530zh(String str, boolean z) {
        if (z) {
            C1379j0.m37292y0(R.string.language_appliedLanguage, 0);
            C4868i.m24726c2().m24550y5(str);
        }
    }

    @Override
    public int mo408A9() {
        return 2;
    }

    @Override
    public void mo9477Ac() {
        super.mo9477Ac();
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        if (d1Var != null) {
            d1Var.m10063d4(mo418W9());
        }
        m33551hh();
    }

    @Override
    public void mo23887F0(long j, long j2) {
        C5118i.m23933a(this, j, j2);
    }

    @Override
    public void mo1779G0(boolean z) {
        C11020tb.m1988a(this, z);
    }

    @Override
    public View mo8868Ga() {
        return this.f9362x0;
    }

    @Override
    public boolean mo9431Ge() {
        return true;
    }

    public final void m33599Gh(View view) {
        if (this.f9349C0 != null) {
            this.f9352F0 = view;
            int left = view.getLeft();
            View view2 = view;
            do {
                view2 = (View) view2.getParent();
                if (view2 == null) {
                    break;
                }
                left += view2.getLeft();
            } while (view2 != this.f30408v0);
            this.f9349C0.setTranslationX(Math.max(-C1357a0.m37541i(14.0f), (left - (this.f9349C0.getMeasuredWidth() / 2)) + (view.getMeasuredWidth() / 2)));
        }
    }

    public final void m33597Hh() {
        this.f30167b.m2930B4().m4697g0();
        this.f30167b.m2946A4().m1370u0(mo4347s(), false, null);
    }

    @Override
    public void mo23886I6(int i, int i2, boolean z) {
        if (i == 4) {
            m33589Lh(z, false);
            return;
        }
        C6986o3 o3Var = this.f9355I0;
        if (o3Var != null) {
            o3Var.m18168g(m9339Ta());
        }
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        View$OnClickListenerC9347w1 w1Var = this.f9363y0;
        if (w1Var != null) {
            w1Var.m9071X1();
        }
        m33551hh();
    }

    public final void m33595Ih(AbstractC9323v4<?> v4Var, int i) {
        if (v4Var instanceof AbstractC9388z1) {
            v4Var.get();
            ((AbstractC9388z1) v4Var).mo8809n2().m39422k(new C2764d(i));
        }
    }

    @Override
    public void mo419J(int i, View view) {
        if (i == R.id.menu_btn_clear) {
            m9341T8();
        } else if (i != R.id.menu_btn_search) {
            super.mo419J(i, view);
        } else {
            m9303Yc();
        }
    }

    public final View$OnClickListenerC2805o4 m33593Jh(int i, boolean z) {
        AbstractC10650f0 f0Var;
        View$OnClickListenerC2805o4 kk = new View$OnClickListenerC2805o4(this.f30165a, this.f30167b).m33339kk(this);
        TdApi.ChatListArchive chatListArchive = null;
        if (i == 2) {
            f0Var = C10619e0.m4434l(this.f30167b);
        } else if (i == 3) {
            f0Var = C10619e0.m4437i(this.f30167b);
        } else if (i == 4) {
            f0Var = C10619e0.m4439g(this.f30167b);
        } else if (i != 5) {
            f0Var = i != 6 ? null : C10619e0.m4433m(this.f30167b);
        } else {
            f0Var = C10619e0.m4440f(this.f30167b);
        }
        if (f0Var != null) {
            View$OnClickListenerC2805o4.C2813h hVar = new View$OnClickListenerC2805o4.C2813h(f0Var);
            if (z) {
                chatListArchive = C7317b.f23225b;
            }
            kk.m33354hk(hVar.m33266a(chatListArchive).m33265b(true));
        } else if (z) {
            kk.m33354hk(new View$OnClickListenerC2805o4.C2813h(C7317b.f23225b).m33265b(true));
        }
        return kk;
    }

    public final void m33589Lh(boolean z, boolean z2) {
        if (this.f9355I0 == null) {
            C6986o3 o3Var = new C6986o3(this.f30165a);
            this.f9355I0 = o3Var;
            o3Var.m18163l(new C2763c());
            this.f9355I0.m18169f(this);
            this.f9355I0.m18162m(C4403w.m27869i1(R.string.AppUpdateReady));
            this.f9362x0.addView(this.f9355I0);
        }
        C6986o3 o3Var2 = this.f9355I0;
        String i1 = C4403w.m27869i1(z ? R.string.AppUpdateInstall : R.string.AppUpdateRestart);
        final C5120j b0 = mo4347s().m14510b0();
        Objects.requireNonNull(b0);
        Runnable waVar = new Runnable() {
            @Override
            public final void run() {
                C5120j.this.m23897q();
            }
        };
        boolean z3 = true;
        o3Var2.m18164k(i1, waVar, !z);
        C6986o3 o3Var3 = this.f9355I0;
        if (z2 || !m9339Ta()) {
            z3 = false;
        }
        o3Var3.m18161n(z3);
    }

    public final void m33587Mh(final int i) {
        int i2 = this.f9350D0;
        if ((i2 == i && (i != 0 || !this.f9351E0)) || (this.f9351E0 && i2 == 0 && i == 1)) {
            m33552gh();
            m8836ug(0, true);
        } else if (this.f9353G0 != i) {
            m33552gh();
            if (i == 0) {
                m33583Oh(false);
            } else {
                if (i == 1) {
                    if (this.f9350D0 != 0) {
                        m33583Oh(true);
                    } else {
                        m33583Oh(!this.f9351E0);
                        i = this.f9350D0;
                    }
                }
                final View$OnClickListenerC2805o4 Jh = m33593Jh(i, this.f9351E0);
                this.f9354H0 = Jh;
                this.f9353G0 = i;
                Jh.m9255fd(new Runnable() {
                    @Override
                    public final void run() {
                        C2760nb.this.m33544oh(i, Jh);
                    }
                });
                m33595Ih(Jh, 0);
            }
            i = 0;
            final View$OnClickListenerC2805o4 Jh2 = m33593Jh(i, this.f9351E0);
            this.f9354H0 = Jh2;
            this.f9353G0 = i;
            Jh2.m9255fd(new Runnable() {
                @Override
                public final void run() {
                    C2760nb.this.m33544oh(i, Jh2);
                }
            });
            m33595Ih(Jh2, 0);
        }
    }

    public final void m33585Nh(View view, boolean z) {
        if (z || this.f9349C0 != null) {
            FrameLayoutFix frameLayoutFix = null;
            int i = 0;
            boolean z2 = true;
            if (this.f9349C0 == null) {
                C2762b bVar = new C2762b(this.f30165a, this, true);
                this.f9349C0 = bVar;
                int i2 = -2;
                bVar.setLayoutParams(FrameLayoutFix.m18008s1(-2, -2));
                int i3 = 7;
                int[] iArr = {R.string.CategoryMain, R.string.CategoryArchive, R.string.CategoryPrivate, R.string.CategoryGroup, R.string.CategoryChannels, R.string.CategoryBots, R.string.CategoryUnread};
                C6990p pVar = this.f9349C0;
                pVar.setPadding(pVar.getPaddingLeft(), this.f9349C0.getPaddingTop() + C1357a0.m37541i(14.0f), this.f9349C0.getPaddingRight(), this.f9349C0.getPaddingBottom() + C1357a0.m37541i(13.0f));
                this.f9349C0.setMinimumWidth(C1357a0.m37541i(112.0f));
                int i4 = 0;
                int i5 = 0;
                while (i4 < i3) {
                    int i6 = iArr[i4];
                    TextView b2Var = new C6847b2(this.f30165a);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, i2);
                    layoutParams.gravity = 1;
                    b2Var.setId(R.id.btn_send);
                    b2Var.setLayoutParams(layoutParams);
                    b2Var.setTextSize(1, 15.0f);
                    int i7 = this.f9350D0 == i5 ? R.id.theme_color_textNeutral : R.id.theme_color_textLight;
                    b2Var.setTextColor(C11524j.m228N(i7));
                    b2Var.setGravity(17);
                    b2Var.setPadding(C1357a0.m37541i(18.0f), C1357a0.m37541i(13.0f), C1357a0.m37541i(18.0f), C1357a0.m37541i(14.0f));
                    m9119z8(b2Var, i7);
                    b2Var.setTypeface(C1389o.m37260i());
                    b2Var.setTag(Integer.valueOf(i5));
                    b2Var.setOnClickListener(View$OnClickListenerC3048sa.f10238a);
                    C1399s0.m37175j0(b2Var, C4403w.m27869i1(m9368P8(i6, b2Var, false, true)));
                    C10189d.m5795i(b2Var);
                    this.f9349C0.addView(b2Var);
                    i5++;
                    i4++;
                    i3 = 7;
                    i2 = -2;
                }
                this.f9362x0.addView(this.f9349C0, 1);
                frameLayoutFix = this.f9362x0;
                this.f30167b.m2781K9().m1823p(this);
            }
            if (z) {
                this.f9349C0.getChildAt(1).setVisibility(this.f30167b.m2348m6() ? 0 : 8);
                if (this.f30167b.m2897D5().f33874b <= 0 && this.f9350D0 != 6) {
                    z2 = false;
                }
                View childAt = this.f9349C0.getChildAt(6);
                if (!z2) {
                    i = 8;
                }
                childAt.setVisibility(i);
                m33599Gh(view);
            }
            this.f9349C0.m18150f(z, frameLayoutFix);
        }
    }

    public final void m33583Oh(boolean z) {
        if (this.f9351E0 != z) {
            this.f9351E0 = z;
        }
    }

    public final void m33581Ph(int i, MotionEvent motionEvent, float f, boolean z) {
        int i2 = this.f9347A0;
        if (i2 != i) {
            if (i2 != -1) {
                View childAt = this.f9349C0.getChildAt(i2);
                childAt.dispatchTouchEvent(MotionEvent.obtain(this.f9348B0, motionEvent.getEventTime(), z ? 1 : 3, motionEvent.getX(), (motionEvent.getY() - f) - childAt.getTop(), motionEvent.getMetaState()));
            }
            this.f9347A0 = i;
            if (i != -1) {
                View childAt2 = this.f9349C0.getChildAt(i);
                long uptimeMillis = SystemClock.uptimeMillis();
                this.f9348B0 = uptimeMillis;
                childAt2.dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, motionEvent.getEventTime(), 0, motionEvent.getX(), (motionEvent.getY() - f) - childAt2.getTop(), motionEvent.getMetaState()));
            }
        } else if (i != -1) {
            View childAt3 = this.f9349C0.getChildAt(i2);
            childAt3.dispatchTouchEvent(MotionEvent.obtain(this.f9348B0, motionEvent.getEventTime(), 2, motionEvent.getX(), (motionEvent.getY() - f) - childAt3.getTop(), motionEvent.getMetaState()));
        }
    }

    @Override
    public void mo1778Q2(TdApi.SuggestedAction[] suggestedActionArr, TdApi.SuggestedAction[] suggestedActionArr2) {
        C11020tb.m1985d(this, suggestedActionArr, suggestedActionArr2);
    }

    public final void m33579Qh(final C10930q6 q6Var, String str, final ArrayList<TdApi.InputMessageContent> arrayList, final boolean z) {
        if (!arrayList.isEmpty()) {
            q6Var.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C2760nb.this.m33540sh(q6Var, arrayList, z);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Unsupported content type: " + str);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_main;
    }

    public void m33577Rh(C10930q6 q6Var, String str, Intent intent) {
        this.f9357K0 = q6Var;
        this.f9358L0 = str;
        this.f9359M0 = intent;
        m33575Sh();
    }

    @Override
    public void mo2963S(TdApi.ChatList chatList, int i, int i2) {
        C10882o0.m2965b(this, chatList, i, i2);
    }

    @Override
    public boolean mo8863S8(C9270q1 q1Var, float f, float f2) {
        if (!super.mo8863S8(q1Var, f, f2)) {
            return false;
        }
        if (this.f30408v0 == null || f2 >= View$OnClickListenerC9170d1.m10066c3(true) || f2 < View$OnClickListenerC9170d1.getTopOffset() || f >= ((View) this.f30408v0).getMeasuredWidth()) {
            return true;
        }
        return !((C9391z4) this.f30408v0).m8807D1();
    }

    public final void m33575Sh() {
        final C10930q6 q6Var = this.f9357K0;
        final Intent intent = this.f9359M0;
        final String str = this.f9358L0;
        if (intent != null) {
            AbstractView$OnTouchListenerC7889a s = mo4347s();
            if (s.m14414y1()) {
                s.m14530V(new C2765e(s));
            } else if (Build.VERSION.SDK_INT < 23 || mo4347s().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                this.f9357K0 = null;
                this.f9359M0 = null;
                this.f9358L0 = null;
                new Thread(new Runnable() {
                    @Override
                    public final void run() {
                        C2760nb.this.m33538uh(str, q6Var, intent);
                    }
                }).start();
            } else {
                mo4347s().m14575J2(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, new AbstractC5096a() {
                    @Override
                    public final void mo4252o1(int i, boolean z) {
                        C2760nb.this.m33539th(i, z);
                    }
                });
            }
        }
    }

    public final void m33573Th(C10930q6 q6Var, Intent intent) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        ArrayList<TdApi.InputMessageContent> arrayList = new ArrayList<>(parcelableArrayListExtra.size());
        String type = intent.getType();
        String Kh = m33591Kh(intent);
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            Parcelable parcelable = (Parcelable) it.next();
            Uri Y0 = C7389v0.m16663Y0(parcelable);
            if (Y0 == null) {
                throw new IllegalArgumentException("Unknown parcelable type: " + parcelable);
            } else if (m33554eh(q6Var, arrayList, type, Y0, Kh)) {
                Kh = null;
            }
        }
        if (!C5070i.m24061i(Kh)) {
            arrayList.add(0, new TdApi.InputMessageText(new TdApi.FormattedText(Kh, null), false, false));
        }
        m33579Qh(q6Var, type, arrayList, true);
    }

    public final void m33571Uh(C10930q6 q6Var, Intent intent) {
        String type = intent.getType();
        ArrayList<TdApi.InputMessageContent> arrayList = new ArrayList<>();
        if (C5070i.m24061i(type) || !"text/x-vcard".equals(type)) {
            String Kh = m33591Kh(intent);
            Uri Y0 = C7389v0.m16663Y0(intent.getParcelableExtra("android.intent.extra.STREAM"));
            if (Y0 != null) {
                if (C7389v0.m16596p1(Y0)) {
                    throw new IllegalArgumentException("Tried to share internal file: " + Y0.toString());
                } else if (m33554eh(q6Var, arrayList, type, Y0, Kh)) {
                    Kh = null;
                }
            }
            if (!C5070i.m24061i(Kh)) {
                arrayList.add(0, new TdApi.InputMessageText(new TdApi.FormattedText(Kh, null), false, false));
            }
        } else {
            Uri uri = (Uri) intent.getExtras().get("android.intent.extra.STREAM");
            if (uri != null) {
                InputStream openInputStream = C1379j0.m37309q().getContentResolver().openInputStream(uri);
                try {
                    if (openInputStream != null) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openInputStream, C5070i.f17083a));
                        boolean z = false;
                        String str = null;
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            String[] split = readLine.split(":");
                            int i = 2;
                            if (split.length == 2) {
                                boolean z2 = true;
                                if (split[0].equals("BEGIN") && split[1].equals("VCARD")) {
                                    z = true;
                                    str = null;
                                } else if (split[0].equals("END") && split[1].equals("VCARD")) {
                                    z = false;
                                }
                                if (z) {
                                    if (!split[0].startsWith("FN") && (!split[0].startsWith("ORG") || !C5070i.m24061i(str))) {
                                        if (split[0].startsWith("TEL")) {
                                            String D = C1363c0.m37470D(split[1]);
                                            if (!D.isEmpty()) {
                                                if (!arrayList.isEmpty()) {
                                                    Iterator<TdApi.InputMessageContent> it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        TdApi.InputMessageContent next = it.next();
                                                        if ((next instanceof TdApi.InputMessageContact) && C5070i.m24067c(((TdApi.InputMessageContact) next).contact.phoneNumber, D)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                z2 = false;
                                                if (!z2) {
                                                    arrayList.add(new TdApi.InputMessageContact(new TdApi.Contact(D, str, null, null, 0L)));
                                                }
                                            }
                                        }
                                    }
                                    String str2 = "UTF-8";
                                    String[] split2 = split[0].split(";");
                                    int length = split2.length;
                                    int i2 = 0;
                                    String str3 = null;
                                    while (i2 < length) {
                                        String[] split3 = split2[i2].split("=");
                                        if (split3.length == i) {
                                            if (split3[0].equals("CHARSET")) {
                                                str2 = split3[1];
                                            } else if (split3[0].equals("ENCODING")) {
                                                str3 = split3[1];
                                            }
                                        }
                                        i2++;
                                        i = 2;
                                    }
                                    String str4 = split[1];
                                    if (str3 != null && str3.equalsIgnoreCase("QUOTED-PRINTABLE")) {
                                        while (str4.endsWith("=")) {
                                            str4 = str4.substring(0, str4.length() - 1);
                                            String readLine2 = bufferedReader.readLine();
                                            if (readLine2 == null) {
                                                break;
                                            }
                                            str4 = str4 + readLine2;
                                        }
                                        byte[] S = C7389v0.m16686S(str4.getBytes());
                                        if (!(S == null || S.length == 0)) {
                                            str4 = new String(S, str2);
                                        }
                                    }
                                    str = str4;
                                }
                            }
                        }
                        bufferedReader.close();
                        if (arrayList.isEmpty()) {
                            C1379j0.m37290z0("No phone number available to share", 0);
                            openInputStream.close();
                            return;
                        }
                        openInputStream.close();
                    } else {
                        throw new IllegalArgumentException("stream == null (vcard)");
                    }
                } catch (Throwable th) {
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("uri == null");
            }
        }
        m33579Qh(q6Var, type, arrayList, false);
    }

    @Override
    public boolean mo9325Va() {
        View$OnClickListenerC9347w1 w1Var = this.f9363y0;
        return w1Var != null && w1Var.m9077Q1();
    }

    public boolean m33569Vh(AbstractC9323v4<?> v4Var) {
        if (m9382Na()) {
            return false;
        }
        if (v4Var != null && m8858cg() != v4Var) {
            return false;
        }
        this.f9363y0.m9074U1();
        return true;
    }

    @Override
    public int mo418W9() {
        return R.id.menu_main;
    }

    public final boolean m33567Wh() {
        final C4868i.C4874f r1 = C4868i.m24726c2().m24607r1();
        if (r1 == null) {
            return false;
        }
        this.f30167b.m2485dd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                C2760nb.this.m33537vh(r1);
            }
        }, 100L);
        return true;
    }

    public final boolean m33565Xh(int i, boolean z) {
        View$OnClickListenerC2805o4 jh;
        if (m8857dg() != i) {
            return false;
        }
        if (z) {
            return m33569Vh(null);
        }
        if (m8857dg() == 0 && (jh = m33549jh()) != null && jh.m33298ti()) {
            return false;
        }
        this.f9363y0.m9081L1();
        return true;
    }

    public final boolean m33563Yh() {
        final String Dc = this.f30167b.m2890Dc();
        final TdApi.LanguagePackInfo X5 = C4868i.m24726c2().m24760X5(Dc, this.f30167b);
        if (X5 == null) {
            this.f9356J0 = null;
            return false;
        }
        TdApi.LanguagePackInfo languagePackInfo = this.f9356J0;
        if (languagePackInfo != null && languagePackInfo.f25405id.equals(X5.f25405id)) {
            return true;
        }
        this.f9356J0 = X5;
        final String[] A0 = C4403w.m28010A0(new int[]{R.string.language_continueInLanguage, R.string.language_continueInLanguagePopupText, R.string.language_appliedLanguage});
        this.f30167b.m2508c6(X5, A0, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                C2760nb.this.m33607Ch(A0, X5, Dc, (Map) obj);
            }
        });
        return true;
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f30167b.m2781K9().m1898V(this);
        mo4347s().m14510b0().m23916K(this);
        this.f30167b.m2781K9().m1892X(this);
    }

    public final void m33561Zh() {
        if (!m33563Yh()) {
            m33567Wh();
        }
    }

    public final void m33559ai() {
        C6924j2 j2Var;
        if (!this.f9361O0) {
            C9180e2 e2Var = this.f9360N0;
            if ((e2Var == null || (j2Var = e2Var.f29641e) == null || j2Var.m18446A2()) && C4868i.m24726c2().m24763X2(128L)) {
                C9180e2 me2 = m9206me(new C9188f2(R.id.btn_notificationSettings).m10003j(new AbstractC9323v4.AbstractC9343r() {
                    @Override
                    public final void mo1773l6(int i, SparseIntArray sparseIntArray) {
                        C2760nb.this.m33605Dh(i, sparseIntArray);
                    }
                }).m10006g(new C6924j2.AbstractC6930f() {
                    @Override
                    public void mo3000j2(C6924j2 j2Var2) {
                        C6941k2.m18400a(this, j2Var2);
                    }

                    @Override
                    public final void mo2999y4(C6924j2 j2Var2) {
                        C2760nb.this.m33603Eh(j2Var2);
                    }
                }).m10000m(C2242cb.f7815a).m10009d(R.string.NotificationSyncDecline).m9995r(R.string.NotificationSyncAccept).m10010c(false).m9997p(new C2964ra[]{new C2964ra(12, (int) R.id.btn_neverAllow, 0, (int) R.string.NeverShowAgain, false)}).m10011b(C4403w.m27982H0(this, R.string.NotificationSyncOffWarn, new Object[0])));
                this.f9360N0 = me2;
                if (me2 != null) {
                    this.f9361O0 = true;
                }
            }
        }
    }

    public final boolean m33557bi() {
        return true;
    }

    @Override
    public boolean mo9270dc() {
        AbstractC9323v4<?> bg = m8859bg(0);
        return bg == null || bg.mo9270dc();
    }

    @Override
    public boolean mo9070f4(int i, View view) {
        View$OnClickListenerC9347w1 w1Var;
        if (i != R.id.user) {
            switch (i) {
                case R.id.btn_float_addContact:
                    m9291ac(new View$OnClickListenerC2393fk(this.f30165a, this.f30167b).m34654vg(2));
                    return true;
                case R.id.btn_float_call:
                    RunnableC2374f5 f5Var = new RunnableC2374f5(this.f30165a, this.f30167b);
                    f5Var.m34725zg(8);
                    m9291ac(f5Var);
                    return true;
                case R.id.btn_float_compose:
                    C9270q1 q1Var = this.f30158T;
                    if (q1Var == null || this.f30156R == null || q1Var.m9742S() || this.f30156R.m10040o3() || (w1Var = this.f9363y0) == null) {
                        return false;
                    }
                    w1Var.m9072W1();
                    return false;
                case R.id.btn_float_newChannel:
                    m9291ac(new C2523i5(this.f30165a, this.f30167b));
                    return true;
                case R.id.btn_float_newChat:
                    RunnableC2374f5 f5Var2 = new RunnableC2374f5(this.f30165a, this.f30167b);
                    f5Var2.m34725zg(4);
                    m9291ac(f5Var2);
                    return true;
                case R.id.btn_float_newGroup:
                    RunnableC2374f5 f5Var3 = new RunnableC2374f5(this.f30165a, this.f30167b);
                    f5Var3.m34725zg(3);
                    m9291ac(f5Var3);
                    return true;
                case R.id.btn_float_newSecretChat:
                    RunnableC2374f5 f5Var4 = new RunnableC2374f5(this.f30165a, this.f30167b);
                    f5Var4.m34725zg(6);
                    m9291ac(f5Var4);
                    return true;
                default:
                    return true;
            }
        } else {
            TdApi.User user = (TdApi.User) view.getTag();
            if (user == null) {
                return true;
            }
            this.f30167b.m2485dd().m3439u7(this, user.f25439id, null);
            return true;
        }
    }

    @Override
    public int mo8855fg() {
        int i = C1357a0.m37541i(56.0f);
        return C4862d.m24934w().m24933x() ? i + C1357a0.m37541i(28.0f) : i;
    }

    public final void m33553fh(int i) {
        if (this.f9353G0 == i) {
            this.f9353G0 = -1;
            AbstractC9323v4<?> v4Var = this.f9354H0;
            this.f9354H0 = null;
            ((TextView) this.f9349C0.getChildAt(1)).setTextColor(this.f9351E0 ? C11524j.m228N(R.id.theme_color_textNeutral) : C11524j.m213U0());
            TextView textView = (TextView) this.f9349C0.getChildAt(this.f9350D0);
            textView.setTextColor(C11524j.m213U0());
            m9180qd(textView);
            m9480A8(textView);
            this.f9350D0 = i;
            TextView textView2 = (TextView) this.f9349C0.getChildAt(i);
            textView2.setTextColor((this.f9350D0 != 0 || !this.f9351E0) ? C11524j.m228N(R.id.theme_color_textNeutral) : C11524j.m213U0());
            m9180qd(textView2);
            m9119z8(textView2, R.id.theme_color_textNeutral);
            this.f30408v0.getTopView().m10155X1(0, C4403w.m27869i1(m33548kh()).toUpperCase());
            m8839sg(0, v4Var);
            if (m8857dg() == 0) {
                m33569Vh(null);
            }
        }
    }

    @Override
    public void mo1777g(String str, TdApi.LanguagePackInfo languagePackInfo) {
        if (m9339Ta()) {
            m33561Zh();
        }
    }

    @Override
    public int mo8854gg() {
        return 2;
    }

    public final void m33552gh() {
        View$OnClickListenerC2805o4 o4Var = this.f9354H0;
        if (o4Var != null) {
            o4Var.mo417Z8();
            this.f9354H0 = null;
        }
        this.f9353G0 = -1;
    }

    @Override
    public String[] mo8852hg() {
        return new String[]{C4403w.m27869i1(m33548kh()).toUpperCase(), C4403w.m27869i1(R.string.Calls).toUpperCase()};
    }

    public final void m33551hh() {
        int i;
        AbstractC9382y1 y1Var = this.f30408v0;
        if (y1Var != null) {
            RecyclerView recyclerView = ((C9391z4) y1Var).getRecyclerView();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) recyclerView.getLayoutParams();
            int fg = mo8855fg();
            if (C4403w.m27984G2()) {
                i = fg;
                fg = C1357a0.m37541i(56.0f);
            } else {
                i = C1357a0.m37541i(56.0f);
            }
            if (layoutParams.rightMargin != fg || layoutParams.leftMargin != i) {
                layoutParams.leftMargin = i;
                layoutParams.rightMargin = fg;
                recyclerView.setLayoutParams(layoutParams);
            }
        }
    }

    public final void m33550ih() {
        if (this.f30167b.m2440ga().m3094p1()) {
            m33559ai();
        } else {
            m33546mh();
        }
    }

    @Override
    public boolean mo404jc(boolean z) {
        View$OnClickListenerC9347w1 w1Var = this.f9363y0;
        if (w1Var == null || !w1Var.m9077Q1()) {
            return m8838tg();
        }
        this.f9363y0.m9083I1();
        return true;
    }

    public final View$OnClickListenerC2805o4 m33549jh() {
        return (View$OnClickListenerC2805o4) m8859bg(0);
    }

    @Override
    public void mo9222kc() {
        super.mo9222kc();
        View$OnClickListenerC9347w1 w1Var = this.f9363y0;
        if (w1Var != null) {
            w1Var.m9083I1();
        }
    }

    public final int m33548kh() {
        if (this.f9351E0) {
            int i = this.f9350D0;
            return i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? R.string.CategoryArchive : R.string.CategoryArchiveUnread : R.string.CategoryArchiveBots : R.string.CategoryArchiveChannels : R.string.CategoryArchiveGroup : R.string.CategoryArchivePrivate;
        }
        int i2 = this.f9350D0;
        return i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 6 ? R.string.Chats : R.string.CategoryUnread : R.string.CategoryBots : R.string.CategoryChannels : R.string.CategoryGroup : R.string.CategoryPrivate;
    }

    @Override
    public int mo415la() {
        return R.id.menu_clear;
    }

    @Override
    public boolean mo9547lf(TdApi.Chat chat) {
        View$OnClickListenerC2805o4 jh = m33549jh();
        AbstractC10650f0 fi = jh != null ? jh.m33366fi() : null;
        return (fi == null || !fi.mo4377k6()) ? super.mo9547lf(chat) : fi.mo1511a(chat);
    }

    @Override
    public AbstractC9323v4<?> mo8846mg(Context context, int i) {
        AbstractC9323v4<?> v4Var;
        if (i == 0) {
            v4Var = m33593Jh(this.f9350D0, this.f9351E0);
        } else if (i == 1) {
            v4Var = new View$OnClickListenerC2849p(this.f30165a, this.f30167b);
        } else if (i == 2) {
            v4Var = new View$OnClickListenerC2928qj(this.f30165a, this.f30167b);
        } else {
            throw new IllegalArgumentException("position == " + i);
        }
        m33595Ih(v4Var, i);
        return v4Var;
    }

    public final void m33546mh() {
        C9180e2 e2Var = this.f9360N0;
        if (e2Var != null) {
            C6924j2 j2Var = e2Var.f29641e;
            if (j2Var != null) {
                j2Var.m18408y2(true);
            }
            this.f9360N0 = null;
            this.f9361O0 = false;
        }
    }

    @Override
    public void mo2962n4(TdApi.ChatList chatList, boolean z, int i, int i2, int i3) {
        if ((chatList instanceof TdApi.ChatListArchive) && z) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    C2760nb.this.m33545nh();
                }
            });
        }
    }

    @Override
    public void mo8845ng(Context context, FrameLayoutFix frameLayoutFix, ViewPager viewPager) {
        FrameLayoutFix frameLayoutFix2 = new FrameLayoutFix(context);
        this.f9362x0 = frameLayoutFix2;
        frameLayoutFix2.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f9362x0.addView(viewPager);
        m9542qf(this.f9362x0);
        frameLayoutFix.addView(this.f9362x0);
        C1379j0.m37318l0(C1379j0.m37307r(context), 18);
        View$OnClickListenerC9347w1 w1Var = new View$OnClickListenerC9347w1(context);
        this.f9363y0 = w1Var;
        w1Var.m9079N1(this, R.id.theme_color_circleButtonActive, R.id.theme_color_circleButtonActiveIcon, new int[]{R.id.btn_float_compose, R.id.btn_float_newSecretChat, R.id.btn_float_newChannel, R.id.btn_float_newGroup, R.id.btn_float_newChat}, new int[]{R.drawable.baseline_create_24, R.drawable.baseline_lock_24, R.drawable.baseline_bullhorn_24, R.drawable.baseline_group_24, R.drawable.baseline_person_24}, new int[]{R.id.theme_color_circleButtonRegular, R.id.theme_color_circleButtonNewSecret, R.id.theme_color_circleButtonNewChannel, R.id.theme_color_circleButtonNewGroup, R.id.theme_color_circleButtonNewChat}, new int[]{R.id.theme_color_circleButtonRegularIcon, R.id.theme_color_circleButtonNewSecretIcon, R.id.theme_color_circleButtonNewChannelIcon, R.id.theme_color_circleButtonNewGroupIcon, R.id.theme_color_circleButtonNewChatIcon}, new int[]{R.string.NewSecretChat, R.string.NewChannel, R.string.NewGroup, R.string.NewChat}, false);
        this.f9363y0.setCallback(this);
        frameLayoutFix.addView(this.f9363y0);
        m33597Hh();
        if (this.f9359M0 != null) {
            m33575Sh();
        }
        this.f30167b.m2712Oe().m2017g();
        this.f30167b.m2781K9().m1831n(this);
        boolean z = false;
        m8840rg(0, new Runnable() {
            @Override
            public final void run() {
                C2760nb.this.m9204n9();
            }
        });
        AbstractC9382y1 y1Var = this.f30408v0;
        if (y1Var != null) {
            y1Var.getTopView().setOnSlideOffListener(new C2761a());
        }
        mo4347s().m14510b0().m23905i(this);
        if (mo4347s().m14510b0().m23914M() == 4) {
            if (mo4347s().m14510b0().m23898p() == 1) {
                z = true;
            }
            m33589Lh(z, true);
        }
    }

    @Override
    public void mo6871o6() {
        super.mo6871o6();
        C1379j0.m37369C0();
        m33550ih();
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_clear) {
            d1Var.m10096Q1(linearLayout, mo9237ia(), m9265ea());
        } else if (i != R.id.menu_main) {
            super.mo414p0(i, d1Var, linearLayout);
        } else {
            d1Var.m10071a2(linearLayout);
            d1Var.m10054i2(linearLayout, this);
        }
    }

    @Override
    public void mo9187pc() {
        super.mo9187pc();
        this.f9363y0.m9082J1();
    }

    @Override
    public void mo8843pg(int i, int i2) {
        if (!m9382Na()) {
            this.f9363y0.m9074U1();
        }
        if (i == 0) {
            this.f9363y0.m9075T1(R.id.btn_float_compose, R.drawable.baseline_create_24);
        } else if (i == 1) {
            this.f9363y0.m9075T1(R.id.btn_float_call, R.drawable.baseline_phone_24);
        } else if (i == 2) {
            this.f9363y0.m9075T1(R.id.btn_float_addContact, R.drawable.baseline_person_add_24);
        }
    }

    @Override
    public void mo1776q3(boolean z) {
        C11020tb.m1987b(this, z);
    }

    @Override
    public boolean mo8841qg() {
        return true;
    }

    @Override
    public void mo1775r7(boolean z) {
        C11020tb.m1983f(this, z);
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        this.f30167b.m2930B4().m4709d0(this.f30167b.m2188w6(), 1);
        if (C1379j0.f5013g == 2) {
            C1379j0.f5013g = 0;
        }
        m33561Zh();
        m33550ih();
    }

    @Override
    public void mo1774t4(boolean z) {
        C11020tb.m1986c(this, z);
    }

    @Override
    public TdApi.ChatList mo9538uf() {
        if (this.f9351E0) {
            return C7317b.f23225b;
        }
        return null;
    }

    @Override
    public int mo9537vf() {
        View$OnClickListenerC2805o4 jh = m33549jh();
        AbstractC10650f0 fi = jh != null ? jh.m33366fi() : null;
        boolean z = jh != null && jh.m33410Wh().getConstructor() == 362770115;
        if (fi == null || !fi.mo4377k6()) {
            return z ? R.string.MessagesArchive : super.mo9537vf();
        }
        return fi.mo4380L(z);
    }

    @Override
    public int mo9536wf() {
        return 7;
    }

    @Override
    public boolean mo8834wg() {
        return true;
    }

    @Override
    public void mo409xc() {
        super.mo409xc();
        this.f9363y0.m9073V1();
    }

    @Override
    public View mo9533zf() {
        return m8848kg();
    }
}
