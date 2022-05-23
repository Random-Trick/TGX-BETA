package ld;

import hd.t2;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import zd.tb;

public class j extends h {
    public TdApi.Function f16366a0;
    public TdApi.FileType f16367b0;
    public boolean f16368c0;
    public String f16369d0;

    public j(tb tbVar, String str, TdApi.FileType fileType) {
        super(tbVar, t2.G4(0, str, "", 0));
        this.f16367b0 = fileType;
        k0();
    }

    @Override
    public byte C() {
        return (byte) 4;
    }

    public void D0(Client.g gVar) {
        TdApi.Function function = this.f16366a0;
        if (function == null) {
            function = new TdApi.GetRemoteFile(this.f16361a.remote.f19958id, E0());
        }
        this.R.c().v4().o(function, gVar);
    }

    public TdApi.FileType E0() {
        TdApi.FileType fileType = this.f16367b0;
        return fileType != null ? fileType : new TdApi.FileTypeUnknown();
    }

    public boolean F0() {
        return this.f16368c0;
    }

    public void G0(TdApi.File file) {
        C0(file);
        this.f16368c0 = true;
    }

    @Override
    public String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l());
        sb2.append(P() ? "_square" : "");
        return sb2.toString();
    }

    @Override
    public final String l() {
        int a10 = a();
        String str = this.f16369d0;
        if (str == null) {
            str = this.f16361a.remote.f19958id;
        }
        return h.n(a10, str);
    }

    public j(tb tbVar, TdApi.Function function, String str) {
        super(tbVar, t2.G4(0, "", "", 0));
        this.f16366a0 = function;
        this.f16369d0 = str;
    }
}
