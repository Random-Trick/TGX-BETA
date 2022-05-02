package p071f2;

import androidx.work.C1070b;
import java.util.List;

public abstract class AbstractC4231h {
    public static final String f14274a = AbstractC4234j.m28360f("InputMerger");

    public static AbstractC4231h m28367a(String str) {
        try {
            return (AbstractC4231h) Class.forName(str).newInstance();
        } catch (Exception e) {
            AbstractC4234j c = AbstractC4234j.m28362c();
            String str2 = f14274a;
            c.mo28358b(str2, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    public abstract C1070b mo28366b(List<C1070b> list);
}
