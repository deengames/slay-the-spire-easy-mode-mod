package com.deengames.slaythespire.easymode;

import basemod.BaseMod;
import basemod.interfaces.ISubscriber;

import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.rooms.AbstractRoom;

@SpireInitializer
public class EasyModeMod implements ISubscriber {

	public static void initialize() {
        new EasyModeMod();
    }
	
	public EasyModeMod() {
		BaseMod.subscribe(this);
	}
	
	public void receivePostBattle(AbstractRoom battleRoom) {
		AbstractPlayer player = AbstractDungeon.player;
		player.currentHealth = player.maxHealth;
	}
}
