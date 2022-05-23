package d8;

import androidx.annotation.RecentlyNonNull;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.p;
import f8.a;
import java.io.Closeable;
import java.util.List;
import n6.l;

public interface b extends Closeable, f {
    @Override
    @p(d.b.ON_DESTROY)
    void close();

    l<List<a>> z(@RecentlyNonNull a aVar);
}
