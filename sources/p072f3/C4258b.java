package p072f3;

public final class C4258b {
    public static <TInput, TResult, TException extends Throwable> TResult m28333a(int i, TInput tinput, AbstractC4257a<TInput, TResult, TException> aVar, AbstractC4259c<TInput, TResult> cVar) {
        TResult apply;
        if (i < 1) {
            return aVar.apply(tinput);
        }
        do {
            apply = aVar.apply(tinput);
            tinput = cVar.mo1178a(tinput, apply);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return apply;
    }
}
