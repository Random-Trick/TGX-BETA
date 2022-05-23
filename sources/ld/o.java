package ld;

public class o extends h {
    public static int f16395b0 = -4000000;
    public String f16396a0;

    public o(java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: ld.o.<init>(java.lang.String):void");
    }

    @Override
    public byte C() {
        return (byte) 5;
    }

    public String D0() {
        return this.f16396a0;
    }

    @Override
    public String d() {
        if (z() == 0) {
            return this.f16396a0;
        }
        return this.f16396a0 + "?" + z();
    }

    @Override
    public int s() {
        return this.f16396a0.hashCode();
    }
}
