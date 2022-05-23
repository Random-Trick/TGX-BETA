package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.q;
import d.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g extends MenuInflater {
    public static final Class<?>[] f14933e;
    public static final Class<?>[] f14934f;
    public final Object[] f14935a;
    public final Object[] f14936b;
    public Context f14937c;
    public Object f14938d;

    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] f14939c = {MenuItem.class};
        public Object f14940a;
        public Method f14941b;

        public a(Object obj, String str) {
            this.f14940a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f14941b = cls.getMethod(str, f14939c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f14941b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f14941b.invoke(this.f14940a, menuItem)).booleanValue();
                }
                this.f14941b.invoke(this.f14940a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public class b {
        public c1.b A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;
        public Menu f14942a;
        public int f14943b;
        public int f14944c;
        public int f14945d;
        public int f14946e;
        public boolean f14947f;
        public boolean f14948g;
        public boolean f14949h;
        public int f14950i;
        public int f14951j;
        public CharSequence f14952k;
        public CharSequence f14953l;
        public int f14954m;
        public char f14955n;
        public int f14956o;
        public char f14957p;
        public int f14958q;
        public int f14959r;
        public boolean f14960s;
        public boolean f14961t;
        public boolean f14962u;
        public int f14963v;
        public int f14964w;
        public String f14965x;
        public String f14966y;
        public String f14967z;

        public b(Menu menu) {
            this.f14942a = menu;
            h();
        }

        public void a() {
            this.f14949h = true;
            i(this.f14942a.add(this.f14943b, this.f14950i, this.f14951j, this.f14952k));
        }

        public SubMenu b() {
            this.f14949h = true;
            SubMenu addSubMenu = this.f14942a.addSubMenu(this.f14943b, this.f14950i, this.f14951j, this.f14952k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f14949h;
        }

        public final <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f14937c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f14937c.obtainStyledAttributes(attributeSet, j.f6067t1);
            this.f14943b = obtainStyledAttributes.getResourceId(j.f6077v1, 0);
            this.f14944c = obtainStyledAttributes.getInt(j.f6087x1, 0);
            this.f14945d = obtainStyledAttributes.getInt(j.f6092y1, 0);
            this.f14946e = obtainStyledAttributes.getInt(j.f6097z1, 0);
            this.f14947f = obtainStyledAttributes.getBoolean(j.f6082w1, true);
            this.f14948g = obtainStyledAttributes.getBoolean(j.f6072u1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            g0 s10 = g0.s(g.this.f14937c, attributeSet, j.A1);
            this.f14950i = s10.m(j.D1, 0);
            this.f14951j = (s10.j(j.G1, this.f14944c) & (-65536)) | (s10.j(j.H1, this.f14945d) & 65535);
            this.f14952k = s10.o(j.I1);
            this.f14953l = s10.o(j.J1);
            this.f14954m = s10.m(j.B1, 0);
            this.f14955n = c(s10.n(j.K1));
            this.f14956o = s10.j(j.R1, org.thunderdog.challegram.Log.TAG_EMOJI);
            this.f14957p = c(s10.n(j.L1));
            this.f14958q = s10.j(j.V1, org.thunderdog.challegram.Log.TAG_EMOJI);
            int i10 = j.M1;
            if (s10.q(i10)) {
                this.f14959r = s10.a(i10, false) ? 1 : 0;
            } else {
                this.f14959r = this.f14946e;
            }
            this.f14960s = s10.a(j.E1, false);
            this.f14961t = s10.a(j.F1, this.f14947f);
            this.f14962u = s10.a(j.C1, this.f14948g);
            this.f14963v = s10.j(j.W1, -1);
            this.f14967z = s10.n(j.N1);
            this.f14964w = s10.m(j.O1, 0);
            this.f14965x = s10.n(j.Q1);
            String n10 = s10.n(j.P1);
            this.f14966y = n10;
            boolean z10 = n10 != null;
            if (z10 && this.f14964w == 0 && this.f14965x == null) {
                this.A = (c1.b) e(n10, g.f14934f, g.this.f14936b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = s10.o(j.S1);
            this.C = s10.o(j.X1);
            int i11 = j.U1;
            if (s10.q(i11)) {
                this.E = q.e(s10.j(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = j.T1;
            if (s10.q(i12)) {
                this.D = s10.c(i12);
            } else {
                this.D = null;
            }
            s10.u();
            this.f14949h = false;
        }

        public void h() {
            this.f14943b = 0;
            this.f14944c = 0;
            this.f14945d = 0;
            this.f14946e = 0;
            this.f14947f = true;
            this.f14948g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f14960s).setVisible(this.f14961t).setEnabled(this.f14962u).setCheckable(this.f14959r >= 1).setTitleCondensed(this.f14953l).setIcon(this.f14954m);
            int i10 = this.f14963v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f14967z != null) {
                if (!g.this.f14937c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f14967z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z11 = menuItem instanceof androidx.appcompat.view.menu.g;
            if (z11) {
                androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) menuItem;
            }
            if (this.f14959r >= 2) {
                if (z11) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof c) {
                    ((c) menuItem).h(true);
                }
            }
            String str = this.f14965x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f14933e, g.this.f14935a));
                z10 = true;
            }
            int i11 = this.f14964w;
            if (i11 > 0) {
                if (!z10) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            c1.b bVar = this.A;
            if (bVar != null) {
                c1.j.a(menuItem, bVar);
            }
            c1.j.c(menuItem, this.B);
            c1.j.g(menuItem, this.C);
            c1.j.b(menuItem, this.f14955n, this.f14956o);
            c1.j.f(menuItem, this.f14957p, this.f14958q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                c1.j.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                c1.j.d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f14933e = clsArr;
        f14934f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f14937c = context;
        Object[] objArr = {context};
        this.f14935a = objArr;
        this.f14936b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f14938d == null) {
            this.f14938d = a(this.f14937c);
        }
        return this.f14938d;
    }

    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z11 && name2.equals(str)) {
                            str = null;
                            z11 = false;
                        } else if (name2.equals("group")) {
                            bVar.h();
                        } else if (name2.equals("item")) {
                            if (!bVar.d()) {
                                c1.b bVar2 = bVar.A;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z10 = true;
                        }
                    }
                } else if (!z11) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.g(attributeSet);
                    } else if (name3.equals("menu")) {
                        c(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z11 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof v0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f14937c.getResources().getLayout(i10);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (IOException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
