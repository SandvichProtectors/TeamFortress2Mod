package com.github.sandvichprotectors.teamfortress2.helpers;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.github.sandvichprotectors.teamfortress2.lib.Reference;

import cpw.mods.fml.common.FMLLog;

public class LogHelper {
private static Logger logger = Logger.getLogger(Reference.NAME);

public static void init() {
logger.setParent(FMLLog.getLogger());
}

public static void log(Level logLevel, String message) {
logger.log(logLevel, message);
}
}