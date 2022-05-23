package p6;

import java.io.File;
import java.io.FilenameFilter;

public final class h3 implements FilenameFilter {
    public static final h3 f20647a = new h3();

    @Override
    public final boolean accept(File file, String str) {
        boolean matches;
        matches = i3.f20669a.matcher(str).matches();
        return matches;
    }
}
