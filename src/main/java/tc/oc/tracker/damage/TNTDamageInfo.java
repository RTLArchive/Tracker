package tc.oc.tracker.damage;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.TNTPrimed;

import tc.oc.tracker.base.AbstractDamageInfo;

import com.google.common.base.Preconditions;

public class TNTDamageInfo extends AbstractDamageInfo {
    public TNTDamageInfo(@Nonnull TNTPrimed tnt, @Nullable LivingEntity resolvedDamager) {
        super(resolvedDamager);

        Preconditions.checkNotNull(tnt, "tnt");

        this.tnt = tnt;
    }

    public @Nonnull TNTPrimed getTNT() {
        return this.tnt;
    }

    private final @Nonnull TNTPrimed tnt;

    @Override
    public @Nonnull String toString() {
        return "TNTDamageInfo{tnt=" + this.tnt + ",damager=" + this.resolvedDamager + "}";
    }
}
