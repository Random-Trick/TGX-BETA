package f2;

import androidx.work.b;
import java.util.List;

public abstract class h {
    public static final String f11816a = j.f("InputMerger");

    public static h a(String str) {
        try {
            return (h) Class.forName(str).newInstance();
        } catch (Exception e10) {
            j c10 = j.c();
            String str2 = f11816a;
            c10.b(str2, "Trouble instantiating + " + str, e10);
            return null;
        }
    }

    public abstract b b(List<b> list);
}
