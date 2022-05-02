package p177m6;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.concurrent.Executor;

public abstract class AbstractC6775l<TResult> {
    public AbstractC6775l<TResult> mo19081a(@RecentlyNonNull Executor executor, @RecentlyNonNull AbstractC6761e eVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public AbstractC6775l<TResult> mo19080b(@RecentlyNonNull Executor executor, @RecentlyNonNull AbstractC6763f<TResult> fVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public AbstractC6775l<TResult> mo19079c(@RecentlyNonNull AbstractC6763f<TResult> fVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract AbstractC6775l<TResult> mo19078d(@RecentlyNonNull Executor executor, @RecentlyNonNull AbstractC6765g gVar);

    public abstract AbstractC6775l<TResult> mo19077e(@RecentlyNonNull AbstractC6765g gVar);

    public abstract AbstractC6775l<TResult> mo19076f(@RecentlyNonNull Executor executor, @RecentlyNonNull AbstractC6767h<? super TResult> hVar);

    public abstract AbstractC6775l<TResult> mo19075g(@RecentlyNonNull AbstractC6767h<? super TResult> hVar);

    public <TContinuationResult> AbstractC6775l<TContinuationResult> mo19074h(@RecentlyNonNull Executor executor, @RecentlyNonNull AbstractC6757c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> AbstractC6775l<TContinuationResult> mo19073i(@RecentlyNonNull AbstractC6757c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> AbstractC6775l<TContinuationResult> mo19072j(@RecentlyNonNull Executor executor, @RecentlyNonNull AbstractC6757c<TResult, AbstractC6775l<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @RecentlyNullable
    public abstract Exception mo19071k();

    @RecentlyNonNull
    public abstract TResult mo19070l();

    @RecentlyNonNull
    public abstract <X extends Throwable> TResult mo19069m(@RecentlyNonNull Class<X> cls);

    public abstract boolean mo19068n();

    public abstract boolean mo19067o();

    public abstract boolean mo19066p();

    public <TContinuationResult> AbstractC6775l<TContinuationResult> mo19065q(@RecentlyNonNull Executor executor, @RecentlyNonNull AbstractC6773k<TResult, TContinuationResult> kVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
