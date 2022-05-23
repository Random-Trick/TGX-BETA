package c1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class e0 {
    public static final e0 f4241b;
    public final l f4242a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class a {
        public static Field f4243a;
        public static Field f4244b;
        public static Field f4245c;
        public static boolean f4246d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f4243a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f4244b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f4245c = declaredField3;
                declaredField3.setAccessible(true);
                f4246d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        public static e0 a(View view) {
            if (f4246d && view.isAttachedToWindow()) {
                try {
                    Object obj = f4243a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f4244b.get(obj);
                        Rect rect2 = (Rect) f4245c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            e0 a10 = new b().b(t0.b.c(rect)).c(t0.b.c(rect2)).a();
                            a10.p(a10);
                            a10.d(view.getRootView());
                            return a10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    public static class e extends d {
        public e() {
        }

        public e(e0 e0Var) {
            super(e0Var);
        }
    }

    public static class f {
        public final e0 f4255a;
        public t0.b[] f4256b;

        public f() {
            this(new e0((e0) null));
        }

        public final void a() {
            t0.b[] bVarArr = this.f4256b;
            if (bVarArr != null) {
                t0.b bVar = bVarArr[m.a(1)];
                t0.b bVar2 = this.f4256b[m.a(2)];
                if (bVar2 == null) {
                    bVar2 = this.f4255a.f(2);
                }
                if (bVar == null) {
                    bVar = this.f4255a.f(1);
                }
                f(t0.b.a(bVar, bVar2));
                t0.b bVar3 = this.f4256b[m.a(16)];
                if (bVar3 != null) {
                    e(bVar3);
                }
                t0.b bVar4 = this.f4256b[m.a(32)];
                if (bVar4 != null) {
                    c(bVar4);
                }
                t0.b bVar5 = this.f4256b[m.a(64)];
                if (bVar5 != null) {
                    g(bVar5);
                }
            }
        }

        public e0 b() {
            throw null;
        }

        public void c(t0.b bVar) {
        }

        public void d(t0.b bVar) {
            throw null;
        }

        public void e(t0.b bVar) {
        }

        public void f(t0.b bVar) {
            throw null;
        }

        public void g(t0.b bVar) {
        }

        public f(e0 e0Var) {
            this.f4255a = e0Var;
        }
    }

    public static class i extends h {
        public i(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        @Override
        public e0 a() {
            return e0.s(this.f4262c.consumeDisplayCutout());
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f4262c, iVar.f4262c) && Objects.equals(this.f4266g, iVar.f4266g);
        }

        @Override
        public c1.c f() {
            return c1.c.e(this.f4262c.getDisplayCutout());
        }

        @Override
        public int hashCode() {
            return this.f4262c.hashCode();
        }

        public i(e0 e0Var, i iVar) {
            super(e0Var, iVar);
        }
    }

    public static class k extends j {
        public static final e0 f4271q = e0.s(WindowInsets.CONSUMED);

        public k(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        @Override
        public final void d(View view) {
        }

        @Override
        public t0.b g(int i10) {
            return t0.b.d(this.f4262c.getInsets(n.a(i10)));
        }

        public k(e0 e0Var, k kVar) {
            super(e0Var, kVar);
        }
    }

    public static class l {
        public static final e0 f4272b = new b().a().a().b().c();
        public final e0 f4273a;

        public l(e0 e0Var) {
            this.f4273a = e0Var;
        }

        public e0 a() {
            return this.f4273a;
        }

        public e0 b() {
            return this.f4273a;
        }

        public e0 c() {
            return this.f4273a;
        }

        public void d(View view) {
        }

        public void e(e0 e0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return n() == lVar.n() && m() == lVar.m() && b1.d.a(k(), lVar.k()) && b1.d.a(i(), lVar.i()) && b1.d.a(f(), lVar.f());
        }

        public c1.c f() {
            return null;
        }

        public t0.b g(int i10) {
            return t0.b.f22833e;
        }

        public t0.b h() {
            return k();
        }

        public int hashCode() {
            return b1.d.b(Boolean.valueOf(n()), Boolean.valueOf(m()), k(), i(), f());
        }

        public t0.b i() {
            return t0.b.f22833e;
        }

        public t0.b j() {
            return k();
        }

        public t0.b k() {
            return t0.b.f22833e;
        }

        public t0.b l() {
            return k();
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void o(t0.b[] bVarArr) {
        }

        public void p(t0.b bVar) {
        }

        public void q(e0 e0Var) {
        }

        public void r(t0.b bVar) {
        }
    }

    public static final class m {
        public static int a(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }
    }

    public static final class n {
        public static int a(int i10) {
            int i11;
            int i12 = 0;
            for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                if ((i10 & i13) != 0) {
                    if (i13 == 1) {
                        i11 = WindowInsets.Type.statusBars();
                    } else if (i13 == 2) {
                        i11 = WindowInsets.Type.navigationBars();
                    } else if (i13 == 4) {
                        i11 = WindowInsets.Type.captionBar();
                    } else if (i13 == 8) {
                        i11 = WindowInsets.Type.ime();
                    } else if (i13 == 16) {
                        i11 = WindowInsets.Type.systemGestures();
                    } else if (i13 == 32) {
                        i11 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i13 == 64) {
                        i11 = WindowInsets.Type.tappableElement();
                    } else if (i13 == 128) {
                        i11 = WindowInsets.Type.displayCutout();
                    }
                    i12 |= i11;
                }
            }
            return i12;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f4241b = k.f4271q;
        } else {
            f4241b = l.f4272b;
        }
    }

    public e0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f4242a = new k(this, windowInsets);
        } else if (i10 >= 29) {
            this.f4242a = new j(this, windowInsets);
        } else if (i10 >= 28) {
            this.f4242a = new i(this, windowInsets);
        } else {
            this.f4242a = new h(this, windowInsets);
        }
    }

    public static e0 s(WindowInsets windowInsets) {
        return t(windowInsets, null);
    }

    public static e0 t(WindowInsets windowInsets, View view) {
        e0 e0Var = new e0((WindowInsets) b1.h.e(windowInsets));
        if (view != null && v.J(view)) {
            e0Var.p(v.z(view));
            e0Var.d(view.getRootView());
        }
        return e0Var;
    }

    @Deprecated
    public e0 a() {
        return this.f4242a.a();
    }

    @Deprecated
    public e0 b() {
        return this.f4242a.b();
    }

    @Deprecated
    public e0 c() {
        return this.f4242a.c();
    }

    public void d(View view) {
        this.f4242a.d(view);
    }

    public c1.c e() {
        return this.f4242a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        return b1.d.a(this.f4242a, ((e0) obj).f4242a);
    }

    public t0.b f(int i10) {
        return this.f4242a.g(i10);
    }

    @Deprecated
    public t0.b g() {
        return this.f4242a.i();
    }

    @Deprecated
    public int h() {
        return this.f4242a.k().f22837d;
    }

    public int hashCode() {
        l lVar = this.f4242a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f4242a.k().f22834a;
    }

    @Deprecated
    public int j() {
        return this.f4242a.k().f22836c;
    }

    @Deprecated
    public int k() {
        return this.f4242a.k().f22835b;
    }

    public boolean l() {
        return this.f4242a.m();
    }

    @Deprecated
    public e0 m(int i10, int i11, int i12, int i13) {
        return new b(this).c(t0.b.b(i10, i11, i12, i13)).a();
    }

    public void n(t0.b[] bVarArr) {
        this.f4242a.o(bVarArr);
    }

    public void o(t0.b bVar) {
        this.f4242a.p(bVar);
    }

    public void p(e0 e0Var) {
        this.f4242a.q(e0Var);
    }

    public void q(t0.b bVar) {
        this.f4242a.r(bVar);
    }

    public WindowInsets r() {
        l lVar = this.f4242a;
        if (lVar instanceof g) {
            return ((g) lVar).f4262c;
        }
        return null;
    }

    public static class c extends f {
        public static Field f4248e = null;
        public static boolean f4249f = false;
        public static Constructor<WindowInsets> f4250g = null;
        public static boolean f4251h = false;
        public WindowInsets f4252c;
        public t0.b f4253d;

        public c() {
            this.f4252c = h();
        }

        private static WindowInsets h() {
            if (!f4249f) {
                try {
                    f4248e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f4249f = true;
            }
            Field field = f4248e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f4251h) {
                try {
                    f4250g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f4251h = true;
            }
            Constructor<WindowInsets> constructor = f4250g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override
        public e0 b() {
            a();
            e0 s10 = e0.s(this.f4252c);
            s10.n(this.f4256b);
            s10.q(this.f4253d);
            return s10;
        }

        @Override
        public void d(t0.b bVar) {
            this.f4253d = bVar;
        }

        @Override
        public void f(t0.b bVar) {
            WindowInsets windowInsets = this.f4252c;
            if (windowInsets != null) {
                this.f4252c = windowInsets.replaceSystemWindowInsets(bVar.f22834a, bVar.f22835b, bVar.f22836c, bVar.f22837d);
            }
        }

        public c(e0 e0Var) {
            super(e0Var);
            this.f4252c = e0Var.r();
        }
    }

    public static class d extends f {
        public final WindowInsets.Builder f4254c;

        public d() {
            this.f4254c = new WindowInsets.Builder();
        }

        @Override
        public e0 b() {
            a();
            e0 s10 = e0.s(this.f4254c.build());
            s10.n(this.f4256b);
            return s10;
        }

        @Override
        public void c(t0.b bVar) {
            this.f4254c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override
        public void d(t0.b bVar) {
            this.f4254c.setStableInsets(bVar.e());
        }

        @Override
        public void e(t0.b bVar) {
            this.f4254c.setSystemGestureInsets(bVar.e());
        }

        @Override
        public void f(t0.b bVar) {
            this.f4254c.setSystemWindowInsets(bVar.e());
        }

        @Override
        public void g(t0.b bVar) {
            this.f4254c.setTappableElementInsets(bVar.e());
        }

        public d(e0 e0Var) {
            super(e0Var);
            WindowInsets.Builder builder;
            WindowInsets r10 = e0Var.r();
            if (r10 != null) {
                builder = new WindowInsets.Builder(r10);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f4254c = builder;
        }
    }

    public static class h extends g {
        public t0.b f4267m;

        public h(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
            this.f4267m = null;
        }

        @Override
        public e0 b() {
            return e0.s(this.f4262c.consumeStableInsets());
        }

        @Override
        public e0 c() {
            return e0.s(this.f4262c.consumeSystemWindowInsets());
        }

        @Override
        public final t0.b i() {
            if (this.f4267m == null) {
                this.f4267m = t0.b.b(this.f4262c.getStableInsetLeft(), this.f4262c.getStableInsetTop(), this.f4262c.getStableInsetRight(), this.f4262c.getStableInsetBottom());
            }
            return this.f4267m;
        }

        @Override
        public boolean m() {
            return this.f4262c.isConsumed();
        }

        @Override
        public void r(t0.b bVar) {
            this.f4267m = bVar;
        }

        public h(e0 e0Var, h hVar) {
            super(e0Var, hVar);
            this.f4267m = null;
            this.f4267m = hVar.f4267m;
        }
    }

    public static class g extends l {
        public static boolean f4257h = false;
        public static Method f4258i;
        public static Class<?> f4259j;
        public static Field f4260k;
        public static Field f4261l;
        public final WindowInsets f4262c;
        public t0.b[] f4263d;
        public t0.b f4264e;
        public e0 f4265f;
        public t0.b f4266g;

        public g(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var);
            this.f4264e = null;
            this.f4262c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private t0.b s(int i10, boolean z10) {
            t0.b bVar = t0.b.f22833e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVar = t0.b.a(bVar, t(i11, z10));
                }
            }
            return bVar;
        }

        private t0.b u() {
            e0 e0Var = this.f4265f;
            if (e0Var != null) {
                return e0Var.g();
            }
            return t0.b.f22833e;
        }

        private t0.b v(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f4257h) {
                    w();
                }
                Method method = f4258i;
                if (!(method == null || f4259j == null || f4260k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f4260k.get(f4261l.get(invoke));
                        if (rect != null) {
                            return t0.b.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void w() {
            try {
                f4258i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f4259j = cls;
                f4260k = cls.getDeclaredField("mVisibleInsets");
                f4261l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f4260k.setAccessible(true);
                f4261l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f4257h = true;
        }

        @Override
        public void d(View view) {
            t0.b v10 = v(view);
            if (v10 == null) {
                v10 = t0.b.f22833e;
            }
            p(v10);
        }

        @Override
        public void e(e0 e0Var) {
            e0Var.p(this.f4265f);
            e0Var.o(this.f4266g);
        }

        @Override
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f4266g, ((g) obj).f4266g);
        }

        @Override
        public t0.b g(int i10) {
            return s(i10, false);
        }

        @Override
        public final t0.b k() {
            if (this.f4264e == null) {
                this.f4264e = t0.b.b(this.f4262c.getSystemWindowInsetLeft(), this.f4262c.getSystemWindowInsetTop(), this.f4262c.getSystemWindowInsetRight(), this.f4262c.getSystemWindowInsetBottom());
            }
            return this.f4264e;
        }

        @Override
        public boolean n() {
            return this.f4262c.isRound();
        }

        @Override
        public void o(t0.b[] bVarArr) {
            this.f4263d = bVarArr;
        }

        @Override
        public void p(t0.b bVar) {
            this.f4266g = bVar;
        }

        @Override
        public void q(e0 e0Var) {
            this.f4265f = e0Var;
        }

        public t0.b t(int i10, boolean z10) {
            int i11;
            c1.c cVar;
            if (i10 != 1) {
                t0.b bVar = null;
                if (i10 != 2) {
                    if (i10 == 8) {
                        t0.b[] bVarArr = this.f4263d;
                        if (bVarArr != null) {
                            bVar = bVarArr[m.a(8)];
                        }
                        if (bVar != null) {
                            return bVar;
                        }
                        t0.b k10 = k();
                        t0.b u10 = u();
                        int i12 = k10.f22837d;
                        if (i12 > u10.f22837d) {
                            return t0.b.b(0, 0, 0, i12);
                        }
                        t0.b bVar2 = this.f4266g;
                        if (bVar2 == null || bVar2.equals(t0.b.f22833e) || (i11 = this.f4266g.f22837d) <= u10.f22837d) {
                            return t0.b.f22833e;
                        }
                        return t0.b.b(0, 0, 0, i11);
                    } else if (i10 == 16) {
                        return j();
                    } else {
                        if (i10 == 32) {
                            return h();
                        }
                        if (i10 == 64) {
                            return l();
                        }
                        if (i10 != 128) {
                            return t0.b.f22833e;
                        }
                        e0 e0Var = this.f4265f;
                        if (e0Var != null) {
                            cVar = e0Var.e();
                        } else {
                            cVar = f();
                        }
                        if (cVar != null) {
                            return t0.b.b(cVar.b(), cVar.d(), cVar.c(), cVar.a());
                        }
                        return t0.b.f22833e;
                    }
                } else if (z10) {
                    t0.b u11 = u();
                    t0.b i13 = i();
                    return t0.b.b(Math.max(u11.f22834a, i13.f22834a), 0, Math.max(u11.f22836c, i13.f22836c), Math.max(u11.f22837d, i13.f22837d));
                } else {
                    t0.b k11 = k();
                    e0 e0Var2 = this.f4265f;
                    if (e0Var2 != null) {
                        bVar = e0Var2.g();
                    }
                    int i14 = k11.f22837d;
                    if (bVar != null) {
                        i14 = Math.min(i14, bVar.f22837d);
                    }
                    return t0.b.b(k11.f22834a, 0, k11.f22836c, i14);
                }
            } else if (z10) {
                return t0.b.b(0, Math.max(u().f22835b, k().f22835b), 0, 0);
            } else {
                return t0.b.b(0, k().f22835b, 0, 0);
            }
        }

        public g(e0 e0Var, g gVar) {
            this(e0Var, new WindowInsets(gVar.f4262c));
        }
    }

    public static class j extends i {
        public t0.b f4268n = null;
        public t0.b f4269o = null;
        public t0.b f4270p = null;

        public j(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        @Override
        public t0.b h() {
            if (this.f4269o == null) {
                this.f4269o = t0.b.d(this.f4262c.getMandatorySystemGestureInsets());
            }
            return this.f4269o;
        }

        @Override
        public t0.b j() {
            if (this.f4268n == null) {
                this.f4268n = t0.b.d(this.f4262c.getSystemGestureInsets());
            }
            return this.f4268n;
        }

        @Override
        public t0.b l() {
            if (this.f4270p == null) {
                this.f4270p = t0.b.d(this.f4262c.getTappableElementInsets());
            }
            return this.f4270p;
        }

        @Override
        public void r(t0.b bVar) {
        }

        public j(e0 e0Var, j jVar) {
            super(e0Var, jVar);
        }
    }

    public static final class b {
        public final f f4247a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f4247a = new e();
            } else if (i10 >= 29) {
                this.f4247a = new d();
            } else {
                this.f4247a = new c();
            }
        }

        public e0 a() {
            return this.f4247a.b();
        }

        @Deprecated
        public b b(t0.b bVar) {
            this.f4247a.d(bVar);
            return this;
        }

        @Deprecated
        public b c(t0.b bVar) {
            this.f4247a.f(bVar);
            return this;
        }

        public b(e0 e0Var) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f4247a = new e(e0Var);
            } else if (i10 >= 29) {
                this.f4247a = new d(e0Var);
            } else {
                this.f4247a = new c(e0Var);
            }
        }
    }

    public e0(e0 e0Var) {
        if (e0Var != null) {
            l lVar = e0Var.f4242a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (lVar instanceof k)) {
                this.f4242a = new k(this, (k) lVar);
            } else if (i10 >= 29 && (lVar instanceof j)) {
                this.f4242a = new j(this, (j) lVar);
            } else if (i10 >= 28 && (lVar instanceof i)) {
                this.f4242a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f4242a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f4242a = new g(this, (g) lVar);
            } else {
                this.f4242a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f4242a = new l(this);
    }
}
