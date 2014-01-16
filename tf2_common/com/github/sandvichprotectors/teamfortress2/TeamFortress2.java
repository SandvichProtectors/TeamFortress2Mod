package com.github.sandvichprotectors.teamfortress2;

import com.github.sandvichprotectors.teamfortress2.helpers.LogHelper;
import com.github.sandvichprotectors.teamfortress2.lib.Reference;
import com.github.sandvichprotectors.teamfortress2.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLLoadEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod( modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION )
@NetworkMod ( channels = {Reference.CHANNEL}, clientSideRequired = true, serverSideRequired = false )
public class TeamFortress2  {
        
        @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;


        public static CreativeTabs tabTF2 = new CreativeTabs("tabTF2") {
        public ItemStack getIconItemStack() {
                return new ItemStack(Item.swordDiamond, 1, 0);
        }
};
        

@Instance("TeamFortress2")
public static TeamFortress2 instance;
        
        @EventHandler
        public void Init (FMLInitializationEvent event) {
        			           	        	
                LanguageRegistry.instance().addStringLocalization("itemGroup.tabTF2", "en_US", "Team Fortress 2");
        }       
        
        
        @EventHandler
        public void preInit (FMLPreInitializationEvent event) {
        
                LogHelper.init();   
                
        }
        
        @EventHandler
        public void load (FMLLoadEvent event) {
                        
        }
        
        @EventHandler
        public void postInit (FMLPostInitializationEvent event){
                
        }
        
        @EventHandler
        public void ServerStart (FMLServerStartingEvent event){
        
        }


}       