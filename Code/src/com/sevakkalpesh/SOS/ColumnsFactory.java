package com.sevakkalpesh.SOS;

public class ColumnsFactory {
    public static Columns calls() {
        String[] names = { "type", "numbertype", "number", "numberlabel",
                "date", "duration" };
        Class<?> types[] = { Integer.TYPE, Integer.TYPE, String.class,
                String.class, Long.TYPE, Long.TYPE };
        return new Columns(names, types, "number", "date");
    }

    public static Columns messages() {
        String[] names = { "person", "status", "address", "read", "subject",
                "body", "service_center", "date", "type" };
        Class<?> types[] = { Integer.TYPE, Integer.TYPE, String.class,
                String.class, String.class, String.class, String.class,
                Long.TYPE, Integer.TYPE };
        return new Columns(names, types, "address", "date");
    }
}
