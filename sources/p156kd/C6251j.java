package p156kd;

import gd.C4779t2;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p350yd.AbstractC11073vb;

public class C6251j extends C6246h {
    public TdApi.Function f19709a0;
    public TdApi.FileType f19710b0;
    public boolean f19711c0;
    public String f19712d0;

    public C6251j(AbstractC11073vb vbVar, String str, TdApi.FileType fileType) {
        super(vbVar, C4779t2.m25684G4(0, str, "", 0));
        this.f19710b0 = fileType;
        m20909k0();
    }

    @Override
    public byte mo20777C() {
        return (byte) 4;
    }

    public void mo258D0(Client.AbstractC7865g gVar) {
        TdApi.Function function = this.f19709a0;
        if (function == null) {
            function = new TdApi.GetRemoteFile(this.f19704a.remote.f25417id, m20882E0());
        }
        this.f19695R.mo1480c().m2270r4().m14783o(function, gVar);
    }

    public TdApi.FileType m20882E0() {
        TdApi.FileType fileType = this.f19710b0;
        return fileType != null ? fileType : new TdApi.FileTypeUnknown();
    }

    public boolean m20881F0() {
        return this.f19711c0;
    }

    public void m20880G0(TdApi.File file) {
        m20951C0(file);
        this.f19711c0 = true;
    }

    @Override
    public String mo20768d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo20879l());
        sb2.append(m20940P() ? "_square" : "");
        return sb2.toString();
    }

    @Override
    public final String mo20879l() {
        int a = m20929a();
        String str = this.f19712d0;
        if (str == null) {
            str = this.f19704a.remote.f25417id;
        }
        return C6246h.m20905n(a, str);
    }

    public C6251j(AbstractC11073vb vbVar, TdApi.Function function, String str) {
        super(vbVar, C4779t2.m25684G4(0, "", "", 0));
        this.f19709a0 = function;
        this.f19712d0 = str;
    }
}
