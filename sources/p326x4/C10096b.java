package p326x4;

import java.util.Collections;
import java.util.List;
import p020b5.C1186a;
import p217p4.AbstractC8041f;
import p217p4.C8032b;

public final class C10096b implements AbstractC8041f {
    public static final C10096b f32796b = new C10096b();
    public final List<C8032b> f32797a;

    public C10096b(C8032b bVar) {
        this.f32797a = Collections.singletonList(bVar);
    }

    @Override
    public int mo5200a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override
    public long mo5199b(int i) {
        C1186a.m38192a(i == 0);
        return 0L;
    }

    @Override
    public List<C8032b> mo5198c(long j) {
        return j >= 0 ? this.f32797a : Collections.emptyList();
    }

    @Override
    public int mo5197d() {
        return 1;
    }

    public C10096b() {
        this.f32797a = Collections.emptyList();
    }
}
