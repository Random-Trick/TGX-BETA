package y;

import java.util.concurrent.Executor;

public interface r1<T> {

    public interface a<T> {
        void a(T t10);

        void b(Throwable th);
    }

    void a(Executor executor, a<? super T> aVar);

    void b(a<? super T> aVar);
}
