package p035c8;

import androidx.annotation.RecentlyNonNull;
import androidx.lifecycle.AbstractC0840d;
import androidx.lifecycle.AbstractC0845f;
import androidx.lifecycle.AbstractC0857p;
import java.io.Closeable;
import java.util.List;
import p063e8.C4164a;
import p177m6.AbstractC6775l;

public interface AbstractC2034b extends Closeable, AbstractC0845f {
    @Override
    @AbstractC0857p(AbstractC0840d.EnumC0842b.ON_DESTROY)
    void close();

    AbstractC6775l<List<C2033a>> mo30125n0(@RecentlyNonNull C4164a aVar);
}
