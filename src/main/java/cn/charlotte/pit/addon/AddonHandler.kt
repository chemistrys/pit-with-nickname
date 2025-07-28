package cn.charlotte.pit.addon

import cn.charlotte.pit.addon.impl.*




object AddonHandler {

    private val addons = ArrayList<Addon>()

    fun start() {
        addons.addAll(
            listOf(GiveItemCommand(), GachaPool, EnchantBook, Eccentric, Extend)
        )
        for(addon in addons){
            println("Loading addon ${addon.name()}...")
            addon.enable()
        }
    }

}