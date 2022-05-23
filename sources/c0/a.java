package c0;

public final class a extends f {
    public final float f4193a;
    public final float f4194b;
    public final float f4195c;
    public final float f4196d;

    public a(float f10, float f11, float f12, float f13) {
        this.f4193a = f10;
        this.f4194b = f11;
        this.f4195c = f12;
        this.f4196d = f13;
    }

    @Override
    public float a() {
        return this.f4194b;
    }

    @Override
    public float b() {
        return this.f4195c;
    }

    @Override
    public float c() {
        return this.f4193a;
    }

    @Override
    public float d() {
        return this.f4196d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.floatToIntBits(this.f4193a) == Float.floatToIntBits(fVar.c()) && Float.floatToIntBits(this.f4194b) == Float.floatToIntBits(fVar.a()) && Float.floatToIntBits(this.f4195c) == Float.floatToIntBits(fVar.b()) && Float.floatToIntBits(this.f4196d) == Float.floatToIntBits(fVar.d());
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f4193a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f4194b)) * 1000003) ^ Float.floatToIntBits(this.f4195c)) * 1000003) ^ Float.floatToIntBits(this.f4196d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f4193a + ", maxZoomRatio=" + this.f4194b + ", minZoomRatio=" + this.f4195c + ", linearZoom=" + this.f4196d + "}";
    }
}
