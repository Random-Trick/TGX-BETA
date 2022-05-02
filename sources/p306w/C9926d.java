package p306w;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;
import p293v.C9814i;
import p293v.C9816k;

public class C9926d {
    public final String f32305a;

    public C9926d(String str) {
        this.f32305a = str;
    }

    public List<Size> m6474a(int i) {
        C9816k kVar = (C9816k) C9814i.m6817a(C9816k.class);
        if (kVar == null) {
            return new ArrayList();
        }
        return kVar.m6815a(this.f32305a, i);
    }
}
