package com.deengames.slaythespire.easymode;

import basemod.BaseMod;
import basemod.interfaces.ISubscriber;
import basemod.interfaces.PostBattleSubscriber;

import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.rooms.AbstractRoom;

@SpireInitializer
public class EasyModeMod implements ISubscriber, PostBattleSubscriber {

	public static void initialize() {
        new EasyModeMod();
    }
	
	public EasyModeMod() {
		BaseMod.subscribe(this);
	}
	
	@Override
	public void receivePostBattle(AbstractRoom battleRoom) {
		AbstractPlayer player = AbstractDungeon.player;
		player.currentHealth = player.maxHealth;
	}
}
