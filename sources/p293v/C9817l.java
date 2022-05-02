package p293v;

import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p336y.AbstractC10231g2;
import p336y.AbstractC10311w1;
import p336y.C10226f2;

public class C9817l implements AbstractC10311w1 {
    public static final C10226f2 f32084a = m6807a();
    public static final C10226f2 f32085b = m6806b();
    public static final Set<String> f32086c = new HashSet(Arrays.asList("SM-A515F", "SM-A515U", "SM-A515U1", "SM-A515W", "SM-S515DL", "SC-54A", "SCG07", "SM-A5160", "SM-A516B", "SM-A516N", "SM-A516U", "SM-A516U1", "SM-A516V", "SM-A715F", "SM-A715W", "SM-A7160", "SM-A716B", "SM-A716U", "SM-A716U1", "SM-A716V", "SM-A8050", "SM-A805F", "SM-A805N", "SCV44", "SM-F9000", "SM-F900F", "SM-F900U", "SM-F900U1", "SM-F900W", "SM-F907B", "SM-F907N", "SM-N970F", "SM-N9700", "SM-N970U", "SM-N970U1", "SM-N970W", "SM-N971N", "SM-N770F", "SC-01M", "SCV45", "SM-N9750", "SM-N975C", "SM-N975U", "SM-N975U1", "SM-N975W", "SM-N975F", "SM-N976B", "SM-N976N", "SM-N9760", "SM-N976Q", "SM-N976V", "SM-N976U", "SM-N9810", "SM-N981N", "SM-N981U", "SM-N981U1", "SM-N981W", "SM-N981B", "SC-53A", "SCG06", "SM-N9860", "SM-N986N", "SM-N986U", "SM-N986U1", "SM-N986W", "SM-N986B", "SC-03L", "SCV41", "SM-G973F", "SM-G973N", "SM-G9730", "SM-G9738", "SM-G973C", "SM-G973U", "SM-G973U1", "SM-G973W", "SM-G977B", "SM-G977N", "SM-G977P", "SM-G977T", "SM-G977U", "SM-G770F", "SM-G770U1", "SC-04L", "SCV42", "SM-G975F", "SM-G975N", "SM-G9750", "SM-G9758", "SM-G975U", "SM-G975U1", "SM-G975W", "SC-05L", "SM-G970F", "SM-G970N", "SM-G9700", "SM-G9708", "SM-G970U", "SM-G970U1", "SM-G970W", "SC-51A", "SC51Aa", "SCG01", "SM-G9810", "SM-G981N", "SM-G981U", "SM-G981U1", "SM-G981V", "SM-G981W", "SM-G981B", "SCG03", "SM-G9880", "SM-G988N", "SM-G988Q", "SM-G988U", "SM-G988U1", "SM-G988W", "SM-G988B", "SC-52A", "SCG02", "SM-G9860", "SM-G986N", "SM-G986U", "SM-G986U1", "SM-G986W", "SM-G986B", "SCV47", "SM-F7000", "SM-F700F", "SM-F700N", "SM-F700U", "SM-F700U1", "SM-F700W", "SCG04", "SM-F7070", "SM-F707B", "SM-F707N", "SM-F707U", "SM-F707U1", "SM-F707W", "SM-F9160", "SM-F916B", "SM-F916N", "SM-F916Q", "SM-F916U", "SM-F916U1", "SM-F916W"));

    public static C10226f2 m6807a() {
        C10226f2 f2Var = new C10226f2();
        AbstractC10231g2.EnumC10233b bVar = AbstractC10231g2.EnumC10233b.YUV;
        f2Var.m5694a(AbstractC10231g2.m5679a(bVar, AbstractC10231g2.EnumC10232a.ANALYSIS));
        f2Var.m5694a(AbstractC10231g2.m5679a(AbstractC10231g2.EnumC10233b.PRIV, AbstractC10231g2.EnumC10232a.PREVIEW));
        f2Var.m5694a(AbstractC10231g2.m5679a(bVar, AbstractC10231g2.EnumC10232a.MAXIMUM));
        return f2Var;
    }

    public static C10226f2 m6806b() {
        C10226f2 f2Var = new C10226f2();
        AbstractC10231g2.EnumC10233b bVar = AbstractC10231g2.EnumC10233b.YUV;
        f2Var.m5694a(AbstractC10231g2.m5679a(bVar, AbstractC10231g2.EnumC10232a.ANALYSIS));
        f2Var.m5694a(AbstractC10231g2.m5679a(bVar, AbstractC10231g2.EnumC10232a.PREVIEW));
        f2Var.m5694a(AbstractC10231g2.m5679a(bVar, AbstractC10231g2.EnumC10232a.MAXIMUM));
        return f2Var;
    }

    public static boolean m6802f() {
        String str = Build.DEVICE;
        return "heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str);
    }

    public static boolean m6801g() {
        return m6802f() || m6800h();
    }

    public static boolean m6800h() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f32086c.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public List<C10226f2> m6805c(String str, int i) {
        if (m6802f()) {
            return m6803e(str);
        }
        if (m6800h()) {
            return m6804d(i);
        }
        return Collections.emptyList();
    }

    public final List<C10226f2> m6804d(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            arrayList.add(f32084a);
            arrayList.add(f32085b);
        }
        return arrayList;
    }

    public final List<C10226f2> m6803e(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("1")) {
            arrayList.add(f32084a);
        }
        return arrayList;
    }
}
