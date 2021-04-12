package virtuoel.pehkui.network;

import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;
import virtuoel.pehkui.Pehkui;

public class PehkuiPacketHandler
{
	private static final String PROTOCOL_VERSION = Integer.toString(1);
	public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(
		Pehkui.id("main"), () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals
	);
	
	public static void init()
	{
		int regId = 0;
		INSTANCE.registerMessage(regId++, ScalePacket.class, ScalePacket::encode, ScalePacket::decode, ScalePacket::handle);
	}
}
