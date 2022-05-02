package p364zd;

import android.graphics.Color;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class C11510b {
    public final int f36525a;
    public int f36526b;
    public int f36527c;
    public final List<C11513c> f36528d;
    public int[] f36529e;

    public C11510b(int i, int i2, int i3, int i4) {
        this.f36525a = i2;
        this.f36526b = i3;
        int[] w0 = C4868i.m24726c2().m24569w0(C11541z.m41T(i), i2);
        this.f36529e = w0;
        int length = w0 != null ? w0.length : 0;
        ArrayList arrayList = new ArrayList(length + 1 + 1);
        this.f36528d = arrayList;
        arrayList.add(new C11513c(i4));
        if (length > 0) {
            for (int i5 : this.f36529e) {
                this.f36528d.add(new C11513c(i5));
            }
        }
        int size = this.f36528d.size();
        while (true) {
            size--;
            if (size < 0) {
                size = -1;
                break;
            } else if (this.f36528d.get(size).f36556b == i3) {
                break;
            }
        }
        if (size == -1) {
            size = this.f36528d.size();
            this.f36528d.add(new C11513c(i3));
        }
        this.f36527c = size;
    }

    public boolean m376a() {
        return m367j(false) > 0;
    }

    public boolean m375b() {
        return this.f36527c < this.f36528d.size() - 1;
    }

    public boolean m374c() {
        return this.f36527c == this.f36528d.size() - 1 && this.f36528d.get(this.f36527c).f36555a;
    }

    public boolean m373d() {
        return this.f36527c > 0;
    }

    public boolean m372e() {
        if (this.f36528d.size() <= 1) {
            return false;
        }
        this.f36528d.clear();
        this.f36528d.add(this.f36528d.get(0));
        this.f36527c = 0;
        return true;
    }

    public int m371f() {
        return this.f36528d.get(this.f36527c).f36556b;
    }

    public int m370g() {
        return this.f36525a;
    }

    public float[] m369h() {
        return this.f36528d.get(this.f36527c).f36557c;
    }

    public int[] m368i() {
        int j = m367j(true);
        if (j <= 0) {
            return null;
        }
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet(j);
        int i = 0;
        int i2 = 0;
        while (i2 < j) {
            i2++;
            linkedHashSet.add(Integer.valueOf(this.f36528d.get(i2).f36556b));
        }
        int[] iArr = new int[linkedHashSet.size()];
        for (Integer num : linkedHashSet) {
            iArr[i] = num.intValue();
            i++;
        }
        return iArr;
    }

    public int m367j(boolean z) {
        int size = this.f36528d.size();
        if (z && this.f36526b == this.f36528d.get(size - 1).f36556b) {
            size--;
        }
        return Math.max(0, size - 1);
    }

    public boolean m366k() {
        return m373d() || m375b();
    }

    public boolean m365l() {
        return Color.alpha(m371f()) < 255;
    }

    public boolean m364m() {
        return this.f36527c == 0;
    }

    public boolean m363n() {
        if (this.f36527c >= this.f36528d.size() - 1) {
            return false;
        }
        this.f36527c++;
        return true;
    }

    public boolean m362o() {
        int i = this.f36527c;
        if (i <= 0) {
            return false;
        }
        this.f36528d.remove(i);
        this.f36527c--;
        return true;
    }

    public boolean m361p() {
        if (!m374c()) {
            return false;
        }
        this.f36528d.get(this.f36527c).f36555a = false;
        return true;
    }

    public boolean m360q(int[] iArr) {
        if (Arrays.equals(this.f36529e, iArr)) {
            return false;
        }
        this.f36529e = iArr;
        return true;
    }

    public boolean m359r(int i, boolean z) {
        if (m371f() != i) {
            if (this.f36528d.get(this.f36527c).f36555a) {
                this.f36528d.get(this.f36527c).m349b(i);
                int i2 = this.f36527c;
                if (i2 > 0 && this.f36528d.get(i2 - 1).equals(this.f36528d.get(this.f36527c)) && !this.f36528d.get(this.f36527c - 1).f36555a) {
                    this.f36528d.remove(this.f36527c);
                    this.f36527c--;
                }
            } else {
                int size = this.f36528d.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (this.f36528d.get(size).f36555a && this.f36528d.get(size).f36556b == i) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (size == -1) {
                    List<C11513c> list = this.f36528d;
                    if (list.get(list.size() - 1).f36555a) {
                        size = this.f36528d.size() - 1;
                    }
                }
                if (size != -1) {
                    this.f36527c = size;
                    this.f36528d.get(size).m349b(i);
                } else {
                    this.f36527c = this.f36528d.size();
                    this.f36528d.add(new C11513c(i, this.f36528d.get(this.f36527c)));
                }
            }
            if (z) {
                this.f36526b = i;
            }
            return true;
        } else if (!z || this.f36526b == i) {
            return false;
        } else {
            this.f36526b = i;
            return true;
        }
    }

    public boolean m358s(int i, float f, boolean z) {
        float[] fArr = this.f36528d.get(this.f36527c).f36557c;
        float f2 = fArr[i];
        if (f2 != f) {
            fArr[i] = f;
            int HSVToColor = Color.HSVToColor(Color.alpha(m371f()), fArr);
            fArr[i] = f2;
            if (this.f36528d.get(this.f36527c).f36555a) {
                this.f36528d.get(this.f36527c).m350a(i, f);
                int i2 = this.f36527c;
                if (i2 > 0 && this.f36528d.get(i2 - 1).equals(this.f36528d.get(this.f36527c)) && !this.f36528d.get(this.f36527c - 1).f36555a) {
                    this.f36528d.remove(this.f36527c);
                    this.f36527c--;
                }
            } else {
                int size = this.f36528d.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (this.f36528d.get(size).f36555a && this.f36528d.get(size).f36556b == HSVToColor) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (size == -1) {
                    List<C11513c> list = this.f36528d;
                    if (list.get(list.size() - 1).f36555a) {
                        size = this.f36528d.size() - 1;
                    }
                }
                if (size != -1) {
                    this.f36527c = size;
                    this.f36528d.get(size).m350a(i, f);
                } else {
                    this.f36527c = this.f36528d.size();
                    C11513c cVar = new C11513c(HSVToColor, this.f36528d.get(this.f36527c));
                    this.f36528d.add(cVar);
                    cVar.m350a(i, f);
                }
            }
            if (z) {
                this.f36526b = HSVToColor;
            }
            return true;
        }
        int f3 = m371f();
        if (!z || this.f36526b == f3) {
            return false;
        }
        this.f36526b = f3;
        return true;
    }

    public boolean m357t() {
        int i = this.f36527c;
        if (i <= 0) {
            return false;
        }
        this.f36527c = i - 1;
        return true;
    }
}
