package f3;

import java.lang.Throwable;

public interface a<TInput, TResult, TException extends Throwable> {
    TResult apply(TInput tinput);
}
