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

        public static C1458h0 m36860a(View view) {
            if (f5314d && view.isAttachedToWindow()) {
                try {
                    Object obj = f5311a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f5312b.get(obj);
                        Rect rect2 = (Rect) f5313c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            C1458h0 a = new C1460b().m36858b(C8930b.m10929c(rect)).m36857c(C8930b.m10929c(rect2)).m36859a();
                            a.m36865p(a);
                            a.m36877d(view.getRootView());
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

        public final void m36855a() {
            C8930b[] bVarArr = this.f5324b;
            if (bVarArr != null) {
                C8930b bVar = bVarArr[C1471m.m36825a(1)];
                C8930b bVar2 = this.f5324b[C1471m.m36825a(2)];
                if (bVar2 == null) {
                    bVar2 = this.f5323a.m36875f(2);
                }
                if (bVar == null) {
                    bVar = this.f5323a.m36875f(1);
                }
                mo36850f(C8930b.m10931a(bVar, bVar2));
                C8930b bVar3 = this.f5324b[C1471m.m36825a(16)];
                if (bVar3 != null) {
                    mo36851e(bVar3);
                }
                C8930b bVar4 = this.f5324b[C1471m.m36825a(32)];
                if (bVar4 != null) {
                    mo36853c(bVar4);
                }
                C8930b bVar5 = this.f5324b[C1471m.m36825a(64)];
                if (bVar5 != null) {
                    mo36849g(bVar5);
                }
            }
        }

        public C1458h0 mo36854b() {
            m36855a();
            return this.f5323a;
        }

        public void mo36853c(C8930b bVar) {
        }

        public void mo36852d(C8930b bVar) {
        }

        public void mo36851e(C8930b bVar) {
        }

        public void mo36850f(C8930b bVar) {
        }

        public void mo36849g(C8930b bVar) {
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
        public C1458h0 mo36843a() {
            return C1458h0.m36862s(this.f5330c.consumeDisplayCutout());
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
        public C1439c mo36838f() {
            return C1439c.m36921e(this.f5330c.getDisplayCutout());
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
        public static final C1458h0 f5339q = C1458h0.m36862s(WindowInsets.CONSUMED);

        public C1469k(C1458h0 h0Var, WindowInsets windowInsets) {
            super(h0Var, windowInsets);
        }

        @Override
        public final void mo36840d(View view) {
        }

        @Override
        public C8930b mo36837g(int i) {
            return C8930b.m10928d(this.f5330c.getInsets(C1472n.m36824a(i)));
        }

        public C1469k(C1458h0 h0Var, C1469k kVar) {
            super(h0Var, kVar);
        }
    }

    public static class C1470l {
        public static final C1458h0 f5340b = new C1460b().m36859a().m36880a().m36879b().m36878c();
        public final C1458h0 f5341a;

        public C1470l(C1458h0 h0Var) {
            this.f5341a = h0Var;
        }

        public C1458h0 mo36843a() {
            return this.f5341a;
        }

        public C1458h0 mo36842b() {
            return this.f5341a;
        }

        public C1458h0 mo36841c() {
            return this.f5341a;
        }

        public void mo36840d(View view) {
        }

        public void mo36839e(C1458h0 h0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1470l)) {
                return false;
            }
            C1470l lVar = (C1470l) obj;
            return mo36830n() == lVar.mo36830n() && mo36831m() == lVar.mo36831m() && C1128d.m38336a(mo36833k(), lVar.mo36833k()) && C1128d.m38336a(mo36835i(), lVar.mo36835i()) && C1128d.m38336a(mo36838f(), lVar.mo36838f());
        }

        public C1439c mo36838f() {
            return null;
        }

        public C8930b mo36837g(int i) {
            return C8930b.f28790e;
        }

        public C8930b mo36836h() {
            return mo36833k();
        }

        public int hashCode() {
            return C1128d.m38335b(Boolean.valueOf(mo36830n()), Boolean.valueOf(mo36831m()), mo36833k(), mo36835i(), mo36838f());
        }

        public C8930b mo36835i() {
            return C8930b.f28790e;
        }

        public C8930b mo36834j() {
            return mo36833k();
        }

        public C8930b mo36833k() {
            return C8930b.f28790e;
        }

        public C8930b mo36832l() {
            return mo36833k();
        }

        public boolean mo36831m() {
            return false;
        }

        public boolean mo36830n() {
            return false;
        }

        public void mo36829o(C8930b[] bVarArr) {
        }

        public void mo36828p(C8930b bVar) {
        }

        public void mo36827q(C1458h0 h0Var) {
        }

        public void mo36826r(C8930b bVar) {
        }
    }

    public static final class C1471m {
        public static int m36825a(int i) {
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
        public static int m36824a(int i) {
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

    public static C1458h0 m36862s(WindowInsets windowInsets) {
        return m36861t(windowInsets, null);
    }

    public static C1458h0 m36861t(WindowInsets windowInsets, View view) {
        C1458h0 h0Var = new C1458h0((WindowInsets) C1132h.m38325e(windowInsets));
        if (view != null && C1489y.m36763J(view)) {
            h0Var.m36865p(C1489y.m36704z(view));
            h0Var.m36877d(view.getRootView());
        }
        return h0Var;
    }

    @Deprecated
    public C1458h0 m36880a() {
        return this.f5310a.mo36843a();
    }

    @Deprecated
    public C1458h0 m36879b() {
        return this.f5310a.mo36842b();
    }

    @Deprecated
    public C1458h0 m36878c() {
        return this.f5310a.mo36841c();
    }

    public void m36877d(View view) {
        this.f5310a.mo36840d(view);
    }

    public C1439c m36876e() {
        return this.f5310a.mo36838f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1458h0)) {
            return false;
        }
        return C1128d.m38336a(this.f5310a, ((C1458h0) obj).f5310a);
    }

    public C8930b m36875f(int i) {
        return this.f5310a.mo36837g(i);
    }

    @Deprecated
    public C8930b m36874g() {
        return this.f5310a.mo36835i();
    }

    @Deprecated
    public int m36873h() {
        return this.f5310a.mo36833k().f28794d;
    }

    public int hashCode() {
        C1470l lVar = this.f5310a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int m36872i() {
        return this.f5310a.mo36833k().f28791a;
    }

    @Deprecated
    public int m36871j() {
        return this.f5310a.mo36833k().f28793c;
    }

    @Deprecated
    public int m36870k() {
        return this.f5310a.mo36833k().f28792b;
    }

    public boolean m36869l() {
        return this.f5310a.mo36831m();
    }

    @Deprecated
    public C1458h0 m36868m(int i, int i2, int i3, int i4) {
        return new C1460b(this).m36857c(C8930b.m10930b(i, i2, i3, i4)).m36859a();
    }

    public void m36867n(C8930b[] bVarArr) {
        this.f5310a.mo36829o(bVarArr);
    }

    public void m36866o(C8930b bVar) {
        this.f5310a.mo36828p(bVar);
    }

    public void m36865p(C1458h0 h0Var) {
        this.f5310a.mo36827q(h0Var);
    }

    public void m36864q(C8930b bVar) {
        this.f5310a.mo36826r(bVar);
    }

    public WindowInsets m36863r() {
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
            this.f5320c = m36856h();
        }

        private static WindowInsets m36856h() {
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
        public C1458h0 mo36854b() {
            m36855a();
            C1458h0 s = C1458h0.m36862s(this.f5320c);
            s.m36867n(this.f5324b);
            s.m36864q(this.f5321d);
            return s;
        }

        @Override
        public void mo36852d(C8930b bVar) {
            this.f5321d = bVar;
        }

        @Override
        public void mo36850f(C8930b bVar) {
            WindowInsets windowInsets = this.f5320c;
            if (windowInsets != null) {
                this.f5320c = windowInsets.replaceSystemWindowInsets(bVar.f28791a, bVar.f28792b, bVar.f28793c, bVar.f28794d);
            }
        }

        public C1461c(C1458h0 h0Var) {
            super(h0Var);
            this.f5320c = h0Var.m36863r();
        }
    }

    public static class C1462d extends C1464f {
        public final WindowInsets.Builder f5322c;

        public C1462d() {
            this.f5322c = new WindowInsets.Builder();
        }

        @Override
        public C1458h0 mo36854b() {
            m36855a();
            C1458h0 s = C1458h0.m36862s(this.f5322c.build());
            s.m36867n(this.f5324b);
            return s;
        }

        @Override
        public void mo36853c(C8930b bVar) {
            this.f5322c.setMandatorySystemGestureInsets(bVar.m10927e());
        }

        @Override
        public void mo36852d(C8930b bVar) {
            this.f5322c.setStableInsets(bVar.m10927e());
        }

        @Override
        public void mo36851e(C8930b bVar) {
            this.f5322c.setSystemGestureInsets(bVar.m10927e());
        }

        @Override
        public void mo36850f(C8930b bVar) {
            this.f5322c.setSystemWindowInsets(bVar.m10927e());
        }

        @Override
        public void mo36849g(C8930b bVar) {
            this.f5322c.setTappableElementInsets(bVar.m10927e());
        }

        public C1462d(C1458h0 h0Var) {
            super(h0Var);
            WindowInsets.Builder builder;
            WindowInsets r = h0Var.m36863r();
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
        public C1458h0 mo36842b() {
            return C1458h0.m36862s(this.f5330c.consumeStableInsets());
        }

        @Override
        public C1458h0 mo36841c() {
            return C1458h0.m36862s(this.f5330c.consumeSystemWindowInsets());
        }

        @Override
        public final C8930b mo36835i() {
            if (this.f5335m == null) {
                this.f5335m = C8930b.m10930b(this.f5330c.getStableInsetLeft(), this.f5330c.getStableInsetTop(), this.f5330c.getStableInsetRight(), this.f5330c.getStableInsetBottom());
            }
            return this.f5335m;
        }

        @Override
        public boolean mo36831m() {
            return this.f5330c.isConsumed();
        }

        @Override
        public void mo36826r(C8930b bVar) {
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
        private C8930b m36848s(int i, boolean z) {
            C8930b bVar = C8930b.f28790e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    bVar = C8930b.m10931a(bVar, m36847t(i2, z));
                }
            }
            return bVar;
        }

        private C8930b m36846u() {
            C1458h0 h0Var = this.f5333f;
            if (h0Var != null) {
                return h0Var.m36874g();
            }
            return C8930b.f28790e;
        }

        private C8930b m36845v(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f5325h) {
                    m36844w();
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
                            return C8930b.m10929c(rect);
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
        private static void m36844w() {
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
        public void mo36840d(View view) {
            C8930b v = m36845v(view);
            if (v == null) {
                v = C8930b.f28790e;
            }
            mo36828p(v);
        }

        @Override
        public void mo36839e(C1458h0 h0Var) {
            h0Var.m36865p(this.f5333f);
            h0Var.m36866o(this.f5334g);
        }

        @Override
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f5334g, ((C1465g) obj).f5334g);
        }

        @Override
        public C8930b mo36837g(int i) {
            return m36848s(i, false);
        }

        @Override
        public final C8930b mo36833k() {
            if (this.f5332e == null) {
                this.f5332e = C8930b.m10930b(this.f5330c.getSystemWindowInsetLeft(), this.f5330c.getSystemWindowInsetTop(), this.f5330c.getSystemWindowInsetRight(), this.f5330c.getSystemWindowInsetBottom());
            }
            return this.f5332e;
        }

        @Override
        public boolean mo36830n() {
            return this.f5330c.isRound();
        }

        @Override
        public void mo36829o(C8930b[] bVarArr) {
            this.f5331d = bVarArr;
        }

        @Override
        public void mo36828p(C8930b bVar) {
            this.f5334g = bVar;
        }

        @Override
        public void mo36827q(C1458h0 h0Var) {
            this.f5333f = h0Var;
        }

        public C8930b m36847t(int i, boolean z) {
            int i2;
            C1439c cVar;
            if (i != 1) {
                C8930b bVar = null;
                if (i != 2) {
                    if (i == 8) {
                        C8930b[] bVarArr = this.f5331d;
                        if (bVarArr != null) {
                            bVar = bVarArr[C1471m.m36825a(8)];
                        }
                        if (bVar != null) {
                            return bVar;
                        }
                        C8930b k = mo36833k();
                        C8930b u = m36846u();
                        int i3 = k.f28794d;
                        if (i3 > u.f28794d) {
                            return C8930b.m10930b(0, 0, 0, i3);
                        }
                        C8930b bVar2 = this.f5334g;
                        if (bVar2 == null || bVar2.equals(C8930b.f28790e) || (i2 = this.f5334g.f28794d) <= u.f28794d) {
                            return C8930b.f28790e;
                        }
                        return C8930b.m10930b(0, 0, 0, i2);
                    } else if (i == 16) {
                        return mo36834j();
                    } else {
                        if (i == 32) {
                            return mo36836h();
                        }
                        if (i == 64) {
                            return mo36832l();
                        }
                        if (i != 128) {
                            return C8930b.f28790e;
                        }
                        C1458h0 h0Var = this.f5333f;
                        if (h0Var != null) {
                            cVar = h0Var.m36876e();
                        } else {
                            cVar = mo36838f();
                        }
                        if (cVar != null) {
                            return C8930b.m10930b(cVar.m36924b(), cVar.m36922d(), cVar.m36923c(), cVar.m36925a());
                        }
                        return C8930b.f28790e;
                    }
                } else if (z) {
                    C8930b u2 = m36846u();
                    C8930b i4 = mo36835i();
                    return C8930b.m10930b(Math.max(u2.f28791a, i4.f28791a), 0, Math.max(u2.f28793c, i4.f28793c), Math.max(u2.f28794d, i4.f28794d));
                } else {
                    C8930b k2 = mo36833k();
                    C1458h0 h0Var2 = this.f5333f;
                    if (h0Var2 != null) {
                        bVar = h0Var2.m36874g();
                    }
                    int i5 = k2.f28794d;
                    if (bVar != null) {
                        i5 = Math.min(i5, bVar.f28794d);
                    }
                    return C8930b.m10930b(k2.f28791a, 0, k2.f28793c, i5);
                }
            } else if (z) {
                return C8930b.m10930b(0, Math.max(m36846u().f28792b, mo36833k().f28792b), 0, 0);
            } else {
                return C8930b.m10930b(0, mo36833k().f28792b, 0, 0);
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
        public C8930b mo36836h() {
            if (this.f5337o == null) {
                this.f5337o = C8930b.m10928d(this.f5330c.getMandatorySystemGestureInsets());
            }
            return this.f5337o;
        }

        @Override
        public C8930b mo36834j() {
            if (this.f5336n == null) {
                this.f5336n = C8930b.m10928d(this.f5330c.getSystemGestureInsets());
            }
            return this.f5336n;
        }

        @Override
        public C8930b mo36832l() {
            if (this.f5338p == null) {
                this.f5338p = C8930b.m10928d(this.f5330c.getTappableElementInsets());
            }
            return this.f5338p;
        }

        @Override
        public void mo36826r(C8930b bVar) {
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

        public C1458h0 m36859a() {
            return this.f5315a.mo36854b();
        }

        @Deprecated
        public C1460b m36858b(C8930b bVar) {
            this.f5315a.mo36852d(bVar);
            return this;
        }

        @Deprecated
        public C1460b m36857c(C8930b bVar) {
            this.f5315a.mo36850f(bVar);
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
            lVar.mo36839e(this);
            return;
        }
        this.f5310a = new C1470l(this);
    }
}
