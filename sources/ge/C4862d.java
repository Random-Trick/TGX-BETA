package ge;

import be.C1379j0;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import me.vkryl.leveldb.LevelDB;
import nc.C7389v0;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p154kb.C6227d;
import p350yd.C10536ab;

public class C4862d implements C1379j0.AbstractC1380a {
    public static C4862d f16595U;
    public Boolean f16596M;
    public int f16597N;
    public long f16598O;
    public String f16599P;
    public String f16600Q;
    public boolean f16601R;
    public final C6227d<AbstractC4863a> f16602S = new C6227d<>(true);
    public long f16603T;
    public int f16604a;
    public Boolean f16605b;
    public Boolean f16606c;

    public interface AbstractC4863a {
        void mo3143d(boolean z);
    }

    public C4862d() {
        C4868i c2 = C4868i.m24727c2();
        this.f16604a = c2.m24780V0("pc_mode", 0);
        this.f16597N = c2.m24780V0("pc_al_mode", 0);
        this.f16600Q = c2.m24849L1("pc_finger_hash", null);
        if (this.f16604a != 0) {
            this.f16601R = c2.m24633o0("pc_locked", false);
            if (this.f16597N != 0) {
                this.f16598O = c2.m24712e1("pc_time", 0L);
                m24953d();
            }
            this.f16599P = c2.m24849L1("pc_hash", null);
        }
        C1379j0.m37338d(this);
    }

    public static boolean m24981A(String str) {
        return str != null && str.length() >= 1;
    }

    public static boolean m24980B(String str) {
        return str != null && str.length() >= 4;
    }

    public static boolean m24979C(String str) {
        return str != null && str.length() == 4;
    }

    public static boolean m24954c(int i) {
        return i == 1 || i == 3 || i == 4;
    }

    public static String m24944n(int i, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        if (i2 == 1) {
                            return C4403w.m27871i1(R.string.UnlockByFingerprint);
                        }
                        if (i2 == 2) {
                            return C4403w.m27871i1(R.string.TouchYourSensor);
                        }
                        if (i2 != 3) {
                            return null;
                        }
                        return C4403w.m27871i1(R.string.ConfirmYourFingerprint);
                    } else if (i2 == 1) {
                        return C4403w.m27871i1(R.string.UnlockByGesture);
                    } else {
                        if (i2 == 2) {
                            return C4403w.m27871i1(R.string.ChooseYourGesture);
                        }
                        if (i2 != 3) {
                            return null;
                        }
                        return C4403w.m27871i1(R.string.ConfirmYourGesture);
                    }
                } else if (i2 == 1) {
                    return C4403w.m27871i1(R.string.UnlockByPattern);
                } else {
                    if (i2 == 2) {
                        return C4403w.m27871i1(R.string.ChooseYourPattern);
                    }
                    if (i2 != 3) {
                        return null;
                    }
                    return C4403w.m27871i1(R.string.ConfirmYourPattern);
                }
            } else if (i2 == 1) {
                return C4403w.m27871i1(R.string.UnlockByPassword);
            } else {
                if (i2 == 2) {
                    return C4403w.m27871i1(R.string.ChooseYourPassword);
                }
                if (i2 != 3) {
                    return null;
                }
                return C4403w.m27871i1(R.string.ConfirmYourPassword);
            }
        } else if (i2 == 1) {
            return C4403w.m27871i1(R.string.UnlockByPIN);
        } else {
            if (i2 == 2) {
                return C4403w.m27871i1(R.string.ChooseYourPIN);
            }
            if (i2 != 3) {
                return null;
            }
            return C4403w.m27871i1(R.string.ConfirmYourPIN);
        }
    }

    public static String m24938t(int i) {
        if (i == 0) {
            return C4403w.m27871i1(R.string.PasscodeSettingDisabled);
        }
        if (i == 1) {
            return C4403w.m27871i1(R.string.PasscodePIN);
        }
        if (i == 2) {
            return C4403w.m27871i1(R.string.login_Password);
        }
        if (i == 3) {
            return C4403w.m27871i1(R.string.PasscodePattern);
        }
        if (i != 4) {
            return i != 5 ? "ERROR" : C4403w.m27871i1(R.string.PasscodeFingerprint);
        }
        return C4403w.m27871i1(R.string.PasscodeGesture);
    }

    public static String m24937u(String str) {
        if (str == null) {
            return null;
        }
        return C7389v0.m16719J2(C7389v0.m16719J2(str + "VGhpcyBpcyB0aGUgbW9yZSBzZWN1cmUgc2FsdCBvZiBUZWxlZ3JhbSBY"));
    }

    public static String m24936v(String str) {
        if (str == null) {
            return null;
        }
        return C7389v0.m16692Q1(C7389v0.m16692Q1(str + "VGhpcyBpcyBhIHZlcnkgc2VjdXJlIHNhbHQgb2YgQ2hhbGxlZ3JhbS4="));
    }

    public static C4862d m24935w() {
        if (f16595U == null) {
            f16595U = new C4862d();
        }
        return f16595U;
    }

    public static boolean m24932z(int i) {
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    public boolean m24978D() {
        if (this.f16605b == null) {
            this.f16605b = Boolean.valueOf(C4868i.m24727c2().m24633o0("pc_visible", true));
        }
        return this.f16605b.booleanValue();
    }

    public boolean m24977E() {
        return this.f16600Q != null;
    }

    public final void m24976F(boolean z) {
        Iterator<AbstractC4863a> it = this.f16602S.iterator();
        while (it.hasNext()) {
            it.next().mo3143d(z);
        }
    }

    public void m24975G(boolean z) {
        this.f16606c = Boolean.valueOf(z);
        if (z) {
            C4868i.m24727c2().m24598s3("pc_allow_ss", true);
        } else {
            C4868i.m24727c2().m24889F3("pc_allow_ss");
        }
    }

    public void m24974H(int i) {
        if (this.f16597N != i) {
            this.f16597N = i;
            this.f16598O = i == 0 ? 0L : System.currentTimeMillis() + m24941q();
            LevelDB W = C4868i.m24727c2().m24774W();
            W.putInt("pc_al_mode", i);
            W.putLong("pc_time", this.f16598O);
            W.apply();
            C1379j0.m37334f();
        }
    }

    public void m24973I(boolean z) {
        this.f16596M = Boolean.valueOf(z);
        if (z) {
            C4868i.m24727c2().m24598s3("pc_notifications", z);
        } else {
            C4868i.m24727c2().m24889F3("pc_notifications");
        }
    }

    public void m24972J(int i) {
        m24969M(5, String.valueOf(i));
    }

    public void m24971K() {
        m24969M(4, "");
    }

    public final void m24970L(boolean z) {
        if (this.f16601R != z) {
            this.f16601R = z;
            LevelDB W = C4868i.m24727c2().m24774W();
            W.putBoolean("pc_locked", z);
            if (!z) {
                long currentTimeMillis = System.currentTimeMillis() + m24941q();
                this.f16598O = currentTimeMillis;
                W.putLong("pc_time", currentTimeMillis);
            }
            W.apply();
            C1379j0.m37334f();
            m24976F(z);
        }
    }

    public void m24969M(int i, String str) {
        boolean z = this.f16604a == 0 && i != 0;
        this.f16604a = i;
        this.f16599P = m24936v(str);
        LevelDB W = C4868i.m24727c2().m24774W();
        W.putInt("pc_mode", i);
        String str2 = this.f16599P;
        if (str2 != null) {
            W.putString("pc_hash", str2);
        } else {
            W.remove("pc_hash");
        }
        W.apply();
        if (z) {
            C10536ab.m4667o1().m4666o2();
        }
    }

    public void m24968N(String str) {
        m24969M(2, str);
    }

    public void m24967O(String str) {
        m24969M(3, str);
    }

    public void m24966P(String str) {
        m24969M(1, str);
    }

    public void m24965Q(boolean z) {
        this.f16605b = Boolean.valueOf(z);
        C4868i.m24727c2().m24598s3("pc_visible", z);
    }

    public boolean m24964R() {
        return !m24955b() && (m24933y() || !(this.f16597N == 0 || this.f16604a == 0));
    }

    public boolean m24963S() {
        m24970L(!this.f16601R);
        return this.f16601R;
    }

    public void m24962T(boolean z) {
        if (this.f16597N != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!z) {
                long j = this.f16603T;
                if (j != 0 && currentTimeMillis - j < 10000) {
                    return;
                }
            }
            this.f16603T = currentTimeMillis;
            this.f16598O = currentTimeMillis + m24941q();
            C4868i.m24727c2().m24567w3("pc_time", this.f16598O);
            if (z) {
                m24953d();
            }
        }
    }

    public void m24961U() {
        m24970L(false);
    }

    public boolean m24960V(int i) {
        if (!m24952e(i)) {
            return false;
        }
        m24970L(false);
        return true;
    }

    public boolean m24959W(String str) {
        if (!m24951f(str)) {
            return false;
        }
        m24970L(false);
        return true;
    }

    public boolean m24958X(String str) {
        if (!m24950g(str)) {
            return false;
        }
        m24970L(false);
        return true;
    }

    public boolean m24957Y(String str) {
        if (!m24949i(str)) {
            return false;
        }
        m24970L(false);
        return true;
    }

    public void m24956a(AbstractC4863a aVar) {
        this.f16602S.add(aVar);
    }

    public boolean m24955b() {
        if (this.f16606c == null) {
            this.f16606c = Boolean.valueOf(C4868i.m24727c2().m24633o0("pc_allow_ss", false));
        }
        return this.f16606c.booleanValue();
    }

    public boolean m24953d() {
        if (this.f16597N == 0 || this.f16598O <= 0 || System.currentTimeMillis() < this.f16598O) {
            return false;
        }
        m24970L(true);
        return true;
    }

    public boolean m24952e(int i) {
        if (this.f16604a == 5) {
            String str = this.f16599P;
            return str != null && str.equals(m24936v(String.valueOf(i)));
        }
        String str2 = this.f16600Q;
        return str2 != null && str2.equals(m24936v(String.valueOf(i)));
    }

    public boolean m24951f(String str) {
        return this.f16599P != null && str != null && str.length() >= 1 && this.f16599P.equals(m24936v(str));
    }

    public boolean m24950g(String str) {
        return this.f16599P != null && str != null && str.length() >= 4 && this.f16599P.equals(m24936v(str));
    }

    @Override
    public void mo1641h(int i) {
        if (i == 1) {
            m24962T(true);
        }
    }

    public boolean m24949i(String str) {
        return this.f16599P != null && str != null && str.length() == 4 && this.f16599P.equals(m24936v(str));
    }

    public void m24948j() {
        if (this.f16604a != 0) {
            this.f16604a = 0;
            C4868i.m24727c2().m24582u3("pc_mode", 0);
            m24970L(false);
        }
    }

    public void m24947k() {
        if (this.f16600Q != null) {
            this.f16600Q = null;
            C4868i.m24727c2().m24889F3("pc_finger_hash");
        }
    }

    public boolean m24946l() {
        if (this.f16596M == null) {
            this.f16596M = Boolean.valueOf(C4868i.m24727c2().m24633o0("pc_notifications", false));
        }
        return this.f16596M.booleanValue();
    }

    public void m24945m(int i) {
        this.f16600Q = m24936v(String.valueOf(i));
        C4868i.m24727c2().m24546z3("pc_finger_hash", this.f16600Q);
    }

    public int m24943o() {
        return this.f16597N;
    }

    public String[] m24942p() {
        return new String[]{C4403w.m27871i1(R.string.AutoLockDisabled), C4403w.m27846o2(R.string.inXMinutes, 1L), C4403w.m27846o2(R.string.inXMinutes, 5L), C4403w.m27846o2(R.string.inXHours, 1L), C4403w.m27846o2(R.string.inXHours, 5L), C4403w.m27871i1(R.string.AutoLockInstant)};
    }

    public long m24941q() {
        int i = this.f16597N;
        if (i == 1) {
            return TimeUnit.MINUTES.toMillis(1L);
        }
        if (i == 2) {
            return TimeUnit.MINUTES.toMillis(5L);
        }
        if (i == 3) {
            return TimeUnit.HOURS.toMillis(1L);
        }
        if (i == 4) {
            return TimeUnit.HOURS.toMillis(5L);
        }
        if (i != 5) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.toMillis(170L);
    }

    public int m24940r() {
        return this.f16604a;
    }

    public String m24939s() {
        return m24938t(this.f16604a);
    }

    public boolean m24934x() {
        return this.f16604a != 0;
    }

    public boolean m24933y() {
        return m24934x() && (m24953d() || this.f16601R);
    }
}
