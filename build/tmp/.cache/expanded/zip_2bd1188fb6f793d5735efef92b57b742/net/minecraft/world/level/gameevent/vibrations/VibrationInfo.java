package net.minecraft.world.level.gameevent.vibrations;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.core.UUIDUtil;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.Vec3;

public record VibrationInfo(GameEvent gameEvent, float distance, Vec3 pos, @Nullable UUID uuid, @Nullable UUID projectileOwnerUuid, @Nullable Entity entity) {
   public static final Codec<VibrationInfo> CODEC = RecordCodecBuilder.create((p_258994_) -> {
      return p_258994_.group(BuiltInRegistries.GAME_EVENT.byNameCodec().fieldOf("game_event").forGetter(VibrationInfo::gameEvent), Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(VibrationInfo::distance), Vec3.CODEC.fieldOf("pos").forGetter(VibrationInfo::pos), UUIDUtil.CODEC.optionalFieldOf("source").forGetter((p_250608_) -> {
         return Optional.ofNullable(p_250608_.uuid());
      }), UUIDUtil.CODEC.optionalFieldOf("projectile_owner").forGetter((p_250607_) -> {
         return Optional.ofNullable(p_250607_.projectileOwnerUuid());
      })).apply(p_258994_, (p_249268_, p_252231_, p_250951_, p_250574_, p_249661_) -> {
         return new VibrationInfo(p_249268_, p_252231_, p_250951_, p_250574_.orElse((UUID)null), p_249661_.orElse((UUID)null));
      });
   });

   public VibrationInfo(GameEvent pGameEvent, float pDistance, Vec3 pPos, @Nullable UUID pUuid, @Nullable UUID pProjectileOwnerUuid) {
      this(pGameEvent, pDistance, pPos, pUuid, pProjectileOwnerUuid, (Entity)null);
   }

   public VibrationInfo(GameEvent pGameEvent, float pDistance, Vec3 pPos, @Nullable Entity pEntity) {
      this(pGameEvent, pDistance, pPos, pEntity == null ? null : pEntity.getUUID(), getProjectileOwner(pEntity), pEntity);
   }

   @Nullable
   private static UUID getProjectileOwner(@Nullable Entity pEntity) {
      if (pEntity instanceof Projectile projectile) {
         if (projectile.getOwner() != null) {
            return projectile.getOwner().getUUID();
         }
      }

      return null;
   }

   public Optional<Entity> getEntity(ServerLevel pLevel) {
      return Optional.ofNullable(this.entity).or(() -> {
         return Optional.ofNullable(this.uuid).map(pLevel::getEntity);
      });
   }

   public Optional<Entity> getProjectileOwner(ServerLevel pLevel) {
      return this.getEntity(pLevel).filter((p_249829_) -> {
         return p_249829_ instanceof Projectile;
      }).map((p_249388_) -> {
         return (Projectile)p_249388_;
      }).map(Projectile::getOwner).or(() -> {
         return Optional.ofNullable(this.projectileOwnerUuid).map(pLevel::getEntity);
      });
   }
}