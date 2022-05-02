package p177m6;

import androidx.annotation.RecentlyNonNull;

public final class C6759d extends IllegalStateException {
    public C6759d(String str, Throwable th) {
        super(str, th);
    }

    @RecentlyNonNull
    public static IllegalStateException m19094a(@RecentlyNonNull AbstractC6775l<?> lVar) {
        String str;
        if (!lVar.mo19066o()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception k = lVar.mo19070k();
        if (k != null) {
            str = "failure";
        } else if (lVar.mo19065p()) {
            String valueOf = String.valueOf(lVar.mo19069l());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 7);
            sb2.append("result ");
            sb2.append(valueOf);
            str = sb2.toString();
        } else {
            str = lVar.mo19067n() ? "cancellation" : "unknown issue";
        }
        String valueOf2 = String.valueOf(str);
        return new C6759d(valueOf2.length() != 0 ? "Complete with: ".concat(valueOf2) : new String("Complete with: "), k);
    }
}
