package p198o2;

import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import p071f2.C4225c;
import p071f2.C4250s;
import p071f2.EnumC4222a;
import p071f2.EnumC4236k;
import p071f2.EnumC4245n;

public class C7574v {

    public static class C7575a {
        public static final int[] f24192a;
        public static final int[] f24193b;
        public static final int[] f24194c;
        public static final int[] f24195d;

        static {
            int[] iArr = new int[EnumC4245n.values().length];
            f24195d = iArr;
            try {
                iArr[EnumC4245n.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24195d[EnumC4245n.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC4236k.values().length];
            f24194c = iArr2;
            try {
                iArr2[EnumC4236k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24194c[EnumC4236k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24194c[EnumC4236k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24194c[EnumC4236k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24194c[EnumC4236k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[EnumC4222a.values().length];
            f24193b = iArr3;
            try {
                iArr3[EnumC4222a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24193b[EnumC4222a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[C4250s.EnumC4251a.values().length];
            f24192a = iArr4;
            try {
                iArr4[C4250s.EnumC4251a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24192a[C4250s.EnumC4251a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f24192a[C4250s.EnumC4251a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f24192a[C4250s.EnumC4251a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f24192a[C4250s.EnumC4251a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f24192a[C4250s.EnumC4251a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static int m15663a(EnumC4222a aVar) {
        int i = C7575a.f24193b[aVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + aVar + " to int");
    }

    public static p071f2.C4225c m15662b(byte[] r6) {
        throw new UnsupportedOperationException("Method not decompiled: p198o2.C7574v.m15662b(byte[]):f2.c");
    }

    public static byte[] m15661c(C4225c cVar) {
        IOException e;
        ObjectOutputStream objectOutputStream;
        boolean hasNext;
        ObjectOutputStream objectOutputStream2 = null;
        ObjectOutputStream objectOutputStream3 = null;
        objectOutputStream2 = null;
        if (cVar.m28374c() == 0) {
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
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            objectOutputStream2 = objectOutputStream2;
        }
        try {
            objectOutputStream.writeInt(cVar.m28374c());
            Iterator<C4225c.C4226a> it = cVar.m28375b().iterator();
            while (true) {
                hasNext = it.hasNext();
                if (hasNext != 0) {
                    C4225c.C4226a next = it.next();
                    objectOutputStream.writeUTF(next.m28373a().toString());
                    objectOutputStream.writeBoolean(next.m28372b());
                } else {
                    try {
                        break;
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
            }
            objectOutputStream.close();
            byteArrayOutputStream.close();
            objectOutputStream2 = hasNext;
        } catch (IOException e5) {
            e = e5;
            objectOutputStream3 = objectOutputStream;
            e.printStackTrace();
            if (objectOutputStream3 != null) {
                try {
                    objectOutputStream3.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
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
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e8) {
                e8.printStackTrace();
            }
            throw th;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static EnumC4222a m15660d(int i) {
        if (i == 0) {
            return EnumC4222a.EXPONENTIAL;
        }
        if (i == 1) {
            return EnumC4222a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
    }

    public static EnumC4236k m15659e(int i) {
        if (i == 0) {
            return EnumC4236k.NOT_REQUIRED;
        }
        if (i == 1) {
            return EnumC4236k.CONNECTED;
        }
        if (i == 2) {
            return EnumC4236k.UNMETERED;
        }
        if (i == 3) {
            return EnumC4236k.NOT_ROAMING;
        }
        if (i == 4) {
            return EnumC4236k.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return EnumC4236k.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
    }

    public static EnumC4245n m15658f(int i) {
        if (i == 0) {
            return EnumC4245n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i == 1) {
            return EnumC4245n.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to OutOfQuotaPolicy");
    }

    public static C4250s.EnumC4251a m15657g(int i) {
        if (i == 0) {
            return C4250s.EnumC4251a.ENQUEUED;
        }
        if (i == 1) {
            return C4250s.EnumC4251a.RUNNING;
        }
        if (i == 2) {
            return C4250s.EnumC4251a.SUCCEEDED;
        }
        if (i == 3) {
            return C4250s.EnumC4251a.FAILED;
        }
        if (i == 4) {
            return C4250s.EnumC4251a.BLOCKED;
        }
        if (i == 5) {
            return C4250s.EnumC4251a.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to State");
    }

    public static int m15656h(EnumC4236k kVar) {
        int i = C7575a.f24194c[kVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && kVar == EnumC4236k.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + kVar + " to int");
    }

    public static int m15655i(EnumC4245n nVar) {
        int i = C7575a.f24195d[nVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + nVar + " to int");
    }

    public static int m15654j(C4250s.EnumC4251a aVar) {
        switch (C7575a.f24192a[aVar.ordinal()]) {
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
