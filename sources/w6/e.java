package w6;

import java.util.concurrent.Executor;

public abstract class e<ResultT> {
    public abstract e<ResultT> a(a<ResultT> aVar);

    public abstract e<ResultT> b(Executor executor, b bVar);

    public abstract e<ResultT> c(b bVar);

    public abstract e<ResultT> d(Executor executor, c<? super ResultT> cVar);

    public abstract e<ResultT> e(c<? super ResultT> cVar);

    public abstract Exception f();

    public abstract ResultT g();

    public abstract boolean h();

    public abstract boolean i();
}
