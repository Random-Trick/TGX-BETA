package j4;

import f4.e;
import f4.h;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z6.b;
import z6.d;

public final class a extends h {
    public static final Pattern f15052c = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder f15053a = d.f27014c.newDecoder();
    public final CharsetDecoder f15054b = d.f27013b.newDecoder();

    @Override
    public f4.a b(e eVar, ByteBuffer byteBuffer) {
        String c10 = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (c10 == null) {
            return new f4.a(new c(bArr, null, null));
        }
        Matcher matcher = f15052c.matcher(c10);
        String str2 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String c11 = b.c(group);
                c11.hashCode();
                if (c11.equals("streamurl")) {
                    str2 = group2;
                } else if (c11.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new f4.a(new c(bArr, str, str2));
    }

    public final String c(ByteBuffer byteBuffer) {
        try {
            return this.f15053a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                return this.f15054b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                return null;
            } finally {
                this.f15054b.reset();
                byteBuffer.rewind();
            }
        } finally {
            this.f15053a.reset();
            byteBuffer.rewind();
        }
    }
}
