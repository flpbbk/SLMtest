package com.example.slmtest;

public class Impl {
    public String time(int h)
    {
        if (h<=12)
            return h+ " AM";
        else
            return h-12 + " PM";

    }

    public String info()
    {
        return "This API converts 24h time into AM/PM time.";
    }
}
