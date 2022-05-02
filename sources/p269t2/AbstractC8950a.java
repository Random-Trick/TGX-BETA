package p269t2;

import com.googlecode.mp4parser.AbstractC3539a;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import p258s2.AbstractC8629b;

public interface AbstractC8950a {
    void getBox(WritableByteChannel writableByteChannel);

    AbstractC8951b getParent();

    long getSize();

    String getType();

    void parse(AbstractC3539a aVar, ByteBuffer byteBuffer, long j, AbstractC8629b bVar);

    void setParent(AbstractC8951b bVar);
}
