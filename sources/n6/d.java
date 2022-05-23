package n6;

import androidx.annotation.RecentlyNonNull;

public final class d extends IllegalStateException {
    public d(String str, Throwable th) {
        super(str, th);
    }

    @RecentlyNonNull
    public static IllegalStateException a(@RecentlyNonNull l<?> lVar) {
        String str;
        if (!lVar.o()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception k10 = lVar.k();
        if (k10 != null) {
            str = "failure";
        } else if (lVar.p()) {
            String valueOf = String.valueOf(lVar.l());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 7);
            sb2.append("result ");
            sb2.append(valueOf);
            str = sb2.toString();
        } else {
            str = lVar.n() ? "cancellation" : "unknown issue";
        }
        String valueOf2 = String.valueOf(str);
        return new d(valueOf2.length() != 0 ? "Complete with: ".concat(valueOf2) : new String("Complete with: "), k10);
    }
}
