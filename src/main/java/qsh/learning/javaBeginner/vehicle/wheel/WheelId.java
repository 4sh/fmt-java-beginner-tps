package qsh.learning.javaBeginner.vehicle.wheel;

import java.io.Serializable;
import java.util.Objects;

public class WheelId implements Serializable {
    private final BrandWheel brandWheel;
    private final String serialId;

    public WheelId(String brandWheel, String serialId) {
        this.brandWheel = buildBrand(brandWheel);
        this.serialId = serialId;
    }

    static private BrandWheel buildBrand(String brandWheel) {
        try {
            return BrandWheel.valueOf(brandWheel.substring(0, 5).toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    public BrandWheel getBrandWheel() {
        return brandWheel;
    }

    public String getSerialId() {
        return serialId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WheelId wheelId = (WheelId) o;
        return brandWheel == wheelId.brandWheel && Objects.equals(serialId, wheelId.serialId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandWheel, serialId);
    }
}
