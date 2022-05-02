package p025bc;

import java.util.List;
import p095gc.AbstractC4551g;
import qa.C8294g;
import qa.C8298k;

public interface AbstractC1349l {
    public static final C1350a f4931b = new C1350a(null);
    public static final AbstractC1349l f4930a = new C1350a.C1351a();

    public static final class C1350a {

        public static final class C1351a implements AbstractC1349l {
            @Override
            public boolean mo37579a(int i, AbstractC4551g gVar, int i2, boolean z) {
                C8298k.m12933e(gVar, "source");
                gVar.mo27337a0(i2);
                return true;
            }

            @Override
            public boolean mo37578b(int i, List<C1309c> list) {
                C8298k.m12933e(list, "requestHeaders");
                return true;
            }

            @Override
            public boolean mo37577c(int i, List<C1309c> list, boolean z) {
                C8298k.m12933e(list, "responseHeaders");
                return true;
            }

            @Override
            public void mo37576d(int i, EnumC1307b bVar) {
                C8298k.m12933e(bVar, "errorCode");
            }
        }

        public C1350a() {
        }

        public C1350a(C8294g gVar) {
            this();
        }
    }

    boolean mo37579a(int i, AbstractC4551g gVar, int i2, boolean z);

    boolean mo37578b(int i, List<C1309c> list);

    boolean mo37577c(int i, List<C1309c> list, boolean z);

    void mo37576d(int i, EnumC1307b bVar);
}
