package p028c1;

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
import p016b1.C1128d;
import p016b1.C1132h;
import p267t0.C8930b;

public class C1458h0 {
    public static final C1458h0 f5309b;
    public final C1470l f5310a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class C1459a {
        public static Field f5311a;
        public static Field f5312b;
        public static Field f5313c;
        public static boolean f5314d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f5311a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f5312b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f5313c = declaredField3;
                declaredField3.setAccessible(true);
                f5314d = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        public static C1458h0 m36857a(View view) {
            if (f5314d && view.isAttachedToWindow()) {
                try {
                    Object obj = f5311a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f5312b.get(obj);
                        Rect rect2 = (Rect) f5313c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            C1458h0 a = new C1460b().m36855b(C8930b.m10930c(rect)).m36854c(C8930b.m10930c(rect2)).m36856a();
                            a.m36862p(a);
                            a.m36874d(view.getRootView());
                            return a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    public static class C1463e extends C1462d {
        public C1463e() {
        }

        public C1463e(C1458h0 h0Var) {
            super(h0Var);
        }
    }

    public static class C1464f {
        public final C1458h0 f5323a;
        public C8930b[] f5324b;

        public C1464f() {
            this(new C1458h0((C1458h0) null));
        }

        public final void m36852a() {
            C8930b[] bVarArr = this.f5324b;
            if (bVarArr != null) {
                C8930b bVar = bVarArr[C1471m.m36822a(1)];
                C8930b bVar2 = this.f5324b[C1471m.m36822a(2)];
                if (bVar2 == null) {
                    bVar2 = this.f5323a.m36872f(2);
                }
                if (bVar == null) {
                    bVar = this.f5323a.m36872f(1);
                }
                mo36847f(C8930b.m10932a(bVar, bVar2));
                C8930b bVar3 = this.f5324b[C1471m.m36822a(16)];
                if (bVar3 != null) {
                    mo36848e(bVar3);
                }
                C8930b bVar4 = this.f5324b[C1471m.m36822a(32)];
                if (bVar4 != null) {
                    mo36850c(bVar4);
                }
                C8930b bVar5 = this.f5324b[C1471m.m36822a(64)];
                if (bVar5 != null) {
                    mo36846g(bVar5);
                }
            }
        }

        public C1458h0 mo36851b() {
            m36852a();
            return this.f5323a;
        }

        public void mo36850c(C8930b bVar) {
        }

        public void mo36849d(C8930b bVar) {
        }

        public void mo36848e(C8930b bVar) {
        }

        public void mo36847f(C8930b bVar) {
        }

        public void mo36846g(C8930b bVar) {
        }

        public C1464f(C1458h0 h0Var) {
            this.f5323a = h0Var;
        }
    }

    public static class C1467i extends C1466h {
        public C1467i(C1458h0 h0Var, WindowInsets windowInsets) {
            super(h0Var, windowInsets);
        }

        @Override
        public C1458h0 mo36840a() {
            return C1458h0.m36859s(this.f5330c.consumeDisplayCutout());
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1467i)) {
                return false;
            }
            C1467i iVar = (C1467i) obj;
            return Objects.equals(this.f5330c, iVar.f5330c) && Objects.equals(this.f5334g, iVar.f5334g);
        }

        @Override
        public C1439c mo36835f() {
            return C1439c.m36918e(this.f5330c.getDisplayCutout());
        }

        @Override
        public int hashCode() {
            return this.f5330c.hashCode();
        }

        public C1467i(C1458h0 h0Var, C1467i iVar) {
            super(h0Var, iVar);
        }
    }

    public static class C1469k extends C1468j {
        public static final C1458h0 f5339q = C1458h0.m36859s(WindowInsets.CONSUMED);

        public C1469k(C1458h0 h0Var, WindowInsets windowInsets) {
            super(h0Var, windowInsets);
        }

        @Override
        public final void mo36837d(View view) {
        }

        @Override
        public C8930b mo36834g(int i) {
            return C8930b.m10929d(this.f5330c.getInsets(C1472n.m36821a(i)));
        }

        public C1469k(C1458h0 h0Var, C1469k kVar) {
            super(h0Var, kVar);
        }
    }

    public static class C1470l {
        public static final C1458h0 f5340b = new C1460b().m36856a().m36877a().m36876b().m36875c();
        public final C1458h0 f5341a;

        public C1470l(C1458h0 h0Var) {
            this.f5341a = h0Var;
        }

        public C1458h0 mo36840a() {
            return this.f5341a;
        }

        public C1458h0 mo36839b() {
            return this.f5341a;
        }

        public C1458h0 mo36838c() {
            return this.f5341a;
        }

        public void mo36837d(View view) {
        }

        public void mo36836e(C1458h0 h0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1470l)) {
                return false;
            }
            C1470l lVar = (C1470l) obj;
            return mo36827n() == lVar.mo36827n() && mo36828m() == lVar.mo36828m() && C1128d.m38333a(mo36830k(), lVar.mo36830k()) && C1128d.m38333a(mo36832i(), lVar.mo36832i()) && C1128d.m38333a(mo36835f(), lVar.mo36835f());
        }

        public C1439c mo36835f() {
            return null;
        }

        public C8930b mo36834g(int i) {
            return C8930b.f28787e;
        }

        public C8930b mo36833h() {
            return mo36830k();
        }

        public int hashCode() {
            return C1128d.m38332b(Boolean.valueOf(mo36827n()), Boolean.valueOf(mo36828m()), mo36830k(), mo36832i(), mo36835f());
        }

        public C8930b mo36832i() {
            return C8930b.f28787e;
        }

        public C8930b mo36831j() {
            return mo36830k();
        }

        public C8930b mo36830k() {
            return C8930b.f28787e;
        }

        public C8930b mo36829l() {
            return mo36830k();
        }

        public boolean mo36828m() {
            return false;
        }

        public boolean mo36827n() {
            return false;
        }

        public void mo36826o(C8930b[] bVarArr) {
        }

        public void mo36825p(C8930b bVar) {
        }

        public void mo36824q(C1458h0 h0Var) {
        }

        public void mo36823r(C8930b bVar) {
        }
    }

    public static final class C1471m {
        public static int m36822a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }
    }

    public static final class C1472n {
        public static int m36821a(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i & i4) != 0) {
                    if (i4 == 1) {
                        i2 = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        i2 = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        i2 = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        i2 = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        i2 = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        i2 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        i2 = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        i2 = WindowInsets.Type.displayCutout();
                    }
                    i3 |= i2;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f5309b = C1469k.f5339q;
        } else {
            f5309b = C1470l.f5340b;
        }
    }

    public C1458h0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f5310a = new C1469k(this, windowInsets);
        } else if (i >= 29) {
            this.f5310a = new C1468j(this, windowInsets);
        } else if (i >= 28) {
            this.f5310a = new C1467i(this, windowInsets);
        } else if (i >= 21) {
            this.f5310a = new C1466h(this, windowInsets);
        } else if (i >= 20) {
            this.f5310a = new C1465g(this, windowInsets);
        } else {
            this.f5310a = new C1470l(this);
        }
    }

    public static C1458h0 m36859s(WindowInsets windowInsets) {
        return m36858t(windowInsets, null);
    }

    public static C1458h0 m36858t(WindowInsets windowInsets, View view) {
        C1458h0 h0Var = new C1458h0((WindowInsets) C1132h.m38322e(windowInsets));
        if (view != null && C1489y.m36760J(view)) {
            h0Var.m36862p(C1489y.m36701z(view));
            h0Var.m36874d(view.getRootView());
        }
        return h0Var;
    }

    @Deprecated
    public C1458h0 m36877a() {
        return this.f5310a.mo36840a();
    }

    @Deprecated
    public C1458h0 m36876b() {
        return this.f5310a.mo36839b();
    }

    @Deprecated
    public C1458h0 m36875c() {
        return this.f5310a.mo36838c();
    }

    public void m36874d(View view) {
        this.f5310a.mo36837d(view);
    }

    public C1439c m36873e() {
        return this.f5310a.mo36835f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1458h0)) {
            return false;
        }
        return C1128d.m38333a(this.f5310a, ((C1458h0) obj).f5310a);
    }

    public C8930b m36872f(int i) {
        return this.f5310a.mo36834g(i);
    }

    @Deprecated
    public C8930b m36871g() {
        return this.f5310a.mo36832i();
    }

    @Deprecated
    public int m36870h() {
        return this.f5310a.mo36830k().f28791d;
    }

    public int hashCode() {
        C1470l lVar = this.f5310a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int m36869i() {
        return this.f5310a.mo36830k().f28788a;
    }

    @Deprecated
    public int m36868j() {
        return this.f5310a.mo36830k().f28790c;
    }

    @Deprecated
    public int m36867k() {
        return this.f5310a.mo36830k().f28789b;
    }

    public boolean m36866l() {
        return this.f5310a.mo36828m();
    }

    @Deprecated
    public C1458h0 m36865m(int i, int i2, int i3, int i4) {
        return new C1460b(this).m36854c(C8930b.m10931b(i, i2, i3, i4)).m36856a();
    }

    public void m36864n(C8930b[] bVarArr) {
        this.f5310a.mo36826o(bVarArr);
    }

    public void m36863o(C8930b bVar) {
        this.f5310a.mo36825p(bVar);
    }

    public void m36862p(C1458h0 h0Var) {
        this.f5310a.mo36824q(h0Var);
    }

    public void m36861q(C8930b bVar) {
        this.f5310a.mo36823r(bVar);
    }

    public WindowInsets m36860r() {
        C1470l lVar = this.f5310a;
        if (lVar instanceof C1465g) {
            return ((C1465g) lVar).f5330c;
        }
        return null;
    }

    public static class C1461c extends C1464f {
        public static Field f5316e = null;
        public static boolean f5317f = false;
        public static Constructor<WindowInsets> f5318g = null;
        public static boolean f5319h = false;
        public WindowInsets f5320c;
        public C8930b f5321d;

        public C1461c() {
            this.f5320c = m36853h();
        }

        private static WindowInsets m36853h() {
            if (!f5317f) {
                try {
                    f5316e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f5317f = true;
            }
            Field field = f5316e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f5319h) {
                try {
                    f5318g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f5319h = true;
            }
            Constructor<WindowInsets> constructor = f5318g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        @Override
        public C1458h0 mo36851b() {
            m36852a();
            C1458h0 s = C1458h0.m36859s(this.f5320c);
            s.m36864n(this.f5324b);
            s.m36861q(this.f5321d);
            return s;
        }

        @Override
        public void mo36849d(C8930b bVar) {
            this.f5321d = bVar;
        }

        @Override
        public void mo36847f(C8930b bVar) {
            WindowInsets windowInsets = this.f5320c;
            if (windowInsets != null) {
                this.f5320c = windowInsets.replaceSystemWindowInsets(bVar.f28788a, bVar.f28789b, bVar.f28790c, bVar.f28791d);
            }
        }

        public C1461c(C1458h0 h0Var) {
            super(h0Var);
            this.f5320c = h0Var.m36860r();
        }
    }

    public static class C1462d extends C1464f {
        public final WindowInsets.Builder f5322c;

        public C1462d() {
            this.f5322c = new WindowInsets.Builder();
        }

        @Override
        public C1458h0 mo36851b() {
            m36852a();
            C1458h0 s = C1458h0.m36859s(this.f5322c.build());
            s.m36864n(this.f5324b);
            return s;
        }

        @Override
        public void mo36850c(C8930b bVar) {
            this.f5322c.setMandatorySystemGestureInsets(bVar.m10928e());
        }

        @Override
        public void mo36849d(C8930b bVar) {
            this.f5322c.setStableInsets(bVar.m10928e());
        }

        @Override
        public void mo36848e(C8930b bVar) {
            this.f5322c.setSystemGestureInsets(bVar.m10928e());
        }

        @Override
        public void mo36847f(C8930b bVar) {
            this.f5322c.setSystemWindowInsets(bVar.m10928e());
        }

        @Override
        public void mo36846g(C8930b bVar) {
            this.f5322c.setTappableElementInsets(bVar.m10928e());
        }

        public C1462d(C1458h0 h0Var) {
            super(h0Var);
            WindowInsets.Builder builder;
            WindowInsets r = h0Var.m36860r();
            if (r != null) {
                builder = new WindowInsets.Builder(r);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f5322c = builder;
        }
    }

    public static class C1466h extends C1465g {
        public C8930b f5335m;

        public C1466h(C1458h0 h0Var, WindowInsets windowInsets) {
            super(h0Var, windowInsets);
            this.f5335m = null;
        }

        @Override
        public C1458h0 mo36839b() {
            return C1458h0.m36859s(this.f5330c.consumeStableInsets());
        }

        @Override
        public C1458h0 mo36838c() {
            return C1458h0.m36859s(this.f5330c.consumeSystemWindowInsets());
        }

        @Override
        public final C8930b mo36832i() {
            if (this.f5335m == null) {
                this.f5335m = C8930b.m10931b(this.f5330c.getStableInsetLeft(), this.f5330c.getStableInsetTop(), this.f5330c.getStableInsetRight(), this.f5330c.getStableInsetBottom());
            }
            return this.f5335m;
        }

        @Override
        public boolean mo36828m() {
            return this.f5330c.isConsumed();
        }

        @Override
        public void mo36823r(C8930b bVar) {
            this.f5335m = bVar;
        }

        public C1466h(C1458h0 h0Var, C1466h hVar) {
            super(h0Var, hVar);
            this.f5335m = null;
            this.f5335m = hVar.f5335m;
        }
    }

    public static class C1465g extends C1470l {
        public static boolean f5325h = false;
        public static Method f5326i;
        public static Class<?> f5327j;
        public static Field f5328k;
        public static Field f5329l;
        public final WindowInsets f5330c;
        public C8930b[] f5331d;
        public C8930b f5332e;
        public C1458h0 f5333f;
        public C8930b f5334g;

        public C1465g(C1458h0 h0Var, WindowInsets windowInsets) {
            super(h0Var);
            this.f5332e = null;
            this.f5330c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private C8930b m36845s(int i, boolean z) {
            C8930b bVar = C8930b.f28787e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    bVar = C8930b.m10932a(bVar, m36844t(i2, z));
                }
            }
            return bVar;
        }

        private C8930b m36843u() {
            C1458h0 h0Var = this.f5333f;
            if (h0Var != null) {
                return h0Var.m36871g();
            }
            return C8930b.f28787e;
        }

        private C8930b m36842v(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f5325h) {
                    m36841w();
                }
                Method method = f5326i;
                if (!(method == null || f5327j == null || f5328k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f5328k.get(f5329l.get(invoke));
                        if (rect != null) {
                            return C8930b.m10930c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void m36841w() {
            try {
                f5326i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f5327j = cls;
                f5328k = cls.getDeclaredField("mVisibleInsets");
                f5329l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f5328k.setAccessible(true);
                f5329l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f5325h = true;
        }

        @Override
        public void mo36837d(View view) {
            C8930b v = m36842v(view);
            if (v == null) {
                v = C8930b.f28787e;
            }
            mo36825p(v);
        }

        @Override
        public void mo36836e(C1458h0 h0Var) {
            h0Var.m36862p(this.f5333f);
            h0Var.m36863o(this.f5334g);
        }

        @Override
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f5334g, ((C1465g) obj).f5334g);
        }

        @Override
        public C8930b mo36834g(int i) {
            return m36845s(i, false);
        }

        @Override
        public final C8930b mo36830k() {
            if (this.f5332e == null) {
                this.f5332e = C8930b.m10931b(this.f5330c.getSystemWindowInsetLeft(), this.f5330c.getSystemWindowInsetTop(), this.f5330c.getSystemWindowInsetRight(), this.f5330c.getSystemWindowInsetBottom());
            }
            return this.f5332e;
        }

        @Override
        public boolean mo36827n() {
            return this.f5330c.isRound();
        }

        @Override
        public void mo36826o(C8930b[] bVarArr) {
            this.f5331d = bVarArr;
        }

        @Override
        public void mo36825p(C8930b bVar) {
            this.f5334g = bVar;
        }

        @Override
        public void mo36824q(C1458h0 h0Var) {
            this.f5333f = h0Var;
        }

        public C8930b m36844t(int i, boolean z) {
            int i2;
            C1439c cVar;
            if (i != 1) {
                C8930b bVar = null;
                if (i != 2) {
                    if (i == 8) {
                        C8930b[] bVarArr = this.f5331d;
                        if (bVarArr != null) {
                            bVar = bVarArr[C1471m.m36822a(8)];
                        }
                        if (bVar != null) {
                            return bVar;
                        }
                        C8930b k = mo36830k();
                        C8930b u = m36843u();
                        int i3 = k.f28791d;
                        if (i3 > u.f28791d) {
                            return C8930b.m10931b(0, 0, 0, i3);
                        }
                        C8930b bVar2 = this.f5334g;
                        if (bVar2 == null || bVar2.equals(C8930b.f28787e) || (i2 = this.f5334g.f28791d) <= u.f28791d) {
                            return C8930b.f28787e;
                        }
                        return C8930b.m10931b(0, 0, 0, i2);
                    } else if (i == 16) {
                        return mo36831j();
                    } else {
                        if (i == 32) {
                            return mo36833h();
                        }
                        if (i == 64) {
                            return mo36829l();
                        }
                        if (i != 128) {
                            return C8930b.f28787e;
                        }
                        C1458h0 h0Var = this.f5333f;
                        if (h0Var != null) {
                            cVar = h0Var.m36873e();
                        } else {
                            cVar = mo36835f();
                        }
                        if (cVar != null) {
                            return C8930b.m10931b(cVar.m36921b(), cVar.m36919d(), cVar.m36920c(), cVar.m36922a());
                        }
                        return C8930b.f28787e;
                    }
                } else if (z) {
                    C8930b u2 = m36843u();
                    C8930b i4 = mo36832i();
                    return C8930b.m10931b(Math.max(u2.f28788a, i4.f28788a), 0, Math.max(u2.f28790c, i4.f28790c), Math.max(u2.f28791d, i4.f28791d));
                } else {
                    C8930b k2 = mo36830k();
                    C1458h0 h0Var2 = this.f5333f;
                    if (h0Var2 != null) {
                        bVar = h0Var2.m36871g();
                    }
                    int i5 = k2.f28791d;
                    if (bVar != null) {
                        i5 = Math.min(i5, bVar.f28791d);
                    }
                    return C8930b.m10931b(k2.f28788a, 0, k2.f28790c, i5);
                }
            } else if (z) {
                return C8930b.m10931b(0, Math.max(m36843u().f28789b, mo36830k().f28789b), 0, 0);
            } else {
                return C8930b.m10931b(0, mo36830k().f28789b, 0, 0);
            }
        }

        public C1465g(C1458h0 h0Var, C1465g gVar) {
            this(h0Var, new WindowInsets(gVar.f5330c));
        }
    }

    public static class C1468j extends C1467i {
        public C8930b f5336n = null;
        public C8930b f5337o = null;
        public C8930b f5338p = null;

        public C1468j(C1458h0 h0Var, WindowInsets windowInsets) {
            super(h0Var, windowInsets);
        }

        @Override
        public C8930b mo36833h() {
            if (this.f5337o == null) {
                this.f5337o = C8930b.m10929d(this.f5330c.getMandatorySystemGestureInsets());
            }
            return this.f5337o;
        }

        @Override
        public C8930b mo36831j() {
            if (this.f5336n == null) {
                this.f5336n = C8930b.m10929d(this.f5330c.getSystemGestureInsets());
            }
            return this.f5336n;
        }

        @Override
        public C8930b mo36829l() {
            if (this.f5338p == null) {
                this.f5338p = C8930b.m10929d(this.f5330c.getTappableElementInsets());
            }
            return this.f5338p;
        }

        @Override
        public void mo36823r(C8930b bVar) {
        }

        public C1468j(C1458h0 h0Var, C1468j jVar) {
            super(h0Var, jVar);
        }
    }

    public static final class C1460b {
        public final C1464f f5315a;

        public C1460b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f5315a = new C1463e();
            } else if (i >= 29) {
                this.f5315a = new C1462d();
            } else if (i >= 20) {
                this.f5315a = new C1461c();
            } else {
                this.f5315a = new C1464f();
            }
        }

        public C1458h0 m36856a() {
            return this.f5315a.mo36851b();
        }

        @Deprecated
        public C1460b m36855b(C8930b bVar) {
            this.f5315a.mo36849d(bVar);
            return this;
        }

        @Deprecated
        public C1460b m36854c(C8930b bVar) {
            this.f5315a.mo36847f(bVar);
            return this;
        }

        public C1460b(C1458h0 h0Var) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f5315a = new C1463e(h0Var);
            } else if (i >= 29) {
                this.f5315a = new C1462d(h0Var);
            } else if (i >= 20) {
                this.f5315a = new C1461c(h0Var);
            } else {
                this.f5315a = new C1464f(h0Var);
            }
        }
    }

    public C1458h0(C1458h0 h0Var) {
        if (h0Var != null) {
            C1470l lVar = h0Var.f5310a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && (lVar instanceof C1469k)) {
                this.f5310a = new C1469k(this, (C1469k) lVar);
            } else if (i >= 29 && (lVar instanceof C1468j)) {
                this.f5310a = new C1468j(this, (C1468j) lVar);
            } else if (i >= 28 && (lVar instanceof C1467i)) {
                this.f5310a = new C1467i(this, (C1467i) lVar);
            } else if (i >= 21 && (lVar instanceof C1466h)) {
                this.f5310a = new C1466h(this, (C1466h) lVar);
            } else if (i < 20 || !(lVar instanceof C1465g)) {
                this.f5310a = new C1470l(this);
            } else {
                this.f5310a = new C1465g(this, (C1465g) lVar);
            }
            lVar.mo36836e(this);
            return;
        }
        this.f5310a = new C1470l(this);
    }
}
