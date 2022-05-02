package p127j;

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
import androidx.appcompat.view.menu.C0355g;
import androidx.appcompat.widget.C0452g0;
import androidx.appcompat.widget.C0475q;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p028c1.AbstractC1435b;
import p028c1.C1474j;
import p039d.C3563j;
import p142k.MenuItemC6014c;
import p294v0.AbstractMenuC9829a;

public class C5821g extends MenuInflater {
    public static final Class<?>[] f18553e;
    public static final Class<?>[] f18554f;
    public final Object[] f18555a;
    public final Object[] f18556b;
    public Context f18557c;
    public Object f18558d;

    public static class MenuItem$OnMenuItemClickListenerC5822a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] f18559c = {MenuItem.class};
        public Object f18560a;
        public Method f18561b;

        public MenuItem$OnMenuItemClickListenerC5822a(Object obj, String str) {
            this.f18560a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f18561b = cls.getMethod(str, f18559c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f18561b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f18561b.invoke(this.f18560a, menuItem)).booleanValue();
                }
                this.f18561b.invoke(this.f18560a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public class C5823b {
        public AbstractC1435b f18562A;
        public CharSequence f18563B;
        public CharSequence f18564C;
        public ColorStateList f18565D = null;
        public PorterDuff.Mode f18566E = null;
        public Menu f18568a;
        public int f18569b;
        public int f18570c;
        public int f18571d;
        public int f18572e;
        public boolean f18573f;
        public boolean f18574g;
        public boolean f18575h;
        public int f18576i;
        public int f18577j;
        public CharSequence f18578k;
        public CharSequence f18579l;
        public int f18580m;
        public char f18581n;
        public int f18582o;
        public char f18583p;
        public int f18584q;
        public int f18585r;
        public boolean f18586s;
        public boolean f18587t;
        public boolean f18588u;
        public int f18589v;
        public int f18590w;
        public String f18591x;
        public String f18592y;
        public String f18593z;

        public C5823b(Menu menu) {
            this.f18568a = menu;
            m22073h();
        }

        public void m22080a() {
            this.f18575h = true;
            m22072i(this.f18568a.add(this.f18569b, this.f18576i, this.f18577j, this.f18578k));
        }

        public SubMenu m22079b() {
            this.f18575h = true;
            SubMenu addSubMenu = this.f18568a.addSubMenu(this.f18569b, this.f18576i, this.f18577j, this.f18578k);
            m22072i(addSubMenu.getItem());
            return addSubMenu;
        }

        public final char m22078c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean m22077d() {
            return this.f18575h;
        }

        public final <T> T m22076e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C5821g.this.f18557c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        public void m22075f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C5821g.this.f18557c.obtainStyledAttributes(attributeSet, C3563j.f12129t1);
            this.f18569b = obtainStyledAttributes.getResourceId(C3563j.f12139v1, 0);
            this.f18570c = obtainStyledAttributes.getInt(C3563j.f12149x1, 0);
            this.f18571d = obtainStyledAttributes.getInt(C3563j.f12154y1, 0);
            this.f18572e = obtainStyledAttributes.getInt(C3563j.f12159z1, 0);
            this.f18573f = obtainStyledAttributes.getBoolean(C3563j.f12144w1, true);
            this.f18574g = obtainStyledAttributes.getBoolean(C3563j.f12134u1, true);
            obtainStyledAttributes.recycle();
        }

        public void m22074g(AttributeSet attributeSet) {
            C0452g0 s = C0452g0.m41256s(C5821g.this.f18557c, attributeSet, C3563j.f11903A1);
            this.f18576i = s.m41262m(C3563j.f11918D1, 0);
            this.f18577j = (s.m41265j(C3563j.f11933G1, this.f18570c) & (-65536)) | (s.m41265j(C3563j.f11938H1, this.f18571d) & 65535);
            this.f18578k = s.m41260o(C3563j.f11943I1);
            this.f18579l = s.m41260o(C3563j.f11948J1);
            this.f18580m = s.m41262m(C3563j.f11908B1, 0);
            this.f18581n = m22078c(s.m41261n(C3563j.f11953K1));
            this.f18582o = s.m41265j(C3563j.f11988R1, org.thunderdog.challegram.Log.TAG_EMOJI);
            this.f18583p = m22078c(s.m41261n(C3563j.f11958L1));
            this.f18584q = s.m41265j(C3563j.f12008V1, org.thunderdog.challegram.Log.TAG_EMOJI);
            int i = C3563j.f11963M1;
            if (s.m41258q(i)) {
                this.f18585r = s.m41274a(i, false) ? 1 : 0;
            } else {
                this.f18585r = this.f18572e;
            }
            this.f18586s = s.m41274a(C3563j.f11923E1, false);
            this.f18587t = s.m41274a(C3563j.f11928F1, this.f18573f);
            this.f18588u = s.m41274a(C3563j.f11913C1, this.f18574g);
            this.f18589v = s.m41265j(C3563j.f12013W1, -1);
            this.f18593z = s.m41261n(C3563j.f11968N1);
            this.f18590w = s.m41262m(C3563j.f11973O1, 0);
            this.f18591x = s.m41261n(C3563j.f11983Q1);
            String n = s.m41261n(C3563j.f11978P1);
            this.f18592y = n;
            boolean z = n != null;
            if (z && this.f18590w == 0 && this.f18591x == null) {
                this.f18562A = (AbstractC1435b) m22076e(n, C5821g.f18554f, C5821g.this.f18556b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f18562A = null;
            }
            this.f18563B = s.m41260o(C3563j.f11993S1);
            this.f18564C = s.m41260o(C3563j.f12018X1);
            int i2 = C3563j.f12003U1;
            if (s.m41258q(i2)) {
                this.f18566E = C0475q.m41101e(s.m41265j(i2, -1), this.f18566E);
            } else {
                this.f18566E = null;
            }
            int i3 = C3563j.f11998T1;
            if (s.m41258q(i3)) {
                this.f18565D = s.m41272c(i3);
            } else {
                this.f18565D = null;
            }
            s.m41254u();
            this.f18575h = false;
        }

        public void m22073h() {
            this.f18569b = 0;
            this.f18570c = 0;
            this.f18571d = 0;
            this.f18572e = 0;
            this.f18573f = true;
            this.f18574g = true;
        }

        public final void m22072i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f18586s).setVisible(this.f18587t).setEnabled(this.f18588u).setCheckable(this.f18585r >= 1).setTitleCondensed(this.f18579l).setIcon(this.f18580m);
            int i = this.f18589v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f18593z != null) {
                if (!C5821g.this.f18557c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC5822a(C5821g.this.m22082b(), this.f18593z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z2 = menuItem instanceof C0355g;
            if (z2) {
                C0355g gVar = (C0355g) menuItem;
            }
            if (this.f18585r >= 2) {
                if (z2) {
                    ((C0355g) menuItem).m41655t(true);
                } else if (menuItem instanceof MenuItemC6014c) {
                    ((MenuItemC6014c) menuItem).m21564h(true);
                }
            }
            String str = this.f18591x;
            if (str != null) {
                menuItem.setActionView((View) m22076e(str, C5821g.f18553e, C5821g.this.f18555a));
                z = true;
            }
            int i2 = this.f18590w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            AbstractC1435b bVar = this.f18562A;
            if (bVar != null) {
                C1474j.m36818a(menuItem, bVar);
            }
            C1474j.m36816c(menuItem, this.f18563B);
            C1474j.m36812g(menuItem, this.f18564C);
            C1474j.m36817b(menuItem, this.f18581n, this.f18582o);
            C1474j.m36813f(menuItem, this.f18583p, this.f18584q);
            PorterDuff.Mode mode = this.f18566E;
            if (mode != null) {
                C1474j.m36814e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f18565D;
            if (colorStateList != null) {
                C1474j.m36815d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f18553e = clsArr;
        f18554f = clsArr;
    }

    public C5821g(Context context) {
        super(context);
        this.f18557c = context;
        Object[] objArr = {context};
        this.f18555a = objArr;
        this.f18556b = objArr;
    }

    public final Object m22083a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m22083a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object m22082b() {
        if (this.f18558d == null) {
            this.f18558d = m22083a(this.f18557c);
        }
        return this.f18558d;
    }

    public final void m22081c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C5823b bVar = new C5823b(menu);
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
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.m22073h();
                        } else if (name2.equals("item")) {
                            if (!bVar.m22077d()) {
                                AbstractC1435b bVar2 = bVar.f18562A;
                                if (bVar2 == null || !bVar2.mo21563a()) {
                                    bVar.m22080a();
                                } else {
                                    bVar.m22079b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.m22075f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.m22074g(attributeSet);
                    } else if (name3.equals("menu")) {
                        m22081c(xmlPullParser, attributeSet, bVar.m22079b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof AbstractMenuC9829a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f18557c.getResources().getLayout(i);
                    m22081c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
