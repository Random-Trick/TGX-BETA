package p028c1;

import android.view.View;
import android.view.ViewParent;

public class C1478n {
    public ViewParent f5345a;
    public ViewParent f5346b;
    public final View f5347c;
    public boolean f5348d;
    public int[] f5349e;

    public C1478n(View view) {
        this.f5347c = view;
    }

    public boolean m36802a(float f, float f2, boolean z) {
        ViewParent h;
        if (!m36791l() || (h = m36795h(0)) == null) {
            return false;
        }
        return C1440c0.m36917a(h, this.f5347c, f, f2, z);
    }

    public boolean m36801b(float f, float f2) {
        ViewParent h;
        if (!m36791l() || (h = m36795h(0)) == null) {
            return false;
        }
        return C1440c0.m36916b(h, this.f5347c, f, f2);
    }

    public boolean m36800c(int i, int i2, int[] iArr, int[] iArr2) {
        return m36799d(i, i2, iArr, iArr2, 0);
    }

    public boolean m36799d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent h;
        int i4;
        int i5;
        if (!m36791l() || (h = m36795h(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f5347c.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                iArr = m36794i();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C1440c0.m36915c(h, this.f5347c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f5347c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i4;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public void m36798e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m36796g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean m36797f(int i, int i2, int i3, int i4, int[] iArr) {
        return m36796g(i, i2, i3, i4, iArr, 0, null);
    }

    public final boolean m36796g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent h;
        int i6;
        int i7;
        int[] iArr3;
        if (!m36791l() || (h = m36795h(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f5347c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i6 = iArr[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] i8 = m36794i();
            i8[0] = 0;
            i8[1] = 0;
            iArr3 = i8;
        } else {
            iArr3 = iArr2;
        }
        C1440c0.m36914d(h, this.f5347c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f5347c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i6;
        }
        return true;
    }

    public final ViewParent m36795h(int i) {
        if (i == 0) {
            return this.f5345a;
        }
        if (i != 1) {
            return null;
        }
        return this.f5346b;
    }

    public final int[] m36794i() {
        if (this.f5349e == null) {
            this.f5349e = new int[2];
        }
        return this.f5349e;
    }

    public boolean m36793j() {
        return m36792k(0);
    }

    public boolean m36792k(int i) {
        return m36795h(i) != null;
    }

    public boolean m36791l() {
        return this.f5348d;
    }

    public void m36790m(boolean z) {
        if (this.f5348d) {
            C1489y.m36712p0(this.f5347c);
        }
        this.f5348d = z;
    }

    public final void m36789n(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f5345a = viewParent;
        } else if (i == 1) {
            this.f5346b = viewParent;
        }
    }

    public boolean m36788o(int i) {
        return m36787p(i, 0);
    }

    public boolean m36787p(int i, int i2) {
        if (m36792k(i2)) {
            return true;
        }
        if (!m36791l()) {
            return false;
        }
        View view = this.f5347c;
        for (ViewParent parent = this.f5347c.getParent(); parent != null; parent = parent.getParent()) {
            if (C1440c0.m36912f(parent, view, this.f5347c, i, i2)) {
                m36789n(i2, parent);
                C1440c0.m36913e(parent, view, this.f5347c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void m36786q() {
        m36785r(0);
    }

    public void m36785r(int i) {
        ViewParent h = m36795h(i);
        if (h != null) {
            C1440c0.m36911g(h, this.f5347c, i);
            m36789n(i, null);
        }
    }
}
