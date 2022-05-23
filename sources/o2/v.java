package o2;

import android.os.Build;
import f2.c;
import f2.k;
import f2.n;
import f2.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;

public class v {

    public static class a {
        public static final int[] f18642a;
        public static final int[] f18643b;
        public static final int[] f18644c;
        public static final int[] f18645d;

        static {
            int[] iArr = new int[n.values().length];
            f18645d = iArr;
            try {
                iArr[n.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18645d[n.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[k.values().length];
            f18644c = iArr2;
            try {
                iArr2[k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18644c[k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18644c[k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18644c[k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18644c[k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[f2.a.values().length];
            f18643b = iArr3;
            try {
                iArr3[f2.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18643b[f2.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[s.a.values().length];
            f18642a = iArr4;
            try {
                iArr4[s.a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18642a[s.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f18642a[s.a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f18642a[s.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f18642a[s.a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f18642a[s.a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static int a(f2.a aVar) {
        int i10 = a.f18643b[aVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + aVar + " to int");
    }

    public static f2.c b(byte[] r6) {
        throw new UnsupportedOperationException("Method not decompiled: o2.v.b(byte[]):f2.c");
    }

    public static byte[] c(c cVar) {
        IOException e10;
        ObjectOutputStream objectOutputStream;
        boolean hasNext;
        ObjectOutputStream objectOutputStream2 = null;
        ObjectOutputStream objectOutputStream3 = null;
        objectOutputStream2 = null;
        if (cVar.c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e11) {
                e10 = e11;
            }
        } catch (IOException e12) {
            e12.printStackTrace();
            objectOutputStream2 = objectOutputStream2;
        }
        try {
            objectOutputStream.writeInt(cVar.c());
            Iterator<c.a> it = cVar.b().iterator();
            while (true) {
                hasNext = it.hasNext();
                if (hasNext != 0) {
                    c.a next = it.next();
                    objectOutputStream.writeUTF(next.a().toString());
                    objectOutputStream.writeBoolean(next.b());
                } else {
                    try {
                        break;
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
            }
            objectOutputStream.close();
            byteArrayOutputStream.close();
            objectOutputStream2 = hasNext;
        } catch (IOException e14) {
            e10 = e14;
            objectOutputStream3 = objectOutputStream;
            e10.printStackTrace();
            if (objectOutputStream3 != null) {
                try {
                    objectOutputStream3.close();
                } catch (IOException e15) {
                    e15.printStackTrace();
                }
            }
            byteArrayOutputStream.close();
            objectOutputStream2 = objectOutputStream3;
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e16) {
                    e16.printStackTrace();
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e17) {
                e17.printStackTrace();
            }
            throw th;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static f2.a d(int i10) {
        if (i10 == 0) {
            return f2.a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return f2.a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
    }

    public static k e(int i10) {
        if (i10 == 0) {
            return k.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return k.CONNECTED;
        }
        if (i10 == 2) {
            return k.UNMETERED;
        }
        if (i10 == 3) {
            return k.NOT_ROAMING;
        }
        if (i10 == 4) {
            return k.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
            return k.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
    }

    public static n f(int i10) {
        if (i10 == 0) {
            return n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return n.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
    }

    public static s.a g(int i10) {
        if (i10 == 0) {
            return s.a.ENQUEUED;
        }
        if (i10 == 1) {
            return s.a.RUNNING;
        }
        if (i10 == 2) {
            return s.a.SUCCEEDED;
        }
        if (i10 == 3) {
            return s.a.FAILED;
        }
        if (i10 == 4) {
            return s.a.BLOCKED;
        }
        if (i10 == 5) {
            return s.a.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to State");
    }

    public static int h(k kVar) {
        int i10 = a.f18644c[kVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && kVar == k.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + kVar + " to int");
    }

    public static int i(n nVar) {
        int i10 = a.f18645d[nVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + nVar + " to int");
    }

    public static int j(s.a aVar) {
        switch (a.f18642a[aVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + aVar + " to int");
        }
    }
}
