package p336y;

import androidx.camera.core.AbstractC0577i1;
import androidx.camera.core.AbstractC0610l1;
import java.util.Collections;
import java.util.List;
import p015b0.C1111f;
import p022b7.AbstractFutureC1291a;

public final class C10220e2 implements AbstractC10225f1 {
    public final int f32990a;
    public final AbstractC0610l1 f32991b;

    public C10220e2(AbstractC0610l1 l1Var, String str) {
        AbstractC0577i1 Z = l1Var.mo40736Z();
        if (Z != null) {
            Integer num = (Integer) Z.mo36995a().m5659c(str);
            if (num != null) {
                this.f32990a = num.intValue();
                this.f32991b = l1Var;
                return;
            }
            throw new IllegalArgumentException("ImageProxy has no associated tag");
        }
        throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
    }

    @Override
    public AbstractFutureC1291a<AbstractC0610l1> mo5696a(int i) {
        if (i != this.f32990a) {
            return C1111f.m38353f(new IllegalArgumentException("Capture id does not exist in the bundle"));
        }
        return C1111f.m38351h(this.f32991b);
    }

    @Override
    public List<Integer> mo5695b() {
        return Collections.singletonList(Integer.valueOf(this.f32990a));
    }

    public void m5709c() {
        this.f32991b.close();
    }
}
