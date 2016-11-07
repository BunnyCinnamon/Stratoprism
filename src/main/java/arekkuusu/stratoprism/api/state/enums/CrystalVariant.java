package arekkuusu.stratoprism.api.state.enums;


import net.minecraft.util.IStringSerializable;

import java.util.Locale;

public enum CrystalVariant implements IStringSerializable{
	CRYSTAL_RAW,
	CRYSTAL_REFINED;

	@Override
	public String getName() {
		return name().toLowerCase(Locale.ROOT);
	}
}
