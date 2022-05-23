package e;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.l0;
import androidx.appcompat.widget.m0;
import androidx.appcompat.widget.o;
import androidx.lifecycle.d;
import c1.a0;
import c1.c0;
import c1.e0;
import c1.f;
import c1.q;
import c1.v;
import j.b;
import j.f;
import java.util.List;
import java.util.Map;
import org.thunderdog.challegram.Log;
import org.xmlpull.v1.XmlPullParser;

public class d extends e.c implements e.a, LayoutInflater.Factory2 {
    public static final Map<Class<?>, Integer> J0 = new k0.a();
    public static final boolean K0 = false;
    public static final int[] L0 = {16842836};
    public static final boolean M0;
    public j A0;
    public j B0;
    public boolean C0;
    public int D0;
    public final Runnable E0;
    public boolean F0;
    public Rect G0;
    public Rect H0;
    public AppCompatViewInflater I0;
    public final Object M;
    public final Context N;
    public Window O;
    public h P;
    public final e.b Q;
    public ActionBar R;
    public MenuInflater S;
    public CharSequence T;
    public o U;
    public f V;
    public n W;
    public j.b X;
    public ActionBarContextView Y;
    public PopupWindow Z;
    public Runnable f10347a0;
    public a0 f10348b0;
    public boolean f10349c0;
    public boolean f10350d0;
    public ViewGroup f10351e0;
    public TextView f10352f0;
    public View f10353g0;
    public boolean f10354h0;
    public boolean f10355i0;
    public boolean f10356j0;
    public boolean f10357k0;
    public boolean f10358l0;
    public boolean f10359m0;
    public boolean f10360n0;
    public boolean f10361o0;
    public m[] f10362p0;
    public m f10363q0;
    public boolean f10364r0;
    public boolean f10365s0;
    public boolean f10366t0;
    public boolean f10367u0;
    public boolean f10368v0;
    public int f10369w0;
    public int f10370x0;
    public boolean f10371y0;
    public boolean f10372z0;

    public class a implements Runnable {
        public a() {
        }

        @Override
        public void run() {
            d dVar = d.this;
            if ((dVar.D0 & 1) != 0) {
                dVar.S(0);
            }
            d dVar2 = d.this;
            if ((dVar2.D0 & Log.TAG_EMOJI) != 0) {
                dVar2.S(108);
            }
            d dVar3 = d.this;
            dVar3.C0 = false;
            dVar3.D0 = 0;
        }
    }

    public class b implements q {
        public b() {
        }

        @Override
        public e0 a(View view, e0 e0Var) {
            int k10 = e0Var.k();
            int I0 = d.this.I0(k10);
            if (k10 != I0) {
                e0Var = e0Var.m(e0Var.i(), I0, e0Var.j(), e0Var.h());
            }
            return v.Q(view, e0Var);
        }
    }

    public class c implements ContentFrameLayout.a {
        public c() {
        }

        @Override
        public void a() {
        }

        @Override
        public void onDetachedFromWindow() {
            d.this.Q();
        }
    }

    public class RunnableC0091d implements Runnable {

        public class a extends c0 {
            public a() {
            }

            @Override
            public void b(View view) {
                d.this.Y.setAlpha(1.0f);
                d.this.f10348b0.f(null);
                d.this.f10348b0 = null;
            }

            @Override
            public void c(View view) {
                d.this.Y.setVisibility(0);
            }
        }

        public RunnableC0091d() {
        }

        @Override
        public void run() {
            d dVar = d.this;
            dVar.Z.showAtLocation(dVar.Y, 55, 0, 0);
            d.this.T();
            if (d.this.A0()) {
                d.this.Y.setAlpha(0.0f);
                d dVar2 = d.this;
                dVar2.f10348b0 = v.b(dVar2.Y).a(1.0f);
                d.this.f10348b0.f(new a());
                return;
            }
            d.this.Y.setAlpha(1.0f);
            d.this.Y.setVisibility(0);
        }
    }

    public class e extends c0 {
        public e() {
        }

        @Override
        public void b(View view) {
            d.this.Y.setAlpha(1.0f);
            d.this.f10348b0.f(null);
            d.this.f10348b0 = null;
        }

        @Override
        public void c(View view) {
            d.this.Y.setVisibility(0);
            d.this.Y.sendAccessibilityEvent(32);
            if (d.this.Y.getParent() instanceof View) {
                v.V((View) d.this.Y.getParent());
            }
        }
    }

    public final class f implements i.a {
        public f() {
        }

        @Override
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            d.this.K(eVar);
        }

        @Override
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback c02 = d.this.c0();
            if (c02 == null) {
                return true;
            }
            c02.onMenuOpened(108, eVar);
            return true;
        }
    }

    public class g implements b.a {
        public b.a f10380a;

        public class a extends c0 {
            public a() {
            }

            @Override
            public void b(View view) {
                d.this.Y.setVisibility(8);
                d dVar = d.this;
                PopupWindow popupWindow = dVar.Z;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (dVar.Y.getParent() instanceof View) {
                    v.V((View) d.this.Y.getParent());
                }
                d.this.Y.removeAllViews();
                d.this.f10348b0.f(null);
                d.this.f10348b0 = null;
            }
        }

        public g(b.a aVar) {
            this.f10380a = aVar;
        }

        @Override
        public boolean a(j.b bVar, Menu menu) {
            return this.f10380a.a(bVar, menu);
        }

        @Override
        public void b(j.b bVar) {
            this.f10380a.b(bVar);
            d dVar = d.this;
            if (dVar.Z != null) {
                dVar.O.getDecorView().removeCallbacks(d.this.f10347a0);
            }
            d dVar2 = d.this;
            if (dVar2.Y != null) {
                dVar2.T();
                d dVar3 = d.this;
                dVar3.f10348b0 = v.b(dVar3.Y).a(0.0f);
                d.this.f10348b0.f(new a());
            }
            d dVar4 = d.this;
            e.b bVar2 = dVar4.Q;
            if (bVar2 != null) {
                bVar2.h(dVar4.X);
            }
            d.this.X = null;
        }

        @Override
        public boolean c(j.b bVar, MenuItem menuItem) {
            return this.f10380a.c(bVar, menuItem);
        }

        @Override
        public boolean d(j.b bVar, Menu menu) {
            return this.f10380a.d(bVar, menu);
        }
    }

    public class i extends j {
        public final PowerManager f10384c;

        public i(Context context) {
            super();
            this.f10384c = (PowerManager) context.getSystemService("power");
        }

        @Override
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override
        public int c() {
            return this.f10384c.isPowerSaveMode() ? 2 : 1;
        }

        @Override
        public void d() {
            d.this.E();
        }
    }

    public abstract class j {
        public BroadcastReceiver f10386a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override
            public void onReceive(Context context, Intent intent) {
                j.this.d();
            }
        }

        public j() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f10386a;
            if (broadcastReceiver != null) {
                try {
                    d.this.N.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f10386a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b10 = b();
            if (b10 != null && b10.countActions() != 0) {
                if (this.f10386a == null) {
                    this.f10386a = new a();
                }
                d.this.N.registerReceiver(this.f10386a, b10);
            }
        }
    }

    public class k extends j {
        public final e.h f10389c;

        public k(e.h hVar) {
            super();
            this.f10389c = hVar;
        }

        @Override
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override
        public int c() {
            return this.f10389c.d() ? 2 : 1;
        }

        @Override
        public void d() {
            d.this.E();
        }
    }

    public class l extends ContentFrameLayout {
        public l(Context context) {
            super(context);
        }

        public final boolean c(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return d.this.R(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            d.this.M(0);
            return true;
        }

        @Override
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(f.a.d(getContext(), i10));
        }
    }

    public static final class m {
        public int f10391a;
        public int f10392b;
        public int f10393c;
        public int f10394d;
        public int f10395e;
        public int f10396f;
        public ViewGroup f10397g;
        public View f10398h;
        public View f10399i;
        public androidx.appcompat.view.menu.e f10400j;
        public androidx.appcompat.view.menu.c f10401k;
        public Context f10402l;
        public boolean f10403m;
        public boolean f10404n;
        public boolean f10405o;
        public boolean f10406p;
        public boolean f10407q = false;
        public boolean f10408r;
        public Bundle f10409s;

        public m(int i10) {
            this.f10391a = i10;
        }

        public androidx.appcompat.view.menu.j a(i.a aVar) {
            if (this.f10400j == null) {
                return null;
            }
            if (this.f10401k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f10402l, d.g.f5956l);
                this.f10401k = cVar;
                cVar.g(aVar);
                this.f10400j.b(this.f10401k);
            }
            return this.f10401k.h(this.f10397g);
        }

        public boolean b() {
            if (this.f10398h == null) {
                return false;
            }
            return this.f10399i != null || this.f10401k.a().getCount() > 0;
        }

        public void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f10400j;
            if (eVar != eVar2) {
                if (eVar2 != null) {
                    eVar2.O(this.f10401k);
                }
                this.f10400j = eVar;
                if (eVar != null && (cVar = this.f10401k) != null) {
                    eVar.b(cVar);
                }
            }
        }

        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(d.a.a_res_0x7f020002, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(d.a.E, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                newTheme.applyStyle(i11, true);
            } else {
                newTheme.applyStyle(d.i.f5967b, true);
            }
            j.d dVar = new j.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f10402l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(d.j.B0);
            this.f10392b = obtainStyledAttributes.getResourceId(d.j.E0, 0);
            this.f10396f = obtainStyledAttributes.getResourceId(d.j.D0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public final class n implements i.a {
        public n() {
        }

        @Override
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e D = eVar.D();
            boolean z11 = D != eVar;
            d dVar = d.this;
            if (z11) {
                eVar = D;
            }
            m W = dVar.W(eVar);
            if (W == null) {
                return;
            }
            if (z11) {
                d.this.J(W.f10391a, W, D);
                d.this.N(W, true);
                return;
            }
            d.this.N(W, z10);
        }

        @Override
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback c02;
            if (eVar != null) {
                return true;
            }
            d dVar = d.this;
            if (!dVar.f10356j0 || (c02 = dVar.c0()) == null || d.this.f10368v0) {
                return true;
            }
            c02.onMenuOpened(108, eVar);
            return true;
        }
    }

    static {
        boolean z10 = false;
        if (Build.VERSION.SDK_INT <= 25) {
            z10 = true;
        }
        M0 = z10;
    }

    public d(Activity activity, e.b bVar) {
        this(activity, null, bVar, activity);
    }

    @Override
    public void A(View view) {
        U();
        ViewGroup viewGroup = (ViewGroup) this.f10351e0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.P.a().onContentChanged();
    }

    public final boolean A0() {
        ViewGroup viewGroup;
        return this.f10350d0 && (viewGroup = this.f10351e0) != null && v.K(viewGroup);
    }

    @Override
    public void B(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        ViewGroup viewGroup = (ViewGroup) this.f10351e0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.P.a().onContentChanged();
    }

    public final boolean B0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.O.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || v.J((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override
    public void C(int i10) {
        this.f10370x0 = i10;
    }

    public j.b C0(b.a aVar) {
        e.b bVar;
        if (aVar != null) {
            j.b bVar2 = this.X;
            if (bVar2 != null) {
                bVar2.c();
            }
            g gVar = new g(aVar);
            ActionBar k10 = k();
            if (k10 != null) {
                j.b u10 = k10.u(gVar);
                this.X = u10;
                if (!(u10 == null || (bVar = this.Q) == null)) {
                    bVar.d(u10);
                }
            }
            if (this.X == null) {
                this.X = D0(gVar);
            }
            return this.X;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    @Override
    public final void D(CharSequence charSequence) {
        this.T = charSequence;
        o oVar = this.U;
        if (oVar != null) {
            oVar.setWindowTitle(charSequence);
        } else if (v0() != null) {
            v0().t(charSequence);
        } else {
            TextView textView = this.f10352f0;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public j.b D0(j.b.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: e.d.D0(j.b$a):j.b");
    }

    public boolean E() {
        return F(true);
    }

    public final void E0() {
        if (this.f10350d0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final boolean F(boolean z10) {
        if (this.f10368v0) {
            return false;
        }
        int I = I();
        boolean G0 = G0(k0(I), z10);
        if (I == 0) {
            Z().e();
        } else {
            j jVar = this.A0;
            if (jVar != null) {
                jVar.a();
            }
        }
        if (I == 3) {
            Y().e();
        } else {
            j jVar2 = this.B0;
            if (jVar2 != null) {
                jVar2.a();
            }
        }
        return G0;
    }

    public final e.a F0() {
        for (Context context = this.N; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof e.a) {
                return (e.a) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public final void G() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f10351e0.findViewById(16908290);
        View decorView = this.O.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.N.obtainStyledAttributes(d.j.B0);
        obtainStyledAttributes.getValue(d.j.N0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(d.j.O0, contentFrameLayout.getMinWidthMinor());
        int i10 = d.j.L0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = d.j.M0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = d.j.J0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = d.j.K0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final boolean G0(int i10, boolean z10) {
        int i11 = this.N.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z11 = true;
        int i12 = i10 != 1 ? i10 != 2 ? i11 : 32 : 16;
        boolean i02 = i0();
        boolean z12 = false;
        if ((M0 || i12 != i11) && !i02 && !this.f10365s0 && (this.M instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & (-49)) | i12;
            try {
                ((ContextThemeWrapper) this.M).applyOverrideConfiguration(configuration);
                z12 = true;
            } catch (IllegalStateException e10) {
                android.util.Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e10);
            }
        }
        int i13 = this.N.getResources().getConfiguration().uiMode & 48;
        if (!z12 && i13 != i12 && z10 && !i02 && this.f10365s0) {
            Object obj = this.M;
            if (obj instanceof Activity) {
                p0.a.n((Activity) obj);
                z12 = true;
            }
        }
        if (z12 || i13 == i12) {
            z11 = z12;
        } else {
            H0(i12, i02);
        }
        if (z11) {
            Object obj2 = this.M;
            if (obj2 instanceof e.a) {
                ((e.a) obj2).I(i10);
            }
        }
        return z11;
    }

    public final void H(Window window) {
        if (this.O == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof h)) {
                h hVar = new h(callback);
                this.P = hVar;
                window.setCallback(hVar);
                g0 s10 = g0.s(this.N, null, L0);
                Drawable g10 = s10.g(0);
                if (g10 != null) {
                    window.setBackgroundDrawable(g10);
                }
                s10.u();
                this.O = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void H0(int i10, boolean z10) {
        Resources resources = this.N.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            e.f.a(resources);
        }
        int i12 = this.f10370x0;
        if (i12 != 0) {
            this.N.setTheme(i12);
            if (i11 >= 23) {
                this.N.getTheme().applyStyle(this.f10370x0, true);
            }
        }
        if (z10) {
            Object obj = this.M;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.g) {
                    if (((androidx.lifecycle.g) activity).a().b().a(d.c.STARTED)) {
                        activity.onConfigurationChanged(configuration);
                    }
                } else if (this.f10367u0) {
                    activity.onConfigurationChanged(configuration);
                }
            }
        }
    }

    public final int I() {
        int i10 = this.f10369w0;
        return i10 != -100 ? i10 : e.c.h();
    }

    public int I0(int i10) {
        boolean z10;
        boolean z11;
        ActionBarContextView actionBarContextView = this.Y;
        int i11 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.Y.getLayoutParams();
            boolean z12 = true;
            if (this.Y.isShown()) {
                if (this.G0 == null) {
                    this.G0 = new Rect();
                    this.H0 = new Rect();
                }
                Rect rect = this.G0;
                Rect rect2 = this.H0;
                rect.set(0, i10, 0, 0);
                m0.a(this.f10351e0, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i10 : 0)) {
                    marginLayoutParams.topMargin = i10;
                    View view = this.f10353g0;
                    if (view == null) {
                        View view2 = new View(this.N);
                        this.f10353g0 = view2;
                        view2.setBackgroundColor(this.N.getResources().getColor(d.c.a_res_0x7f040007));
                        this.f10351e0.addView(this.f10353g0, -1, new ViewGroup.LayoutParams(-1, i10));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i10) {
                            layoutParams.height = i10;
                            this.f10353g0.setLayoutParams(layoutParams);
                        }
                    }
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f10353g0 == null) {
                    z12 = false;
                }
                if (!this.f10358l0 && z12) {
                    i10 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                this.Y.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.f10353g0;
        if (view3 != null) {
            if (!z10) {
                i11 = 8;
            }
            view3.setVisibility(i11);
        }
        return i10;
    }

    public void J(int i10, m mVar, Menu menu) {
        if (menu == null) {
            if (mVar == null && i10 >= 0) {
                m[] mVarArr = this.f10362p0;
                if (i10 < mVarArr.length) {
                    mVar = mVarArr[i10];
                }
            }
            if (mVar != null) {
                menu = mVar.f10400j;
            }
        }
        if ((mVar == null || mVar.f10405o) && !this.f10368v0) {
            this.P.a().onPanelClosed(i10, menu);
        }
    }

    public void K(androidx.appcompat.view.menu.e eVar) {
        if (!this.f10361o0) {
            this.f10361o0 = true;
            this.U.i();
            Window.Callback c02 = c0();
            if (c02 != null && !this.f10368v0) {
                c02.onPanelClosed(108, eVar);
            }
            this.f10361o0 = false;
        }
    }

    public final void L() {
        j jVar = this.A0;
        if (jVar != null) {
            jVar.a();
        }
        j jVar2 = this.B0;
        if (jVar2 != null) {
            jVar2.a();
        }
    }

    public void M(int i10) {
        N(a0(i10, true), true);
    }

    public void N(m mVar, boolean z10) {
        ViewGroup viewGroup;
        o oVar;
        if (!z10 || mVar.f10391a != 0 || (oVar = this.U) == null || !oVar.b()) {
            WindowManager windowManager = (WindowManager) this.N.getSystemService("window");
            if (!(windowManager == null || !mVar.f10405o || (viewGroup = mVar.f10397g) == null)) {
                windowManager.removeView(viewGroup);
                if (z10) {
                    J(mVar.f10391a, mVar, null);
                }
            }
            mVar.f10403m = false;
            mVar.f10404n = false;
            mVar.f10405o = false;
            mVar.f10398h = null;
            mVar.f10407q = true;
            if (this.f10363q0 == mVar) {
                this.f10363q0 = null;
                return;
            }
            return;
        }
        K(mVar.f10400j);
    }

    public final ViewGroup O() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.N.obtainStyledAttributes(d.j.B0);
        int i10 = d.j.G0;
        if (obtainStyledAttributes.hasValue(i10)) {
            if (obtainStyledAttributes.getBoolean(d.j.P0, false)) {
                y(1);
            } else if (obtainStyledAttributes.getBoolean(i10, false)) {
                y(108);
            }
            if (obtainStyledAttributes.getBoolean(d.j.H0, false)) {
                y(109);
            }
            if (obtainStyledAttributes.getBoolean(d.j.I0, false)) {
                y(10);
            }
            this.f10359m0 = obtainStyledAttributes.getBoolean(d.j.C0, false);
            obtainStyledAttributes.recycle();
            V();
            this.O.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.N);
            if (this.f10360n0) {
                if (this.f10358l0) {
                    viewGroup = (ViewGroup) from.inflate(d.g.f5961q, (ViewGroup) null);
                } else {
                    viewGroup = (ViewGroup) from.inflate(d.g.f5960p, (ViewGroup) null);
                }
                v.h0(viewGroup, new b());
            } else if (this.f10359m0) {
                viewGroup = (ViewGroup) from.inflate(d.g.f5952h, (ViewGroup) null);
                this.f10357k0 = false;
                this.f10356j0 = false;
            } else if (this.f10356j0) {
                TypedValue typedValue = new TypedValue();
                this.N.getTheme().resolveAttribute(d.a.f5893f, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new j.d(this.N, typedValue.resourceId);
                } else {
                    context = this.N;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(d.g.f5962r, (ViewGroup) null);
                o oVar = (o) viewGroup.findViewById(d.f.q_res_0x7f0703c4);
                this.U = oVar;
                oVar.setWindowCallback(c0());
                if (this.f10357k0) {
                    this.U.h(109);
                }
                if (this.f10354h0) {
                    this.U.h(2);
                }
                if (this.f10355i0) {
                    this.U.h(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.U == null) {
                    this.f10352f0 = (TextView) viewGroup.findViewById(d.f.S);
                }
                m0.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(d.f.b_res_0x7f070029);
                ViewGroup viewGroup2 = (ViewGroup) this.O.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.O.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f10356j0 + ", windowActionBarOverlay: " + this.f10357k0 + ", android:windowIsFloating: " + this.f10359m0 + ", windowActionModeOverlay: " + this.f10358l0 + ", windowNoTitle: " + this.f10360n0 + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    public View P(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        boolean z11 = false;
        if (this.I0 == null) {
            String string = this.N.obtainStyledAttributes(d.j.B0).getString(d.j.F0);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.I0 = new AppCompatViewInflater();
            } else {
                try {
                    this.I0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    android.util.Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.I0 = new AppCompatViewInflater();
                }
            }
        }
        boolean z12 = K0;
        if (z12) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z11 = B0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z11 = true;
            }
            z10 = z11;
        } else {
            z10 = false;
        }
        return this.I0.q(view, str, context, attributeSet, z10, z12, true, l0.b());
    }

    public void Q() {
        androidx.appcompat.view.menu.e eVar;
        o oVar = this.U;
        if (oVar != null) {
            oVar.i();
        }
        if (this.Z != null) {
            this.O.getDecorView().removeCallbacks(this.f10347a0);
            if (this.Z.isShowing()) {
                try {
                    this.Z.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.Z = null;
        }
        T();
        m a02 = a0(0, false);
        if (a02 != null && (eVar = a02.f10400j) != null) {
            eVar.close();
        }
    }

    public boolean R(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.M;
        boolean z10 = true;
        if (((obj instanceof f.a) || (obj instanceof e.e)) && (decorView = this.O.getDecorView()) != null && c1.f.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.P.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z10 = false;
        }
        return z10 ? m0(keyCode, keyEvent) : p0(keyCode, keyEvent);
    }

    public void S(int i10) {
        m a02;
        m a03 = a0(i10, true);
        if (a03.f10400j != null) {
            Bundle bundle = new Bundle();
            a03.f10400j.Q(bundle);
            if (bundle.size() > 0) {
                a03.f10409s = bundle;
            }
            a03.f10400j.d0();
            a03.f10400j.clear();
        }
        a03.f10408r = true;
        a03.f10407q = true;
        if ((i10 == 108 || i10 == 0) && this.U != null && (a02 = a0(0, false)) != null) {
            a02.f10403m = false;
            x0(a02, null);
        }
    }

    public void T() {
        a0 a0Var = this.f10348b0;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    public final void U() {
        if (!this.f10350d0) {
            this.f10351e0 = O();
            CharSequence b02 = b0();
            if (!TextUtils.isEmpty(b02)) {
                o oVar = this.U;
                if (oVar != null) {
                    oVar.setWindowTitle(b02);
                } else if (v0() != null) {
                    v0().t(b02);
                } else {
                    TextView textView = this.f10352f0;
                    if (textView != null) {
                        textView.setText(b02);
                    }
                }
            }
            G();
            t0(this.f10351e0);
            this.f10350d0 = true;
            m a02 = a0(0, false);
            if (this.f10368v0) {
                return;
            }
            if (a02 == null || a02.f10400j == null) {
                h0(108);
            }
        }
    }

    public final void V() {
        if (this.O == null) {
            Object obj = this.M;
            if (obj instanceof Activity) {
                H(((Activity) obj).getWindow());
            }
        }
        if (this.O == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public m W(Menu menu) {
        m[] mVarArr = this.f10362p0;
        int length = mVarArr != null ? mVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            m mVar = mVarArr[i10];
            if (mVar != null && mVar.f10400j == menu) {
                return mVar;
            }
        }
        return null;
    }

    public final Context X() {
        ActionBar k10 = k();
        Context k11 = k10 != null ? k10.k() : null;
        return k11 == null ? this.N : k11;
    }

    public final j Y() {
        if (this.B0 == null) {
            this.B0 = new i(this.N);
        }
        return this.B0;
    }

    public final j Z() {
        if (this.A0 == null) {
            this.A0 = new k(e.h.a(this.N));
        }
        return this.A0;
    }

    @Override
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        m W;
        Window.Callback c02 = c0();
        if (c02 == null || this.f10368v0 || (W = W(eVar.D())) == null) {
            return false;
        }
        return c02.onMenuItemSelected(W.f10391a, menuItem);
    }

    public m a0(int i10, boolean z10) {
        m[] mVarArr = this.f10362p0;
        if (mVarArr == null || mVarArr.length <= i10) {
            m[] mVarArr2 = new m[i10 + 1];
            if (mVarArr != null) {
                System.arraycopy(mVarArr, 0, mVarArr2, 0, mVarArr.length);
            }
            this.f10362p0 = mVarArr2;
            mVarArr = mVarArr2;
        }
        m mVar = mVarArr[i10];
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(i10);
        mVarArr[i10] = mVar2;
        return mVar2;
    }

    @Override
    public void b(androidx.appcompat.view.menu.e eVar) {
        y0(eVar, true);
    }

    public final CharSequence b0() {
        Object obj = this.M;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.T;
    }

    @Override
    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        ((ViewGroup) this.f10351e0.findViewById(16908290)).addView(view, layoutParams);
        this.P.a().onContentChanged();
    }

    public final Window.Callback c0() {
        return this.O.getCallback();
    }

    @Override
    public void d(Context context) {
        F(false);
        this.f10365s0 = true;
    }

    public final void d0() {
        U();
        if (this.f10356j0 && this.R == null) {
            Object obj = this.M;
            if (obj instanceof Activity) {
                this.R = new androidx.appcompat.app.b((Activity) this.M, this.f10357k0);
            } else if (obj instanceof Dialog) {
                this.R = new androidx.appcompat.app.b((Dialog) this.M);
            }
            ActionBar actionBar = this.R;
            if (actionBar != null) {
                actionBar.r(this.F0);
            }
        }
    }

    public final boolean e0(m mVar) {
        View view = mVar.f10399i;
        if (view != null) {
            mVar.f10398h = view;
            return true;
        } else if (mVar.f10400j == null) {
            return false;
        } else {
            if (this.W == null) {
                this.W = new n();
            }
            View view2 = (View) mVar.a(this.W);
            mVar.f10398h = view2;
            return view2 != null;
        }
    }

    public final boolean f0(m mVar) {
        mVar.d(X());
        mVar.f10397g = new l(mVar.f10402l);
        mVar.f10393c = 81;
        return true;
    }

    @Override
    public <T extends View> T g(int i10) {
        U();
        return (T) this.O.findViewById(i10);
    }

    public final boolean g0(m mVar) {
        Context context = this.N;
        int i10 = mVar.f10391a;
        if ((i10 == 0 || i10 == 108) && this.U != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(d.a.f5893f, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(d.a.f5894g, typedValue, true);
            } else {
                theme.resolveAttribute(d.a.f5894g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                j.d dVar = new j.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.R(this);
        mVar.c(eVar);
        return true;
    }

    public final void h0(int i10) {
        this.D0 = (1 << i10) | this.D0;
        if (!this.C0) {
            v.T(this.O.getDecorView(), this.E0);
            this.C0 = true;
        }
    }

    @Override
    public int i() {
        return this.f10369w0;
    }

    public final boolean i0() {
        if (!this.f10372z0 && (this.M instanceof Activity)) {
            PackageManager packageManager = this.N.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.N, this.M.getClass()), 0);
                this.f10371y0 = (activityInfo == null || (activityInfo.configChanges & Log.TAG_GIF_LOADER) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e10) {
                android.util.Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f10371y0 = false;
            }
        }
        this.f10372z0 = true;
        return this.f10371y0;
    }

    @Override
    public MenuInflater j() {
        if (this.S == null) {
            d0();
            ActionBar actionBar = this.R;
            this.S = new j.g(actionBar != null ? actionBar.k() : this.N);
        }
        return this.S;
    }

    public boolean j0() {
        return this.f10349c0;
    }

    @Override
    public ActionBar k() {
        d0();
        return this.R;
    }

    public int k0(int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 == -1) {
            return i10;
        }
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return i10;
            }
            if (i10 == 3) {
                return Y().c();
            }
            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
        } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) this.N.getSystemService(UiModeManager.class)).getNightMode() != 0) {
            return Z().c();
        } else {
            return -1;
        }
    }

    @Override
    public void l() {
        LayoutInflater from = LayoutInflater.from(this.N);
        if (from.getFactory() == null) {
            c1.g.a(from, this);
        } else if (!(from.getFactory2() instanceof d)) {
            android.util.Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public boolean l0() {
        j.b bVar = this.X;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        ActionBar k10 = k();
        return k10 != null && k10.h();
    }

    @Override
    public void m() {
        ActionBar k10 = k();
        if (k10 == null || !k10.l()) {
            h0(0);
        }
    }

    public boolean m0(int i10, KeyEvent keyEvent) {
        boolean z10 = true;
        if (i10 == 4) {
            if ((keyEvent.getFlags() & Log.TAG_YOUTUBE) == 0) {
                z10 = false;
            }
            this.f10364r0 = z10;
        } else if (i10 == 82) {
            n0(0, keyEvent);
            return true;
        }
        return false;
    }

    public final boolean n0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        m a02 = a0(i10, true);
        if (!a02.f10405o) {
            return x0(a02, keyEvent);
        }
        return false;
    }

    public boolean o0(int i10, KeyEvent keyEvent) {
        ActionBar k10 = k();
        if (k10 != null && k10.o(i10, keyEvent)) {
            return true;
        }
        m mVar = this.f10363q0;
        if (mVar == null || !w0(mVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f10363q0 == null) {
                m a02 = a0(0, true);
                x0(a02, keyEvent);
                boolean w02 = w0(a02, keyEvent.getKeyCode(), keyEvent, 1);
                a02.f10403m = false;
                if (w02) {
                    return true;
                }
            }
            return false;
        }
        m mVar2 = this.f10363q0;
        if (mVar2 != null) {
            mVar2.f10404n = true;
        }
        return true;
    }

    @Override
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return P(view, str, context, attributeSet);
    }

    @Override
    public void p(Configuration configuration) {
        ActionBar k10;
        if (this.f10356j0 && this.f10350d0 && (k10 = k()) != null) {
            k10.m(configuration);
        }
        androidx.appcompat.widget.g.b().g(this.N);
        F(false);
    }

    public boolean p0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            boolean z10 = this.f10364r0;
            this.f10364r0 = false;
            m a02 = a0(0, false);
            if (a02 != null && a02.f10405o) {
                if (!z10) {
                    N(a02, true);
                }
                return true;
            } else if (l0()) {
                return true;
            }
        } else if (i10 == 82) {
            q0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override
    public void q(Bundle bundle) {
        this.f10365s0 = true;
        F(false);
        V();
        Object obj = this.M;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = p0.f.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar v02 = v0();
                if (v02 == null) {
                    this.F0 = true;
                } else {
                    v02.r(true);
                }
            }
        }
        this.f10366t0 = true;
    }

    public final boolean q0(int r5, android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: e.d.q0(int, android.view.KeyEvent):boolean");
    }

    @Override
    public void r() {
        e.c.o(this);
        if (this.C0) {
            this.O.getDecorView().removeCallbacks(this.E0);
        }
        this.f10367u0 = false;
        this.f10368v0 = true;
        ActionBar actionBar = this.R;
        if (actionBar != null) {
            actionBar.n();
        }
        L();
    }

    public void r0(int i10) {
        ActionBar k10;
        if (i10 == 108 && (k10 = k()) != null) {
            k10.i(true);
        }
    }

    @Override
    public void s(Bundle bundle) {
        U();
    }

    public void s0(int i10) {
        if (i10 == 108) {
            ActionBar k10 = k();
            if (k10 != null) {
                k10.i(false);
            }
        } else if (i10 == 0) {
            m a02 = a0(i10, true);
            if (a02.f10405o) {
                N(a02, false);
            }
        }
    }

    @Override
    public void t() {
        ActionBar k10 = k();
        if (k10 != null) {
            k10.s(true);
        }
    }

    public void t0(ViewGroup viewGroup) {
    }

    @Override
    public void u(Bundle bundle) {
        if (this.f10369w0 != -100) {
            J0.put(this.M.getClass(), Integer.valueOf(this.f10369w0));
        }
    }

    public final void u0(m mVar, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (!mVar.f10405o && !this.f10368v0) {
            if (mVar.f10391a == 0) {
                if ((this.N.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback c02 = c0();
            if (c02 == null || c02.onMenuOpened(mVar.f10391a, mVar.f10400j)) {
                WindowManager windowManager = (WindowManager) this.N.getSystemService("window");
                if (windowManager != null && x0(mVar, keyEvent)) {
                    ViewGroup viewGroup = mVar.f10397g;
                    if (viewGroup == null || mVar.f10407q) {
                        if (viewGroup == null) {
                            if (!f0(mVar) || mVar.f10397g == null) {
                                return;
                            }
                        } else if (mVar.f10407q && viewGroup.getChildCount() > 0) {
                            mVar.f10397g.removeAllViews();
                        }
                        if (e0(mVar) && mVar.b()) {
                            ViewGroup.LayoutParams layoutParams2 = mVar.f10398h.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            mVar.f10397g.setBackgroundResource(mVar.f10392b);
                            ViewParent parent = mVar.f10398h.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(mVar.f10398h);
                            }
                            mVar.f10397g.addView(mVar.f10398h, layoutParams2);
                            if (!mVar.f10398h.hasFocus()) {
                                mVar.f10398h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else {
                        View view = mVar.f10399i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i10 = -1;
                            mVar.f10404n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i10, -2, mVar.f10394d, mVar.f10395e, 1002, 8519680, -3);
                            layoutParams3.gravity = mVar.f10393c;
                            layoutParams3.windowAnimations = mVar.f10396f;
                            windowManager.addView(mVar.f10397g, layoutParams3);
                            mVar.f10405o = true;
                            return;
                        }
                    }
                    i10 = -2;
                    mVar.f10404n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i10, -2, mVar.f10394d, mVar.f10395e, 1002, 8519680, -3);
                    layoutParams32.gravity = mVar.f10393c;
                    layoutParams32.windowAnimations = mVar.f10396f;
                    windowManager.addView(mVar.f10397g, layoutParams32);
                    mVar.f10405o = true;
                    return;
                }
                return;
            }
            N(mVar, true);
        }
    }

    @Override
    public void v() {
        this.f10367u0 = true;
        E();
        e.c.n(this);
    }

    public final ActionBar v0() {
        return this.R;
    }

    @Override
    public void w() {
        this.f10367u0 = false;
        e.c.o(this);
        ActionBar k10 = k();
        if (k10 != null) {
            k10.s(false);
        }
        if (this.M instanceof Dialog) {
            L();
        }
    }

    public final boolean w0(m mVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((mVar.f10403m || x0(mVar, keyEvent)) && (eVar = mVar.f10400j) != null) {
            z10 = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.U == null) {
            N(mVar, true);
        }
        return z10;
    }

    public final boolean x0(m mVar, KeyEvent keyEvent) {
        o oVar;
        o oVar2;
        o oVar3;
        if (this.f10368v0) {
            return false;
        }
        if (mVar.f10403m) {
            return true;
        }
        m mVar2 = this.f10363q0;
        if (!(mVar2 == null || mVar2 == mVar)) {
            N(mVar2, false);
        }
        Window.Callback c02 = c0();
        if (c02 != null) {
            mVar.f10399i = c02.onCreatePanelView(mVar.f10391a);
        }
        int i10 = mVar.f10391a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (oVar3 = this.U) != null) {
            oVar3.c();
        }
        if (mVar.f10399i == null) {
            if (z10) {
                v0();
            }
            androidx.appcompat.view.menu.e eVar = mVar.f10400j;
            if (eVar == null || mVar.f10408r) {
                if (eVar == null && (!g0(mVar) || mVar.f10400j == null)) {
                    return false;
                }
                if (z10 && this.U != null) {
                    if (this.V == null) {
                        this.V = new f();
                    }
                    this.U.a(mVar.f10400j, this.V);
                }
                mVar.f10400j.d0();
                if (!c02.onCreatePanelMenu(mVar.f10391a, mVar.f10400j)) {
                    mVar.c(null);
                    if (z10 && (oVar2 = this.U) != null) {
                        oVar2.a(null, this.V);
                    }
                    return false;
                }
                mVar.f10408r = false;
            }
            mVar.f10400j.d0();
            Bundle bundle = mVar.f10409s;
            if (bundle != null) {
                mVar.f10400j.P(bundle);
                mVar.f10409s = null;
            }
            if (!c02.onPreparePanel(0, mVar.f10399i, mVar.f10400j)) {
                if (z10 && (oVar = this.U) != null) {
                    oVar.a(null, this.V);
                }
                mVar.f10400j.c0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            mVar.f10406p = z11;
            mVar.f10400j.setQwertyMode(z11);
            mVar.f10400j.c0();
        }
        mVar.f10403m = true;
        mVar.f10404n = false;
        this.f10363q0 = mVar;
        return true;
    }

    @Override
    public boolean y(int i10) {
        int z02 = z0(i10);
        if (this.f10360n0 && z02 == 108) {
            return false;
        }
        if (this.f10356j0 && z02 == 1) {
            this.f10356j0 = false;
        }
        if (z02 == 1) {
            E0();
            this.f10360n0 = true;
            return true;
        } else if (z02 == 2) {
            E0();
            this.f10354h0 = true;
            return true;
        } else if (z02 == 5) {
            E0();
            this.f10355i0 = true;
            return true;
        } else if (z02 == 10) {
            E0();
            this.f10358l0 = true;
            return true;
        } else if (z02 == 108) {
            E0();
            this.f10356j0 = true;
            return true;
        } else if (z02 != 109) {
            return this.O.requestFeature(z02);
        } else {
            E0();
            this.f10357k0 = true;
            return true;
        }
    }

    public final void y0(androidx.appcompat.view.menu.e eVar, boolean z10) {
        o oVar = this.U;
        if (oVar == null || !oVar.d() || (ViewConfiguration.get(this.N).hasPermanentMenuKey() && !this.U.e())) {
            m a02 = a0(0, true);
            a02.f10407q = true;
            N(a02, false);
            u0(a02, null);
            return;
        }
        Window.Callback c02 = c0();
        if (this.U.b() && z10) {
            this.U.f();
            if (!this.f10368v0) {
                c02.onPanelClosed(108, a0(0, true).f10400j);
            }
        } else if (c02 != null && !this.f10368v0) {
            if (this.C0 && (this.D0 & 1) != 0) {
                this.O.getDecorView().removeCallbacks(this.E0);
                this.E0.run();
            }
            m a03 = a0(0, true);
            androidx.appcompat.view.menu.e eVar2 = a03.f10400j;
            if (eVar2 != null && !a03.f10408r && c02.onPreparePanel(0, a03.f10399i, eVar2)) {
                c02.onMenuOpened(108, a03.f10400j);
                this.U.g();
            }
        }
    }

    @Override
    public void z(int i10) {
        U();
        ViewGroup viewGroup = (ViewGroup) this.f10351e0.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.N).inflate(i10, viewGroup);
        this.P.a().onContentChanged();
    }

    public final int z0(int i10) {
        if (i10 == 8) {
            android.util.Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i10 != 9) {
            return i10;
        } else {
            android.util.Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    public d(Dialog dialog, e.b bVar) {
        this(dialog.getContext(), dialog.getWindow(), bVar, dialog);
    }

    @Override
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public d(Context context, Window window, e.b bVar, Object obj) {
        Map<Class<?>, Integer> map;
        Integer num;
        e.a F0;
        this.f10348b0 = null;
        this.f10349c0 = true;
        this.f10369w0 = -100;
        this.E0 = new a();
        this.N = context;
        this.Q = bVar;
        this.M = obj;
        if (this.f10369w0 == -100 && (obj instanceof Dialog) && (F0 = F0()) != null) {
            this.f10369w0 = F0.F().i();
        }
        if (this.f10369w0 == -100 && (num = (map = J0).get(obj.getClass())) != null) {
            this.f10369w0 = num.intValue();
            map.remove(obj.getClass());
        }
        if (window != null) {
            H(window);
        }
        androidx.appcompat.widget.g.h();
    }

    public class h extends j.i {
        public h(Window.Callback callback) {
            super(callback);
        }

        public final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(d.this.N, callback);
            j.b C0 = d.this.C0(aVar);
            if (C0 != null) {
                return aVar.e(C0);
            }
            return null;
        }

        @Override
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return d.this.R(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || d.this.o0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override
        public void onContentChanged() {
        }

        @Override
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            d.this.r0(i10);
            return true;
        }

        @Override
        public void onPanelClosed(int i10, Menu menu) {
            super.onPanelClosed(i10, menu);
            d.this.s0(i10);
        }

        @Override
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (eVar != null) {
                eVar.a0(false);
            }
            return onPreparePanel;
        }

        @Override
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            m a02 = d.this.a0(0, true);
            if (a02 == null || (eVar = a02.f10400j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        @Override
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (d.this.j0()) {
                return b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            if (!d.this.j0() || i10 != 0) {
                return super.onWindowStartingActionMode(callback, i10);
            }
            return b(callback);
        }
    }
}
