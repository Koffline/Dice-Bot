package com.twitter.koffps;

import com.twitter.koffps.event.Dicecommand;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

import javax.security.auth.login.LoginException;

public class Main {

    public static JDA jda;
    public static void main(String[] args) {
        JDABuilder builder = JDABuilder.createDefault("");

        builder.setStatus(OnlineStatus.ONLINE);
        try {
            jda = builder.build().awaitReady();
            jda.addEventListener(new Dicecommand());
            jda.addEventListener(new Splitcommand());
        } catch (LoginException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
