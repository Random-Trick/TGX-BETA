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
    public final File f26243a;
    public final C2021c f26244b;

    public enum EnumC8060a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C8059c(C2021c cVar) {
        File filesDir = cVar.m35815h().getFilesDir();
        this.f26243a = new File(filesDir, "PersistedInstallation." + cVar.m35811l() + ".json");
        this.f26244b = cVar;
    }

    public AbstractC8061d m13680a(AbstractC8061d dVar) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.mo13674d());
            jSONObject.put("Status", dVar.mo13671g().ordinal());
            jSONObject.put("AuthToken", dVar.mo13676b());
            jSONObject.put("RefreshToken", dVar.mo13672f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.mo13670h());
            jSONObject.put("ExpiresInSecs", dVar.mo13675c());
            jSONObject.put("FisError", dVar.mo13673e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f26244b.m35815h().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(this.f26243a)) {
            return dVar;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public final JSONObject m13679b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Log.TAG_VIDEO];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f26243a);
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

    public AbstractC8061d m13678c() {
        JSONObject b = m13679b();
        String optString = b.optString("Fid", null);
        int optInt = b.optInt("Status", EnumC8060a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = b.optString("AuthToken", null);
        String optString3 = b.optString("RefreshToken", null);
        long optLong = b.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = b.optLong("ExpiresInSecs", 0L);
        return AbstractC8061d.m13677a().mo13654d(optString).mo13651g(EnumC8060a.values()[optInt]).mo13656b(optString2).mo13652f(optString3).mo13650h(optLong).mo13655c(optLong2).mo13653e(b.optString("FisError", null)).mo13657a();
    }
}
