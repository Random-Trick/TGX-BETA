package p004a3;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

public abstract class AbstractC0076n {
    public static AbstractC0076n m42435a(long j) {
        return new C0064h(j);
    }

    public static AbstractC0076n m42434b(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return m42435a(Long.parseLong(jsonReader.nextString()));
                } else {
                    return m42435a(jsonReader.nextLong());
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public abstract long mo42433c();
}
