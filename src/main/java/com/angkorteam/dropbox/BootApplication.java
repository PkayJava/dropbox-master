package com.angkorteam.dropbox;

import com.angkorteam.webui.frmk.function.BootExtension;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootApplication {

    public static void main(String[] args) throws Exception {
        BootExtension.run(BootApplication.class, args);
    }

    @Bean
    public Gson createGson() {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        builder.excludeFieldsWithoutExposeAnnotation();
        return builder.create();
    }

    @Bean
    public OkHttpClient createClient() {
        return new OkHttpClient.Builder().build();
    }

}
