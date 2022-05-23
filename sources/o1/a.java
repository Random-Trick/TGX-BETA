package o1;

import androidx.lifecycle.g;
import androidx.lifecycle.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
    public static <T extends g & v> a b(T t10) {
        return new b(t10, t10.e());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
