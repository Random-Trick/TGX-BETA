package k6;

import com.google.android.gms.common.api.Scope;
import k5.a;

public final class e {
    public static final a.g<l6.a> f15709a;
    public static final a.g<l6.a> f15710b;
    public static final a.AbstractC0141a<l6.a, a> f15711c;
    public static final a.AbstractC0141a<l6.a, d> f15712d;
    public static final Scope f15713e = new Scope("profile");
    public static final Scope f15714f = new Scope("email");
    public static final a<a> f15715g;
    public static final a<d> f15716h;

    static {
        a.g<l6.a> gVar = new a.g<>();
        f15709a = gVar;
        a.g<l6.a> gVar2 = new a.g<>();
        f15710b = gVar2;
        b bVar = new b();
        f15711c = bVar;
        c cVar = new c();
        f15712d = cVar;
        f15715g = new a<>("SignIn.API", bVar, gVar);
        f15716h = new a<>("SignIn.INTERNAL_API", cVar, gVar2);
    }
}
