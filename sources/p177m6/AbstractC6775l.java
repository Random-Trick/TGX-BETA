package p177m6;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.concurrent.Executor;

public abstract class AbstractC6775l<TResult> {
    public AbstractC6775l<TResult> mo19080a(@RecentlyNonNull Executor executor, @RecentlyNonNull AbstractC6761e eVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public AbstractC6775l<TResult> mo19079b(@RecentlyNonNull Executor executor, @RecentlyNonNull AbstractC6763f<TResult> fVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public AbstractC6775l<TResult> mo19078c(@RecentlyNonNull AbstractC6763f<TResult> fVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract AbstractC6775l<TResult> mo19077d(@RecentlyNonNull Executor executor, @RecentlyNonNull AbstractC6765g gVar);

    public abstract AbstractC6775l<TResult> mo19076e(@RecentlyNonNull AbstractC6765g gVar);

    public abstract AbstractC6775l<TResult> mo19075f(@RecentlyNonNull Executor executor, @RecentlyNonNull AbstractC6767h<? super TResult> hVar);

    public abstract AbstractC6775l<TResult> mo19074g(@RecentlyNonNull AbstractC6767h<? super TResult> hVar);

    public <TContinuationResult> AbstractC6775l<TContinuationResult> mo19073h(@RecentlyNonNull Executor executor, @RecentlyNonNull AbstractC6757c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> AbstractC6775l<TContinuationResult> mo19072i(@RecentlyNonNull AbstractC6757c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> AbstractC6775l<TContinuationResult> mo19071j(@RecentlyNonNull Executor executor, @RecentlyNonNull AbstractC6757c<TResult, AbstractC6775l<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @RecentlyNullable
    public abstract Exception mo19070k();

    @RecentlyNonNull
    public abstract TResult mo19069l();

    @RecentlyNonNull
    public abstract <X extends Throwable> TResult mo19068m(@RecentlyNonNull Class<X> cls);

    public abstract boolean mo19067n();

    public abstract boolean mo19066o();

    public abstract boolean mo19065p();

    public <TContinuationResult> AbstractC6775l<TContinuationResult> mo19064q(@RecentlyNonNull Executor executor, @RecentlyNonNull AbstractC6773k<TResult, TContinuationResult> kVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
