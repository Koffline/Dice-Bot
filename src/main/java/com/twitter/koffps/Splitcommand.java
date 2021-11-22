package com.twitter.koffps;


import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Splitcommand extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        super.onGuildMessageReceived(event);

        if (event.getMessage().getContentRaw().startsWith("!team")) {
            String line = event.getMessage().getContentRaw();
            line = line.replaceAll("!team ", "");
            List<String> names = Arrays.asList(line.split(" "));
            if (names.size() < 10) return;
            Collections.shuffle(names);
            List<String> team1, team2;
            team1 = names.subList(0,5);
            team2 = names.subList(5,10);
            System.out.println("Team1 -------");
            team1.forEach(System.out::println); //forEach 幸せになれる
            System.out.println("Team2 -------");
            team2.forEach(System.out::println);
            event.getMessage().reply("Team1 " + team1.toString()).complete();
            event.getMessage().reply("Team2 " + team1.toString()).complete();

        }

    }



}



