package t6;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.thunderdog.challegram.Log;

public final class v {
    public static long a(w wVar, InputStream inputStream, OutputStream outputStream, long j10) {
        byte[] bArr = new byte[Log.TAG_VIDEO];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, Log.TAG_EMOJI));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", Integer.valueOf(readInt)));
            throw new u(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
        }
        int read = dataInputStream.read();
        if (read == 4) {
            long j11 = 0;
            while (true) {
                long j12 = j10 - j11;
                try {
                    int read2 = dataInputStream.read();
                    if (read2 == -1) {
                        throw new IOException("Patch file overrun");
                    } else if (read2 == 0) {
                        return j11;
                    } else {
                        switch (read2) {
                            case 247:
                                read2 = dataInputStream.readUnsignedShort();
                                c(bArr, dataInputStream, outputStream, read2, j12);
                                break;
                            case 248:
                                read2 = dataInputStream.readInt();
                                c(bArr, dataInputStream, outputStream, read2, j12);
                                break;
                            case 249:
                                long readUnsignedShort = dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    b(bArr, wVar, outputStream, readUnsignedShort, read2, j12);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 250:
                                read2 = dataInputStream.readUnsignedShort();
                                b(bArr, wVar, outputStream, dataInputStream.readUnsignedShort(), read2, j12);
                                break;
                            case 251:
                                read2 = dataInputStream.readInt();
                                b(bArr, wVar, outputStream, dataInputStream.readUnsignedShort(), read2, j12);
                                break;
                            case 252:
                                long readInt2 = dataInputStream.readInt();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    b(bArr, wVar, outputStream, readInt2, read2, j12);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 253:
                                read2 = dataInputStream.readUnsignedShort();
                                b(bArr, wVar, outputStream, dataInputStream.readInt(), read2, j12);
                                break;
                            case 254:
                                read2 = dataInputStream.readInt();
                                b(bArr, wVar, outputStream, dataInputStream.readInt(), read2, j12);
                                break;
                            case 255:
                                long readLong = dataInputStream.readLong();
                                read2 = dataInputStream.readInt();
                                b(bArr, wVar, outputStream, readLong, read2, j12);
                                break;
                            default:
                                c(bArr, dataInputStream, outputStream, read2, j12);
                                break;
                        }
                        j11 += read2;
                    }
                } finally {
                    outputStream.flush();
                }
            }
        } else {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Unexpected version=");
            sb2.append(read);
            throw new u(sb2.toString());
        }
    }

    public static void b(byte[] bArr, w wVar, OutputStream outputStream, long j10, int i10, long j11) {
        int i11 = i10;
        if (i11 < 0) {
            throw new IOException("copyLength negative");
        } else if (j10 >= 0) {
            long j12 = i11;
            if (j12 <= j11) {
                try {
                    InputStream y02 = new x(wVar, j10, j12).y0();
                    while (i11 > 0) {
                        int min = Math.min(i11, (int) Log.TAG_VIDEO);
                        int i12 = 0;
                        while (i12 < min) {
                            int read = y02.read(bArr, i12, min - i12);
                            if (read != -1) {
                                i12 += read;
                            } else {
                                throw new IOException("truncated input stream");
                            }
                        }
                        outputStream.write(bArr, 0, min);
                        i11 -= min;
                    }
                    y02.close();
                } catch (EOFException e10) {
                    throw new IOException("patch underrun", e10);
                }
            } else {
                throw new IOException("Output length overrun");
            }
        } else {
            throw new IOException("inputOffset negative");
        }
    }

    public static void c(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i10, long j10) {
        if (i10 < 0) {
            throw new IOException("copyLength negative");
        } else if (i10 <= j10) {
            while (i10 > 0) {
                try {
                    int min = Math.min(i10, (int) Log.TAG_VIDEO);
                    dataInputStream.readFully(bArr, 0, min);
                    outputStream.write(bArr, 0, min);
                    i10 -= min;
                } catch (EOFException unused) {
                    throw new IOException("patch underrun");
                }
            }
        } else {
            throw new IOException("Output length overrun");
        }
    }
}
