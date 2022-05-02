package p270t3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p020b5.C1216l0;
import p073f4.C4260a;
import p147k4.C6061e;
import p147k4.C6070j;

public final class C8969o {
    public static final Pattern f28856c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int f28857a = -1;
    public int f28858b = -1;

    public boolean m10804a() {
        return (this.f28857a == -1 || this.f28858b == -1) ? false : true;
    }

    public final boolean m10803b(String str) {
        Matcher matcher = f28856c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt((String) C1216l0.m37971j(matcher.group(1)), 16);
            int parseInt2 = Integer.parseInt((String) C1216l0.m37971j(matcher.group(2)), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f28857a = parseInt;
            this.f28858b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean m10802c(C4260a aVar) {
        for (int i = 0; i < aVar.m28329d(); i++) {
            C4260a.AbstractC4262b c = aVar.m28330c(i);
            if (c instanceof C6061e) {
                C6061e eVar = (C6061e) c;
                if ("iTunSMPB".equals(eVar.f19278c) && m10803b(eVar.f19276M)) {
                    return true;
                }
            } else if (c instanceof C6070j) {
                C6070j jVar = (C6070j) c;
                if ("com.apple.iTunes".equals(jVar.f19291b) && "iTunSMPB".equals(jVar.f19292c) && m10803b(jVar.f19290M)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean m10801d(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f28857a = i2;
        this.f28858b = i3;
        return true;
    }
}
