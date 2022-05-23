package cc;

import hc.g;
import java.util.List;
import ra.k;

public interface l {
    public static final a f5209b = new a(null);
    public static final l f5208a = new a.C0067a();

    public static final class a {

        public static final class C0067a implements l {
            @Override
            public boolean a(int i10, g gVar, int i11, boolean z10) {
                k.e(gVar, "source");
                gVar.b0(i11);
                return true;
            }

            @Override
            public void b(int i10, b bVar) {
                k.e(bVar, "errorCode");
            }

            @Override
            public boolean c(int i10, List<c> list) {
                k.e(list, "requestHeaders");
                return true;
            }

            @Override
            public boolean d(int i10, List<c> list, boolean z10) {
                k.e(list, "responseHeaders");
                return true;
            }
        }

        public a() {
        }

        public a(ra.g gVar) {
            this();
        }
    }

    boolean a(int i10, g gVar, int i11, boolean z10);

    void b(int i10, b bVar);

    boolean c(int i10, List<c> list);

    boolean d(int i10, List<c> list, boolean z10);
}
