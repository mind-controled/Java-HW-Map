package ru.netology.manager;

import java.util.*;

public class FileOpenManager {
    private Map<String, String> applicationMap = new HashMap<>();

    public String remove(String key) {
        return applicationMap.remove(key.toLowerCase());
    }

    public void register(String key, String app) {
        applicationMap.putIfAbsent(key.toLowerCase(), app);
    }

    public String getName(String key) {
        return applicationMap.get(key.toLowerCase());
    }

    public Set<String> showAllApps() {
        Collection<String> result = applicationMap.values();
        return new HashSet<>(result);
    }

    public List<String> showAllTypes() {
        Set<String> strings = applicationMap.keySet();
        List<String> list = new ArrayList<>(strings);
        return list;
    }
}