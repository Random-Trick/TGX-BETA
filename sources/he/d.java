package he;

import ce.j0;
import gd.w;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import me.vkryl.leveldb.LevelDB;
import oc.v0;
import org.thunderdog.challegram.R;
import zd.ya;

public class d implements j0.a {
    public static d U;
    public Boolean M;
    public int N;
    public long O;
    public String P;
    public String Q;
    public boolean R;
    public final lb.d<a> S = new lb.d<>(true);
    public long T;
    public int f13813a;
    public Boolean f13814b;
    public Boolean f13815c;

    public interface a {
        void d(boolean z10);
    }

    public d() {
        i c22 = i.c2();
        this.f13813a = c22.V0("pc_mode", 0);
        this.N = c22.V0("pc_al_mode", 0);
        this.Q = c22.L1("pc_finger_hash", null);
        if (this.f13813a != 0) {
            this.R = c22.o0("pc_locked", false);
            if (this.N != 0) {
                this.O = c22.e1("pc_time", 0L);
                d();
            }
            this.P = c22.L1("pc_hash", null);
        }
        j0.d(this);
    }

    public static boolean A(String str) {
        return str != null && str.length() >= 1;
    }

    public static boolean B(String str) {
        return str != null && str.length() >= 4;
    }

    public static boolean C(String str) {
        return str != null && str.length() == 4;
    }

    public static boolean c(int i10) {
        return i10 == 1 || i10 == 3 || i10 == 4;
    }

    public static String n(int i10, int i11) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return null;
                        }
                        if (i11 == 1) {
                            return w.i1(R.string.UnlockByFingerprint);
                        }
                        if (i11 == 2) {
                            return w.i1(R.string.TouchYourSensor);
                        }
                        if (i11 != 3) {
                            return null;
                        }
                        return w.i1(R.string.ConfirmYourFingerprint);
                    } else if (i11 == 1) {
                        return w.i1(R.string.UnlockByGesture);
                    } else {
                        if (i11 == 2) {
                            return w.i1(R.string.ChooseYourGesture);
                        }
                        if (i11 != 3) {
                            return null;
                        }
                        return w.i1(R.string.ConfirmYourGesture);
                    }
                } else if (i11 == 1) {
                    return w.i1(R.string.UnlockByPattern);
                } else {
                    if (i11 == 2) {
                        return w.i1(R.string.ChooseYourPattern);
                    }
                    if (i11 != 3) {
                        return null;
                    }
                    return w.i1(R.string.ConfirmYourPattern);
                }
            } else if (i11 == 1) {
                return w.i1(R.string.UnlockByPassword);
            } else {
                if (i11 == 2) {
                    return w.i1(R.string.ChooseYourPassword);
                }
                if (i11 != 3) {
                    return null;
                }
                return w.i1(R.string.ConfirmYourPassword);
            }
        } else if (i11 == 1) {
            return w.i1(R.string.UnlockByPIN);
        } else {
            if (i11 == 2) {
                return w.i1(R.string.ChooseYourPIN);
            }
            if (i11 != 3) {
                return null;
            }
            return w.i1(R.string.ConfirmYourPIN);
        }
    }

    public static String t(int i10) {
        if (i10 == 0) {
            return w.i1(R.string.PasscodeSettingDisabled);
        }
        if (i10 == 1) {
            return w.i1(R.string.PasscodePIN);
        }
        if (i10 == 2) {
            return w.i1(R.string.login_Password);
        }
        if (i10 == 3) {
            return w.i1(R.string.PasscodePattern);
        }
        if (i10 != 4) {
            return i10 != 5 ? "ERROR" : w.i1(R.string.PasscodeFingerprint);
        }
        return w.i1(R.string.PasscodeGesture);
    }

    public static String u(String str) {
        if (str == null) {
            return null;
        }
        return v0.J2(v0.J2(str + "VGhpcyBpcyB0aGUgbW9yZSBzZWN1cmUgc2FsdCBvZiBUZWxlZ3JhbSBY"));
    }

    public static String v(String str) {
        if (str == null) {
            return null;
        }
        return v0.Q1(v0.Q1(str + "VGhpcyBpcyBhIHZlcnkgc2VjdXJlIHNhbHQgb2YgQ2hhbGxlZ3JhbS4="));
    }

    public static d w() {
        if (U == null) {
            U = new d();
        }
        return U;
    }

    public static boolean z(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5;
    }

    public boolean D() {
        if (this.f13814b == null) {
            this.f13814b = Boolean.valueOf(i.c2().o0("pc_visible", true));
        }
        return this.f13814b.booleanValue();
    }

    public boolean E() {
        return this.Q != null;
    }

    public final void F(boolean z10) {
        Iterator<a> it = this.S.iterator();
        while (it.hasNext()) {
            it.next().d(z10);
        }
    }

    public void G(boolean z10) {
        this.f13815c = Boolean.valueOf(z10);
        if (z10) {
            i.c2().s3("pc_allow_ss", true);
        } else {
            i.c2().F3("pc_allow_ss");
        }
    }

    public void H(int i10) {
        if (this.N != i10) {
            this.N = i10;
            this.O = i10 == 0 ? 0L : System.currentTimeMillis() + q();
            LevelDB W = i.c2().W();
            W.putInt("pc_al_mode", i10);
            W.putLong("pc_time", this.O);
            W.apply();
            j0.f();
        }
    }

    public void I(boolean z10) {
        this.M = Boolean.valueOf(z10);
        if (z10) {
            i.c2().s3("pc_notifications", z10);
        } else {
            i.c2().F3("pc_notifications");
        }
    }

    public void J(int i10) {
        M(5, String.valueOf(i10));
    }

    public void K() {
        M(4, "");
    }

    public final void L(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            LevelDB W = i.c2().W();
            W.putBoolean("pc_locked", z10);
            if (!z10) {
                long currentTimeMillis = System.currentTimeMillis() + q();
                this.O = currentTimeMillis;
                W.putLong("pc_time", currentTimeMillis);
            }
            W.apply();
            j0.f();
            F(z10);
        }
    }

    public void M(int i10, String str) {
        boolean z10 = this.f13813a == 0 && i10 != 0;
        this.f13813a = i10;
        this.P = v(str);
        LevelDB W = i.c2().W();
        W.putInt("pc_mode", i10);
        String str2 = this.P;
        if (str2 != null) {
            W.putString("pc_hash", str2);
        } else {
            W.remove("pc_hash");
        }
        W.apply();
        if (z10) {
            ya.o1().o2();
        }
    }

    public void N(String str) {
        M(2, str);
    }

    public void O(String str) {
        M(3, str);
    }

    public void P(String str) {
        M(1, str);
    }

    public void Q(boolean z10) {
        this.f13814b = Boolean.valueOf(z10);
        i.c2().s3("pc_visible", z10);
    }

    public boolean R() {
        return !b() && (y() || !(this.N == 0 || this.f13813a == 0));
    }

    public boolean S() {
        L(!this.R);
        return this.R;
    }

    public void T(boolean z10) {
        if (this.N != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!z10) {
                long j10 = this.T;
                if (j10 != 0 && currentTimeMillis - j10 < 10000) {
                    return;
                }
            }
            this.T = currentTimeMillis;
            this.O = currentTimeMillis + q();
            i.c2().w3("pc_time", this.O);
            if (z10) {
                d();
            }
        }
    }

    public void U() {
        L(false);
    }

    public boolean V(int i10) {
        if (!e(i10)) {
            return false;
        }
        L(false);
        return true;
    }

    public boolean W(String str) {
        if (!g(str)) {
            return false;
        }
        L(false);
        return true;
    }

    public boolean X(String str) {
        if (!h(str)) {
            return false;
        }
        L(false);
        return true;
    }

    public boolean Y(String str) {
        if (!i(str)) {
            return false;
        }
        L(false);
        return true;
    }

    public void a(a aVar) {
        this.S.add(aVar);
    }

    public boolean b() {
        if (this.f13815c == null) {
            this.f13815c = Boolean.valueOf(i.c2().o0("pc_allow_ss", false));
        }
        return this.f13815c.booleanValue();
    }

    public boolean d() {
        if (this.N == 0 || this.O <= 0 || System.currentTimeMillis() < this.O) {
            return false;
        }
        L(true);
        return true;
    }

    public boolean e(int i10) {
        if (this.f13813a == 5) {
            String str = this.P;
            return str != null && str.equals(v(String.valueOf(i10)));
        }
        String str2 = this.Q;
        return str2 != null && str2.equals(v(String.valueOf(i10)));
    }

    @Override
    public void f(int i10) {
        if (i10 == 1) {
            T(true);
        }
    }

    public boolean g(String str) {
        return this.P != null && str != null && str.length() >= 1 && this.P.equals(v(str));
    }

    public boolean h(String str) {
        return this.P != null && str != null && str.length() >= 4 && this.P.equals(v(str));
    }

    public boolean i(String str) {
        return this.P != null && str != null && str.length() == 4 && this.P.equals(v(str));
    }

    public void j() {
        if (this.f13813a != 0) {
            this.f13813a = 0;
            i.c2().u3("pc_mode", 0);
            L(false);
        }
    }

    public void k() {
        if (this.Q != null) {
            this.Q = null;
            i.c2().F3("pc_finger_hash");
        }
    }

    public boolean l() {
        if (this.M == null) {
            this.M = Boolean.valueOf(i.c2().o0("pc_notifications", false));
        }
        return this.M.booleanValue();
    }

    public void m(int i10) {
        this.Q = v(String.valueOf(i10));
        i.c2().z3("pc_finger_hash", this.Q);
    }

    public int o() {
        return this.N;
    }

    public String[] p() {
        return new String[]{w.i1(R.string.AutoLockDisabled), w.o2(R.string.inXMinutes, 1L), w.o2(R.string.inXMinutes, 5L), w.o2(R.string.inXHours, 1L), w.o2(R.string.inXHours, 5L), w.i1(R.string.AutoLockInstant)};
    }

    public long q() {
        int i10 = this.N;
        if (i10 == 1) {
            return TimeUnit.MINUTES.toMillis(1L);
        }
        if (i10 == 2) {
            return TimeUnit.MINUTES.toMillis(5L);
        }
        if (i10 == 3) {
            return TimeUnit.HOURS.toMillis(1L);
        }
        if (i10 == 4) {
            return TimeUnit.HOURS.toMillis(5L);
        }
        if (i10 != 5) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.toMillis(170L);
    }

    public int r() {
        return this.f13813a;
    }

    public String s() {
        return t(this.f13813a);
    }

    public boolean x() {
        return this.f13813a != 0;
    }

    public boolean y() {
        return x() && (d() || this.R);
    }
}
