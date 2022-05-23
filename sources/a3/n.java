package a3;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

public abstract class n {
    public static n a(long j10) {
        return new h(j10);
    }

    public static n b(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return a(Long.parseLong(jsonReader.nextString()));
                } else {
                    return a(jsonReader.nextLong());
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public abstract long c();
}
