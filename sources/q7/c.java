package q7;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import org.thunderdog.challegram.Log;

public class c {
    public final File f21446a;
    public final d7.c f21447b;

    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(d7.c cVar) {
        File filesDir = cVar.h().getFilesDir();
        this.f21446a = new File(filesDir, "PersistedInstallation." + cVar.l() + ".json");
        this.f21447b = cVar;
    }

    public d a(d dVar) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.d());
            jSONObject.put("Status", dVar.g().ordinal());
            jSONObject.put("AuthToken", dVar.b());
            jSONObject.put("RefreshToken", dVar.f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.h());
            jSONObject.put("ExpiresInSecs", dVar.c());
            jSONObject.put("FisError", dVar.e());
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f21447b.h().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(this.f21446a)) {
            return dVar;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public final JSONObject b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Log.TAG_VIDEO];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f21446a);
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

    public d c() {
        JSONObject b10 = b();
        String optString = b10.optString("Fid", null);
        int optInt = b10.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = b10.optString("AuthToken", null);
        String optString3 = b10.optString("RefreshToken", null);
        long optLong = b10.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = b10.optLong("ExpiresInSecs", 0L);
        return d.a().d(optString).g(a.values()[optInt]).b(optString2).f(optString3).h(optLong).c(optLong2).e(b10.optString("FisError", null)).a();
    }
}
