package p202o6;

import android.os.Bundle;
import java.util.List;
import p262s6.AbstractBinderC8675o0;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public class BinderC7717l extends AbstractBinderC8675o0 {
    public final C9865p f24744a;
    public final C7757t f24745b;

    public BinderC7717l(C7757t tVar, C9865p pVar) {
        this.f24745b = tVar;
        this.f24744a = pVar;
    }

    @Override
    public final void mo11762F1(Bundle bundle, Bundle bundle2) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24745b.f24848d;
        mVar.m11775s(this.f24744a);
        aVar = C7757t.f24843g;
        aVar.m11814d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override
    public void mo11761G(List list) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24745b.f24848d;
        mVar.m11775s(this.f24744a);
        aVar = C7757t.f24843g;
        aVar.m11814d("onGetSessionStates", new Object[0]);
    }

    @Override
    public final void mo11760M0(Bundle bundle, Bundle bundle2) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24745b.f24848d;
        mVar.m11775s(this.f24744a);
        aVar = C7757t.f24843g;
        aVar.m11814d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override
    public final void mo11759W0(Bundle bundle, Bundle bundle2) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24745b.f24848d;
        mVar.m11775s(this.f24744a);
        aVar = C7757t.f24843g;
        aVar.m11814d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override
    public void mo11758h1(Bundle bundle, Bundle bundle2) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24745b.f24849e;
        mVar.m11775s(this.f24744a);
        aVar = C7757t.f24843g;
        aVar.m11814d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override
    public final void mo11757j(int i, Bundle bundle) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24745b.f24848d;
        mVar.m11775s(this.f24744a);
        aVar = C7757t.f24843g;
        aVar.m11814d("onCancelDownload(%d)", Integer.valueOf(i));
    }

    @Override
    public final void mo11756j0(Bundle bundle, Bundle bundle2) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24745b.f24848d;
        mVar.m11775s(this.f24744a);
        aVar = C7757t.f24843g;
        aVar.m11814d("onRemoveModule()", new Object[0]);
    }

    @Override
    public final void mo11755n(Bundle bundle) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24745b.f24848d;
        mVar.m11775s(this.f24744a);
        aVar = C7757t.f24843g;
        aVar.m11814d("onCancelDownloads()", new Object[0]);
    }

    @Override
    public void mo11754o1(int i, Bundle bundle) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24745b.f24848d;
        mVar.m11775s(this.f24744a);
        aVar = C7757t.f24843g;
        aVar.m11814d("onStartDownload(%d)", Integer.valueOf(i));
    }

    @Override
    public void mo11753p0(Bundle bundle) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24745b.f24848d;
        mVar.m11775s(this.f24744a);
        int i = bundle.getInt("error_code");
        aVar = C7757t.f24843g;
        aVar.m11816b("onError(%d)", Integer.valueOf(i));
        this.f24744a.m6732d(new C7657a(i));
    }

    @Override
    public final void mo11752v1(int i, Bundle bundle) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24745b.f24848d;
        mVar.m11775s(this.f24744a);
        aVar = C7757t.f24843g;
        aVar.m11814d("onGetSession(%d)", Integer.valueOf(i));
    }

    @Override
    public void mo11751x0(Bundle bundle, Bundle bundle2) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24745b.f24848d;
        mVar.m11775s(this.f24744a);
        aVar = C7757t.f24843g;
        aVar.m11814d("onRequestDownloadInfo()", new Object[0]);
    }

    @Override
    public void mo11750z(Bundle bundle, Bundle bundle2) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24745b.f24848d;
        mVar.m11775s(this.f24744a);
        aVar = C7757t.f24843g;
        aVar.m11814d("onGetChunkFileDescriptor", new Object[0]);
    }
}
