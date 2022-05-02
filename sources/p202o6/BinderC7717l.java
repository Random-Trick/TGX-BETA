package p202o6;

import android.os.Bundle;
import java.util.List;
import p262s6.AbstractBinderC8675o0;
import p262s6.C8646a;
import p262s6.C8670m;
import p300v6.C9865p;

public class BinderC7717l extends AbstractBinderC8675o0 {
    public final C9865p f24741a;
    public final C7757t f24742b;

    public BinderC7717l(C7757t tVar, C9865p pVar) {
        this.f24742b = tVar;
        this.f24741a = pVar;
    }

    @Override
    public final void mo11763F1(Bundle bundle, Bundle bundle2) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24742b.f24845d;
        mVar.m11776s(this.f24741a);
        aVar = C7757t.f24840g;
        aVar.m11815d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override
    public void mo11762G(List list) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24742b.f24845d;
        mVar.m11776s(this.f24741a);
        aVar = C7757t.f24840g;
        aVar.m11815d("onGetSessionStates", new Object[0]);
    }

    @Override
    public final void mo11761M0(Bundle bundle, Bundle bundle2) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24742b.f24845d;
        mVar.m11776s(this.f24741a);
        aVar = C7757t.f24840g;
        aVar.m11815d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override
    public final void mo11760W0(Bundle bundle, Bundle bundle2) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24742b.f24845d;
        mVar.m11776s(this.f24741a);
        aVar = C7757t.f24840g;
        aVar.m11815d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override
    public void mo11759h1(Bundle bundle, Bundle bundle2) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24742b.f24846e;
        mVar.m11776s(this.f24741a);
        aVar = C7757t.f24840g;
        aVar.m11815d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override
    public final void mo11758j(int i, Bundle bundle) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24742b.f24845d;
        mVar.m11776s(this.f24741a);
        aVar = C7757t.f24840g;
        aVar.m11815d("onCancelDownload(%d)", Integer.valueOf(i));
    }

    @Override
    public final void mo11757j0(Bundle bundle, Bundle bundle2) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24742b.f24845d;
        mVar.m11776s(this.f24741a);
        aVar = C7757t.f24840g;
        aVar.m11815d("onRemoveModule()", new Object[0]);
    }

    @Override
    public final void mo11756n(Bundle bundle) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24742b.f24845d;
        mVar.m11776s(this.f24741a);
        aVar = C7757t.f24840g;
        aVar.m11815d("onCancelDownloads()", new Object[0]);
    }

    @Override
    public void mo11755o1(int i, Bundle bundle) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24742b.f24845d;
        mVar.m11776s(this.f24741a);
        aVar = C7757t.f24840g;
        aVar.m11815d("onStartDownload(%d)", Integer.valueOf(i));
    }

    @Override
    public void mo11754p0(Bundle bundle) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24742b.f24845d;
        mVar.m11776s(this.f24741a);
        int i = bundle.getInt("error_code");
        aVar = C7757t.f24840g;
        aVar.m11817b("onError(%d)", Integer.valueOf(i));
        this.f24741a.m6732d(new C7657a(i));
    }

    @Override
    public final void mo11753v1(int i, Bundle bundle) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24742b.f24845d;
        mVar.m11776s(this.f24741a);
        aVar = C7757t.f24840g;
        aVar.m11815d("onGetSession(%d)", Integer.valueOf(i));
    }

    @Override
    public void mo11752x0(Bundle bundle, Bundle bundle2) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24742b.f24845d;
        mVar.m11776s(this.f24741a);
        aVar = C7757t.f24840g;
        aVar.m11815d("onRequestDownloadInfo()", new Object[0]);
    }

    @Override
    public void mo11751z(Bundle bundle, Bundle bundle2) {
        C8670m mVar;
        C8646a aVar;
        mVar = this.f24742b.f24845d;
        mVar.m11776s(this.f24741a);
        aVar = C7757t.f24840g;
        aVar.m11815d("onGetChunkFileDescriptor", new Object[0]);
    }
}
