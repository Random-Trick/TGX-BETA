package t3;

import c5.l0;
import f4.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.e;
import k4.j;

public final class o {
    public static final Pattern f22895c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int f22896a = -1;
    public int f22897b = -1;

    public boolean a() {
        return (this.f22896a == -1 || this.f22897b == -1) ? false : true;
    }

    public final boolean b(String str) {
        Matcher matcher = f22895c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) l0.j(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) l0.j(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f22896a = parseInt;
            this.f22897b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean c(a aVar) {
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            a.b c10 = aVar.c(i10);
            if (c10 instanceof e) {
                e eVar = (e) c10;
                if ("iTunSMPB".equals(eVar.f15638c) && b(eVar.M)) {
                    return true;
                }
            } else if (c10 instanceof j) {
                j jVar = (j) c10;
                if ("com.apple.iTunes".equals(jVar.f15648b) && "iTunSMPB".equals(jVar.f15649c) && b(jVar.M)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.f22896a = i11;
        this.f22897b = i12;
        return true;
    }
}
