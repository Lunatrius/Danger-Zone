package com.github.lunatrius.dangerzone.reference;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Reference {
    public static final String MODID = "DangerZone";
    public static final String NAME = "Danger Zone";
    public static final String VERSION = "${version}";
    public static final String FORGE = "${forgeversion}";
    public static final String MINECRAFT = "${mcversion}";
    public static final String PROXY_SERVER = "com.github.lunatrius.dangerzone.proxy.ServerProxy";
    public static final String PROXY_CLIENT = "com.github.lunatrius.dangerzone.proxy.ClientProxy";

    public static Logger logger = LogManager.getLogger(Reference.MODID);
}
