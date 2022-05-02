package p038ce;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1363c0;
import be.C1369e0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import be.C1405v;
import be.C1408x;
import be.C1410y;
import cd.C2104l;
import gd.AbstractC4718o;
import gd.C4601c3;
import gd.C4779t2;
import ge.C4868i;
import ie.RunnableC5390g;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.C6846b1;
import me.C6862d3;
import me.C6924j2;
import me.C6957m1;
import me.C7093z3;
import me.View$OnClickListenerC6902i;
import me.ViewTreeObserver$OnPreDrawListenerC7081z0;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import org.thunderdog.challegram.p211v.RtlGridLayoutManager;
import org.thunderdog.challegram.widget.CustomImageView;
import p037cb.C2057b;
import p037cb.C2065g;
import p038ce.x00;
import p051db.C3950k;
import p080fb.C4343h;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5064d;
import p108hb.C5070i;
import p111he.C5146u0;
import p111he.View$OnTouchListenerC5103c0;
import p124ib.C5320c;
import p124ib.C5322e;
import p139jb.AbstractC5912d;
import p139jb.AbstractC5913e;
import p139jb.AbstractC5918j;
import p143k0.C6035e;
import p143k0.C6038h;
import p193nb.C7316a;
import p193nb.C7317b;
import p193nb.C7321e;
import p225pd.C8112b;
import p291uc.C9639r;
import p291uc.RunnableC9558i0;
import p335xd.C10189d;
import p335xd.C10192g;
import p350yd.AbstractC10700h0;
import p350yd.C10676g0;
import p350yd.C10684g8;
import p350yd.C10846m8;
import p350yd.C10930q6;
import p350yd.C11052v1;
import p350yd.HandlerC10770jj;
import p364zd.C11510b;
import p364zd.C11524j;
import sc.C8743e;
import td.AbstractC9201h1;
import td.AbstractC9299t2;
import td.AbstractC9323v4;
import td.C9289s;
import td.C9310u0;
import td.C9357x2;
import td.View$OnClickListenerC9170d1;

public class x00 extends AbstractC9299t2<C3281m> implements C3950k.AbstractC3952b, Runnable, C6924j2.AbstractC6931g, View.OnClickListener, AbstractC9201h1, C6924j2.AbstractC6934j, ViewTreeObserver$OnPreDrawListenerC7081z0.AbstractC7087f, View$OnClickListenerC6902i.AbstractC6905c, C9639r.AbstractC9641b, AbstractC10700h0, AbstractC5912d<TdApi.Chat> {
    public RelativeLayout f10860A0;
    public boolean f10861A1;
    public CustomRecyclerView f10862B0;
    public ViewTreeObserver$OnPreDrawListenerC7081z0 f10863B1;
    public CustomRecyclerView f10864C0;
    public boolean f10865C1;
    public C2546iq f10866D0;
    public boolean f10867D1;
    public C3283o f10868E0;
    public boolean f10869E1;
    public RunnableC9558i0 f10870F0;
    public boolean f10871F1;
    public View f10872G0;
    public boolean f10873G1;
    public C9289s f10874H0;
    public boolean f10875H1;
    public C8743e f10876I0;
    public C3284p f10877J0;
    public C6862d3 f10878K0;
    public boolean f10879L0;
    public View$OnTouchListenerC5103c0 f10880M0;
    public LinearLayout f10881N0;
    public ImageView f10882O0;
    public ImageView f10883P0;
    public FrameLayoutFix f10884Q0;
    public View f10887T0;
    public boolean f10888U0;
    public boolean f10891X0;
    public boolean f10892Y0;
    public boolean f10893Z0;
    public TdApi.MessageSchedulingState f10894a1;
    public boolean f10895b1;
    public int f10896c1;
    public int f10897d1;
    public int f10898e1;
    public boolean f10899f1;
    public int f10900g1;
    public boolean f10901h1;
    public boolean f10902i1;
    public boolean f10903j1;
    public C6924j2 f10904k1;
    public boolean f10905l1;
    public List<C4601c3> f10906m1;
    public boolean f10907n1;
    public C3950k f10908o1;
    public float f10909p1;
    public boolean f10910q1;
    public boolean f10911r1;
    public int f10912s1;
    public int f10913t0;
    public boolean f10914t1;
    public TdApi.ChatList f10915u0;
    public int f10916u1;
    public C10846m8 f10917v0;
    public int f10918v1;
    public List<TdApi.File> f10919w0;
    public boolean f10920w1;
    public C6038h<C3282n> f10921x0;
    public float f10922x1;
    public boolean f10924y1;
    public float f10925z0;
    public C9357x2.C9370l f10926z1;
    public int f10923y0 = 0;
    public boolean f10885R0 = false;
    public boolean f10886S0 = true;
    public final C6035e<C4601c3> f10889V0 = new C6035e<>();
    public final C5322e f10890W0 = new C5322e(10);

    public class C3269a implements C6957m1.AbstractC6962e {
        public final View f10927a;
        public final C4601c3 f10928b;

        public C3269a(View view, C4601c3 c3Var) {
            this.f10927a = view;
            this.f10928b = c3Var;
        }

        @Override
        public void mo3385B6(C6957m1.C6963f fVar, int i, Object obj) {
        }

        @Override
        public void mo3384E3(C6957m1.C6963f fVar, int i, Object obj) {
            View view = this.f10927a;
            ((C7093z3) view).m17756e1(x00.this.m30944ij(view, this.f10928b), true);
        }
    }

    public class C3270b extends C6924j2 {
        public C3270b(Context context) {
            super(context);
        }

        @Override
        public void mo18440H2() {
            super.mo18440H2();
            if (!x00.this.m9347Sa()) {
                x00.this.f10864C0.m39504A0();
            }
        }
    }

    public class C3271c extends C4343h {
        public C3271c(View view) {
            super(view);
        }

        @Override
        public View mo28226f() {
            return x00.this.f10914t1 ? x00.this.f10883P0 : x00.this.f10877J0;
        }
    }

    public class C3272d extends C10846m8 {
        public C3272d(C10930q6 q6Var, TdApi.ChatList chatList, AbstractC5912d dVar, boolean z) {
            super(q6Var, chatList, dVar, z);
        }

        public TdApi.Function m30889I() {
            return new TdApi.CreatePrivateChat(x00.this.f30167b.m2519ba(), false);
        }

        @Override
        public boolean mo3043D(List<C10846m8.C10848b> list, int i) {
            int i2 = 0;
            for (C10846m8.C10848b bVar : list) {
                if (!x00.this.f30167b.m2427h7(bVar.f34205a)) {
                    i2++;
                } else if (i > 0) {
                    list.remove(i2);
                    return true;
                } else if (i2 == 0 || C7317b.m17037g(bVar.f34205a, x00.this.f10915u0)) {
                    return false;
                } else {
                    list.remove(i2);
                    bVar.m3004c();
                    list.add(0, bVar);
                    return true;
                }
            }
            if (i == 0) {
                TdApi.Chat lb2 = x00.this.f30167b.m2359lb();
                if (lb2 == null || C7317b.m17037g(lb2, x00.this.f10915u0)) {
                    x00.this.f10917v0.m3025o(x00.this.f30167b.m2343mb(), new AbstractC5913e() {
                        @Override
                        public final Object get() {
                            TdApi.Function I;
                            I = x00.C3272d.this.m30889I();
                            return I;
                        }
                    }, null);
                } else {
                    C10846m8.C10848b bVar2 = new C10846m8.C10848b(lb2, x00.this.f10915u0, C7317b.m17043a(lb2, x00.this.f10915u0), true);
                    bVar2.m3004c();
                    list.add(0, bVar2);
                    return true;
                }
            }
            return false;
        }
    }

    public class C3273e extends CustomRecyclerView {
        public C3273e(Context context) {
            super(context);
        }

        @Override
        public void draw(Canvas canvas) {
            int Dh = x00.this.m31049Dh();
            if (Dh == 0) {
                canvas.drawColor(C11524j.m148w());
            } else {
                canvas.drawRect(0.0f, Dh, getMeasuredWidth(), getMeasuredHeight(), C1410y.m37039g(C11524j.m148w()));
            }
            super.draw(canvas);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            post(x00.this);
            if (getAdapter() != null) {
                x00.this.m31048Di();
            }
            x00.this.m30895yh();
            if (x00.this.f10899f1) {
                x00.this.f10899f1 = false;
                x00 x00Var = x00.this;
                x00Var.m30942jh(x00Var.f10900g1);
            }
            x00.this.m31051Ci();
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (getAdapter() != null) {
                x00.this.m31048Di();
            }
            x00.this.m30895yh();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return (motionEvent.getAction() != 0 || x00.this.f30156R == null || motionEvent.getY() >= x00.this.f30156R.getTranslationY() - ((float) View$OnClickListenerC9170d1.m10066c3(true))) && super.onTouchEvent(motionEvent);
        }
    }

    public class C3274f extends RecyclerView.AbstractC0910t {
        public C3274f() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                x00.this.m30991Wi(true);
            } else if (i == 1) {
                x00.this.m31009Qi();
                x00.this.mo9397La();
            }
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            x00.this.m30895yh();
            if (x00.this.f10917v0.m3024p() && !x00.this.m9382Na()) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                if (gridLayoutManager.m39546a2() >= x00.this.f10866D0.mo6153D() - gridLayoutManager.m39594V2()) {
                    x00.this.f10917v0.m3045B(30, null);
                }
            }
        }
    }

    public class C3275g extends GridLayoutManager.AbstractC0873b {
        public C3275g() {
        }

        @Override
        public int mo7528f(int i) {
            if (x00.this.f10866D0.m34240F0().get(i).m32876A() == 60) {
                return 1;
            }
            return ((GridLayoutManager) x00.this.f10864C0.getLayoutManager()).m39594V2();
        }
    }

    public class C3276h extends RecyclerView.AbstractC0901o {
        public final GridLayoutManager.AbstractC0873b f10936a;

        public C3276h(GridLayoutManager.AbstractC0873b bVar) {
            this.f10936a = bVar;
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            rect.top = 0;
            rect.bottom = 0;
            int k0 = recyclerView.m39421k0(view);
            if (k0 != -1) {
                int V2 = ((GridLayoutManager) recyclerView.getLayoutManager()).m39594V2();
                if (k0 < V2) {
                    int i = 0;
                    for (int i2 = 0; i2 < k0 && i <= V2; i2++) {
                        i += this.f10936a.mo7528f(i2);
                    }
                    if (k0 <= V2) {
                        rect.top = x00.this.m31013Ph();
                    }
                }
                int D = x00.this.f10866D0.mo6153D();
                int i3 = D % V2;
                if (i3 == 0) {
                    i3 = V2;
                }
                if (k0 >= D - i3) {
                    rect.bottom = Math.max(0, x00.this.get().getMeasuredHeight() == 0 ? C1357a0.m37544f() : ((x00.this.get().getMeasuredHeight() - View$OnClickListenerC9170d1.m10066c3(true)) - (((((int) Math.ceil(D / V2)) * C1357a0.m37541i(86.0f)) + C1357a0.m37541i(8.0f)) + C1357a0.m37541i(4.0f))) - (x00.this.f10879L0 ? C1357a0.m37541i(56.0f) : 0));
                }
            }
        }
    }

    public class C3277i extends LinearLayout {
        public C3277i(Context context) {
            super(context);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            x00.this.m30898xh();
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            x00.this.m30898xh();
        }
    }

    public class C3278j extends RunnableC9558i0 {
        public C3278j(Context context, C10930q6 q6Var) {
            super(context, q6Var);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            x00.this.m30901wh();
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            x00.this.m30901wh();
        }
    }

    public class C3279k implements RunnableC9558i0.AbstractC9563e {
        public C3279k() {
        }

        @Override
        public void mo8238D4(RunnableC9558i0 i0Var, String str) {
            if (x00.this.f10863B1 != null) {
                x00.this.f10863B1.m17832v2(str);
            }
        }

        @Override
        public long mo8237D5(RunnableC9558i0 i0Var) {
            return 0L;
        }

        @Override
        public void mo8236W5(RunnableC9558i0 i0Var, ArrayList<AbstractC4718o<?>> arrayList) {
        }

        @Override
        public TdApi.Chat mo8235h7(RunnableC9558i0 i0Var) {
            return null;
        }

        @Override
        public boolean mo8234o3(RunnableC9558i0 i0Var) {
            return false;
        }

        @Override
        public void mo8233r0(RunnableC9558i0 i0Var, ArrayList<AbstractC4718o<?>> arrayList, boolean z) {
        }

        @Override
        public long mo8232z(RunnableC9558i0 i0Var) {
            return 0L;
        }
    }

    public class C3280l extends C2546iq {
        public C3280l(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo505d2(C2964ra raVar, C7093z3 z3Var) {
            C4601c3 c3Var = (C4601c3) raVar.m32844d();
            z3Var.setPreviewActionListProvider(x00.this);
            z3Var.setChat(c3Var);
            z3Var.m17756e1(x00.this.m30985Yh(c3Var.m27051a()), false);
        }
    }

    public static class C3281m {
        public final int f10942a;
        public TdApi.ChatList f10943b;
        public TdApi.Message[] f10944c;
        public long f10945d;
        public TdApi.FormattedText f10946e;
        public String f10947f;
        public String f10948g;
        public String f10949h;
        public TdApi.Game f10950i;
        public long f10951j;
        public TdApi.Message f10952k;
        public boolean f10953l;
        public TdApi.InputMessageContent f10954m;
        public String f10955n;
        public String f10956o;
        public TdApi.User f10957p;
        public TdApi.Sticker f10958q;
        public boolean f10959r;
        public boolean f10960s;
        public AbstractC3286q f10961t;
        public Runnable f10962u;
        public C8112b[] f10963v;
        public CharSequence f10964w;
        public CharSequence f10965x;
        public int f10966y;
        public Runnable f10967z;

        public C3281m(TdApi.Message message) {
            this(new TdApi.Message[]{message});
        }

        public C3281m m30888A(boolean z) {
            this.f10960s = z;
            return this;
        }

        public C3281m m30887B(int i, Runnable runnable) {
            this.f10966y = i;
            this.f10967z = runnable;
            return this;
        }

        public C3281m m30886C(String str) {
            this.f10949h = str;
            return this;
        }

        public C3281m m30885D(boolean z) {
            this.f10959r = z;
            return this;
        }

        public C3281m m30884E(String str, String str2) {
            this.f10947f = str;
            this.f10948g = str2;
            return this;
        }

        public C3281m m30858z(Runnable runnable) {
            this.f10962u = runnable;
            return this;
        }

        public C3281m(TdApi.Message[] messageArr) {
            this.f10942a = 0;
            this.f10944c = messageArr;
        }

        public C3281m(TdApi.InputMessageContent inputMessageContent) {
            this.f10942a = 7;
            this.f10954m = inputMessageContent;
        }

        public C3281m(String str) {
            this(new TdApi.FormattedText(str, new TdApi.TextEntity[0]));
        }

        public C3281m(TdApi.FormattedText formattedText) {
            this.f10942a = 1;
            this.f10946e = formattedText;
        }

        public C3281m(TdApi.Game game, long j, TdApi.Message message, boolean z) {
            this.f10942a = 2;
            this.f10950i = game;
            this.f10951j = j;
            this.f10952k = message;
            this.f10953l = z;
        }

        public C3281m(File file, String str) {
            this(file.getPath(), str);
        }

        public C3281m(String str, String str2) {
            this.f10942a = 3;
            this.f10955n = str;
            this.f10956o = str2;
        }

        public C3281m(TdApi.User user) {
            this.f10942a = 4;
            this.f10957p = user;
        }

        public C3281m(TdApi.Sticker sticker) {
            this.f10942a = 5;
            this.f10958q = sticker;
        }

        public C3281m(AbstractC3286q qVar) {
            this.f10942a = 6;
            this.f10961t = qVar;
        }

        public C3281m(C8112b bVar, CharSequence charSequence, CharSequence charSequence2) {
            this(new C8112b[]{bVar}, charSequence, charSequence2);
        }

        public C3281m(C8112b[] bVarArr, CharSequence charSequence, CharSequence charSequence2) {
            this.f10942a = 8;
            this.f10963v = bVarArr;
            this.f10964w = charSequence;
            this.f10965x = charSequence2;
        }
    }

    public static class C3282n {
        public final TdApi.File f10968a;
        public Runnable f10969b;

        public C3282n(TdApi.File file) {
            this.f10968a = C7321e.m16931m(file);
        }

        public int m30857a() {
            TdApi.File file = this.f10968a;
            TdApi.LocalFile localFile = file.local;
            return (localFile == null || !localFile.isDownloadingActive) ? file.size : file.expectedSize;
        }
    }

    public static class C3283o extends View {
        public float f10970a;

        public C3283o(Context context) {
            super(context);
        }

        public void m30855b(float f) {
            if (this.f10970a != f) {
                this.f10970a = f;
                invalidate();
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int measuredHeight;
            float f;
            if (this.f10970a > 0.0f) {
                canvas.drawRect(0.0f, measuredHeight - ((int) (this.f10970a * f)), getMeasuredWidth(), getMeasuredHeight(), C1410y.m37039g(C11524j.m148w()));
            }
        }
    }

    public static class C3284p extends FrameLayoutFix implements C3950k.AbstractC3952b {
        public boolean f10971M;
        public C3950k f10972N;
        public float f10973O;
        public String f10974P;
        public boolean f10975Q;
        public float f10976R;
        public String f10977S;
        public boolean f10978T;
        public float f10979U;

        public class C3285a extends Drawable {
            public C3285a() {
            }

            @Override
            public void draw(Canvas canvas) {
                C3284p.this.m30853D1(canvas);
            }

            @Override
            public int getOpacity() {
                return 0;
            }

            @Override
            public void setAlpha(int i) {
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }
        }

        public C3284p(Context context) {
            super(context);
            C2065g.m35718d(this, new C3285a());
            View view = new View(context);
            C10189d.m5794j(view);
            C1399s0.m37193a0(view);
            view.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
            addView(view);
        }

        public final void m30853D1(Canvas canvas) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f = this.f10973O;
            canvas.drawColor(f == 0.0f ? C11524j.m148w() : f == 1.0f ? C11524j.m228N(R.id.theme_color_fillingPositive) : C5064d.m24128d(C11524j.m148w(), C11524j.m228N(R.id.theme_color_fillingPositive), this.f10973O));
            float f2 = this.f10973O;
            if (!(f2 == 0.0f || f2 == 1.0f)) {
                float f3 = this.f10973O;
                canvas.drawCircle(measuredWidth / 2, measuredHeight / 2, ((float) Math.sqrt((measuredWidth * measuredWidth) + (measuredHeight * measuredHeight))) * 0.5f * f3, C1410y.m37039g(C5064d.m24131a(f3, C11524j.m228N(R.id.theme_color_fillingPositive))));
            }
            float f4 = this.f10973O;
            int N = f4 == 0.0f ? C11524j.m228N(R.id.theme_color_textNeutral) : f4 == 1.0f ? C11524j.m228N(R.id.theme_color_fillingPositiveContent) : C5064d.m24128d(C11524j.m228N(R.id.theme_color_textNeutral), C11524j.m228N(R.id.theme_color_fillingPositiveContent), this.f10973O);
            if (this.f10973O <= 0.5f) {
                TextPaint o0 = C1410y.m37022o0(this.f10978T);
                int color = o0.getColor();
                o0.setColor(N);
                canvas.drawText(this.f10977S, (measuredWidth / 2) - (this.f10979U / 2.0f), (measuredHeight / 2) + C1357a0.m37541i(7.0f), o0);
                o0.setColor(color);
            }
            if (this.f10973O >= 0.5f) {
                TextPaint o02 = C1410y.m37022o0(this.f10975Q);
                int color2 = o02.getColor();
                o02.setColor(N);
                canvas.drawText(this.f10974P, (measuredWidth / 2) - (this.f10976R / 2.0f), (measuredHeight / 2) + C1357a0.m37541i(7.0f), o02);
                o02.setColor(color2);
            }
        }

        public void m30852E1(boolean z, boolean z2) {
            if (this.f10971M != z) {
                this.f10971M = z;
                float f = z ? 1.0f : 0.0f;
                if (z2) {
                    if (this.f10972N == null) {
                        this.f10972N = new C3950k(0, this, C2057b.f7280b, 180L, this.f10973O);
                    }
                    this.f10972N.m29544i(f);
                    return;
                }
                C3950k kVar = this.f10972N;
                if (kVar != null) {
                    kVar.m29541l(f);
                }
                setFactor(f);
            }
        }

        public void m30851F1(String str) {
            String upperCase = str.toUpperCase();
            this.f10974P = upperCase;
            boolean M0 = RunnableC5390g.m22983M0(upperCase);
            this.f10975Q = M0;
            this.f10976R = C7389v0.m16680T1(this.f10974P, C1410y.m37022o0(M0));
        }

        public void m30850G1(String str) {
            String upperCase = str.toUpperCase();
            this.f10977S = upperCase;
            boolean M0 = RunnableC5390g.m22983M0(upperCase);
            this.f10978T = M0;
            this.f10979U = C7389v0.m16680T1(this.f10977S, C1410y.m37022o0(M0));
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            setFactor(f);
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f10974P == null) {
                m30851F1(C4403w.m27869i1(R.string.Send));
            }
            if (this.f10977S == null) {
                m30850G1(C4403w.m27869i1(R.string.ShareBtnLink));
            }
        }

        public final void setFactor(float f) {
            if (this.f10973O != f) {
                this.f10973O = f;
                invalidate();
            }
        }
    }

    public interface AbstractC3286q {
        void mo30849a(long j, TdApi.Chat chat, TdApi.MessageSendOptions messageSendOptions, ArrayList<TdApi.Function> arrayList);

        CharSequence mo30848b(long j);
    }

    public x00(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m31057Ai(C3281m mVar, boolean z, String str, C10930q6.C10943m mVar2) {
        C1405v.m37128O(C4403w.m27865j1((mVar.f10945d == 0 || !z) ? (z || !this.f30167b.m2784K6(mVar.f10944c[0].chatId)) ? R.string.ShareTextMessage : R.string.ShareTextPost : R.string.ShareTextComment, mVar2.f35164a, str));
    }

    public void m31054Bi(int i, SparseIntArray sparseIntArray) {
        boolean z = true;
        this.f10871F1 = sparseIntArray.get(R.id.btn_hideAuthor) == R.id.btn_hideAuthor;
        this.f10873G1 = sparseIntArray.get(R.id.btn_removeCaptions) == R.id.btn_removeCaptions;
        if (sparseIntArray.get(R.id.btn_sendNoSound) != R.id.btn_sendNoSound) {
            z = false;
        }
        this.f10875H1 = z;
    }

    public static void m30981Zh(View view) {
        if (view instanceof C9310u0) {
            ((C9310u0) view).m9520e(false, 0.0f);
        }
    }

    public static void m30977ai(C10930q6.C10943m mVar) {
        C1379j0.m37325i(mVar.f35164a, mVar.f35165b ? R.string.CopiedLink : R.string.CopiedLinkPrivate);
    }

    public void m30973bi(View view) {
        if (view instanceof C9310u0) {
            float kh = m30938kh();
            this.f10925z0 = kh;
            ((C9310u0) view).setCurrentProgress(kh);
        }
    }

    public void m30969ci(View view) {
        if (view instanceof C9310u0) {
            float kh = m30938kh();
            this.f10925z0 = kh;
            ((C9310u0) view).m9520e(true, kh);
        }
    }

    public void m30961ei(final C3282n nVar, TdApi.File file) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                x00.this.m30965di(nVar);
            }
        });
    }

    public void m30957fi(TdApi.File file) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                x00.this.m31046Eh();
            }
        });
    }

    public void m30953gi(String str) {
        try {
            File file = new File(C1379j0.m37315n().getFilesDir(), "vcf");
            if (file.exists() || file.mkdir()) {
                final File file2 = new File(file, "temp.vcf");
                if (file2.exists() || file2.createNewFile()) {
                    FileWriter fileWriter = new FileWriter(file2);
                    fileWriter.append((CharSequence) str);
                    fileWriter.flush();
                    fileWriter.close();
                    this.f30167b.m2485dd().post(new Runnable() {
                        @Override
                        public final void run() {
                            x00.this.m30949hi(file2);
                        }
                    });
                }
            }
        } catch (IOException e) {
            Log.m14725e("Cannot create VCF file", e, new Object[0]);
        }
    }

    public void m30949hi(File file) {
        if (!m9347Sa()) {
            m31025Lh(file, "text/x-vcard", C4403w.m27869i1(R.string.ShareTitleContact));
        }
    }

    public void m30945ii(TdApi.File[] fileArr, String str, String str2, CharSequence charSequence, C10930q6.C10943m mVar) {
        m31022Mh(fileArr, str, str2, C4403w.m27865j1(R.string.format_ShareTextSignature, charSequence, mVar.f35164a));
    }

    public void m30941ji(String str, TdApi.File[] fileArr, String str2, String str3, int i, C10930q6.C10943m mVar) {
        m31022Mh(fileArr, str2, str3, C4403w.m27865j1(i, C4403w.m27865j1(R.string.format_ShareAuthorMessage, str, mVar.f35164a)));
    }

    public void m30937ki() {
        C6924j2 j2Var;
        if (!m9347Sa() && (j2Var = this.f10904k1) != null && !j2Var.m18446A2() && !this.f10869E1) {
            int Rh = m31007Rh();
            if (Rh == 1) {
                m31031Jh();
            } else {
                Log.m14709w("cant export content #2: %d", Integer.valueOf(Rh));
            }
        }
    }

    public static C2964ra m30936kj(C4601c3 c3Var) {
        return new C2964ra(60, R.id.chat).m32870G(c3Var).m32863N(c3Var.m27051a());
    }

    public void m30933li(C9310u0 u0Var, MotionEvent motionEvent) {
        m31009Qi();
        mo9397La();
    }

    public void m30930mi(TdApi.Chat chat, int i) {
        if (this.f10906m1 != null) {
            C4601c3 Fi = m31042Fi(chat);
            this.f10906m1.add(i, Fi);
            this.f10866D0.m34129t0(i, m30936kj(Fi));
            this.f10864C0.m39504A0();
        }
    }

    public void m30927ni(int i, int i2) {
        int i3;
        List<C4601c3> list = this.f10906m1;
        if (list != null) {
            this.f10906m1.add(i2, list.remove(i));
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f10864C0.getLayoutManager();
            int i4 = 0;
            if (linearLayoutManager != null) {
                i3 = linearLayoutManager.m39549X1();
                View C = linearLayoutManager.mo39262C(i3);
                if (C != null) {
                    i4 = linearLayoutManager.m39231U(C);
                }
            } else {
                i3 = -1;
            }
            this.f10866D0.m34114y1(i, i2);
            this.f10864C0.m39504A0();
            if (i3 != -1) {
                linearLayoutManager.m39522z2(i3, i4);
            }
        }
    }

    public void m30924oi(int i) {
        List<C4601c3> list = this.f10906m1;
        if (list != null) {
            list.remove(i);
            this.f10866D0.m34147n1(i);
            this.f10864C0.m39504A0();
        }
    }

    public boolean m30918qi(View view) {
        if (this.f10889V0.m21496p() <= 0) {
            return false;
        }
        m31000Ti(true, false, false, null);
        return true;
    }

    public List m30915ri(View view) {
        ArrayList arrayList = null;
        if (this.f10889V0.m21496p() == 0) {
            return null;
        }
        boolean z = false;
        if (this.f10889V0.m21496p() == 1) {
            List<View$OnTouchListenerC5103c0.C5104a> Y2 = this.f30167b.m2485dd().m3663Y2(this.f10889V0.m21495q(0).m27047e(), false, false, !this.f10875H1, true);
            if (Y2 == null) {
                Y2 = new ArrayList<>(1);
            }
            arrayList = Y2;
            arrayList.add(new View$OnTouchListenerC5103c0.C5104a((int) R.id.btn_sendAndOpen, C4403w.m27869i1(R.string.SendAndOpen), (int) R.drawable.baseline_forward_24));
        } else {
            int i = 0;
            while (true) {
                if (i >= this.f10889V0.m21496p()) {
                    break;
                } else if (this.f10889V0.m21495q(i).m27032t()) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                arrayList = new ArrayList(2);
                arrayList.add(new View$OnTouchListenerC5103c0.C5104a((int) R.id.btn_sendScheduled, C4403w.m27869i1(R.string.SendSchedule), (int) R.drawable.baseline_date_range_24));
                if (!this.f10875H1) {
                    arrayList.add(new View$OnTouchListenerC5103c0.C5104a((int) R.id.btn_sendNoSound, C4403w.m27869i1(R.string.SendNoSound), (int) R.drawable.baseline_notifications_off_24));
                }
            }
        }
        if (m31045Ei()) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(new View$OnTouchListenerC5103c0.C5104a((int) R.id.btn_settings, C4403w.m27869i1(R.string.MoreForwardOptions), (int) R.drawable.baseline_more_horiz_24).m23940g(16384L));
        }
        return arrayList;
    }

    public static boolean m30913sh(TdApi.Message message) {
        return message.content.getConstructor() == -512684966;
    }

    public void m30912si(boolean z, boolean z2, TdApi.MessageSchedulingState messageSchedulingState, boolean z3) {
        m31024Li(z, z2, messageSchedulingState, false);
    }

    public void m30909ti(View view, View view2) {
        C6035e<C4601c3> eVar = this.f10889V0;
        if (eVar != null && eVar.m21496p() != 0) {
            final boolean z = view2.getId() == R.id.btn_done;
            int id2 = view.getId();
            if (id2 == R.id.btn_sendAndOpen) {
                m31024Li(z, false, null, true);
            } else if (id2 != R.id.btn_settings) {
                switch (id2) {
                    case R.id.btn_sendNoSound:
                        m31024Li(z, true, null, false);
                        return;
                    case R.id.btn_sendOnceOnline:
                        m31024Li(z, false, new TdApi.MessageSchedulingStateSendWhenOnline(), false);
                        return;
                    case R.id.btn_sendScheduled:
                        this.f30167b.m2485dd().m3787L8(this, this.f10889V0.m21496p() == 1 ? this.f10889V0.m21495q(0).m27047e() : 0L, false, new HandlerC10770jj.AbstractC10786o() {
                            @Override
                            public final void mo3333a(boolean z2, TdApi.MessageSchedulingState messageSchedulingState, boolean z3) {
                                x00.this.m30912si(z, z2, messageSchedulingState, z3);
                            }
                        }, null);
                        return;
                    default:
                        return;
                }
            } else {
                m30952gj();
            }
        }
    }

    public static void m30906ui(View view) {
        if (view instanceof C9310u0) {
            ((C9310u0) view).m9520e(false, 0.0f);
        }
    }

    public void m30903vi() {
        this.f10885R0 = true;
        m9320W8(null);
        this.f10885R0 = false;
    }

    public void m30900wi() {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                x00.this.m30903vi();
            }
        });
    }

    public void m30894yi(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f30167b.m2270r4().m14783o((TdApi.Function) it.next(), this.f30167b.m2610V9());
        }
    }

    public void m30891zi() {
        this.f30167b.m2485dd().m3569h7(this, this.f10889V0.m21495q(0).m27051a(), null);
    }

    @Override
    public int mo408A9() {
        return 4;
    }

    public final void m31058Ah() {
        m30980Zi(!m9382Na() && m9333U9() != null && (m9348S9() || this.f10865C1));
    }

    public final void m31055Bh() {
        if (this.f10865C1) {
            ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f10863B1;
            if (z0Var != null) {
                z0Var.setVisibility(8);
                if (this.f10867D1) {
                    this.f10863B1.m17861R2(this.f10870F0);
                }
            }
            this.f10865C1 = false;
            this.f10882O0.setImageResource(R.drawable.deproko_baseline_insert_emoticon_26);
            m31058Ah();
        }
    }

    public final void m31052Ch() {
        if (!this.f10869E1) {
            C3281m x9 = m9131x9();
            if (this.f10913t0 == 0) {
                C10930q6 q6Var = this.f30167b;
                boolean z = false;
                TdApi.Message message = x9.f10944c[0];
                boolean z2 = x9.f10944c.length > 1;
                if (x9.f10945d != 0) {
                    z = true;
                }
                q6Var.m2849G5(message, z2, z, k00.f8825a);
            }
            m31030Ji();
            C6924j2 j2Var = this.f10904k1;
            if (j2Var != null) {
                j2Var.m18408y2(true);
            }
        }
    }

    public final void m31051Ci() {
        if (this.f10920w1) {
            this.f10920w1 = false;
            this.f10908o1.m29544i(this.f10922x1);
        }
    }

    public final int m31049Dh() {
        View C;
        int top;
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.f10864C0.getLayoutManager();
        int X1 = gridLayoutManager.m39549X1();
        int V2 = gridLayoutManager.m39594V2();
        if (X1 == -1 || X1 >= V2 || (C = gridLayoutManager.mo39262C(X1)) == null || (top = C.getTop() - C1357a0.m37541i(4.0f)) <= 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < X1 && i <= V2; i2++) {
            i += gridLayoutManager.m39590Z2().mo7528f(i2);
        }
        if (i <= V2) {
            return top;
        }
        return 0;
    }

    public final void m31048Di() {
        if (!this.f10905l1) {
            this.f10905l1 = true;
            this.f10904k1.m18430T2(get(), m30925oh());
        }
    }

    @Override
    public boolean mo16455E(View view, TdApi.Animation animation) {
        return C6846b1.m18794b(this, view, animation);
    }

    @Override
    public void mo9445Ee(boolean z) {
        if (!z || m30989Xh() == 0) {
            super.mo9445Ee(z);
            this.f10901h1 = false;
            return;
        }
        this.f10901h1 = true;
    }

    public final void m31046Eh() {
        View$OnClickListenerC9170d1 d1Var;
        if (this.f10921x0 == null) {
            return;
        }
        if (this.f10925z0 != m30938kh() && (d1Var = this.f30156R) != null) {
            d1Var.m10077X3(mo418W9(), R.id.menu_btn_forward, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    x00.this.m30973bi((View) obj);
                }
            });
        }
    }

    public final boolean m31045Ei() {
        if (this.f10913t0 == 0) {
            return true;
        }
        for (int i = 0; i < this.f10890W0.m23264l(); i++) {
            long f = this.f10890W0.m23270f(i);
            if (!(this.f30167b.m2443g7(f) || C7316a.m17051j(f))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean mo16446F4(View view, C2104l lVar, boolean z, TdApi.MessageSchedulingState messageSchedulingState) {
        return C6846b1.m18793c(this, view, lVar, z, messageSchedulingState);
    }

    public final void m30897xi(List<C4601c3> list) {
        List<C4601c3> list2 = this.f10906m1;
        boolean z = list2 == null;
        if (z) {
            this.f10906m1 = list;
        } else {
            C5062b.m24159m(list2, list2.size() + list.size());
            this.f10906m1.addAll(list);
        }
        int size = this.f10866D0.m34240F0().size();
        m30946ih(list, this.f10866D0.m34240F0());
        C2546iq iqVar = this.f10866D0;
        iqVar.m39308M(size, iqVar.m34240F0().size() - size);
        if (z) {
            this.f10864C0.setAdapter(this.f10866D0);
            m31048Di();
            return;
        }
        this.f10864C0.m39504A0();
    }

    public final C4601c3 m31042Fi(TdApi.Chat chat) {
        C4601c3 c3Var = new C4601c3(this.f30167b, this.f10915u0, chat, false, null);
        c3Var.m27061D();
        c3Var.m27062C();
        return c3Var;
    }

    @Override
    public View mo8869G9() {
        return this.f10874H0;
    }

    public final void m31040Gh() {
        if (this.f10921x0 == null && this.f10919w0 != null) {
            this.f10921x0 = new C6038h<>(this.f10919w0.size());
            for (TdApi.File file : this.f10919w0) {
                this.f10921x0.m21466j(file.f25373id, new C3282n(file));
            }
            View$OnClickListenerC9170d1 d1Var = this.f30156R;
            if (d1Var != null) {
                d1Var.m10077X3(mo418W9(), R.id.menu_btn_forward, new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        x00.this.m30969ci((View) obj);
                    }
                });
            }
            for (int i = 0; i < this.f10921x0.m21463n(); i++) {
                final C3282n o = this.f10921x0.m21462o(i);
                o.f10969b = this.f30167b.m2413i5().m3967t(o.f10968a, -1L, new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        x00.this.m30961ei(o, (TdApi.File) obj);
                    }
                }, new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        x00.this.m30957fi((TdApi.File) obj);
                    }
                });
            }
        }
    }

    public final void m31039Gi(float f) {
        if (f == 1.0f) {
            m30997Ui(true);
            mo9438Fd(this.f10870F0, false);
            return;
        }
        m9446Ed(null);
    }

    public final void m31037Hh() {
        int Xh = m30989Xh();
        if (Xh > 0) {
            this.f10911r1 = true;
            this.f10912s1 = Xh;
            this.f10864C0.scrollBy(0, Xh);
            return;
        }
        this.f10911r1 = false;
    }

    public final void m30965di(C3282n nVar) {
        C6924j2 j2Var;
        if (this.f10921x0 != null && !m9347Sa() && (j2Var = this.f10904k1) != null && !j2Var.m18446A2() && !this.f10869E1) {
            m31046Eh();
            nVar.f10969b = null;
            int i = this.f10923y0 + 1;
            this.f10923y0 = i;
            if (i == this.f10921x0.m21463n()) {
                View$OnClickListenerC9170d1 d1Var = this.f30156R;
                if (d1Var != null) {
                    d1Var.m10077X3(mo418W9(), R.id.menu_btn_forward, j00.f8741a);
                }
                m31028Kh();
            }
        }
    }

    @Override
    public C6957m1.AbstractC6962e mo9611I4(View view, C6957m1.C6963f fVar, C5320c cVar, C5320c cVar2, C5146u0 u0Var, AbstractC9323v4<?> v4Var) {
        C4601c3 c3Var = (C4601c3) ((C2964ra) view.getTag()).m32844d();
        fVar.m18336J(true);
        cVar.m23284a(R.id.btn_selectChat);
        u0Var.m23816a(m30985Yh(c3Var.m27051a()) ? R.string.Unselect : R.string.Select);
        cVar2.m23284a(R.drawable.baseline_playlist_add_check_24);
        return new C3269a(view, c3Var);
    }

    @Override
    public void mo3013I5(C10684g8 g8Var, int i, int i2) {
        C10676g0.m4334e(this, g8Var, i, i2);
    }

    @Override
    public boolean mo9416Ie() {
        return false;
    }

    public final void m31034Ih(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BEGIN:VCARD\r\n");
        sb2.append("VERSION:3.0\r\n");
        sb2.append("N:");
        sb2.append(C1363c0.m37428j0(str3));
        sb2.append(";");
        sb2.append(C1363c0.m37428j0(str2));
        sb2.append("\r\n");
        sb2.append("FN:");
        sb2.append(C1363c0.m37428j0(C4779t2.m25444q2(str2, str3)));
        sb2.append("\r\n");
        sb2.append("TEL;TYPE=cell:");
        sb2.append(C1363c0.m37428j0(C1363c0.m37408y(str, true, true)));
        sb2.append("\r\n");
        if (!C5070i.m24061i(str4)) {
            sb2.append("URL:");
            sb2.append(C1363c0.m37428j0(this.f30167b.m2637Tc(str4)));
            sb2.append("\r\n");
        }
        sb2.append("END:VCARD\r\n");
        final String sb3 = sb2.toString();
        C4383l.m28059a().m28058b(new Runnable() {
            @Override
            public final void run() {
                x00.this.m30953gi(sb3);
            }
        });
    }

    public final boolean m31033Ii(float f) {
        boolean z = m30989Xh() <= View$OnClickListenerC9170d1.getTopOffset() * 2;
        this.f10924y1 = z;
        if (z) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f10864C0.getLayoutManager();
            int X1 = linearLayoutManager.m39549X1();
            this.f10916u1 = X1;
            View C = linearLayoutManager.mo39262C(X1);
            this.f10918v1 = C != null ? C.getTop() : 0;
        }
        if (!this.f10910q1 || f >= 1.0f) {
            return false;
        }
        m30997Ui(false);
        return true;
    }

    @Override
    public void mo419J(int i, View view) {
        switch (i) {
            case R.id.btn_menu_customize:
                m30952gj();
                return;
            case R.id.menu_btn_clear:
                m9341T8();
                return;
            case R.id.menu_btn_copy:
                m31052Ch();
                return;
            case R.id.menu_btn_forward:
                m31031Jh();
                return;
            case R.id.menu_btn_search:
                if (this.f10906m1 != null) {
                    m9303Yc();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public int[] mo7925J2(C9639r rVar, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        return C9639r.m7947e(rVar, view, view2, i, i2, i3, i4, i5, this.f10860A0, this.f10881N0, this.f10863B1);
    }

    @Override
    public void mo9414J8(float f, boolean z) {
        super.mo9414J8(f, z);
        m30968cj(z ? f : 1.0f - f);
        boolean z2 = true;
        m30976aj(f == 1.0f);
        C6924j2 j2Var = this.f10904k1;
        if (f == 0.0f) {
            z2 = false;
        }
        j2Var.setIgnoreBottom(z2);
    }

    @Override
    public boolean mo9409Je() {
        return true;
    }

    public final void m31031Jh() {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.x00.m31031Jh():void");
    }

    public final void m31030Ji() {
        if (!this.f10869E1) {
            this.f10869E1 = true;
            C3281m x9 = m9131x9();
            if (x9.f10962u != null) {
                x9.f10962u.run();
            }
        }
    }

    @Override
    public boolean mo16405K1(float f, float f2) {
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        return d1Var != null && f2 < d1Var.getTranslationY() - ((float) View$OnClickListenerC9170d1.m10066c3(true));
    }

    public final void m31028Kh() {
        this.f30167b.m2485dd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                x00.this.m30937ki();
            }
        }, 100L);
    }

    public final void m31027Ki() {
        if (!this.f10865C1) {
            ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f10863B1;
            if (z0Var == null) {
                ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var2 = new ViewTreeObserver$OnPreDrawListenerC7081z0(mo4347s());
                this.f10863B1 = z0Var2;
                z0Var2.m17847a2(this, false, this, this, false);
                this.f10881N0.addView(this.f10863B1);
                this.f10884Q0.getViewTreeObserver().addOnPreDrawListener(this.f10863B1);
            } else {
                z0Var.setVisibility(0);
            }
            boolean S9 = m9348S9();
            this.f10867D1 = S9;
            this.f10865C1 = true;
            if (S9) {
                this.f10882O0.setImageResource(R.drawable.baseline_keyboard_24);
                this.f10863B1.m17848Z1(this.f10870F0);
            } else {
                this.f10882O0.setImageResource(R.drawable.baseline_direction_arrow_down_24);
            }
            m31058Ah();
        }
    }

    @Override
    public int mo9398L9() {
        return R.id.theme_color_filling;
    }

    @Override
    public void mo9397La() {
        super.mo9397La();
        C1408x.m37088c(this.f10870F0);
        m31016Oh();
    }

    public final void m31025Lh(File file, String str, String str2) {
        Uri L = C7389v0.m16714L(file);
        if (L != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", L);
            intent.setType(str);
            this.f30165a.startActivity(Intent.createChooser(intent, str2));
        }
    }

    public final void m31024Li(boolean z, boolean z2, TdApi.MessageSchedulingState messageSchedulingState, boolean z3) {
        if (!z) {
            m31000Ti(z3, false, z2, messageSchedulingState);
        } else if (!this.f10892Y0) {
            this.f10892Y0 = true;
            this.f10893Z0 = z2;
            this.f10894a1 = messageSchedulingState;
            this.f10895b1 = z3;
            mo9397La();
        }
    }

    @Override
    public void mo16389M2(ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var, boolean z) {
    }

    public final void m31022Mh(TdApi.File[] fileArr, String str, String str2, CharSequence charSequence) {
        Intent intent;
        int i;
        int i2;
        if (fileArr.length == 1) {
            Uri L = C7389v0.m16714L(new File(fileArr[0].local.path));
            if (L != null) {
                intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", L);
            } else {
                return;
            }
        } else {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(fileArr.length);
            for (TdApi.File file : fileArr) {
                Uri L2 = C7389v0.m16714L(new File(file.local.path));
                if (L2 == null) {
                    m31003Si(arrayList);
                    return;
                } else {
                    arrayList.add(L2);
                }
            }
            intent = new Intent();
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        }
        intent.setType(str);
        if (!C5070i.m24061i(charSequence)) {
            intent.putExtra("android.intent.extra.TEXT", charSequence);
        }
        if (C5070i.m24061i(str2)) {
            if (str.equals("image/gif")) {
                i2 = R.string.ShareTitleGif;
                i = R.string.ShareTitleGifX;
            } else if (str.startsWith("image/")) {
                i2 = R.string.ShareTitleImage;
                i = R.string.ShareTitleImageX;
            } else if (str.startsWith("video/")) {
                i2 = R.string.ShareTitleVideo;
                i = R.string.ShareTitleVideoX;
            } else if (str.startsWith("audio/")) {
                i2 = R.string.ShareTitleAudio;
                i = R.string.ShareTitleAudioX;
            } else {
                i2 = R.string.ShareTitleFile;
                i = R.string.ShareTitleFileX;
            }
            str2 = fileArr.length > 1 ? C4403w.m27844o2(i, fileArr.length) : C4403w.m27869i1(i2);
        }
        this.f30165a.startActivity(Intent.createChooser(intent, str2));
    }

    public final void m31021Mi(List<C10846m8.C10848b> list) {
        final ArrayList arrayList = new ArrayList(list.size());
        for (C10846m8.C10848b bVar : list) {
            arrayList.add(m31042Fi(bVar.f34205a));
        }
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                x00.this.m30897xi(arrayList);
            }
        });
    }

    public final void m31019Nh(TdApi.Message message) {
        if (message.content.getConstructor() == -512684966) {
            TdApi.Contact contact = ((TdApi.MessageContact) message.content).contact;
            m31034Ih(contact.phoneNumber, contact.firstName, contact.lastName, contact.userId != 0 ? this.f30167b.m2480e2().m1694R2(contact.userId) : null, contact.vcard);
        }
    }

    public final void m31018Ni() {
        if (this.f10865C1) {
            m31055Bh();
        } else {
            m31027Ki();
        }
    }

    @Override
    public int mo9375O9() {
        return R.id.theme_color_icon;
    }

    public final void m31016Oh() {
        if (this.f10865C1) {
            ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f10863B1;
            if (z0Var != null) {
                z0Var.setVisibility(8);
            }
            this.f10865C1 = false;
            this.f10882O0.setImageResource(R.drawable.deproko_baseline_insert_emoticon_26);
            m31058Ah();
        }
    }

    public final void m31015Oi() {
        boolean z = false;
        this.f10903j1 = false;
        this.f10864C0.m39496D1();
        if (m30989Xh() == 0) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this.f10864C0.getLayoutManager();
            int X1 = gridLayoutManager.m39549X1();
            View C = X1 == 0 ? gridLayoutManager.mo39262C(0) : null;
            if (X1 > 0 || (C != null && C.getTop() < C1357a0.m37541i(4.0f))) {
                z = true;
            }
            this.f10888U0 = z;
            return;
        }
        this.f10888U0 = false;
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 1) {
            m30988Xi(f);
        }
    }

    @Override
    public void mo9577Pf() {
        final int i = this.f10898e1;
        if (i > 0) {
            this.f10898e1 = 0;
            m9143vd(new Runnable() {
                @Override
                public final void run() {
                    x00.this.m30921pi(i);
                }
            }, 50L);
            this.f10898e1 = 0;
        }
    }

    public final int m31013Ph() {
        int i = 0;
        int Wh = ((m30992Wh() / 2) - View$OnClickListenerC9170d1.m10066c3(true)) - (this.f10907n1 ? m30934lh() : 0);
        if (!this.f10879L0) {
            i = C1357a0.m37541i(56.0f) / 2;
        }
        return Wh + i;
    }

    public final boolean m31012Pi(C4601c3 c3Var) {
        if (this.f10891X0 || !c3Var.m27031u() || this.f10889V0.m21496p() != 0) {
            return false;
        }
        this.f10889V0.m21500k(c3Var.m27051a(), c3Var);
        this.f10890W0.m23275a(c3Var.m27051a());
        m31000Ti(false, true, false, null);
        return true;
    }

    @Override
    public int mo9360Q9() {
        return R.id.theme_color_text;
    }

    @Override
    public boolean mo9358Qb(boolean z, int i, Animator.AnimatorListener animatorListener) {
        return false;
    }

    @Override
    public boolean mo9575Qf(View view, C4601c3 c3Var) {
        if (c3Var.m27043i() == 0) {
            c3Var = new C4601c3(this.f30167b, c3Var.m27042j(), c3Var.m27051a(), false);
        }
        if (!m30985Yh(c3Var.m27051a()) && (m31012Pi(c3Var) || !m30944ij(view, c3Var))) {
            return true;
        }
        int R0 = this.f10866D0.m34215R0(c3Var.m27051a());
        if (R0 != -1) {
            View C = this.f10864C0.getLayoutManager().mo39262C(R0);
            if (C != null) {
                ((C7093z3) C).m17756e1(true, false);
            } else {
                this.f10866D0.m39312I(R0);
            }
        }
        this.f10917v0.m3025o(c3Var.m27051a(), null, new Runnable() {
            @Override
            public final void run() {
                x00.this.m30900wi();
            }
        });
        return true;
    }

    public final CharSequence m31010Qh(long j) {
        C3281m x9 = m9131x9();
        TdApi.Chat L3 = this.f30167b.m2771L3(j);
        int i = this.f10913t0;
        int i2 = 0;
        if (i == 0) {
            TdApi.Message[] messageArr = x9.f10944c;
            int length = messageArr.length;
            while (i2 < length) {
                TdApi.Message message = messageArr[i2];
                if (C7316a.m17051j(j) && !C4779t2.m25595U(message.content)) {
                    return C4403w.m27869i1(R.string.SecretChatForwardError);
                }
                if (message.content.getConstructor() == -662130099 && !((TdApi.MessagePoll) message.content).poll.isAnonymous && this.f30167b.m2784K6(j)) {
                    return C4403w.m27869i1(R.string.PollPublicForwardHint);
                }
                CharSequence X5 = this.f30167b.m2584X5(L3, message);
                if (X5 != null) {
                    return X5;
                }
                i2++;
            }
        } else if (i == 1) {
            return this.f30167b.m2817I5(L3);
        } else {
            if (i == 3) {
                return this.f30167b.m2881E5(L3);
            }
            if (i == 5) {
                return this.f30167b.m2539a6(L3);
            }
            if (i == 6) {
                return x9.f10961t.mo30848b(j);
            }
            if (i == 7) {
                return this.f30167b.m2599W5(L3, x9.f10954m);
            }
            if (i == 8) {
                C8112b[] bVarArr = x9.f10963v;
                int length2 = bVarArr.length;
                while (i2 < length2) {
                    CharSequence W5 = this.f30167b.m2599W5(L3, bVarArr[i2].m13495m(null));
                    if (W5 != null) {
                        return W5;
                    }
                    i2++;
                }
            }
        }
        return null;
    }

    public final void m31009Qi() {
        this.f10911r1 = false;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_share;
    }

    public final int m31007Rh() {
        TdApi.Message[] messageArr;
        C3281m x9 = m9131x9();
        if (!C5070i.m24061i(x9.f10949h)) {
            return 1;
        }
        int i = this.f10913t0;
        ArrayList arrayList = null;
        String str = null;
        if (i != 0) {
            if (i != 8) {
                return (i == 3 || i == 4) ? 1 : 0;
            }
            if (x9.f10963v.length == 0) {
                return 0;
            }
            for (C8112b bVar : x9.f10963v) {
                String I = bVar.m13554I();
                if (C5070i.m24061i(I)) {
                    return 0;
                }
                if (str == null) {
                    str = I;
                } else if (!str.equals(I)) {
                    return 0;
                }
            }
            return 1;
        } else if (x9.f10944c.length == 0) {
            return 0;
        } else {
            if (x9.f10944c.length == 1 && m30913sh(x9.f10944c[0])) {
                return 1;
            }
            String str2 = null;
            long j = 0;
            for (TdApi.Message message : x9.f10944c) {
                String Sh = m31004Sh(message);
                if (C5070i.m24061i(Sh)) {
                    return 0;
                }
                if (str2 == null) {
                    str2 = Sh;
                } else if (!str2.equals(Sh)) {
                    return 0;
                }
                long M0 = C7321e.m16994M0(message);
                if (M0 == 0) {
                    return 0;
                }
                if (j == 0) {
                    j = M0;
                }
                TdApi.File Th = m31001Th(message);
                if (Th == null) {
                    return 0;
                }
                if (!C4779t2.m25586V2(Th)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Th);
                }
            }
            this.f10919w0 = arrayList;
            return arrayList != null ? 2 : 1;
        }
    }

    public final void m31006Ri() {
        if (this.f10911r1) {
            this.f10864C0.scrollBy(0, -this.f10912s1);
            this.f10911r1 = false;
        }
    }

    public final String m31004Sh(TdApi.Message message) {
        if (message == null || message.sendingState != null || m31001Th(message) == null) {
            return null;
        }
        switch (message.content.getConstructor()) {
            case TdApi.MessagePhoto.CONSTRUCTOR:
                if (((TdApi.MessagePhoto) message.content).isSecret) {
                    return null;
                }
                return "image/jpeg";
            case TdApi.MessageChatChangePhoto.CONSTRUCTOR:
                return "image/jpeg";
            case TdApi.MessageAudio.CONSTRUCTOR:
                String str = ((TdApi.MessageAudio) message.content).audio.mimeType;
                return (C5070i.m24061i(str) || !str.startsWith("audio/")) ? "audio/*" : str;
            case TdApi.MessageDocument.CONSTRUCTOR:
                TdApi.MessageDocument messageDocument = (TdApi.MessageDocument) message.content;
                String str2 = messageDocument.document.mimeType;
                if (C5070i.m24061i(str2)) {
                    str2 = C1369e0.m37392g(C7389v0.m16573v0(messageDocument.document.fileName));
                }
                return C5070i.m24061i(str2) ? "application/octet-stream" : str2;
            case TdApi.MessageAnimation.CONSTRUCTOR:
                TdApi.MessageAnimation messageAnimation = (TdApi.MessageAnimation) message.content;
                if (messageAnimation.isSecret) {
                    return null;
                }
                String str3 = messageAnimation.animation.mimeType;
                return !C5070i.m24061i(str3) ? (str3.startsWith("video/") || str3.equals("image/gif")) ? str3 : "video/*" : "video/*";
            case TdApi.MessageText.CONSTRUCTOR:
                return C4779t2.m25631O1(((TdApi.MessageText) message.content).webPage);
            case TdApi.MessageVideo.CONSTRUCTOR:
                TdApi.MessageVideo messageVideo = (TdApi.MessageVideo) message.content;
                if (messageVideo.isSecret) {
                    return null;
                }
                String str4 = messageVideo.video.mimeType;
                return (C5070i.m24061i(str4) || !str4.startsWith("video/")) ? "video/*" : str4;
            default:
                return null;
        }
    }

    public final void m31003Si(List<Uri> list) {
        for (Uri uri : list) {
            this.f30165a.revokeUriPermission(uri, 3);
        }
    }

    @Override
    public void mo3012T1(C10684g8 g8Var, final TdApi.Chat chat, final int i, C10930q6.C10937g gVar) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                x00.this.m30930mi(chat, i);
            }
        });
    }

    public final TdApi.File m31001Th(TdApi.Message message) {
        C6038h<C3282n> hVar;
        C3282n e;
        TdApi.File j1 = C4779t2.m25494j1(message);
        return (j1 == null || (hVar = this.f10921x0) == null || (e = hVar.m21471e(j1.f25373id)) == null) ? j1 : e.f10968a;
    }

    public final void m31000Ti(boolean z, boolean z2, boolean z3, TdApi.MessageSchedulingState messageSchedulingState) {
        boolean z4;
        TdApi.MessageSchedulingState messageSchedulingState2;
        int i;
        int i2;
        if (this.f10889V0.m21496p() != 0 && !this.f10869E1) {
            final ArrayList<TdApi.Function> arrayList = new ArrayList<>();
            boolean z5 = true;
            TdApi.FormattedText f = this.f10870F0.mo8279f(true);
            boolean z6 = !C7321e.m16965a1(f);
            C3281m x9 = m9131x9();
            if (z3 || this.f10875H1) {
                messageSchedulingState2 = messageSchedulingState;
                z4 = true;
            } else {
                messageSchedulingState2 = messageSchedulingState;
                z4 = false;
            }
            TdApi.MessageSendOptions messageSendOptions = new TdApi.MessageSendOptions(z4, false, false, messageSchedulingState2);
            TdApi.MessageSendOptions messageSendOptions2 = messageSendOptions.disableNotification ? new TdApi.MessageSendOptions(true, messageSendOptions.fromBackground, false, messageSendOptions.schedulingState) : messageSendOptions;
            int i3 = 0;
            while (i3 < this.f10890W0.m23264l()) {
                long f2 = this.f10890W0.m23270f(i3);
                if (!m30956fj(null, f2, z5)) {
                    TdApi.Chat U2 = this.f30167b.m2632U2(this.f10890W0.m23270f(i3));
                    if (U2 == null) {
                        long ba2 = this.f30167b.m2519ba();
                        if (f2 == ba2) {
                            this.f30167b.m2270r4().m14783o(new TdApi.CreatePrivateChat(ba2, z5), this.f30167b.m2214uc());
                        } else {
                            throw new RuntimeException("Unknown chatId:" + f2);
                        }
                    }
                    TdApi.MessageSendOptions messageSendOptions3 = C7316a.m17051j(f2) ? messageSendOptions2 : messageSendOptions;
                    if (z6) {
                        arrayList.add(new TdApi.SendMessage(f2, 0L, 0L, messageSendOptions3, null, new TdApi.InputMessageText(f, false, false)));
                    }
                    switch (this.f10913t0) {
                        case 0:
                            i = i3;
                            if (C4779t2.m25390y0(f2, x9.f10944c, this.f10871F1, this.f10873G1, messageSendOptions3, arrayList)) {
                                break;
                            } else {
                                return;
                            }
                        case 1:
                            i2 = i3;
                            arrayList.add(new TdApi.SendMessage(f2, 0L, 0L, messageSendOptions3, null, new TdApi.InputMessageText(x9.f10946e, false, false)));
                            i = i2;
                            break;
                        case 2:
                            i2 = i3;
                            arrayList.add(new TdApi.SendMessage(f2, 0L, 0L, messageSendOptions3, null, new TdApi.InputMessageForwarded(x9.f10952k.chatId, x9.f10952k.f25406id, x9.f10953l, null)));
                            i = i2;
                            break;
                        case 3:
                            i2 = i3;
                            arrayList.add(new TdApi.SendMessage(f2, 0L, 0L, messageSendOptions3, null, new TdApi.InputMessageDocument(C4779t2.m25537d0(x9.f10955n), null, false, null)));
                            i = i2;
                            break;
                        case 4:
                            i2 = i3;
                            arrayList.add(new TdApi.SendMessage(f2, 0L, 0L, messageSendOptions3, null, new TdApi.InputMessageContact(new TdApi.Contact(x9.f10957p.phoneNumber, x9.f10957p.firstName, x9.f10957p.lastName, null, x9.f10951j))));
                            i = i2;
                            break;
                        case 5:
                            arrayList.add(new TdApi.SendMessage(f2, 0L, 0L, messageSendOptions3, null, new TdApi.InputMessageSticker(new TdApi.InputFileId(x9.f10958q.sticker.f25373id), null, 0, 0, null)));
                            i = i3;
                            break;
                        case 6:
                            x9.f10961t.mo30849a(f2, U2, messageSendOptions3, arrayList);
                            i = i3;
                            break;
                        case 7:
                            arrayList.add(new TdApi.SendMessage(f2, 0L, 0L, messageSendOptions3, null, x9.f10954m));
                            i = i3;
                            break;
                        case 8:
                            TdApi.FormattedText L4 = C5070i.m24061i(x9.f10964w) ? null : C4779t2.m25649L4(x9.f10964w);
                            C8112b[] bVarArr = x9.f10963v;
                            int length = bVarArr.length;
                            int i4 = 0;
                            while (i4 < length) {
                                C8112b bVar = bVarArr[i4];
                                TdApi.FormattedText formattedText = L4;
                                TdApi.InputMessageContent m = bVar.m13495m(bVar == x9.f10963v[x9.f10963v.length + (-1)] ? formattedText : null);
                                if (m != null) {
                                    arrayList.add(new TdApi.SendMessage(f2, 0L, 0L, messageSendOptions3, null, m));
                                    i4++;
                                    L4 = formattedText;
                                } else {
                                    return;
                                }
                            }
                            i = i3;
                            break;
                        default:
                            return;
                    }
                    i3 = i + 1;
                    z5 = true;
                } else {
                    return;
                }
            }
            if (arrayList.size() == 1) {
                this.f30167b.m2270r4().m14783o(arrayList.get(0), this.f30167b.m2610V9());
            } else {
                this.f30167b.m2579Xa(new Runnable() {
                    @Override
                    public final void run() {
                        x00.this.m30894yi(arrayList);
                    }
                });
            }
            m31030Ji();
            if (z2) {
                C1379j0.m37292y0(R.string.DoneSave, 0);
            } else if ((x9.f10959r || z) && this.f10889V0.m21496p() == 1) {
                AbstractC9323v4<?> F = mo4347s().m14552P1().m9763F();
                if (!(F instanceof View$OnClickListenerC2971rh) || !((View$OnClickListenerC2971rh) F).m32150zj(this.f10889V0.m21495q(0).m27051a(), 0L)) {
                    C1379j0.m37332e0(new Runnable() {
                        @Override
                        public final void run() {
                            x00.this.m30891zi();
                        }
                    }, 250L);
                }
            } else {
                C1379j0.m37292y0(R.string.Done, 0);
            }
            this.f10904k1.m18408y2(true);
        }
    }

    public final int m30998Uh() {
        return m30916rh() ? 2 : 1;
    }

    public final void m30997Ui(boolean z) {
        if (this.f10910q1 != z) {
            this.f10910q1 = z;
            this.f10864C0.setTranslationY(m30931mh());
            ((RelativeLayout.LayoutParams) this.f10864C0.getLayoutParams()).addRule(2, z ? R.id.share_bottom : this.f10879L0 ? R.id.btn_send : 0);
            CustomRecyclerView customRecyclerView = this.f10864C0;
            customRecyclerView.setLayoutParams(customRecyclerView.getLayoutParams());
            this.f10864C0.m39504A0();
            if (this.f10924y1 && this.f10916u1 == 0) {
                if (z) {
                    this.f10864C0.scrollBy(0, m30934lh() * (-1));
                } else {
                    ((LinearLayoutManager) this.f10864C0.getLayoutManager()).m39522z2(this.f10916u1, this.f10918v1 - m31013Ph());
                }
            }
            this.f10870F0.setEnabled(z);
        }
    }

    public final String m30995Vh() {
        C3281m x9 = m9131x9();
        if (x9.f10967z != null) {
            return C4403w.m27869i1(x9.f10966y);
        }
        if (!C5070i.m24061i(x9.f10947f) && !C5070i.m24061i(x9.f10948g)) {
            return x9.f10948g;
        }
        if (this.f10913t0 != 0) {
            return C4403w.m27869i1(R.string.ShareBtnLink);
        }
        return C4403w.m27869i1(this.f30167b.m2784K6(x9.f10944c[0].chatId) ? R.string.ShareBtnPost : R.string.ShareBtnMessage);
    }

    public void m30994Vi(C3281m mVar) {
        super.m9476Ad(mVar);
        this.f10913t0 = mVar.f10942a;
        this.f10915u0 = mVar.f10943b != null ? mVar.f10943b : C7317b.f23224a;
    }

    @Override
    public boolean mo136W0() {
        return true;
    }

    @Override
    public int mo418W9() {
        return R.id.menu_search;
    }

    public final int m30992Wh() {
        return C1357a0.m37544f();
    }

    public final void m30991Wi(boolean z) {
        if (this.f10886S0 != z) {
            this.f10886S0 = z;
            this.f10864C0.setScrollDisabled(!z);
            if (z && this.f10903j1) {
                m31015Oi();
            }
        }
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27869i1(R.string.SendTo);
    }

    public final int m30989Xh() {
        return Math.max(0, (int) (this.f30156R.getTranslationY() - View$OnClickListenerC9170d1.getTopOffset()));
    }

    public final void m30988Xi(float f) {
        if (this.f10909p1 != f) {
            this.f10909p1 = f;
            this.f10864C0.setTranslationY(m30931mh());
            m30898xh();
            m30895yh();
            if (!this.f10879L0) {
                C6862d3 d3Var = this.f10878K0;
                float f2 = this.f10909p1;
                d3Var.setAlpha(f2 >= 0.2f ? 1.0f : f2 / 0.2f);
            }
            C9357x2.C9370l lVar = this.f10926z1;
            if (lVar != null) {
                lVar.m8904U();
            }
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 1) {
            m31039Gi(f);
        }
    }

    public final boolean m30985Yh(long j) {
        return this.f10889V0.m21505f(j) != null;
    }

    public final void m30984Yi(boolean z) {
        CharSequence charSequence;
        if (this.f10907n1 != z) {
            this.f10907n1 = z;
            if (z) {
                long f = this.f10890W0.m23264l() == 1 ? this.f10890W0.m23270f(0) : 0L;
                if (C7316a.m17051j(f)) {
                    charSequence = null;
                } else if (this.f30167b.m2443g7(f)) {
                    charSequence = C4403w.m27869i1(R.string.HoldToRemind);
                } else if (C7316a.m17052i(f) && this.f30167b.m2480e2().m1729I2(C7316a.m17044q(f))) {
                    charSequence = C4403w.m27853m1(R.string.HoldToSchedule2, this.f30167b.m2480e2().m1749D2(C7316a.m17044q(f)));
                } else if (this.f30167b.m2784K6(f)) {
                    charSequence = C4403w.m27869i1(R.string.HoldToSilentBroadcast);
                } else {
                    charSequence = C4403w.m27869i1(R.string.HoldToSchedule);
                }
                long j = 16384;
                if (this.f10913t0 != 0 || !C4868i.m24726c2().m24763X2(16384L)) {
                    j = 8192;
                } else {
                    charSequence = C4403w.m27869i1(R.string.HoldToSendAsCopy);
                }
                if (charSequence != null && C4868i.m24726c2().m24763X2(j)) {
                    C4868i.m24726c2().m24567w2(j);
                    if (j != 8192) {
                        C4868i.m24726c2().m24567w2(8192L);
                    }
                    this.f10926z1 = mo4347s().m14584H3().m8983i(new C3271c(null)).m8971D(this.f30167b, charSequence).m8919F();
                }
            } else {
                C9357x2.C9370l lVar = this.f10926z1;
                if (lVar != null) {
                    lVar.m8915J();
                }
                m31009Qi();
                mo9397La();
            }
            float f2 = 0.0f;
            boolean z2 = m9182qa() == 0.0f;
            if (z) {
                f2 = 1.0f;
            }
            if (z2) {
                if (this.f10908o1 == null) {
                    this.f10908o1 = new C3950k(1, this, C2057b.f7280b, 180L, this.f10909p1);
                }
                if (m31033Ii(f2)) {
                    this.f10920w1 = true;
                    this.f10922x1 = f2;
                    return;
                }
                this.f10908o1.m29544i(f2);
                return;
            }
            C3950k kVar = this.f10908o1;
            if (kVar != null) {
                kVar.m29541l(f2);
            }
            this.f10920w1 = false;
            m30988Xi(f2);
            m31039Gi(f2);
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f10917v0.m3040G(this);
        C1399s0.m37162q(this.f10864C0);
        C11052v1.m1768b().m1766d(this.f10866D0);
        m30907uh();
        mo4347s().m14438t2(this, false);
    }

    public final void m30980Zi(boolean z) {
        if (this.f10861A1 != z) {
            this.f10861A1 = z;
            if (z) {
                m31037Hh();
            } else {
                m31006Ri();
            }
            m30972bj(z);
            if (!z && this.f10892Y0) {
                this.f10892Y0 = false;
                m31000Ti(this.f10895b1, false, this.f10893Z0, this.f10894a1);
            }
        }
    }

    public final void m30976aj(boolean z) {
        if (this.f10902i1 != z) {
            this.f10902i1 = z;
            if (z) {
                if (this.f10886S0) {
                    m31015Oi();
                } else {
                    this.f10903j1 = true;
                }
                m31016Oh();
                m31058Ah();
                return;
            }
            this.f10903j1 = false;
        }
    }

    @Override
    public long mo16269b() {
        return C6846b1.m18795a(this);
    }

    @Override
    public void mo7924b5(C9639r rVar, View view) {
        this.f10860A0.removeView(view);
    }

    public boolean mo1511a(TdApi.Chat chat) {
        if (!this.f30167b.m2542a3(chat)) {
            return false;
        }
        C10930q6.C10944n U5 = this.f30167b.m2629U5(chat, R.id.right_sendMessages);
        return U5 == null || !U5.m2090a();
    }

    public final void m30972bj(boolean z) {
        if (this.f10914t1 != z) {
            this.f10914t1 = z;
            int i = 0;
            this.f10877J0.setVisibility(z ? 8 : 0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10881N0.getLayoutParams();
            if (z) {
                layoutParams.addRule(2, 0);
                layoutParams.addRule(12);
            } else {
                layoutParams.addRule(2, R.id.btn_send);
                layoutParams.addRule(12, 0);
            }
            ImageView imageView = this.f10883P0;
            if (!z) {
                i = 4;
            }
            imageView.setVisibility(i);
        }
    }

    public final void m30968cj(float f) {
        int i;
        if (!this.f10886S0 && (i = this.f10896c1) != 0) {
            int i2 = (int) (i * f);
            this.f10864C0.scrollBy(0, i2 - this.f10897d1);
            this.f10897d1 = i2;
        }
    }

    public final void m30964dj() {
        final boolean z;
        final String str;
        if (!this.f10869E1) {
            final C3281m x9 = m9131x9();
            if (x9.f10967z != null) {
                x9.f10967z.run();
            } else if (!C5070i.m24061i(x9.f10947f)) {
                C1405v.m37128O(x9.f10947f);
            } else if (this.f10913t0 == 0) {
                boolean z2 = false;
                int constructor = x9.f10944c[0].senderId.getConstructor();
                if (constructor == -336109341) {
                    str = this.f30167b.m2480e2().m1721K2(((TdApi.MessageSenderUser) x9.f10944c[0].senderId).userId);
                    z = true;
                } else if (constructor == -239660751) {
                    str = this.f30167b.m2691Q3(((TdApi.MessageSenderChat) x9.f10944c[0].senderId).chatId);
                    z = false;
                } else {
                    throw new UnsupportedOperationException(x9.f10944c[0].senderId.toString());
                }
                C10930q6 q6Var = this.f30167b;
                TdApi.Message message = x9.f10944c[0];
                boolean z3 = x9.f10944c.length > 1;
                if (x9.f10945d != 0) {
                    z2 = true;
                }
                q6Var.m2849G5(message, z3, z2, new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        x00.this.m31057Ai(x9, z, str, (C10930q6.C10943m) obj);
                    }
                });
            }
            m31030Ji();
            C6924j2 j2Var = this.f10904k1;
            if (j2Var != null) {
                j2Var.m18408y2(true);
            }
        }
    }

    @Override
    public void mo3011e4(C10684g8 g8Var, TdApi.Chat chat, int i, C10930q6.C10937g gVar) {
        C10676g0.m4337b(this, g8Var, chat, i, gVar);
    }

    public void m30960ej() {
        if (this.f30167b != null) {
            C3270b bVar = new C3270b(mo4347s());
            this.f10904k1 = bVar;
            bVar.setSoftInputMode(16);
            this.f10904k1.setBoundController(this);
            this.f10904k1.setPopupHeightProvider(this);
            this.f10904k1.m18045Q1(false);
            this.f10904k1.m18436M2();
            this.f10904k1.m18435N2();
            this.f10904k1.setTouchProvider(this);
            this.f10904k1.m18040W1();
            get();
            mo4347s().m14550Q(this, false);
        } else if (m31007Rh() == 1) {
            m31031Jh();
            mo417Z8();
        }
    }

    public final boolean m30956fj(View view, long j, boolean z) {
        int R0;
        CharSequence Qh = m31010Qh(j);
        if (Qh == null) {
            return false;
        }
        if (view == null && (R0 = this.f10866D0.m34215R0(j)) != -1) {
            int X1 = ((LinearLayoutManager) this.f10864C0.getLayoutManager()).m39549X1();
            int a2 = ((LinearLayoutManager) this.f10864C0.getLayoutManager()).m39546a2();
            if (R0 >= X1 && R0 <= a2) {
                view = this.f10864C0.getLayoutManager().mo39262C(R0);
                z = z && view == null;
            }
        }
        if (view == null && this.f10907n1) {
            view = this.f10914t1 ? this.f10883P0 : this.f10877J0;
        }
        if (z) {
            Qh = C4403w.m27865j1(R.string.format_chatAndError, this.f30167b.m2691Q3(j), Qh);
        }
        if (view != null) {
            mo4347s().m14584H3().m8985g(view).m8951q(R.drawable.baseline_warning_24).m8971D(this.f30167b, Qh).m8919F();
        } else {
            C1379j0.m37290z0(Qh, 0);
        }
        return true;
    }

    @Override
    public void mo3010g1(C10684g8 g8Var, TdApi.Chat chat, int i) {
        C10676g0.m4335d(this, g8Var, chat, i);
    }

    @Override
    public boolean mo16228g5() {
        return this.f10870F0.getText().length() == 0;
    }

    @Override
    public int getCurrentPopupHeight() {
        int Wh = m30992Wh() - m31049Dh();
        float topOffset = View$OnClickListenerC9170d1.getTopOffset();
        C3283o oVar = this.f10868E0;
        return Wh - ((int) (topOffset * (1.0f - (oVar != null ? oVar.f10970a : 0.0f))));
    }

    public final void m30952gj() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (this.f10913t0 == 0) {
            TdApi.Message[] messageArr = m9131x9().f10944c;
            int length = messageArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                TdApi.Message message = messageArr[i];
                if (message.content.getConstructor() != 1989037971 && C4779t2.m25654L(message)) {
                    z = true;
                    break;
                }
                i++;
            }
            arrayList.add(new C2964ra(12, (int) R.id.btn_hideAuthor, 0, (int) R.string.SendAsCopy, (int) R.id.btn_hideAuthor, this.f10871F1));
            if (z) {
                arrayList.add(new C2964ra(12, (int) R.id.btn_removeCaptions, 0, (int) R.string.RemoveCaptions, (int) R.id.btn_removeCaptions, this.f10873G1));
            }
        }
        int i2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < this.f10890W0.m23264l(); i3++) {
            long f = this.f10890W0.m23270f(i3);
            if (C7316a.m17051j(f)) {
                z2 = true;
            }
            if (!this.f30167b.m2443g7(f) && !C7316a.m17051j(f)) {
                i2++;
            }
        }
        if (i2 > 0) {
            C2964ra raVar = new C2964ra(12, (int) R.id.btn_sendNoSound, 0, (int) R.string.SendNoSound, (int) R.id.btn_sendNoSound, this.f10875H1);
            if (z2) {
                raVar.m32853X(C4403w.m27836q2(R.string.SendNoSoundX, i2));
            }
            arrayList.add(raVar);
        }
        if (!arrayList.isEmpty()) {
            m9199ne(R.id.btn_menu_customize, (C2964ra[]) arrayList.toArray(new C2964ra[0]), new AbstractC9323v4.AbstractC9343r() {
                @Override
                public final void mo1773l6(int i4, SparseIntArray sparseIntArray) {
                    x00.this.m31054Bi(i4, sparseIntArray);
                }
            });
        }
    }

    public final void m30921pi(int i) {
        if (i == 0) {
            this.f10864C0.m39496D1();
        }
        m30991Wi(false);
        this.f10864C0.mo8024v1(0, i);
    }

    @Override
    public void mo3009i(C10684g8 g8Var, int i) {
        C10676g0.m4336c(this, g8Var, i);
    }

    public final void m30946ih(List<C4601c3> list, List<C2964ra> list2) {
        if (!list.isEmpty()) {
            C5062b.m24159m(list2, list2.size() + list.size());
            for (C4601c3 c3Var : list) {
                list2.add(m30936kj(c3Var));
            }
        }
    }

    public final boolean m30944ij(View view, C4601c3 c3Var) {
        long a = c3Var.m27051a();
        boolean z = false;
        if (!m30985Yh(a) && !m30956fj(view, a, false)) {
            z = true;
        }
        if (z) {
            this.f10889V0.m21500k(a, c3Var);
            this.f10890W0.m23275a(a);
            this.f10891X0 = true;
        } else {
            this.f10889V0.m21499l(a);
            this.f10890W0.m23266j(a);
        }
        m30904vh();
        m30940jj();
        return z;
    }

    @Override
    public boolean mo404jc(boolean z) {
        if (m9382Na()) {
            m9320W8(null);
            return true;
        } else if (!this.f10865C1) {
            return false;
        } else {
            m31016Oh();
            return true;
        }
    }

    @Override
    public boolean mo9549jf(C4601c3 c3Var) {
        return false;
    }

    public final void m30942jh(int i) {
        if (this.f10899f1) {
            this.f10900g1 = i;
        } else {
            m30921pi(i);
        }
    }

    public final void m30940jj() {
        if (this.f10889V0.m21496p() == 0) {
            this.f10874H0.setSubtitle(C4403w.m27909Z1(C4403w.m27869i1(R.string.SelectChats)));
            return;
        }
        int i = 0;
        if (this.f10889V0.m21496p() == 1) {
            this.f10874H0.setSubtitle(this.f10889V0.m21495q(0).m27044h());
            return;
        }
        int l = this.f10890W0.m23264l();
        int i2 = m30998Uh() > 1 ? 2 : 3;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= l) {
                break;
            }
            C4601c3 f = this.f10889V0.m21505f(this.f10890W0.m23270f(i3));
            if (i4 == i2 - 1 && l > i2) {
                i = l - i4;
                break;
            }
            if (f.m27031u()) {
                arrayList.add(C4403w.m27869i1(R.string.SavedMessages));
            } else {
                arrayList.add(f.m27039m().toString());
            }
            i4++;
            i3++;
        }
        this.f10874H0.setSubtitle(C4403w.m27828s2(arrayList, i));
    }

    @Override
    public boolean mo9548kf(C4601c3 c3Var) {
        return true;
    }

    public final float m30938kh() {
        float f = 0.0f;
        if (this.f10921x0 != null) {
            double d = 0.0d;
            for (int i = 0; i < this.f10921x0.m21463n(); i++) {
                d += this.f10921x0.m21462o(i).m30857a();
            }
            for (int i2 = 0; i2 < this.f10921x0.m21463n(); i2++) {
                C3282n o = this.f10921x0.m21462o(i2);
                f += C4779t2.m25431s1(o.f10968a) * ((float) (o.m30857a() / d));
            }
        }
        return f;
    }

    @Override
    public int mo415la() {
        return R.id.menu_clear;
    }

    public final int m30934lh() {
        if (this.f10879L0) {
            return Math.max(this.f10881N0.getMeasuredHeight(), C1357a0.m37541i(48.0f));
        }
        return Math.max(this.f10881N0.getMeasuredHeight(), C1357a0.m37541i(48.0f)) + C1357a0.m37541i(56.0f);
    }

    @Override
    public void mo3008m5(C10684g8 g8Var, TdApi.Chat chat, final int i, C10930q6.C10937g gVar) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                x00.this.m30924oi(i);
            }
        });
    }

    @Override
    public void mo134m7(boolean z, C11510b bVar) {
        super.mo134m7(z, bVar);
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        if (d1Var != null) {
            d1Var.m10124E3(this, null);
        }
    }

    public final float m30931mh() {
        if (this.f10910q1 || this.f10924y1) {
            return 0.0f;
        }
        return m30934lh() * this.f10909p1 * (-1.0f);
    }

    @Override
    public void mo3007n7(C10684g8 g8Var, TdApi.Chat chat, final int i, final int i2, C10930q6.C10937g gVar) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                x00.this.m30927ni(i, i2);
            }
        });
    }

    public final int m30928nh() {
        if (!C1379j0.m37354N()) {
            return 4;
        }
        return C1357a0.m37543g() / (C1357a0.m37553B() / 4);
    }

    @Override
    public View mo403oc(Context context) {
        this.f10917v0 = new C3272d(this.f30167b, this.f10915u0, this, true);
        this.f10879L0 = m30910th();
        C9289s sVar = new C9289s(context);
        this.f10874H0 = sVar;
        sVar.setTitle(R.string.SendTo);
        this.f10874H0.m9632D1(C1357a0.m37541i(56.0f) * m30998Uh(), false);
        this.f10874H0.m9630F1(R.id.theme_color_text, R.id.theme_color_textLight, this);
        m30940jj();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f10860A0 = relativeLayout;
        relativeLayout.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = View$OnClickListenerC9170d1.m10066c3(true);
        if (this.f10879L0) {
            layoutParams.addRule(2, R.id.btn_send);
        }
        C3273e eVar = new C3273e(context);
        this.f10864C0 = eVar;
        m9163t8(eVar);
        this.f10864C0.setItemAnimator(null);
        this.f10864C0.setOverScrollMode(2);
        this.f10864C0.m39422k(new C3274f());
        this.f10864C0.setHasFixedSize(true);
        this.f10864C0.setLayoutManager(new RtlGridLayoutManager(context, 4));
        this.f10864C0.setLayoutParams(layoutParams);
        C3275g gVar = new C3275g();
        C8743e eVar2 = new C8743e(m30928nh(), C1357a0.m37541i(8.0f), true, false, false);
        this.f10876I0 = eVar2;
        eVar2.m11611o(gVar);
        this.f10864C0.m39434g(this.f10876I0);
        this.f10864C0.m39434g(new C3276h(gVar));
        ((GridLayoutManager) this.f10864C0.getLayoutManager()).m39585e3(gVar);
        this.f10860A0.addView(this.f10864C0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, C1357a0.m37541i(56.0f));
        layoutParams2.addRule(12);
        C3284p pVar = new C3284p(context);
        this.f10877J0 = pVar;
        pVar.setLayoutParams(layoutParams2);
        this.f10877J0.setId(R.id.btn_send);
        if (this.f10879L0) {
            this.f10877J0.m30850G1(m30995Vh());
        }
        this.f10877J0.getChildAt(0).setId(R.id.btn_send);
        this.f10877J0.getChildAt(0).setOnClickListener(this);
        this.f10877J0.getChildAt(0).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                boolean qi;
                qi = x00.this.m30918qi(view);
                return qi;
            }
        });
        if (!this.f10879L0) {
            this.f10877J0.setTranslationY(C1357a0.m37541i(56.0f));
            this.f10877J0.m30852E1(true, false);
        }
        m9163t8(this.f10877J0);
        this.f10880M0 = new View$OnTouchListenerC5103c0(new View$OnTouchListenerC5103c0.AbstractC5106c() {
            @Override
            public final List mo2024N3(View view) {
                List ri;
                ri = x00.this.m30915ri(view);
                return ri;
            }
        }, new View$OnTouchListenerC5103c0.AbstractC5105b() {
            @Override
            public final void mo4198I0(View view, View view2) {
                x00.this.m30909ti(view, view2);
            }
        }, m9471Ba(), null).m23956d(this.f10877J0.getChildAt(0));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(2, R.id.btn_send);
        C3277i iVar = new C3277i(context);
        this.f10881N0 = iVar;
        iVar.setLayoutParams(layoutParams3);
        this.f10881N0.setId(R.id.share_bottom);
        this.f10881N0.setOrientation(1);
        this.f10860A0.addView(this.f10881N0);
        C3278j jVar = new C3278j(context, this.f30167b);
        this.f10870F0 = jVar;
        jVar.setInputListener(new C3279k());
        this.f10870F0.setEnabled(false);
        this.f10870F0.setGravity(83);
        this.f10870F0.setTypeface(C1389o.m37258k());
        this.f10870F0.setTextColor(C11524j.m217S0());
        m9126y8(this.f10870F0);
        this.f10870F0.setTextSize(1, 18.0f);
        this.f10870F0.setPadding(C1357a0.m37541i(60.0f), C1357a0.m37541i(12.0f), C1357a0.m37541i(55.0f), C1357a0.m37541i(12.0f));
        this.f10870F0.setHintTextColor(C11524j.m207X0());
        m9170s8(this.f10870F0, R.id.theme_color_textPlaceholder);
        C10192g.m5782i(this.f10870F0, R.id.theme_color_filling, this);
        this.f10870F0.setHighlightColor(C11524j.m252B());
        m9178r8(this.f10870F0, R.id.theme_color_textSelectionHighlight);
        this.f10870F0.setMinimumHeight(C1357a0.m37541i(48.0f));
        this.f10870F0.setHint(C4403w.m27869i1(R.string.AddComment));
        this.f10870F0.setImeOptions(268435456);
        RunnableC9558i0 i0Var = this.f10870F0;
        i0Var.setInputType(i0Var.getInputType() | Log.TAG_VIDEO | Log.TAG_CONTACT);
        this.f10870F0.setSingleLine(false);
        this.f10870F0.setMaxLines(4);
        this.f10881N0.addView(this.f10870F0);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(C1357a0.m37541i(55.0f), C1357a0.m37541i(48.0f));
        layoutParams4.addRule(11);
        layoutParams4.addRule(6, R.id.share_bottom);
        CustomImageView customImageView = new CustomImageView(context);
        this.f10883P0 = customImageView;
        customImageView.setId(R.id.btn_done);
        this.f10883P0.setScaleType(ImageView.ScaleType.CENTER);
        this.f10883P0.setImageResource(R.drawable.deproko_baseline_send_24);
        this.f10883P0.setColorFilter(C11524j.m175j());
        m9184q8(this.f10883P0, R.id.theme_color_chatSendButton);
        this.f10883P0.setVisibility(4);
        this.f10883P0.setOnClickListener(this);
        this.f10883P0.setLayoutParams(layoutParams4);
        this.f10860A0.addView(this.f10883P0);
        this.f10880M0.m23956d(this.f10883P0);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(C1357a0.m37541i(60.0f), C1357a0.m37541i(48.0f));
        layoutParams5.addRule(9);
        layoutParams5.addRule(6, R.id.share_bottom);
        CustomImageView customImageView2 = new CustomImageView(context);
        this.f10882O0 = customImageView2;
        customImageView2.setScaleType(ImageView.ScaleType.CENTER);
        this.f10882O0.setId(R.id.btn_emoji);
        this.f10882O0.setOnClickListener(this);
        this.f10882O0.setImageResource(R.drawable.deproko_baseline_insert_emoticon_26);
        this.f10882O0.setColorFilter(C11524j.m159q0());
        m9184q8(this.f10882O0, R.id.theme_color_icon);
        this.f10882O0.setLayoutParams(layoutParams5);
        this.f10860A0.addView(this.f10882O0);
        this.f10860A0.addView(this.f10877J0);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(2, R.id.share_bottom);
        C6862d3 e = C6862d3.m18733e(context, layoutParams6, false);
        this.f10878K0 = e;
        e.setColorId(R.id.theme_color_shareSeparator);
        this.f10878K0.m18737a();
        if (this.f10879L0) {
            this.f10878K0.setTranslationY(C1357a0.m37541i(48.0f));
        } else {
            this.f10878K0.setAlpha(0.0f);
        }
        this.f10878K0.setLayoutParams(layoutParams6);
        this.f10860A0.addView(this.f10878K0);
        C3280l lVar = new C3280l(this);
        this.f10866D0 = lVar;
        lVar.m34241E2();
        C11052v1.m1768b().m1769a(this.f10866D0);
        View$OnClickListenerC9170d1 d1Var = new View$OnClickListenerC9170d1(context);
        this.f30156R = d1Var;
        d1Var.m10045m3(this, false);
        this.f30156R.getFilling().m9007s0(0.0f);
        this.f30156R.getBackButton().setIsReverse(true);
        m9230ja(this.f30156R);
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, C1357a0.m37541i(6.0f));
        s1.topMargin = View$OnClickListenerC9170d1.m10066c3(false) - C1357a0.m37541i(3.0f);
        View view = new View(context);
        this.f10872G0 = view;
        C10192g.m5782i(view, R.id.theme_color_filling, this);
        this.f10872G0.setLayoutParams(s1);
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.f10884Q0 = frameLayoutFix;
        frameLayoutFix.addView(this.f10872G0);
        this.f10884Q0.addView(this.f10860A0);
        CustomRecyclerView qf = m9542qf(this.f10884Q0);
        this.f10862B0 = qf;
        ((ViewGroup.MarginLayoutParams) qf.getLayoutParams()).topMargin = View$OnClickListenerC9170d1.m10066c3(true);
        this.f10884Q0.addView(this.f30156R);
        if (View$OnClickListenerC9170d1.getTopOffset() > 0) {
            C3283o oVar = new C3283o(context);
            this.f10868E0 = oVar;
            m9163t8(oVar);
            this.f10868E0.setLayoutParams(FrameLayoutFix.m18008s1(-1, View$OnClickListenerC9170d1.getTopOffset()));
            this.f10884Q0.addView(this.f10868E0);
        }
        m30898xh();
        this.f30167b.m2270r4().m14783o(new TdApi.CreatePrivateChat(this.f30167b.m2519ba(), true), this.f30167b.m2214uc());
        this.f10917v0.m3019u(this, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                x00.this.m31021Mi((List) obj);
            }
        }, Math.max(20, C1357a0.m37548b(C1357a0.m37541i(95.0f), 1) * m30928nh()), new Runnable() {
            @Override
            public final void run() {
                x00.this.m9204n9();
            }
        });
        return this.f10884Q0;
    }

    public final int m30925oh() {
        return m30992Wh() - (m31013Ph() + View$OnClickListenerC9170d1.getTopOffset());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_done:
                if (this.f10889V0.m21496p() == 0) {
                    mo9397La();
                    return;
                } else {
                    m31024Li(true, false, null, false);
                    return;
                }
            case R.id.btn_emoji:
                m31018Ni();
                return;
            case R.id.btn_send:
                if (this.f10889V0.m21496p() != 0) {
                    m31024Li(false, false, null, false);
                    return;
                } else if (this.f10879L0) {
                    m30964dj();
                    return;
                } else {
                    return;
                }
            case R.id.share_comment_stub:
                return;
            default:
                C2964ra raVar = (C2964ra) view.getTag();
                C4601c3 c3Var = (C4601c3) raVar.m32844d();
                int j = raVar.m32835j();
                if (j != R.id.chat) {
                    if (j == R.id.search_chat && !m31012Pi(c3Var)) {
                        ((C7093z3) view).m17756e1(m30944ij(view, c3Var), true);
                        m9320W8(null);
                        return;
                    }
                    return;
                } else if (this.f10886S0 && !m31012Pi(c3Var)) {
                    ((C7093z3) view).m17756e1(m30944ij(view, c3Var), true);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_clear) {
            d1Var.m10091S1(linearLayout, this);
        } else if (i == R.id.menu_search) {
            if (m30922ph()) {
                d1Var.m10101O1(linearLayout, R.id.menu_btn_copy, mo9375O9(), this, R.drawable.baseline_link_24, C1357a0.m37541i(49.0f), R.drawable.bg_btn_header);
            }
            if (m31007Rh() != 0) {
                d1Var.m10101O1(linearLayout, R.id.menu_btn_forward, mo9375O9(), this, R.drawable.baseline_share_24, C1357a0.m37541i(49.0f), R.drawable.bg_btn_header);
            }
            d1Var.m10050k2(linearLayout, this, mo9375O9()).setTouchDownListener(new C9310u0.AbstractC9311a() {
                @Override
                public final void mo9516a(C9310u0 u0Var, MotionEvent motionEvent) {
                    x00.this.m30933li(u0Var, motionEvent);
                }
            });
        }
    }

    @Override
    public void mo16154p5() {
        if (this.f10870F0.length() > 0) {
            this.f10870F0.dispatchKeyEvent(new KeyEvent(0, 67));
        }
    }

    @Override
    public long mo9189pa() {
        return 220L;
    }

    @Override
    public void mo9187pc() {
        super.mo9187pc();
        int Xh = m30989Xh();
        if (Xh > 0) {
            this.f10898e1 = Xh;
        } else {
            m30991Wi(true);
        }
    }

    public final boolean m30922ph() {
        if (m9131x9().f10960s && this.f10913t0 == 0) {
            return m30919qh();
        }
        return false;
    }

    public final boolean m30919qh() {
        C3281m x9 = m9131x9();
        if (x9.f10944c.length != 0 && this.f30167b.m2288q2(x9.f10944c[0].chatId)) {
            if (x9.f10944c.length == 1) {
                return true;
            }
            long j = x9.f10944c[0].mediaAlbumId;
            if (j != 0) {
                for (int i = 1; i < x9.f10944c.length; i++) {
                    if (j != x9.f10944c[i].mediaAlbumId) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public Interpolator mo9176ra() {
        return C2057b.f7280b;
    }

    public final boolean m30916rh() {
        return m31007Rh() != 0;
    }

    @Override
    public void run() {
        int nh = m30928nh();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.f10864C0.getLayoutManager();
        if (gridLayoutManager.m39594V2() != nh) {
            gridLayoutManager.m39586d3(nh);
            this.f10876I0.m11612n(nh);
            this.f10864C0.m39504A0();
        }
    }

    public final boolean m30910th() {
        C3281m x9 = m9131x9();
        if (!C5070i.m24061i(x9.f10947f) || x9.f10967z != null) {
            return true;
        }
        if (this.f10913t0 != 0) {
            return false;
        }
        return m30919qh();
    }

    public final void m30907uh() {
        View$OnClickListenerC9170d1 d1Var;
        if (this.f10921x0 != null) {
            for (int i = 0; i < this.f10921x0.m21463n(); i++) {
                C3282n o = this.f10921x0.m21462o(i);
                Runnable runnable = o.f10969b;
                if (runnable != null) {
                    runnable.run();
                    o.f10969b = null;
                }
            }
            this.f10921x0 = null;
            this.f10923y0 = 0;
        }
        if (!(m9347Sa() || (d1Var = this.f30156R) == null)) {
            d1Var.m10077X3(mo418W9(), R.id.menu_btn_forward, i00.f8575a);
        }
    }

    public final void m30904vh() {
        boolean z = this.f10889V0.m21496p() > 0;
        if (this.f10879L0) {
            this.f10877J0.m30852E1(z, true);
        }
        m30984Yi(z);
    }

    @Override
    public void mo16097w0(String str) {
        this.f10870F0.m8260p0(str);
    }

    @Override
    public boolean mo9136wc(boolean z) {
        if (m9382Na() || this.f10869E1) {
            return super.mo9136wc(z);
        }
        if (z && !m9348S9()) {
            m31055Bh();
        }
        boolean wc = super.mo9136wc(z);
        ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f10863B1;
        if (z0Var != null) {
            z0Var.m17841j(z);
        }
        m31058Ah();
        return wc;
    }

    @Override
    public int mo9536wf() {
        return 13;
    }

    public final void m30901wh() {
        float translationY = this.f10881N0.getTranslationY() + Math.max(0, this.f10870F0.getMeasuredHeight() - C1357a0.m37541i(48.0f));
        this.f10883P0.setTranslationY(translationY);
        this.f10882O0.setTranslationY(translationY);
    }

    @Override
    public void mo409xc() {
        super.mo409xc();
        if (this.f10888U0) {
            this.f10888U0 = false;
            m30991Wi(true);
            return;
        }
        int Xh = m30989Xh();
        int Ph = m31013Ph() - C1357a0.m37541i(4.0f);
        if (Xh == 0) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this.f10864C0.getLayoutManager();
            int X1 = gridLayoutManager.m39549X1();
            View C = X1 == 0 ? gridLayoutManager.mo39262C(0) : null;
            if (X1 != 0 || this.f10885R0) {
                this.f10899f1 = true;
                this.f10900g1 = -Ph;
                gridLayoutManager.m39522z2(0, C1357a0.m37541i(4.0f));
                return;
            } else if (C != null && C.getTop() < C1357a0.m37541i(4.0f)) {
                this.f10864C0.scrollBy(0, C.getTop() - C1357a0.m37541i(4.0f));
            }
        }
        m30942jh(Xh - Ph);
    }

    public final void m30898xh() {
        float lh = m30934lh() * (1.0f - this.f10909p1);
        this.f10881N0.setTranslationY(lh);
        this.f10878K0.setTranslationY(lh);
        if (!this.f10879L0) {
            this.f10877J0.setTranslationY(lh);
        }
        m30901wh();
    }

    public final void m30895yh() {
        View view = this.f10887T0;
        if (view == null || this.f10864C0.m39421k0(view) != 0) {
            view = this.f10864C0.getLayoutManager().mo39262C(0);
            this.f10887T0 = view;
        }
        int topOffset = View$OnClickListenerC9170d1.getTopOffset();
        if (view != null) {
            topOffset = Math.max(((view.getTop() - View$OnClickListenerC9170d1.m10066c3(false)) + this.f10864C0.getTop()) - C1357a0.m37541i(4.0f), View$OnClickListenerC9170d1.getTopOffset());
        }
        float f = 0.0f;
        if (!this.f10910q1 && this.f10909p1 != 0.0f) {
            topOffset = Math.max(View$OnClickListenerC9170d1.getTopOffset(), (int) (topOffset + m30931mh()));
        }
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        if (d1Var != null) {
            float f2 = topOffset;
            d1Var.setTranslationY(f2);
            this.f10872G0.setTranslationY(f2);
            int topOffset2 = View$OnClickListenerC9170d1.getTopOffset();
            int i = topOffset - topOffset2;
            m30892zh(i);
            float f3 = i;
            this.f10862B0.setTranslationY(f3);
            C3283o oVar = this.f10868E0;
            if (oVar != null) {
                oVar.setTranslationY(f3);
                if (i <= topOffset2) {
                    f = 1.0f - (f3 / topOffset2);
                }
                this.f10868E0.m30855b(f);
                this.f30156R.getFilling().m9007s0(f);
            }
            if (i == 0 && this.f10901h1) {
                super.mo9445Ee(true);
                this.f10901h1 = false;
            } else if (this.f10886S0 && i > 0 && m9382Na() && m9182qa() == 1.0f) {
                this.f10864C0.scrollBy(0, i);
            }
        }
    }

    @Override
    public View mo9533zf() {
        return this.f10860A0;
    }

    public final void m30892zh(int i) {
        boolean z = this.f10910q1;
        if (this.f10870F0.isEnabled() != z) {
            this.f10870F0.setEnabled(z);
        }
    }
}
