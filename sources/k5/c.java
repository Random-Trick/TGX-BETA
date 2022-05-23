package k5;

import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import k0.a;
import l5.b;
import m5.r;

public class c extends Exception {
    public final a<b<?>, j5.a> f15663a;

    public c(@RecentlyNonNull a<b<?>, j5.a> aVar) {
        this.f15663a = aVar;
    }

    @Override
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z10 = true;
        for (b<?> bVar : this.f15663a.keySet()) {
            j5.a aVar = (j5.a) r.k(this.f15663a.get(bVar));
            z10 &= !aVar.f();
            String b10 = bVar.b();
            String valueOf = String.valueOf(aVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(b10).length() + 2 + valueOf.length());
            sb2.append(b10);
            sb2.append(": ");
            sb2.append(valueOf);
            arrayList.add(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        if (z10) {
            sb3.append("None of the queried APIs are available. ");
        } else {
            sb3.append("Some of the queried APIs are unavailable. ");
        }
        sb3.append(TextUtils.join("; ", arrayList));
        return sb3.toString();
    }
}
