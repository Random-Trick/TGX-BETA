package x1;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

public interface b extends Closeable {
    void L();

    void N(String str, Object[] objArr);

    Cursor T(String str);

    void W();

    Cursor d(e eVar, CancellationSignal cancellationSignal);

    void e();

    String h0();

    boolean isOpen();

    boolean j0();

    List<Pair<String, String>> n();

    void p(String str);

    Cursor p0(e eVar);

    f u(String str);
}
