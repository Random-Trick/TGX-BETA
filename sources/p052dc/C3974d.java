package p052dc;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import qa.C8298k;

public final class C3974d extends Handler {
    public static final C3974d f13347a = new C3974d();

    @Override
    public void close() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void publish(LogRecord logRecord) {
        int b;
        C8298k.m12934e(logRecord, "record");
        C3973c cVar = C3973c.f13346c;
        String loggerName = logRecord.getLoggerName();
        C8298k.m12935d(loggerName, "record.loggerName");
        b = C3975e.m29435b(logRecord);
        String message = logRecord.getMessage();
        C8298k.m12935d(message, "record.message");
        cVar.m29440a(loggerName, b, message, logRecord.getThrown());
    }
}
