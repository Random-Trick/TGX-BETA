package y;

import androidx.camera.core.h1;
import androidx.camera.core.k1;
import b0.f;
import c7.a;
import java.util.Collections;
import java.util.List;

public final class e2 implements f1 {
    public final int f26293a;
    public final k1 f26294b;

    public e2(k1 k1Var, String str) {
        h1 a02 = k1Var.a0();
        if (a02 != null) {
            Integer num = (Integer) a02.a().c(str);
            if (num != null) {
                this.f26293a = num.intValue();
                this.f26294b = k1Var;
                return;
            }
            throw new IllegalArgumentException("ImageProxy has no associated tag");
        }
        throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
    }

    @Override
    public a<k1> a(int i10) {
        if (i10 != this.f26293a) {
            return f.f(new IllegalArgumentException("Capture id does not exist in the bundle"));
        }
        return f.h(this.f26294b);
    }

    @Override
    public List<Integer> b() {
        return Collections.singletonList(Integer.valueOf(this.f26293a));
    }

    public void c() {
        this.f26294b.close();
    }
}
