package b5;

import java.io.IOException;

public final class n {
    public static void a(k kVar) {
        if (kVar != null) {
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
