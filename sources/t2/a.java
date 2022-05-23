package t2;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import s2.b;

public interface a {
    void getBox(WritableByteChannel writableByteChannel);

    b getParent();

    long getSize();

    String getType();

    void parse(com.googlecode.mp4parser.a aVar, ByteBuffer byteBuffer, long j10, b bVar);

    void setParent(b bVar);
}
