package p054e;

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
import androidx.appcompat.app.C0334b;
import androidx.appcompat.view.menu.AbstractC0359i;
import androidx.appcompat.view.menu.AbstractC0361j;
import androidx.appcompat.view.menu.C0348c;
import androidx.appcompat.view.menu.C0351e;
import androidx.appcompat.widget.AbstractC0473o;
import androidx.appcompat.widget.AbstractC0479s;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0450g;
import androidx.appcompat.widget.C0452g0;
import androidx.appcompat.widget.C0466l0;
import androidx.appcompat.widget.C0470m0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.lifecycle.AbstractC0840d;
import androidx.lifecycle.AbstractC0846g;
import java.lang.Thread;
import java.util.List;
import java.util.Map;
import org.thunderdog.challegram.Log;
import org.xmlpull.v1.XmlPullParser;
import p028c1.AbstractC1483s;
import p028c1.C1446d0;
import p028c1.C1452f;
import p028c1.C1454f0;
import p028c1.C1455g;
import p028c1.C1458h0;
import p028c1.C1489y;
import p039d.C3554a;
import p039d.C3556c;
import p039d.C3559f;
import p039d.C3560g;
import p039d.C3562i;
import p039d.C3563j;
import p068f.C4197a;
import p127j.AbstractC5814b;
import p127j.C5817d;
import p127j.C5819f;
import p127j.C5821g;
import p127j.Window$CallbackC5826i;
import p143k0.C6024a;
import p213p0.C7941a;
import p213p0.C7954f;

public class LayoutInflater$Factory2C4076d extends AbstractC4075c implements C0351e.AbstractC0352a, LayoutInflater.Factory2 {
    public static final Map<Class<?>, Integer> f13752J0 = new C6024a();
    public static final boolean f13753K0;
    public static final int[] f13754L0;
    public static boolean f13755M0;
    public static final boolean f13756N0;
    public AbstractC4090l f13757A0;
    public AbstractC4090l f13758B0;
    public boolean f13759C0;
    public int f13760D0;
    public final Runnable f13761E0;
    public boolean f13762F0;
    public Rect f13763G0;
    public Rect f13764H0;
    public AppCompatViewInflater f13765I0;
    public final Object f13766M;
    public final Context f13767N;
    public Window f13768O;
    public C4088j f13769P;
    public final AbstractC4074b f13770Q;
    public ActionBar f13771R;
    public MenuInflater f13772S;
    public CharSequence f13773T;
    public AbstractC0473o f13774U;
    public C4085h f13775V;
    public C4095p f13776W;
    public AbstractC5814b f13777X;
    public ActionBarContextView f13778Y;
    public PopupWindow f13779Z;
    public Runnable f13780a0;
    public C1446d0 f13781b0;
    public boolean f13782c0;
    public boolean f13783d0;
    public ViewGroup f13784e0;
    public TextView f13785f0;
    public View f13786g0;
    public boolean f13787h0;
    public boolean f13788i0;
    public boolean f13789j0;
    public boolean f13790k0;
    public boolean f13791l0;
    public boolean f13792m0;
    public boolean f13793n0;
    public boolean f13794o0;
    public C4094o[] f13795p0;
    public C4094o f13796q0;
    public boolean f13797r0;
    public boolean f13798s0;
    public boolean f13799t0;
    public boolean f13800u0;
    public boolean f13801v0;
    public int f13802w0;
    public int f13803x0;
    public boolean f13804y0;
    public boolean f13805z0;

    public static class C4077a implements Thread.UncaughtExceptionHandler {
        public final Thread.UncaughtExceptionHandler f13806a;

        public C4077a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f13806a = uncaughtExceptionHandler;
        }

        public final boolean m28948a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override
        public void uncaughtException(Thread thread, Throwable th) {
            if (m28948a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f13806a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f13806a.uncaughtException(thread, th);
        }
    }

    public class RunnableC4078b implements Runnable {
        public RunnableC4078b() {
        }

        @Override
        public void run() {
            LayoutInflater$Factory2C4076d dVar = LayoutInflater$Factory2C4076d.this;
            if ((dVar.f13760D0 & 1) != 0) {
                dVar.m29000S(0);
            }
            LayoutInflater$Factory2C4076d dVar2 = LayoutInflater$Factory2C4076d.this;
            if ((dVar2.f13760D0 & Log.TAG_EMOJI) != 0) {
                dVar2.m29000S(108);
            }
            LayoutInflater$Factory2C4076d dVar3 = LayoutInflater$Factory2C4076d.this;
            dVar3.f13759C0 = false;
            dVar3.f13760D0 = 0;
        }
    }

    public class C4079c implements AbstractC1483s {
        public C4079c() {
        }

        @Override
        public C1458h0 mo28947a(View view, C1458h0 h0Var) {
            int k = h0Var.m36870k();
            int I0 = LayoutInflater$Factory2C4076d.this.m29010I0(k);
            if (k != I0) {
                h0Var = h0Var.m36868m(h0Var.m36872i(), I0, h0Var.m36871j(), h0Var.m36873h());
            }
            return C1489y.m36756Q(view, h0Var);
        }
    }

    public class C4080d implements AbstractC0479s.AbstractC0480a {
        public C4080d() {
        }

        @Override
        public void mo28946a(Rect rect) {
            rect.top = LayoutInflater$Factory2C4076d.this.m29010I0(rect.top);
        }
    }

    public class C4081e implements ContentFrameLayout.AbstractC0394a {
        public C4081e() {
        }

        @Override
        public void mo28945a() {
        }

        @Override
        public void onDetachedFromWindow() {
            LayoutInflater$Factory2C4076d.this.m29002Q();
        }
    }

    public class RunnableC4082f implements Runnable {

        public class C4083a extends C1454f0 {
            public C4083a() {
            }

            @Override
            public void mo11617b(View view) {
                LayoutInflater$Factory2C4076d.this.f13778Y.setAlpha(1.0f);
                LayoutInflater$Factory2C4076d.this.f13781b0.m36900f(null);
                LayoutInflater$Factory2C4076d.this.f13781b0 = null;
            }

            @Override
            public void mo11616c(View view) {
                LayoutInflater$Factory2C4076d.this.f13778Y.setVisibility(0);
            }
        }

        public RunnableC4082f() {
        }

        @Override
        public void run() {
            LayoutInflater$Factory2C4076d dVar = LayoutInflater$Factory2C4076d.this;
            dVar.f13779Z.showAtLocation(dVar.f13778Y, 55, 0, 0);
            LayoutInflater$Factory2C4076d.this.m28999T();
            if (LayoutInflater$Factory2C4076d.this.m29026A0()) {
                LayoutInflater$Factory2C4076d.this.f13778Y.setAlpha(0.0f);
                LayoutInflater$Factory2C4076d dVar2 = LayoutInflater$Factory2C4076d.this;
                dVar2.f13781b0 = C1489y.m36744b(dVar2.f13778Y).m36905a(1.0f);
                LayoutInflater$Factory2C4076d.this.f13781b0.m36900f(new C4083a());
                return;
            }
            LayoutInflater$Factory2C4076d.this.f13778Y.setAlpha(1.0f);
            LayoutInflater$Factory2C4076d.this.f13778Y.setVisibility(0);
        }
    }

    public class C4084g extends C1454f0 {
        public C4084g() {
        }

        @Override
        public void mo11617b(View view) {
            LayoutInflater$Factory2C4076d.this.f13778Y.setAlpha(1.0f);
            LayoutInflater$Factory2C4076d.this.f13781b0.m36900f(null);
            LayoutInflater$Factory2C4076d.this.f13781b0 = null;
        }

        @Override
        public void mo11616c(View view) {
            LayoutInflater$Factory2C4076d.this.f13778Y.setVisibility(0);
            LayoutInflater$Factory2C4076d.this.f13778Y.sendAccessibilityEvent(32);
            if (LayoutInflater$Factory2C4076d.this.f13778Y.getParent() instanceof View) {
                C1489y.m36750W((View) LayoutInflater$Factory2C4076d.this.f13778Y.getParent());
            }
        }
    }

    public final class C4085h implements AbstractC0359i.AbstractC0360a {
        public C4085h() {
        }

        @Override
        public void mo28933b(C0351e eVar, boolean z) {
            LayoutInflater$Factory2C4076d.this.m29008K(eVar);
        }

        @Override
        public boolean mo28932c(C0351e eVar) {
            Window.Callback c0 = LayoutInflater$Factory2C4076d.this.m28989c0();
            if (c0 == null) {
                return true;
            }
            c0.onMenuOpened(108, eVar);
            return true;
        }
    }

    public class C4086i implements AbstractC5814b.AbstractC5815a {
        public AbstractC5814b.AbstractC5815a f13815a;

        public class C4087a extends C1454f0 {
            public C4087a() {
            }

            @Override
            public void mo11617b(View view) {
                LayoutInflater$Factory2C4076d.this.f13778Y.setVisibility(8);
                LayoutInflater$Factory2C4076d dVar = LayoutInflater$Factory2C4076d.this;
                PopupWindow popupWindow = dVar.f13779Z;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (dVar.f13778Y.getParent() instanceof View) {
                    C1489y.m36750W((View) LayoutInflater$Factory2C4076d.this.f13778Y.getParent());
                }
                LayoutInflater$Factory2C4076d.this.f13778Y.removeAllViews();
                LayoutInflater$Factory2C4076d.this.f13781b0.m36900f(null);
                LayoutInflater$Factory2C4076d.this.f13781b0 = null;
            }
        }

        public C4086i(AbstractC5814b.AbstractC5815a aVar) {
            this.f13815a = aVar;
        }

        @Override
        public boolean mo22090a(AbstractC5814b bVar, Menu menu) {
            return this.f13815a.mo22090a(bVar, menu);
        }

        @Override
        public void mo22089b(AbstractC5814b bVar) {
            this.f13815a.mo22089b(bVar);
            LayoutInflater$Factory2C4076d dVar = LayoutInflater$Factory2C4076d.this;
            if (dVar.f13779Z != null) {
                dVar.f13768O.getDecorView().removeCallbacks(LayoutInflater$Factory2C4076d.this.f13780a0);
            }
            LayoutInflater$Factory2C4076d dVar2 = LayoutInflater$Factory2C4076d.this;
            if (dVar2.f13778Y != null) {
                dVar2.m28999T();
                LayoutInflater$Factory2C4076d dVar3 = LayoutInflater$Factory2C4076d.this;
                dVar3.f13781b0 = C1489y.m36744b(dVar3.f13778Y).m36905a(0.0f);
                LayoutInflater$Factory2C4076d.this.f13781b0.m36900f(new C4087a());
            }
            LayoutInflater$Factory2C4076d dVar4 = LayoutInflater$Factory2C4076d.this;
            AbstractC4074b bVar2 = dVar4.f13770Q;
            if (bVar2 != null) {
                bVar2.mo28926h(dVar4.f13777X);
            }
            LayoutInflater$Factory2C4076d.this.f13777X = null;
        }

        @Override
        public boolean mo22088c(AbstractC5814b bVar, MenuItem menuItem) {
            return this.f13815a.mo22088c(bVar, menuItem);
        }

        @Override
        public boolean mo22087d(AbstractC5814b bVar, Menu menu) {
            return this.f13815a.mo22087d(bVar, menu);
        }
    }

    public class C4089k extends AbstractC4090l {
        public final PowerManager f13819c;

        public C4089k(Context context) {
            super();
            this.f13819c = (PowerManager) context.getSystemService("power");
        }

        @Override
        public IntentFilter mo28941b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override
        public int mo28940c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f13819c.isPowerSaveMode()) ? 1 : 2;
        }

        @Override
        public void mo28939d() {
            LayoutInflater$Factory2C4076d.this.m29019E();
        }
    }

    public abstract class AbstractC4090l {
        public BroadcastReceiver f13821a;

        public class C4091a extends BroadcastReceiver {
            public C4091a() {
            }

            @Override
            public void onReceive(Context context, Intent intent) {
                AbstractC4090l.this.mo28939d();
            }
        }

        public AbstractC4090l() {
        }

        public void m28943a() {
            BroadcastReceiver broadcastReceiver = this.f13821a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflater$Factory2C4076d.this.f13767N.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f13821a = null;
            }
        }

        public abstract IntentFilter mo28941b();

        public abstract int mo28940c();

        public abstract void mo28939d();

        public void m28942e() {
            m28943a();
            IntentFilter b = mo28941b();
            if (b != null && b.countActions() != 0) {
                if (this.f13821a == null) {
                    this.f13821a = new C4091a();
                }
                LayoutInflater$Factory2C4076d.this.f13767N.registerReceiver(this.f13821a, b);
            }
        }
    }

    public class C4092m extends AbstractC4090l {
        public final C4100h f13824c;

        public C4092m(C4100h hVar) {
            super();
            this.f13824c = hVar;
        }

        @Override
        public IntentFilter mo28941b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override
        public int mo28940c() {
            return this.f13824c.m28914d() ? 2 : 1;
        }

        @Override
        public void mo28939d() {
            LayoutInflater$Factory2C4076d.this.m29019E();
        }
    }

    public class C4093n extends ContentFrameLayout {
        public C4093n(Context context) {
            super(context);
        }

        public final boolean m28938c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflater$Factory2C4076d.this.m29001R(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m28938c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LayoutInflater$Factory2C4076d.this.m29006M(0);
            return true;
        }

        @Override
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C4197a.m28486d(getContext(), i));
        }
    }

    public static final class C4094o {
        public int f13827a;
        public int f13828b;
        public int f13829c;
        public int f13830d;
        public int f13831e;
        public int f13832f;
        public ViewGroup f13833g;
        public View f13834h;
        public View f13835i;
        public C0351e f13836j;
        public C0348c f13837k;
        public Context f13838l;
        public boolean f13839m;
        public boolean f13840n;
        public boolean f13841o;
        public boolean f13842p;
        public boolean f13843q = false;
        public boolean f13844r;
        public Bundle f13845s;

        public C4094o(int i) {
            this.f13827a = i;
        }

        public AbstractC0361j m28937a(AbstractC0359i.AbstractC0360a aVar) {
            if (this.f13836j == null) {
                return null;
            }
            if (this.f13837k == null) {
                C0348c cVar = new C0348c(this.f13838l, C3560g.l);
                this.f13837k = cVar;
                cVar.mo41636g(aVar);
                this.f13836j.m41703b(this.f13837k);
            }
            return this.f13837k.m41733h(this.f13833g);
        }

        public boolean m28936b() {
            if (this.f13834h == null) {
                return false;
            }
            return this.f13835i != null || this.f13837k.m41734a().getCount() > 0;
        }

        public void m28935c(C0351e eVar) {
            C0348c cVar;
            C0351e eVar2 = this.f13836j;
            if (eVar != eVar2) {
                if (eVar2 != null) {
                    eVar2.m41716O(this.f13837k);
                }
                this.f13836j = eVar;
                if (eVar != null && (cVar = this.f13837k) != null) {
                    eVar.m41703b(cVar);
                }
            }
        }

        public void m28934d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C3554a.a_res_0x7f020002, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C3554a.E, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(C3562i.b, true);
            }
            C5817d dVar = new C5817d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f13838l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C3563j.f11907B0);
            this.f13828b = obtainStyledAttributes.getResourceId(C3563j.f11922E0, 0);
            this.f13832f = obtainStyledAttributes.getResourceId(C3563j.f11917D0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public final class C4095p implements AbstractC0359i.AbstractC0360a {
        public C4095p() {
        }

        @Override
        public void mo28933b(C0351e eVar, boolean z) {
            C0351e D = eVar.mo41634D();
            boolean z2 = D != eVar;
            LayoutInflater$Factory2C4076d dVar = LayoutInflater$Factory2C4076d.this;
            if (z2) {
                eVar = D;
            }
            C4094o W = dVar.m28996W(eVar);
            if (W == null) {
                return;
            }
            if (z2) {
                LayoutInflater$Factory2C4076d.this.m29009J(W.f13827a, W, D);
                LayoutInflater$Factory2C4076d.this.m29005N(W, true);
                return;
            }
            LayoutInflater$Factory2C4076d.this.m29005N(W, z);
        }

        @Override
        public boolean mo28932c(C0351e eVar) {
            Window.Callback c0;
            if (eVar != null) {
                return true;
            }
            LayoutInflater$Factory2C4076d dVar = LayoutInflater$Factory2C4076d.this;
            if (!dVar.f13789j0 || (c0 = dVar.m28989c0()) == null || LayoutInflater$Factory2C4076d.this.f13801v0) {
                return true;
            }
            c0.onMenuOpened(108, eVar);
            return true;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i < 21;
        f13753K0 = z2;
        f13754L0 = new int[]{16842836};
        if (i >= 21 && i <= 25) {
            z = true;
        }
        f13756N0 = z;
        if (z2 && !f13755M0) {
            Thread.setDefaultUncaughtExceptionHandler(new C4077a(Thread.getDefaultUncaughtExceptionHandler()));
            f13755M0 = true;
        }
    }

    public LayoutInflater$Factory2C4076d(Activity activity, AbstractC4074b bVar) {
        this(activity, null, bVar, activity);
    }

    @Override
    public void mo29027A(View view) {
        m28998U();
        ViewGroup viewGroup = (ViewGroup) this.f13784e0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f13769P.m22063a().onContentChanged();
    }

    public final boolean m29026A0() {
        ViewGroup viewGroup;
        return this.f13783d0 && (viewGroup = this.f13784e0) != null && C1489y.m36762K(viewGroup);
    }

    @Override
    public void mo29025B(View view, ViewGroup.LayoutParams layoutParams) {
        m28998U();
        ViewGroup viewGroup = (ViewGroup) this.f13784e0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f13769P.m22063a().onContentChanged();
    }

    public final boolean m29024B0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f13768O.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C1489y.m36763J((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    @Override
    public void mo29023C(int i) {
        this.f13803x0 = i;
    }

    public AbstractC5814b m29022C0(AbstractC5814b.AbstractC5815a aVar) {
        AbstractC4074b bVar;
        if (aVar != null) {
            AbstractC5814b bVar2 = this.f13777X;
            if (bVar2 != null) {
                bVar2.mo22104c();
            }
            C4086i iVar = new C4086i(aVar);
            ActionBar k = mo28977k();
            if (k != null) {
                AbstractC5814b u = k.mo41762u(iVar);
                this.f13777X = u;
                if (!(u == null || (bVar = this.f13770Q) == null)) {
                    bVar.mo28928d(u);
                }
            }
            if (this.f13777X == null) {
                this.f13777X = m29020D0(iVar);
            }
            return this.f13777X;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    @Override
    public final void mo29021D(CharSequence charSequence) {
        this.f13773T = charSequence;
        AbstractC0473o oVar = this.f13774U;
        if (oVar != null) {
            oVar.setWindowTitle(charSequence);
        } else if (m28956v0() != null) {
            m28956v0().mo41763t(charSequence);
        } else {
            TextView textView = this.f13785f0;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public p127j.AbstractC5814b m29020D0(p127j.AbstractC5814b.AbstractC5815a r8) {
        throw new UnsupportedOperationException("Method not decompiled: p054e.LayoutInflater$Factory2C4076d.m29020D0(j.b$a):j.b");
    }

    public boolean m29019E() {
        return m29017F(true);
    }

    public final void m29018E0() {
        if (this.f13783d0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final boolean m29017F(boolean z) {
        if (this.f13801v0) {
            return false;
        }
        int I = m29011I();
        boolean G0 = m29014G0(m28976k0(I), z);
        if (I == 0) {
            m28993Z().m28942e();
        } else {
            AbstractC4090l lVar = this.f13757A0;
            if (lVar != null) {
                lVar.m28943a();
            }
        }
        if (I == 3) {
            m28994Y().m28942e();
        } else {
            AbstractC4090l lVar2 = this.f13758B0;
            if (lVar2 != null) {
                lVar2.m28943a();
            }
        }
        return G0;
    }

    public final ActivityC4073a m29016F0() {
        for (Context context = this.f13767N; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof ActivityC4073a) {
                return (ActivityC4073a) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public final void m29015G() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f13784e0.findViewById(16908290);
        View decorView = this.f13768O.getDecorView();
        contentFrameLayout.m41539b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f13767N.obtainStyledAttributes(C3563j.f11907B0);
        obtainStyledAttributes.getValue(C3563j.f11967N0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C3563j.f11972O0, contentFrameLayout.getMinWidthMinor());
        int i = C3563j.f11957L0;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = C3563j.f11962M0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = C3563j.f11947J0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = C3563j.f11952K0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final boolean m29014G0(int i, boolean z) {
        int i2 = this.f13767N.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        boolean z2 = true;
        int i3 = i != 1 ? i != 2 ? i2 : 32 : 16;
        boolean i0 = m28980i0();
        boolean z3 = false;
        if ((f13756N0 || i3 != i2) && !i0 && Build.VERSION.SDK_INT >= 17 && !this.f13798s0 && (this.f13766M instanceof ContextThemeWrapper)) {
            Configuration configuration = new Configuration();
            configuration.uiMode = (configuration.uiMode & (-49)) | i3;
            try {
                ((ContextThemeWrapper) this.f13766M).applyOverrideConfiguration(configuration);
                z3 = true;
            } catch (IllegalStateException e) {
                android.util.Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", e);
            }
        }
        int i4 = this.f13767N.getResources().getConfiguration().uiMode & 48;
        if (!z3 && i4 != i3 && z && !i0 && this.f13798s0 && (Build.VERSION.SDK_INT >= 17 || this.f13799t0)) {
            Object obj = this.f13766M;
            if (obj instanceof Activity) {
                C7941a.m14026p((Activity) obj);
                z3 = true;
            }
        }
        if (z3 || i4 == i3) {
            z2 = z3;
        } else {
            m29012H0(i3, i0);
        }
        if (z2) {
            Object obj2 = this.f13766M;
            if (obj2 instanceof ActivityC4073a) {
                ((ActivityC4073a) obj2).m29040G(i);
            }
        }
        return z2;
    }

    public final void m29013H(Window window) {
        if (this.f13768O == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C4088j)) {
                C4088j jVar = new C4088j(callback);
                this.f13769P = jVar;
                window.setCallback(jVar);
                C0452g0 s = C0452g0.m41259s(this.f13767N, null, f13754L0);
                Drawable g = s.m41271g(0);
                if (g != null) {
                    window.setBackgroundDrawable(g);
                }
                s.m41257u();
                this.f13768O = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void m29012H0(int i, boolean z) {
        Resources resources = this.f13767N.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration, null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            C4098f.m28924a(resources);
        }
        int i3 = this.f13803x0;
        if (i3 != 0) {
            this.f13767N.setTheme(i3);
            if (i2 >= 23) {
                this.f13767N.getTheme().applyStyle(this.f13803x0, true);
            }
        }
        if (z) {
            Object obj = this.f13766M;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof AbstractC0846g) {
                    if (((AbstractC0846g) activity).mo14007a().mo39663b().m39665a(AbstractC0840d.EnumC0843c.STARTED)) {
                        activity.onConfigurationChanged(configuration);
                    }
                } else if (this.f13800u0) {
                    activity.onConfigurationChanged(configuration);
                }
            }
        }
    }

    public final int m29011I() {
        int i = this.f13802w0;
        return i != -100 ? i : AbstractC4075c.m29031h();
    }

    public int m29010I0(int i) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.f13778Y;
        int i2 = 0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f13778Y.getLayoutParams();
            boolean z3 = true;
            if (this.f13778Y.isShown()) {
                if (this.f13763G0 == null) {
                    this.f13763G0 = new Rect();
                    this.f13764H0 = new Rect();
                }
                Rect rect = this.f13763G0;
                Rect rect2 = this.f13764H0;
                rect.set(0, i, 0, 0);
                C0470m0.m41174a(this.f13784e0, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    View view = this.f13786g0;
                    if (view == null) {
                        View view2 = new View(this.f13767N);
                        this.f13786g0 = view2;
                        view2.setBackgroundColor(this.f13767N.getResources().getColor(C3556c.a_res_0x7f040007));
                        this.f13784e0.addView(this.f13786g0, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f13786g0.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f13786g0 == null) {
                    z3 = false;
                }
                if (!this.f13791l0 && z3) {
                    i = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f13778Y.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.f13786g0;
        if (view3 != null) {
            if (!z) {
                i2 = 8;
            }
            view3.setVisibility(i2);
        }
        return i;
    }

    public void m29009J(int i, C4094o oVar, Menu menu) {
        if (menu == null) {
            if (oVar == null && i >= 0) {
                C4094o[] oVarArr = this.f13795p0;
                if (i < oVarArr.length) {
                    oVar = oVarArr[i];
                }
            }
            if (oVar != null) {
                menu = oVar.f13836j;
            }
        }
        if ((oVar == null || oVar.f13841o) && !this.f13801v0) {
            this.f13769P.m22063a().onPanelClosed(i, menu);
        }
    }

    public void m29008K(C0351e eVar) {
        if (!this.f13794o0) {
            this.f13794o0 = true;
            this.f13774U.mo41131i();
            Window.Callback c0 = m28989c0();
            if (c0 != null && !this.f13801v0) {
                c0.onPanelClosed(108, eVar);
            }
            this.f13794o0 = false;
        }
    }

    public final void m29007L() {
        AbstractC4090l lVar = this.f13757A0;
        if (lVar != null) {
            lVar.m28943a();
        }
        AbstractC4090l lVar2 = this.f13758B0;
        if (lVar2 != null) {
            lVar2.m28943a();
        }
    }

    public void m29006M(int i) {
        m29005N(m28992a0(i, true), true);
    }

    public void m29005N(C4094o oVar, boolean z) {
        ViewGroup viewGroup;
        AbstractC0473o oVar2;
        if (!z || oVar.f13827a != 0 || (oVar2 = this.f13774U) == null || !oVar2.mo41138b()) {
            WindowManager windowManager = (WindowManager) this.f13767N.getSystemService("window");
            if (!(windowManager == null || !oVar.f13841o || (viewGroup = oVar.f13833g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    m29009J(oVar.f13827a, oVar, null);
                }
            }
            oVar.f13839m = false;
            oVar.f13840n = false;
            oVar.f13841o = false;
            oVar.f13834h = null;
            oVar.f13843q = true;
            if (this.f13796q0 == oVar) {
                this.f13796q0 = null;
                return;
            }
            return;
        }
        m29008K(oVar.f13836j);
    }

    public final ViewGroup m29004O() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f13767N.obtainStyledAttributes(C3563j.f11907B0);
        int i = C3563j.f11932G0;
        if (obtainStyledAttributes.hasValue(i)) {
            if (obtainStyledAttributes.getBoolean(C3563j.f11977P0, false)) {
                mo28952y(1);
            } else if (obtainStyledAttributes.getBoolean(i, false)) {
                mo28952y(108);
            }
            if (obtainStyledAttributes.getBoolean(C3563j.f11937H0, false)) {
                mo28952y(109);
            }
            if (obtainStyledAttributes.getBoolean(C3563j.f11942I0, false)) {
                mo28952y(10);
            }
            this.f13792m0 = obtainStyledAttributes.getBoolean(C3563j.f11912C0, false);
            obtainStyledAttributes.recycle();
            m28997V();
            this.f13768O.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f13767N);
            if (this.f13793n0) {
                if (this.f13791l0) {
                    viewGroup = (ViewGroup) from.inflate(C3560g.q, (ViewGroup) null);
                } else {
                    viewGroup = (ViewGroup) from.inflate(C3560g.p, (ViewGroup) null);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    C1489y.m36729i0(viewGroup, new C4079c());
                } else {
                    ((AbstractC0479s) viewGroup).setOnFitSystemWindowsListener(new C4080d());
                }
            } else if (this.f13792m0) {
                viewGroup = (ViewGroup) from.inflate(C3560g.h, (ViewGroup) null);
                this.f13790k0 = false;
                this.f13789j0 = false;
            } else if (this.f13789j0) {
                TypedValue typedValue = new TypedValue();
                this.f13767N.getTheme().resolveAttribute(C3554a.f, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new C5817d(this.f13767N, typedValue.resourceId);
                } else {
                    context = this.f13767N;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C3560g.r, (ViewGroup) null);
                AbstractC0473o oVar = (AbstractC0473o) viewGroup.findViewById(C3559f.q_res_0x7f0703c2);
                this.f13774U = oVar;
                oVar.setWindowCallback(m28989c0());
                if (this.f13790k0) {
                    this.f13774U.mo41132h(109);
                }
                if (this.f13787h0) {
                    this.f13774U.mo41132h(2);
                }
                if (this.f13788i0) {
                    this.f13774U.mo41132h(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.f13774U == null) {
                    this.f13785f0 = (TextView) viewGroup.findViewById(C3559f.S);
                }
                C0470m0.m41172c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C3559f.b_res_0x7f070029);
                ViewGroup viewGroup2 = (ViewGroup) this.f13768O.findViewById(16908290);
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
                this.f13768O.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C4081e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f13789j0 + ", windowActionBarOverlay: " + this.f13790k0 + ", android:windowIsFloating: " + this.f13792m0 + ", windowActionModeOverlay: " + this.f13791l0 + ", windowNoTitle: " + this.f13793n0 + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    public View m29003P(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f13765I0 == null) {
            String string = this.f13767N.obtainStyledAttributes(C3563j.f11907B0).getString(C3563j.f11927F0);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                this.f13765I0 = new AppCompatViewInflater();
            } else {
                try {
                    this.f13765I0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    android.util.Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f13765I0 = new AppCompatViewInflater();
                }
            }
        }
        boolean z3 = f13753K0;
        if (z3) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m29024B0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f13765I0.m41800q(view, str, context, attributeSet, z, z3, true, C0466l0.m41205b());
    }

    public void m29002Q() {
        C0351e eVar;
        AbstractC0473o oVar = this.f13774U;
        if (oVar != null) {
            oVar.mo41131i();
        }
        if (this.f13779Z != null) {
            this.f13768O.getDecorView().removeCallbacks(this.f13780a0);
            if (this.f13779Z.isShowing()) {
                try {
                    this.f13779Z.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f13779Z = null;
        }
        m28999T();
        C4094o a0 = m28992a0(0, false);
        if (a0 != null && (eVar = a0.f13836j) != null) {
            eVar.close();
        }
    }

    public boolean m29001R(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f13766M;
        boolean z = true;
        if (((obj instanceof C1452f.AbstractC1453a) || (obj instanceof DialogC4096e)) && (decorView = this.f13768O.getDecorView()) != null && C1452f.m36888d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f13769P.m22063a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? m28972m0(keyCode, keyEvent) : m28968p0(keyCode, keyEvent);
    }

    public void m29000S(int i) {
        C4094o a0;
        C4094o a02 = m28992a0(i, true);
        if (a02.f13836j != null) {
            Bundle bundle = new Bundle();
            a02.f13836j.m41714Q(bundle);
            if (bundle.size() > 0) {
                a02.f13845s = bundle;
            }
            a02.f13836j.m41698d0();
            a02.f13836j.clear();
        }
        a02.f13844r = true;
        a02.f13843q = true;
        if ((i == 108 || i == 0) && this.f13774U != null && (a0 = m28992a0(0, false)) != null) {
            a0.f13839m = false;
            m28953x0(a0, null);
        }
    }

    public void m28999T() {
        C1446d0 d0Var = this.f13781b0;
        if (d0Var != null) {
            d0Var.m36904b();
        }
    }

    public final void m28998U() {
        if (!this.f13783d0) {
            this.f13784e0 = m29004O();
            CharSequence b0 = m28991b0();
            if (!TextUtils.isEmpty(b0)) {
                AbstractC0473o oVar = this.f13774U;
                if (oVar != null) {
                    oVar.setWindowTitle(b0);
                } else if (m28956v0() != null) {
                    m28956v0().mo41763t(b0);
                } else {
                    TextView textView = this.f13785f0;
                    if (textView != null) {
                        textView.setText(b0);
                    }
                }
            }
            m29015G();
            m28960t0(this.f13784e0);
            this.f13783d0 = true;
            C4094o a0 = m28992a0(0, false);
            if (this.f13801v0) {
                return;
            }
            if (a0 == null || a0.f13836j == null) {
                m28982h0(108);
            }
        }
    }

    public final void m28997V() {
        if (this.f13768O == null) {
            Object obj = this.f13766M;
            if (obj instanceof Activity) {
                m29013H(((Activity) obj).getWindow());
            }
        }
        if (this.f13768O == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public C4094o m28996W(Menu menu) {
        C4094o[] oVarArr = this.f13795p0;
        int length = oVarArr != null ? oVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C4094o oVar = oVarArr[i];
            if (oVar != null && oVar.f13836j == menu) {
                return oVar;
            }
        }
        return null;
    }

    public final Context m28995X() {
        ActionBar k = mo28977k();
        Context k2 = k != null ? k.mo41768k() : null;
        return k2 == null ? this.f13767N : k2;
    }

    public final AbstractC4090l m28994Y() {
        if (this.f13758B0 == null) {
            this.f13758B0 = new C4089k(this.f13767N);
        }
        return this.f13758B0;
    }

    public final AbstractC4090l m28993Z() {
        if (this.f13757A0 == null) {
            this.f13757A0 = new C4092m(C4100h.m28917a(this.f13767N));
        }
        return this.f13757A0;
    }

    @Override
    public boolean mo22106a(C0351e eVar, MenuItem menuItem) {
        C4094o W;
        Window.Callback c0 = m28989c0();
        if (c0 == null || this.f13801v0 || (W = m28996W(eVar.mo41634D())) == null) {
            return false;
        }
        return c0.onMenuItemSelected(W.f13827a, menuItem);
    }

    public C4094o m28992a0(int i, boolean z) {
        C4094o[] oVarArr = this.f13795p0;
        if (oVarArr == null || oVarArr.length <= i) {
            C4094o[] oVarArr2 = new C4094o[i + 1];
            if (oVarArr != null) {
                System.arraycopy(oVarArr, 0, oVarArr2, 0, oVarArr.length);
            }
            this.f13795p0 = oVarArr2;
            oVarArr = oVarArr2;
        }
        C4094o oVar = oVarArr[i];
        if (oVar != null) {
            return oVar;
        }
        C4094o oVar2 = new C4094o(i);
        oVarArr[i] = oVar2;
        return oVar2;
    }

    @Override
    public void mo22105b(C0351e eVar) {
        m28951y0(eVar, true);
    }

    public final CharSequence m28991b0() {
        Object obj = this.f13766M;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f13773T;
    }

    @Override
    public void mo28990c(View view, ViewGroup.LayoutParams layoutParams) {
        m28998U();
        ((ViewGroup) this.f13784e0.findViewById(16908290)).addView(view, layoutParams);
        this.f13769P.m22063a().onContentChanged();
    }

    public final Window.Callback m28989c0() {
        return this.f13768O.getCallback();
    }

    @Override
    public void mo28988d(Context context) {
        m29017F(false);
        this.f13798s0 = true;
    }

    public final void m28987d0() {
        m28998U();
        if (this.f13789j0 && this.f13771R == null) {
            Object obj = this.f13766M;
            if (obj instanceof Activity) {
                this.f13771R = new C0334b((Activity) this.f13766M, this.f13790k0);
            } else if (obj instanceof Dialog) {
                this.f13771R = new C0334b((Dialog) this.f13766M);
            }
            ActionBar actionBar = this.f13771R;
            if (actionBar != null) {
                actionBar.mo41765r(this.f13762F0);
            }
        }
    }

    public final boolean m28986e0(C4094o oVar) {
        View view = oVar.f13835i;
        if (view != null) {
            oVar.f13834h = view;
            return true;
        } else if (oVar.f13836j == null) {
            return false;
        } else {
            if (this.f13776W == null) {
                this.f13776W = new C4095p();
            }
            View view2 = (View) oVar.m28937a(this.f13776W);
            oVar.f13834h = view2;
            return view2 != null;
        }
    }

    public final boolean m28985f0(C4094o oVar) {
        oVar.m28934d(m28995X());
        oVar.f13833g = new C4093n(oVar.f13838l);
        oVar.f13829c = 81;
        return true;
    }

    @Override
    public <T extends View> T mo28984g(int i) {
        m28998U();
        return (T) this.f13768O.findViewById(i);
    }

    public final boolean m28983g0(C4094o oVar) {
        Context context = this.f13767N;
        int i = oVar.f13827a;
        if ((i == 0 || i == 108) && this.f13774U != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C3554a.f, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C3554a.g, typedValue, true);
            } else {
                theme.resolveAttribute(C3554a.g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C5817d dVar = new C5817d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0351e eVar = new C0351e(context);
        eVar.mo41630R(this);
        oVar.m28935c(eVar);
        return true;
    }

    public final void m28982h0(int i) {
        this.f13760D0 = (1 << i) | this.f13760D0;
        if (!this.f13759C0) {
            C1489y.m36752U(this.f13768O.getDecorView(), this.f13761E0);
            this.f13759C0 = true;
        }
    }

    @Override
    public int mo28981i() {
        return this.f13802w0;
    }

    public final boolean m28980i0() {
        if (!this.f13805z0 && (this.f13766M instanceof Activity)) {
            PackageManager packageManager = this.f13767N.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f13767N, this.f13766M.getClass()), 0);
                this.f13804y0 = (activityInfo == null || (activityInfo.configChanges & Log.TAG_GIF_LOADER) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                android.util.Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f13804y0 = false;
            }
        }
        this.f13805z0 = true;
        return this.f13804y0;
    }

    @Override
    public MenuInflater mo28979j() {
        if (this.f13772S == null) {
            m28987d0();
            ActionBar actionBar = this.f13771R;
            this.f13772S = new C5821g(actionBar != null ? actionBar.mo41768k() : this.f13767N);
        }
        return this.f13772S;
    }

    public boolean m28978j0() {
        return this.f13782c0;
    }

    @Override
    public ActionBar mo28977k() {
        m28987d0();
        return this.f13771R;
    }

    public int m28976k0(int i) {
        if (i == -100) {
            return -1;
        }
        if (i == -1) {
            return i;
        }
        if (i != 0) {
            if (i == 1 || i == 2) {
                return i;
            }
            if (i == 3) {
                return m28994Y().mo28940c();
            }
            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
        } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) this.f13767N.getSystemService(UiModeManager.class)).getNightMode() != 0) {
            return m28993Z().mo28940c();
        } else {
            return -1;
        }
    }

    @Override
    public void mo28975l() {
        LayoutInflater from = LayoutInflater.from(this.f13767N);
        if (from.getFactory() == null) {
            C1455g.m36884b(from, this);
        } else if (!(from.getFactory2() instanceof LayoutInflater$Factory2C4076d)) {
            android.util.Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public boolean m28974l0() {
        AbstractC5814b bVar = this.f13777X;
        if (bVar != null) {
            bVar.mo22104c();
            return true;
        }
        ActionBar k = mo28977k();
        return k != null && k.mo41771h();
    }

    @Override
    public void mo28973m() {
        ActionBar k = mo28977k();
        if (k == null || !k.m41856l()) {
            m28982h0(0);
        }
    }

    public boolean m28972m0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & Log.TAG_YOUTUBE) == 0) {
                z = false;
            }
            this.f13797r0 = z;
        } else if (i == 82) {
            m28971n0(0, keyEvent);
            return true;
        }
        return false;
    }

    public final boolean m28971n0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        C4094o a0 = m28992a0(i, true);
        if (!a0.f13841o) {
            return m28953x0(a0, keyEvent);
        }
        return false;
    }

    public boolean m28970o0(int i, KeyEvent keyEvent) {
        ActionBar k = mo28977k();
        if (k != null && k.mo41766o(i, keyEvent)) {
            return true;
        }
        C4094o oVar = this.f13796q0;
        if (oVar == null || !m28954w0(oVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f13796q0 == null) {
                C4094o a0 = m28992a0(0, true);
                m28953x0(a0, keyEvent);
                boolean w0 = m28954w0(a0, keyEvent.getKeyCode(), keyEvent, 1);
                a0.f13839m = false;
                if (w0) {
                    return true;
                }
            }
            return false;
        }
        C4094o oVar2 = this.f13796q0;
        if (oVar2 != null) {
            oVar2.f13840n = true;
        }
        return true;
    }

    @Override
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m29003P(view, str, context, attributeSet);
    }

    @Override
    public void mo28969p(Configuration configuration) {
        ActionBar k;
        if (this.f13789j0 && this.f13783d0 && (k = mo28977k()) != null) {
            k.mo41767m(configuration);
        }
        C0450g.m41292b().m41287g(this.f13767N);
        m29017F(false);
    }

    public boolean m28968p0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f13797r0;
            this.f13797r0 = false;
            C4094o a0 = m28992a0(0, false);
            if (a0 != null && a0.f13841o) {
                if (!z) {
                    m29005N(a0, true);
                }
                return true;
            } else if (m28974l0()) {
                return true;
            }
        } else if (i == 82) {
            m28966q0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override
    public void mo28967q(Bundle bundle) {
        this.f13798s0 = true;
        m29017F(false);
        m28997V();
        Object obj = this.f13766M;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C7954f.m14003c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar v0 = m28956v0();
                if (v0 == null) {
                    this.f13762F0 = true;
                } else {
                    v0.mo41765r(true);
                }
            }
        }
        this.f13799t0 = true;
    }

    public final boolean m28966q0(int r5, android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: p054e.LayoutInflater$Factory2C4076d.m28966q0(int, android.view.KeyEvent):boolean");
    }

    @Override
    public void mo28965r() {
        AbstractC4075c.m29029o(this);
        if (this.f13759C0) {
            this.f13768O.getDecorView().removeCallbacks(this.f13761E0);
        }
        this.f13800u0 = false;
        this.f13801v0 = true;
        ActionBar actionBar = this.f13771R;
        if (actionBar != null) {
            actionBar.m41855n();
        }
        m29007L();
    }

    public void m28964r0(int i) {
        ActionBar k;
        if (i == 108 && (k = mo28977k()) != null) {
            k.mo41770i(true);
        }
    }

    @Override
    public void mo28963s(Bundle bundle) {
        m28998U();
    }

    public void m28962s0(int i) {
        if (i == 108) {
            ActionBar k = mo28977k();
            if (k != null) {
                k.mo41770i(false);
            }
        } else if (i == 0) {
            C4094o a0 = m28992a0(i, true);
            if (a0.f13841o) {
                m29005N(a0, false);
            }
        }
    }

    @Override
    public void mo28961t() {
        ActionBar k = mo28977k();
        if (k != null) {
            k.mo41764s(true);
        }
    }

    public void m28960t0(ViewGroup viewGroup) {
    }

    @Override
    public void mo28959u(Bundle bundle) {
        if (this.f13802w0 != -100) {
            f13752J0.put(this.f13766M.getClass(), Integer.valueOf(this.f13802w0));
        }
    }

    public final void m28958u0(C4094o oVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!oVar.f13841o && !this.f13801v0) {
            if (oVar.f13827a == 0) {
                if ((this.f13767N.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback c0 = m28989c0();
            if (c0 == null || c0.onMenuOpened(oVar.f13827a, oVar.f13836j)) {
                WindowManager windowManager = (WindowManager) this.f13767N.getSystemService("window");
                if (windowManager != null && m28953x0(oVar, keyEvent)) {
                    ViewGroup viewGroup = oVar.f13833g;
                    if (viewGroup == null || oVar.f13843q) {
                        if (viewGroup == null) {
                            if (!m28985f0(oVar) || oVar.f13833g == null) {
                                return;
                            }
                        } else if (oVar.f13843q && viewGroup.getChildCount() > 0) {
                            oVar.f13833g.removeAllViews();
                        }
                        if (m28986e0(oVar) && oVar.m28936b()) {
                            ViewGroup.LayoutParams layoutParams2 = oVar.f13834h.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            oVar.f13833g.setBackgroundResource(oVar.f13828b);
                            ViewParent parent = oVar.f13834h.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(oVar.f13834h);
                            }
                            oVar.f13833g.addView(oVar.f13834h, layoutParams2);
                            if (!oVar.f13834h.hasFocus()) {
                                oVar.f13834h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else {
                        View view = oVar.f13835i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i = -1;
                            oVar.f13840n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, oVar.f13830d, oVar.f13831e, 1002, 8519680, -3);
                            layoutParams3.gravity = oVar.f13829c;
                            layoutParams3.windowAnimations = oVar.f13832f;
                            windowManager.addView(oVar.f13833g, layoutParams3);
                            oVar.f13841o = true;
                            return;
                        }
                    }
                    i = -2;
                    oVar.f13840n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, oVar.f13830d, oVar.f13831e, 1002, 8519680, -3);
                    layoutParams32.gravity = oVar.f13829c;
                    layoutParams32.windowAnimations = oVar.f13832f;
                    windowManager.addView(oVar.f13833g, layoutParams32);
                    oVar.f13841o = true;
                    return;
                }
                return;
            }
            m29005N(oVar, true);
        }
    }

    @Override
    public void mo28957v() {
        this.f13800u0 = true;
        m29019E();
        AbstractC4075c.m29030n(this);
    }

    public final ActionBar m28956v0() {
        return this.f13771R;
    }

    @Override
    public void mo28955w() {
        this.f13800u0 = false;
        AbstractC4075c.m29029o(this);
        ActionBar k = mo28977k();
        if (k != null) {
            k.mo41764s(false);
        }
        if (this.f13766M instanceof Dialog) {
            m29007L();
        }
    }

    public final boolean m28954w0(C4094o oVar, int i, KeyEvent keyEvent, int i2) {
        C0351e eVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((oVar.f13839m || m28953x0(oVar, keyEvent)) && (eVar = oVar.f13836j) != null) {
            z = eVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f13774U == null) {
            m29005N(oVar, true);
        }
        return z;
    }

    public final boolean m28953x0(C4094o oVar, KeyEvent keyEvent) {
        AbstractC0473o oVar2;
        AbstractC0473o oVar3;
        AbstractC0473o oVar4;
        if (this.f13801v0) {
            return false;
        }
        if (oVar.f13839m) {
            return true;
        }
        C4094o oVar5 = this.f13796q0;
        if (!(oVar5 == null || oVar5 == oVar)) {
            m29005N(oVar5, false);
        }
        Window.Callback c0 = m28989c0();
        if (c0 != null) {
            oVar.f13835i = c0.onCreatePanelView(oVar.f13827a);
        }
        int i = oVar.f13827a;
        boolean z = i == 0 || i == 108;
        if (z && (oVar4 = this.f13774U) != null) {
            oVar4.mo41137c();
        }
        if (oVar.f13835i == null) {
            if (z) {
                m28956v0();
            }
            C0351e eVar = oVar.f13836j;
            if (eVar == null || oVar.f13844r) {
                if (eVar == null && (!m28983g0(oVar) || oVar.f13836j == null)) {
                    return false;
                }
                if (z && this.f13774U != null) {
                    if (this.f13775V == null) {
                        this.f13775V = new C4085h();
                    }
                    this.f13774U.mo41139a(oVar.f13836j, this.f13775V);
                }
                oVar.f13836j.m41698d0();
                if (!c0.onCreatePanelMenu(oVar.f13827a, oVar.f13836j)) {
                    oVar.m28935c(null);
                    if (z && (oVar3 = this.f13774U) != null) {
                        oVar3.mo41139a(null, this.f13775V);
                    }
                    return false;
                }
                oVar.f13844r = false;
            }
            oVar.f13836j.m41698d0();
            Bundle bundle = oVar.f13845s;
            if (bundle != null) {
                oVar.f13836j.m41715P(bundle);
                oVar.f13845s = null;
            }
            if (!c0.onPreparePanel(0, oVar.f13835i, oVar.f13836j)) {
                if (z && (oVar2 = this.f13774U) != null) {
                    oVar2.mo41139a(null, this.f13775V);
                }
                oVar.f13836j.m41700c0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            oVar.f13842p = z2;
            oVar.f13836j.setQwertyMode(z2);
            oVar.f13836j.m41700c0();
        }
        oVar.f13839m = true;
        oVar.f13840n = false;
        this.f13796q0 = oVar;
        return true;
    }

    @Override
    public boolean mo28952y(int i) {
        int z0 = m28949z0(i);
        if (this.f13793n0 && z0 == 108) {
            return false;
        }
        if (this.f13789j0 && z0 == 1) {
            this.f13789j0 = false;
        }
        if (z0 == 1) {
            m29018E0();
            this.f13793n0 = true;
            return true;
        } else if (z0 == 2) {
            m29018E0();
            this.f13787h0 = true;
            return true;
        } else if (z0 == 5) {
            m29018E0();
            this.f13788i0 = true;
            return true;
        } else if (z0 == 10) {
            m29018E0();
            this.f13791l0 = true;
            return true;
        } else if (z0 == 108) {
            m29018E0();
            this.f13789j0 = true;
            return true;
        } else if (z0 != 109) {
            return this.f13768O.requestFeature(z0);
        } else {
            m29018E0();
            this.f13790k0 = true;
            return true;
        }
    }

    public final void m28951y0(C0351e eVar, boolean z) {
        AbstractC0473o oVar = this.f13774U;
        if (oVar == null || !oVar.mo41136d() || (ViewConfiguration.get(this.f13767N).hasPermanentMenuKey() && !this.f13774U.mo41135e())) {
            C4094o a0 = m28992a0(0, true);
            a0.f13843q = true;
            m29005N(a0, false);
            m28958u0(a0, null);
            return;
        }
        Window.Callback c0 = m28989c0();
        if (this.f13774U.mo41138b() && z) {
            this.f13774U.mo41134f();
            if (!this.f13801v0) {
                c0.onPanelClosed(108, m28992a0(0, true).f13836j);
            }
        } else if (c0 != null && !this.f13801v0) {
            if (this.f13759C0 && (this.f13760D0 & 1) != 0) {
                this.f13768O.getDecorView().removeCallbacks(this.f13761E0);
                this.f13761E0.run();
            }
            C4094o a02 = m28992a0(0, true);
            C0351e eVar2 = a02.f13836j;
            if (eVar2 != null && !a02.f13844r && c0.onPreparePanel(0, a02.f13835i, eVar2)) {
                c0.onMenuOpened(108, a02.f13836j);
                this.f13774U.mo41133g();
            }
        }
    }

    @Override
    public void mo28950z(int i) {
        m28998U();
        ViewGroup viewGroup = (ViewGroup) this.f13784e0.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f13767N).inflate(i, viewGroup);
        this.f13769P.m22063a().onContentChanged();
    }

    public final int m28949z0(int i) {
        if (i == 8) {
            android.util.Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            android.util.Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    public LayoutInflater$Factory2C4076d(Dialog dialog, AbstractC4074b bVar) {
        this(dialog.getContext(), dialog.getWindow(), bVar, dialog);
    }

    @Override
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public LayoutInflater$Factory2C4076d(Context context, Window window, AbstractC4074b bVar, Object obj) {
        Map<Class<?>, Integer> map;
        Integer num;
        ActivityC4073a F0;
        this.f13781b0 = null;
        this.f13782c0 = true;
        this.f13802w0 = -100;
        this.f13761E0 = new RunnableC4078b();
        this.f13767N = context;
        this.f13770Q = bVar;
        this.f13766M = obj;
        if (this.f13802w0 == -100 && (obj instanceof Dialog) && (F0 = m29016F0()) != null) {
            this.f13802w0 = F0.m29043D().mo28981i();
        }
        if (this.f13802w0 == -100 && (num = (map = f13752J0).get(obj.getClass())) != null) {
            this.f13802w0 = num.intValue();
            map.remove(obj.getClass());
        }
        if (window != null) {
            m29013H(window);
        }
        C0450g.m41286h();
    }

    public class C4088j extends Window$CallbackC5826i {
        public C4088j(Window.Callback callback) {
            super(callback);
        }

        public final ActionMode m28944b(ActionMode.Callback callback) {
            C5819f.C5820a aVar = new C5819f.C5820a(LayoutInflater$Factory2C4076d.this.f13767N, callback);
            AbstractC5814b C0 = LayoutInflater$Factory2C4076d.this.m29022C0(aVar);
            if (C0 != null) {
                return aVar.m22086e(C0);
            }
            return null;
        }

        @Override
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflater$Factory2C4076d.this.m29001R(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflater$Factory2C4076d.this.m28970o0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override
        public void onContentChanged() {
        }

        @Override
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0351e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            LayoutInflater$Factory2C4076d.this.m28964r0(i);
            return true;
        }

        @Override
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            LayoutInflater$Factory2C4076d.this.m28962s0(i);
        }

        @Override
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0351e eVar = menu instanceof C0351e ? (C0351e) menu : null;
            if (i == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.m41704a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (eVar != null) {
                eVar.m41704a0(false);
            }
            return onPreparePanel;
        }

        @Override
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0351e eVar;
            C4094o a0 = LayoutInflater$Factory2C4076d.this.m28992a0(0, true);
            if (a0 == null || (eVar = a0.f13836j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i);
            }
        }

        @Override
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (LayoutInflater$Factory2C4076d.this.m28978j0()) {
                return m28944b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!LayoutInflater$Factory2C4076d.this.m28978j0() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return m28944b(callback);
        }
    }
}
