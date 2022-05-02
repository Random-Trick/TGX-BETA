package p336y;

import androidx.camera.core.AbstractC0598k;
import androidx.camera.core.AbstractC0642r;
import androidx.camera.core.AbstractC0688y2;
import java.util.Collection;

public interface AbstractC10208c0 extends AbstractC0598k, AbstractC0688y2.AbstractC0692d {

    public enum EnumC10209a {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);
        
        public final boolean f32972a;

        EnumC10209a(boolean z) {
            this.f32972a = z;
        }

        public boolean m5726a() {
            return this.f32972a;
        }
    }

    @Override
    AbstractC0642r mo5734a();

    void mo5733c(AbstractC10295s sVar);

    AbstractC10293r1<EnumC10209a> mo5732g();

    AbstractC10312x mo5731h();

    void mo5730i(boolean z);

    void mo5729j(Collection<AbstractC0688y2> collection);

    void mo5728k(Collection<AbstractC0688y2> collection);

    AbstractC10194a0 mo5727l();
}
