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
        C4868i c2 = C4868i.m24726c2();
        this.f16604a = c2.m24779V0("pc_mode", 0);
        this.f16597N = c2.m24779V0("pc_al_mode", 0);
        this.f16600Q = c2.m24848L1("pc_finger_hash", null);
        if (this.f16604a != 0) {
            this.f16601R = c2.m24632o0("pc_locked", false);
            if (this.f16597N != 0) {
                this.f16598O = c2.m24711e1("pc_time", 0L);
                m24952d();
            }
            this.f16599P = c2.m24848L1("pc_hash", null);
        }
        C1379j0.m37335d(this);
    }

    public static boolean m24980A(String str) {
        return str != null && str.length() >= 1;
    }

    public static boolean m24979B(String str) {
        return str != null && str.length() >= 4;
    }

    public static boolean m24978C(String str) {
        return str != null && str.length() == 4;
    }

    public static boolean m24953c(int i) {
        return i == 1 || i == 3 || i == 4;
    }

    public static String m24943n(int i, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        if (i2 == 1) {
                            return C4403w.m27869i1(R.string.UnlockByFingerprint);
                        }
                        if (i2 == 2) {
                            return C4403w.m27869i1(R.string.TouchYourSensor);
                        }
                        if (i2 != 3) {
                            return null;
                        }
                        return C4403w.m27869i1(R.string.ConfirmYourFingerprint);
                    } else if (i2 == 1) {
                        return C4403w.m27869i1(R.string.UnlockByGesture);
                    } else {
                        if (i2 == 2) {
                            return C4403w.m27869i1(R.string.ChooseYourGesture);
                        }
                        if (i2 != 3) {
                            return null;
                        }
                        return C4403w.m27869i1(R.string.ConfirmYourGesture);
                    }
                } else if (i2 == 1) {
                    return C4403w.m27869i1(R.string.UnlockByPattern);
                } else {
                    if (i2 == 2) {
                        return C4403w.m27869i1(R.string.ChooseYourPattern);
                    }
                    if (i2 != 3) {
                        return null;
                    }
                    return C4403w.m27869i1(R.string.ConfirmYourPattern);
                }
            } else if (i2 == 1) {
                return C4403w.m27869i1(R.string.UnlockByPassword);
            } else {
                if (i2 == 2) {
                    return C4403w.m27869i1(R.string.ChooseYourPassword);
                }
                if (i2 != 3) {
                    return null;
                }
                return C4403w.m27869i1(R.string.ConfirmYourPassword);
            }
        } else if (i2 == 1) {
            return C4403w.m27869i1(R.string.UnlockByPIN);
        } else {
            if (i2 == 2) {
                return C4403w.m27869i1(R.string.ChooseYourPIN);
            }
            if (i2 != 3) {
                return null;
            }
            return C4403w.m27869i1(R.string.ConfirmYourPIN);
        }
    }

    public static String m24937t(int i) {
        if (i == 0) {
            return C4403w.m27869i1(R.string.PasscodeSettingDisabled);
        }
        if (i == 1) {
            return C4403w.m27869i1(R.string.PasscodePIN);
        }
        if (i == 2) {
            return C4403w.m27869i1(R.string.login_Password);
        }
        if (i == 3) {
            return C4403w.m27869i1(R.string.PasscodePattern);
        }
        if (i != 4) {
            return i != 5 ? "ERROR" : C4403w.m27869i1(R.string.PasscodeFingerprint);
        }
        return C4403w.m27869i1(R.string.PasscodeGesture);
    }

    public static String m24936u(String str) {
        if (str == null) {
            return null;
        }
        return C7389v0.m16719J2(C7389v0.m16719J2(str + "VGhpcyBpcyB0aGUgbW9yZSBzZWN1cmUgc2FsdCBvZiBUZWxlZ3JhbSBY"));
    }

    public static String m24935v(String str) {
        if (str == null) {
            return null;
        }
        return C7389v0.m16692Q1(C7389v0.m16692Q1(str + "VGhpcyBpcyBhIHZlcnkgc2VjdXJlIHNhbHQgb2YgQ2hhbGxlZ3JhbS4="));
    }

    public static C4862d m24934w() {
        if (f16595U == null) {
            f16595U = new C4862d();
        }
        return f16595U;
    }

    public static boolean m24931z(int i) {
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    public boolean m24977D() {
        if (this.f16605b == null) {
            this.f16605b = Boolean.valueOf(C4868i.m24726c2().m24632o0("pc_visible", true));
        }
        return this.f16605b.booleanValue();
    }

    public boolean m24976E() {
        return this.f16600Q != null;
    }

    public final void m24975F(boolean z) {
        Iterator<AbstractC4863a> it = this.f16602S.iterator();
        while (it.hasNext()) {
            it.next().mo3143d(z);
        }
    }

    public void m24974G(boolean z) {
        this.f16606c = Boolean.valueOf(z);
        if (z) {
            C4868i.m24726c2().m24597s3("pc_allow_ss", true);
        } else {
            C4868i.m24726c2().m24888F3("pc_allow_ss");
        }
    }

    public void m24973H(int i) {
        if (this.f16597N != i) {
            this.f16597N = i;
            this.f16598O = i == 0 ? 0L : System.currentTimeMillis() + m24940q();
            LevelDB W = C4868i.m24726c2().m24773W();
            W.putInt("pc_al_mode", i);
            W.putLong("pc_time", this.f16598O);
            W.apply();
            C1379j0.m37331f();
        }
    }

    public void m24972I(boolean z) {
        this.f16596M = Boolean.valueOf(z);
        if (z) {
            C4868i.m24726c2().m24597s3("pc_notifications", z);
        } else {
            C4868i.m24726c2().m24888F3("pc_notifications");
        }
    }

    public void m24971J(int i) {
        m24968M(5, String.valueOf(i));
    }

    public void m24970K() {
        m24968M(4, "");
    }

    public final void m24969L(boolean z) {
        if (this.f16601R != z) {
            this.f16601R = z;
            LevelDB W = C4868i.m24726c2().m24773W();
            W.putBoolean("pc_locked", z);
            if (!z) {
                long currentTimeMillis = System.currentTimeMillis() + m24940q();
                this.f16598O = currentTimeMillis;
                W.putLong("pc_time", currentTimeMillis);
            }
            W.apply();
            C1379j0.m37331f();
            m24975F(z);
        }
    }

    public void m24968M(int i, String str) {
        boolean z = this.f16604a == 0 && i != 0;
        this.f16604a = i;
        this.f16599P = m24935v(str);
        LevelDB W = C4868i.m24726c2().m24773W();
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

    public void m24967N(String str) {
        m24968M(2, str);
    }

    public void m24966O(String str) {
        m24968M(3, str);
    }

    public void m24965P(String str) {
        m24968M(1, str);
    }

    public void m24964Q(boolean z) {
        this.f16605b = Boolean.valueOf(z);
        C4868i.m24726c2().m24597s3("pc_visible", z);
    }

    public boolean m24963R() {
        return !m24954b() && (m24932y() || !(this.f16597N == 0 || this.f16604a == 0));
    }

    public boolean m24962S() {
        m24969L(!this.f16601R);
        return this.f16601R;
    }

    public void m24961T(boolean z) {
        if (this.f16597N != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!z) {
                long j = this.f16603T;
                if (j != 0 && currentTimeMillis - j < 10000) {
                    return;
                }
            }
            this.f16603T = currentTimeMillis;
            this.f16598O = currentTimeMillis + m24940q();
            C4868i.m24726c2().m24566w3("pc_time", this.f16598O);
            if (z) {
                m24952d();
            }
        }
    }

    public void m24960U() {
        m24969L(false);
    }

    public boolean m24959V(int i) {
        if (!m24951e(i)) {
            return false;
        }
        m24969L(false);
        return true;
    }

    public boolean m24958W(String str) {
        if (!m24950f(str)) {
            return false;
        }
        m24969L(false);
        return true;
    }

    public boolean m24957X(String str) {
        if (!m24949g(str)) {
            return false;
        }
        m24969L(false);
        return true;
    }

    public boolean m24956Y(String str) {
        if (!m24948i(str)) {
            return false;
        }
        m24969L(false);
        return true;
    }

    public void m24955a(AbstractC4863a aVar) {
        this.f16602S.add(aVar);
    }

    public boolean m24954b() {
        if (this.f16606c == null) {
            this.f16606c = Boolean.valueOf(C4868i.m24726c2().m24632o0("pc_allow_ss", false));
        }
        return this.f16606c.booleanValue();
    }

    public boolean m24952d() {
        if (this.f16597N == 0 || this.f16598O <= 0 || System.currentTimeMillis() < this.f16598O) {
            return false;
        }
        m24969L(true);
        return true;
    }

    public boolean m24951e(int i) {
        if (this.f16604a == 5) {
            String str = this.f16599P;
            return str != null && str.equals(m24935v(String.valueOf(i)));
        }
        String str2 = this.f16600Q;
        return str2 != null && str2.equals(m24935v(String.valueOf(i)));
    }

    public boolean m24950f(String str) {
        return this.f16599P != null && str != null && str.length() >= 1 && this.f16599P.equals(m24935v(str));
    }

    public boolean m24949g(String str) {
        return this.f16599P != null && str != null && str.length() >= 4 && this.f16599P.equals(m24935v(str));
    }

    @Override
    public void mo1641h(int i) {
        if (i == 1) {
            m24961T(true);
        }
    }

    public boolean m24948i(String str) {
        return this.f16599P != null && str != null && str.length() == 4 && this.f16599P.equals(m24935v(str));
    }

    public void m24947j() {
        if (this.f16604a != 0) {
            this.f16604a = 0;
            C4868i.m24726c2().m24581u3("pc_mode", 0);
            m24969L(false);
        }
    }

    public void m24946k() {
        if (this.f16600Q != null) {
            this.f16600Q = null;
            C4868i.m24726c2().m24888F3("pc_finger_hash");
        }
    }

    public boolean m24945l() {
        if (this.f16596M == null) {
            this.f16596M = Boolean.valueOf(C4868i.m24726c2().m24632o0("pc_notifications", false));
        }
        return this.f16596M.booleanValue();
    }

    public void m24944m(int i) {
        this.f16600Q = m24935v(String.valueOf(i));
        C4868i.m24726c2().m24545z3("pc_finger_hash", this.f16600Q);
    }

    public int m24942o() {
        return this.f16597N;
    }

    public String[] m24941p() {
        return new String[]{C4403w.m27869i1(R.string.AutoLockDisabled), C4403w.m27844o2(R.string.inXMinutes, 1L), C4403w.m27844o2(R.string.inXMinutes, 5L), C4403w.m27844o2(R.string.inXHours, 1L), C4403w.m27844o2(R.string.inXHours, 5L), C4403w.m27869i1(R.string.AutoLockInstant)};
    }

    public long m24940q() {
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

    public int m24939r() {
        return this.f16604a;
    }

    public String m24938s() {
        return m24937t(this.f16604a);
    }

    public boolean m24933x() {
        return this.f16604a != 0;
    }

    public boolean m24932y() {
        return m24933x() && (m24952d() || this.f16601R);
    }
}
