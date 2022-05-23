package ae;

import android.graphics.Color;
import he.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class b {
    public final int f793a;
    public int f794b;
    public int f795c;
    public final List<c> f796d;
    public int[] f797e;

    public b(int i10, int i11, int i12, int i13) {
        this.f793a = i11;
        this.f794b = i12;
        int[] w02 = i.c2().w0(z.V(i10), i11);
        this.f797e = w02;
        int length = w02 != null ? w02.length : 0;
        ArrayList arrayList = new ArrayList(length + 1 + 1);
        this.f796d = arrayList;
        arrayList.add(new c(i13));
        if (length > 0) {
            for (int i14 : this.f797e) {
                this.f796d.add(new c(i14));
            }
        }
        int size = this.f796d.size();
        while (true) {
            size--;
            if (size < 0) {
                size = -1;
                break;
            } else if (this.f796d.get(size).f824b == i12) {
                break;
            }
        }
        if (size == -1) {
            size = this.f796d.size();
            this.f796d.add(new c(i12));
        }
        this.f795c = size;
    }

    public boolean a() {
        return j(false) > 0;
    }

    public boolean b() {
        return this.f795c < this.f796d.size() - 1;
    }

    public boolean c() {
        return this.f795c == this.f796d.size() - 1 && this.f796d.get(this.f795c).f823a;
    }

    public boolean d() {
        return this.f795c > 0;
    }

    public boolean e() {
        if (this.f796d.size() <= 1) {
            return false;
        }
        this.f796d.clear();
        this.f796d.add(this.f796d.get(0));
        this.f795c = 0;
        return true;
    }

    public int f() {
        return this.f796d.get(this.f795c).f824b;
    }

    public int g() {
        return this.f793a;
    }

    public float[] h() {
        return this.f796d.get(this.f795c).f825c;
    }

    public int[] i() {
        int j10 = j(true);
        if (j10 <= 0) {
            return null;
        }
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet(j10);
        int i10 = 0;
        int i11 = 0;
        while (i11 < j10) {
            i11++;
            linkedHashSet.add(Integer.valueOf(this.f796d.get(i11).f824b));
        }
        int[] iArr = new int[linkedHashSet.size()];
        for (Integer num : linkedHashSet) {
            iArr[i10] = num.intValue();
            i10++;
        }
        return iArr;
    }

    public int j(boolean z10) {
        int size = this.f796d.size();
        if (z10 && this.f794b == this.f796d.get(size - 1).f824b) {
            size--;
        }
        return Math.max(0, size - 1);
    }

    public boolean k() {
        return d() || b();
    }

    public boolean l() {
        return Color.alpha(f()) < 255;
    }

    public boolean m() {
        return this.f795c == 0;
    }

    public boolean n() {
        if (this.f795c >= this.f796d.size() - 1) {
            return false;
        }
        this.f795c++;
        return true;
    }

    public boolean o() {
        int i10 = this.f795c;
        if (i10 <= 0) {
            return false;
        }
        this.f796d.remove(i10);
        this.f795c--;
        return true;
    }

    public boolean p() {
        if (!c()) {
            return false;
        }
        this.f796d.get(this.f795c).f823a = false;
        return true;
    }

    public boolean q(int[] iArr) {
        if (Arrays.equals(this.f797e, iArr)) {
            return false;
        }
        this.f797e = iArr;
        return true;
    }

    public boolean r(int i10, boolean z10) {
        if (f() != i10) {
            if (this.f796d.get(this.f795c).f823a) {
                this.f796d.get(this.f795c).b(i10);
                int i11 = this.f795c;
                if (i11 > 0 && this.f796d.get(i11 - 1).equals(this.f796d.get(this.f795c)) && !this.f796d.get(this.f795c - 1).f823a) {
                    this.f796d.remove(this.f795c);
                    this.f795c--;
                }
            } else {
                int size = this.f796d.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (this.f796d.get(size).f823a && this.f796d.get(size).f824b == i10) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (size == -1) {
                    List<c> list = this.f796d;
                    if (list.get(list.size() - 1).f823a) {
                        size = this.f796d.size() - 1;
                    }
                }
                if (size != -1) {
                    this.f795c = size;
                    this.f796d.get(size).b(i10);
                } else {
                    this.f795c = this.f796d.size();
                    this.f796d.add(new c(i10, this.f796d.get(this.f795c)));
                }
            }
            if (z10) {
                this.f794b = i10;
            }
            return true;
        } else if (!z10 || this.f794b == i10) {
            return false;
        } else {
            this.f794b = i10;
            return true;
        }
    }

    public boolean s(int i10, float f10, boolean z10) {
        float[] fArr = this.f796d.get(this.f795c).f825c;
        float f11 = fArr[i10];
        if (f11 != f10) {
            fArr[i10] = f10;
            int HSVToColor = Color.HSVToColor(Color.alpha(f()), fArr);
            fArr[i10] = f11;
            if (this.f796d.get(this.f795c).f823a) {
                this.f796d.get(this.f795c).a(i10, f10);
                int i11 = this.f795c;
                if (i11 > 0 && this.f796d.get(i11 - 1).equals(this.f796d.get(this.f795c)) && !this.f796d.get(this.f795c - 1).f823a) {
                    this.f796d.remove(this.f795c);
                    this.f795c--;
                }
            } else {
                int size = this.f796d.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (this.f796d.get(size).f823a && this.f796d.get(size).f824b == HSVToColor) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (size == -1) {
                    List<c> list = this.f796d;
                    if (list.get(list.size() - 1).f823a) {
                        size = this.f796d.size() - 1;
                    }
                }
                if (size != -1) {
                    this.f795c = size;
                    this.f796d.get(size).a(i10, f10);
                } else {
                    this.f795c = this.f796d.size();
                    c cVar = new c(HSVToColor, this.f796d.get(this.f795c));
                    this.f796d.add(cVar);
                    cVar.a(i10, f10);
                }
            }
            if (z10) {
                this.f794b = HSVToColor;
            }
            return true;
        }
        int f12 = f();
        if (!z10 || this.f794b == f12) {
            return false;
        }
        this.f794b = f12;
        return true;
    }

    public boolean t() {
        int i10 = this.f795c;
        if (i10 <= 0) {
            return false;
        }
        this.f795c = i10 - 1;
        return true;
    }
}
