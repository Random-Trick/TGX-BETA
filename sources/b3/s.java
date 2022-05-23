package b3;

import android.content.Context;
import i3.c;
import java.io.Closeable;

public abstract class s implements Closeable {

    public interface a {
        s a();

        a b(Context context);
    }

    @Override
    public void close() {
        m().close();
    }

    public abstract c m();

    public abstract r s();
}
