package com.kennyeric.springdemo.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class KnightConfig
{
    @Bean
    public Knight knight()
    {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest()
    {
        return new SlayDragonQuest(System.out);
    }
}
