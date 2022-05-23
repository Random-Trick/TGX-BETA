package ec;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import ra.k;

public final class d extends Handler {
    public static final d f11504a = new d();

    @Override
    public void close() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void publish(LogRecord logRecord) {
        int b10;
        k.e(logRecord, "record");
        c cVar = c.f11503c;
        String loggerName = logRecord.getLoggerName();
        k.d(loggerName, "record.loggerName");
        b10 = e.b(logRecord);
        String message = logRecord.getMessage();
        k.d(message, "record.message");
        cVar.a(loggerName, b10, message, logRecord.getThrown());
    }
}
