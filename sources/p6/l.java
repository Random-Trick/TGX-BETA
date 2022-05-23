package p6;

import android.os.Bundle;
import java.util.List;
import t6.a;
import t6.m;
import t6.o0;
import w6.p;

public class l extends o0 {
    public final p f20698a;
    public final t f20699b;

    public l(t tVar, p pVar) {
        this.f20699b = tVar;
        this.f20698a = pVar;
    }

    @Override
    public void A0(Bundle bundle, Bundle bundle2) {
        m mVar;
        a aVar;
        mVar = this.f20699b.f20800d;
        mVar.s(this.f20698a);
        aVar = t.f20795g;
        aVar.d("onRequestDownloadInfo()", new Object[0]);
    }

    @Override
    public final void D1(Bundle bundle, Bundle bundle2) {
        m mVar;
        a aVar;
        mVar = this.f20699b.f20800d;
        mVar.s(this.f20698a);
        aVar = t.f20795g;
        aVar.d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override
    public void F(List list) {
        m mVar;
        a aVar;
        mVar = this.f20699b.f20800d;
        mVar.s(this.f20698a);
        aVar = t.f20795g;
        aVar.d("onGetSessionStates", new Object[0]);
    }

    @Override
    public final void J0(Bundle bundle, Bundle bundle2) {
        m mVar;
        a aVar;
        mVar = this.f20699b.f20800d;
        mVar.s(this.f20698a);
        aVar = t.f20795g;
        aVar.d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override
    public final void W0(Bundle bundle, Bundle bundle2) {
        m mVar;
        a aVar;
        mVar = this.f20699b.f20800d;
        mVar.s(this.f20698a);
        aVar = t.f20795g;
        aVar.d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override
    public void h1(Bundle bundle, Bundle bundle2) {
        m mVar;
        a aVar;
        mVar = this.f20699b.f20801e;
        mVar.s(this.f20698a);
        aVar = t.f20795g;
        aVar.d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override
    public final void j(int i10, Bundle bundle) {
        m mVar;
        a aVar;
        mVar = this.f20699b.f20800d;
        mVar.s(this.f20698a);
        aVar = t.f20795g;
        aVar.d("onCancelDownload(%d)", Integer.valueOf(i10));
    }

    @Override
    public final void m0(Bundle bundle, Bundle bundle2) {
        m mVar;
        a aVar;
        mVar = this.f20699b.f20800d;
        mVar.s(this.f20698a);
        aVar = t.f20795g;
        aVar.d("onRemoveModule()", new Object[0]);
    }

    @Override
    public final void n(Bundle bundle) {
        m mVar;
        a aVar;
        mVar = this.f20699b.f20800d;
        mVar.s(this.f20698a);
        aVar = t.f20795g;
        aVar.d("onCancelDownloads()", new Object[0]);
    }

    @Override
    public void o1(int i10, Bundle bundle) {
        m mVar;
        a aVar;
        mVar = this.f20699b.f20800d;
        mVar.s(this.f20698a);
        aVar = t.f20795g;
        aVar.d("onStartDownload(%d)", Integer.valueOf(i10));
    }

    @Override
    public void r0(Bundle bundle) {
        m mVar;
        a aVar;
        mVar = this.f20699b.f20800d;
        mVar.s(this.f20698a);
        int i10 = bundle.getInt("error_code");
        aVar = t.f20795g;
        aVar.b("onError(%d)", Integer.valueOf(i10));
        this.f20698a.d(new a(i10));
    }

    @Override
    public final void v1(int i10, Bundle bundle) {
        m mVar;
        a aVar;
        mVar = this.f20699b.f20800d;
        mVar.s(this.f20698a);
        aVar = t.f20795g;
        aVar.d("onGetSession(%d)", Integer.valueOf(i10));
    }

    @Override
    public void y(Bundle bundle, Bundle bundle2) {
        m mVar;
        a aVar;
        mVar = this.f20699b.f20800d;
        mVar.s(this.f20698a);
        aVar = t.f20795g;
        aVar.d("onGetChunkFileDescriptor", new Object[0]);
    }
}
