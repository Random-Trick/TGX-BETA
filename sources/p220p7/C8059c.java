package p220p7;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import org.thunderdog.challegram.Log;
import p034c7.C2021c;

public class C8059c {
    public final File f26246a;
    public final C2021c f26247b;

    public enum EnumC8060a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C8059c(C2021c cVar) {
        File filesDir = cVar.m35818h().getFilesDir();
        this.f26246a = new File(filesDir, "PersistedInstallation." + cVar.m35814l() + ".json");
        this.f26247b = cVar;
    }

    public AbstractC8061d m13679a(AbstractC8061d dVar) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.mo13673d());
            jSONObject.put("Status", dVar.mo13670g().ordinal());
            jSONObject.put("AuthToken", dVar.mo13675b());
            jSONObject.put("RefreshToken", dVar.mo13671f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.mo13669h());
            jSONObject.put("ExpiresInSecs", dVar.mo13674c());
            jSONObject.put("FisError", dVar.mo13672e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f26247b.m35818h().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(this.f26246a)) {
            return dVar;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public final JSONObject m13678b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Log.TAG_VIDEO];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f26246a);
            while (true) {
                int read = fileInputStream.read(bArr, 0, Log.TAG_VIDEO);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public AbstractC8061d m13677c() {
        JSONObject b = m13678b();
        String optString = b.optString("Fid", null);
        int optInt = b.optInt("Status", EnumC8060a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = b.optString("AuthToken", null);
        String optString3 = b.optString("RefreshToken", null);
        long optLong = b.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = b.optLong("ExpiresInSecs", 0L);
        return AbstractC8061d.m13676a().mo13653d(optString).mo13650g(EnumC8060a.values()[optInt]).mo13655b(optString2).mo13651f(optString3).mo13649h(optLong).mo13654c(optLong2).mo13652e(b.optString("FisError", null)).mo13656a();
    }
}
