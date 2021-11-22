package com.twitter.koffps.event;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Dicecommand extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        super.onGuildMessageReceived(event);

        if(event.getMessage().getContentRaw().equalsIgnoreCase("!dice")) {

            Random dice = new Random();

            int ivalue4 = dice.nextInt(100) + 1;

            event.getMessage().reply(String.valueOf("[" + ivalue4 + "]")).complete();
        }

    }
}




