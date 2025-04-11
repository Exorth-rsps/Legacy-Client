package net.runelite.client.plugins.privateServer;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

/**
 * @author https://github.com/Therealnull
 */
@ConfigGroup("privateserver")
public interface PrivateServerConfig extends Config
{

    @ConfigItem(
            keyName = "codebase",
            name = "URL (codebase)",
            description = "IP address or URL of RSPS you wish to connect to.",
            position = 0
    )
    default String codebase()
    {
        return "http://play.exorth.net";
    }

    @ConfigItem(
            keyName = "modulus",
            name = "Key (modulus)",
            description = "RSA key used by the RSPS you wish to connect to.",
            position = 1
    )
    default String modulus()
    {
        return "af71db26df7dd7e18e4a245c1654abfbbb63a24ca162799e9881467218e788ae826c5614d8966ca4e9e3b7485ffbfa0d6e266236effc143c116ffb9a8b437e1eb52d25201b7bbc296d8ec24c29ef9a8dd286b71f1b1db18fd128d0d424da2699a3b2dafc6044455bbe136f754a2c12b06fc7f453b427643fa2b4491e9fed381f";
    }

}