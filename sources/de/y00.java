package de;

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
import ce.a0;
import ce.j0;
import ce.p0;
import ce.v;
import ce.x;
import ce.y;
import de.y00;
import eb.k;
import gd.w;
import hd.c3;
import ie.c0;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b1;
import ne.d3;
import ne.i;
import ne.j2;
import ne.m1;
import ne.y3;
import ne.z0;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import org.thunderdog.challegram.v.RtlGridLayoutManager;
import org.thunderdog.challegram.widget.CustomImageView;
import ud.d1;
import ud.h1;
import ud.s;
import ud.t2;
import ud.u0;
import ud.v4;
import ud.x2;
import vc.h0;
import vc.q;
import zd.e0;
import zd.e8;
import zd.f0;
import zd.hj;
import zd.k8;
import zd.o6;
import zd.t1;

public class y00 extends t2<m> implements k.b, Runnable, j2.g, View.OnClickListener, h1, j2.j, z0.f, i.c, q.b, f0, kb.d<TdApi.Chat> {
    public RelativeLayout A0;
    public boolean A1;
    public CustomRecyclerView B0;
    public z0 B1;
    public CustomRecyclerView C0;
    public boolean C1;
    public iq D0;
    public boolean D1;
    public o E0;
    public boolean E1;
    public h0 F0;
    public boolean F1;
    public View G0;
    public boolean G1;
    public s H0;
    public boolean H1;
    public tc.e I0;
    public p J0;
    public d3 K0;
    public boolean L0;
    public c0 M0;
    public LinearLayout N0;
    public ImageView O0;
    public ImageView P0;
    public FrameLayoutFix Q0;
    public View T0;
    public boolean U0;
    public boolean X0;
    public boolean Y0;
    public boolean Z0;
    public TdApi.MessageSchedulingState f10057a1;
    public boolean f10058b1;
    public int f10059c1;
    public int f10060d1;
    public int f10061e1;
    public boolean f10062f1;
    public int f10063g1;
    public boolean f10064h1;
    public boolean f10065i1;
    public boolean f10066j1;
    public j2 f10067k1;
    public boolean f10068l1;
    public List<c3> f10069m1;
    public boolean f10070n1;
    public eb.k f10071o1;
    public float f10072p1;
    public boolean f10073q1;
    public boolean f10074r1;
    public int f10075s1;
    public int f10076t0;
    public boolean f10077t1;
    public TdApi.ChatList f10078u0;
    public int f10079u1;
    public k8 f10080v0;
    public int f10081v1;
    public List<TdApi.File> f10082w0;
    public boolean f10083w1;
    public k0.h<n> f10084x0;
    public float f10085x1;
    public boolean f10087y1;
    public float f10088z0;
    public x2.l f10089z1;
    public int f10086y0 = 0;
    public boolean R0 = false;
    public boolean S0 = true;
    public final k0.e<c3> V0 = new k0.e<>();
    public final jb.e W0 = new jb.e(10);

    public class a implements m1.e {
        public final View f10090a;
        public final c3 f10091b;

        public a(View view, c3 c3Var) {
            this.f10090a = view;
            this.f10091b = c3Var;
        }

        @Override
        public void a7(m1.f fVar, int i10, Object obj) {
        }

        @Override
        public void t2(m1.f fVar, int i10, Object obj) {
            View view = this.f10090a;
            ((y3) view).l1(y00.this.ij(view, this.f10091b), true);
        }
    }

    public class b extends j2 {
        public b(Context context) {
            super(context);
        }

        @Override
        public void C2() {
            super.C2();
            if (!y00.this.Sa()) {
                y00.this.C0.A0();
            }
        }
    }

    public class c extends gb.h {
        public c(View view) {
            super(view);
        }

        @Override
        public View f() {
            return y00.this.f10077t1 ? y00.this.P0 : y00.this.J0;
        }
    }

    public class d extends k8 {
        public d(o6 o6Var, TdApi.ChatList chatList, kb.d dVar, boolean z10) {
            super(o6Var, chatList, dVar, z10);
        }

        public TdApi.Function I() {
            return new TdApi.CreatePrivateChat(y00.this.f24495b.fa(), false);
        }

        @Override
        public boolean D(List<k8.b> list, int i10) {
            int i11 = 0;
            for (k8.b bVar : list) {
                if (!y00.this.f24495b.l7(bVar.f27458a)) {
                    i11++;
                } else if (i10 > 0) {
                    list.remove(i11);
                    return true;
                } else if (i11 == 0 || ob.b.g(bVar.f27458a, y00.this.f10078u0)) {
                    return false;
                } else {
                    list.remove(i11);
                    bVar.c();
                    list.add(0, bVar);
                    return true;
                }
            }
            if (i10 == 0) {
                TdApi.Chat pb2 = y00.this.f24495b.pb();
                if (pb2 == null || ob.b.g(pb2, y00.this.f10078u0)) {
                    y00.this.f10080v0.o(y00.this.f24495b.qb(), new kb.e() {
                        @Override
                        public final Object get() {
                            TdApi.Function I;
                            I = y00.d.this.I();
                            return I;
                        }
                    }, null);
                } else {
                    k8.b bVar2 = new k8.b(pb2, y00.this.f10078u0, ob.b.a(pb2, y00.this.f10078u0), true);
                    bVar2.c();
                    list.add(0, bVar2);
                    return true;
                }
            }
            return false;
        }
    }

    public class e extends CustomRecyclerView {
        public e(Context context) {
            super(context);
        }

        @Override
        public void draw(Canvas canvas) {
            int Dh = y00.this.Dh();
            if (Dh == 0) {
                canvas.drawColor(ae.j.u());
            } else {
                canvas.drawRect(0.0f, Dh, getMeasuredWidth(), getMeasuredHeight(), y.g(ae.j.u()));
            }
            super.draw(canvas);
        }

        @Override
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            post(y00.this);
            if (getAdapter() != null) {
                y00.this.Di();
            }
            y00.this.yh();
            if (y00.this.f10062f1) {
                y00.this.f10062f1 = false;
                y00 y00Var = y00.this;
                y00Var.jh(y00Var.f10063g1);
            }
            y00.this.Ci();
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (getAdapter() != null) {
                y00.this.Di();
            }
            y00.this.yh();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return (motionEvent.getAction() != 0 || y00.this.R == null || motionEvent.getY() >= y00.this.R.getTranslationY() - ((float) d1.a3(true))) && super.onTouchEvent(motionEvent);
        }
    }

    public class f extends RecyclerView.t {
        public f() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                y00.this.Wi(true);
            } else if (i10 == 1) {
                y00.this.Qi();
                y00.this.La();
            }
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            y00.this.yh();
            if (y00.this.f10080v0.p() && !y00.this.Na()) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                if (gridLayoutManager.a2() >= y00.this.D0.D() - gridLayoutManager.V2()) {
                    y00.this.f10080v0.B(30, null);
                }
            }
        }
    }

    public class g extends GridLayoutManager.b {
        public g() {
        }

        @Override
        public int f(int i10) {
            if (y00.this.D0.D0().get(i10).A() == 60) {
                return 1;
            }
            return ((GridLayoutManager) y00.this.C0.getLayoutManager()).V2();
        }
    }

    public class h extends RecyclerView.o {
        public final GridLayoutManager.b f10097a;

        public h(GridLayoutManager.b bVar) {
            this.f10097a = bVar;
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            rect.top = 0;
            rect.bottom = 0;
            int k02 = recyclerView.k0(view);
            if (k02 != -1) {
                int V2 = ((GridLayoutManager) recyclerView.getLayoutManager()).V2();
                if (k02 < V2) {
                    int i10 = 0;
                    for (int i11 = 0; i11 < k02 && i10 <= V2; i11++) {
                        i10 += this.f10097a.f(i11);
                    }
                    if (k02 <= V2) {
                        rect.top = y00.this.Ph();
                    }
                }
                int D = y00.this.D0.D();
                int i12 = D % V2;
                if (i12 == 0) {
                    i12 = V2;
                }
                if (k02 >= D - i12) {
                    rect.bottom = Math.max(0, y00.this.get().getMeasuredHeight() == 0 ? a0.f() : ((y00.this.get().getMeasuredHeight() - d1.a3(true)) - (((((int) Math.ceil(D / V2)) * a0.i(86.0f)) + a0.i(8.0f)) + a0.i(4.0f))) - (y00.this.L0 ? a0.i(56.0f) : 0));
                }
            }
        }
    }

    public class i extends LinearLayout {
        public i(Context context) {
            super(context);
        }

        @Override
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            y00.this.xh();
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            y00.this.xh();
        }
    }

    public class j extends h0 {
        public j(Context context, o6 o6Var) {
            super(context, o6Var);
        }

        @Override
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            y00.this.wh();
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            y00.this.wh();
        }
    }

    public class k implements h0.e {
        public k() {
        }

        @Override
        public void T(h0 h0Var, ArrayList<hd.o<?>> arrayList, boolean z10) {
        }

        @Override
        public void W6(h0 h0Var, ArrayList<hd.o<?>> arrayList) {
        }

        @Override
        public void X5(h0 h0Var, String str) {
            if (y00.this.B1 != null) {
                y00.this.B1.r2(str);
            }
        }

        @Override
        public TdApi.Chat b0(h0 h0Var) {
            return null;
        }

        @Override
        public boolean b1(h0 h0Var) {
            return false;
        }

        @Override
        public long w5(h0 h0Var) {
            return 0L;
        }

        @Override
        public long y(h0 h0Var) {
            return 0L;
        }
    }

    public class l extends iq {
        public l(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void Z1(ra raVar, y3 y3Var) {
            c3 c3Var = (c3) raVar.d();
            y3Var.setPreviewActionListProvider(y00.this);
            y3Var.setChat(c3Var);
            y3Var.l1(y00.this.Yh(c3Var.a()), false);
        }
    }

    public static class m {
        public final int f10103a;
        public TdApi.ChatList f10104b;
        public TdApi.Message[] f10105c;
        public long f10106d;
        public TdApi.FormattedText f10107e;
        public String f10108f;
        public String f10109g;
        public String f10110h;
        public TdApi.Game f10111i;
        public long f10112j;
        public TdApi.Message f10113k;
        public boolean f10114l;
        public TdApi.InputMessageContent f10115m;
        public String f10116n;
        public String f10117o;
        public TdApi.User f10118p;
        public TdApi.Sticker f10119q;
        public boolean f10120r;
        public boolean f10121s;
        public q f10122t;
        public Runnable f10123u;
        public qd.b[] f10124v;
        public CharSequence f10125w;
        public CharSequence f10126x;
        public int f10127y;
        public Runnable f10128z;

        public m(TdApi.Message message) {
            this(new TdApi.Message[]{message});
        }

        public m A(boolean z10) {
            this.f10121s = z10;
            return this;
        }

        public m B(int i10, Runnable runnable) {
            this.f10127y = i10;
            this.f10128z = runnable;
            return this;
        }

        public m C(String str) {
            this.f10110h = str;
            return this;
        }

        public m D(boolean z10) {
            this.f10120r = z10;
            return this;
        }

        public m E(String str, String str2) {
            this.f10108f = str;
            this.f10109g = str2;
            return this;
        }

        public m z(Runnable runnable) {
            this.f10123u = runnable;
            return this;
        }

        public m(TdApi.Message[] messageArr) {
            this.f10103a = 0;
            this.f10105c = messageArr;
        }

        public m(TdApi.InputMessageContent inputMessageContent) {
            this.f10103a = 7;
            this.f10115m = inputMessageContent;
        }

        public m(String str) {
            this(new TdApi.FormattedText(str, new TdApi.TextEntity[0]));
        }

        public m(TdApi.FormattedText formattedText) {
            this.f10103a = 1;
            this.f10107e = formattedText;
        }

        public m(TdApi.Game game, long j10, TdApi.Message message, boolean z10) {
            this.f10103a = 2;
            this.f10111i = game;
            this.f10112j = j10;
            this.f10113k = message;
            this.f10114l = z10;
        }

        public m(File file, String str) {
            this(file.getPath(), str);
        }

        public m(String str, String str2) {
            this.f10103a = 3;
            this.f10116n = str;
            this.f10117o = str2;
        }

        public m(TdApi.User user) {
            this.f10103a = 4;
            this.f10118p = user;
        }

        public m(TdApi.Sticker sticker) {
            this.f10103a = 5;
            this.f10119q = sticker;
        }

        public m(q qVar) {
            this.f10103a = 6;
            this.f10122t = qVar;
        }

        public m(qd.b bVar, CharSequence charSequence, CharSequence charSequence2) {
            this(new qd.b[]{bVar}, charSequence, charSequence2);
        }

        public m(qd.b[] bVarArr, CharSequence charSequence, CharSequence charSequence2) {
            this.f10103a = 8;
            this.f10124v = bVarArr;
            this.f10125w = charSequence;
            this.f10126x = charSequence2;
        }
    }

    public static class n {
        public final TdApi.File f10129a;
        public Runnable f10130b;

        public n(TdApi.File file) {
            this.f10129a = ob.e.n(file);
        }

        public int a() {
            TdApi.File file = this.f10129a;
            TdApi.LocalFile localFile = file.local;
            return (localFile == null || !localFile.isDownloadingActive) ? file.size : file.expectedSize;
        }
    }

    public static class o extends View {
        public float f10131a;

        public o(Context context) {
            super(context);
        }

        public void b(float f10) {
            if (this.f10131a != f10) {
                this.f10131a = f10;
                invalidate();
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int measuredHeight;
            float f10;
            if (this.f10131a > 0.0f) {
                canvas.drawRect(0.0f, measuredHeight - ((int) (this.f10131a * f10)), getMeasuredWidth(), getMeasuredHeight(), y.g(ae.j.u()));
            }
        }
    }

    public static class p extends FrameLayoutFix implements k.b {
        public boolean M;
        public eb.k N;
        public float O;
        public String P;
        public boolean Q;
        public float R;
        public String S;
        public boolean T;
        public float U;

        public class a extends Drawable {
            public a() {
            }

            @Override
            public void draw(Canvas canvas) {
                p.this.A1(canvas);
            }

            @Override
            public int getOpacity() {
                return 0;
            }

            @Override
            public void setAlpha(int i10) {
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }
        }

        public p(Context context) {
            super(context);
            db.g.d(this, new a());
            View view = new View(context);
            yd.d.j(view);
            p0.T(view);
            view.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            addView(view);
        }

        public final void A1(Canvas canvas) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f10 = this.O;
            canvas.drawColor(f10 == 0.0f ? ae.j.u() : f10 == 1.0f ? ae.j.L(R.id.theme_color_fillingPositive) : ib.d.d(ae.j.u(), ae.j.L(R.id.theme_color_fillingPositive), this.O));
            float f11 = this.O;
            if (!(f11 == 0.0f || f11 == 1.0f)) {
                float f12 = this.O;
                canvas.drawCircle(measuredWidth / 2, measuredHeight / 2, ((float) Math.sqrt((measuredWidth * measuredWidth) + (measuredHeight * measuredHeight))) * 0.5f * f12, y.g(ib.d.a(f12, ae.j.L(R.id.theme_color_fillingPositive))));
            }
            float f13 = this.O;
            int L = f13 == 0.0f ? ae.j.L(R.id.theme_color_textNeutral) : f13 == 1.0f ? ae.j.L(R.id.theme_color_fillingPositiveContent) : ib.d.d(ae.j.L(R.id.theme_color_textNeutral), ae.j.L(R.id.theme_color_fillingPositiveContent), this.O);
            if (this.O <= 0.5f) {
                TextPaint o02 = y.o0(this.T);
                int color = o02.getColor();
                o02.setColor(L);
                canvas.drawText(this.S, (measuredWidth / 2) - (this.U / 2.0f), (measuredHeight / 2) + a0.i(7.0f), o02);
                o02.setColor(color);
            }
            if (this.O >= 0.5f) {
                TextPaint o03 = y.o0(this.Q);
                int color2 = o03.getColor();
                o03.setColor(L);
                canvas.drawText(this.P, (measuredWidth / 2) - (this.R / 2.0f), (measuredHeight / 2) + a0.i(7.0f), o03);
                o03.setColor(color2);
            }
        }

        public void B1(boolean z10, boolean z11) {
            if (this.M != z10) {
                this.M = z10;
                float f10 = z10 ? 1.0f : 0.0f;
                if (z11) {
                    if (this.N == null) {
                        this.N = new eb.k(0, this, db.b.f7287b, 180L, this.O);
                    }
                    this.N.i(f10);
                    return;
                }
                eb.k kVar = this.N;
                if (kVar != null) {
                    kVar.l(f10);
                }
                setFactor(f10);
            }
        }

        public void C1(String str) {
            String upperCase = str.toUpperCase();
            this.P = upperCase;
            boolean M0 = je.g.M0(upperCase);
            this.Q = M0;
            this.R = v0.T1(this.P, y.o0(M0));
        }

        public void D1(String str) {
            String upperCase = str.toUpperCase();
            this.S = upperCase;
            boolean M0 = je.g.M0(upperCase);
            this.T = M0;
            this.U = v0.T1(this.S, y.o0(M0));
        }

        @Override
        public void n4(int i10, float f10, float f11, eb.k kVar) {
            setFactor(f10);
        }

        @Override
        public void o4(int i10, float f10, eb.k kVar) {
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.P == null) {
                C1(w.i1(R.string.Send));
            }
            if (this.S == null) {
                D1(w.i1(R.string.ShareBtnLink));
            }
        }

        public final void setFactor(float f10) {
            if (this.O != f10) {
                this.O = f10;
                invalidate();
            }
        }
    }

    public interface q {
        void a(long j10, TdApi.Chat chat, TdApi.MessageSendOptions messageSendOptions, ArrayList<TdApi.Function> arrayList);

        CharSequence b(long j10);
    }

    public y00(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Ai(m mVar, boolean z10, String str, o6.m mVar2) {
        v.N(w.j1((mVar.f10106d == 0 || !z10) ? (z10 || !this.f24495b.O6(mVar.f10105c[0].chatId)) ? R.string.ShareTextMessage : R.string.ShareTextPost : R.string.ShareTextComment, mVar2.f28153a, str));
    }

    public void Bi(int i10, SparseIntArray sparseIntArray) {
        boolean z10 = true;
        this.F1 = sparseIntArray.get(R.id.btn_hideAuthor) == R.id.btn_hideAuthor;
        this.G1 = sparseIntArray.get(R.id.btn_removeCaptions) == R.id.btn_removeCaptions;
        if (sparseIntArray.get(R.id.btn_sendNoSound) != R.id.btn_sendNoSound) {
            z10 = false;
        }
        this.H1 = z10;
    }

    public static void Zh(View view) {
        if (view instanceof u0) {
            ((u0) view).e(false, 0.0f);
        }
    }

    public static void ai(o6.m mVar) {
        j0.i(mVar.f28153a, mVar.f28154b ? R.string.CopiedLink : R.string.CopiedLinkPrivate);
    }

    public void bi(View view) {
        if (view instanceof u0) {
            float kh = kh();
            this.f10088z0 = kh;
            ((u0) view).setCurrentProgress(kh);
        }
    }

    public void ci(View view) {
        if (view instanceof u0) {
            float kh = kh();
            this.f10088z0 = kh;
            ((u0) view).e(true, kh);
        }
    }

    public void ei(final n nVar, TdApi.File file) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                y00.this.di(nVar);
            }
        });
    }

    public void fi(TdApi.File file) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                y00.this.Eh();
            }
        });
    }

    public void gi(String str) {
        try {
            File file = new File(j0.n().getFilesDir(), "vcf");
            if (file.exists() || file.mkdir()) {
                final File file2 = new File(file, "temp.vcf");
                if (file2.exists() || file2.createNewFile()) {
                    FileWriter fileWriter = new FileWriter(file2);
                    fileWriter.append((CharSequence) str);
                    fileWriter.flush();
                    fileWriter.close();
                    this.f24495b.hd().post(new Runnable() {
                        @Override
                        public final void run() {
                            y00.this.hi(file2);
                        }
                    });
                }
            }
        } catch (IOException e10) {
            Log.e("Cannot create VCF file", e10, new Object[0]);
        }
    }

    public void hi(File file) {
        if (!Sa()) {
            Lh(file, "text/x-vcard", w.i1(R.string.ShareTitleContact));
        }
    }

    public void ii(TdApi.File[] fileArr, String str, String str2, CharSequence charSequence, o6.m mVar) {
        Mh(fileArr, str, str2, w.j1(R.string.format_ShareTextSignature, charSequence, mVar.f28153a));
    }

    public void ji(String str, TdApi.File[] fileArr, String str2, String str3, int i10, o6.m mVar) {
        Mh(fileArr, str2, str3, w.j1(i10, w.j1(R.string.format_ShareAuthorMessage, str, mVar.f28153a)));
    }

    public void ki() {
        j2 j2Var;
        if (!Sa() && (j2Var = this.f10067k1) != null && !j2Var.u2() && !this.E1) {
            int Rh = Rh();
            if (Rh == 1) {
                Jh();
            } else {
                Log.w("cant export content #2: %d", Integer.valueOf(Rh));
            }
        }
    }

    public static ra kj(c3 c3Var) {
        return new ra(60, R.id.chat).G(c3Var).N(c3Var.a());
    }

    public void li(u0 u0Var, MotionEvent motionEvent) {
        Qi();
        La();
    }

    public void mi(TdApi.Chat chat, int i10) {
        if (this.f10069m1 != null) {
            c3 Fi = Fi(chat);
            this.f10069m1.add(i10, Fi);
            this.D0.s0(i10, kj(Fi));
            this.C0.A0();
        }
    }

    public void ni(int i10, int i11) {
        int i12;
        List<c3> list = this.f10069m1;
        if (list != null) {
            this.f10069m1.add(i11, list.remove(i10));
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.C0.getLayoutManager();
            int i13 = 0;
            if (linearLayoutManager != null) {
                i12 = linearLayoutManager.X1();
                View C = linearLayoutManager.C(i12);
                if (C != null) {
                    i13 = linearLayoutManager.U(C);
                }
            } else {
                i12 = -1;
            }
            this.D0.u1(i10, i11);
            this.C0.A0();
            if (i12 != -1) {
                linearLayoutManager.z2(i12, i13);
            }
        }
    }

    public void oi(int i10) {
        List<c3> list = this.f10069m1;
        if (list != null) {
            list.remove(i10);
            this.D0.j1(i10);
            this.C0.A0();
        }
    }

    public boolean qi(View view) {
        if (this.V0.p() <= 0) {
            return false;
        }
        Ti(true, false, false, null);
        return true;
    }

    public List ri(View view) {
        ArrayList arrayList = null;
        if (this.V0.p() == 0) {
            return null;
        }
        boolean z10 = false;
        if (this.V0.p() == 1) {
            List<c0.a> Y2 = this.f24495b.hd().Y2(this.V0.q(0).e(), false, false, !this.H1, true);
            if (Y2 == null) {
                Y2 = new ArrayList<>(1);
            }
            arrayList = Y2;
            arrayList.add(new c0.a((int) R.id.btn_sendAndOpen, w.i1(R.string.SendAndOpen), (int) R.drawable.baseline_forward_24));
        } else {
            int i10 = 0;
            while (true) {
                if (i10 >= this.V0.p()) {
                    break;
                } else if (this.V0.q(i10).t()) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                arrayList = new ArrayList(2);
                arrayList.add(new c0.a((int) R.id.btn_sendScheduled, w.i1(R.string.SendSchedule), (int) R.drawable.baseline_date_range_24));
                if (!this.H1) {
                    arrayList.add(new c0.a((int) R.id.btn_sendNoSound, w.i1(R.string.SendNoSound), (int) R.drawable.baseline_notifications_off_24));
                }
            }
        }
        if (Ei()) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(new c0.a((int) R.id.btn_settings, w.i1(R.string.MoreForwardOptions), (int) R.drawable.baseline_more_horiz_24).g(16384L));
        }
        return arrayList;
    }

    public static boolean sh(TdApi.Message message) {
        return message.content.getConstructor() == -512684966;
    }

    public void si(boolean z10, boolean z11, TdApi.MessageSchedulingState messageSchedulingState, boolean z12) {
        Li(z10, z11, messageSchedulingState, false);
    }

    public void ti(View view, View view2) {
        k0.e<c3> eVar = this.V0;
        if (eVar != null && eVar.p() != 0) {
            final boolean z10 = view2.getId() == R.id.btn_done;
            int id2 = view.getId();
            if (id2 == R.id.btn_sendAndOpen) {
                Li(z10, false, null, true);
            } else if (id2 != R.id.btn_settings) {
                switch (id2) {
                    case R.id.btn_sendNoSound:
                        Li(z10, true, null, false);
                        return;
                    case R.id.btn_sendOnceOnline:
                        Li(z10, false, new TdApi.MessageSchedulingStateSendWhenOnline(), false);
                        return;
                    case R.id.btn_sendScheduled:
                        this.f24495b.hd().L8(this, this.V0.p() == 1 ? this.V0.q(0).e() : 0L, false, new hj.o() {
                            @Override
                            public final void a(boolean z11, TdApi.MessageSchedulingState messageSchedulingState, boolean z12) {
                                y00.this.si(z10, z11, messageSchedulingState, z12);
                            }
                        }, null);
                        return;
                    default:
                        return;
                }
            } else {
                gj();
            }
        }
    }

    public static void ui(View view) {
        if (view instanceof u0) {
            ((u0) view).e(false, 0.0f);
        }
    }

    public void vi() {
        this.R0 = true;
        W8(null);
        this.R0 = false;
    }

    public void wi() {
        wd(new Runnable() {
            @Override
            public final void run() {
                y00.this.vi();
            }
        });
    }

    public void yi(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f24495b.v4().o((TdApi.Function) it.next(), this.f24495b.Z9());
        }
    }

    public void zi() {
        this.f24495b.hd().h7(this, this.V0.q(0).a(), null);
    }

    @Override
    public int A9() {
        return 4;
    }

    public final void Ah() {
        Zi(!Na() && U9() != null && (S9() || this.C1));
    }

    public final void Bh() {
        if (this.C1) {
            z0 z0Var = this.B1;
            if (z0Var != null) {
                z0Var.setVisibility(8);
                if (this.D1) {
                    this.B1.P2(this.F0);
                }
            }
            this.C1 = false;
            this.O0.setImageResource(R.drawable.deproko_baseline_insert_emoticon_26);
            Ah();
        }
    }

    public final void Ch() {
        if (!this.E1) {
            m x92 = x9();
            if (this.f10076t0 == 0) {
                o6 o6Var = this.f24495b;
                boolean z10 = false;
                TdApi.Message message = x92.f10105c[0];
                boolean z11 = x92.f10105c.length > 1;
                if (x92.f10106d != 0) {
                    z10 = true;
                }
                o6Var.K5(message, z11, z10, l00.f8531a);
            }
            Ji();
            j2 j2Var = this.f10067k1;
            if (j2Var != null) {
                j2Var.s2(true);
            }
        }
    }

    public final void Ci() {
        if (this.f10083w1) {
            this.f10083w1 = false;
            this.f10071o1.i(this.f10085x1);
        }
    }

    public final int Dh() {
        View C;
        int top;
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.C0.getLayoutManager();
        int X1 = gridLayoutManager.X1();
        int V2 = gridLayoutManager.V2();
        if (X1 == -1 || X1 >= V2 || (C = gridLayoutManager.C(X1)) == null || (top = C.getTop() - a0.i(4.0f)) <= 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < X1 && i10 <= V2; i11++) {
            i10 += gridLayoutManager.Z2().f(i11);
        }
        if (i10 <= V2) {
            return top;
        }
        return 0;
    }

    public final void Di() {
        if (!this.f10068l1) {
            this.f10068l1 = true;
            this.f10067k1.P2(get(), oh());
        }
    }

    @Override
    public void Ee(boolean z10) {
        if (!z10 || Xh() == 0) {
            super.Ee(z10);
            this.f10064h1 = false;
            return;
        }
        this.f10064h1 = true;
    }

    public final void Eh() {
        d1 d1Var;
        if (this.f10084x0 == null) {
            return;
        }
        if (this.f10088z0 != kh() && (d1Var = this.R) != null) {
            d1Var.d4(W9(), R.id.menu_btn_forward, new kb.j() {
                @Override
                public final void a(Object obj) {
                    y00.this.bi((View) obj);
                }
            });
        }
    }

    public final boolean Ei() {
        if (this.f10076t0 == 0) {
            return true;
        }
        for (int i10 = 0; i10 < this.W0.l(); i10++) {
            long f10 = this.W0.f(i10);
            if (!(this.f24495b.k7(f10) || ob.a.j(f10))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean F(View view, TdApi.Animation animation) {
        return b1.b(this, view, animation);
    }

    @Override
    public boolean F1(float f10, float f11) {
        d1 d1Var = this.R;
        return d1Var != null && f11 < d1Var.getTranslationY() - ((float) d1.a3(true));
    }

    public final void xi(List<c3> list) {
        List<c3> list2 = this.f10069m1;
        boolean z10 = list2 == null;
        if (z10) {
            this.f10069m1 = list;
        } else {
            ib.b.m(list2, list2.size() + list.size());
            this.f10069m1.addAll(list);
        }
        int size = this.D0.D0().size();
        ih(list, this.D0.D0());
        iq iqVar = this.D0;
        iqVar.M(size, iqVar.D0().size() - size);
        if (z10) {
            this.C0.setAdapter(this.D0);
            Di();
            return;
        }
        this.C0.A0();
    }

    public final c3 Fi(TdApi.Chat chat) {
        c3 c3Var = new c3(this.f24495b, this.f10078u0, chat, false, null);
        c3Var.D();
        c3Var.C();
        return c3Var;
    }

    @Override
    public void G6(e8 e8Var, TdApi.Chat chat, final int i10, final int i11, o6.g gVar) {
        wd(new Runnable() {
            @Override
            public final void run() {
                y00.this.ni(i10, i11);
            }
        });
    }

    @Override
    public View G9() {
        return this.H0;
    }

    public final void Gh() {
        if (this.f10084x0 == null && this.f10082w0 != null) {
            this.f10084x0 = new k0.h<>(this.f10082w0.size());
            for (TdApi.File file : this.f10082w0) {
                this.f10084x0.j(file.f19913id, new n(file));
            }
            d1 d1Var = this.R;
            if (d1Var != null) {
                d1Var.d4(W9(), R.id.menu_btn_forward, new kb.j() {
                    @Override
                    public final void a(Object obj) {
                        y00.this.ci((View) obj);
                    }
                });
            }
            for (int i10 = 0; i10 < this.f10084x0.n(); i10++) {
                final n o10 = this.f10084x0.o(i10);
                o10.f10130b = this.f24495b.m5().t(o10.f10129a, -1L, new kb.j() {
                    @Override
                    public final void a(Object obj) {
                        y00.this.ei(o10, (TdApi.File) obj);
                    }
                }, new kb.j() {
                    @Override
                    public final void a(Object obj) {
                        y00.this.fi((TdApi.File) obj);
                    }
                });
            }
        }
    }

    public final void Gi(float f10) {
        if (f10 == 1.0f) {
            Ui(true);
            Fd(this.F0, false);
            return;
        }
        Ed(null);
    }

    public final void Hh() {
        int Xh = Xh();
        if (Xh > 0) {
            this.f10074r1 = true;
            this.f10075s1 = Xh;
            this.C0.scrollBy(0, Xh);
            return;
        }
        this.f10074r1 = false;
    }

    public final void di(n nVar) {
        j2 j2Var;
        if (this.f10084x0 != null && !Sa() && (j2Var = this.f10067k1) != null && !j2Var.u2() && !this.E1) {
            Eh();
            nVar.f10130b = null;
            int i10 = this.f10086y0 + 1;
            this.f10086y0 = i10;
            if (i10 == this.f10084x0.n()) {
                d1 d1Var = this.R;
                if (d1Var != null) {
                    d1Var.d4(W9(), R.id.menu_btn_forward, k00.f8454a);
                }
                Kh();
            }
        }
    }

    @Override
    public boolean Ie() {
        return false;
    }

    public final void Ih(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BEGIN:VCARD\r\n");
        sb2.append("VERSION:3.0\r\n");
        sb2.append("N:");
        sb2.append(ce.c0.j0(str3));
        sb2.append(";");
        sb2.append(ce.c0.j0(str2));
        sb2.append("\r\n");
        sb2.append("FN:");
        sb2.append(ce.c0.j0(hd.t2.q2(str2, str3)));
        sb2.append("\r\n");
        sb2.append("TEL;TYPE=cell:");
        sb2.append(ce.c0.j0(ce.c0.y(str, true, true)));
        sb2.append("\r\n");
        if (!ib.i.i(str4)) {
            sb2.append("URL:");
            sb2.append(ce.c0.j0(this.f24495b.Xc(str4)));
            sb2.append("\r\n");
        }
        sb2.append("END:VCARD\r\n");
        final String sb3 = sb2.toString();
        gd.l.a().b(new Runnable() {
            @Override
            public final void run() {
                y00.this.gi(sb3);
            }
        });
    }

    public final boolean Ii(float f10) {
        boolean z10 = Xh() <= d1.getTopOffset() * 2;
        this.f10087y1 = z10;
        if (z10) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.C0.getLayoutManager();
            int X1 = linearLayoutManager.X1();
            this.f10079u1 = X1;
            View C = linearLayoutManager.C(X1);
            this.f10081v1 = C != null ? C.getTop() : 0;
        }
        if (!this.f10073q1 || f10 >= 1.0f) {
            return false;
        }
        Ui(false);
        return true;
    }

    @Override
    public void J(int i10, View view) {
        switch (i10) {
            case R.id.btn_menu_customize:
                gj();
                return;
            case R.id.menu_btn_clear:
                T8();
                return;
            case R.id.menu_btn_copy:
                Ch();
                return;
            case R.id.menu_btn_forward:
                Jh();
                return;
            case R.id.menu_btn_search:
                if (this.f10069m1 != null) {
                    Yc();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void J8(float f10, boolean z10) {
        super.J8(f10, z10);
        cj(z10 ? f10 : 1.0f - f10);
        boolean z11 = true;
        aj(f10 == 1.0f);
        j2 j2Var = this.f10067k1;
        if (f10 == 0.0f) {
            z11 = false;
        }
        j2Var.setIgnoreBottom(z11);
    }

    @Override
    public boolean Je() {
        return true;
    }

    public final void Jh() {
        throw new UnsupportedOperationException("Method not decompiled: de.y00.Jh():void");
    }

    public final void Ji() {
        if (!this.E1) {
            this.E1 = true;
            m x92 = x9();
            if (x92.f10123u != null) {
                x92.f10123u.run();
            }
        }
    }

    public final void Kh() {
        this.f24495b.hd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                y00.this.ki();
            }
        }, 100L);
    }

    public final void Ki() {
        if (!this.C1) {
            z0 z0Var = this.B1;
            if (z0Var == null) {
                z0 z0Var2 = new z0(t());
                this.B1 = z0Var2;
                z0Var2.Z1(this, false, this, this, false);
                this.N0.addView(this.B1);
                this.Q0.getViewTreeObserver().addOnPreDrawListener(this.B1);
            } else {
                z0Var.setVisibility(0);
            }
            boolean S9 = S9();
            this.D1 = S9;
            this.C1 = true;
            if (S9) {
                this.O0.setImageResource(R.drawable.baseline_keyboard_24);
                this.B1.Y1(this.F0);
            } else {
                this.O0.setImageResource(R.drawable.baseline_direction_arrow_down_24);
            }
            Ah();
        }
    }

    @Override
    public int L9() {
        return R.id.theme_color_filling;
    }

    @Override
    public void La() {
        super.La();
        x.c(this.F0);
        Oh();
    }

    public final void Lh(File file, String str, String str2) {
        Uri L = v0.L(file);
        if (L != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", L);
            intent.setType(str);
            this.f24493a.startActivity(Intent.createChooser(intent, str2));
        }
    }

    public final void Li(boolean z10, boolean z11, TdApi.MessageSchedulingState messageSchedulingState, boolean z12) {
        if (!z10) {
            Ti(z12, false, z11, messageSchedulingState);
        } else if (!this.Y0) {
            this.Y0 = true;
            this.Z0 = z11;
            this.f10057a1 = messageSchedulingState;
            this.f10058b1 = z12;
            La();
        }
    }

    public final void Mh(TdApi.File[] fileArr, String str, String str2, CharSequence charSequence) {
        Intent intent;
        int i10;
        int i11;
        if (fileArr.length == 1) {
            Uri L = v0.L(new File(fileArr[0].local.path));
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
                Uri L2 = v0.L(new File(file.local.path));
                if (L2 == null) {
                    Si(arrayList);
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
        if (!ib.i.i(charSequence)) {
            intent.putExtra("android.intent.extra.TEXT", charSequence);
        }
        if (ib.i.i(str2)) {
            if (str.equals("image/gif")) {
                i11 = R.string.ShareTitleGif;
                i10 = R.string.ShareTitleGifX;
            } else if (str.startsWith("image/")) {
                i11 = R.string.ShareTitleImage;
                i10 = R.string.ShareTitleImageX;
            } else if (str.startsWith("video/")) {
                i11 = R.string.ShareTitleVideo;
                i10 = R.string.ShareTitleVideoX;
            } else if (str.startsWith("audio/")) {
                i11 = R.string.ShareTitleAudio;
                i10 = R.string.ShareTitleAudioX;
            } else {
                i11 = R.string.ShareTitleFile;
                i10 = R.string.ShareTitleFileX;
            }
            str2 = fileArr.length > 1 ? w.o2(i10, fileArr.length) : w.i1(i11);
        }
        this.f24493a.startActivity(Intent.createChooser(intent, str2));
    }

    public final void Mi(List<k8.b> list) {
        final ArrayList arrayList = new ArrayList(list.size());
        for (k8.b bVar : list) {
            arrayList.add(Fi(bVar.f27458a));
        }
        wd(new Runnable() {
            @Override
            public final void run() {
                y00.this.xi(arrayList);
            }
        });
    }

    public final void Nh(TdApi.Message message) {
        if (message.content.getConstructor() == -512684966) {
            TdApi.Contact contact = ((TdApi.MessageContact) message.content).contact;
            Ih(contact.phoneNumber, contact.firstName, contact.lastName, contact.userId != 0 ? this.f24495b.e2().Q2(contact.userId) : null, contact.vcard);
        }
    }

    public final void Ni() {
        if (this.C1) {
            Bh();
        } else {
            Ki();
        }
    }

    @Override
    public int O9() {
        return R.id.theme_color_icon;
    }

    public final void Oh() {
        if (this.C1) {
            z0 z0Var = this.B1;
            if (z0Var != null) {
                z0Var.setVisibility(8);
            }
            this.C1 = false;
            this.O0.setImageResource(R.drawable.deproko_baseline_insert_emoticon_26);
            Ah();
        }
    }

    public final void Oi() {
        boolean z10 = false;
        this.f10066j1 = false;
        this.C0.C1();
        if (Xh() == 0) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this.C0.getLayoutManager();
            int X1 = gridLayoutManager.X1();
            View C = X1 == 0 ? gridLayoutManager.C(0) : null;
            if (X1 > 0 || (C != null && C.getTop() < a0.i(4.0f))) {
                z10 = true;
            }
            this.U0 = z10;
            return;
        }
        this.U0 = false;
    }

    @Override
    public boolean P4(View view, dd.l lVar, boolean z10, TdApi.MessageSchedulingState messageSchedulingState) {
        return b1.c(this, view, lVar, z10, messageSchedulingState);
    }

    @Override
    public void Pf() {
        final int i10 = this.f10061e1;
        if (i10 > 0) {
            this.f10061e1 = 0;
            vd(new Runnable() {
                @Override
                public final void run() {
                    y00.this.pi(i10);
                }
            }, 50L);
            this.f10061e1 = 0;
        }
    }

    public final int Ph() {
        int i10 = 0;
        int Wh = ((Wh() / 2) - d1.a3(true)) - (this.f10070n1 ? lh() : 0);
        if (!this.L0) {
            i10 = a0.i(56.0f) / 2;
        }
        return Wh + i10;
    }

    public final boolean Pi(c3 c3Var) {
        if (this.X0 || !c3Var.u() || this.V0.p() != 0) {
            return false;
        }
        this.V0.k(c3Var.a(), c3Var);
        this.W0.a(c3Var.a());
        Ti(false, true, false, null);
        return true;
    }

    @Override
    public int Q9() {
        return R.id.theme_color_text;
    }

    @Override
    public boolean Qb(boolean z10, int i10, Animator.AnimatorListener animatorListener) {
        return false;
    }

    @Override
    public boolean Qf(View view, c3 c3Var) {
        if (c3Var.i() == 0) {
            c3Var = new c3(this.f24495b, c3Var.j(), c3Var.a(), false);
        }
        if (!Yh(c3Var.a()) && (Pi(c3Var) || !ij(view, c3Var))) {
            return true;
        }
        int P0 = this.D0.P0(c3Var.a());
        if (P0 != -1) {
            View C = this.C0.getLayoutManager().C(P0);
            if (C != null) {
                ((y3) C).l1(true, false);
            } else {
                this.D0.I(P0);
            }
        }
        this.f10080v0.o(c3Var.a(), null, new Runnable() {
            @Override
            public final void run() {
                y00.this.wi();
            }
        });
        return true;
    }

    public final CharSequence Qh(long j10) {
        m x92 = x9();
        TdApi.Chat P3 = this.f24495b.P3(j10);
        int i10 = this.f10076t0;
        int i11 = 0;
        if (i10 == 0) {
            TdApi.Message[] messageArr = x92.f10105c;
            int length = messageArr.length;
            while (i11 < length) {
                TdApi.Message message = messageArr[i11];
                if (ob.a.j(j10) && !hd.t2.U(message.content)) {
                    return w.i1(R.string.SecretChatForwardError);
                }
                if (message.content.getConstructor() == -662130099 && !((TdApi.MessagePoll) message.content).poll.isAnonymous && this.f24495b.O6(j10)) {
                    return w.i1(R.string.PollPublicForwardHint);
                }
                CharSequence b62 = this.f24495b.b6(P3, message);
                if (b62 != null) {
                    return b62;
                }
                i11++;
            }
        } else if (i10 == 1) {
            return this.f24495b.M5(P3);
        } else {
            if (i10 == 3) {
                return this.f24495b.I5(P3);
            }
            if (i10 == 5) {
                return this.f24495b.e6(P3);
            }
            if (i10 == 6) {
                return x92.f10122t.b(j10);
            }
            if (i10 == 7) {
                return this.f24495b.a6(P3, x92.f10115m);
            }
            if (i10 == 8) {
                qd.b[] bVarArr = x92.f10124v;
                int length2 = bVarArr.length;
                while (i11 < length2) {
                    CharSequence a62 = this.f24495b.a6(P3, bVarArr[i11].m(null));
                    if (a62 != null) {
                        return a62;
                    }
                    i11++;
                }
            }
        }
        return null;
    }

    public final void Qi() {
        this.f10074r1 = false;
    }

    @Override
    public void R0(e8 e8Var, TdApi.Chat chat, int i10) {
        e0.d(this, e8Var, chat, i10);
    }

    @Override
    public int R9() {
        return R.id.controller_share;
    }

    public final int Rh() {
        TdApi.Message[] messageArr;
        m x92 = x9();
        if (!ib.i.i(x92.f10110h)) {
            return 1;
        }
        int i10 = this.f10076t0;
        ArrayList arrayList = null;
        String str = null;
        if (i10 != 0) {
            if (i10 != 8) {
                return (i10 == 3 || i10 == 4) ? 1 : 0;
            }
            if (x92.f10124v.length == 0) {
                return 0;
            }
            for (qd.b bVar : x92.f10124v) {
                String I = bVar.I();
                if (ib.i.i(I)) {
                    return 0;
                }
                if (str == null) {
                    str = I;
                } else if (!str.equals(I)) {
                    return 0;
                }
            }
            return 1;
        } else if (x92.f10105c.length == 0) {
            return 0;
        } else {
            if (x92.f10105c.length == 1 && sh(x92.f10105c[0])) {
                return 1;
            }
            String str2 = null;
            long j10 = 0;
            for (TdApi.Message message : x92.f10105c) {
                String Sh = Sh(message);
                if (ib.i.i(Sh)) {
                    return 0;
                }
                if (str2 == null) {
                    str2 = Sh;
                } else if (!str2.equals(Sh)) {
                    return 0;
                }
                long O0 = ob.e.O0(message);
                if (O0 == 0) {
                    return 0;
                }
                if (j10 == 0) {
                    j10 = O0;
                }
                TdApi.File Th = Th(message);
                if (Th == null) {
                    return 0;
                }
                if (!hd.t2.V2(Th)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Th);
                }
            }
            this.f10082w0 = arrayList;
            return arrayList != null ? 2 : 1;
        }
    }

    public final void Ri() {
        if (this.f10074r1) {
            this.C0.scrollBy(0, -this.f10075s1);
            this.f10074r1 = false;
        }
    }

    public final String Sh(TdApi.Message message) {
        if (message == null || message.sendingState != null || Th(message) == null) {
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
                return (ib.i.i(str) || !str.startsWith("audio/")) ? "audio/*" : str;
            case TdApi.MessageDocument.CONSTRUCTOR:
                TdApi.MessageDocument messageDocument = (TdApi.MessageDocument) message.content;
                String str2 = messageDocument.document.mimeType;
                if (ib.i.i(str2)) {
                    str2 = ce.e0.g(v0.v0(messageDocument.document.fileName));
                }
                return ib.i.i(str2) ? "application/octet-stream" : str2;
            case TdApi.MessageAnimation.CONSTRUCTOR:
                TdApi.MessageAnimation messageAnimation = (TdApi.MessageAnimation) message.content;
                if (messageAnimation.isSecret) {
                    return null;
                }
                String str3 = messageAnimation.animation.mimeType;
                return !ib.i.i(str3) ? (str3.startsWith("video/") || str3.equals("image/gif")) ? str3 : "video/*" : "video/*";
            case TdApi.MessageText.CONSTRUCTOR:
                return hd.t2.O1(((TdApi.MessageText) message.content).webPage);
            case TdApi.MessageVideo.CONSTRUCTOR:
                TdApi.MessageVideo messageVideo = (TdApi.MessageVideo) message.content;
                if (messageVideo.isSecret) {
                    return null;
                }
                String str4 = messageVideo.video.mimeType;
                return (ib.i.i(str4) || !str4.startsWith("video/")) ? "video/*" : str4;
            default:
                return null;
        }
    }

    public final void Si(List<Uri> list) {
        for (Uri uri : list) {
            this.f24493a.revokeUriPermission(uri, 3);
        }
    }

    @Override
    public void T6(z0 z0Var, boolean z10) {
    }

    public final TdApi.File Th(TdApi.Message message) {
        k0.h<n> hVar;
        n e10;
        TdApi.File j12 = hd.t2.j1(message);
        return (j12 == null || (hVar = this.f10084x0) == null || (e10 = hVar.e(j12.f19913id)) == null) ? j12 : e10.f10129a;
    }

    public final void Ti(boolean z10, boolean z11, boolean z12, TdApi.MessageSchedulingState messageSchedulingState) {
        boolean z13;
        TdApi.MessageSchedulingState messageSchedulingState2;
        int i10;
        int i11;
        if (this.V0.p() != 0 && !this.E1) {
            final ArrayList<TdApi.Function> arrayList = new ArrayList<>();
            boolean z14 = true;
            TdApi.FormattedText d10 = this.F0.d(true);
            boolean z15 = !ob.e.c1(d10);
            m x92 = x9();
            if (z12 || this.H1) {
                messageSchedulingState2 = messageSchedulingState;
                z13 = true;
            } else {
                messageSchedulingState2 = messageSchedulingState;
                z13 = false;
            }
            TdApi.MessageSendOptions messageSendOptions = new TdApi.MessageSendOptions(z13, false, false, messageSchedulingState2);
            TdApi.MessageSendOptions messageSendOptions2 = messageSendOptions.disableNotification ? new TdApi.MessageSendOptions(true, messageSendOptions.fromBackground, false, messageSendOptions.schedulingState) : messageSendOptions;
            int i12 = 0;
            while (i12 < this.W0.l()) {
                long f10 = this.W0.f(i12);
                if (!fj(null, f10, z14)) {
                    TdApi.Chat W2 = this.f24495b.W2(this.W0.f(i12));
                    if (W2 == null) {
                        long fa2 = this.f24495b.fa();
                        if (f10 == fa2) {
                            this.f24495b.v4().o(new TdApi.CreatePrivateChat(fa2, z14), this.f24495b.yc());
                        } else {
                            throw new RuntimeException("Unknown chatId:" + f10);
                        }
                    }
                    TdApi.MessageSendOptions messageSendOptions3 = ob.a.j(f10) ? messageSendOptions2 : messageSendOptions;
                    if (z15) {
                        arrayList.add(new TdApi.SendMessage(f10, 0L, 0L, messageSendOptions3, null, new TdApi.InputMessageText(d10, false, false)));
                    }
                    switch (this.f10076t0) {
                        case 0:
                            i10 = i12;
                            if (hd.t2.y0(f10, x92.f10105c, this.F1, this.G1, messageSendOptions3, arrayList)) {
                                break;
                            } else {
                                return;
                            }
                        case 1:
                            i11 = i12;
                            arrayList.add(new TdApi.SendMessage(f10, 0L, 0L, messageSendOptions3, null, new TdApi.InputMessageText(x92.f10107e, false, false)));
                            i10 = i11;
                            break;
                        case 2:
                            i11 = i12;
                            arrayList.add(new TdApi.SendMessage(f10, 0L, 0L, messageSendOptions3, null, new TdApi.InputMessageForwarded(x92.f10113k.chatId, x92.f10113k.f19946id, x92.f10114l, null)));
                            i10 = i11;
                            break;
                        case 3:
                            i11 = i12;
                            arrayList.add(new TdApi.SendMessage(f10, 0L, 0L, messageSendOptions3, null, new TdApi.InputMessageDocument(hd.t2.d0(x92.f10116n), null, false, null)));
                            i10 = i11;
                            break;
                        case 4:
                            i11 = i12;
                            arrayList.add(new TdApi.SendMessage(f10, 0L, 0L, messageSendOptions3, null, new TdApi.InputMessageContact(new TdApi.Contact(x92.f10118p.phoneNumber, x92.f10118p.firstName, x92.f10118p.lastName, null, x92.f10112j))));
                            i10 = i11;
                            break;
                        case 5:
                            arrayList.add(new TdApi.SendMessage(f10, 0L, 0L, messageSendOptions3, null, new TdApi.InputMessageSticker(new TdApi.InputFileId(x92.f10119q.sticker.f19913id), null, 0, 0, null)));
                            i10 = i12;
                            break;
                        case 6:
                            x92.f10122t.a(f10, W2, messageSendOptions3, arrayList);
                            i10 = i12;
                            break;
                        case 7:
                            arrayList.add(new TdApi.SendMessage(f10, 0L, 0L, messageSendOptions3, null, x92.f10115m));
                            i10 = i12;
                            break;
                        case 8:
                            TdApi.FormattedText L4 = ib.i.i(x92.f10125w) ? null : hd.t2.L4(x92.f10125w);
                            qd.b[] bVarArr = x92.f10124v;
                            int length = bVarArr.length;
                            int i13 = 0;
                            while (i13 < length) {
                                qd.b bVar = bVarArr[i13];
                                TdApi.FormattedText formattedText = L4;
                                TdApi.InputMessageContent m10 = bVar.m(bVar == x92.f10124v[x92.f10124v.length + (-1)] ? formattedText : null);
                                if (m10 != null) {
                                    arrayList.add(new TdApi.SendMessage(f10, 0L, 0L, messageSendOptions3, null, m10));
                                    i13++;
                                    L4 = formattedText;
                                } else {
                                    return;
                                }
                            }
                            i10 = i12;
                            break;
                        default:
                            return;
                    }
                    i12 = i10 + 1;
                    z14 = true;
                } else {
                    return;
                }
            }
            if (arrayList.size() == 1) {
                this.f24495b.v4().o(arrayList.get(0), this.f24495b.Z9());
            } else {
                this.f24495b.bb(new Runnable() {
                    @Override
                    public final void run() {
                        y00.this.yi(arrayList);
                    }
                });
            }
            Ji();
            if (z11) {
                j0.y0(R.string.DoneSave, 0);
            } else if ((x92.f10120r || z10) && this.V0.p() == 1) {
                v4<?> F = t().Q1().F();
                if (!(F instanceof rh) || !((rh) F).zj(this.V0.q(0).a(), 0L)) {
                    j0.e0(new Runnable() {
                        @Override
                        public final void run() {
                            y00.this.zi();
                        }
                    }, 250L);
                }
            } else {
                j0.y0(R.string.Done, 0);
            }
            this.f10067k1.s2(true);
        }
    }

    @Override
    public int[] U5(vc.q qVar, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
        return vc.q.e(qVar, view, view2, i10, i11, i12, i13, i14, this.A0, this.N0, this.B1);
    }

    @Override
    public void U6(e8 e8Var, int i10) {
        e0.c(this, e8Var, i10);
    }

    public final int Uh() {
        return rh() ? 2 : 1;
    }

    public final void Ui(boolean z10) {
        if (this.f10073q1 != z10) {
            this.f10073q1 = z10;
            this.C0.setTranslationY(mh());
            ((RelativeLayout.LayoutParams) this.C0.getLayoutParams()).addRule(2, z10 ? R.id.share_bottom : this.L0 ? R.id.btn_send : 0);
            CustomRecyclerView customRecyclerView = this.C0;
            customRecyclerView.setLayoutParams(customRecyclerView.getLayoutParams());
            this.C0.A0();
            if (this.f10087y1 && this.f10079u1 == 0) {
                if (z10) {
                    this.C0.scrollBy(0, lh() * (-1));
                } else {
                    ((LinearLayoutManager) this.C0.getLayoutManager()).z2(this.f10079u1, this.f10081v1 - Ph());
                }
            }
            this.F0.setEnabled(z10);
        }
    }

    @Override
    public boolean V0() {
        return true;
    }

    public final String Vh() {
        m x92 = x9();
        if (x92.f10128z != null) {
            return w.i1(x92.f10127y);
        }
        if (!ib.i.i(x92.f10108f) && !ib.i.i(x92.f10109g)) {
            return x92.f10109g;
        }
        if (this.f10076t0 != 0) {
            return w.i1(R.string.ShareBtnLink);
        }
        return w.i1(this.f24495b.O6(x92.f10105c[0].chatId) ? R.string.ShareBtnPost : R.string.ShareBtnMessage);
    }

    public void Vi(m mVar) {
        super.Ad(mVar);
        this.f10076t0 = mVar.f10103a;
        this.f10078u0 = mVar.f10104b != null ? mVar.f10104b : ob.b.f19338a;
    }

    @Override
    public int W9() {
        return R.id.menu_search;
    }

    public final int Wh() {
        return a0.f();
    }

    public final void Wi(boolean z10) {
        if (this.S0 != z10) {
            this.S0 = z10;
            this.C0.setScrollDisabled(!z10);
            if (z10 && this.f10066j1) {
                Oi();
            }
        }
    }

    @Override
    public void X2(e8 e8Var, final TdApi.Chat chat, final int i10, o6.g gVar) {
        wd(new Runnable() {
            @Override
            public final void run() {
                y00.this.mi(chat, i10);
            }
        });
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.SendTo);
    }

    public final int Xh() {
        return Math.max(0, (int) (this.R.getTranslationY() - d1.getTopOffset()));
    }

    public final void Xi(float f10) {
        if (this.f10072p1 != f10) {
            this.f10072p1 = f10;
            this.C0.setTranslationY(mh());
            xh();
            yh();
            if (!this.L0) {
                d3 d3Var = this.K0;
                float f11 = this.f10072p1;
                d3Var.setAlpha(f11 >= 0.2f ? 1.0f : f11 / 0.2f);
            }
            x2.l lVar = this.f10089z1;
            if (lVar != null) {
                lVar.U();
            }
        }
    }

    @Override
    public void Y6(e8 e8Var, TdApi.Chat chat, final int i10, o6.g gVar) {
        wd(new Runnable() {
            @Override
            public final void run() {
                y00.this.oi(i10);
            }
        });
    }

    public final boolean Yh(long j10) {
        return this.V0.f(j10) != null;
    }

    public final void Yi(boolean z10) {
        CharSequence charSequence;
        if (this.f10070n1 != z10) {
            this.f10070n1 = z10;
            if (z10) {
                long f10 = this.W0.l() == 1 ? this.W0.f(0) : 0L;
                if (ob.a.j(f10)) {
                    charSequence = null;
                } else if (this.f24495b.k7(f10)) {
                    charSequence = w.i1(R.string.HoldToRemind);
                } else if (ob.a.i(f10) && this.f24495b.e2().H2(ob.a.q(f10))) {
                    charSequence = w.m1(R.string.HoldToSchedule2, this.f24495b.e2().C2(ob.a.q(f10)));
                } else if (this.f24495b.O6(f10)) {
                    charSequence = w.i1(R.string.HoldToSilentBroadcast);
                } else {
                    charSequence = w.i1(R.string.HoldToSchedule);
                }
                long j10 = 16384;
                if (this.f10076t0 != 0 || !he.i.c2().X2(16384L)) {
                    j10 = 8192;
                } else {
                    charSequence = w.i1(R.string.HoldToSendAsCopy);
                }
                if (charSequence != null && he.i.c2().X2(j10)) {
                    he.i.c2().w2(j10);
                    if (j10 != 8192) {
                        he.i.c2().w2(8192L);
                    }
                    this.f10089z1 = t().I3().i(new c(null)).D(this.f24495b, charSequence).F();
                }
            } else {
                x2.l lVar = this.f10089z1;
                if (lVar != null) {
                    lVar.J();
                }
                Qi();
                La();
            }
            float f11 = 0.0f;
            boolean z11 = qa() == 0.0f;
            if (z10) {
                f11 = 1.0f;
            }
            if (z11) {
                if (this.f10071o1 == null) {
                    this.f10071o1 = new eb.k(1, this, db.b.f7287b, 180L, this.f10072p1);
                }
                if (Ii(f11)) {
                    this.f10083w1 = true;
                    this.f10085x1 = f11;
                    return;
                }
                this.f10071o1.i(f11);
                return;
            }
            eb.k kVar = this.f10071o1;
            if (kVar != null) {
                kVar.l(f11);
            }
            this.f10083w1 = false;
            Xi(f11);
            Gi(f11);
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f10080v0.G(this);
        p0.n(this.C0);
        t1.b().d(this.D0);
        uh();
        t().u2(this, false);
    }

    public final void Zi(boolean z10) {
        if (this.A1 != z10) {
            this.A1 = z10;
            if (z10) {
                Hh();
            } else {
                Ri();
            }
            bj(z10);
            if (!z10 && this.Y0) {
                this.Y0 = false;
                Ti(this.f10058b1, false, this.Z0, this.f10057a1);
            }
        }
    }

    public final void aj(boolean z10) {
        if (this.f10065i1 != z10) {
            this.f10065i1 = z10;
            if (z10) {
                if (this.S0) {
                    Oi();
                } else {
                    this.f10066j1 = true;
                }
                Oh();
                Ah();
                return;
            }
            this.f10066j1 = false;
        }
    }

    @Override
    public long b() {
        return b1.a(this);
    }

    public boolean a(TdApi.Chat chat) {
        if (!this.f24495b.c3(chat)) {
            return false;
        }
        o6.n Y5 = this.f24495b.Y5(chat, R.id.right_sendMessages);
        return Y5 == null || !Y5.a();
    }

    public final void bj(boolean z10) {
        if (this.f10077t1 != z10) {
            this.f10077t1 = z10;
            int i10 = 0;
            this.J0.setVisibility(z10 ? 8 : 0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.N0.getLayoutParams();
            if (z10) {
                layoutParams.addRule(2, 0);
                layoutParams.addRule(12);
            } else {
                layoutParams.addRule(2, R.id.btn_send);
                layoutParams.addRule(12, 0);
            }
            ImageView imageView = this.P0;
            if (!z10) {
                i10 = 4;
            }
            imageView.setVisibility(i10);
        }
    }

    @Override
    public boolean c5() {
        return this.F0.getText().length() == 0;
    }

    public final void cj(float f10) {
        int i10;
        if (!this.S0 && (i10 = this.f10059c1) != 0) {
            int i11 = (int) (i10 * f10);
            this.C0.scrollBy(0, i11 - this.f10060d1);
            this.f10060d1 = i11;
        }
    }

    public final void dj() {
        final boolean z10;
        final String str;
        if (!this.E1) {
            final m x92 = x9();
            if (x92.f10128z != null) {
                x92.f10128z.run();
            } else if (!ib.i.i(x92.f10108f)) {
                v.N(x92.f10108f);
            } else if (this.f10076t0 == 0) {
                boolean z11 = false;
                int constructor = x92.f10105c[0].senderId.getConstructor();
                if (constructor == -336109341) {
                    str = this.f24495b.e2().J2(((TdApi.MessageSenderUser) x92.f10105c[0].senderId).userId);
                    z10 = true;
                } else if (constructor == -239660751) {
                    str = this.f24495b.U3(((TdApi.MessageSenderChat) x92.f10105c[0].senderId).chatId);
                    z10 = false;
                } else {
                    throw new UnsupportedOperationException(x92.f10105c[0].senderId.toString());
                }
                o6 o6Var = this.f24495b;
                TdApi.Message message = x92.f10105c[0];
                boolean z12 = x92.f10105c.length > 1;
                if (x92.f10106d != 0) {
                    z11 = true;
                }
                o6Var.K5(message, z12, z11, new kb.j() {
                    @Override
                    public final void a(Object obj) {
                        y00.this.Ai(x92, z10, str, (o6.m) obj);
                    }
                });
            }
            Ji();
            j2 j2Var = this.f10067k1;
            if (j2Var != null) {
                j2Var.s2(true);
            }
        }
    }

    public void ej() {
        if (this.f24495b != null) {
            b bVar = new b(t());
            this.f10067k1 = bVar;
            bVar.setSoftInputMode(16);
            this.f10067k1.setBoundController(this);
            this.f10067k1.setPopupHeightProvider(this);
            this.f10067k1.L1(false);
            this.f10067k1.G2();
            this.f10067k1.I2();
            this.f10067k1.setTouchProvider(this);
            this.f10067k1.T1();
            get();
            t().R(this, false);
        } else if (Rh() == 1) {
            Jh();
            Z8();
        }
    }

    public final boolean fj(View view, long j10, boolean z10) {
        int P0;
        CharSequence Qh = Qh(j10);
        if (Qh == null) {
            return false;
        }
        if (view == null && (P0 = this.D0.P0(j10)) != -1) {
            int X1 = ((LinearLayoutManager) this.C0.getLayoutManager()).X1();
            int a22 = ((LinearLayoutManager) this.C0.getLayoutManager()).a2();
            if (P0 >= X1 && P0 <= a22) {
                view = this.C0.getLayoutManager().C(P0);
                z10 = z10 && view == null;
            }
        }
        if (view == null && this.f10070n1) {
            view = this.f10077t1 ? this.P0 : this.J0;
        }
        if (z10) {
            Qh = w.j1(R.string.format_chatAndError, this.f24495b.U3(j10), Qh);
        }
        if (view != null) {
            t().I3().g(view).q(R.drawable.baseline_warning_24).D(this.f24495b, Qh).F();
        } else {
            j0.z0(Qh, 0);
        }
        return true;
    }

    @Override
    public int getCurrentPopupHeight() {
        int Wh = Wh() - Dh();
        float topOffset = d1.getTopOffset();
        o oVar = this.E0;
        return Wh - ((int) (topOffset * (1.0f - (oVar != null ? oVar.f10131a : 0.0f))));
    }

    public final void gj() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (this.f10076t0 == 0) {
            TdApi.Message[] messageArr = x9().f10105c;
            int length = messageArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                }
                TdApi.Message message = messageArr[i10];
                if (message.content.getConstructor() != 1989037971 && hd.t2.L(message)) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            arrayList.add(new ra(12, (int) R.id.btn_hideAuthor, 0, (int) R.string.SendAsCopy, (int) R.id.btn_hideAuthor, this.F1));
            if (z10) {
                arrayList.add(new ra(12, (int) R.id.btn_removeCaptions, 0, (int) R.string.RemoveCaptions, (int) R.id.btn_removeCaptions, this.G1));
            }
        }
        int i11 = 0;
        boolean z11 = false;
        for (int i12 = 0; i12 < this.W0.l(); i12++) {
            long f10 = this.W0.f(i12);
            if (ob.a.j(f10)) {
                z11 = true;
            }
            if (!this.f24495b.k7(f10) && !ob.a.j(f10)) {
                i11++;
            }
        }
        if (i11 > 0) {
            ra raVar = new ra(12, (int) R.id.btn_sendNoSound, 0, (int) R.string.SendNoSound, (int) R.id.btn_sendNoSound, this.H1);
            if (z11) {
                raVar.X(w.q2(R.string.SendNoSoundX, i11));
            }
            arrayList.add(raVar);
        }
        if (!arrayList.isEmpty()) {
            ne(R.id.btn_menu_customize, (ra[]) arrayList.toArray(new ra[0]), new v4.r() {
                @Override
                public final void l6(int i13, SparseIntArray sparseIntArray) {
                    y00.this.Bi(i13, sparseIntArray);
                }
            });
        }
    }

    public final void pi(int i10) {
        if (i10 == 0) {
            this.C0.C1();
        }
        Wi(false);
        this.C0.u1(0, i10);
    }

    @Override
    public void i2(e8 e8Var, TdApi.Chat chat, int i10, o6.g gVar) {
        e0.b(this, e8Var, chat, i10, gVar);
    }

    @Override
    public void i5(e8 e8Var, int i10, int i11) {
        e0.e(this, e8Var, i10, i11);
    }

    public final void ih(List<c3> list, List<ra> list2) {
        if (!list.isEmpty()) {
            ib.b.m(list2, list2.size() + list.size());
            for (c3 c3Var : list) {
                list2.add(kj(c3Var));
            }
        }
    }

    public final boolean ij(View view, c3 c3Var) {
        long a10 = c3Var.a();
        boolean z10 = false;
        if (!Yh(a10) && !fj(view, a10, false)) {
            z10 = true;
        }
        if (z10) {
            this.V0.k(a10, c3Var);
            this.W0.a(a10);
            this.X0 = true;
        } else {
            this.V0.l(a10);
            this.W0.j(a10);
        }
        vh();
        jj();
        return z10;
    }

    @Override
    public void j6(boolean z10, ae.b bVar) {
        super.j6(z10, bVar);
        d1 d1Var = this.R;
        if (d1Var != null) {
            d1Var.G3(this, null);
        }
    }

    @Override
    public boolean jc(boolean z10) {
        if (Na()) {
            W8(null);
            return true;
        } else if (!this.C1) {
            return false;
        } else {
            Oh();
            return true;
        }
    }

    @Override
    public boolean jf(c3 c3Var) {
        return false;
    }

    public final void jh(int i10) {
        if (this.f10062f1) {
            this.f10063g1 = i10;
        } else {
            pi(i10);
        }
    }

    public final void jj() {
        if (this.V0.p() == 0) {
            this.H0.setSubtitle(w.Z1(w.i1(R.string.SelectChats)));
            return;
        }
        int i10 = 0;
        if (this.V0.p() == 1) {
            this.H0.setSubtitle(this.V0.q(0).h());
            return;
        }
        int l10 = this.W0.l();
        int i11 = Uh() > 1 ? 2 : 3;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= l10) {
                break;
            }
            c3 f10 = this.V0.f(this.W0.f(i12));
            if (i13 == i11 - 1 && l10 > i11) {
                i10 = l10 - i13;
                break;
            }
            if (f10.u()) {
                arrayList.add(w.i1(R.string.SavedMessages));
            } else {
                arrayList.add(f10.m().toString());
            }
            i13++;
            i12++;
        }
        this.H0.setSubtitle(w.s2(arrayList, i10));
    }

    @Override
    public void k0(vc.q qVar, View view) {
        this.A0.removeView(view);
    }

    @Override
    public void k5() {
        if (this.F0.length() > 0) {
            this.F0.dispatchKeyEvent(new KeyEvent(0, 67));
        }
    }

    @Override
    public boolean kf(c3 c3Var) {
        return true;
    }

    public final float kh() {
        float f10 = 0.0f;
        if (this.f10084x0 != null) {
            double d10 = 0.0d;
            for (int i10 = 0; i10 < this.f10084x0.n(); i10++) {
                d10 += this.f10084x0.o(i10).a();
            }
            for (int i11 = 0; i11 < this.f10084x0.n(); i11++) {
                n o10 = this.f10084x0.o(i11);
                f10 += hd.t2.s1(o10.f10129a) * ((float) (o10.a() / d10));
            }
        }
        return f10;
    }

    @Override
    public int la() {
        return R.id.menu_clear;
    }

    public final int lh() {
        if (this.L0) {
            return Math.max(this.N0.getMeasuredHeight(), a0.i(48.0f));
        }
        return Math.max(this.N0.getMeasuredHeight(), a0.i(48.0f)) + a0.i(56.0f);
    }

    public final float mh() {
        if (this.f10073q1 || this.f10087y1) {
            return 0.0f;
        }
        return lh() * this.f10072p1 * (-1.0f);
    }

    @Override
    public void n4(int i10, float f10, float f11, eb.k kVar) {
        if (i10 == 1) {
            Xi(f10);
        }
    }

    public final int nh() {
        if (!j0.N()) {
            return 4;
        }
        return a0.g() / (a0.B() / 4);
    }

    @Override
    public void o4(int i10, float f10, eb.k kVar) {
        if (i10 == 1) {
            Gi(f10);
        }
    }

    @Override
    public View oc(Context context) {
        this.f10080v0 = new d(this.f24495b, this.f10078u0, this, true);
        this.L0 = th();
        s sVar = new s(context);
        this.H0 = sVar;
        sVar.setTitle(R.string.SendTo);
        this.H0.A1(a0.i(56.0f) * Uh(), false);
        this.H0.C1(R.id.theme_color_text, R.id.theme_color_textLight, this);
        jj();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.A0 = relativeLayout;
        relativeLayout.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = d1.a3(true);
        if (this.L0) {
            layoutParams.addRule(2, R.id.btn_send);
        }
        e eVar = new e(context);
        this.C0 = eVar;
        t8(eVar);
        this.C0.setItemAnimator(null);
        this.C0.setOverScrollMode(2);
        this.C0.k(new f());
        this.C0.setHasFixedSize(true);
        this.C0.setLayoutManager(new RtlGridLayoutManager(context, 4));
        this.C0.setLayoutParams(layoutParams);
        g gVar = new g();
        tc.e eVar2 = new tc.e(nh(), a0.i(8.0f), true, false, false);
        this.I0 = eVar2;
        eVar2.o(gVar);
        this.C0.g(this.I0);
        this.C0.g(new h(gVar));
        ((GridLayoutManager) this.C0.getLayoutManager()).e3(gVar);
        this.A0.addView(this.C0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, a0.i(56.0f));
        layoutParams2.addRule(12);
        p pVar = new p(context);
        this.J0 = pVar;
        pVar.setLayoutParams(layoutParams2);
        this.J0.setId(R.id.btn_send);
        if (this.L0) {
            this.J0.D1(Vh());
        }
        this.J0.getChildAt(0).setId(R.id.btn_send);
        this.J0.getChildAt(0).setOnClickListener(this);
        this.J0.getChildAt(0).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                boolean qi;
                qi = y00.this.qi(view);
                return qi;
            }
        });
        if (!this.L0) {
            this.J0.setTranslationY(a0.i(56.0f));
            this.J0.B1(true, false);
        }
        t8(this.J0);
        this.M0 = new c0(new c0.c() {
            @Override
            public final List F3(View view) {
                List ri;
                ri = y00.this.ri(view);
                return ri;
            }
        }, new c0.b() {
            @Override
            public final void I0(View view, View view2) {
                y00.this.ti(view, view2);
            }
        }, Ba(), null).d(this.J0.getChildAt(0));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(2, R.id.btn_send);
        i iVar = new i(context);
        this.N0 = iVar;
        iVar.setLayoutParams(layoutParams3);
        this.N0.setId(R.id.share_bottom);
        this.N0.setOrientation(1);
        this.A0.addView(this.N0);
        j jVar = new j(context, this.f24495b);
        this.F0 = jVar;
        jVar.setInputListener(new k());
        this.F0.setEnabled(false);
        this.F0.setGravity(83);
        this.F0.setTypeface(ce.o.k());
        this.F0.setTextColor(ae.j.P0());
        y8(this.F0);
        this.F0.setTextSize(1, 18.0f);
        this.F0.setPadding(a0.i(60.0f), a0.i(12.0f), a0.i(55.0f), a0.i(12.0f));
        this.F0.setHintTextColor(ae.j.U0());
        s8(this.F0, R.id.theme_color_textPlaceholder);
        yd.g.i(this.F0, R.id.theme_color_filling, this);
        this.F0.setHighlightColor(ae.j.z());
        r8(this.F0, R.id.theme_color_textSelectionHighlight);
        this.F0.setMinimumHeight(a0.i(48.0f));
        this.F0.setHint(w.i1(R.string.AddComment));
        this.F0.setImeOptions(268435456);
        h0 h0Var = this.F0;
        h0Var.setInputType(h0Var.getInputType() | Log.TAG_VIDEO | Log.TAG_CONTACT);
        this.F0.setSingleLine(false);
        this.F0.setMaxLines(4);
        this.N0.addView(this.F0);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(a0.i(55.0f), a0.i(48.0f));
        layoutParams4.addRule(11);
        layoutParams4.addRule(6, R.id.share_bottom);
        CustomImageView customImageView = new CustomImageView(context);
        this.P0 = customImageView;
        customImageView.setId(R.id.btn_done);
        this.P0.setScaleType(ImageView.ScaleType.CENTER);
        this.P0.setImageResource(R.drawable.deproko_baseline_send_24);
        this.P0.setColorFilter(ae.j.j());
        q8(this.P0, R.id.theme_color_chatSendButton);
        this.P0.setVisibility(4);
        this.P0.setOnClickListener(this);
        this.P0.setLayoutParams(layoutParams4);
        this.A0.addView(this.P0);
        this.M0.d(this.P0);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(a0.i(60.0f), a0.i(48.0f));
        layoutParams5.addRule(9);
        layoutParams5.addRule(6, R.id.share_bottom);
        CustomImageView customImageView2 = new CustomImageView(context);
        this.O0 = customImageView2;
        customImageView2.setScaleType(ImageView.ScaleType.CENTER);
        this.O0.setId(R.id.btn_emoji);
        this.O0.setOnClickListener(this);
        this.O0.setImageResource(R.drawable.deproko_baseline_insert_emoticon_26);
        this.O0.setColorFilter(ae.j.o0());
        q8(this.O0, R.id.theme_color_icon);
        this.O0.setLayoutParams(layoutParams5);
        this.A0.addView(this.O0);
        this.A0.addView(this.J0);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(2, R.id.share_bottom);
        d3 e10 = d3.e(context, layoutParams6, false);
        this.K0 = e10;
        e10.setColorId(R.id.theme_color_shareSeparator);
        this.K0.a();
        if (this.L0) {
            this.K0.setTranslationY(a0.i(48.0f));
        } else {
            this.K0.setAlpha(0.0f);
        }
        this.K0.setLayoutParams(layoutParams6);
        this.A0.addView(this.K0);
        l lVar = new l(this);
        this.D0 = lVar;
        lVar.A2();
        t1.b().a(this.D0);
        d1 d1Var = new d1(context);
        this.R = d1Var;
        d1Var.n3(this, false);
        this.R.getFilling().t0(0.0f);
        this.R.getBackButton().setIsReverse(true);
        ja(this.R);
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, a0.i(6.0f));
        q12.topMargin = d1.a3(false) - a0.i(3.0f);
        View view = new View(context);
        this.G0 = view;
        yd.g.i(view, R.id.theme_color_filling, this);
        this.G0.setLayoutParams(q12);
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.Q0 = frameLayoutFix;
        frameLayoutFix.addView(this.G0);
        this.Q0.addView(this.A0);
        CustomRecyclerView qf = qf(this.Q0);
        this.B0 = qf;
        ((ViewGroup.MarginLayoutParams) qf.getLayoutParams()).topMargin = d1.a3(true);
        this.Q0.addView(this.R);
        if (d1.getTopOffset() > 0) {
            o oVar = new o(context);
            this.E0 = oVar;
            t8(oVar);
            this.E0.setLayoutParams(FrameLayoutFix.q1(-1, d1.getTopOffset()));
            this.Q0.addView(this.E0);
        }
        xh();
        this.f24495b.v4().o(new TdApi.CreatePrivateChat(this.f24495b.fa(), true), this.f24495b.yc());
        this.f10080v0.u(this, new kb.j() {
            @Override
            public final void a(Object obj) {
                y00.this.Mi((List) obj);
            }
        }, Math.max(20, a0.b(a0.i(95.0f), 1) * nh()), new Runnable() {
            @Override
            public final void run() {
                y00.this.n9();
            }
        });
        return this.Q0;
    }

    public final int oh() {
        return Wh() - (Ph() + d1.getTopOffset());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_done:
                if (this.V0.p() == 0) {
                    La();
                    return;
                } else {
                    Li(true, false, null, false);
                    return;
                }
            case R.id.btn_emoji:
                Ni();
                return;
            case R.id.btn_send:
                if (this.V0.p() != 0) {
                    Li(false, false, null, false);
                    return;
                } else if (this.L0) {
                    dj();
                    return;
                } else {
                    return;
                }
            case R.id.share_comment_stub:
                return;
            default:
                ra raVar = (ra) view.getTag();
                c3 c3Var = (c3) raVar.d();
                int j10 = raVar.j();
                if (j10 != R.id.chat) {
                    if (j10 == R.id.search_chat && !Pi(c3Var)) {
                        ((y3) view).l1(ij(view, c3Var), true);
                        W8(null);
                        return;
                    }
                    return;
                } else if (this.S0 && !Pi(c3Var)) {
                    ((y3) view).l1(ij(view, c3Var), true);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public long pa() {
        return 220L;
    }

    @Override
    public void pc() {
        super.pc();
        int Xh = Xh();
        if (Xh > 0) {
            this.f10061e1 = Xh;
        } else {
            Wi(true);
        }
    }

    public final boolean ph() {
        if (x9().f10121s && this.f10076t0 == 0) {
            return qh();
        }
        return false;
    }

    public final boolean qh() {
        m x92 = x9();
        if (x92.f10105c.length != 0 && this.f24495b.s2(x92.f10105c[0].chatId)) {
            if (x92.f10105c.length == 1) {
                return true;
            }
            long j10 = x92.f10105c[0].mediaAlbumId;
            if (j10 != 0) {
                for (int i10 = 1; i10 < x92.f10105c.length; i10++) {
                    if (j10 != x92.f10105c[i10].mediaAlbumId) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public m1.e r6(View view, m1.f fVar, jb.c cVar, jb.c cVar2, ie.u0 u0Var, v4<?> v4Var) {
        c3 c3Var = (c3) ((ra) view.getTag()).d();
        fVar.J(true);
        cVar.a(R.id.btn_selectChat);
        u0Var.a(Yh(c3Var.a()) ? R.string.Unselect : R.string.Select);
        cVar2.a(R.drawable.baseline_playlist_add_check_24);
        return new a(view, c3Var);
    }

    @Override
    public Interpolator ra() {
        return db.b.f7287b;
    }

    public final boolean rh() {
        return Rh() != 0;
    }

    @Override
    public void run() {
        int nh = nh();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.C0.getLayoutManager();
        if (gridLayoutManager.V2() != nh) {
            gridLayoutManager.d3(nh);
            this.I0.n(nh);
            this.C0.A0();
        }
    }

    public final boolean th() {
        m x92 = x9();
        if (!ib.i.i(x92.f10108f) || x92.f10128z != null) {
            return true;
        }
        if (this.f10076t0 != 0) {
            return false;
        }
        return qh();
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_clear) {
            d1Var.P1(linearLayout, this);
        } else if (i10 == R.id.menu_search) {
            if (ph()) {
                d1Var.L1(linearLayout, R.id.menu_btn_copy, O9(), this, R.drawable.baseline_link_24, a0.i(49.0f), R.drawable.bg_btn_header);
            }
            if (Rh() != 0) {
                d1Var.L1(linearLayout, R.id.menu_btn_forward, O9(), this, R.drawable.baseline_share_24, a0.i(49.0f), R.drawable.bg_btn_header);
            }
            d1Var.h2(linearLayout, this, O9()).setTouchDownListener(new u0.a() {
                @Override
                public final void a(u0 u0Var, MotionEvent motionEvent) {
                    y00.this.li(u0Var, motionEvent);
                }
            });
        }
    }

    public final void uh() {
        d1 d1Var;
        if (this.f10084x0 != null) {
            for (int i10 = 0; i10 < this.f10084x0.n(); i10++) {
                n o10 = this.f10084x0.o(i10);
                Runnable runnable = o10.f10130b;
                if (runnable != null) {
                    runnable.run();
                    o10.f10130b = null;
                }
            }
            this.f10084x0 = null;
            this.f10086y0 = 0;
        }
        if (!(Sa() || (d1Var = this.R) == null)) {
            d1Var.d4(W9(), R.id.menu_btn_forward, j00.f8357a);
        }
    }

    public final void vh() {
        boolean z10 = this.V0.p() > 0;
        if (this.L0) {
            this.J0.B1(z10, true);
        }
        Yi(z10);
    }

    @Override
    public void w0(String str) {
        this.F0.p0(str);
    }

    @Override
    public boolean wc(boolean z10) {
        if (Na() || this.E1) {
            return super.wc(z10);
        }
        if (z10 && !S9()) {
            Bh();
        }
        boolean wc2 = super.wc(z10);
        z0 z0Var = this.B1;
        if (z0Var != null) {
            z0Var.j(z10);
        }
        Ah();
        return wc2;
    }

    @Override
    public int wf() {
        return 13;
    }

    public final void wh() {
        float translationY = this.N0.getTranslationY() + Math.max(0, this.F0.getMeasuredHeight() - a0.i(48.0f));
        this.P0.setTranslationY(translationY);
        this.O0.setTranslationY(translationY);
    }

    @Override
    public void xc() {
        super.xc();
        if (this.U0) {
            this.U0 = false;
            Wi(true);
            return;
        }
        int Xh = Xh();
        int Ph = Ph() - a0.i(4.0f);
        if (Xh == 0) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) this.C0.getLayoutManager();
            int X1 = gridLayoutManager.X1();
            View C = X1 == 0 ? gridLayoutManager.C(0) : null;
            if (X1 != 0 || this.R0) {
                this.f10062f1 = true;
                this.f10063g1 = -Ph;
                gridLayoutManager.z2(0, a0.i(4.0f));
                return;
            } else if (C != null && C.getTop() < a0.i(4.0f)) {
                this.C0.scrollBy(0, C.getTop() - a0.i(4.0f));
            }
        }
        jh(Xh - Ph);
    }

    public final void xh() {
        float lh = lh() * (1.0f - this.f10072p1);
        this.N0.setTranslationY(lh);
        this.K0.setTranslationY(lh);
        if (!this.L0) {
            this.J0.setTranslationY(lh);
        }
        wh();
    }

    public final void yh() {
        View view = this.T0;
        if (view == null || this.C0.k0(view) != 0) {
            view = this.C0.getLayoutManager().C(0);
            this.T0 = view;
        }
        int topOffset = d1.getTopOffset();
        if (view != null) {
            topOffset = Math.max(((view.getTop() - d1.a3(false)) + this.C0.getTop()) - a0.i(4.0f), d1.getTopOffset());
        }
        float f10 = 0.0f;
        if (!this.f10073q1 && this.f10072p1 != 0.0f) {
            topOffset = Math.max(d1.getTopOffset(), (int) (topOffset + mh()));
        }
        d1 d1Var = this.R;
        if (d1Var != null) {
            float f11 = topOffset;
            d1Var.setTranslationY(f11);
            this.G0.setTranslationY(f11);
            int topOffset2 = d1.getTopOffset();
            int i10 = topOffset - topOffset2;
            zh(i10);
            float f12 = i10;
            this.B0.setTranslationY(f12);
            o oVar = this.E0;
            if (oVar != null) {
                oVar.setTranslationY(f12);
                if (i10 <= topOffset2) {
                    f10 = 1.0f - (f12 / topOffset2);
                }
                this.E0.b(f10);
                this.R.getFilling().t0(f10);
            }
            if (i10 == 0 && this.f10064h1) {
                super.Ee(true);
                this.f10064h1 = false;
            } else if (this.S0 && i10 > 0 && Na() && qa() == 1.0f) {
                this.C0.scrollBy(0, i10);
            }
        }
    }

    @Override
    public View zf() {
        return this.A0;
    }

    public final void zh(int i10) {
        boolean z10 = this.f10073q1;
        if (this.F0.isEnabled() != z10) {
            this.F0.setEnabled(z10);
        }
    }
}
