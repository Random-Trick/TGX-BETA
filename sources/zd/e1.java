package zd;

import android.content.SharedPreferences;
import android.os.Build;
import fd.a;
import he.i;
import org.drinkless.td.libcore.telegram.TdApi;

public class e1 {
    public final int f27420a;
    public final TdApi.NotificationSettingsScope f27421b;
    public Long f27422c;
    public Integer f27423d;
    public Boolean f27424e;
    public String f27425f;
    public String f27426g;
    public String f27427h;
    public boolean f27428i;
    public boolean f27429j;
    public boolean f27430k;
    public Boolean f27431l;
    public Integer f27432m;
    public Integer f27433n;

    public e1(int i10, TdApi.NotificationSettingsScope notificationSettingsScope) {
        this.f27420a = i10;
        this.f27421b = notificationSettingsScope;
    }

    public static String b(TdApi.NotificationSettingsScope notificationSettingsScope) {
        int constructor = notificationSettingsScope.getConstructor();
        if (constructor == 548013448) {
            return "channels";
        }
        if (constructor == 937446759) {
            return "private";
        }
        if (constructor == 1212142067) {
            return "groups";
        }
        throw new RuntimeException();
    }

    public long a() {
        if (this.f27422c == null) {
            long j10 = 0;
            if (Build.VERSION.SDK_INT >= 26) {
                j10 = i.c2().e1(k("channels_version_"), 0L);
            }
            this.f27422c = Long.valueOf(j10);
        }
        return this.f27422c.longValue();
    }

    public int c() {
        if (this.f27432m == null) {
            this.f27432m = Integer.valueOf(i.c2().V0(s("_led"), jb.f27803v0));
        }
        return this.f27432m.intValue();
    }

    public int d() {
        if (this.f27433n == null) {
            this.f27433n = Integer.valueOf(i.c2().V0(s(jb.f27796o0), jb.f27797p0));
        }
        return this.f27433n.intValue();
    }

    public String e() {
        if (!this.f27428i) {
            this.f27425f = i.c2().L1(s("_sounds"), null);
            this.f27428i = true;
        }
        return this.f27425f;
    }

    public String f() {
        if (!this.f27429j) {
            String e10 = e();
            if (!ib.i.i(e10)) {
                e10 = i.c2().L1(s("_sounds_name"), null);
            }
            this.f27426g = e10;
            this.f27429j = true;
        }
        return this.f27426g;
    }

    public String g() {
        if (!this.f27430k) {
            String e10 = e();
            if (!ib.i.i(e10)) {
                e10 = i.c2().L1(s("_sounds_path"), null);
            }
            this.f27427h = e10;
            this.f27430k = true;
        }
        return this.f27427h;
    }

    public int h() {
        if (this.f27423d == null) {
            this.f27423d = Integer.valueOf(i.c2().V0(s("_vibrate"), 0));
        }
        return this.f27423d.intValue();
    }

    public boolean i() {
        if (this.f27424e == null) {
            boolean z10 = false;
            if (a.f11898t && i.c2().o0(s("_vibrate_onlysilent"), false)) {
                z10 = true;
            }
            this.f27424e = Boolean.valueOf(z10);
        }
        return this.f27424e.booleanValue();
    }

    public boolean j() {
        if (this.f27431l == null) {
            this.f27431l = Boolean.valueOf(i.c2().o0(s("_content_preview"), this.f27421b.getConstructor() != 1212142067));
        }
        return this.f27431l.booleanValue();
    }

    public String k(String str) {
        return jb.k1(str + b(this.f27421b), this.f27420a);
    }

    public void l(SharedPreferences.Editor editor) {
        if (Build.VERSION.SDK_INT >= 26) {
            editor.remove(k("channels_version_"));
        }
        editor.remove(s("_sounds_name")).remove(s("_sounds_name")).remove(s("_vibrate_onlysilent")).remove(s("_vibrate")).remove(s(jb.f27796o0)).remove(s("_led"));
        this.f27422c = null;
        this.f27423d = null;
        this.f27424e = null;
        this.f27427h = null;
        this.f27426g = null;
        this.f27425f = null;
        this.f27430k = false;
        this.f27429j = false;
        this.f27428i = false;
        this.f27432m = null;
    }

    public void m(long j10) {
        this.f27422c = Long.valueOf(j10);
    }

    public void n(int i10) {
        this.f27432m = Integer.valueOf(i10);
    }

    public void o(boolean z10) {
        this.f27431l = Boolean.valueOf(z10);
    }

    public void p(int i10) {
        this.f27433n = Integer.valueOf(i10);
    }

    public void q(String str, String str2, String str3) {
        this.f27425f = str;
        this.f27428i = true;
        this.f27426g = str2;
        this.f27429j = true;
        this.f27427h = str3;
        this.f27430k = true;
    }

    public void r(int i10, boolean z10) {
        this.f27423d = Integer.valueOf(i10);
        if (a.f11898t) {
            this.f27424e = Boolean.valueOf(z10);
        }
    }

    public String s(String str) {
        return jb.k1(b(this.f27421b) + str, this.f27420a);
    }
}
