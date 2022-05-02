package p202o6;

import java.io.File;
import java.io.FilenameFilter;

public final class C7701h3 implements FilenameFilter {
    public static final C7701h3 f24681a = new C7701h3();

    @Override
    public final boolean accept(File file, String str) {
        boolean matches;
        matches = C7706i3.f24704a.matcher(str).matches();
        return matches;
    }
}
