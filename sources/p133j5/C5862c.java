package p133j5;

import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import p118i5.C5217a;
import p143k0.C6024a;
import p148k5.C6085b;
import p163l5.C6378r;

public class C5862c extends Exception {
    public final C6024a<C6085b<?>, C5217a> f18726a;

    public C5862c(@RecentlyNonNull C6024a<C6085b<?>, C5217a> aVar) {
        this.f18726a = aVar;
    }

    @Override
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C6085b<?> bVar : this.f18726a.keySet()) {
            C5217a aVar = (C5217a) C6378r.m20507k(this.f18726a.get(bVar));
            z &= !aVar.m23612f();
            String b = bVar.m21387b();
            String valueOf = String.valueOf(aVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + 2 + valueOf.length());
            sb2.append(b);
            sb2.append(": ");
            sb2.append(valueOf);
            arrayList.add(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        if (z) {
            sb3.append("None of the queried APIs are available. ");
        } else {
            sb3.append("Some of the queried APIs are unavailable. ");
        }
        sb3.append(TextUtils.join("; ", arrayList));
        return sb3.toString();
    }
}
