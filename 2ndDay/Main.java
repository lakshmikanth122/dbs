package com.capgemini.arrays;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\Development\\workspace\\Application\\src\\main\\resources\\init.txt");
        String content = new String(Files.readAllBytes(path));

        Map<String, Config> configMap = Stream.of(content.split("\\n\\r"))
            .map(config -> Arrays.asList(config.split("\\r")))
            .collect(HashMap<String, Config>::new, (map, list) -> {
                String header = list.get(0);
                String pos = list.get(1);
                String size = list.get(2);
                String collapsed = list.get(3);
                map.put(header, new Config(pos.substring(pos.indexOf("=") + 1), size.substring(size.indexOf("=") + 1), collapsed.substring(collapsed.indexOf("=") + 1)));
            }, (m, u) -> {});

        System.out.println(configMap);
    }
}

class Config {
    public String pos;
    public String size;
    public String collapsed;

    public Config(String pos, String size, String collapsed) {
        this.pos = pos;
        this.size = size;
        this.collapsed = collapsed;
    }

    @Override
    public String toString() {
        return "Config{" +  "pos='" + pos + '\'' + ", size='" + size + '\'' + 
               ", collapsed='" + collapsed + '\'' + '}';
    }
}