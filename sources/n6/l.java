package n6;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.concurrent.Executor;

public abstract class l<TResult> {
    public l<TResult> a(@RecentlyNonNull Executor executor, @RecentlyNonNull e eVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public l<TResult> b(@RecentlyNonNull Executor executor, @RecentlyNonNull f<TResult> fVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public l<TResult> c(@RecentlyNonNull f<TResult> fVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract l<TResult> d(@RecentlyNonNull Executor executor, @RecentlyNonNull g gVar);

    public abstract l<TResult> e(@RecentlyNonNull g gVar);

    public abstract l<TResult> f(@RecentlyNonNull Executor executor, @RecentlyNonNull h<? super TResult> hVar);

    public abstract l<TResult> g(@RecentlyNonNull h<? super TResult> hVar);

    public <TContinuationResult> l<TContinuationResult> h(@RecentlyNonNull Executor executor, @RecentlyNonNull c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> l<TContinuationResult> i(@RecentlyNonNull c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> l<TContinuationResult> j(@RecentlyNonNull Executor executor, @RecentlyNonNull c<TResult, l<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @RecentlyNullable
    public abstract Exception k();

    @RecentlyNonNull
    public abstract TResult l();

    @RecentlyNonNull
    public abstract <X extends Throwable> TResult m(@RecentlyNonNull Class<X> cls);

    public abstract boolean n();

    public abstract boolean o();

    public abstract boolean p();

    public <TContinuationResult> l<TContinuationResult> q(@RecentlyNonNull Executor executor, @RecentlyNonNull k<TResult, TContinuationResult> kVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
